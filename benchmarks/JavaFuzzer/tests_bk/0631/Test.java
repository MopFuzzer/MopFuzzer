// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:09 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2477291371028194228L;
    public static float fFld=1.229F;
    public static boolean bFld=true;
    public int iFld=44;
    public static volatile double dFld=-23.100066;

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l2, int i9) {

        short s1=-11976;
        float f1=-2.369F;
        boolean b=true;
        int i10=-63166, i11=3, i12=-237, iArr[]=new int[N];
        byte by=-3;

        FuzzerUtils.init(iArr, 7);

        if (b) {
            iArr[(i9 >>> 1) % N] -= i9;
            s1 /= (short)((long)(f1) | 1);
            i9 = (int)Test.instanceCount;
            vMeth1_check_sum += l2 + i9 + s1 + Float.floatToIntBits(f1) + (b ? 1 : 0) + i10 + i11 + i12 + by +
                FuzzerUtils.checkSum(iArr);
            return;
        }
        for (i10 = 394; i10 > 23; --i10) {
            i12 = 1;
            while (++i12 < 5) {
                Test.instanceCount = s1;
                l2 >>= l2;
                i9 -= i11;
                l2 = s1;
                iArr[i10 + 1] >>= i10;
                by |= (byte)l2;
            }
            by = (byte)f1;
            i9 += i10;
        }
        i9 *= i12;
        vMeth1_check_sum += l2 + i9 + s1 + Float.floatToIntBits(f1) + (b ? 1 : 0) + i10 + i11 + i12 + by +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(long l1) {

        int i13=57032, i15=-14, i16=-12, i17=-6, i18=-221, i19=-56920;
        short s2=-14227;
        double d=-50.3540;
        byte by1=-61;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 1L);

        vMeth1(Test.instanceCount, -11);
        i13 = 1;
        do {
            int i14=13;
            i14 >>>= i13;
            Test.fFld -= 46853L;
        } while (++i13 < 274);
        for (i15 = 6; i15 < 135; i15++) {
            s2 += (short)(((i15 * i15) + i15) - i16);
            for (d = 12; d > 1; d -= 3) {
                i16 -= i13;
                for (i18 = 4; i15 < i18; i18 -= 3) {
                    i16 -= (int)l1;
                    if (Test.bFld) {
                        Test.bFld = Test.bFld;
                        Test.instanceCount *= 6;
                        i17 += (i18 - by1);
                        i17 -= (int)114.12F;
                    } else {
                        lArr1[i18] -= s2;
                    }
                }
            }
        }
        vMeth_check_sum += l1 + i13 + i15 + i16 + s2 + Double.doubleToLongBits(d) + i17 + i18 + i19 + by1 +
            FuzzerUtils.checkSum(lArr1);
    }

    public static long lMeth(int i1, int i2) {

        int i3=-8, i4=-5919, i5=1, i6=-10, i7=-167, i8=10, i20=-51832, iArr1[][]=new int[N][N];
        long l=9L, lArr[]=new long[N];
        short s=-19345, sArr[]=new short[N];
        float f=-60.212F;
        double d1=0.39453;

        FuzzerUtils.init(lArr, -8959163572795991799L);
        FuzzerUtils.init(sArr, (short)-2311);
        FuzzerUtils.init(iArr1, 63210);

        for (i3 = 6; 171 > i3; i3++) {
            for (i5 = 1; i5 < 10; ++i5) {
                i6 -= (int)Test.instanceCount;
                for (i7 = 1; i7 < 2; ++i7) {
                    l -= (i4++);
                    if (i4 != 0) {
                    }
                    lArr[i5 + 1] = (long)(((i8 + s) + Math.abs(f)) + Math.abs((int)(Test.instanceCount % (i3 | 1))));
                    vMeth(-3877635910413487727L);
                    i6 += (int)(-5284694058350978910L + (i7 * i7));
                    sArr[(-5 >>> 1) % N] = (short)982304291L;
                    lArr[i3 - 1] /= (Test.instanceCount | 1);
                }
            }
            iArr1[i3][i3] -= -6;
            for (d1 = 1; d1 < 10; ++d1) {
                f += (float)d1;
                Test.fFld += (float)((long)d1 | (long)i6);
            }
        }
        long meth_res = i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + l + s + Float.floatToIntBits(f) +
            Double.doubleToLongBits(d1) + i20 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(sArr) +
            FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=58055, i21=-152, i22=229, i23=230, i24=-10, i25=11, i26=-12, i27=243, i28=-59084, i29=11524, i30=46988,
            iArr2[]=new int[N];
        byte by2=60;

        FuzzerUtils.init(iArr2, -14);

        i -= (int)(lMeth(i, -6) + i);
        for (i21 = 256; i21 > 3; i21--) {
            i22 = (int)Test.instanceCount;
            for (i23 = 3; i23 < 99; ++i23) {
                for (i25 = 1; i25 < 2; i25++) {
                    if (Test.bFld) break;
                    if (Test.bFld) {
                        i22 += (i25 * i25);
                    } else {
                        i += (i25 | i26);
                    }
                }
                i = 28288;
                try {
                    i26 = (i22 / iArr2[i21 - 1]);
                    iArr2[i21] = (i23 / -30547);
                    i = (2008190866 / iFld);
                } catch (ArithmeticException a_e) {}
                i24 <<= -5;
                for (i27 = i23; i27 < 2; ++i27) {
                    iArr2[i23] = (int)Test.fFld;
                    i22 += i27;
                }
                Test.dFld = i21;
                for (i29 = 1; i29 < 2; ++i29) {
                    i24 &= i30;
                    Test.instanceCount /= (i27 | 1);
                    if (Test.bFld) continue;
                    i30 += i27;
                    Test.instanceCount += i29;
                    i30 = i23;
                    i22 = i24;
                    iFld += i29;
                    Test.fFld += by2;
                    switch ((((i28 >>> 1) % 4) * 5) + 109) {
                    case 119:
                        iArr2[i23] <<= i27;
                        iFld += (i29 * i29);
                        iFld = -5331;
                        break;
                    case 121:
                        Test.fFld += (64 + (i29 * i29));
                        break;
                    case 127:
                        Test.instanceCount += i21;
                        break;
                    case 124:
                        i28 += (((i29 * Test.instanceCount) + Test.fFld) - by2);
                    default:
                        Test.instanceCount = i25;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i21 i22 = " + i + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 i30 by2 = " + i29 + "," + i30 + "," + by2);
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.bFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("iFld Test.dFld = " + iFld + "," + Double.doubleToLongBits(Test.dFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
