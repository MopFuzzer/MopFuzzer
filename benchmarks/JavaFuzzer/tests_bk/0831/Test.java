// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:14 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=7690861376159188152L;
    public static boolean bFld=true;
    public static double dFld=118.110086;
    public static float fFld=112.820F;
    public static short sFld=2267;
    public long lArrFld[]=new long[N];

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i3=38, i4=-5, i5=43588, i6=14, iArr[][]=new int[N][N];
        boolean b=true;
        long l1=2982767708L;
        float f1=-1.222F;
        short s=6169;

        FuzzerUtils.init(iArr, -9);

        for (i3 = 6; i3 < 291; i3++) {
            for (i5 = 6; i5 > 1; --i5) {
                b = Test.bFld;
                iArr[i3] = iArr[i3 + 1];
                Test.instanceCount |= i3;
                switch ((i3 % 8) + 57) {
                case 57:
                case 58:
                    switch ((i3 % 9) + 99) {
                    case 99:
                        if (true) {
                            i4 = i4;
                            Test.instanceCount = i6;
                        } else if (b) {
                            l1 = 1;
                            do {
                                i6 *= (int)f1;
                            } while (++l1 < 2);
                            Test.instanceCount = i5;
                        }
                    case 100:
                        try {
                            i6 = (i4 % 8292);
                            iArr[i5][i3 - 1] = (i6 % iArr[i5 - 1][i3]);
                            i4 = (-80 % i3);
                        } catch (ArithmeticException a_e) {}
                        f1 -= i4;
                        break;
                    case 101:
                        i6 *= 7;
                        break;
                    case 102:
                        i4 += (int)Test.instanceCount;
                        break;
                    case 103:
                        i4 += (i5 * i5);
                        break;
                    case 104:
                        Test.dFld *= i6;
                    case 105:
                        i6 = (int)l1;
                    case 106:
                        if (i6 != 0) {
                            vMeth1_check_sum += i3 + i4 + i5 + i6 + (b ? 1 : 0) + l1 + Float.floatToIntBits(f1) + s +
                                FuzzerUtils.checkSum(iArr);
                            return;
                        }
                        break;
                    case 107:
                        i4 += (int)f1;
                        break;
                    }
                    break;
                case 59:
                    if (Test.bFld) break;
                    break;
                case 60:
                    Test.instanceCount <<= i5;
                    break;
                case 61:
                    i4 -= s;
                    break;
                case 62:
                    i4 = i6;
                    break;
                case 63:
                    i6 += i4;
                case 64:
                    if (i6 != 0) {
                        vMeth1_check_sum += i3 + i4 + i5 + i6 + (b ? 1 : 0) + l1 + Float.floatToIntBits(f1) + s +
                            FuzzerUtils.checkSum(iArr);
                        return;
                    }
                    break;
                default:
                    Test.instanceCount += i5;
                }
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + i6 + (b ? 1 : 0) + l1 + Float.floatToIntBits(f1) + s +
            FuzzerUtils.checkSum(iArr);
    }

    public static float fMeth(int i2, long l) {

        byte by=-102;
        int i8=10, i9=-57938, i10=-38102, i11=13715, i12=14, iArr1[]=new int[N];
        short s1=3236;
        long lArr[]=new long[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr1, -63869);
        FuzzerUtils.init(lArr, 37155L);
        FuzzerUtils.init(dArr, -49.27970);

        vMeth1();
        Test.dFld *= -7;
        Test.dFld -= i2;
        i2 = i2;
        by <<= (byte)i2;
        for (int i7 : iArr1) {
            for (i8 = 1; i8 < 4; i8++) {
                for (i10 = 1; i10 < 2; i10++) {
                    if (Test.bFld) break;
                }
                lArr[i8] = i9;
                if (Test.bFld) {
                    switch (((i8 % 9) * 5) + 117) {
                    case 160:
                        l = (long)Test.fFld;
                        i7 += (((i8 * i8) + Test.fFld) - i8);
                        Test.bFld = Test.bFld;
                        break;
                    case 158:
                        dArr = dArr;
                        break;
                    case 157:
                    case 127:
                        s1 += (short)(i8 ^ i9);
                    case 141:
                        i9 >>= i8;
                        break;
                    case 155:
                        i7 = 13;
                    case 142:
                        i7 = i7;
                        break;
                    case 152:
                        i12 -= -11667;
                    case 148:
                        Test.fFld += (i8 * i8);
                        break;
                    }
                } else {
                    iArr1[i8 - 1] /= (int)(i11 | 1);
                }
            }
        }
        long meth_res = i2 + l + by + i8 + i9 + i10 + i11 + s1 + i12 + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth() {

        int i=-64483, i1=-57841, i13=-9, i14=6, i15=-6, i16=14, i17=-48044;
        float f=102.799F;
        short s2=29959, sArr[]=new short[N];
        double dArr1[]=new double[N];

        FuzzerUtils.init(sArr, (short)-8590);
        FuzzerUtils.init(dArr1, 2.96121);

        for (i = 7; i < 215; ++i) {
            f = ((i1 + (-sArr[i + 1])) * fMeth(i1, Test.instanceCount));
            i1 += (i | i);
            i1 *= i1;
            Test.instanceCount += (-36179 + (i * i));
        }
        i1 += (int)-2.77797;
        Test.dFld -= i;
        for (i13 = 5; 215 > i13; ++i13) {
            Test.instanceCount >>= s2;
            sArr = sArr;
            dArr1[i13 + 1] = i13;
            for (i15 = 1; i15 < 8; i15++) {
                i17 -= 158;
                i14 = i15;
                i17 += (i15 * i15);
            }
        }
        vMeth_check_sum += i + i1 + Float.floatToIntBits(f) + i13 + i14 + s2 + i15 + i16 + i17 +
            FuzzerUtils.checkSum(sArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
    }

    public void mainTest(String[] strArr1) {

        int i18=-8, i19=-203, i20=3, i21=38412, i22=-39733, i23=-86, i24=56686, i25=12, i26=175, i27=-1, i28=-13,
            iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, 8);

        vMeth();
        for (i18 = 13; i18 < 306; ++i18) {
            i19 += i18;
            i19 &= i19;
            i19 += (i18 * i18);
            Test.instanceCount += (i18 * i18);
            for (i20 = 5; 86 > i20; i20++) {
                Test.instanceCount = i22;
                Test.instanceCount = i22;
                lArrFld[i20 - 1] <<= i20;
            }
            if (Test.bFld) break;
            iArr2[i18] += (int)Test.instanceCount;
        }
        i21 -= i22;
        for (i23 = 362; i23 > 22; i23 -= 3) {
            Test.dFld *= i20;
            Test.sFld *= (short)i22;
            Test.instanceCount += (i23 * i23);
            for (i25 = i23; i25 < 222; ++i25) {
                for (i27 = i25; i27 < 1; i27++) {
                    i22 -= (int)Test.fFld;
                    Test.bFld = Test.bFld;
                    i21 = i26;
                    if (Test.bFld) break;
                    i21 = i27;
                    Test.fFld += (i27 * i28);
                    i24 *= i28;
                    i19 = i25;
                }
                i26 += i21;
                if (Test.bFld) continue;
                iArr2[i25 - 1] = 10411;
            }
        }

        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 iArr2 = " + i27 + "," + i28 + "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.dFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.fFld Test.sFld lArrFld = " + Float.floatToIntBits(Test.fFld) + "," + Test.sFld +
            "," + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}