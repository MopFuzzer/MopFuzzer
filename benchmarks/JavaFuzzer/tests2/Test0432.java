// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:32 2023
public class Test0432 {

    public static final int N = 400;

    public static volatile long instanceCount=6969757376449576689L;
    public static float fFld=89.351F;
    public volatile byte byFld=17;
    public static volatile int iFld=-146;
    public static int iFld1=42382;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0432.iArrFld, -20139);
    }

    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(byte by, int i7, long l1) {

        int i8=41115, i9=-4, i10=38479, i11=-21402, i13=4;
        float f1=-2.835F;
        double d=69.60994;
        long l2=-2416689524952546807L;

        for (i8 = 13; i8 < 308; i8++) {
            i9 += (int)(-8L + (i8 * i8));
            f1 += i7;
            for (i10 = 1; i10 < 6; i10++) {
                Test0432.iArrFld[i8] <<= i11;
                Test0432.iArrFld[(i11 >>> 1) % N] -= i11;
                i9 = i10;
                i9 = (int)f1;
                if (false) continue;
            }
        }
        d -= 49;
        for (int i12 : Test0432.iArrFld) {
            for (l2 = 1; l2 < 4; ++l2) {
                i7 += (int)(33150L + (l2 * l2));
            }
            if (i11 != 0) {
                vMeth1_check_sum += by + i7 + l1 + i8 + i9 + Float.floatToIntBits(f1) + i10 + i11 +
                    Double.doubleToLongBits(d) + l2 + i13;
                return;
            }
            l1 -= i9;
        }
        vMeth1_check_sum += by + i7 + l1 + i8 + i9 + Float.floatToIntBits(f1) + i10 + i11 + Double.doubleToLongBits(d)
            + l2 + i13;
    }

    public static double dMeth() {

        int i3=-8;
        int i4=25;
        int i5=-16;
        int i6=34079;
        int i14=-24683;
        int i15=5;
        int[] iArr =new int[N];
        short s=24987;
        double d1=-18.42982;
        boolean b=true;

        FuzzerUtils.init(iArr, -17861);

        if (b) {
            i3 = 1;
            while (++i3 < 322) {
                i4 = (--iArr[i3]);
                i4 = (--i4);
                i5 = 1;
                while (++i5 < 5) {
                    iArr[i5 - 1] >>>= (++i4);
                }
                s -= (short)iArr[i3];
                i6 = 5;
                do {
                    if (Test0432.instanceCount != i4) continue;
                    vMeth1((byte) (77), i5, Test0432.instanceCount);
                    for (i14 = i3; 1 > i14; i14++) {
                        i4 = i5;
                        Test0432.instanceCount += (((i14 * i5) + i15) - Test0432.instanceCount);
                        i15 = i3;
                        Test0432.fFld += (float) d1;
                    }
                } while (--i6 > 0);
            }
        } else {
            i15 -= i6;
        }
        long meth_res = i3 + i4 + i5 + s + i6 + i14 + i15 + Double.doubleToLongBits(d1) + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(int i1, float f, int i2) {

        int i16=-18, i17=-39, i18=-52, i19=188, i20=-28;
        double d2=1.37001;
        double[] dArr =new double[N];
        byte by1=-68;
        short s1=-13834;

        FuzzerUtils.init(dArr, 0.12577);

        i2 = (int)((--dArr[(6 >>> 1) % N]) * ((i2 - i1) - dMeth()));
        for (i16 = 256; i16 > 9; i16 -= 3) {
            i18 = 1;
            do {
                for (i19 = i16; i19 < 1; i19++) {
                    d2 *= i17;
                    switch ((i18 % 3) + 18) {
                    case 18:
                        i20 += (((i19 * f) + i16) - i17);
                        i20 = i16;
                        i17 >>= 64;
                        break;
                    case 19:
                        i20 += (int) Test0432.instanceCount;
                        i20 += (((i19 * Test0432.instanceCount) + i19) - i18);
                        break;
                    case 20:
                        by1 += (byte)i19;
                        Test0432.instanceCount += (((i19 * i1) + s1) - i17);
                        d2 += i2;
                        break;
                    default:
                        i20 -= (int)-28.87675;
                    }
                }
            } while (++i18 < 19);
        }
        vMeth_check_sum += i1 + Float.floatToIntBits(f) + i2 + i16 + i17 + i18 + i19 + i20 +
            Double.doubleToLongBits(d2) + by1 + s1 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        long l=-57886L;
        float f2=1.983F, f3=-1.169F;
        int i21=-1, i22=2, i23=-31, i24=-37757, i25=-211, i26=5;
        double d3=1.108761;
        short s2=12513;
        short[] sArr =new short[N];
        boolean b1=false;

        FuzzerUtils.init(sArr, (short)26959);

        l = 1;
        while (++l < 388) {
            int i=10;
            vMeth(i, Test0432.fFld, i);
        }
        for (f2 = 8; 206 > f2; ++f2) {
            i21 = (int)l;
            i21 -= i21;
            i21 += i21;
            Test0432.instanceCount += i21;
            for (i22 = 127; 3 < i22; i22 -= 2) {
                i24 = 1;
                do {
                    sArr = sArr;
                    i23 *= i23;
                    i23 += (i24 * i24);
                    Test0432.iArrFld[i24] >>= (int) l;
                } while (++i24 < 3);
                i23 -= i21;
                Test0432.iArrFld = Test0432.iArrFld;
                switch (((i22 % 2) * 5) + 113) {
                case 116:
                    f3 -= i23;
                    break;
                case 117:
                    byFld <<= (byte)12;
                    for (i25 = 1; i25 < 3; ++i25) {
                        d3 = Test0432.iFld;
                        byFld -= (byte)d3;
                        switch ((((i22 >>> 1) % 9) * 5) + 96) {
                        case 123:
                            byFld += (byte)(-11 + (i25 * i25));
                            switch ((i25 % 9) + 3) {
                            case 3:
                                i23 += (((i25 * i22) + byFld) - i25);
                                break;
                            case 4:
                            case 5:
                                i21 = (int)l;
                                Test0432.instanceCount += (i25 * f2);
                            case 6:
                                Test0432.iFld1 <<= Test0432.iFld1;
                                i21 = i24;
                            case 7:
                                i21 += (i25 * i25);
                            case 8:
                                Test0432.iArrFld[i25] = -2;
                                break;
                            case 9:
                                Test0432.iArrFld[(int) (f2 + 1)] = Test0432.iFld;
                                break;
                            case 10:
                                i26 >>= (int) Test0432.instanceCount;
                                break;
                            case 11:
                                s2 -= (short)i24;
                                break;
                            default:
                                if (b1) continue;
                            }
                            break;
                        case 133:
                            i21 &= (int) Test0432.instanceCount;
                            break;
                        case 140:
                            Test0432.fFld += (((i25 * Test0432.iFld) + f2) - Test0432.instanceCount);
                            break;
                        case 97:
                            byFld = (byte)f3;
                        case 101:
                            d3 = d3;
                        case 99:
                            if (false) break;
                        case 124:
                            if (b1) break;
                            break;
                        case 132:
                            f3 += l;
                            break;
                        case 104:
                            i26 = 21479;
                            break;
                        default:
                            Test0432.iArrFld[i22] = i23;
                        }
                    }
                }
            }
        }

        FuzzerUtils.out.println("l f2 i21 = " + l + "," + Float.floatToIntBits(f2) + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("f3 i25 i26 = " + Float.floatToIntBits(f3) + "," + i25 + "," + i26);
        FuzzerUtils.out.println("d3 s2 b1 = " + Double.doubleToLongBits(d3) + "," + s2 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test0432.instanceCount Test0432.fFld byFld = " + Test0432.instanceCount + "," +
                Float.floatToIntBits(Test0432.fFld) + "," + byFld);
        FuzzerUtils.out.println("Test0432.iFld Test0432.iFld1 Test0432.iArrFld = " + Test0432.iFld + "," + Test0432.iFld1 + "," +
                FuzzerUtils.checkSum(Test0432.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0432 _instance = new Test0432();
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
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
