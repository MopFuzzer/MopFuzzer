// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:17 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-123L;
    public static volatile int iFld=97;
    public static short sFld=-20995;
    public static int iFld1=15461;
    public static double dFld=0.46896;
    public volatile int iArrFld[]=new int[N];
    public static short sArrFld[]=new short[N];
    public static int iArrFld1[][]=new int[N][N];
    public static long lArrFld[][]=new long[N][N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)16809);
        FuzzerUtils.init(Test.iArrFld1, 3);
        FuzzerUtils.init(Test.lArrFld, 21778L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;

    public static short sMeth() {

        long l=-3910830997031378482L;
        int i6=2, i7=-15246, i8=-129, i9=-3, i10=-14;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)46);

        byArr[(65417 >>> 1) % N] = (byte)Test.iFld;
        Test.iArrFld1[(-13 >>> 1) % N][(Test.iFld >>> 1) % N] >>>= (int)Test.instanceCount;
        Test.instanceCount = Test.sFld;
        for (l = 12; l < 307; l++) {
            Test.iArrFld1[(int)(l - 1)][(int)(l - 1)] *= Test.iFld;
            for (i7 = 1; i7 < 6; i7++) {
                Test.iFld += i7;
                i8 = i7;
                for (i9 = 2; i9 > 1; i9--) {
                    i10 += Test.iFld;
                    Test.instanceCount -= 32;
                }
                if (true) continue;
                i8 = i10;
                Test.instanceCount ^= Test.instanceCount;
                Test.iArrFld1[(int)(l)][(int)(l - 1)] -= 9;
            }
        }
        long meth_res = l + i6 + i7 + i8 + i9 + i10 + FuzzerUtils.checkSum(byArr);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth() {

        int i5=-102, i12=237, i13=-2809, i14=55906, i15=-12, i16=-39737, iArr[]=new int[N];
        float f=0.479F, fArr[]=new float[N];
        byte by=-95;

        FuzzerUtils.init(iArr, -13);
        FuzzerUtils.init(fArr, -2.879F);

        Test.instanceCount = ((Test.iArrFld1[(i5 >>> 1) % N][(-44339 >>> 1) % N]--) * sMeth());
        for (int i11 : iArr) {
            iArr[(i5 >>> 1) % N] = i11;
            Test.lArrFld[(i5 >>> 1) % N][(Test.iFld >>> 1) % N] &= 8613;
            i5 <<= Test.iFld;
            if (false) break;
            i12 = 4;
            do {
                switch ((i12 % 9) + 44) {
                case 44:
                    i5 = Test.iFld;
                    break;
                case 45:
                    for (i13 = 1; 1 > i13; ++i13) {
                        i15 -= -54026;
                        i15 += i13;
                        Test.sFld -= (short)f;
                        Test.instanceCount <<= Test.iFld;
                        Test.iFld *= i15;
                    }
                case 46:
                    fArr[i12 + 1] -= Test.iFld1;
                case 47:
                    iArr[i12 - 1] *= i16;
                case 48:
                    Test.instanceCount -= -14669;
                case 49:
                    i15 |= i12;
                    break;
                case 50:
                    iArr[i12 - 1] = -3;
                    break;
                case 51:
                case 52:
                    Test.iFld *= by;
                    break;
                }
            } while (--i12 > 0);
        }
        vMeth_check_sum += i5 + i12 + i13 + i14 + i15 + Float.floatToIntBits(f) + i16 + by + FuzzerUtils.checkSum(iArr)
            + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth() {

        int i17=4, i18=35996, i19=-16983, i20=-47353, i21=-241, i22=-200;
        float f1=-75.956F, fArr1[]=new float[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(fArr1, 2.94F);
        FuzzerUtils.init(bArr, false);

        vMeth();
        for (i17 = 7; 240 > i17; i17++) {
            for (i19 = 1; 7 > i19; i19++) {
                byte by1=76;
                fArr1 = fArr1;
                by1 = (byte)Test.dFld;
                switch ((i17 % 4) + 62) {
                case 62:
                    Test.iArrFld1[i17 + 1] = FuzzerUtils.int1array(N, (int)191);
                    i18 += (int)7931359040310346310L;
                    Test.sArrFld[i17] = (short)Test.dFld;
                    for (i21 = 2; i21 > 1; --i21) {
                        Test.iArrFld1[i21][i17 - 1] = i20;
                        i18 = Test.iFld;
                        Test.iFld -= (int)f1;
                        i22 -= i18;
                        Test.dFld -= f1;
                    }
                case 63:
                    i20 = Test.iFld1;
                case 64:
                    i20 = i19;
                case 65:
                    i22 >>>= i20;
                    break;
                default:
                    bArr = bArr;
                }
            }
        }
        long meth_res = i17 + i18 + i19 + i20 + i21 + i22 + Float.floatToIntBits(f1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + FuzzerUtils.checkSum(bArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=92, i1=-46694, i2=7, i3=-47808, i4=-48, i23=-27840, i24=14;
        float f2=0.498F, fArr2[]=new float[N];
        byte by2=49;

        FuzzerUtils.init(fArr2, -91.915F);

        i = 1;
        do {
            for (i1 = 3; i1 < 243; i1 += 2) {
                for (i3 = 3; 1 < i3; i3--) {
                    i4 += i3;
                    iArrFld[i - 1] >>= Short.reverseBytes((short)(Test.sArrFld[i + 1]++));
                    try {
                        i2 = (i2 % i4);
                        i2 = (i3 % iArrFld[i1 + 1]);
                        i2 = (-56078 % i4);
                    } catch (ArithmeticException a_e) {}
                    i2 = (int)Test.instanceCount;
                    if (false) {
                        iArrFld[i3 + 1] >>>= iMeth();
                        Test.lArrFld[i + 1][i1 - 1] *= (long)f2;
                        Test.iFld1 = Test.iFld1;
                    }
                    by2 *= (byte)i4;
                    Test.iFld1 -= (int)Test.dFld;
                    Test.dFld = Test.iFld;
                }
            }
            for (i23 = 2; i23 < 243; ++i23) {
                switch (((i % 5) * 5) + 110) {
                case 134:
                    iArrFld[i + 1] -= Test.iFld1;
                    break;
                case 131:
                    iArrFld[i + 1] = (int)22.36F;
                    Test.instanceCount += i24;
                    Test.instanceCount = Test.instanceCount;
                    i4 += (i23 | i3);
                    break;
                case 133:
                case 111:
                    Test.iFld1 -= -21595;
                    i24 >>= (int)Test.instanceCount;
                    Test.iFld1 %= (int)(i3 | 1);
                    break;
                case 120:
                    try {
                        iArrFld[i23 + 1] = (i % Test.iArrFld1[i + 1][i23]);
                        i4 = (13 % i1);
                        Test.iFld = (i2 / 1158524894);
                    } catch (ArithmeticException a_e) {}
                    Test.sArrFld[i] = (short)28650;
                    f2 += (29 + (i23 * i23));
                    fArr2[i23 - 1] = i4;
                default:
                    by2 += (byte)(((i23 * i4) + i2) - Test.instanceCount);
                    Test.iFld -= (int)Test.instanceCount;
                }
            }
        } while ((i += 3) < 309);

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 f2 = " + i3 + "," + i4 + "," + Float.floatToIntBits(f2));
        FuzzerUtils.out.println("by2 i23 i24 = " + by2 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("fArr2 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2)));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.sFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Test.sFld);
        FuzzerUtils.out.println("Test.iFld1 Test.dFld iArrFld = " + Test.iFld1 + "," +
            Double.doubleToLongBits(Test.dFld) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("Test.sArrFld Test.iArrFld1 Test.lArrFld = " + FuzzerUtils.checkSum(Test.sArrFld) + ","
            + FuzzerUtils.checkSum(Test.iArrFld1) + "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  sMeth ->  sMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}