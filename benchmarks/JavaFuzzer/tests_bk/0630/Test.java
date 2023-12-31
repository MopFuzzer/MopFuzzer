// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:09 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=201L;
    public static boolean bFld=false;
    public static volatile byte byFld=-93;
    public static volatile int iFld=-14980;
    public static double dFld=96.61664;
    public short sFld=-26922;
    public int iFld1=-108;
    public static int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];
    public static volatile boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 11435);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i4=51933, i5=-8;
        double dArr[][]=new double[N][N];
        float fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(dArr, 1.2257);
        FuzzerUtils.init(fArr, -68.838F);
        FuzzerUtils.init(lArr, 102L);

        Test.bFld = Test.bFld;
        dArr = dArr;
        i4 = 1;
        do {
            Test.byFld += (byte)(i4 - Test.instanceCount);
            Test.instanceCount += 78;
            i5 = i4;
            Test.instanceCount += Test.instanceCount;
            i5 -= i5;
            dArr[i4 - 1][i4] += Test.instanceCount;
            Test.instanceCount += (((i4 * i4) + i4) - i5);
            i5 += (i4 * i4);
            fArr[i4 - 1] += i4;
            lArr[i4 + 1] *= Test.iFld;
        } while (++i4 < 222);
        lArr[(-50621 >>> 1) % N] = Test.iFld;
        i5 = Test.byFld;
        long meth_res = i4 + i5 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i2) {

        int i6=-30480, i7=-207, i8=-25792, i9=50859, i10=-169;
        short s=-17227;
        double d1=-2.64876;

        for (int i3 : Test.iArrFld) {
            i3 *= iMeth();
            Test.bFld = Test.bFld;
        }
        for (i6 = 7; i6 < 176; i6++) {
            if (Test.bFld) continue;
            switch ((i6 % 3) + 38) {
            case 38:
                Test.bFld = true;
                for (i8 = 9; i8 > 1; --i8) {
                    i2 *= i7;
                    s += (short)(i8 ^ i7);
                    Test.iFld += (i8 * Test.instanceCount);
                    for (d1 = 1; d1 < 2; ++d1) {
                        i9 -= -31293;
                        i7 += (int)(d1 * i2);
                        i7 += (int)(d1 * d1);
                    }
                }
                break;
            case 39:
                Test.iArrFld[i6 - 1] = -213;
                break;
            case 40:
                i10 += (i6 * i6);
                break;
            default:
                i7 += (i6 * Test.byFld);
            }
        }
        vMeth1_check_sum += i2 + i6 + i7 + i8 + i9 + s + Double.doubleToLongBits(d1) + i10;
    }

    public static void vMeth(int i) {

        int i1=0;
        double d=-1.119047;

        i1 = 366;
        do {
            Test.instanceCount -= i1;
        } while ((i1 -= 2) > 0);
        d -= ((Test.instanceCount - Test.iArrFld[(i >>> 1) % N]) + Test.iArrFld[(-24417 >>> 1) % N]);
        vMeth1(1);
        Test.iFld = 238;
        i = i1;
        Test.iFld = -8;
        vMeth_check_sum += i + i1 + Double.doubleToLongBits(d);
    }

    public void mainTest(String[] strArr1) {

        int i11=90, i12=-218, i14=39694, i15=-158, i16=-7, i17=0, i18=183, i19=1, i20=-55006, i21=-51704;
        float f2=38.488F, fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, -57.512F);

        vMeth(Test.iFld);
        for (i11 = 6; i11 < 146; ++i11) {
            float f1=71.633F;
            if (Test.bFld) {
                Test.iFld += i11;
                Test.instanceCount += -254;
                i12 = (int)Test.instanceCount;
            } else if (Test.bFld) {
                if (Test.bFld) break;
                Test.iFld *= (int)Test.instanceCount;
                Test.iArrFld = FuzzerUtils.int1array(N, (int)-33153);
            } else {
                for (i14 = i11; i14 < 179; i14++) {
                    Test.iArrFld[i14] >>>= i11;
                }
                i15 = (int)Test.instanceCount;
            }
            i15 *= (int)Test.instanceCount;
            f1 += (-204L + (i11 * i11));
            lArrFld = lArrFld;
        }
        Test.iArrFld[(i12 >>> 1) % N] = i16;
        Test.iFld >>>= (int)Test.instanceCount;
        for (i17 = 3; i17 < 360; i17 += 3) {
            Test.dFld *= Test.instanceCount;
            i16 &= (int)Test.instanceCount;
            Test.iFld = -5;
            f2 -= f2;
            Test.iArrFld[i17] <<= -25;
            sFld |= Test.byFld;
            for (i19 = i17; 211 > i19; i19++) {
                i16 += (i19 + f2);
                switch (i17 + 102) {
                case 102:
                    Test.instanceCount = i11;
                    Test.instanceCount += i11;
                    i12 += iFld1;
                case 103:
                    Test.bFld = Test.bFld;
                    break;
                case 104:
                    Test.instanceCount ^= i14;
                    break;
                case 105:
                    i16 += i19;
                    break;
                case 106:
                    Test.bFld = Test.bFld;
                    break;
                case 107:
                    i16 = i12;
                    break;
                case 108:
                    i16 = i12;
                case 109:
                    i18 *= (int)Test.instanceCount;
                case 110:
                    i12 -= i15;
                    break;
                case 111:
                    Test.instanceCount += i17;
                    break;
                case 112:
                    i21 <<= sFld;
                case 113:
                    Test.instanceCount *= -7083868132212500773L;
                case 114:
                    i16 = i19;
                case 115:
                    lArrFld[i19] *= i12;
                    break;
                case 116:
                    Test.bArrFld[i17 + 1] = Test.bFld;
                    break;
                case 117:
                    Test.bFld = Test.bFld;
                    break;
                case 118:
                    lArrFld[i17 - 1] <<= i15;
                    break;
                case 119:
                    f2 = i21;
                    break;
                case 120:
                    i20 += (((i19 * Test.instanceCount) + Test.instanceCount) - Test.byFld);
                    break;
                case 121:
                    iFld1 += i19;
                    break;
                case 122:
                    Test.instanceCount += -191;
                    break;
                case 123:
                    try {
                        i12 = (Test.iFld / i11);
                        i16 = (i19 / iFld1);
                        iFld1 = (1333728700 % i21);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 124:
                    Test.iArrFld[i19] += iFld1;
                case 125:
                    i18 *= 1;
                    break;
                case 126:
                    f2 += (-34 + (i19 * i19));
                case 127:
                    iFld1 += i20;
                    break;
                case 128:
                    f2 -= 41;
                    break;
                case 129:
                    Test.iFld = (int)f2;
                    break;
                case 130:
                    iFld1 += (((i19 * i21) + i19) - f2);
                    break;
                case 131:
                    Test.iArrFld[i17] >>= i15;
                    break;
                case 132:
                    i15 = i11;
                case 133:
                    Test.instanceCount = (long)Test.dFld;
                    break;
                case 134:
                    Test.iArrFld[i19 - 1] /= (int)(Test.instanceCount | 1);
                    break;
                case 135:
                case 136:
                    i16 = i18;
                    break;
                case 137:
                    lArrFld[i19] >>= Test.instanceCount;
                    break;
                case 138:
                    i12 = (int)Test.instanceCount;
                    break;
                case 139:
                    Test.dFld -= Test.instanceCount;
                    break;
                case 140:
                case 141:
                    Test.bFld = Test.bFld;
                    break;
                case 142:
                    try {
                        Test.iFld = (i20 / -118081427);
                        Test.iArrFld[i19] = (i11 / -1291673777);
                        i15 = (150 / i19);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 143:
                    Test.bArrFld[i17 - 1] = Test.bFld;
                    break;
                case 144:
                    Test.instanceCount = 2;
                    break;
                case 145:
                    Test.bFld = Test.bFld;
                    break;
                case 146:
                    iFld1 += i19;
                    break;
                case 147:
                    iFld1 = i19;
                    break;
                case 148:
                    f2 += (-112 + (i19 * i19));
                    break;
                case 149:
                    Test.iFld = (int)f2;
                case 150:
                    Test.iFld += i19;
                    break;
                case 151:
                    Test.byFld += (byte)Test.iFld;
                case 152:
                    i15 += (i19 ^ i14);
                case 153:
                    i21 = (int)Test.dFld;
                case 154:
                    iFld1 <<= i11;
                    break;
                case 155:
                    Test.instanceCount -= -6L;
                case 156:
                    Test.instanceCount >>= Test.instanceCount;
                    break;
                case 157:
                    i21 += (i19 ^ i19);
                    break;
                case 158:
                    Test.iArrFld[i17 + 1] += iFld1;
                    break;
                case 159:
                    Test.bArrFld[i17 + 1] = Test.bFld;
                case 160:
                    i12 = i19;
                    break;
                case 161:
                    iFld1 <<= i15;
                    break;
                case 162:
                    f2 += Test.instanceCount;
                case 163:
                    i16 += (i19 * i17);
                    break;
                case 164:
                    i20 -= (int)Test.instanceCount;
                    break;
                case 165:
                    Test.bArrFld[i17 + 1] = false;
                    break;
                case 166:
                    Test.bFld = Test.bFld;
                    break;
                case 167:
                    i20 += (int)83.393F;
                    break;
                case 168:
                    Test.iFld = Test.iFld;
                case 169:
                    f2 *= i19;
                    break;
                case 170:
                    Test.iArrFld[i19] = (int)Test.dFld;
                case 171:
                    Test.instanceCount *= 20;
                    break;
                default:
                    i20 = (int)Test.instanceCount;
                }
            }
        }

        FuzzerUtils.out.println("i11 i12 i14 = " + i11 + "," + i12 + "," + i14);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 f2 i19 = " + i18 + "," + Float.floatToIntBits(f2) + "," + i19);
        FuzzerUtils.out.println("i20 i21 fArr1 = " + i20 + "," + i21 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.byFld = " + Test.instanceCount + "," + (Test.bFld ?
            1 : 0) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.iFld Test.dFld sFld = " + Test.iFld + "," + Double.doubleToLongBits(Test.dFld) +
            "," + sFld);
        FuzzerUtils.out.println("iFld1 Test.iArrFld lArrFld = " + iFld1 + "," + FuzzerUtils.checkSum(Test.iArrFld) +
            "," + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("Test.bArrFld = " + FuzzerUtils.checkSum(Test.bArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
