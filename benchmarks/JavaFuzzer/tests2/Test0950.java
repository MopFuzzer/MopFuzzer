// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:56 2023
public class Test0950 {

    public static final int N = 400;

    public static long instanceCount=-3560700676L;
    public static float fFld=2.72F;
    public static double dFld=-34.1522;
    public volatile short sFld=-5507;
    public int[] iArrFld =new int[N];
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0950.lArrFld, 44L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i8) {

        int i9=217;
        int i10=76;
        int i11=78;
        int i12=0;
        int[] iArr1 =new int[N];
        byte by=78;
        boolean b=true;
        float f=2.323F;
        double[] dArr =new double[N];

        FuzzerUtils.init(iArr1, 27);
        FuzzerUtils.init(dArr, 0.66419);

        Test0950.instanceCount *= i8;
        i8 >>= i8;
        for (i9 = 6; i9 < 128; i9++) {
            iArr1[i9] >>= i10;
            i11 = 1;
            do {
                Test0950.dFld -= Test0950.instanceCount;
                by += (byte)(6445095924046828482L + (i11 * i11));
                if (b) break;
                i10 = i8;
                iArr1[i9] *= 0;
                dArr[i9] *= i11;
                iArr1[i9] *= i11;
                for (f = 1; f < 1; f++) {
                    if (b) break;
                    b = b;
                }
            } while (++i11 < 13);
        }
        vMeth1_check_sum += i8 + i9 + i10 + i11 + by + (b ? 1 : 0) + Float.floatToIntBits(f) + i12 +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(int i7) {

        int i13=14;
        int i14=-8;
        int i15=-164;
        int i16=-23433;
        int i17=-24557;
        int[] iArr =new int[N];

        FuzzerUtils.init(iArr, -5);

        iArr[(i7 >>> 1) % N] = Integer.reverseBytes(-i7);
        vMeth1(i7);
        Test0950.dFld -= 28;
        for (i13 = 11; i13 < 378; ++i13) {
            i7 += (int) Test0950.fFld;
            for (i15 = 1; i15 < 5; ++i15) {
                i16 -= 24145;
                i17 = 1;
                do {
                    Test0950.instanceCount = i15;
                    i16 = 119;
                    Test0950.lArrFld[i13 + 1] -= i16;
                    i7 += i17;
                    i7 += (int) Test0950.instanceCount;
                } while (++i17 < 2);
                Test0950.lArrFld[i15] >>= i7;
            }
        }
        i7 = (int)-621846536L;
        vMeth_check_sum += i7 + i13 + i14 + i15 + i16 + i17 + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(short s, int i3, int i4) {

        int i5=0, i6=-37556, i18=-5;
        boolean b1=true;
        double[] dArr1 =new double[N];

        FuzzerUtils.init(dArr1, 21.94400);

        for (i5 = 1; i5 < 324; ++i5) {
            switch ((i5 % 1) + 106) {
            case 106:
                switch ((i5 % 2) + 106) {
                case 106:
                case 107:
                default:
                    i4 += (i5 * i5);
                    Test0950.instanceCount = (Test0950.instanceCount * i4);
                    i3 += (i5 + Test0950.fFld);
                }
                vMeth(41926);
            }
            i6 |= i4;
            i18 = 1;
            do {
                if (b1) {
                    i6 = s;
                } else {
                    i4 -= i3;
                    i6 += (int) Test0950.fFld;
                    i6 |= 127;
                    dArr1[i18] -= Test0950.instanceCount;
                }
            } while (++i18 < 5);
        }
        long meth_res = s + i3 + i4 + i5 + i6 + i18 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-3, i1=79, i2=-9, i19=-93, i20=-25921, i21=110, i22=45040, i23=-12, i24=117, i25=182, i26=11519, i27=195;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, -1.781F);

        i += (-iArrFld[(i >>> 1) % N]);
        Test0950.fFld = (((Test0950.fFld++) + (Test0950.instanceCount--)) * -34656L);
        for (i1 = 2; i1 < 339; i1++) {
            fArr[i1 + 1] -= (iArrFld[i1] * ((i1 + 7084119022872500215L) * (-6368 - (Test0950.instanceCount--))));
            i2 >>= iMeth(sFld, 7, i2);
            Test0950.instanceCount += (long) 2.498F;
        }
        for (i19 = 3; i19 < 162; ++i19) {
            for (i21 = 158; i21 > 8; i21--) {
                i += (((i21 * i1) + i22) - i);
                sFld += (short)(i21 ^ i22);
                for (i23 = 2; i23 > 1; --i23) {
                    i24 = i24;
                    iArrFld[i23] <<= i20;
                    switch ((i23 % 1) + 118) {
                    case 118:
                        Test0950.dFld += Test0950.instanceCount;
                        break;
                    }
                    i24 &= (int) Test0950.instanceCount;
                    i2 = (int) Test0950.fFld;
                    Test0950.dFld = Test0950.instanceCount;
                    i22 += i24;
                    iArrFld = FuzzerUtils.int1array(N, (int)14);
                }
                for (i25 = 1; i25 < 2; ++i25) {
                    i27 += (i25 - i20);
                    iArrFld[i25] = i23;
                    i22 -= (int) Test0950.dFld;
                    i24 ^= i22;
                    iArrFld[i19] = (int) Test0950.fFld;
                    switch ((i25 % 4) + 125) {
                    case 125:
                        iArrFld[i19] = i24;
                        break;
                    case 126:
                        iArrFld[i25] += i1;
                        Test0950.fFld *= Test0950.instanceCount;
                        break;
                    case 127:
                        Test0950.instanceCount = i24;
                        break;
                    case 128:
                        sFld = (short)i25;
                        break;
                    default:
                        Test0950.instanceCount = sFld;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0950.instanceCount Test0950.fFld Test0950.dFld = " + Test0950.instanceCount + "," +
                Float.floatToIntBits(Test0950.fFld) + "," + Double.doubleToLongBits(Test0950.dFld));
        FuzzerUtils.out.println("sFld iArrFld Test0950.lArrFld = " + sFld + "," + FuzzerUtils.checkSum(iArrFld) + "," +
                FuzzerUtils.checkSum(Test0950.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0950 _instance = new Test0950();
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
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
