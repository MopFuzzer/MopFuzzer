// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:57 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-86L;
    public float fFld=-107.71F;
    public int iFld=-207;
    public static short sFld=23785;
    public static byte byFld=-88;
    public boolean bFld=false;
    public double dFld=28.93109;
    public double dArrFld[]=new double[N];
    public long lArrFld[]=new long[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long iMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i10) {

        float f=-66.1021F;
        int i11=196, i12=3471, i13=-36903, i14=-4865, i15=48605, i16=-32258, i17=43, i18=-215, i19=10, iArr1[]=new
            int[N];
        double d2=0.87134;
        boolean b=true;

        FuzzerUtils.init(iArr1, 74);

        f = 1;
        while (++f < 149) {
            for (i11 = 11; f < i11; --i11) {
                Test.instanceCount += 60570;
                i12 |= i10;
                d2 += i11;
                if (b) continue;
            }
            for (i13 = 1; i13 < 11; i13++) {
                for (i15 = 2; 1 < i15; i15--) {
                    i12 -= (int)d2;
                    iArr1[(int)(f - 1)] = (int)Test.instanceCount;
                    i16 *= (int)d2;
                }
                try {
                    i12 = (iArr1[i13] / i13);
                    i14 = (45561 / iArr1[i13]);
                    iArr1[(int)(f - 1)] = (i10 % i13);
                } catch (ArithmeticException a_e) {}
            }
            for (i17 = 1; i17 < 11; i17++) {
                i19 += (i17 ^ i13);
                Test.instanceCount += (((i17 * i19) + i10) - Test.instanceCount);
            }
        }
        long meth_res = i10 + Float.floatToIntBits(f) + i11 + i12 + Double.doubleToLongBits(d2) + (b ? 1 : 0) + i13 +
            i14 + i15 + i16 + i17 + i18 + i19 + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public short sMeth() {

        int i3=1, i4=61, i5=254, i6=-8, i7=3743, i8=-10, i9=21300, i20=2, iArr2[]=new int[N];
        byte by=43;
        boolean b1=true;

        FuzzerUtils.init(iArr2, 192);

        i3 = 351;
        while (--i3 > 0) {
            for (i4 = 1; i4 < 5; ++i4) {
                i5 += (i4 - Test.instanceCount);
                i5 += i4;
                for (i6 = 1; 2 > i6; i6++) {
                    by *= (byte)fFld;
                }
                for (i8 = 1; i8 < 2; i8++) {
                    long l=-7086L;
                    Test.instanceCount = (long)((dArrFld[i3 - 1]++) * lMeth(i5));
                    i7 *= i8;
                    Test.instanceCount += (((i8 * Test.instanceCount) + Test.instanceCount) - i20);
                    i9 += (i8 + fFld);
                    iArr2[i3] <<= (int)Test.instanceCount;
                    if (false) {
                        iArr2[i4 - 1] *= i3;
                        fFld -= Test.instanceCount;
                    } else if (b1) {
                        Test.instanceCount = l;
                    } else if (b1) {
                        i7 += i8;
                    }
                }
            }
        }
        long meth_res = i3 + i4 + i5 + i6 + i7 + by + i8 + i9 + i20 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr2);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public int iMeth(double d1, int i1, int i2) {

        int i21=174, i22=88, i23=-215, iArr3[]=new int[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr3, 13);
        FuzzerUtils.init(sArr, (short)-10341);

        d1 -= (-(i1 * (--fFld)));
        sMeth();
        for (long l1 : lArrFld) {
            iArr3[(iFld >>> 1) % N] = iFld;
            Test.sFld = (short)182;
            i21 = 1;
            do {
                i1 -= i21;
                Test.byFld &= (byte)i1;
                d1 = Test.sFld;
                i22 = 1;
                do {
                    Test.bArrFld[i21 - 1] = bFld;
                } while (++i22 < 1);
                iArr3[i21] -= i22;
                sArr[i21] += (short)i22;
                i1 += (((i21 * i2) + i21) - i23);
            } while (++i21 < 4);
            i23 -= (int)l1;
        }
        long meth_res = Double.doubleToLongBits(d1) + i1 + i2 + i21 + i22 + i23 + FuzzerUtils.checkSum(iArr3) +
            FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=-53.111440;
        int i=-8, i24=6, i25=-44470, i26=-7, i27=60, i28=-4295, i29=10, i30=-152, i31=-13, i32=-3, iArr[]=new int[N];
        byte by1=-13;

        FuzzerUtils.init(iArr, -10255);

        try {
            for (d = 174 + 400; 3 < d; d--) {
                iArr[(int)(d + 1)] -= ((i--) - iMeth(d, iFld, iFld));
                iFld = (int)fFld;
                iFld -= (int)Test.instanceCount;
                Test.instanceCount -= 24282;
            }
        }
        catch (ArrayIndexOutOfBoundsException exc1) {
            for (i24 = 10; i24 < 209; i24++) {
                i25 |= iFld;
            }
        }
        for (i26 = 9; i26 < 170; i26++) {
            iArr[i26 + 1] = i24;
            for (i28 = 1; 156 > i28; i28++) {
                i29 -= iFld;
                by1 = (byte)i;
                i30 = 1;
                do {
                    Test.byFld = (byte)Test.instanceCount;
                    i = (int)-22314L;
                    iFld += i30;
                } while (++i30 < 2);
                for (i31 = 1; i31 < 2; ++i31) {
                    Test.instanceCount += i31;
                    i29 += (i31 + i31);
                    Test.bArrFld[i28] = bFld;
                    i32 /= (int)(i | 1);
                    dFld = i31;
                    iArr[i28] = (int)Test.instanceCount;
                    iFld = -13;
                    Test.bArrFld[i28] = bFld;
                }
                switch ((i26 % 3) + 121) {
                case 121:
                    if (bFld) continue;
                case 122:
                    Test.instanceCount = 14L;
                    i29 += (i28 * i28);
                case 123:
                    iArr[i26] *= Test.sFld;
                    break;
                }
            }
        }

        FuzzerUtils.out.println("d i i24 = " + Double.doubleToLongBits(d) + "," + i + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 i29 by1 = " + i28 + "," + i29 + "," + by1);
        FuzzerUtils.out.println("i30 i31 i32 = " + i30 + "," + i31 + "," + i32);
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount fFld iFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(fFld) + "," + iFld);
        FuzzerUtils.out.println("Test.sFld Test.byFld bFld = " + Test.sFld + "," + Test.byFld + "," + (bFld ? 1 : 0));
        FuzzerUtils.out.println("dFld dArrFld lArrFld = " + Double.doubleToLongBits(dFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)) + "," + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("Test.bArrFld = " + FuzzerUtils.checkSum(Test.bArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
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
//DEBUG  sMeth ->  sMeth iMeth mainTest
//DEBUG  lMeth ->  lMeth sMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
