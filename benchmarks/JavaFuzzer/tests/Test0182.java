// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:57 2023
public class Test0182 {

    public static final int N = 400;

    public static long instanceCount = 1L;
    public static short sFld = 6324;
    public static volatile byte byFld = -13;
    public static float fFld = -76.514F;
    public static boolean[] bArrFld = new boolean[N];
    public static volatile long[] lArrFld = new long[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    static {
        FuzzerUtils.init(Test0182.bArrFld, false);
        FuzzerUtils.init(Test0182.lArrFld, -3941656585366997613L);
    }

    public volatile int iFld = 13;

    public static int iMeth(int i2, short s) {

        float f1 = -1.302F;
        float f2 = -2.774F;
        float[][] fArr = new float[N][N];
        int i3 = -167;
        int i4 = 151;
        int i5 = -5;
        int[] iArr = new int[N];
        double d = 2.14317;

        FuzzerUtils.init(iArr, -97);
        FuzzerUtils.init(fArr, -123.47F);

        i2 += 13;
        for (f1 = 3; f1 < 240; ++f1) {
            iArr[(int) (f1 - 1)] = i2;
            for (i4 = 1; i4 < 7; i4 += 2) {
                i3 = (int) Test0182.instanceCount;
                Test0182.instanceCount >>= i4;
                f2 *= Test0182.instanceCount;
            }
            switch ((int) (((f1 % 8) * 5) + 110)) {
                case 143:
                    Test0182.instanceCount = i4;
                    i3 = i3;
                    break;
                case 135:
                    switch ((int) ((f1 % 5) + 18)) {
                        case 18:
                            i5 += i5;
                            break;
                        case 19:
                        case 20:
                            fArr[(int) (f1)][(int) (f1)] += i3;
                            iArr[(int) (f1)] -= (int) Test0182.instanceCount;
                            break;
                        case 21:
                        case 22:
                            i3 |= i5;
                        default:
                            Test0182.instanceCount <<= i4;
                    }
                case 113:
                    fArr[(int) (f1 + 1)] = fArr[(int) (f1 - 1)];
                    break;
                case 140:
                    d = -8;
                    break;
                case 138:
                    i2 <<= i5;
                case 123:
                    i5 = i2;
                    break;
                case 117:
                    i3 -= (int) f1;
                    break;
                case 121:
                    Test0182.instanceCount += (long) (((f1 * i5) + i3) - i2);
                    break;
                default:
                    d *= i2;
            }
        }
        long meth_res = i2 + s + Float.floatToIntBits(f1) + i3 + i4 + i5 + Float.floatToIntBits(f2) +
                Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth1(float f, int i1) {

        int i6 = -2;
        int i7 = 29172;
        int i8 = 12;
        int i9 = 2;
        int i10 = -93;
        int i11 = 2;
        int i12 = 32935;
        int[] iArr1 = new int[N];
        boolean b = true;
        float f3 = -2.308F;
        float[] fArr1 = new float[N];
        double d1 = 7.62006;
        double[] dArr = new double[N];
        long l = -1L;

        FuzzerUtils.init(iArr1, 59323);
        FuzzerUtils.init(fArr1, -1.958F);
        FuzzerUtils.init(dArr, 4.5955);

        Test0182.instanceCount >>= (--i1);
        f *= ((iMeth(i1, Test0182.sFld) + i1) + f);
        i1 = (int) Test0182.instanceCount;
        Test0182.instanceCount += i1;
        for (i6 = 9; i6 < 332; ++i6) {
            i1 = 53;
            switch ((i6 % 1) + 67) {
                case 67:
                    i8 = 1;
                    while ((i8 += 3) < 5) {
                        for (i9 = 5; i9 > 1; i9--) {
                            boolean b1 = false;
                            i1 -= i9;
                            iArr1[i6 + 1] >>= i6;
                            switch (i8 + 121) {
                                case 121:
                                    i10 += (int) Test0182.instanceCount;
                                    i1 >>>= i7;
                                    i7 *= i7;
                                    break;
                                case 122:
                                    i7 = i7;
                                    break;
                                case 123:
                                    f += i9;
                                    break;
                                case 124:
                                    i1 = 69;
                                    break;
                                case 125:
                                    Test0182.byFld += (byte) (((i9 * Test0182.instanceCount) + i7) - i6);
                                    break;
                                case 126:
                                    fArr1[i9] = -62;
                                    break;
                                case 127:
                                    i1 = -61700;
                                    break;
                                case 128:
                                    Test0182.bArrFld[i9 - 1] = b;
                                    break;
                                case 129:
                                    i7 >>>= (int) Test0182.instanceCount;
                                    break;
                                case 130:
                                    i10 >>= i8;
                                    break;
                                case 131:
                                    i10 += (((i9 * Test0182.instanceCount) + i8) - f3);
                                case 132:
                                    fArr1[i9 - 1] /= 47.112F;
                                    break;
                                case 133:
                                    i1 -= (int) Test0182.instanceCount;
                                    break;
                                case 134:
                                    iArr1[i8 + 1] = (int) Test0182.instanceCount;
                                    break;
                                case 135:
                                    Test0182.instanceCount >>>= i7;
                                    break;
                                case 136:
                                    Test0182.instanceCount *= i7;
                                    break;
                                case 137:
                                    iArr1[i6 - 1] = i9;
                                    break;
                                case 138:
                                    Test0182.instanceCount <<= i9;
                                    break;
                                case 139:
                                    i10 >>= i7;
                                case 140:
                                    i7 *= (int) -2.426F;
                                    break;
                                case 141:
                                    d1 = Test0182.instanceCount;
                                    break;
                                case 142:
                                    Test0182.instanceCount = -44;
                                    break;
                                case 143:
                                    iArr1[i8] -= (int) d1;
                                    break;
                                case 144:
                                    iArr1[i8] = i9;
                                    break;
                                case 145:
                                    b = b;
                                    break;
                                case 146:
                                    i1 += i8;
                                    break;
                                case 147:
                                    i7 += (i9 - i8);
                                    break;
                                case 148:
                                    Test0182.byFld *= (byte) i6;
                                    break;
                                case 149:
                                    i1 += i9;
                                    break;
                                case 150:
                                    if (b1) break;
                                    break;
                                case 151:
                                case 152:
                                    i7 = i1;
                                    break;
                                case 153:
                                    d1 = i8;
                                    break;
                                case 154:
                                    i7 += (int) Test0182.instanceCount;
                                    break;
                                case 155:
                                    i10 += i1;
                                    break;
                                case 156:
                                    i1 = (int) f3;
                                    break;
                                case 157:
                                    i1 = 126;
                                    break;
                                case 158:
                                    iArr1[i9] -= Test0182.sFld;
                                    break;
                                case 159:
                                    i10 *= 221;
                                    break;
                                case 160:
                                    Test0182.instanceCount += (((i9 * l) + i10) - Test0182.sFld);
                                    break;
                                case 161:
                                    l += (i9 * Test0182.sFld);
                                    break;
                                case 162:
                                    i1 = i11;
                                    break;
                                case 163:
                                    i11 -= i7;
                                    break;
                                case 164:
                                    i10 += i11;
                                    break;
                                case 165:
                                case 166:
                                    i7 -= (int) l;
                                    break;
                                case 167:
                                    if (i9 != 0) {
                                        vMeth1_check_sum += Float.floatToIntBits(f) + i1 + i6 + i7 + i8 + i9 + i10 + (b ? 1 :
                                                0) + Float.floatToIntBits(f3) + Double.doubleToLongBits(d1) + l + i11 + i12 +
                                                FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1))
                                                + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                                        return;
                                    }
                                case 168:
                                    dArr[i6 - 1] += i8;
                                    break;
                                case 169:
                                    i1 += (int) f3;
                                    break;
                                case 170:
                                    i1 += i9;
                                case 171:
                                    i7 += i7;
                                    break;
                                case 172:
                                    i10 += 35434;
                                    break;
                                case 173:
                                    b = false;
                                    break;
                                case 174:
                                    i7 -= Test0182.sFld;
                                    break;
                                case 175:
                                case 176:
                                    d1 -= l;
                                    break;
                                case 177:
                                    Test0182.sFld ^= (short) i6;
                                    break;
                                case 178:
                                    Test0182.lArrFld[i8] = -7;
                                case 179:
                                    dArr[i9 + 1] -= i7;
                                    break;
                                case 180:
                                    i1 = i8;
                                    break;
                                case 181:
                                    if (b) continue;
                                    break;
                                case 182:
                                case 183:
                                    if (b) continue;
                                    break;
                                case 184:
                                    Test0182.byFld = (byte) i7;
                                    break;
                                case 185:
                                    i1 += i6;
                                    break;
                                case 186:
                                    i1 = (int) 1.457F;
                                case 187:
                                    i10 += (i9 - i11);
                                    break;
                                case 188:
                                    i1 = i1;
                                    break;
                                case 189:
                                    i12 = i12;
                                    break;
                                case 190:
                                    iArr1[i6 - 1] -= -6;
                                    break;
                                default:
                                    i1 &= (int) l;
                            }
                        }
                    }
                default:
                    l *= i12;
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + i1 + i6 + i7 + i8 + i9 + i10 + (b ? 1 : 0) +
                Float.floatToIntBits(f3) + Double.doubleToLongBits(d1) + l + i11 + i12 + FuzzerUtils.checkSum(iArr1) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void main(String[] strArr) {

        try {
            Test0182 _instance = new Test0182();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void vMeth(int i) {

        int i13 = -13;
        int i14 = 5;
        int i15 = 5;
        int i16 = -141;
        int i17 = 49331;
        int i18 = -42060;
        int i19 = -101;
        int[] iArr2 = new int[N];
        byte[] byArr = new byte[N];

        FuzzerUtils.init(iArr2, -8);
        FuzzerUtils.init(byArr, (byte) 22);

        vMeth1(Test0182.fFld, i);
        for (i13 = 21; i13 < 383; i13++) {
            i15 = 5;
            do {
                iArr2 = iArr2;
                for (i16 = 1; i16 < 1; i16++) {
                    Test0182.lArrFld = FuzzerUtils.long1array(N, (long) 3840659498330968156L);
                    Test0182.instanceCount += Test0182.instanceCount;
                    i17 = i13;
                    Test0182.instanceCount <<= Test0182.byFld;
                    i14 += (i16 * i16);
                }
                Test0182.fFld += (((i15 * i15) + i13) - i14);
                Test0182.fFld += i15;
                for (i18 = i15; i18 < 1; i18++) {
                    byArr[i18] = (byte) i14;
                }
                i -= (int) 48.3208;
            } while (--i15 > 0);
        }
        vMeth_check_sum += i + i13 + i14 + i15 + i16 + i17 + i18 + i19 + FuzzerUtils.checkSum(iArr2) +
                FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        int i20 = 33182;
        int i21 = 45334;
        int i22 = -1;
        int i23 = -32668;
        int i24 = -80;
        int i25 = 13952;
        int i26 = -58314;
        int[] iArr3 = new int[N];

        FuzzerUtils.init(iArr3, 23313);

        vMeth(iFld);
        Test0182.instanceCount -= -8254;
        i20 = 1;
        do {
            i21 = 1;
            do {
                iArr3[i21 + 1] = iFld;
                i22 = 1;
                do {
                    iArr3[i21] >>= i21;
                    Test0182.lArrFld[i21 - 1] = iFld;
                    Test0182.instanceCount *= i20;
                } while (++i22 < 1);
                iFld += i21;
                Test0182.byFld >>= (byte) Test0182.instanceCount;
                Test0182.instanceCount += (i21 ^ i22);
            } while (++i21 < 164);
            iFld += (((i20 * iFld) + Test0182.instanceCount) - iFld);
            iFld = 15752;
            for (i23 = i20; i23 < 164; ++i23) {
                iFld *= Test0182.sFld;
                i24 += (19915 + (i23 * i23));
                Test0182.lArrFld[i23] = i20;
                i24 = (int) -55400L;
            }
            switch (((i20 % 1) * 5) + 22) {
                case 25:
                    i24 += (i20 * i24);
                    for (i25 = 6; i25 < 164; i25++) {
                        Test0182.fFld -= i26;
                        Test0182.fFld -= i26;
                        Test0182.sFld /= (short) (i21 | 1);
                        Test0182.instanceCount = i24;
                        Test0182.instanceCount -= 34778;
                        Test0182.instanceCount += i25;
                    }
                    iArr3[i20] >>= (int) Test0182.instanceCount;
                    break;
            }
            Test0182.sFld *= (short) -26;
        } while (++i20 < 153);

        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 iArr3 = " + i26 + "," + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test0182.instanceCount Test0182.sFld Test0182.byFld = " + Test0182.instanceCount + "," + Test0182.sFld +
                "," + Test0182.byFld);
        FuzzerUtils.out.println("Test0182.fFld iFld Test0182.bArrFld = " + Float.floatToIntBits(Test0182.fFld) + "," + iFld + "," +
                FuzzerUtils.checkSum(Test0182.bArrFld));
        FuzzerUtils.out.println("Test0182.lArrFld = " + FuzzerUtils.checkSum(Test0182.lArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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