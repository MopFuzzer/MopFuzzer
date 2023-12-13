import os
import re

# 更改这个变量为你的输入文件夹的路径
input_folder = "tests2"


# 查找和替换实例创建语句
def process_file_content(content, file_name):
    class_name = file_name[:-5]  # 从文件名中提取类名（去掉.java后缀）
    # Test. to public class_name.
    pattern = r"Test\."
    replacement = f"{class_name}."

    # pattern = r"(\s*)Test\s+_instance\s+=\s+new\s+Test\(\);"
    # replacement = rf"\1{class_name} _instance = new {class_name}();"
    content = re.sub(pattern, replacement, content)
    return content


for file_name in os.listdir(input_folder):
    if file_name.startswith("Test") and file_name.endswith(".java"):
        file_path = os.path.join(input_folder, file_name)

        with open(file_path, "r") as file:
            file_content = file.read()

        processed_content = process_file_content(file_content, file_name)

        with open(file_path, "w") as file:
            file.write(processed_content)

        print(f"Processed file: {file_path}")
