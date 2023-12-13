package edu.hust.xzf.mutator.deoptpatterns;

import edu.hust.xzf.jdt.tree.ITree;
import edu.hust.xzf.mutator.context.ContextReader;
import edu.hust.xzf.mutator.mutatetemplate.MutateTemplate;
import edu.hust.xzf.mutator.utils.Checker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static edu.hust.xzf.mutator.context.ContextReader.readMethodReturnType;
import static edu.hust.xzf.mutator.deoptpatterns.LockElision.nextCaseOrDefaultStmt;


public class OptimisticTypeStrengthening extends MutateTemplate {
    @Override
    public void generatePatches() {
        ITree suspCodeTree = this.getSuspiciousCodeTree();
        List<String> vars = new ArrayList<>();
        List<SuspNullExpStr> suspNullExpStrs = new ArrayList<>();
        ContextReader.readAllVariablesAndFields(suspCodeTree, allVarNamesMap, varTypesMap, allVarNamesList, this.sourceCodePath, dic);
        identifySuspiciousVariables(suspCodeTree, vars, suspNullExpStrs);
        var randomVar = getRandomElementFromList(suspNullExpStrs);
        if (randomVar == null) return;
        String expStr = randomVar.expStr;

        String varName = null;
        int codeEndPos = suspCodeEndPos;
        String fixedCodeStr2 = "\n}";
        int parentType = suspCodeTree.getParent().getType();
        if (!((Checker.isSwitchCase(parentType)) || Checker.isSwitchStatement(parentType))) {
            if (Checker.isExpressionStatement(suspCodeTree.getType())
                    && Checker.isAssignment(suspCodeTree.getChild(0).getType())
                    || Checker.isVariableDeclarationStatement(suspCodeTree.getType())) {
                varName = ContextReader.identifyVariableName(suspCodeTree);
            }
            if (varName != null) {
                var pair = ContextReader.identifyRelatedStatements(suspCodeTree, varName, codeEndPos);
                codeEndPos = pair.getFirst();
                if (pair.getSecond()) {
                    String returnType = readMethodReturnType(suspCodeTree);
                    switch (returnType) {
                        case "boolean":
                            fixedCodeStr2 += "else{return false;}\n";
                            break;
                        case "int":
                        case "long":
                        case "short":
                        case "byte":
                        case "float":
                        case "double":
                        case "char":
                            fixedCodeStr2 += "else{return 0;}\n";
                            break;
                        case "void":
                        case "=CONSTRUCTOR=":
                            fixedCodeStr2 += "else{return;}\n";
                            break;
                        default:
                            fixedCodeStr2 += "else{return null;}\n";
                            break;
                    }
                }
            }
        } else {
            // find next case statement or default statement
            codeEndPos = nextCaseOrDefaultStmt(suspCodeTree);
        }

        String varType = this.varTypesMap.get(expStr);
        if (varType == null) {
            expStr = "this." + expStr;
            varType = this.varTypesMap.get(expStr);
            if (varType == null) return;
        }
        if (varType.equals("Class") || varType.equals("Entry") || varType.equals("T") || varType.equals("var"))
            return;

        if ("int".equals(varType) || "long".equals(varType) || "short".equals(varType) || "byte".equals(varType)
                || "float".equals(varType) || "double".equals(varType) || "char".equals(varType) || "boolean".equals(varType))
            return;
        if (expStr.contains("["))
            expStr = expStr.substring(0, expStr.indexOf('['));
        if (varType.endsWith(">"))
            varType = varType.substring(0, varType.indexOf('<'));

        String nullCheckStr = "if (" + expStr + " instanceof " + varType + ") {\n";
        generatePatch(suspCodeStartPos, codeEndPos, nullCheckStr, fixedCodeStr2);
        offset += 1;
    }

    public static <T> T getRandomElementFromList(List<T> list) {
        // 如果List为空，返回null
        if (list.isEmpty()) {
            return null;
        }

        // 使用java.util.Random类生成一个随机索引
        Random random = new Random();
        int randomIndex = random.nextInt(list.size());

        // 使用生成的随机索引从列表中选择一个元素
        return list.get(randomIndex);
    }


}


