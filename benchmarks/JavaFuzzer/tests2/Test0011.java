// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:12 2023
public class Test0011 {

    public static final int N = 400;

    public static long instanceCount=-3654410827L;
    public int iFld=34587;
    public static float fFld=1.460F;
    public static double dFld=-2.100799;
    public static byte byFld=-23;
    public static long lFld=4L;
    public boolean bFld=true;
    public short sFld=2220;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0011.iArrFld, -11824);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(double d1, int i7, long l) {

        byte by2=-89, by3=84;
        int i8=-11924;
        int i9=-65;
        int i10=47588;
        int[] iArr =new int[N];
        boolean b=false;

        FuzzerUtils.init(iArr, -80);

        l += 47L;
        Test0011.instanceCount *= by2;
        i7 = i7;
        i8 = 1;
        while (++i8 < 322) {
            i7 = i8;
            for (i9 = i8; i9 < 5; ++i9) {
                Test0011.fFld = (float) d1;
                l = -42851;
                if (i9 != 0) {
                }
                if (b) {
                    i7 >>= i9;
                    l = i9;
                    iArr[i8 - 1] -= -6430;
                } else {
                    try {
                        i10 = (1162285243 % i10);
                        i10 = (1623163705 / iArr[i8 + 1]);
                        i7 = (-14499 / i7);
                    } catch (ArithmeticException a_e) {}
                    by3 |= (byte)i8;
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + i7 + l + by2 + i8 + i9 + i10 + (b ? 1 : 0) + by3 +
            FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i3, byte by1) {

        short s=-8731;
        int i4=40314, i5=28946, i6=125, i11=55168, i12=-4, i13=-6, i14=-29877;

        Test0011.instanceCount -= (s >>> ((i3 + 132) >>> i3));
        i3 = i3;
        i4 = 1;
        do {
            for (i5 = 1; i5 < 4; i5++) {
                i6 = (int) ((--by1) + lMeth(Test0011.dFld, i4, Test0011.instanceCount));
            }
            Test0011.fFld *= i6;
            Test0011.iArrFld[i4] -= (int) -6L;
            for (i11 = i4; i11 < 4; i11++) {
                Test0011.instanceCount <<= i4;
                for (i13 = 1; i13 > 1; --i13) {
                    Test0011.fFld = -22;
                    Test0011.instanceCount += (((i13 * by1) + Test0011.instanceCount) - Test0011.instanceCount);
                    i6 <<= i4;
                    Test0011.iArrFld[i4 - 1] = s;
                    Test0011.instanceCount = Test0011.instanceCount;
                }
            }
        } while (++i4 < 391);
        vMeth_check_sum += i3 + by1 + s + i4 + i5 + i6 + i11 + i12 + i13 + i14;
    }

    public static int iMeth(double d) {

        int i15=-162, i16=-62066, i17=41931, i18=-14, i19=55182;
        short s1=-24031;
        float f=1.925F;

        vMeth(-52739, Test0011.byFld);
        Test0011.lFld -= -38839L;
        i15 ^= i15;
        i15 -= i15;
        i16 = 308;
        while (--i16 > 0) {
            i15 = i15;
            i15 = 5;
            s1 += (short)(i16 * i16);
            for (i17 = 1; i17 < 5; i17 += 2) {
                Test0011.lFld += i17;
                Test0011.iArrFld[i16] >>>= -9;
                i18 <<= i15;
                for (f = 1; f < 3; f++) {
                    try {
                        i18 = (-64 / i17);
                        i19 = (i19 / -112);
                        Test0011.iArrFld[i16] = (i15 % i17);
                    } catch (ArithmeticException a_e) {}
                    d -= s1;
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i15 + i16 + s1 + i17 + i18 + Float.floatToIntBits(f) + i19;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=205, i1=227, i2=202, i20=-2, i21=8, i22=-11, i23=-5015;
        byte by=94, by4=-12;
        long l1=5061546610221556369L;
        short[] sArr =new short[N];

        FuzzerUtils.init(sArr, (short)27082);

        switch ((((((int) (Test0011.instanceCount + iFld)) >>> 1) % 2) * 5) + 34) {
        case 35:
            for (i = 4; i < 153; ++i) {
                i2 = 1;
                do {
                    i1 = (int) ((++by) + ((-12407 + (i1 - i)) * (Test0011.instanceCount = iFld)));
                    by *= (byte) iMeth(Test0011.dFld);
                    Test0011.fFld += (i2 + iFld);
                    i20 = 1;
                    while (++i20 < 1) {
                        Test0011.instanceCount &= i;
                        Test0011.instanceCount = -68;
                        Test0011.lFld += i;
                    }
                    Test0011.instanceCount = i;
                    i1 = (int) Test0011.dFld;
                    Test0011.fFld -= Test0011.lFld;
                } while (++i2 < 168);
                Test0011.instanceCount = i2;
                if (bFld) {
                    for (i21 = i; i21 < 168; ++i21) {
                        i22 = (int) Test0011.instanceCount;
                        sArr[i21] *= (short)-11L;
                        switch ((i21 % 4) + 61) {
                        case 61:
                            i1 = (int) Test0011.lFld;
                            break;
                        case 62:
                            Test0011.iArrFld = FuzzerUtils.int1array(N, (int) 61890);
                            Test0011.dFld = i1;
                            i22 += -48609;
                            iFld += (i21 - l1);
                            break;
                        case 63:
                            i23 = 1;
                            do {
                                Test0011.iArrFld[i23 + 1] -= by4;
                                l1 <<= i1;
                                i1 += i2;
                                Test0011.iArrFld[(i >>> 1) % N] = i20;
                                i22 += i1;
                            } while ((i23 -= 3) > 0);
                            break;
                        case 64:
                            iFld = i2;
                            break;
                        default:
                            i22 -= (int) Test0011.fFld;
                        }
                    }
                } else if (bFld) {
                    iFld -= (int)-877186469246121689L;
                } else if (bFld) {
                    Test0011.lFld = -7712111469229234279L;
                } else {
                    sFld = (short)i23;
                }
            }
            break;
        case 38:
            l1 = i22;
            break;
        default:
            i1 = Test0011.byFld;
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("by i20 i21 = " + by + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 l1 i23 = " + i22 + "," + l1 + "," + i23);
        FuzzerUtils.out.println("by4 sArr = " + by4 + "," + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test0011.instanceCount iFld Test0011.fFld = " + Test0011.instanceCount + "," + iFld + "," +
                Float.floatToIntBits(Test0011.fFld));
        FuzzerUtils.out.println("Test0011.dFld Test0011.byFld Test0011.lFld = " + Double.doubleToLongBits(Test0011.dFld) + "," +
                Test0011.byFld + "," + Test0011.lFld);
        FuzzerUtils.out.println("bFld sFld Test0011.iArrFld = " + (bFld ? 1 : 0) + "," + sFld + "," +
                FuzzerUtils.checkSum(Test0011.iArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0011 _instance = new Test0011();
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
