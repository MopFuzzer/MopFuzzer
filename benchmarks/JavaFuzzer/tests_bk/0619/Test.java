// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:08 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=218L;
    public static double dFld=0.1844;
    public static float fFld=0.7F;
    public static volatile boolean bFld=true;
    public int iFld=1;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -4);
    }

    public static long sMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i5=24, i6=5, i7=-10, i8=52, iArr[]=new int[N];
        boolean b=false;

        FuzzerUtils.init(iArr, -57);

        for (i5 = 6; i5 < 127; ++i5) {
            b = b;
        }
        iArr[(i6 >>> 1) % N] = i5;
        Test.fFld -= Test.instanceCount;
        i6 = i6;
        i6 = 11;
        i6 *= i5;
        for (i7 = 8; i7 < 169; i7++) {
            iArr[i7] >>= i8;
            i6 -= i8;
            Test.instanceCount += (((i7 * i8) + Test.instanceCount) - Test.instanceCount);
            iArr[i7 - 1] *= i5;
            Test.instanceCount *= i7;
            iArr = FuzzerUtils.int1array(N, (int)-219);
            i6 <<= 6;
        }
        vMeth1_check_sum += i5 + i6 + (b ? 1 : 0) + i7 + i8 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i2, int i3, int i4) {

        double d=-2.60754;
        byte by1=18;
        int i9=-68, i10=-8, i11=13681, i12=-32594, i13=2, i14=12;
        short s=18377;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -1394003123064062524L);

        i4 *= (i2--);
        lArr[(i3 >>> 1) % N] -= (long)(((i4 * 523) - (Test.fFld * d)) - ((by1 = (byte)-57705) - (i3 - i4)));
        vMeth1();
        if (Test.bFld) {
            for (i9 = 11; i9 < 370; ++i9) {
                Test.iArrFld[i9 - 1] = i9;
                i10 += (((i9 * Test.instanceCount) + Test.instanceCount) - Test.instanceCount);
                for (i11 = 1; i11 < 5; i11++) {
                    for (i13 = 1; i13 < 2; i13++) {
                        i2 = (int)Test.instanceCount;
                        i10 *= (int)0L;
                        Test.instanceCount += (i13 * i13);
                        i10 = 8378;
                        s += (short)(i13 ^ i12);
                    }
                    by1 = (byte)Test.instanceCount;
                }
            }
        }
        vMeth_check_sum += i2 + i3 + i4 + Double.doubleToLongBits(d) + by1 + i9 + i10 + i11 + i12 + i13 + i14 + s +
            FuzzerUtils.checkSum(lArr);
    }

    public static short sMeth(long l1, int i1) {


        vMeth(i1, 6, i1);
        i1 = 7;
        long meth_res = l1 + i1;
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-55, i15=25771, i16=-3, i17=-60840, i18=-65, i19=-6, i20=-7, i21=-35026, iArr1[]=new int[N];
        byte by=-114, by2=-55;
        long l=34L, l2=-1L;
        short s1=-26767;
        double dArr[][]=new double[N][N], dArr1[]=new double[N];

        FuzzerUtils.init(iArr1, 41484);
        FuzzerUtils.init(dArr, -2.121168);
        FuzzerUtils.init(dArr1, 46.64170);

        try {
            i <<= (int)(((by + Test.instanceCount) * i) - (-(Test.dFld - l)));
            i = sMeth(Test.instanceCount, i);
            for (l2 = 1; l2 < 157; ++l2) {
                Test.fFld -= Test.fFld;
                try {
                    Test.iArrFld[(int)(l2 - 1)] = (i16 / i17);
                    i = (i15 / -109);
                    Test.iArrFld[(int)(l2 + 1)] = (i18 % i16);
                } catch (ArithmeticException a_e) {}
                l += (l2 * i17);
                i19 = 1;
                do {
                    iArr1 = Test.iArrFld;
                    l += i19;
                    if (Test.bFld) break;
                    by2 <<= (byte)s1;
                    i15 -= (int)Test.dFld;
                    i = s1;
                    Test.fFld += i19;
                    if (Test.bFld) {
                        Test.instanceCount |= i19;
                        try {
                            i15 = (i18 % -19892);
                            Test.iArrFld[(int)(l2 - 1)] = (i17 / i);
                            i17 = (i / i16);
                        } catch (ArithmeticException a_e) {}
                    } else {
                        Test.bFld = Test.bFld;
                        i17 += (int)706002902L;
                        for (i20 = (int)(l2); i20 < 3; i20++) {
                            Test.iArrFld[(int)(l2)] = (int)-67.52122;
                            dArr[(int)(l2 + 1)] = dArr[i19];
                            Test.iArrFld[i19] ^= i18;
                            if (Test.bFld) continue;
                        }
                        i21 += (i19 * i17);
                    }
                } while ((i19 += 2) < 161);
                if (Test.bFld) {
                    Test.instanceCount += (((l2 * i21) + i18) - i15);
                    iFld >>>= i15;
                    i21 += (int)(l2 * l2);
                } else if (Test.bFld) {
                    i = i21;
                } else if (Test.bFld) {
                    try {
                        i15 = (127 % i21);
                        Test.iArrFld[(int)(l2)] = (i17 / 1689016757);
                        i = (i21 % i);
                    } catch (ArithmeticException a_e) {}
                } else {
                    i21 = 6;
                }
            }
        }
        catch (ArithmeticException exc1) {
            Test.iArrFld[(i15 >>> 1) % N] -= (int)Test.instanceCount;
        }

        FuzzerUtils.out.println("i by l = " + i + "," + by + "," + l);
        FuzzerUtils.out.println("l2 i15 i16 = " + l2 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("by2 s1 i20 = " + by2 + "," + s1 + "," + i20);
        FuzzerUtils.out.println("i21 iArr1 dArr = " + i21 + "," + FuzzerUtils.checkSum(iArr1) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));
        FuzzerUtils.out.println("dArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.fFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.bFld iFld Test.iArrFld = " + (Test.bFld ? 1 : 0) + "," + iFld + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
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
//DEBUG  sMeth ->  sMeth mainTest
//DEBUG  vMeth ->  vMeth sMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth sMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
