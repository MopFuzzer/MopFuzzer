// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:50 2023
public class Test0828 {

    public static final int N = 400;

    public static long instanceCount=9027445211021687013L;
    public static long lFld=44716L;
    public static boolean bFld=true;
    public static float fFld=0.465F;
    public static short sFld=16970;
    public static short[][] sArrFld =new short[N][N];
    public static int[] iArrFld =new int[N];
    public static volatile float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test0828.sArrFld, (short) -30965);
        FuzzerUtils.init(Test0828.iArrFld, -35176);
        FuzzerUtils.init(Test0828.fArrFld, -2.728F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i7=8;
        int i8=0;
        int i9=5;
        int i10=26745;
        int[] iArr1 =new int[N];
        float f2=2.544F;
        double d1=-1.84573;
        short s=-7422;

        FuzzerUtils.init(iArr1, -12606);

        i7 = 1;
        while (++i7 < 198) {
            for (i8 = 8; i8 > i7; --i8) {
                i9 += i8;
                f2 += (i8 * i9);
                i9 -= -8395;
                i10 = 1;
                while (++i10 < 1) {
                    i9 -= (int)d1;
                    Test0828.lFld += (i10 + i8);
                    i9 += (9 + (i10 * i10));
                    switch ((i8 % 2) + 19) {
                    case 19:
                    case 20:
                        i9 += (((i10 * i9) + i9) - s);
                        d1 *= i9;
                        iArr1[i10] = -14;
                        break;
                    }
                    i9 += i10;
                    i9 += i10;
                }
            }
        }
        long meth_res = i7 + i8 + i9 + Float.floatToIntBits(f2) + i10 + Double.doubleToLongBits(d1) + s +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i4, float f1) {

        int i5=-119;
        int i6=-81;
        int i11=12;
        int i12=32;
        int i13=-54023;
        int i14=199;
        int[] iArr =new int[N];
        double d=0.96423;
        short s1=-14646;
        byte by=42;
        float[][] fArr =new float[N][N];
        long[] lArr =new long[N];

        FuzzerUtils.init(iArr, 8);
        FuzzerUtils.init(fArr, 0.376F);
        FuzzerUtils.init(lArr, -21455L);

        Test0828.bFld = true;
        i5 = 1;
        while (++i5 < 212) {
            i6 = 8;
            do {
                switch ((i6 * 5) + 22) {
                case 73:
                    i4 -= (int) ((long) (iArr[i6 - 1] * (d + Test0828.instanceCount)) ^ (iMeth() - 140));
                    i4 = 0;
                    break;
                case 157:
                    if (Test0828.bFld) {
                        for (i11 = 1; i11 < 1; i11++) {
                            i4 = 53;
                            i12 = i5;
                            i4 *= i4;
                        }
                        i12 = s1;
                    } else if (Test0828.bFld) {
                        f1 += Test0828.lFld;
                        i4 -= (int) Test0828.lFld;
                        i12 /= (int)((long)(d) | 1);
                    } else if (Test0828.bFld) {
                        i12 *= i12;
                    }
                case 147:
                    iArr[i6] = (int)d;
                    break;
                case 327:
                    i12 = i4;
                case 64:
                    Test0828.sArrFld[i5 - 1][i5] %= (short) (i11 | 1);
                    break;
                case 268:
                    try {
                        i12 = (102 % iArr[i6 - 1]);
                        iArr[i6] = (i4 % 23119);
                        i4 = (-195 / i5);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 60:
                case 291:
                    s1 = (short)i12;
                    break;
                case 174:
                    Test0828.instanceCount = (long) f1;
                    break;
                case 324:
                    i4 = (int)d;
                case 122:
                    i4 = (int)f1;
                    break;
                case 213:
                    i4 = (int) Test0828.instanceCount;
                    break;
                case 253:
                case 255:
                    Test0828.instanceCount = i12;
                    break;
                case 357:
                    Test0828.lFld = (long) d;
                    break;
                case 240:
                    if (i11 != 0) {
                        vMeth1_check_sum += i4 + Float.floatToIntBits(f1) + i5 + i6 + Double.doubleToLongBits(d) + i11
                            + i12 + s1 + by + i13 + i14 + FuzzerUtils.checkSum(iArr) +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
                        return;
                    }
                    break;
                case 227:
                    iArr[i5] += by;
                    break;
                case 258:
                    Test0828.instanceCount += (i6 * i6);
                    break;
                case 90:
                    i4 += (int)f1;
                    break;
                case 66:
                    Test0828.bFld = Test0828.bFld;
                    break;
                case 129:
                    Test0828.sArrFld[i5][i5 - 1] += (short) f1;
                    break;
                case 263:
                    Test0828.lFld += i13;
                    break;
                case 27:
                    i13 += i6;
                    break;
                case 133:
                    if (Test0828.bFld) break;
                    break;
                case 43:
                    i4 = i5;
                    break;
                case 108:
                    i12 = i4;
                    break;
                case 299:
                    i13 *= by;
                    break;
                case 102:
                    i4 = (int)f1;
                    break;
                case 276:
                    Test0828.sArrFld[i5] = Test0828.sArrFld[i6 - 1];
                    break;
                case 151:
                    i12 -= i13;
                    break;
                case 32:
                    iArr[i6 + 1] = (int) Test0828.instanceCount;
                    break;
                case 351:
                    try {
                        i12 = (i11 / i6);
                        i12 = (-15867 % i12);
                        iArr[i6 - 1] = (-613218135 / i4);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 312:
                    f1 -= (float)d;
                case 130:
                    by += (byte)(-68 + (i6 * i6));
                    break;
                case 63:
                    i13 -= i5;
                    break;
                case 77:
                    i4 >>= i11;
                case 309:
                    fArr[i5 + 1][i5 + 1] *= (float)d;
                    break;
                case 39:
                    iArr[i5 - 1] -= i5;
                    break;
                case 89:
                    iArr[(-8 >>> 1) % N] -= i13;
                    break;
                case 200:
                    i13 >>= i11;
                case 69:
                    Test0828.lFld <<= 5952;
                    break;
                case 47:
                    if (i12 != 0) {
                        vMeth1_check_sum += i4 + Float.floatToIntBits(f1) + i5 + i6 + Double.doubleToLongBits(d) + i11
                            + i12 + s1 + by + i13 + i14 + FuzzerUtils.checkSum(iArr) +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
                        return;
                    }
                    break;
                case 148:
                    iArr[i5 - 1] -= i13;
                    break;
                case 177:
                case 62:
                    d *= d;
                case 285:
                    i14 -= -31126;
                    break;
                case 181:
                    fArr[i6 - 1][i5 + 1] += Test0828.instanceCount;
                case 294:
                    iArr[i6 + 1] = i13;
                    break;
                case 355:
                case 209:
                    i4 += (-11 + (i6 * i6));
                case 173:
                    Test0828.lFld -= i6;
                    break;
                case 257:
                    fArr[i5][i6] += 62676;
                case 315:
                    try {
                        iArr[i6 - 1] = (iArr[i5 + 1] % i4);
                        i12 = (-1904905400 / i13);
                        i14 = (57 % i4);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 216:
                    Test0828.lFld += (((i6 * Test0828.instanceCount) + Test0828.lFld) - i4);
                    break;
                case 28:
                    i14 *= i12;
                    break;
                case 208:
                    f1 *= Test0828.fFld;
                case 318:
                    if (Test0828.bFld) continue;
                    break;
                case 74:
                    iArr[i6 - 1] >>= 9;
                    break;
                case 252:
                    i4 += (i6 * Test0828.fFld);
                case 170:
                    i12 <<= i12;
                    break;
                case 326:
                    Test0828.instanceCount >>= -113;
                case 104:
                    Test0828.instanceCount = i4;
                    break;
                case 185:
                    i4 += (i6 * i4);
                case 232:
                    lArr[i6 - 1] *= (long) Test0828.fFld;
                    break;
                case 165:
                    i12 += (i6 * Test0828.instanceCount);
                    break;
                case 105:
                    by = (byte)i4;
                    break;
                case 41:
                    Test0828.lFld += 161L;
                    break;
                case 335:
                    if (i11 != 0) {
                        vMeth1_check_sum += i4 + Float.floatToIntBits(f1) + i5 + i6 + Double.doubleToLongBits(d) + i11
                            + i12 + s1 + by + i13 + i14 + FuzzerUtils.checkSum(iArr) +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
                        return;
                    }
                    break;
                case 72:
                    Test0828.instanceCount += (((i6 * Test0828.fFld) + i6) - i12);
                    break;
                case 37:
                    if (false) break;
                default:
                    i14 <<= i11;
                }
            } while (--i6 > 0);
        }
        vMeth1_check_sum += i4 + Float.floatToIntBits(f1) + i5 + i6 + Double.doubleToLongBits(d) + i11 + i12 + s1 + by
            + i13 + i14 + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(float f) {

        int i15=48083;
        int i16=-217;
        int i17=152;
        int i18=222;
        int[] iArr2 =new int[N];
        double d2=1.105122;
        double[] dArr =new double[N];

        FuzzerUtils.init(iArr2, 192);
        FuzzerUtils.init(dArr, 38.46551);

        vMeth1(1, Test0828.fFld);
        i15 = 1;
        do {
            for (i16 = 1; i16 < 11; ++i16) {
                i17 += -16029;
                for (d2 = 1; 2 > d2; ++d2) {
                    i17 <<= i18;
                    i18 <<= i16;
                    i17 += (int)(d2 * i18);
                    Test0828.lFld -= Test0828.sFld;
                    if (i17 != 0) {
                        vMeth_check_sum += Float.floatToIntBits(f) + i15 + i16 + i17 + Double.doubleToLongBits(d2) +
                            i18 + FuzzerUtils.checkSum(iArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                        return;
                    }
                    i17 = i17;
                    Test0828.lFld = (long) Test0828.fFld;
                }
            }
            iArr2[i15] += i16;
            i17 -= i16;
            dArr[i15] *= i18;
        } while (++i15 < 137);
        vMeth_check_sum += Float.floatToIntBits(f) + i15 + i16 + i17 + Double.doubleToLongBits(d2) + i18 +
            FuzzerUtils.checkSum(iArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i=35057, i1=212, i2=-8, i3=42695, i19=-7, i20=-214, i21=-3, i22=35675, i23=19;
        double d3=0.124735;
        float f3=84.700F;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, 1577495728L);

        Test0828.instanceCount >>= (--i);
        i1 = 1;
        while (++i1 < 376) {
            Test0828.lFld = i;
            for (i2 = 2; i2 < 67; i2++) {
                vMeth(Test0828.fFld);
                d3 = i2;
                Test0828.iArrFld[i2] += 8;
            }
            Test0828.lFld += i1;
            Test0828.lFld >>= Test0828.sFld;
            i3 -= 8292;
        }
        lArr1[(i1 >>> 1) % N] += i;
        i = (int) Test0828.fFld;
        i19 = 1;
        do {
            lArr1[i19] |= i1;
            Test0828.fFld += i19;
            Test0828.iArrFld[i19 - 1] = i3;
        } while ((i19 += 2) < 250);
        i *= i19;
        i -= i;
        f3 = 1;
        while (++f3 < 356) {
            i3 = i3;
            for (i20 = 3; i20 < 71; i20++) {
                Test0828.fFld = Test0828.fFld;
                Test0828.instanceCount ^= i19;
                lArr1[i20 - 1] -= Test0828.lFld;
                i = (int) Test0828.lFld;
                Test0828.fArrFld = FuzzerUtils.float1array(N, (float) -1.80F);
            }
            i21 = i;
        }
        for (i22 = 7; i22 < 147; ++i22) {
            Test0828.iArrFld[i22 + 1] = Test0828.sFld;
            if (Test0828.bFld) continue;
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 d3 i19 = " + i3 + "," + Double.doubleToLongBits(d3) + "," + i19);
        FuzzerUtils.out.println("f3 i20 i21 = " + Float.floatToIntBits(f3) + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 lArr1 = " + i22 + "," + i23 + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0828.instanceCount Test0828.lFld Test0828.bFld = " + Test0828.instanceCount + "," + Test0828.lFld +
                "," + (Test0828.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0828.fFld Test0828.sFld Test0828.sArrFld = " + Float.floatToIntBits(Test0828.fFld) + "," +
                Test0828.sFld + "," + FuzzerUtils.checkSum(Test0828.sArrFld));
        FuzzerUtils.out.println("Test0828.iArrFld Test0828.fArrFld = " + FuzzerUtils.checkSum(Test0828.iArrFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0828.fArrFld)));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0828 _instance = new Test0828();
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
