// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:15 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5L;
    public float fFld=-1.276F;
    public static boolean bFld=false;
    public static float fFld1=21.545F;
    public static int iFld=3;
    public static long lFld=-3781375470L;
    public static int iArrFld[]=new int[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -12);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i5, int i6, int i7) {

        long l1=8L, l2=-173L, lArr[]=new long[N];
        int i8=9, i9=-6, i10=5;
        short s1=31155;
        float f1=64.936F, f2=-1.851F;
        double d=0.11485;
        byte by1=58, byArr[][]=new byte[N][N];

        FuzzerUtils.init(byArr, (byte)123);
        FuzzerUtils.init(lArr, -35680L);

        switch ((((i7 >>> 1) % 5) * 5) + 8) {
        case 22:
            Test.iArrFld[(i5 >>> 1) % N] += (int)l1;
            for (l2 = 10; l2 < 346; l2++) {
                l1 = i5;
                s1 += (short)(((l2 * i6) + s1) - i5);
                i9 = 1;
                do {
                    f1 += l1;
                    d += Test.instanceCount;
                    i7 >>= i9;
                    byArr[i9][i9 + 1] = (byte)i8;
                    for (f2 = 1; f2 < 1; ++f2) {
                        i10 = (int)Test.instanceCount;
                    }
                    by1 <<= by1;
                } while (++i9 < 5);
                l1 = s1;
                if (true) break;
            }
            break;
        case 14:
            Test.instanceCount -= l1;
            break;
        case 10:
            i6 = -159;
            break;
        case 15:
            lArr[(i6 >>> 1) % N] <<= -34896;
        case 24:
            i5 >>= -58002;
            break;
        }
        long meth_res = i5 + i6 + i7 + l1 + l2 + i8 + s1 + i9 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) +
            Float.floatToIntBits(f2) + i10 + by1 + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i2=8, i3=-25561, i4=98, i11=-211, i12=13, i13=5;
        float f=-77.679F, f3=34.298F;
        boolean b=false;
        long l3=-7L;

        for (i2 = 4; i2 < 171; i2++) {
            Test.iArrFld[i2 - 1] = (int)((++i3) - (Test.iArrFld[i2 - 1] -= (int)(1.1020F - (i2 - f))));
            i3 *= (((i4--) * i3) - Integer.reverseBytes(iMeth(i2, i3, i4)));
            i4 = i3;
            i4 += (int)(0.294F + (i2 * i2));
        }
        i4 = (int)Test.instanceCount;
        for (f3 = 3; f3 < 143; f3++) {
            i12 = 1;
            do {
                if (b) break;
                for (l3 = 1; l3 < 1; ++l3) {
                    i3 >>= (int)Test.instanceCount;
                    if (b) {
                        Test.iArrFld[(int)(f3)] += (int)Test.instanceCount;
                        if (b) continue;
                    } else if (b) {
                        Test.instanceCount += (616384759931495553L + (l3 * l3));
                    } else if (b) {
                        f -= i4;
                    } else {
                        i4 = (int)l3;
                        vMeth_check_sum += i2 + i3 + Float.floatToIntBits(f) + i4 + Float.floatToIntBits(f3) + i11 +
                            i12 + (b ? 1 : 0) + l3 + i13;
                        return;
                    }
                }
            } while (++i12 < 11);
        }
        vMeth_check_sum += i2 + i3 + Float.floatToIntBits(f) + i4 + Float.floatToIntBits(f3) + i11 + i12 + (b ? 1 : 0)
            + l3 + i13;
    }

    public static float fMeth() {

        int i14=13, i15=7, i16=248, i17=12, i18=12, i19=-44123;
        byte by2=85;
        short s2=16758;
        long l4=3227566543832505563L, l5=-3913194190981076286L, lArr1[]=new long[N];
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, -2.292F);
        FuzzerUtils.init(lArr1, 7955946203349611991L);

        vMeth();
        for (i14 = 14; i14 < 326; ++i14) {
            for (i16 = i14; 5 > i16; ++i16) {
                double d1=45.72084;
                i17 += (50020 + (i16 * i16));
                Test.instanceCount <<= -207;
                d1 += by2;
                for (i18 = i16; i18 < 1; i18++) {
                    Test.bFld = Test.bFld;
                    i19 = (int)Test.instanceCount;
                    fArr[i14][i14] *= i19;
                    i17 += i15;
                    switch ((i16 * 5) + 86) {
                    case 367:
                        Test.fFld1 *= 918056059535383100L;
                        Test.iArrFld[i14 + 1] |= i19;
                        break;
                    case 242:
                        i15 = i15;
                        break;
                    case 294:
                        i15 += (i18 | i18);
                    case 141:
                        d1 = i17;
                        break;
                    case 115:
                        i17 += i15;
                        break;
                    case 223:
                        Test.instanceCount >>= i14;
                        break;
                    case 263:
                        i17 <<= 46238;
                        break;
                    case 427:
                        i19 += i17;
                    case 214:
                        i19 += (-11 + (i18 * i18));
                        break;
                    case 385:
                        i17 = (int)Test.instanceCount;
                        break;
                    case 203:
                        i19 = (int)Test.instanceCount;
                    case 188:
                        i15 <<= 204;
                        break;
                    case 227:
                        Test.iArrFld[i16 + 1] *= i14;
                        break;
                    case 289:
                        s2 >>= (short)i17;
                        break;
                    case 244:
                        i19 <<= i15;
                        break;
                    case 149:
                        Test.bFld = Test.bFld;
                    case 375:
                        Test.iArrFld[i18 + 1] += i14;
                    case 281:
                        i15 |= (int)Test.instanceCount;
                        break;
                    case 351:
                        i15 += (((i18 * Test.fFld1) + Test.instanceCount) - s2);
                    case 101:
                        Test.iArrFld[i14 + 1] &= (int)Test.instanceCount;
                    case 400:
                        Test.instanceCount &= 11L;
                    case 295:
                        i15 = (int)-49.538F;
                        break;
                    case 152:
                        i17 += (int)(200L + (i18 * i18));
                        break;
                    case 330:
                        if (i14 != 0) {
                        }
                        break;
                    case 268:
                        i19 -= by2;
                        break;
                    case 285:
                        if (Test.bFld) break;
                        break;
                    case 304:
                        i15 += i18;
                    case 204:
                        i17 += (((i18 * i19) + Test.instanceCount) - i14);
                        break;
                    case 150:
                        Test.fFld1 = l4;
                        break;
                    case 436:
                        Test.instanceCount += i18;
                        break;
                    case 103:
                        l4 = (long)Test.fFld1;
                        break;
                    case 250:
                        Test.iArrFld[i18 + 1] -= by2;
                        break;
                    case 368:
                        i19 += i15;
                        break;
                    case 302:
                        s2 <<= by2;
                    case 129:
                        Test.instanceCount += (((i18 * by2) + Test.instanceCount) - i18);
                        break;
                    case 112:
                        i17 += i19;
                        break;
                    case 125:
                        i15 += i18;
                        break;
                    case 257:
                        i15 = (int)Test.fFld1;
                        break;
                    case 356:
                        i15 *= i18;
                        break;
                    case 100:
                        i19 += i18;
                        break;
                    case 99:
                        Test.iArrFld[i16 - 1] -= (int)l4;
                        break;
                    case 340:
                        i19 *= i15;
                        break;
                    case 306:
                        Test.instanceCount = i17;
                        break;
                    case 94:
                        i15 = i18;
                        break;
                    case 247:
                        i17 -= i18;
                        break;
                    case 182:
                        i15 += i18;
                        break;
                    case 132:
                        l4 += (i18 - i17);
                        break;
                    case 406:
                        i17 -= (int)1.759F;
                    case 348:
                        i17 = (int)l4;
                        break;
                    case 329:
                        i15 += i18;
                        break;
                    case 113:
                        i15 |= i14;
                        break;
                    case 364:
                        i15 *= (int)l4;
                        break;
                    case 236:
                        Test.bArrFld[i18 + 1] = Test.bFld;
                        break;
                    case 267:
                        d1 *= i19;
                    case 336:
                        lArr1[i14 - 1] = (long)Test.fFld1;
                        break;
                    case 381:
                        i17 += i16;
                        break;
                    case 256:
                        i19 -= i17;
                    case 126:
                        i15 += (((i18 * i19) + i15) - l4);
                        break;
                    case 278:
                        d1 -= l4;
                        break;
                    case 286:
                        by2 += (byte)i16;
                        break;
                    case 305:
                        l5 += i17;
                        break;
                    case 360:
                        l4 = (long)35.97654;
                        break;
                    case 239:
                        Test.iFld = i18;
                        break;
                    case 181:
                        Test.iFld += (int)d1;
                    case 198:
                        i15 = 57;
                        break;
                    case 349:
                        i17 += (int)69.815F;
                        break;
                    case 117:
                        i15 -= 8;
                        break;
                    case 344:
                        l5 = s2;
                        break;
                    case 235:
                        i19 = (int)l5;
                        break;
                    case 266:
                        if (Test.bFld) break;
                    }
                }
            }
        }
        long meth_res = i14 + i15 + i16 + i17 + by2 + i18 + i19 + s2 + l4 + l5 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=6488, i1=-10, i20=-56966, i21=-17701, i22=13, i23=143, iArr[][]=new int[N][N];
        short s=-18145;
        long l=32351L;
        byte by=101;
        boolean b1=false;
        float fArr1[]=new float[N];

        FuzzerUtils.init(iArr, -27135);
        FuzzerUtils.init(fArr1, 85.1007F);

        i <<= (int)(((Test.instanceCount + i) - (fFld - -1582415176L)) + i);
        i = (int)((++i) + ((i - Test.instanceCount) + (s++)));
        for (l = 3; l < 226; l++) {
            Test.instanceCount += (by--);
            i += (int)((Test.instanceCount++) - fMeth());
            for (i20 = 4; i20 < 113; i20++) {
                switch (((i20 % 5) * 5) + 58) {
                case 73:
                    for (i22 = 1; i22 < 2; ++i22) {
                        Test.iArrFld[i20 - 1] += (int)fFld;
                        Test.iFld += -25311;
                        iArr[i22 + 1][i20] >>>= (int)-4342855616705636603L;
                        i21 += (i22 * i22);
                        Test.bFld = Test.bFld;
                        i21 += (((i22 * i21) + i1) - i1);
                        Test.iFld += (-20 + (i22 * i22));
                        switch ((i22 % 6) + 93) {
                        case 93:
                            Test.instanceCount <<= Test.instanceCount;
                            Test.instanceCount += -39;
                            i += by;
                            break;
                        case 94:
                            s = (short)i23;
                            Test.instanceCount -= Test.instanceCount;
                            Test.iFld -= Test.iFld;
                        case 95:
                            i -= i21;
                            switch ((i22 % 3) + 58) {
                            case 58:
                                i1 += (i22 * i22);
                                if (Test.bFld) continue;
                                break;
                            case 59:
                            case 60:
                                Test.iFld += i;
                                break;
                            }
                            Test.instanceCount += Test.lFld;
                            i1 *= i20;
                            break;
                        case 96:
                            fArr1[i22] -= i21;
                            break;
                        case 97:
                            s = (short)196L;
                        case 98:
                            i21 *= (int)Test.instanceCount;
                        }
                    }
                    break;
                case 77:
                    Test.iArrFld[(int)(l)] = (int)fFld;
                    break;
                case 64:
                    b1 = b1;
                    break;
                case 65:
                    i23 += i1;
                case 59:
                    try {
                        i = (iArr[(int)(l + 1)][(int)(l + 1)] % 36048);
                        i = (58450 / iArr[(int)(l)][i20]);
                        i = (iArr[i20 + 1][(int)(l - 1)] % -59266);
                    } catch (ArithmeticException a_e) {}
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i s l = " + i + "," + s + "," + l);
        FuzzerUtils.out.println("i1 by i20 = " + i1 + "," + by + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("b1 iArr fArr1 = " + (b1 ? 1 : 0) + "," + FuzzerUtils.checkSum(iArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test.instanceCount fFld Test.bFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(fFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.fFld1 Test.iFld Test.lFld = " + Float.floatToIntBits(Test.fFld1) + "," +
            Test.iFld + "," + Test.lFld);
        FuzzerUtils.out.println("Test.iArrFld Test.bArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(Test.bArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
