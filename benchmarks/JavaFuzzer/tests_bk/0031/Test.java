// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:53 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=8386393901467860530L;
    public static boolean bFld=true;
    public static short sFld=15097;
    public double dFld=2.75182;
    public float fFld=55.716F;
    public static int iFld=-26376;
    public volatile int iArrFld[]=new int[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l, long l1) {

        int i10=5, i11=-25, i12=158, i13=217, i14=-19576, i15=-52393, iArr[]=new int[N];
        float f=-2.267F, f1=0.159F;

        FuzzerUtils.init(iArr, 6);

        Test.instanceCount *= (long)83.43561;
        for (i10 = 9; 148 > i10; ++i10) {
            i12 = 1;
            while (++i12 < 11) {
                for (i13 = 1; 1 > i13; i13++) {
                    if (Test.bFld) break;
                    i11 = i12;
                    f += i13;
                    i14 = i12;
                    i11 -= i10;
                    i11 = -61;
                    Test.instanceCount = i14;
                    iArr = iArr;
                }
                for (f1 = 1; f1 > 1; f1 -= 2) {
                    l1 += (long)f1;
                    i11 = i15;
                }
            }
        }
        vMeth2_check_sum += l + l1 + i10 + i11 + i12 + i13 + i14 + Float.floatToIntBits(f) + Float.floatToIntBits(f1) +
            i15 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(int i7, int i8) {

        int i9=-34843, i16=6, i17=53008, i18=-6413, i19=-63167, i20=241, i21=0, i22=-2, i23=-10, iArr1[]=new int[N];
        long l2=2975887931892632131L, l3=1041669572L, lArr[]=new long[N];
        double d=-2.476;
        byte by=-117, byArr[]=new byte[N];
        float fArr[]=new float[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(lArr, 182L);
        FuzzerUtils.init(iArr1, -28851);
        FuzzerUtils.init(byArr, (byte)102);
        FuzzerUtils.init(fArr, -2.3F);
        FuzzerUtils.init(sArr, (short)1754);

        i9 = 1;
        do {
            vMeth2(Test.instanceCount, l2);
            i7 += (((i9 * Test.instanceCount) + i8) - i7);
            for (i16 = 7; i16 > i9; --i16) {
                i17 -= (int)l2;
                i17 += i16;
                for (i18 = 1; i18 < 1; ++i18) {
                    i8 += (17533 + (i18 * i18));
                    i20 *= i19;
                    i19 = -5003;
                }
            }
            for (i21 = 1; i21 < 7; ++i21) {
                float f2=-122.298F;
                switch ((i21 * 5) + 72) {
                case 88:
                    i23 = 2;
                    while (--i23 > 0) {
                        i7 = 12;
                        i7 += (int)l2;
                    }
                case 312:
                    l3 += i21;
                case 405:
                    lArr[i9 + 1] += i17;
                    break;
                case 252:
                    if (Test.bFld) continue;
                    break;
                case 172:
                case 309:
                    i7 = i20;
                case 380:
                    i8 %= (int)(i20 | 1);
                    break;
                case 119:
                    l3 = Test.instanceCount;
                    break;
                case 232:
                    Test.sFld += (short)Test.instanceCount;
                case 371:
                    l2 *= (long)d;
                    break;
                case 378:
                    lArr[i9 - 1] += (long)1.546F;
                    break;
                case 167:
                    i22 = (int)-123.175F;
                    break;
                case 317:
                    Test.bFld = Test.bFld;
                    break;
                case 117:
                    Test.bFld = true;
                    break;
                case 257:
                case 217:
                    i7 = 39831;
                    break;
                case 314:
                    iArr1[i21 - 1] = (int)d;
                    break;
                case 184:
                    f2 += i17;
                    break;
                case 381:
                    f2 += i20;
                    break;
                case 264:
                    byArr = byArr;
                case 301:
                    f2 -= i17;
                    break;
                case 372:
                    l2 += (((i21 * Test.sFld) + i18) - i19);
                case 204:
                    fArr[i21] = i17;
                case 228:
                case 337:
                    i17 *= i16;
                    break;
                case 194:
                    if (Test.bFld) break;
                case 349:
                    fArr[i9] = -8378640361069433448L;
                case 102:
                case 277:
                    i17 = by;
                    break;
                case 370:
                    sArr[i21 - 1] *= (short)l3;
                    break;
                case 344:
                    i17 -= -14;
                case 379:
                    i17 <<= (int)l3;
                    break;
                case 141:
                    l2 = i9;
                    break;
                case 351:
                    iArr1[i21] += i7;
                case 210:
                    l2 += (2 + (i21 * i21));
                    break;
                case 265:
                    i22 -= -195;
                    break;
                case 392:
                    d *= i16;
                    break;
                case 364:
                    Test.instanceCount += 216;
                case 390:
                    l3 >>= i21;
                case 97:
                    Test.instanceCount += (i21 * Test.sFld);
                    break;
                case 374:
                    Test.instanceCount = l3;
                    break;
                case 105:
                    Test.sFld *= (short)i22;
                case 350:
                    l3 = 64;
                case 208:
                    if (i8 != 0) {
                        vMeth1_check_sum += i7 + i8 + i9 + l2 + i16 + i17 + i18 + i19 + i20 + i21 + i22 + i23 + l3 +
                            Double.doubleToLongBits(d) + by + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1)
                            + FuzzerUtils.checkSum(byArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
                            FuzzerUtils.checkSum(sArr);
                        return;
                    }
                case 369:
                case 235:
                    fArr[i21 - 1] = l3;
                    break;
                case 101:
                    i17 >>>= -197;
                case 134:
                    Test.instanceCount >>= i8;
                case 366:
                    l2 += (((i21 * l3) + i21) - i22);
                    break;
                case 268:
                    iArr1 = iArr1;
                case 333:
                    iArr1[i21 + 1] -= i8;
                case 298:
                    iArr1[i9] -= -2;
                case 183:
                    i19 += (((i21 * f2) + i20) - i19);
                    break;
                case 213:
                    i17 <<= i8;
                    break;
                case 89:
                    i22 = i19;
                    break;
                case 385:
                    fArr[i9 - 1] = -20062;
                case 393:
                    fArr[i21 + 1] %= (i9 | 1);
                    break;
                case 227:
                    i22 -= (int)l2;
                case 179:
                    i20 -= i8;
                    break;
                case 304:
                    iArr1[i9 + 1] = i9;
                    break;
                case 216:
                    sArr[i21] -= (short)-51208;
                case 329:
                    i8 = i19;
                    break;
                case 177:
                    iArr1[i21] -= i20;
                    break;
                case 145:
                    i17 += (i21 * i21);
                case 273:
                    i22 >>= i19;
                    break;
                case 137:
                    i22 = -32251;
                    break;
                case 79:
                    iArr1[i9 + 1] = (int)l2;
                    break;
                case 287:
                    by %= (byte)(i7 | 1);
                case 95:
                    try {
                        iArr1[i21 + 1] = (i23 % 49997);
                        iArr1[i9 + 1] = (i19 / i23);
                        i19 = (i22 % -42931);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 231:
                    i22 >>>= i21;
                    break;
                }
            }
        } while (++i9 < 222);
        vMeth1_check_sum += i7 + i8 + i9 + l2 + i16 + i17 + i18 + i19 + i20 + i21 + i22 + i23 + l3 +
            Double.doubleToLongBits(d) + by + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(byArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth(int i, int i1, int i2) {

        int i3=-148, i4=-40379, i5=217, i6=27456, i24=26898, i25=-191;
        boolean b=true;
        float f3=-1.650F;

        for (i3 = 4; 378 > i3; i3++) {
            if (true && b) break;
            for (i5 = 5; i5 > 1; i5 -= 2) {
                if (b) break;
                vMeth1(56803, -55815);
            }
            i6 += (i3 + f3);
            Test.instanceCount += i3;
            f3 -= i1;
            if (b) {
                Test.instanceCount -= i5;
                for (i24 = 1; i24 < 5; ++i24) {
                    if (Test.bFld) {
                        if (i3 != 0) {
                            vMeth_check_sum += i + i1 + i2 + i3 + i4 + (b ? 1 : 0) + i5 + i6 + Float.floatToIntBits(f3)
                                + i24 + i25;
                            return;
                        }
                        Test.sFld *= (short)i25;
                        i2 += (((i24 * Test.instanceCount) + f3) - Test.instanceCount);
                    } else if (Test.bFld) {
                        i6 = i1;
                    } else {
                        i6 -= i25;
                    }
                }
            } else {
                Test.sFld -= (short)i5;
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i4 + (b ? 1 : 0) + i5 + i6 + Float.floatToIntBits(f3) + i24 + i25;
    }

    public void mainTest(String[] strArr1) {

        int i26=-4, i27=-13193, i28=-22300, i29=53, i30=-56773, i31=46, i32=-26610, i33=176, i34=93, i35=133, i36=-7,
            iArr2[]=new int[N];
        byte byArr1[]=new byte[N];

        FuzzerUtils.init(byArr1, (byte)15);
        FuzzerUtils.init(iArr2, 47050);

        vMeth(i26, 5, i26);
        for (i27 = 6; i27 < 351; i27++) {
            i26 = (int)dFld;
            i26 *= i26;
            Test.instanceCount = 3;
            fFld += i27;
            for (i29 = 4; i29 < 73; i29++) {
                Test.instanceCount >>= Test.instanceCount;
                byArr1[i27 - 1] ^= (byte)i27;
                iArrFld[i29] <<= i29;
                Test.instanceCount = i29;
                i28 -= (int)fFld;
                i26 += (i29 ^ i27);
                i28 &= i30;
                for (i31 = 1; i31 < 2; i31++) {
                    if (Test.bFld) break;
                    iArr2[i27] <<= (int)Test.instanceCount;
                    Test.instanceCount += (((i31 * i29) + Test.instanceCount) - i31);
                    dFld -= i27;
                    i28 = (int)Test.instanceCount;
                }
            }
            dFld *= i28;
            for (i33 = 2; 73 > i33; ++i33) {
                i30 = i31;
                i28 += i31;
            }
            i34 *= (int)6598145973845292081L;
            Test.instanceCount += (((i27 * Test.iFld) + Test.instanceCount) - i27);
        }
        i26 >>>= (int)Test.instanceCount;
        for (i35 = 3; i35 < 243; i35++) {
            i26 <<= i29;
            iArrFld[i35 - 1] = i28;
        }

        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 i30 i31 = " + i29 + "," + i30 + "," + i31);
        FuzzerUtils.out.println("i32 i33 i34 = " + i32 + "," + i33 + "," + i34);
        FuzzerUtils.out.println("i35 i36 byArr1 = " + i35 + "," + i36 + "," + FuzzerUtils.checkSum(byArr1));
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.sFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Test.sFld);
        FuzzerUtils.out.println("dFld fFld Test.iFld = " + Double.doubleToLongBits(dFld) + "," +
            Float.floatToIntBits(fFld) + "," + Test.iFld);
        FuzzerUtils.out.println("iArrFld = " + FuzzerUtils.checkSum(iArrFld));

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