// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:17 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=36278L;
    public static volatile float fFld=-80.760F;
    public static int iFld=-1;
    public static int iFld1=-4;
    public double dFld=1.122070;
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 0.886F);
    }

    public static long vMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;

    public static short sMeth(int i15, int i16) {

        int i17=-61066, i18=14, i19=627, i20=-18480, i21=-770, i22=-57617, iArr1[][]=new int[N][N];
        double d1=0.7760, d2=-125.121618;
        byte by=-91, byArr[]=new byte[N];
        short s1=25620;
        long lArr1[]=new long[N];

        FuzzerUtils.init(byArr, (byte)-4);
        FuzzerUtils.init(lArr1, -31302L);
        FuzzerUtils.init(iArr1, 5);

        for (i17 = 18; 395 > i17; i17++) {
            switch (((i16 >>> 1) % 4) + 60) {
            case 60:
                for (d1 = 1; d1 < 4; d1++) {
                    i16 = i17;
                    by -= (byte)i16;
                }
                byArr = byArr;
                break;
            case 61:
                switch (((i19 >>> 1) % 1) + 5) {
                case 5:
                    s1 += (short)i17;
                    for (i20 = 1; i20 < 4; ++i20) {
                        i22 = 1;
                        do {
                            Test.instanceCount += -3;
                            i19 <<= s1;
                            i16 *= i16;
                            i16 = i22;
                            d2 = Test.fFld;
                        } while (++i22 < 2);
                    }
                    break;
                default:
                    lArr1[i17 - 1] -= 42894;
                }
            case 62:
                iArr1[i17 + 1][i17] -= i15;
                break;
            case 63:
                Test.instanceCount -= by;
                break;
            }
        }
        long meth_res = i15 + i16 + i17 + i18 + Double.doubleToLongBits(d1) + i19 + by + s1 + i20 + i21 + i22 +
            Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr1) +
            FuzzerUtils.checkSum(iArr1);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static byte byMeth(float f1, int i11, int i12) {

        int i13=-51433, i14=-3, i23=-13, i24=-8, i25=-11, i26=-37651, iArr2[]=new int[N];
        short s=-25849;
        boolean b=true;
        long lArr2[]=new long[N];

        FuzzerUtils.init(iArr2, 2);
        FuzzerUtils.init(lArr2, -2629856779L);

        for (i13 = 1; i13 < 273; ++i13) {
            i11 = (int)((s - (i12 + Test.instanceCount)) * (Test.fArrFld[i13] * sMeth(Test.iFld, Test.iFld)));
            Test.instanceCount = i12;
            for (i23 = 1; i23 < 6; ++i23) {
                iArr2 = FuzzerUtils.int1array(N, (int)1);
                if (b) continue;
                f1 += i12;
            }
            for (i25 = 1; i25 < 6; i25++) {
                Test.instanceCount -= Test.instanceCount;
                Test.iFld = (int)-12L;
                Test.iFld = (int)Test.instanceCount;
                i14 *= (int)Test.instanceCount;
                Test.instanceCount &= -3;
                i24 *= (int)Test.fFld;
                lArr2[i25 - 1] = -8532;
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i11 + i12 + i13 + i14 + s + i23 + i24 + (b ? 1 : 0) + i25 + i26 +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr2);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static void vMeth(long l, int i3, int i4) {

        double d=0.1219;
        int i5=125, i6=-57119, i7=0, i8=130, i9=5, i10=148, iArr3[]=new int[N];
        float f=2.857F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 1645212791727535188L);
        FuzzerUtils.init(iArr3, 144);

        i3 -= (int)((++d) + (-(d * d)));
        i5 = 1;
        while ((i5 += 3) < 334) {
            for (i6 = 1; 14 > i6; ++i6) {
                i7 += (int)((Math.abs(i3) - (f + i5)) * i7);
            }
            i4 += i5;
            i8 = 1;
            while (++i8 < 14) {
                for (i9 = i5; i9 < 1; i9++) {
                    switch ((i5 % 2) + 125) {
                    case 125:
                        i3 += (int)(Test.instanceCount + -1993);
                        if (i9 != 0) {
                            vMeth_check_sum += l + i3 + i4 + Double.doubleToLongBits(d) + i5 + i6 + i7 +
                                Float.floatToIntBits(f) + i8 + i9 + i10 + FuzzerUtils.checkSum(lArr) +
                                FuzzerUtils.checkSum(iArr3);
                            return;
                        }
                        Test.fArrFld[i9 + 1] *= (i7 = (int)((long)(Test.instanceCount + d) << (--lArr[i5])));
                        if ((d *= byMeth(83.285F, i4, i7)) != i4) break;
                        break;
                    case 126:
                        Test.instanceCount %= (i10 | 1);
                        i3 *= 8778;
                        Test.instanceCount ^= i5;
                        break;
                    default:
                        iArr3[i9 - 1] = i10;
                    }
                }
            }
        }
        vMeth_check_sum += l + i3 + i4 + Double.doubleToLongBits(d) + i5 + i6 + i7 + Float.floatToIntBits(f) + i8 + i9
            + i10 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr3);
    }

    public void mainTest(String[] strArr1) {

        int i=0, i1=-46688, i2=-66, i27=1, i28=-8, i29=-32849, i30=-37857, i31=-3, i32=14634, i33=-10, i34=-152,
            i35=124, iArr[]=new int[N];
        short s3=-31829, sArr[]=new short[N];
        long lArr3[]=new long[N];

        FuzzerUtils.init(iArr, -140);
        FuzzerUtils.init(lArr3, -391820728L);
        FuzzerUtils.init(sArr, (short)-19296);

        iArr[(i >>> 1) % N] >>>= (int)(Math.min((long)(i + 2.824F), -68L) + ((Test.instanceCount * i) * i));
        for (i1 = 203; 4 < i1; --i1) {
            vMeth(95L, i, Test.iFld);
            i27 = 1;
            while (++i27 < 126) {
                short s2=23742;
                Test.iFld1 += Test.iFld;
                i2 += Test.iFld;
                Test.iFld /= (int)(i | 1);
                s2 -= (short)Test.instanceCount;
                Test.fFld = i1;
                iArr = FuzzerUtils.int1array(N, (int)1);
                for (i28 = 1; i28 > 1; i28--) {
                    try {
                        i29 = (i28 / i27);
                        i = (Test.iFld % -68926219);
                        i29 = (i1 / 35885);
                    } catch (ArithmeticException a_e) {}
                    dFld += Test.instanceCount;
                }
                Test.fFld += Test.instanceCount;
                iArr = iArr;
                Test.fArrFld[i27] -= i1;
            }
            for (i30 = 6; i30 < 126; ++i30) {
                for (i32 = 1; i32 < 2; ++i32) {
                    boolean b1=false;
                    Test.instanceCount = i28;
                    switch ((i30 % 3) + 14) {
                    case 14:
                        i %= (int)(i30 | 1);
                        i += i32;
                    case 15:
                        switch (((i30 % 4) * 5) + 34) {
                        case 44:
                            switch ((i30 % 1) + 113) {
                            case 113:
                                Test.instanceCount += (long)Test.fFld;
                            }
                            if (b1) {
                                Test.fFld = -4701231380220778089L;
                                lArr3[i1 - 1] += i29;
                                Test.fArrFld[i1 + 1] += (float)dFld;
                                Test.iFld1 += (i32 * i32);
                            } else {
                                i2 += (int)Test.fFld;
                            }
                            break;
                        case 41:
                            Test.fFld += i;
                            break;
                        case 40:
                            i31 -= i34;
                        case 51:
                            sArr[i32 - 1] = (short)-25050;
                            break;
                        default:
                            Test.iFld1 <<= i34;
                        }
                        break;
                    case 16:
                        lArr3[i1 - 1] += 8L;
                        break;
                    default:
                        i35 -= s3;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 i31 i32 = " + i30 + "," + i31 + "," + i32);
        FuzzerUtils.out.println("i33 i34 i35 = " + i33 + "," + i34 + "," + i35);
        FuzzerUtils.out.println("s3 iArr lArr3 = " + s3 + "," + FuzzerUtils.checkSum(iArr) + "," +
            FuzzerUtils.checkSum(lArr3));
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.iFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.iFld1 dFld Test.fArrFld = " + Test.iFld1 + "," + Double.doubleToLongBits(dFld) +
            "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
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
//DEBUG  byMeth ->  byMeth vMeth mainTest
//DEBUG  sMeth ->  sMeth byMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
