// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=13L;
    public static int iFld=-21425;
    public static boolean bFld=false;
    public static float fFld=-24.782F;
    public static boolean bFld1=true;
    public byte byFld=0;
    public static double dFld=-74.68627;
    public long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];
    public static long lArrFld1[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -14);
        FuzzerUtils.init(Test.lArrFld1, -2038123512636298692L);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        float f2=0.804F;
        int i4=31206, i5=191, i6=11, i7=45290;
        byte by=-94;

        f2 = Test.iFld;
        Test.iFld ^= Test.iFld;
        Test.instanceCount <<= Test.iFld;
        for (i4 = 8; i4 < 139; ++i4) {
            for (i6 = 1; i6 < 12; i6 += 3) {
                Test.iArrFld[i4 - 1] = (int)Test.instanceCount;
                if (Test.bFld) break;
                Test.instanceCount -= i4;
                i5 |= i6;
                i7 ^= i4;
                Test.instanceCount += (long)(2.96F + (i6 * i6));
                Test.instanceCount = i6;
                Test.lArrFld1[i4 - 1] = Test.instanceCount;
            }
            by += (byte)(i4 * i4);
            Test.iArrFld[i4 + 1] *= 33871;
        }
        vMeth_check_sum += Float.floatToIntBits(f2) + i4 + i5 + i6 + i7 + by;
    }

    public static int iMeth1(int i2, int i3) {

        int i8=-220, i9=0, i10=-62107, i11=49826, i12=56766;
        byte by1=-90;
        short s=-12597;

        vMeth();
        Test.iArrFld = Test.iArrFld;
        i8 = 1;
        while (++i8 < 173) {
            i3 = i3;
            for (i9 = 1; i9 < 9; ++i9) {
                Test.iArrFld[i8 - 1] = Test.iFld;
                Test.iFld *= i10;
                Test.instanceCount += (i9 | Test.iFld);
                for (i11 = 1; i11 < 2; ++i11) {
                    i10 >>= (int)Test.instanceCount;
                    i2 += (((i11 * i12) + i10) - i2);
                    i2 = 5730;
                    i10 += -8;
                    Test.fFld += (24090 + (i11 * i11));
                    by1 += (byte)(((i11 * i3) + i8) - s);
                }
            }
        }
        long meth_res = i2 + i3 + i8 + i9 + i10 + i11 + i12 + by1 + s;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i, float f1, int i1) {

        int i13=14, i14=45995, i15=52476, i16=-12, i17=-2523;

        f1 = iMeth1(i, Test.iFld);
        for (i13 = 4; i13 < 137; ++i13) {
            i15 = 1;
            do {
                i1 += (2505 + (i15 * i15));
                for (i16 = 1; i16 > i13; i16 -= 3) {
                    if (Test.bFld) continue;
                    Test.instanceCount >>= 62520;
                    Test.bFld1 = Test.bFld;
                    Test.instanceCount += (i16 | i14);
                    Test.lArrFld1[i15 - 1] *= (long)f1;
                    Test.instanceCount += (i16 | i1);
                    Test.instanceCount = Test.instanceCount;
                    i1 = (int)-5L;
                    i17 >>>= (int)Test.instanceCount;
                    if (Test.bFld) break;
                }
            } while (++i15 < 12);
        }
        long meth_res = i + Float.floatToIntBits(f1) + i1 + i13 + i14 + i15 + i16 + i17;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=2.200F, fArr[]=new float[N];
        int i18=-14, i19=-14, i20=37044, i21=-14, i22=0, i23=-42697, i24=-63;
        short s1=21143;

        FuzzerUtils.init(fArr, -77.566F);

        lArrFld[(Test.iFld >>> 1) % N] += (long)((-(--f)) + ((Test.iFld - Test.iFld) + iMeth(-20628, Test.fFld,
            34925)));
        Test.instanceCount *= Test.iFld;
        i18 = 1;
        do {
            Test.instanceCount = i19;
            Test.instanceCount |= byFld;
            Test.iFld = i19;
            for (i20 = 186; i20 > 10; i20 -= 2) {
                i19 = s1;
                Test.iFld += (((i20 * i19) + Test.instanceCount) - Test.iFld);
                Test.instanceCount = (long)-72.991F;
                Test.dFld = i20;
                Test.bFld = Test.bFld;
                fArr[(i21 >>> 1) % N] *= Test.instanceCount;
                for (i22 = 1; i22 < 3; i22++) {
                    Test.iArrFld[i20] -= i21;
                    Test.fFld += 43;
                    fArr[i18 - 1] -= f;
                    if (Test.bFld1) {
                        i23 -= -2102;
                        try {
                            i19 = (Test.iArrFld[i20 + 1] / -203);
                            i19 = (i21 / i19);
                            i23 = (Test.iFld / 74);
                        } catch (ArithmeticException a_e) {}
                    } else if (Test.bFld1) {
                        i19 = (int)Test.instanceCount;
                        i19 |= i19;
                        Test.instanceCount += (i22 ^ Test.instanceCount);
                    } else if (false) {
                        f = i19;
                        i21 <<= byFld;
                    }
                    Test.instanceCount += i22;
                }
                f -= s1;
                Test.iFld += (int)Test.instanceCount;
            }
            i23 |= i24;
            Test.fFld += byFld;
        } while (++i18 < 135);

        FuzzerUtils.out.println("f i18 i19 = " + Float.floatToIntBits(f) + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 s1 = " + i20 + "," + i21 + "," + s1);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.bFld = " + Test.instanceCount + "," + Test.iFld +
            "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.fFld Test.bFld1 byFld = " + Float.floatToIntBits(Test.fFld) + "," + (Test.bFld1 ?
            1 : 0) + "," + byFld);
        FuzzerUtils.out.println("Test.dFld lArrFld Test.iArrFld = " + Double.doubleToLongBits(Test.dFld) + "," +
            FuzzerUtils.checkSum(lArrFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.lArrFld1 = " + FuzzerUtils.checkSum(Test.lArrFld1));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
