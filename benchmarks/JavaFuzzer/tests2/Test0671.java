// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:43 2023
public class Test0671 {

    public static final int N = 400;

    public static volatile long instanceCount=-277908183L;
    public static float fFld=1.800F;
    public byte byFld=118;
    public static boolean bFld=true;
    public double dFld=0.127592;
    public static long[] lArrFld =new long[N];
    public static volatile int[][] iArrFld =new int[N][N];

    static {
        FuzzerUtils.init(Test0671.lArrFld, 14L);
        FuzzerUtils.init(Test0671.iArrFld, 2);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i5, float f, int i6) {

        int i7=-235;
        int i8=6;
        int i9=118;
        int i10=109;
        int i11=3;
        int[] iArr =new int[N];
        boolean b=true;

        FuzzerUtils.init(iArr, 77);

        Test0671.instanceCount <<= i5;
        i7 = 1;
        while (++i7 < 284) {
            Test0671.instanceCount *= i7;
            for (i8 = i7; i8 < 6; i8++) {
                switch ((i7 % 3) + 21) {
                case 21:
                    if (b) continue;
                    i9 += (int) Test0671.instanceCount;
                    i5 = i8;
                    break;
                case 22:
                    Test0671.instanceCount += i8;
                    f += (i8 * i8);
                    for (i10 = 1; i10 < 1; i10++) {
                        try {
                            iArr[i7] = (45957 % i6);
                            i6 = (i9 % -17770);
                            iArr[i10 - 1] = (i9 % iArr[i7]);
                        } catch (ArithmeticException a_e) {}
                        if (b) continue;
                        i6 = i8;
                        iArr[i10 - 1] = i9;
                    }
                case 23:
                    iArr[i8 - 1] = (int)1.482F;
                    break;
                default:
                    iArr = FuzzerUtils.int1array(N, (int)-2147);
                }
            }
        }
        vMeth2_check_sum += i5 + Float.floatToIntBits(f) + i6 + i7 + i8 + i9 + (b ? 1 : 0) + i10 + i11 +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(int i3, long l) {

        double d=-1.125078;
        int i4=204;
        int i12=-242;
        int i13=137;
        int i14=14;
        int i15=26;
        int i16=-8;
        int[] iArr1 =new int[N];
        float f1=-53.987F;
        byte by1=-30;
        short s1=-12998;

        FuzzerUtils.init(iArr1, -163);

        for (d = 133; d > 7; --d) {
            i4 = (int) (Test0671.instanceCount + i3);
        }
        i4 = (int) (Test0671.instanceCount++);
        vMeth2(i3, f1, i4);
        i4 = i3;
        i12 = 1;
        while (++i12 < 340) {
            i3 %= (int)((long)(f1) | 1);
            i3 |= by1;
            for (i13 = 5; i13 > 1; i13 -= 2) {
                for (i15 = 1; i15 < 3; ++i15) {
                    i4 = (int)1.499F;
                    Test0671.instanceCount += (i15 - f1);
                    i14 *= (int) Test0671.instanceCount;
                    iArr1[i13] = i13;
                    i16 = s1;
                }
            }
        }
        vMeth1_check_sum += i3 + l + Double.doubleToLongBits(d) + i4 + Float.floatToIntBits(f1) + i12 + by1 + i13 + i14
            + i15 + i16 + s1 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i1, int i2) {

        byte by=-84;
        int i17=-222, i18=3, i19=9, i20=24, i21=-7, i22=13;
        double d1=35.11437;
        boolean b1=false;
        short s2=-1284;

        by *= (byte) (Test0671.instanceCount++);
        vMeth1(i2, Test0671.instanceCount);
        Test0671.lArrFld[(i1 >>> 1) % N] = i2;
        for (i17 = 3; i17 < 294; i17++) {
            if (i1 != 0) {
                vMeth_check_sum += i1 + i2 + by + i17 + i18 + i19 + i20 + i21 + i22 + Double.doubleToLongBits(d1) + (b1
                    ? 1 : 0) + s2;
                return;
            }
            for (i19 = 6; i19 > 1; i19--) {
                for (i21 = 1; i21 < 2; ++i21) {
                    d1 -= i17;
                    i20 -= i18;
                    d1 += Test0671.instanceCount;
                    if (b1) break;
                    if (b1) break;
                    i22 = (int)d1;
                    Test0671.fFld -= s2;
                    if (b1) continue;
                }
            }
        }
        vMeth_check_sum += i1 + i2 + by + i17 + i18 + i19 + i20 + i21 + i22 + Double.doubleToLongBits(d1) + (b1 ? 1 :
            0) + s2;
    }

    public void mainTest(String[] strArr1) {

        short s=-25365, s3=13681;
        int i=-139, i23=-38, i24=38, i25=-1, i26=7212, i27=-57, i28=-1808, i29=12, i30=17279, i31=13, i32=11;
        long l1=26731L;
        long[] lArr =new long[N];
        double[][] dArr =new double[N][N];
        byte[] byArr =new byte[N];
        float[] fArr =new float[N];

        FuzzerUtils.init(lArr, -2738013630L);
        FuzzerUtils.init(dArr, -44.28647);
        FuzzerUtils.init(byArr, (byte)-65);
        FuzzerUtils.init(fArr, 2.363F);

        s = (short)(++i);
        lArr = (lArr = (lArr = lArr));
        vMeth(i, i);
        dArr[(i >>> 1) % N][(i >>> 1) % N] = Test0671.instanceCount;
        Test0671.iArrFld[(i >>> 1) % N][(i >>> 1) % N] = i;
        s ^= (short)i;
        i *= i;
        for (i23 = 19; i23 < 314; i23++) {
            i24 = i23;
            for (i25 = 3; i25 < 85; i25++) {
                Test0671.lArrFld[i25 - 1] = i25;
                byArr[i23 + 1] += (byte) Test0671.instanceCount;
                s3 >>>= s3;
                byFld *= (byte) Test0671.fFld;
                i26 += (i25 * i25);
                Test0671.instanceCount = (long) Test0671.fFld;
            }
            i24 += (((i23 * i23) + Test0671.fFld) - i26);
        }
        Test0671.instanceCount |= i;
        Test0671.instanceCount = -4;
        for (i27 = 19; 394 > i27; i27++) {
            for (i29 = i27; i29 < 67; i29++) {
                switch (i29 + 94) {
                case 94:
                    for (i31 = 1; i31 < 1; ++i31) {
                        i24 += i24;
                        i30 -= (int) Test0671.fFld;
                        if (Test0671.bFld) continue;
                        Test0671.instanceCount = (long) dFld;
                        i32 -= (int) Test0671.instanceCount;
                        i26 <<= i24;
                        Test0671.instanceCount = i31;
                    }
                    break;
                case 95:
                    Test0671.fFld = 145L;
                case 96:
                    Test0671.iArrFld[i27 + 1][i27 - 1] = (int) dFld;
                    break;
                case 97:
                    i24 = i25;
                case 98:
                    i30 >>= 60898;
                    break;
                case 99:
                    Test0671.iArrFld = Test0671.iArrFld;
                    break;
                case 100:
                    i24 += i29;
                case 101:
                    i24 = (int) Test0671.instanceCount;
                case 102:
                    byArr[i29] = (byte)i30;
                case 103:
                    i30 -= i;
                    break;
                case 104:
                    i28 -= i26;
                    break;
                case 105:
                    Test0671.fFld = (float) dFld;
                    break;
                case 106:
                    if (Test0671.bFld) continue;
                    break;
                case 107:
                    s3 <<= (short)115;
                    break;
                case 108:
                    i28 -= (int) Test0671.fFld;
                case 109:
                    Test0671.iArrFld[i29 + 1][i29 + 1] *= (int) 2.59816;
                case 110:
                    if (Test0671.bFld) continue;
                    break;
                case 111:
                    s -= (short)i24;
                case 112:
                    i30 += i29;
                    break;
                case 113:
                    i24 += 14;
                    break;
                case 114:
                    dFld = dFld;
                    break;
                case 115:
                    i26 = 1;
                case 116:
                    Test0671.lArrFld[i27 + 1] >>= i26;
                    break;
                case 117:
                    i24 += (((i29 * i) + byFld) - i);
                case 118:
                case 119:
                    Test0671.iArrFld[i29][i27 + 1] = i23;
                    break;
                case 120:
                    i32 *= i23;
                    break;
                case 121:
                    i26 ^= i30;
                    break;
                case 122:
                    Test0671.instanceCount += i31;
                case 123:
                case 124:
                    Test0671.fFld *= i23;
                    break;
                case 125:
                    i28 += (-49505 + (i29 * i29));
                case 126:
                    Test0671.instanceCount = i28;
                    break;
                case 127:
                    i28 >>= i26;
                case 128:
                    i26 = i23;
                    break;
                case 129:
                    i26 <<= i;
                case 130:
                    Test0671.instanceCount += (i29 * i31);
                    break;
                case 131:
                    Test0671.lArrFld[i29] = -14617L;
                    break;
                case 132:
                    fArr[i27 + 1] -= i28;
                case 133:
                case 134:
                case 135:
                    Test0671.fFld -= s3;
                    break;
                case 136:
                case 137:
                    i30 -= (int)dFld;
                    break;
                case 138:
                    Test0671.iArrFld[i29 + 1][i27] ^= i28;
                    break;
                case 139:
                    i32 >>= (int) Test0671.instanceCount;
                    break;
                case 140:
                    if (true) continue;
                    break;
                case 141:
                    dFld *= Test0671.instanceCount;
                    break;
                case 142:
                    i += (-5 + (i29 * i29));
                    break;
                case 143:
                    Test0671.fFld = -47523;
                    break;
                case 144:
                    i24 += (i29 | (long) Test0671.fFld);
                    break;
                case 145:
                    Test0671.iArrFld[i29 + 1][i27 - 1] -= i26;
                    break;
                case 146:
                    Test0671.fFld += Test0671.fFld;
                    break;
                case 147:
                case 148:
                case 149:
                    dFld -= Test0671.instanceCount;
                case 150:
                    Test0671.iArrFld[i29][i27 + 1] *= (int) dFld;
                    break;
                case 151:
                    Test0671.instanceCount = i29;
                    break;
                case 152:
                    Test0671.fFld = -1290;
                    break;
                case 153:
                case 154:
                    s += (short)dFld;
                    break;
                case 155:
                    Test0671.iArrFld[i27 + 1][i29 + 1] -= i24;
                    break;
                case 156:
                    s += (short)2.35160;
                    break;
                case 157:
                case 158:
                    if (Test0671.bFld) continue;
                    break;
                case 159:
                    Test0671.iArrFld[i27 - 1][i27 - 1] += i24;
                case 160:
                    Test0671.iArrFld[i27 - 1][i29 + 1] *= i26;
                    break;
                case 161:
                case 162:
                    Test0671.instanceCount = l1;
                    break;
                case 163:
                    dFld = l1;
                    break;
                default:
                    if (Test0671.bFld) break;
                }
            }
        }

        FuzzerUtils.out.println("s i i23 = " + s + "," + i + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("s3 i27 i28 = " + s3 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 i30 i31 = " + i29 + "," + i30 + "," + i31);
        FuzzerUtils.out.println("i32 l1 lArr = " + i32 + "," + l1 + "," + FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("dArr byArr fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + "," +
            FuzzerUtils.checkSum(byArr) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0671.instanceCount Test0671.fFld byFld = " + Test0671.instanceCount + "," +
                Float.floatToIntBits(Test0671.fFld) + "," + byFld);
        FuzzerUtils.out.println("Test0671.bFld dFld Test0671.lArrFld = " + (Test0671.bFld ? 1 : 0) + "," +
                Double.doubleToLongBits(dFld) + "," + FuzzerUtils.checkSum(Test0671.lArrFld));
        FuzzerUtils.out.println("Test0671.iArrFld = " + FuzzerUtils.checkSum(Test0671.iArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0671 _instance = new Test0671();
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
