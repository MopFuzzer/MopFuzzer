// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:55 2023
public class Test0928 {

    public static final int N = 400;

    public static volatile long instanceCount=-6425366428734146323L;
    public static volatile float fFld=1.544F;
    public static short sFld=-16635;
    public boolean bFld=true;
    public static long lFld=-30L;

    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(double d) {

        int i9=2;
        int i10=-11;
        int i11=-47148;
        int i12=25343;
        int i13=10;
        int[] iArr3 =new int[N];
        short[] sArr1 =new short[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(iArr3, -9);
        FuzzerUtils.init(sArr1, (short)-23178);
        FuzzerUtils.init(lArr, 4248393285L);

        for (i9 = 10; i9 < 259; ++i9) {
            for (i11 = 1; i11 < 7; i11++) {
                iArr3[i9 + 1] >>>= (int) Test0928.instanceCount;
                i13 = 1;
                while (++i13 < 2) {
                    if (false) break;
                    switch ((i13 % 2) + 61) {
                    case 61:
                        sArr1[i11 + 1] = (short)i9;
                        d = Test0928.instanceCount;
                        i10 += i13;
                        i10 += (i13 * i13);
                    case 62:
                        d += i11;
                        i10 = (int)-3821145260247948505L;
                        lArr[i9] = -9449;
                        i10 ^= i12;
                    default:
                        i10 /= (int)(i13 | 1);
                    }
                }
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + i9 + i10 + i11 + i12 + i13 + FuzzerUtils.checkSum(iArr3) +
            FuzzerUtils.checkSum(sArr1) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(long l1, int i6, long l2) {

        boolean b=false;
        int i7=-67;
        int i8=175;
        int i14=13;
        int i15=19688;
        int[] iArr2 =new int[N];
        byte by1=-114;
        double d1=-19.80876;
        float[] fArr =new float[N];

        FuzzerUtils.init(iArr2, -180);
        FuzzerUtils.init(fArr, 3.1009F);

        b = b;
        for (i7 = 308; i7 > 13; --i7) {
            by1 += (byte)i7;
            i8 += i7;
            try {
                i8 = (i8 % i8);
                iArr2[i7 + 1] = (-144 / i7);
                i8 = (i8 % i6);
            } catch (ArithmeticException a_e) {}
            Test0928.instanceCount |= i7;
            Test0928.fFld *= Float.intBitsToFloat((int) (fArr[i7 + 1] + (i8 - i7)));
            vMeth1(d1);
            b = b;
            for (i14 = 1; 6 > i14; ++i14) {
                i6 -= i15;
                Test0928.sFld = (short) i8;
                i15 += (int) Test0928.fFld;
                Test0928.instanceCount += -7;
            }
        }
        i8 <<= i14;
        vMeth_check_sum += l1 + i6 + l2 + (b ? 1 : 0) + i7 + i8 + by1 + Double.doubleToLongBits(d1) + i14 + i15 +
            FuzzerUtils.checkSum(iArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static double dMeth(long l, int i1, int i2) {

        byte by=21;
        byte[] byArr =new byte[N];
        int i4=5;
        int i5=34578;
        int i16=1311;
        int i17=35682;
        int i18=-4;
        int[] iArr1 =new int[N];
        double d2=104.112815;
        short[] sArr =new short[N];

        FuzzerUtils.init(iArr1, -11);
        FuzzerUtils.init(sArr, (short)14009);
        FuzzerUtils.init(byArr, (byte)38);

        for (int i3 : iArr1) {
            by = (byte)(--sArr[(i3 >>> 1) % N]);
            for (i4 = 1; i4 < 4; i4++) {
                vMeth(Test0928.instanceCount, 7, Test0928.instanceCount);
                d2 += Test0928.sFld;
                byArr[i4 + 1] >>= by;
                if (i4 != 0) {
                }
                i3 = i4;
                i1 |= i1;
                iArr1[i4 + 1] = i5;
            }
        }
        i16 = 1;
        do {
            l -= i4;
            for (i17 = 1; i17 < 8; i17++) {
                i1 -= i1;
                Test0928.fFld -= i17;
            }
        } while (++i16 < 207);
        long meth_res = l + i1 + i2 + by + i4 + i5 + Double.doubleToLongBits(d2) + i16 + i17 + i18 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(byArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=29587;
        int i19=-51371;
        int i20=49498;
        int i21=-14;
        int i22=-49987;
        int i23=-4;
        int i24=14;
        int[] iArr =new int[N];
        byte by2=-46;
        double d3=0.92132;
        long[] lArr1 =new long[N];
        float[][] fArr1 =new float[N][N];

        FuzzerUtils.init(iArr, -13);
        FuzzerUtils.init(lArr1, 32368L);
        FuzzerUtils.init(fArr1, 21.398F);

        iArr[(i >>> 1) % N] -= (int) ((dMeth(Test0928.instanceCount, i, 61827) - Test0928.instanceCount) - 28629);
        i += by2;
        lArr1[(i >>> 1) % N] = i;
        switch ((((i >>> 1) % 2) * 5) + 6) {
        case 14:
            i -= (int) Test0928.instanceCount;
        case 11:
            if (bFld) {
                i = (int)d3;
                for (i19 = 218; i19 > 5; --i19) {
                    i20 <<= (int) Test0928.instanceCount;
                    for (i21 = 6; i21 < 118; i21++) {
                        lArr1[i19 - 1] = -7599;
                        Test0928.instanceCount ^= Test0928.instanceCount;
                        Test0928.fFld *= i;
                        for (i23 = 1; i23 < 2; ++i23) {
                            i20 -= (int) Test0928.instanceCount;
                            if (bFld) continue;
                            by2 >>= (byte)i19;
                            if (bFld) {
                                i24 -= i24;
                                fArr1[i23 - 1][i23 - 1] *= i24;
                                switch ((((i21 >>> 1) % 6) * 5) + 108) {
                                case 128:
                                    i -= (int)1.942F;
                                    Test0928.instanceCount -= i21;
                                    break;
                                case 121:
                                    d3 /= (i24 | 1);
                                    break;
                                case 118:
                                    d3 = d3;
                                    if (bFld) break;
                                    break;
                                case 131:
                                    Test0928.instanceCount = i20;
                                    i24 *= i24;
                                    break;
                                case 124:
                                    by2 += (byte)(((i23 * i22) + i24) - i23);
                                    break;
                                case 115:
                                    Test0928.lFld ^= -78;
                                    break;
                                default:
                                    lArr1[i21 - 1] -= i24;
                                }
                            } else if (bFld) {
                                i24 += (-191 + (i23 * i23));
                            } else {
                                i22 = -5;
                            }
                        }
                    }
                }
            } else if (false) {
                bFld = bFld;
            } else if (bFld) {
                i = i24;
            } else {
                iArr[(i23 >>> 1) % N] *= (int)-4387203151082748813L;
            }
            break;
        }

        FuzzerUtils.out.println("i by2 d3 = " + i + "," + by2 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("iArr lArr1 fArr1 = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(lArr1)
            + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test0928.instanceCount Test0928.fFld Test0928.sFld = " + Test0928.instanceCount + "," +
                Float.floatToIntBits(Test0928.fFld) + "," + Test0928.sFld);
        FuzzerUtils.out.println("bFld Test0928.lFld = " + (bFld ? 1 : 0) + "," + Test0928.lFld);

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0928 _instance = new Test0928();
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
