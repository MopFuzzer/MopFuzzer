// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:59 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=110L;
    public short sFld=31526;
    public static int iFld=-23440;
    public static double dFld=0.97425;
    public static volatile float fFld=65.893F;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 62649);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i4) {

        int i5=-239, i6=-8, i7=8, i8=5, i9=11751;
        byte by=-106;
        boolean b=false;

        i5 = 1;
        while (++i5 < 122) {
            for (i6 = 1; i6 < 13; i6++) {
                Test.instanceCount += i6;
                for (i8 = 1; i8 < 2; ++i8) {
                    switch (((i8 % 9) * 5) + 50) {
                    case 92:
                        if (false) continue;
                        break;
                    case 82:
                        i9 += (i8 - i9);
                        try {
                            Test.iArrFld[i8 + 1] = (5736 % Test.iArrFld[i6 + 1]);
                            i7 = (Test.iArrFld[i8 - 1] / -176);
                            i4 = (Test.iArrFld[i8 - 1] % i7);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 79:
                        Test.dFld *= i8;
                        Test.instanceCount += i8;
                        Test.instanceCount = i7;
                        break;
                    case 78:
                        Test.iArrFld[i5 - 1] = i6;
                        by += (byte)i8;
                        i4 = 31335;
                        i4 = (int)Test.instanceCount;
                        break;
                    case 84:
                        if (b) continue;
                        break;
                    case 51:
                        Test.iFld += (((i8 * i8) + i7) - i5);
                        break;
                    case 80:
                        Test.instanceCount += i8;
                    case 88:
                        i9 -= (int)Test.instanceCount;
                        break;
                    case 94:
                        i7 -= i7;
                        break;
                    default:
                        if (b) break;
                    }
                }
            }
        }
        long meth_res = i4 + i5 + i6 + i7 + i8 + i9 + by + (b ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i3) {

        int i10=50356;

        Test.instanceCount += (long)((++Test.dFld) * (iMeth(Test.iFld) - i10));
        Test.iFld |= Test.iFld;
        vMeth1_check_sum += i3 + i10;
    }

    public static void vMeth() {

        int i11=4;
        short s=-675;
        float f=54.480F;

        Test.iFld += (-Test.iFld);
        vMeth1(Test.iFld);
        Test.iArrFld[(Test.iFld >>> 1) % N] >>= (int)-3246124035L;
        Test.iArrFld[(Test.iFld >>> 1) % N] <<= i11;
        i11 *= Test.iFld;
        Test.iFld |= (int)Test.instanceCount;
        s = (short)-14;
        f = f;
        vMeth_check_sum += i11 + s + Float.floatToIntBits(f);
    }

    public void mainTest(String[] strArr1) {

        int i=56912, i1=-22691, i2=17696, i12=22960, i13=-8, i14=-14, i15=-226, i16=39401, i17=-43320, i18=17468,
            i19=4, i20=52398, iArr[]=new int[N];
        double d=-47.109506;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -107.646F);
        FuzzerUtils.init(iArr, 230);

        fArr[(i >>> 1) % N] -= (float)(((--sFld) * (++d)) * ((++i) ^ i));
        for (i1 = 4; i1 < 176; i1++) {
            sFld = (short)i;
        }
        sFld -= (short)(Test.instanceCount = (iArr[(i1 >>> 1) % N]--));
        vMeth();
        i12 = 1;
        while (++i12 < 337) {
            fArr[i12 - 1] += Test.instanceCount;
            Test.instanceCount -= i12;
            Test.fFld += (i12 - i13);
            i2 += i12;
            iArr[i12 + 1] -= (int)2286961742176617237L;
            Test.iFld = (int)Test.instanceCount;
            i2 -= i2;
            iArr[i12 + 1] = i12;
            for (i14 = 75; i14 > 3; --i14) {
                Test.instanceCount += i14;
            }
        }
        for (i16 = 3; i16 < 195; i16++) {
            iArr[i16] = (int)Test.instanceCount;
            Test.instanceCount += i16;
            i18 = 1;
            while (++i18 < 131) {
                for (i19 = i16; i19 < 1; i19++) {
                    iArr[i16] = (int)Test.instanceCount;
                    i20 += sFld;
                    try {
                        i13 = (i20 / i14);
                        i17 = (Test.iFld % 6301);
                        i2 = (-69 / Test.iArrFld[i19 - 1]);
                    } catch (ArithmeticException a_e) {}
                    i -= sFld;
                    Test.iArrFld[i19 - 1] += -4;
                    Test.instanceCount = Test.instanceCount;
                    Test.iFld = i16;
                    Test.iFld = i17;
                }
                Test.fFld *= -108;
            }
        }

        FuzzerUtils.out.println("i d i1 = " + i + "," + Double.doubleToLongBits(d) + "," + i1);
        FuzzerUtils.out.println("i2 i12 i13 = " + i2 + "," + i12 + "," + i13);
        FuzzerUtils.out.println("i14 i15 i16 = " + i14 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 fArr iArr = " + i20 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount sFld Test.iFld = " + Test.instanceCount + "," + sFld + "," +
            Test.iFld);
        FuzzerUtils.out.println("Test.dFld Test.fFld Test.iArrFld = " + Double.doubleToLongBits(Test.dFld) + "," +
            Float.floatToIntBits(Test.fFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
