// Generated by Java* Fuzzer test generator (1.0.001). Sun Apr  8 07:59:20 2018
public class Test {

    public static final int N = 400;

    public static long instanceCount=14L;
    public static short sFld=-23729;
    public static double dFld=0.37026;
    public int iFld=-115;
    public static int[] iArrFld =new int[N];
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -5);
        FuzzerUtils.init(Test.lArrFld, 5569430716446363946L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(short s, double d) {

        int i3=-76;

        Test.iArrFld[(i3 >>> 1) % N] += i3;
        vMeth2_check_sum += s + Double.doubleToLongBits(d) + i3;
    }

    public static void vMeth1(int i1, long l2, int i2) {

        int i4=2;
        float f=-2.168F;
        float[][] fArr =new float[N][N];
        byte by=-93;
        long[] lArr =new long[N];
        long[][] lArr1 =new long[N][N];

        FuzzerUtils.init(fArr, 12.315F);
        FuzzerUtils.init(lArr, -3945530330114999964L);
        FuzzerUtils.init(lArr1, 2783878579L);

        vMeth2(Test.sFld, -65.27163);
        l2 = l2;
        i1 -= i1;
        i4 = 270;
        while ((i4 -= 2) > 0) {
            fArr[i4][i4] -= f;
            l2 = Test.instanceCount;
            Test.instanceCount = l2;
            l2 *= i1;
            i1 += i4;
            by = (byte)i2;
            f = i4;
            lArr[i4] += l2;
            i2 = Test.sFld;
        }
        lArr1 = FuzzerUtils.long2array(N, (long)-33705L);
        i1 *= 14;
        vMeth1_check_sum += i1 + l2 + i2 + i4 + Float.floatToIntBits(f) + by +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth(long l, int i, long l1) {

        int i5=6, i6=-42538, i7=-209, i8=163, i9=13, i10=-4, i11=191;
        boolean b=true;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, -77.34509);

        vMeth1(i, l1, i);
        for (i5 = 3; i5 < 245; i5++) {
            Test.sFld += (short)i;
            dArr[i5 - 1] = Test.dFld;
            switch ((i5 % 1) + 75) {
            case 75:
                i7 = 7;
                while (--i7 > 0) {
                    if (b) {
                        Test.iArrFld[i7] = -11995;
                        i -= i;
                        if (b) continue;
                        i6 += (int)Test.dFld;
                    }
                }
                for (i8 = 1; i8 < 7; ++i8) {
                    for (i10 = 1; i10 < 2; i10++) {
                        Test.dFld -= i6;
                        i11 += i7;
                    }
                }
                break;
            default:
                Test.iArrFld[i5 + 1] = -12;
            }
        }
        vMeth_check_sum += l + i + l1 + i5 + i6 + i7 + (b ? 1 : 0) + i8 + i9 + i10 + i11 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i12=34197, i13=-3, i14=-120, i15=15;
        float f1=-2.947F;
        float f2=0.397F;
        float[] fArr1 =new float[N];
        boolean b1=false;
        byte by1=48;
        long l3=4479308315352349434L;

        FuzzerUtils.init(fArr1, 82.995F);

        vMeth(Test.instanceCount, i12, Test.instanceCount);
        Test.iArrFld[(-47040 >>> 1) % N] = i12;
        for (f1 = 18; f1 < 361; f1++) {
            switch ((((i12 >>> 1) % 7) * 5) + 104) {
            case 107:
                i13 *= (int)f1;
                for (i14 = (int)(f1); i14 < 73; ++i14) {
                    b1 = b1;
                    f2 = Test.instanceCount;
                    Test.instanceCount = 7101941589201374388L;
                    switch ((int)((f1 * 5) + 29)) {
                    case 232:
                        b1 = b1;
                        i15 -= by1;
                        Test.sFld >>= (short)1;
                        i15 += i15;
                    case 299:
                        i15 = i15;
                        l3 = 1;
                        while (++l3 < 1) {
                            f2 += (float)Test.dFld;
                            i13 >>= 1;
                            i15 >>>= i14;
                            switch ((int)((l3 % 2) + 77)) {
                            case 77:
                                Test.iArrFld[i14 - 1] += (int)861L;
                                if (b1) continue;
                                i13 = -55;
                                Test.iArrFld[(int)(f1 - 1)] *= -52;
                            case 78:
                                if (true) continue;
                                i13 += (int)(((l3 * f2) + i15) - i12);
                                Test.instanceCount += Test.instanceCount;
                                break;
                            default:
                                Test.iArrFld[(int)(f1 - 1)] = i13;
                                by1 >>= (byte)i12;
                                if (true) break;
                            }
                        }
                        break;
                    case 63:
                        i13 = i14;
                    case 157:
                        i13 *= by1;
                    case 334:
                        i12 = i14;
                    case 154:
                        fArr1[(int)(f1)] += i13;
                        break;
                    case 341:
                        by1 += (byte)(i14 + i15);
                    case 283:
                        i12 = (int)-4L;
                        break;
                    case 160:
                        Test.instanceCount = l3;
                        break;
                    case 320:
                        i15 = (int)1.85191;
                    case 337:
                        i13 *= i14;
                    case 335:
                        f2 += i14;
                    case 180:
                        i13 *= i12;
                        break;
                    case 201:
                        i15 >>= i13;
                        break;
                    case 307:
                        i13 += (-10988 + (i14 * i14));
                        break;
                    case 133:
                        Test.lArrFld[(int)(f1 + 1)] <<= Test.instanceCount;
                        break;
                    case 48:
                        by1 += (byte)(i14 | i13);
                    case 345:
                        i12 += i14;
                        break;
                    case 61:
                        Test.instanceCount <<= i12;
                        break;
                    case 362:
                        i15 -= (int)Test.dFld;
                        break;
                    case 111:
                        i13 = i12;
                        break;
                    case 104:
                        Test.instanceCount = i12;
                        break;
                    case 238:
                        i15 >>= (int)l3;
                        break;
                    case 374:
                        i13 <<= i15;
                        break;
                    case 155:
                        Test.instanceCount *= (long)f2;
                    case 342:
                        Test.iArrFld[(int)(f1)] <<= -4;
                        break;
                    case 110:
                        Test.iArrFld = Test.iArrFld;
                        break;
                    case 147:
                        i13 = (int)Test.instanceCount;
                        break;
                    case 43:
                        Test.iArrFld = FuzzerUtils.int1array(N, (int)7);
                        break;
                    case 289:
                        fArr1 = fArr1;
                        break;
                    case 230:
                        Test.instanceCount += i12;
                        break;
                    case 225:
                        f2 += Test.sFld;
                        break;
                    case 331:
                        Test.instanceCount -= i12;
                        break;
                    case 379:
                        f2 -= 4271753198L;
                        break;
                    case 163:
                        i12 = i14;
                        break;
                    case 195:
                        Test.dFld -= -2.793F;
                        break;
                    case 152:
                    case 167:
                        Test.instanceCount -= -38025;
                    case 295:
                        Test.iArrFld[(int)(f1 + 1)] = i12;
                    case 102:
                    case 30:
                        Test.instanceCount += i13;
                        break;
                    case 124:
                        b1 = false;
                        break;
                    case 276:
                        i12 <<= i13;
                        break;
                    case 308:
                        i13 -= (int)f1;
                        break;
                    case 98:
                    case 112:
                        Test.instanceCount *= i12;
                        break;
                    case 271:
                        Test.iArrFld[(int)(f1)] = i15;
                        break;
                    case 38:
                        i12 += (int)f1;
                        break;
                    case 66:
                        f2 += i14;
                        break;
                    case 126:
                        i13 += (((i14 * Test.instanceCount) + i13) - i13);
                        break;
                    case 197:
                        Test.instanceCount >>= i12;
                        break;
                    case 351:
                        i12 += i14;
                        break;
                    case 105:
                        i15 = 98;
                        break;
                    case 55:
                        i15 += i14;
                        break;
                    case 333:
                        Test.iArrFld[(int)(f1)] = 148;
                    case 325:
                        i12 |= i12;
                    case 190:
                        i15 = -145;
                        break;
                    case 101:
                        if (b1) break;
                        break;
                    case 329:
                    case 175:
                        if (b1) continue;
                        break;
                    case 202:
                        i13 = iFld;
                    case 118:
                        f2 += (((i14 * i14) + i13) - i13);
                    case 332:
                        i15 -= i12;
                        break;
                    case 359:
                        i12 = -10;
                        break;
                    case 316:
                        iFld <<= -36;
                        break;
                    case 146:
                        by1 &= (byte)71;
                        break;
                    case 58:
                        try {
                            i13 = (-122 / i15);
                            iFld = (i12 % 116);
                            i15 = (61381 % i15);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 46:
                        i12 += (int)(5322322358579785795L + (i14 * i14));
                        break;
                    case 49:
                        f2 *= Test.instanceCount;
                        break;
                    case 75:
                        Test.instanceCount = Test.instanceCount;
                        break;
                    default:
                        i12 = -6;
                    }
                }
                break;
            case 106:
            case 127:
                Test.iArrFld[(int)(f1)] -= i14;
            case 120:
                iFld = i12;
                break;
            case 112:
                if (b1) break;
                break;
            case 121:
                i13 = (int)l3;
                break;
            case 125:
                i15 += (int)f1;
            default:
                i12 += (int)f1;
            }
        }

        FuzzerUtils.out.println("i12 f1 i13 = " + i12 + "," + Float.floatToIntBits(f1) + "," + i13);
        FuzzerUtils.out.println("i14 i15 b1 = " + i14 + "," + i15 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("f2 by1 l3 = " + Float.floatToIntBits(f2) + "," + by1 + "," + l3);
        FuzzerUtils.out.println("fArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.dFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("iFld Test.iArrFld Test.lArrFld = " + iFld + "," + FuzzerUtils.checkSum(Test.iArrFld) +
            "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
