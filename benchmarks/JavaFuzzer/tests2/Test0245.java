// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:23 2023
public class Test0245 {

    public static final int N = 400;

    public static long instanceCount=63L;
    public static volatile float fFld=0.916F;
    public static int iFld=51148;
    public static int[] iArrFld =new int[N];
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0245.iArrFld, -135);
        FuzzerUtils.init(Test0245.lArrFld, 186L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i4=-55457;
        int i5=19;
        int i6=61538;
        int i7=-20;
        int i8=11;
        int i9=-237;
        int[] iArr1 =new int[N];
        boolean b=true;
        short s1=-13627;
        float f1=2.794F;
        byte by=23;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -36L);
        FuzzerUtils.init(iArr1, 44456);

        lArr[(i4 >>> 1) % N] = -226L;
        iArr1[(i4 >>> 1) % N] = i4;
        i5 = 1;
        while (++i5 < 309) {
            Test0245.instanceCount += (((i5 * i5) + i5) - i4);
            b = b;
            i4 += (((i5 * i4) + Test0245.instanceCount) - i5);
            s1 -= (short)i5;
            i4 -= i5;
            for (i6 = 1; 5 > i6; i6++) {
                double d=2.72223;
                i4 -= (int)d;
                i7 += (i6 * i6);
                switch (i6 % 5) {
                case 0:
                    for (i8 = 2; i8 > 1; i8--) {
                        f1 += i4;
                        f1 += i9;
                    }
                case 1:
                    by = (byte)i7;
                    break;
                case 2:
                    i7 -= i8;
                case 3:
                    f1 -= i4;
                    break;
                case 4:
                    s1 ^= (short)i7;
                }
            }
        }
        long meth_res = i4 + i5 + (b ? 1 : 0) + s1 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f1) + by +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i2, long l, short s) {

        float f=-32.181F;
        int i3=75, i11=-142, i12=23166;
        short s2=10765;

        for (f = 12; f < 393; ++f) {
            if (i2 != 0) {
            }
            i3 = iMeth1();
            Test0245.fFld += (f * Test0245.fFld);
            for (i11 = 1; i11 < 4; i11 += 3) {
                Test0245.iArrFld = Test0245.iArrFld;
                i2 += i2;
                Test0245.instanceCount += (i11 - s2);
                Test0245.lArrFld[(int) (f - 1)] = i2;
                Test0245.instanceCount += Test0245.iFld;
            }
            Test0245.iFld += i12;
        }
        i2 <<= Test0245.iFld;
        i12 = (int)-180L;
        Test0245.iArrFld[(131 >>> 1) % N] = i2;
        Test0245.fFld -= i2;
        long meth_res = i2 + l + s + Float.floatToIntBits(f) + i3 + i11 + i12 + s2;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, int i1) {

        short s3=-7720;
        int i13=-2, i14=-1603, i15=-188;
        double[] dArr =new double[N];
        byte[] byArr =new byte[N];

        FuzzerUtils.init(dArr, 0.75893);
        FuzzerUtils.init(byArr, (byte)50);

        i = iMeth(222, Test0245.instanceCount, (short) (26331));
        dArr[(i1 >>> 1) % N] = Test0245.iFld;
        i = s3;
        i = Test0245.iFld;
        Test0245.iArrFld = Test0245.iArrFld;
        i >>= (int)-4L;
        for (i13 = 252; i13 > 5; i13--) {
            i15 = 1;
            do {
                Test0245.iArrFld[i15 + 1] += i;
                i = i;
                i = i13;
                switch (((i15 % 2) * 5) + 53) {
                case 61:
                    i += (i15 - Test0245.iFld);
                    i1 *= (int)-3432955353684673322L;
                    break;
                case 56:
                    byArr[i15 + 1] *= (byte)i;
                    break;
                default:
                    Test0245.instanceCount <<= Test0245.iFld;
                }
            } while (++i15 < 7);
        }
        vMeth_check_sum += i + i1 + s3 + i13 + i14 + i15 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        int i16=-19867;
        int i17=-6;
        int i18=2302;
        int i19=7;
        int i20=17;
        int i21=-6;
        int i22=4407;
        int i23=58392;
        int[] iArr =new int[N];
        double d1=0.63261;

        FuzzerUtils.init(iArr, 219);

        iArr = (iArr = (iArr = (iArr = iArr)));
        vMeth(Test0245.iFld, 46432);
        for (i16 = 9; 264 > i16; ++i16) {
            Test0245.fFld += i16;
            i18 = 99;
            do {
                iArr[i16 + 1] *= i16;
            } while ((i18 -= 2) > 0);
            for (i19 = 3; i19 < 99; ++i19) {
                i17 = (int)d1;
                Test0245.fFld = 166L;
                Test0245.fFld *= i19;
                iArr[i19 + 1] = i16;
                i17 = 8;
                for (i21 = 1; i21 < 2; ++i21) {
                    i22 = i20;
                    i20 *= -6;
                    Test0245.instanceCount >>= i22;
                    iArr[i21 + 1] = (int)-73.7F;
                    Test0245.instanceCount = Test0245.iFld;
                    i22 *= (int) Test0245.fFld;
                    Test0245.instanceCount <<= 8;
                    i20 -= (int)d1;
                    Test0245.instanceCount = Test0245.instanceCount;
                    iArr[i21 + 1] = i16;
                }
            }
        }
        i20 *= i22;
        Test0245.iArrFld[(i19 >>> 1) % N] <<= i16;
        i23 = 1;
        while (++i23 < 235) {
            Test0245.iFld <<= (int) Test0245.instanceCount;
            Test0245.fFld -= i22;
            Test0245.lArrFld[i23 - 1] <<= i22;
            Test0245.iFld = -8201;
        }

        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 d1 = " + i19 + "," + i20 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0245.instanceCount Test0245.fFld Test0245.iFld = " + Test0245.instanceCount + "," +
                Float.floatToIntBits(Test0245.fFld) + "," + Test0245.iFld);
        FuzzerUtils.out.println("Test0245.iArrFld Test0245.lArrFld = " + FuzzerUtils.checkSum(Test0245.iArrFld) + "," +
                FuzzerUtils.checkSum(Test0245.lArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0245 _instance = new Test0245();
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
