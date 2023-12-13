// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:55 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1L;
    public static int iFld=-9;
    public static float fFld=61.534F;
    public static byte byFld=-113;
    public static boolean bFld=true;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -4717);
        FuzzerUtils.init(Test.lArrFld, -1014551281L);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static int iMeth1(int i6, long l1) {


        i6 <<= (--Test.iArrFld[(i6 >>> 1) % N]);
        long meth_res = i6 + l1;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth() {

        int i16=-61488, i17=32783, i18=31576, i19=-211, i20=-213;
        short s2=-19711;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -6L);

        for (long l2 : lArr) {
            Test.iFld = (int)Test.instanceCount;
            Test.fFld -= Test.instanceCount;
            i16 = 1;
            while (++i16 < 4) {
                Test.iFld >>= Test.iFld;
                for (i17 = 1; 1 > i17; ++i17) {
                    s2 = (short)5377;
                    Test.instanceCount >>>= -70;
                }
                for (i19 = 1; i19 < 1; ++i19) {
                    Test.instanceCount += (i19 - i17);
                    i20 = -12219;
                    i20 *= 65;
                    Test.fFld *= Test.fFld;
                    Test.iFld += (int)(-13L + (i19 * i19));
                    Test.iFld %= (int)(Test.instanceCount | 1);
                }
            }
        }
        long meth_res = i16 + i17 + i18 + s2 + i19 + i20 + FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i7, int i8, int i9) {

        int i10=-10, i11=-102, i12=231, i13=-42712, i14=-54617, i15=8;
        float f1=-65.235F;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)28867);

        for (i10 = 2; i10 < 218; i10++) {
            for (i12 = 1; i12 < 7; i12++) {
                for (i14 = 2; i14 > i12; i14--) {
                    Test.instanceCount = Math.max((int)(f1 + lMeth()), 14);
                    Test.instanceCount = i11;
                    i8 += (106 + (i14 * i14));
                    i13 += Test.byFld;
                    Test.fFld = i12;
                    i9 += i9;
                    i7 -= i15;
                }
                i15 += (((i12 * i13) + i15) - Test.instanceCount);
                sArr[i12 + 1] += (short)1.864F;
                i13 = i12;
            }
            i9 = Test.byFld;
            i15 *= (int)Test.instanceCount;
        }
        vMeth_check_sum += i7 + i8 + i9 + i10 + i11 + i12 + i13 + i14 + i15 + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(sArr);
    }

    public static int iMeth(long l) {

        int i1=7, i2=-221, i3=247, i4=-3, i5=-6, i21=6, i22=-7;
        double d=-74.16361;
        short s1=-20902;

        switch (((i1 >>> 1) % 2) + 101) {
        case 101:
        case 102:
            d -= Math.abs((i1--) + (i1 = i1));
            for (i2 = 4; 203 > i2; ++i2) {
                for (i4 = 1; i4 < 8; i4++) {
                    float f=68.305F;
                    i3 <<= iMeth1((int)((Test.instanceCount + f) - (++s1)), (long)(i5 + (f + i4)));
                    f = -48;
                }
                vMeth(i4, i1, i1);
                Test.iArrFld[i2] = i1;
                Test.iFld -= Test.iFld;
            }
            break;
        default:
            for (i21 = 8; 295 > i21; ++i21) {
                Test.instanceCount = 143L;
                i3 += 1;
                i3 = (int)d;
                i1 -= i3;
                if (Test.bFld) continue;
            }
        }
        long meth_res = l + i1 + Double.doubleToLongBits(d) + i2 + i3 + i4 + i5 + s1 + i21 + i22;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by=-62;
        short s=16545;
        int i23=172, i24=-47, i25=28069, i26=-3347, i27=-10;
        long l3=-45956L;
        double d1=2.126410;

        for (int i : Test.iArrFld) {
            i *= (Test.iArrFld[(i >>> 1) % N] + by);
            s += (short)(Math.min(iMeth(Test.instanceCount), i) + Test.fFld);
            Test.iArrFld[(i >>> 1) % N] *= (int)-191L;
            for (i23 = 1; 63 > i23; ++i23) {
                Test.iFld -= Test.iFld;
                i25 = 1;
                do {
                    Test.instanceCount <<= i24;
                    try {
                        i24 = (i24 % -198);
                        i = (Test.iArrFld[i23] / -162);
                        i24 = (i % Test.iArrFld[i25 + 1]);
                    } catch (ArithmeticException a_e) {}
                    Test.iFld = i;
                    l3 += Test.iFld;
                    d1 -= 21169L;
                    Test.iArrFld[i23] = 41568;
                    Test.iArrFld[i25 - 1] *= (int)l3;
                    Test.instanceCount = i25;
                } while (++i25 < 2);
                i += (i23 + i23);
                i >>>= i25;
            }
            for (i26 = 1; i26 < 63; i26 += 2) {
                Test.lArrFld[i26 - 1] = s;
                l3 -= i;
                if (Test.bFld) {
                    i *= by;
                    Test.iFld -= Test.iFld;
                } else if (Test.bFld) {
                    i27 -= i26;
                    if (false) break;
                    l3 += Test.instanceCount;
                    Test.instanceCount = Test.instanceCount;
                }
            }
            i27 <<= -54004;
            if (Test.bFld) continue;
            i24 <<= Test.iFld;
        }

        FuzzerUtils.out.println("by s i23 = " + by + "," + s + "," + i23);
        FuzzerUtils.out.println("i24 i25 l3 = " + i24 + "," + i25 + "," + l3);
        FuzzerUtils.out.println("d1 i26 i27 = " + Double.doubleToLongBits(d1) + "," + i26 + "," + i27);

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.fFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.byFld Test.bFld Test.iArrFld = " + Test.byFld + "," + (Test.bFld ? 1 : 0) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
