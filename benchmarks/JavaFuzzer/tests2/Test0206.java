// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:21 2023
public class Test0206 {

    public static final int N = 400;

    public static long instanceCount=-14L;
    public static float fFld=-2.621F;
    public static int iFld=176;
    public static volatile double dFld=-2.24117;
    public static boolean bFld=true;
    public static int iFld1=52279;
    public byte byFld=-116;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0206.iArrFld, 9);
    }

    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;

    public static long lMeth1(int i6, int i7) {

        int i8=-5, i9=-45949, i10=-37031;
        short s2=-27718;
        boolean b=true;
        double d1=-1.71161;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -199L);

        Test0206.iArrFld[(i6 >>> 1) % N] -= i6;
        i6 -= 3;
        i8 = 1;
        do {
            i6 += i8;
            if (b) {
                i7 ^= (int) Test0206.instanceCount;
                Test0206.instanceCount += (i8 | i8);
                i6 -= i7;
                s2 += (short)(i8 + i6);
            } else {
                for (i9 = 1; i9 < 6; ++i9) {
                    i10 += (i9 ^ i7);
                    d1 = 1;
                    do {
                        lArr = lArr;
                    } while (++d1 < 2);
                    lArr[i9] = 20;
                    i6 += i9;
                }
            }
        } while (++i8 < 298);
        long meth_res = i6 + i7 + i8 + s2 + (b ? 1 : 0) + i9 + i10 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(lArr);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static long lMeth(short s1) {

        long l=27438L;
        int i5=-4;
        int i11=-7;
        int i12=-2947;
        int[] iArr1 =new int[N];
        byte by=-84;
        boolean b1=true;

        FuzzerUtils.init(iArr1, 222);

        for (int i4 : iArr1) {
            if (b1) {
                for (l = 1; l < 4; l++) {
                    Test0206.fFld += (((Test0206.instanceCount++) * (i5 * i4)) + ((--i5) - (s1 + -2.484F)));
                    by += (byte)(i5++);
                    Test0206.instanceCount -= (236 + (lMeth1(i5, i4) >> i4));
                    by <<= (byte)8;
                    if (b1) {
                        by = (byte)l;
                        i4 += (int)(l * l);
                        for (i11 = 2; i11 > l; i11--) {
                            s1 = (short)i5;
                        }
                        Test0206.iArrFld[(int) (l - 1)] = 268;
                    } else if (false) {
                        i4 <<= (int)l;
                        Test0206.iFld = 36791;
                    }
                }
            } else if (b1) {
                i12 -= (int) Test0206.dFld;
            }
        }
        long meth_res = s1 + l + i5 + by + i11 + i12 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth() {

        short s3=-26833;
        int i13=-123;
        int i14=-71;
        int i15=113;
        int[] iArr =new int[N];
        long[][] lArr1 =new long[N][N];

        FuzzerUtils.init(iArr, -50875);
        FuzzerUtils.init(lArr1, 42214L);

        iArr[(-14 >>> 1) % N] += (int)lMeth(s3);
        Test0206.iFld -= Test0206.iFld;
        lArr1[(Test0206.iFld >>> 1) % N][(Test0206.iFld >>> 1) % N] >>>= Test0206.iFld;
        Test0206.iFld = (int) 3L;
        for (i13 = 2; i13 < 245; ++i13) {
            Test0206.instanceCount += (((i13 * Test0206.iFld) + Test0206.iFld) - i14);
            if (Test0206.bFld) break;
            Test0206.fFld *= i13;
            switch (((i13 % 3) * 5) + 37) {
            case 38:
                Test0206.iFld += (((i13 * i13) + i13) - i13);
                Test0206.bFld = Test0206.bFld;
                break;
            case 44:
                i15 = 7;
                do {
                    Test0206.bFld = Test0206.bFld;
                    Test0206.iFld = 9;
                    i14 += i13;
                } while ((i15 -= 2) > 0);
            case 51:
                Test0206.dFld = i13;
            default:
                Test0206.iFld = (int) 46.181F;
            }
        }
        long meth_res = s3 + i13 + i14 + i15 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-3, i1=193, i2=36874, i3=-3, i16=-18572, i17=8, i18=0, i19=-26381, i20=-24, i21=38070, i23=-53718,
            i24=28084, i25=-3, i26=-2;
        short s=-26869;
        double d=-78.44411;
        float f=-68.393F;

        for (i = 8; i < 133; ++i) {
            for (i2 = 3; i2 < 201; ++i2) {
                i1 >>= (int)(((s - d) - iMeth()) - i3);
                Test0206.iFld += (i2 * i);
            }
        }
        for (i16 = 21; i16 < 397; ++i16) {
            i3 = (int) Test0206.fFld;
            Test0206.fFld = -18681;
            for (i18 = 1; 67 > i18; ++i18) {
                Test0206.iFld += (i18 + i3);
                f = 1;
                do {
                    d += i;
                } while (++f < 2);
            }
            i1 <<= -6;
            Test0206.iArrFld[i16 - 1] = (int) d;
        }
        Test0206.fFld += (float) Test0206.dFld;
        i17 = i17;
        for (i20 = 8; 254 > i20; i20++) {
            int i22=112;
            i22 = s;
            i3 = (int) Test0206.instanceCount;
            if (true) break;
            Test0206.iArrFld[i20 - 1] = (int) -14L;
        }
        i21 *= (int)d;
        for (i23 = 5; i23 < 175; ++i23) {
            i25 = 1;
            do {
                Test0206.iArrFld[i25 + 1] -= i24;
                Test0206.iFld1 |= s;
                i3 -= Test0206.iFld;
                d += i23;
            } while (++i25 < 148);
            Test0206.fFld += i23;
            i26 -= byFld;
            i1 >>>= (int) Test0206.instanceCount;
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 s d = " + i3 + "," + s + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 f i20 = " + i19 + "," + Float.floatToIntBits(f) + "," + i20);
        FuzzerUtils.out.println("i21 i23 i24 = " + i21 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 = " + i25 + "," + i26);

        FuzzerUtils.out.println("Test0206.instanceCount Test0206.fFld Test0206.iFld = " + Test0206.instanceCount + "," +
                Float.floatToIntBits(Test0206.fFld) + "," + Test0206.iFld);
        FuzzerUtils.out.println("Test0206.dFld Test0206.bFld Test0206.iFld1 = " + Double.doubleToLongBits(Test0206.dFld) + "," +
                (Test0206.bFld ? 1 : 0) + "," + Test0206.iFld1);
        FuzzerUtils.out.println("byFld Test0206.iArrFld = " + byFld + "," + FuzzerUtils.checkSum(Test0206.iArrFld));

        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0206 _instance = new Test0206();
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
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 lMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}