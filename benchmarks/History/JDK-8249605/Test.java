// Generated by Java* Fuzzer test generator (1.0.001). Sun May 17 20:16:35 2020
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static short sFld=32293;
    public static boolean bFld=false;
    public static int iFld=-4;
    public static double dFld=-114.18391;
    public static long[] lArrFld =new long[N];
    public static double[] dArrFld =new double[N];
    public static short[] sArrFld =new short[N];
    public static float[] fArrFld =new float[N];
    public static byte[] byArrFld =new byte[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 62741L);
        FuzzerUtils.init(Test.dArrFld, 0.109137);
        FuzzerUtils.init(Test.sArrFld, (short)16465);
        FuzzerUtils.init(Test.fArrFld, -73.755F);
        FuzzerUtils.init(Test.byArrFld, (byte)-71);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(long l, short s, byte by1) {

        int i4=-207;
        int i5=14;
        int i6=186;
        int[] iArr1 =new int[N];
        float f1=-68.741F;

        FuzzerUtils.init(iArr1, 14);

        i4 = i4;
        i4 -= i4;
        if (Test.bFld) {
            i4 += i4;
        } else if (Test.bFld) {
            f1 = 1;
            while (++f1 < 132) {
                Test.bFld = Test.bFld;
                if (Test.bFld) {
                    Test.dArrFld[(int)(f1)] = 3;
                    if (i4 != 0) {
                    }
                    for (i5 = (int)(f1); i5 < 12; i5++) {
                        by1 += (byte)i4;
                        i4 += i6;
                        iArr1[i5] += i5;
                        i6 += i5;
                        i4 += (i5 * i5);
                    }
                } else if (Test.bFld) {
                    if (Test.bFld) break;
                }
            }
        }
        long meth_res = l + s + by1 + i4 + Float.floatToIntBits(f1) + i5 + i6 + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth() {

        int i2=-50176;
        int i3=-36417;
        int i8=-9;
        int i9=-204;
        int i10=30029;
        int[] iArr2 =new int[N];
        short s1=-16554;
        byte by2=125;
        byte by3=-21;
        byte[][] byArr =new byte[N][N];
        double d=-24.15524;
        boolean[] bArr =new boolean[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(iArr2, 0);
        FuzzerUtils.init(byArr, (byte)75);

        for (i2 = 6; i2 < 162; i2 += 3) {
            Test.bFld = (!((bArr[i2] = Test.bFld) && (!(false & (-32919 != i3)))));
            i3 = (int)lMeth(Test.instanceCount, s1, by2);
            i3 = i2;
            i8 = 1;
            do {
                for (i9 = 1; 1 > i9; ++i9) {
                    float f2=34.130F;
                    switch ((i8 * 5) + 117) {
                    case 319:
                        i3 >>>= i8;
                        break;
                    case 228:
                        i10 += (i9 * i9);
                        break;
                    case 168:
                        f2 = i2;
                        i3 -= -6;
                        switch (((i3 >>> 1) % 3) + 103) {
                        case 103:
                            i3 = i8;
                            i10 = (int)Test.instanceCount;
                            break;
                        case 104:
                            Test.instanceCount = (long)f2;
                        case 105:
                            s1 |= (short)-5851;
                        }
                        break;
                    case 195:
                        Test.instanceCount -= i9;
                        break;
                    case 451:
                    case 204:
                        i3 += (i9 ^ Test.instanceCount);
                    case 292:
                        i10 *= (int)Test.instanceCount;
                        break;
                    case 370:
                        by2 -= (byte)i9;
                    case 288:
                        Test.instanceCount += (((i9 * f2) + by2) - Test.instanceCount);
                        break;
                    case 411:
                        Test.sArrFld[i8] -= by3;
                        break;
                    case 375:
                        Test.fArrFld[i9 + 1] = i9;
                        break;
                    case 365:
                        Test.fArrFld[i2] *= i10;
                        break;
                    case 210:
                        i3 += i9;
                        break;
                    case 169:
                        iArr2[i9] -= (int)20.15420;
                        break;
                    case 335:
                        Test.lArrFld[i9 - 1] -= (long)1.84536;
                    case 170:
                        i10 -= i3;
                        break;
                    case 257:
                        Test.instanceCount *= i3;
                    case 366:
                        i3 += i3;
                        break;
                    case 326:
                    case 429:
                        Test.lArrFld[i8] = 96;
                        break;
                    case 341:
                        Test.fArrFld[i2 - 1] += -13L;
                        break;
                    case 361:
                        i10 = Test.sFld;
                        break;
                    case 297:
                        i3 = (int)Test.instanceCount;
                        break;
                    case 439:
                        i3 = i9;
                        break;
                    case 224:
                        Test.bFld = Test.bFld;
                        break;
                    case 268:
                        Test.sFld = (short)-96;
                        break;
                    case 143:
                        i3 -= i3;
                    case 304:
                        Test.bFld = Test.bFld;
                    case 152:
                        i3 ^= i8;
                        break;
                    case 397:
                        i10 += (int)136L;
                        break;
                    case 364:
                        Test.dArrFld[i2 + 1] = 68.64211;
                        break;
                    case 136:
                        i3 = i2;
                        break;
                    case 184:
                        by2 *= (byte)Test.instanceCount;
                        break;
                    case 373:
                        i3 *= i8;
                        break;
                    case 242:
                        f2 += (-7L + (i9 * i9));
                        break;
                    case 316:
                        i10 += (i9 - f2);
                        break;
                    case 327:
                        i10 += (int)Test.instanceCount;
                    case 465:
                    case 374:
                        Test.instanceCount -= i9;
                        break;
                    case 272:
                        i10 >>>= -48333;
                        break;
                    case 227:
                        iArr2[i2 + 1] -= i8;
                        break;
                    case 205:
                        d -= Test.instanceCount;
                        break;
                    case 175:
                        iArr2[i9] += i8;
                    case 235:
                        Test.dArrFld[i2] = i10;
                        break;
                    case 130:
                        i10 = (int)d;
                    case 309:
                        Test.instanceCount = i9;
                        break;
                    case 171:
                        byArr[i8][i8 - 1] -= by3;
                        break;
                    case 310:
                        Test.instanceCount -= (long)d;
                        break;
                    case 132:
                        i3 >>= i2;
                        break;
                    case 142:
                        i10 += 46600;
                        break;
                    case 201:
                        i3 = i9;
                    case 124:
                        Test.instanceCount = i10;
                    case 441:
                        i10 = -213;
                        break;
                    case 414:
                        Test.byArrFld[i8 + 1] += (byte)Test.instanceCount;
                        break;
                    case 243:
                        i10 = (int)-10L;
                        break;
                    case 389:
                        d = i3;
                    case 160:
                        i10 += i9;
                    case 377:
                        Test.fArrFld[i9] = i8;
                        break;
                    case 388:
                        Test.bFld = false;
                        break;
                    case 403:
                        i3 -= (int)Test.instanceCount;
                        break;
                    case 428:
                        i10 += (i9 | i3);
                        break;
                    case 454:
                        f2 += i2;
                        break;
                    case 436:
                        Test.instanceCount = i3;
                        break;
                    case 381:
                        iArr2[i9] = by2;
                        break;
                    case 463:
                        i10 = i3;
                        break;
                    case 392:
                        Test.lArrFld[i2 - 1] += Test.instanceCount;
                        break;
                    case 150:
                        iArr2[i9] = i10;
                    case 418:
                        i10 += (int)Test.instanceCount;
                    case 452:
                        i10 += i9;
                    case 305:
                        Test.instanceCount += i9;
                    default:
                        Test.sArrFld[i2 - 1] = (short)i2;
                    }
                }
            } while (++i8 < 29);
        }
        vMeth_check_sum += i2 + i3 + s1 + by2 + i8 + i9 + i10 + by3 + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(byArr);
    }

    public static int iMeth() {

        int i11=-13;
        int i12=11;
        int i13=-80;
        int i14=33269;
        int i15=11;
        int i16=9;
        int i17=60753;
        int[] iArr3 =new int[N];
        int[] iArr4 =new int[N];
        double d1=0.127471;
        float f3=46.877F;

        FuzzerUtils.init(iArr3, 3);
        FuzzerUtils.init(iArr4, -51);

        vMeth();
        Test.iFld = Test.iFld;
        for (i11 = 20; i11 < 338; i11++) {
            for (i13 = 1; i13 < 5; ++i13) {
                for (d1 = 1; d1 < 2; d1++) {
                    Test.iFld += i13;
                    f3 += (float)(((d1 * i16) + Test.iFld) - i17);
                    iArr3[i13] += i14;
                    if (Test.bFld) continue;
                    Test.instanceCount = (long)f3;
                }
                Test.iFld = i16;
                iArr3 = iArr4;
                i12 *= -10;
                i15 += (((i13 * Test.sFld) + f3) - Test.instanceCount);
                iArr4[i13] += -107;
            }
        }
        long meth_res = i11 + i12 + i13 + i14 + Double.doubleToLongBits(d1) + i15 + Float.floatToIntBits(f3) + i16 +
            i17 + FuzzerUtils.checkSum(iArr3) + FuzzerUtils.checkSum(iArr4);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=6;
        int i1=75;
        int i18=-13;
        int i19=-59968;
        int i20=14563;
        int i21=-12;
        int i22=10667;
        int i23=-64533;
        int[] iArr =new int[N];
        byte by=20;
        float f=4.629F;

        FuzzerUtils.init(iArr, -20964);

        Test.instanceCount += 1788735094L;
        for (i = 7; i < 238; i++) {
            Test.lArrFld = Test.lArrFld;
            iArr[i - 1] *= (int)((by + Test.sFld) - (++Test.instanceCount));
            iArr[i - 1] += (int)((i1--) + (Test.instanceCount++));
            i1 += i;
            i1 = -79;
            by *= (byte)Math.min((int)(Math.min(Test.instanceCount, Test.instanceCount) * (-(f * Test.instanceCount))),
                i1 *= iMeth());
            Test.iFld += (i * i);
            i1 *= Test.iFld;
            Test.lArrFld[i - 1] = i;
        }
        for (i18 = 265; i18 > 13; i18 -= 3) {
            i1 = i19;
        }
        i19 = (int)f;
        i19 += (int)Test.instanceCount;
        Test.bFld = Test.bFld;
        Test.dFld -= Test.iFld;
        Test.iFld <<= (int)Test.instanceCount;
        Test.dFld += i19;
        Test.dFld = i18;
        for (i20 = 2; i20 < 240; i20++) {
            if (Test.bFld) break;
            i1 = i19;
            for (i22 = 106; i22 > 2; i22 -= 3) {
                i1 -= i1;
            }
            i19 = (int)Test.instanceCount;
            i23 <<= (int)71L;
            Test.instanceCount += (long)Test.dFld;
            i21 += (((i20 * i20) + i1) - f);
        }
        Test.lArrFld[(-241 >>> 1) % N] ^= i20;

        FuzzerUtils.out.println("i i1 by = " + i + "," + i1 + "," + by);
        FuzzerUtils.out.println("f i18 i19 = " + Float.floatToIntBits(f) + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 iArr = " + i23 + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.bFld = " + Test.instanceCount + "," + Test.sFld +
            "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iFld Test.dFld Test.lArrFld = " + Test.iFld + "," +
            Double.doubleToLongBits(Test.dFld) + "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.dArrFld Test.sArrFld Test.fArrFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," + FuzzerUtils.checkSum(Test.sArrFld) +
            "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
        FuzzerUtils.out.println("Test.byArrFld = " + FuzzerUtils.checkSum(Test.byArrFld));

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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}