// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:57 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-113L;
    public static float fFld=70.968F;
    public static short sFld=-32737;
    public int iFld=25781;
    public byte byFld=-24;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 2);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i3=-51786, i4=178, iArr1[]=new int[N];
        double d=0.87168, d1=0.82503;
        short s=-5503;

        FuzzerUtils.init(iArr1, -28097);

        for (i3 = 3; i3 < 201; ++i3) {
            d = 1;
            while ((d += 3) < 8) {
                int i5=-151;
                i4 = (int)Test.instanceCount;
                iArr1[i3] >>= i4;
                i4 += (int)(d * Test.instanceCount);
                i4 >>>= (int)44938L;
                i4 >>= (int)Test.instanceCount;
                i4 += (int)((long)d | i5);
                i4 >>>= s;
                i4 -= (int)Test.instanceCount;
            }
            s *= (short)4330;
            Test.fFld += i3;
            Test.instanceCount = i3;
            i4 = i3;
            d1 += i3;
        }
        long meth_res = i3 + i4 + Double.doubleToLongBits(d) + s + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i2) {

        double d2=43.106702;
        int i6=3, i7=53488, i8=207, i9=-38605, i10=-34980;

        iMeth1();
        Test.iArrFld = FuzzerUtils.int1array(N, (int)5);
        i2 = (int)-943031127L;
        Test.instanceCount >>>= Test.instanceCount;
        Test.fFld *= i2;
        for (d2 = 11; d2 < 223; ++d2) {
            Test.instanceCount += (long)((long)d2 ^ i2);
            Test.instanceCount += (long)(((d2 * Test.instanceCount) + i2) - i6);
            for (i7 = 1; 8 > i7; ++i7) {
                Test.fFld -= Test.fFld;
                for (i9 = 1; 2 > i9; ++i9) {
                    i2 *= i9;
                }
                Test.instanceCount = i10;
                Test.instanceCount = i2;
            }
            Test.instanceCount += (long)d2;
        }
        long meth_res = i2 + Double.doubleToLongBits(d2) + i6 + i7 + i8 + i9 + i10;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i) {

        long l=4259924588L;
        int i1=199, i11=-14, i12=-31544, i13=178, i14=-20, i15=22488, i16=-154, i17=-4, iArr[]=new int[N];
        float f=0.371F;
        double d3=18.23563;

        FuzzerUtils.init(iArr, -9);

        iArr[(i >>> 1) % N] <<= (i++);
        for (l = 8; l < 199; l++) {
            f -= Math.max(iMeth(i1), i1);
            d3 -= i1;
            Test.fFld -= i;
        }
        for (i11 = 9; 214 > i11; i11++) {
            Test.iArrFld[i11] *= (int)l;
            for (i13 = 8; i13 > i11; --i13) {
                for (i15 = i11; i15 < 1; i15 += 2) {
                    d3 = i16;
                    i14 |= 44921;
                }
                i += (int)Test.fFld;
                i17 += i13;
                i14 += i1;
                i17 += (((i13 * Test.sFld) + Test.instanceCount) - i11);
            }
        }
        vMeth_check_sum += i + l + i1 + Float.floatToIntBits(f) + Double.doubleToLongBits(d3) + i11 + i12 + i13 + i14 +
            i15 + i16 + i17 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i18=-14, i19=-47, i20=4729, i21=5, i22=246, i23=-162;
        boolean b=true;
        double d4=2.20430, dArr[]=new double[N];
        long l1=7L, lArr[]=new long[N];
        short s1=14930;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -1.715F);
        FuzzerUtils.init(dArr, -2.52603);
        FuzzerUtils.init(lArr, 1289913563L);

        vMeth(iFld);
        Test.sFld = (short)iFld;
        iFld += (int)7L;
        i18 = 1;
        while (++i18 < 257) {
            for (i19 = i18; i19 < 98; ++i19) {
                Test.fFld *= Test.instanceCount;
                for (i21 = 1; i21 < 1; i21++) {
                    i22 = i22;
                    fArr = fArr;
                    Test.instanceCount = Test.sFld;
                    if (b) {
                        switch ((((i21 >>> 1) % 10) * 5) + 54) {
                        case 85:
                            iFld >>>= -243;
                            if (b) continue;
                            d4 += i21;
                            fArr = fArr;
                            break;
                        case 67:
                            iFld *= -1;
                            l1 += i21;
                            fArr[i18] = i20;
                            Test.iArrFld[i18 - 1] /= (int)(iFld | 1);
                        case 61:
                            i22 *= i20;
                            byFld *= (byte)i18;
                            iFld += (int)(-2.647F + (i21 * i21));
                            break;
                        case 65:
                            Test.iArrFld[i21 + 1] = byFld;
                            switch ((((i21 >>> 1) % 9) * 5) + 43) {
                            case 61:
                                switch ((i19 % 2) + 45) {
                                case 45:
                                    switch (((i19 % 8) * 5) + 96) {
                                    case 120:
                                        Test.iArrFld[i18 + 1] = -25423;
                                        dArr[i18 + 1] = iFld;
                                    case 116:
                                        i20 = (int)l1;
                                    case 124:
                                        iFld -= i18;
                                    case 101:
                                        Test.iArrFld = Test.iArrFld;
                                    case 135:
                                        iFld = s1;
                                        break;
                                    case 126:
                                        Test.fFld = i19;
                                        break;
                                    case 122:
                                        i22 += (i21 + i19);
                                    case 121:
                                        i20 += iFld;
                                        break;
                                    default:
                                        Test.iArrFld[i18 - 1] *= (int)-1821916676653655952L;
                                    }
                                    break;
                                case 46:
                                    iFld = byFld;
                                    break;
                                }
                            case 49:
                                d4 -= l1;
                                break;
                            case 64:
                                Test.iArrFld[i21] >>>= (int)l1;
                                break;
                            case 74:
                                l1 -= l1;
                                break;
                            case 78:
                                lArr[i19 + 1] *= Test.instanceCount;
                            case 84:
                                i20 = (int)l1;
                                break;
                            case 44:
                                Test.iArrFld[i19 - 1] = i21;
                                break;
                            case 86:
                                l1 = i19;
                                break;
                            case 70:
                                i20 += (i21 | i20);
                                break;
                            }
                            break;
                        case 70:
                            i22 &= i22;
                            break;
                        case 73:
                            Test.instanceCount += i23;
                            break;
                        case 92:
                            Test.iArrFld[i21] = i23;
                            break;
                        case 77:
                            d4 += i19;
                            break;
                        case 97:
                            i23 >>= (int)l1;
                        case 102:
                            i22 = (int)d4;
                        }
                    } else if (b) {
                        s1 -= (short)1.34153;
                    } else {
                        i20 = i23;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 b = " + i21 + "," + i22 + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("d4 l1 s1 = " + Double.doubleToLongBits(d4) + "," + l1 + "," + s1);
        FuzzerUtils.out.println("i23 fArr dArr = " + i23 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));
        FuzzerUtils.out.println("lArr = " + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.sFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.sFld);
        FuzzerUtils.out.println("iFld byFld Test.iArrFld = " + iFld + "," + byFld + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
