// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:12 2023
public class Test0029 {

    public static final int N = 400;

    public static volatile long instanceCount=5L;
    public static int iFld=8;
    public static float fFld=-101.592F;
    public static int iFld1=-10;
    public boolean bFld=false;
    public static double[] dArrFld =new double[N];
    public static volatile short[] sArrFld =new short[N];
    public static volatile float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test0029.dArrFld, -124.31140);
        FuzzerUtils.init(Test0029.sArrFld, (short) 20943);
        FuzzerUtils.init(Test0029.fArrFld, 119.214F);
    }

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i2, int i3, short s) {

        int i4=-8, i5=125, i6=-225, i7=11;
        double d=2.77790;
        float f=-122.14F;
        byte by=89;
        boolean b=false;

        i4 = 1;
        do {
            i5 = 1;
            while (++i5 < 6) {
                d += Test0029.instanceCount;
                Test0029.iFld = i3;
                f = i2;
                i2 -= (int) Test0029.instanceCount;
                Test0029.iFld = s;
                for (i6 = 1; i6 < 1; i6++) {
                    i7 <<= 89;
                    Test0029.iFld ^= by;
                    if (b) continue;
                    by >>= (byte) Test0029.instanceCount;
                    Test0029.dArrFld[i6 + 1] = Test0029.instanceCount;
                }
                by = (byte)6819788174722255725L;
                Test0029.iFld += (((i5 * i2) + i2) - by);
            }
        } while (++i4 < 279);
        long meth_res = i2 + i3 + s + i4 + i5 + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i6 + i7 + by +
            (b ? 1 : 0);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        int i=49431;
        int i1=9154;
        int i8=-8184;
        int i9=50722;
        int i10=-33008;
        int i11=-37931;
        int i12=-11;
        int i13=-2;
        int i14=2;
        int i15=-33;
        int[] iArr1 =new
                    int[N];

        FuzzerUtils.init(iArr1, 4);

        Test0029.iFld = (int) ((Test0029.iFld++) * Long.reverseBytes(19384L + (++Test0029.iFld)));
        for (i = 8; i < 242; i++) {
            iMeth1(Test0029.iFld, i8, (short) (-21234));
            try {
                i1 = (i / -58);
                i8 = (i1 % -65);
                Test0029.iFld = (i8 % -50600);
            } catch (ArithmeticException a_e) {}
            i1 |= i1;
        }
        for (i9 = 15; i9 < 327; ++i9) {
            Test0029.sArrFld[i9] = (short) i8;
            Test0029.instanceCount = -9;
            Test0029.instanceCount = i8;
            i11 = 1;
            while (++i11 < 5) {
                for (i12 = i9; i12 < 1; i12++) {
                    Test0029.iFld = Test0029.iFld;
                }
                for (i14 = 1; i14 < 1; ++i14) {
                    iArr1[i14] -= 3;
                    Test0029.instanceCount *= Test0029.iFld;
                }
            }
        }
        long meth_res = i + i1 + i8 + i9 + i10 + i11 + i12 + i13 + i14 + i15 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth() {

        int i16=9471;
        int i17=-4;
        int i18=-230;
        int[] iArr =new int[N];
        int[][] iArr2 =new int[N][N];
        boolean b1=false;
        byte by1=88;
        double d1=-118.23983;

        FuzzerUtils.init(iArr, -64442);
        FuzzerUtils.init(iArr2, 39);

        iArr[(Test0029.iFld >>> 1) % N] *= (int) Test0029.fFld;
        Test0029.iFld = (iMeth() ^ Test0029.iFld);
        for (i16 = 157; i16 > 8; i16--) {
            b1 = b1;
            Test0029.instanceCount &= Test0029.instanceCount;
            by1 ^= by1;
            if (b1) continue;
            if (b1) break;
            if (b1) {
                Test0029.iFld += (int) Test0029.fFld;
                for (d1 = 1; d1 < 11; ++d1) {
                    i17 = Test0029.iFld;
                    Test0029.instanceCount += (long) (((d1 * Test0029.instanceCount) + Test0029.iFld1) - i17);
                    iArr2 = iArr2;
                    Test0029.instanceCount <<= Test0029.instanceCount;
                }
            } else if (b1) {
                Test0029.iFld1 <<= -2;
            } else if (true) {
                if (b1) break;
            } else {
                iArr2[i16 + 1] = FuzzerUtils.int1array(N, (int)-124);
            }
        }
        long meth_res = i16 + i17 + (b1 ? 1 : 0) + by1 + Double.doubleToLongBits(d1) + i18 + FuzzerUtils.checkSum(iArr)
            + FuzzerUtils.checkSum(iArr2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i19=120;
        int i20=51887;
        int i21=-222;
        int i22=-53759;
        int i23=72;
        int i24=-2112;
        int i25=-27185;
        int i26=37413;
        int i27=-37688;
        int i28=-187;
        int i29=-1;
        int[] iArr3 =new int[N];
        short s1=24613;
        byte by2=68;
        double d2=-101.3087;

        FuzzerUtils.init(iArr3, 22951);

        Test0029.iFld += (int) Math.min(Math.min(24929 * lMeth(), Test0029.instanceCount), Test0029.instanceCount);
        for (i19 = 7; 212 > i19; ++i19) {
            for (i21 = 7; i21 < 122; ++i21) {
                switch ((i21 % 9) + 99) {
                case 99:
                    i22 += (int) Test0029.instanceCount;
                    i20 -= (int) Test0029.instanceCount;
                    for (i23 = i19; i23 < 2; i23++) {
                        i25 += s1;
                        Test0029.instanceCount *= -4;
                        Test0029.fFld += (32 + (i23 * i23));
                    }
                    break;
                case 100:
                    Test0029.fArrFld[i19 - 1] += Test0029.iFld1;
                    Test0029.iFld1 += (i21 - i20);
                    break;
                case 101:
                    for (i26 = 1; 2 > i26; i26++) {
                        i22 += (int) Test0029.instanceCount;
                        i25 *= Test0029.iFld1;
                    }
                case 102:
                    i22 *= -156;
                    for (i28 = 1; i28 < 2; ++i28) {
                        Test0029.instanceCount += i23;
                        Test0029.fFld = i24;
                        switch ((i19 % 2) + 107) {
                        case 107:
                            s1 += (short) Test0029.iFld1;
                            break;
                        case 108:
                        default:
                            Test0029.instanceCount += (i28 + Test0029.instanceCount);
                            if (true) {
                                Test0029.instanceCount += i28;
                                Test0029.instanceCount += (((i28 * by2) + Test0029.fFld) - i19);
                                iArr3[i19 - 1] += i21;
                                i24 -= i26;
                            } else if (bFld) {
                                Test0029.instanceCount = i24;
                                Test0029.iFld += (int) Test0029.instanceCount;
                            }
                            Test0029.iFld *= i19;
                        }
                    }
                    break;
                case 103:
                    Test0029.fArrFld = Test0029.fArrFld;
                    break;
                case 104:
                    i29 = by2;
                    break;
                case 105:
                    i29 += (int) Test0029.instanceCount;
                    break;
                case 106:
                    Test0029.instanceCount -= (long) d2;
                    break;
                case 107:
                    i25 |= i28;
                default:
                    i27 += (((i21 * s1) + Test0029.instanceCount) - i27);
                }
            }
        }

        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 s1 i26 = " + i25 + "," + s1 + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("by2 d2 iArr3 = " + by2 + "," + Double.doubleToLongBits(d2) + "," +
            FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test0029.instanceCount Test0029.iFld Test0029.fFld = " + Test0029.instanceCount + "," + Test0029.iFld +
                "," + Float.floatToIntBits(Test0029.fFld));
        FuzzerUtils.out.println("Test0029.iFld1 bFld Test0029.dArrFld = " + Test0029.iFld1 + "," + (bFld ? 1 : 0) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0029.dArrFld)));
        FuzzerUtils.out.println("Test0029.sArrFld Test0029.fArrFld = " + FuzzerUtils.checkSum(Test0029.sArrFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0029.fArrFld)));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0029 _instance = new Test0029();
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
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
