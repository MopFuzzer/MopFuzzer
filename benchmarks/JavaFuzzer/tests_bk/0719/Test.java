// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:11 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3123439533L;
    public static short sFld=10450;
    public static int iFld=-609;
    public byte byFld=90;
    public volatile boolean bFld=false;
    public static volatile short sArrFld[]=new short[N];
    public static long lArrFld[]=new long[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)-31056);
        FuzzerUtils.init(Test.lArrFld, -157L);
        FuzzerUtils.init(Test.fArrFld, 0.423F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i7, int i8) {

        int i9=-127, i10=36, i11=65, i12=1072, i13=-26306, i14=31028, iArr[][]=new int[N][N];
        float f=1.343F, fArr1[]=new float[N];

        FuzzerUtils.init(iArr, 8246);
        FuzzerUtils.init(fArr1, 1.882F);

        for (i9 = 3; i9 < 128; ++i9) {
            iArr = iArr;
            i8 = i10;
        }
        for (i11 = 248; i11 > 1; i11--) {
            i8 = (int)f;
            fArr1[i11 + 1] *= i12;
            i8 += (i11 - i8);
            Test.lArrFld[i11 - 1] += i7;
            i13 = 1;
            while (++i13 < 7) {
                i8 += (i13 + f);
                Test.instanceCount -= i11;
                Test.instanceCount *= 178;
                if (true) continue;
            }
            i12 = i8;
            i10 -= i14;
        }
        vMeth2_check_sum += i7 + i8 + i9 + i10 + i11 + i12 + Float.floatToIntBits(f) + i13 + i14 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public static void vMeth1() {

        int i5=-50122, i6=-1636, i15=17586, i16=2, i17=-32253, i18=17745, i19=249, iArr1[]=new int[N];
        boolean b=false;
        float f1=0.736F, fArr2[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 10L);
        FuzzerUtils.init(iArr1, 21249);
        FuzzerUtils.init(fArr2, -1.978F);

        for (i5 = 5; i5 < 126; i5++) {
            vMeth2(i5, i5);
            iArr1[i5 - 1] = i6;
            Test.instanceCount += i6;
            for (i15 = i5; i15 < 13; i15++) {
                i6 += (((i15 * i5) + i5) - i6);
                Test.sArrFld[i5] -= (short)205;
                for (i17 = 1; i17 < 1; ++i17) {
                    i19 -= (int)-2169333214L;
                    i16 += (int)Test.instanceCount;
                    Test.instanceCount = -6;
                    switch (((i5 % 9) * 5) + 124) {
                    case 139:
                        fArr2[i15] = i6;
                        if (b) continue;
                        i19 -= Test.sFld;
                        break;
                    case 161:
                        i19 |= (int)Test.instanceCount;
                    case 155:
                        i19 += i5;
                    case 145:
                        i16 += i5;
                        break;
                    case 162:
                        f1 += Test.instanceCount;
                        break;
                    case 131:
                        if (b) continue;
                        break;
                    case 147:
                    case 136:
                        Test.lArrFld[i17 + 1] >>= i19;
                        break;
                    case 158:
                        i6 = i19;
                    }
                }
            }
        }
        vMeth1_check_sum += i5 + i6 + i15 + i16 + i17 + i18 + i19 + (b ? 1 : 0) + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2));
    }

    public static void vMeth(long l, int i) {

        int i1=-8, i2=0, i3=9, i4=-111, iArr2[]=new int[N];
        double d=-81.101035;
        boolean b1=true;
        byte by=113;
        float f2=112.342F, fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, 2.103F);
        FuzzerUtils.init(iArr2, 88);

        Test.sArrFld[(i >>> 1) % N] >>= (short)i;
        fArr = FuzzerUtils.float2array(N, (float)13.13F);
        for (i1 = 5; i1 < 162; i1++) {
            for (i3 = 1; i3 < 10; ++i3) {
                switch ((i3 % 6) + 46) {
                case 46:
                    vMeth1();
                    i2 >>>= i;
                    break;
                case 47:
                    Test.instanceCount = (long)d;
                    i4 = -14;
                    i += (i3 * i1);
                    break;
                case 48:
                    iArr2[i3] <<= -59305;
                    fArr[i3][i3 - 1] *= -74;
                case 49:
                    if (b1) {
                        i2 = Test.iFld;
                        if (b1) break;
                    } else if (b1) {
                        iArr2[i1] = 234;
                    }
                    break;
                case 50:
                    by += (byte)i3;
                    break;
                case 51:
                    iArr2[i1 + 1] = -10;
                    break;
                default:
                    f2 -= Test.sFld;
                }
            }
        }
        vMeth_check_sum += l + i + i1 + i2 + i3 + i4 + Double.doubleToLongBits(d) + (b1 ? 1 : 0) + by +
            Float.floatToIntBits(f2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i20=-211, i21=215, i22=-4, i23=100, i24=-36353, i25=110, iArr3[]=new int[N];
        double d1=27.81901;

        FuzzerUtils.init(iArr3, -12911);

        vMeth(Test.instanceCount, Test.iFld);
        for (i20 = 156; i20 > 2; --i20) {
            for (i22 = i20; i22 < 163; ++i22) {
                float f3=38.967F;
                f3 -= Test.instanceCount;
                switch ((i20 % 5) + 64) {
                case 64:
                    i23 -= 6;
                case 65:
                    switch (((i20 % 5) * 5) + 97) {
                    case 103:
                        switch ((i22 % 1) + 74) {
                        case 74:
                            byFld += (byte)i23;
                            f3 = Test.iFld;
                            iArr3 = FuzzerUtils.int1array(N, (int)169);
                            byFld = byFld;
                            break;
                        }
                        for (i24 = 1; i24 > i20; i24--) {
                            i25 = i20;
                            i23 >>= -14;
                            Test.instanceCount = Test.instanceCount;
                            Test.fArrFld[i24 + 1] -= -2.778F;
                            Test.iFld += (int)-97061213L;
                            i23 *= -12;
                            d1 *= d1;
                            if (bFld) {
                                Test.lArrFld[i24] += -49637;
                                i23 = i22;
                                Test.instanceCount -= i24;
                                Test.instanceCount -= -13L;
                            } else if (bFld) {
                                i25 <<= byFld;
                            }
                            iArr3[i24] += -84;
                            Test.instanceCount <<= i23;
                        }
                        Test.instanceCount *= -126;
                        break;
                    case 106:
                        i23 += (((i22 * i21) + f3) - i23);
                        break;
                    case 115:
                        i21 = (int)201L;
                        break;
                    case 105:
                    case 119:
                        i21 |= Test.iFld;
                    default:
                        Test.fArrFld[i20 + 1] += -87;
                    }
                case 66:
                    Test.instanceCount -= 6L;
                case 67:
                    i21 += (i22 * i22);
                    break;
                case 68:
                    Test.instanceCount -= i22;
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("d1 iArr3 = " + Double.doubleToLongBits(d1) + "," + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.iFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Test.iFld);
        FuzzerUtils.out.println("byFld bFld Test.sArrFld = " + byFld + "," + (bFld ? 1 : 0) + "," +
            FuzzerUtils.checkSum(Test.sArrFld));
        FuzzerUtils.out.println("Test.lArrFld Test.fArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

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
