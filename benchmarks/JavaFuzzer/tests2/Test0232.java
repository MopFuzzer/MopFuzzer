// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:23 2023
public class Test0232 {

    public static final int N = 400;

    public static long instanceCount=-71L;
    public byte byFld=69;
    public static double dFld=0.9860;
    public boolean bFld=true;
    public long[] lArrFld =new long[N];
    public double[] dArrFld =new double[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(short s, int i4) {

        int i5=-214;
        int i6=-23181;
        int i7=-148;
        int i8=-7387;
        int i9=27066;
        int i10=-20038;
        int[] iArr1 =new int[N];
        boolean b=false;
        double d1=90.77046;
        byte[] byArr =new byte[N];

        FuzzerUtils.init(iArr1, -171);
        FuzzerUtils.init(byArr, (byte)74);

        for (i5 = 249; i5 > 13; i5--) {
            for (i7 = 1; i7 < 7; i7++) {
                for (i9 = 1; i9 < 2; i9++) {
                    if (i10 != 0) {
                        vMeth2_check_sum += s + i4 + i5 + i6 + i7 + i8 + i9 + i10 + (b ? 1 : 0) +
                            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(byArr);
                        return;
                    }
                    if (i10 != 0) {
                        vMeth2_check_sum += s + i4 + i5 + i6 + i7 + i8 + i9 + i10 + (b ? 1 : 0) +
                            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(byArr);
                        return;
                    }
                    iArr1[i7 + 1] *= i10;
                    switch ((i5 % 8) + 25) {
                    case 25:
                        i4 += (int) Test0232.instanceCount;
                        if (b) continue;
                        b = b;
                        break;
                    case 26:
                        d1 += Test0232.instanceCount;
                        byArr[i9] *= (byte)i4;
                        i4 >>= i6;
                        break;
                    case 27:
                        try {
                            i4 = (i6 % i8);
                            i10 = (-203 / iArr1[i7]);
                            iArr1[(0 >>> 1) % N] = (i5 % -292941168);
                        } catch (ArithmeticException a_e) {}
                        b = b;
                        break;
                    case 28:
                        i6 = i7;
                        break;
                    case 29:
                        d1 = i7;
                        break;
                    case 30:
                        i10 |= i7;
                    case 31:
                        i4 += (i9 * i9);
                        break;
                    case 32:
                        i8 += (i9 * i9);
                        break;
                    default:
                        i4 += (i9 * i9);
                    }
                }
            }
        }
        vMeth2_check_sum += s + i4 + i5 + i6 + i7 + i8 + i9 + i10 + (b ? 1 : 0) + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(byArr);
    }

    public static void vMeth1(int i3) {

        double d=-29.56011;
        float f=-42.690F;
        short s1=25817;
        int i11=-12940;
        int i12=54820;
        int i13=-39679;
        int i14=3;
        int i15=66;
        int[][] iArr =new int[N][N];
        boolean b1=false;

        FuzzerUtils.init(iArr, 6957);

        d = (((-(i3++)) - (i3 + i3)) + (f * (Test0232.instanceCount * i3)));
        Test0232.instanceCount -= i3;
        iArr[(i3 >>> 1) % N][(-62004 >>> 1) % N] *= (int)Math.abs(++f);
        vMeth2(s1, i3);
        Test0232.instanceCount = i3;
        Test0232.instanceCount ^= Test0232.instanceCount;
        i11 = 1;
        do {
            i3 = s1;
            for (i12 = 1; i12 < 10; i12++) {
                i3 += (i12 * i12);
                for (i14 = 1; i14 < 2; ++i14) {
                    if (b1) {
                        i13 >>= -14;
                        Test0232.instanceCount += i14;
                        Test0232.instanceCount += 22254;
                    }
                }
            }
        } while (++i11 < 163);
        vMeth1_check_sum += i3 + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + s1 + i11 + i12 + i13 + i14 +
            i15 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public void vMeth(long l, int i2) {

        int i16=-1, i17=-32100, i18=-175, i19=-50, i20=65375, i21=-15746;
        short s2=22971;
        float f1=0.371F;
        long l1=93L;
        byte by=75;

        i2 -= (int) (--Test0232.instanceCount);
        vMeth1(i2);
        for (i16 = 3; i16 < 174; i16++) {
            s2 += (short)i17;
            i17 = i16;
            i2 -= (int)l;
        }
        for (i18 = 6; i18 < 150; ++i18) {
            i2 += i18;
            for (f1 = 1; f1 < 11; f1++) {
                l = 37079;
                for (l1 = 1; l1 < 2; l1++) {
                    double d2=1.103208;
                    i20 += (int)d2;
                    i17 -= 58699;
                    i2 *= (int)f1;
                    by >>= by;
                }
            }
        }
        vMeth_check_sum += l + i2 + i16 + i17 + s2 + i18 + i19 + Float.floatToIntBits(f1) + i20 + l1 + i21 + by;
    }

    public void mainTest(String[] strArr1) {

        int i=13;
        int i1=-80;
        int i22=-5;
        int i23=-93;
        int i24=30010;
        int i25=-47;
        int[] iArr2 =new int[N];
        long l2=-450854513L;
        short s3=25678;
        float f2=-2.944F;

        FuzzerUtils.init(iArr2, -29297);

        for (i = 4; i < 165; ++i) {
            vMeth(l2, 19);
            iArr2[(-8 >>> 1) % N] = 96;
            i1 = -11;
            for (i22 = 6; 156 > i22; i22 += 3) {
                for (i24 = 1; i24 < 4; ++i24) {
                    iArr2 = iArr2;
                    iArr2[i22] >>= 51287;
                    i25 *= s3;
                    lArrFld = lArrFld;
                    i25 -= 13099;
                    byFld += (byte)(((i24 * i24) + l2) - i);
                    if (bFld) {
                        i23 = i22;
                        Test0232.dFld -= 1497157545L;
                    } else if (true) {
                        dArrFld[i - 1] = -10;
                        iArr2[i24 - 1] = -13;
                        i25 += (i24 - i23);
                        Test0232.instanceCount -= i;
                    } else if (bFld) {
                        i1 += i24;
                        i25 += i22;
                    } else {
                        f2 = Test0232.instanceCount;
                        if (bFld) {
                            if (bFld) break;
                            i23 += i24;
                            s3 = (short)i1;
                        } else if (bFld) {
                            i1 %= (int)(i1 | 1);
                            i1 += (i24 + Test0232.instanceCount);
                        } else {
                            Test0232.instanceCount = i1;
                            lArrFld[i24 + 1] = i23;
                        }
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 l2 = " + i + "," + i1 + "," + l2);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 s3 f2 = " + i25 + "," + s3 + "," + Float.floatToIntBits(f2));
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test0232.instanceCount byFld Test0232.dFld = " + Test0232.instanceCount + "," + byFld + "," +
                Double.doubleToLongBits(Test0232.dFld));
        FuzzerUtils.out.println("bFld lArrFld dArrFld = " + (bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(lArrFld) + ","
            + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0232 _instance = new Test0232();
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
