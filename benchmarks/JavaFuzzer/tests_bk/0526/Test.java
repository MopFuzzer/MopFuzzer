// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:06 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=7455915864732793420L;
    public static short sFld=-14530;
    public static int iFld=5;
    public byte byFld=6;
    public volatile boolean bFld=true;
    public int iFld1=45370;
    public float fFld=-1.916F;
    public static volatile int iArrFld[][]=new int[N][N];
    public volatile float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 28224);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i2, long l) {

        int i3=-38233, i4=-14932, i5=46111, i6=-8;
        byte by=108;
        float f=-1.406F, fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 3L);
        FuzzerUtils.init(fArr, -1.65F);

        for (long l1 : lArr) {
            lArr[(Test.iFld >>> 1) % N] ^= Test.iFld;
        }
        Test.iFld -= Test.iFld;
        i3 = 1;
        do {
            by += (byte)(i3 * i3);
            for (i4 = 1; i4 < 11; i4++) {
                l *= i6;
                Test.iFld = i4;
                fArr = FuzzerUtils.float1array(N, (float)-1.993F);
                try {
                    i5 = (i6 / i5);
                    Test.iFld = (Test.iArrFld[i3][i4 - 1] % 28521);
                    i2 = (-84352091 / i4);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount += (long)f;
            }
        } while (++i3 < 137);
        Test.instanceCount >>= i3;
        lArr[(i4 >>> 1) % N] = Test.sFld;
        f = i4;
        i6 -= (int)f;
        vMeth2_check_sum += i2 + l + i3 + by + i4 + i5 + i6 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void vMeth1(int i, int i1) {

        int i7=43332, i8=49949, i9=-25690, i10=246, i11=-10;
        float f1=-1.173F;
        long l2=4L, lArr1[][]=new long[N][N];
        double d2=0.35807;

        FuzzerUtils.init(lArr1, 241L);

        vMeth2(43, Test.instanceCount);
        i7 = 1;
        while (++i7 < 381) {
            Test.iArrFld[i7][i7] = i7;
            for (i8 = i7; i8 < 4; ++i8) {
                Test.instanceCount += (-48078 + (i8 * i8));
                for (i10 = 1; i10 < 1; i10++) {
                    Test.instanceCount -= 11;
                    Test.instanceCount -= i9;
                    i1 = (int)f1;
                    l2 *= 59490;
                    switch ((i10 % 10) + 90) {
                    case 90:
                        f1 += f1;
                        break;
                    case 91:
                        Test.iFld = -20003;
                        f1 += (i10 - i1);
                        break;
                    case 92:
                        Test.instanceCount += 5;
                    case 93:
                        Test.instanceCount += (((i10 * i) + byFld) - i1);
                        break;
                    case 94:
                        d2 = i11;
                    case 95:
                        i1 >>= i9;
                        break;
                    case 96:
                        lArr1[i7][i7 - 1] <<= Test.iFld;
                    case 97:
                    case 98:
                        byFld -= (byte)l2;
                    case 99:
                        f1 += i10;
                        break;
                    }
                }
            }
        }
        vMeth1_check_sum += i + i1 + i7 + i8 + i9 + i10 + i11 + Float.floatToIntBits(f1) + l2 +
            Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(lArr1);
    }

    public void vMeth(double d1) {

        int i12=-3, i13=-13, i14=10, i15=215, i16=-19978, i17=-36775;

        Test.instanceCount |= Test.iFld;
        vMeth1(-14, 6);
        for (i12 = 1; i12 < 313; i12 += 2) {
            switch ((i12 % 10) + 40) {
            case 40:
                Test.iFld = (int)Test.instanceCount;
                i14 = 1;
                do {
                    try {
                        i13 = (Test.iArrFld[i14 - 1][i12 - 1] / i12);
                        i13 = (i14 / -121);
                        Test.iFld = (48343 % Test.iArrFld[i12 + 1][i12]);
                    } catch (ArithmeticException a_e) {}
                    Test.iFld += Test.iFld;
                    i13 &= -1;
                } while (++i14 < 10);
                break;
            case 41:
                if (bFld) {
                    Test.iFld += (i12 ^ i12);
                } else {
                    i13 -= 47306;
                    for (i15 = 1; i15 < 10; i15 += 3) {
                        Test.instanceCount += (((i15 * iFld1) + i14) - Test.instanceCount);
                        Test.iFld ^= 2;
                    }
                }
                break;
            case 42:
            case 43:
                Test.iFld = (int)Test.instanceCount;
                break;
            case 44:
                Test.sFld += (short)(193 + (i12 * i12));
                break;
            case 45:
                Test.sFld = (short)i15;
            case 46:
                Test.iArrFld[i12][i12 - 1] += (int)Test.instanceCount;
                break;
            case 47:
                Test.iArrFld[i12 + 1][i12] += (int)49037L;
                break;
            case 48:
                i17 += (int)fFld;
                break;
            case 49:
                Test.iFld = i13;
                break;
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d1) + i12 + i13 + i14 + i15 + i16 + i17;
    }

    public void mainTest(String[] strArr1) {

        double d=1.104644, d3=-101.114075, d4=0.25360, dArr[]=new double[N];
        int i18=40782, i19=163, i20=63855, i21=3935, i22=-33874, i23=4, i24=-130, i25=-50726, i26=-8, i27=-49274;
        long l3=3400558205552143652L, lArr2[]=new long[N];

        FuzzerUtils.init(dArr, -106.119983);
        FuzzerUtils.init(lArr2, 1630905962L);

        Test.sFld = (short)Test.iArrFld[(Test.iFld >>> 1) % N][(Test.iFld >>> 1) % N];
        Test.iFld = (int)(++d);
        vMeth(d);
        for (d3 = 305; d3 > 11; d3--) {
            Test.instanceCount += (long)(((d3 * Test.instanceCount) + Test.sFld) - Test.iFld);
            Test.instanceCount <<= iFld1;
            for (i19 = (int)(d3); 86 > i19; i19 += 2) {
                Test.sFld += (short)Test.instanceCount;
                Test.iFld = iFld1;
                iFld1 = i18;
            }
            Test.iArrFld[(int)(d3 + 1)][(int)(d3)] += i18;
            Test.instanceCount = (long)fFld;
            for (i21 = (int)(d3); i21 < 86; ++i21) {
                i20 <<= i19;
                i20 += (i21 * Test.instanceCount);
            }
            d *= Test.iFld;
        }
        for (d4 = 17; d4 < 272; ++d4) {
            d *= i21;
            dArr[(int)(d4 - 1)] = Test.instanceCount;
            lArr2[(int)(d4 + 1)] = iFld1;
        }
        for (i24 = 7; 227 > i24; ++i24) {
            try {
                i23 = (46741 / i18);
                i23 = (i24 % i21);
                i25 = (Test.iFld % i18);
            } catch (ArithmeticException a_e) {}
            byFld -= (byte)d4;
        }
        Test.iArrFld[(i21 >>> 1) % N][(i19 >>> 1) % N] <<= (int)Test.instanceCount;
        d -= i20;
        for (l3 = 21; l3 < 366; l3++) {
            d = -12;
            i27 = 1;
            while (++i27 < 73) {
                Test.sFld += (short)(i27 * i27);
                Test.instanceCount = 55300;
            }
        }

        FuzzerUtils.out.println("d d3 i18 = " + Double.doubleToLongBits(d) + "," + Double.doubleToLongBits(d3) + "," +
            i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 d4 i23 = " + i22 + "," + Double.doubleToLongBits(d4) + "," + i23);
        FuzzerUtils.out.println("i24 i25 l3 = " + i24 + "," + i25 + "," + l3);
        FuzzerUtils.out.println("i26 i27 dArr = " + i26 + "," + i27 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));
        FuzzerUtils.out.println("lArr2 = " + FuzzerUtils.checkSum(lArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.iFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Test.iFld);
        FuzzerUtils.out.println("byFld bFld iFld1 = " + byFld + "," + (bFld ? 1 : 0) + "," + iFld1);
        FuzzerUtils.out.println("fFld Test.iArrFld fArrFld = " + Float.floatToIntBits(fFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

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
