// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:59 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-12L;
    public static short sFld=-26617;
    public static int iFld=11;
    public static volatile double dFld=-32.59821;
    public static volatile int iFld1=-31946;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 97.422F);
        FuzzerUtils.init(Test.iArrFld, 126);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth() {


        Test.iFld *= (int)Test.instanceCount;
        Test.iFld <<= 14;
        long meth_res = 0;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(int i3, int i4, double d1) {

        int i5=-156, i6=3195, i7=-10, i8=-28987, i9=-8, iArr[]=new int[N];
        float f1=-1.320F, fArr[]=new float[N];
        byte by=-43;
        long l=-8L, l1=8L, lArr[]=new long[N];
        boolean b1=true;

        FuzzerUtils.init(iArr, -10);
        FuzzerUtils.init(fArr, -40.483F);
        FuzzerUtils.init(lArr, 1235250859167568815L);

        for (i5 = 4; i5 < 132; ++i5) {
            iArr[i5 - 1] += (int)(((5591037201534752475L >>> (--Test.instanceCount)) + (f1 - Test.instanceCount)) *
                ((f1 + i4) - (by + Test.instanceCount)));
            for (l = 12; 1 < l; l -= 2) {
                for (l1 = 1; 3 > l1; ++l1) {
                    Test.sFld -= (short)Math.min((int)(lMeth() * l1), i6);
                    Test.instanceCount = (long)f1;
                    f1 = i4;
                    fArr = fArr;
                    lArr[(int)(l1 - 1)] = by;
                }
                i3 = i3;
                f1 -= i8;
                b1 = b1;
                i9 = 3;
                do {
                    i7 *= (int)l;
                    Test.sFld >>>= (short)i8;
                } while (--i9 > 0);
            }
        }
        vMeth1_check_sum += i3 + i4 + Double.doubleToLongBits(d1) + i5 + i6 + Float.floatToIntBits(f1) + by + l + i7 +
            l1 + i8 + (b1 ? 1 : 0) + i9 + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(float f, double d, int i) {

        boolean b=true, bArr[][]=new boolean[N][N];
        int i1=-12, i2=23613;

        FuzzerUtils.init(bArr, false);

        b = b;
        for (i1 = 6; i1 < 346; i1++) {
            vMeth1(i1, 19919, 1.60224);
            switch (((i1 % 6) * 5) + 9) {
            case 14:
                bArr[i1][i1 - 1] = b;
            case 29:
                b = b;
            case 23:
                i -= (int)Test.instanceCount;
                Test.iFld |= i1;
                break;
            case 18:
                Test.instanceCount -= 35021;
                Test.instanceCount += (long)(80.944F + (i1 * i1));
                if (true) {
                    if (b) continue;
                    Test.fArrFld[i1 + 1] += -22;
                    Test.iArrFld[i1] = (int)Test.instanceCount;
                    Test.instanceCount *= Test.instanceCount;
                    vMeth_check_sum += Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i + (b ? 1 : 0) + i1 + i2
                        + FuzzerUtils.checkSum(bArr);
                    return;
                }
                break;
            case 17:
                d *= Test.instanceCount;
                break;
            case 12:
                Test.iFld = i2;
                break;
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i + (b ? 1 : 0) + i1 + i2 +
            FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {

        int i10=7, i11=7, i12=0, i13=15614, i14=-3, i15=14392, i16=11, i17=11;
        float f2=1.245F;
        long l2=-13L, l3=-56805L;
        boolean b2=false;
        byte by1=48;

        vMeth(-80.446F, Test.dFld, Test.iFld);
        i10 = 143;
        while ((i10 -= 2) > 0) {
            for (i11 = 16; i11 < 348; i11++) {
                f2 *= Test.instanceCount;
                for (i13 = 1; i13 < 2; i13++) {
                    Test.instanceCount <<= i11;
                    Test.iArrFld[i13] -= i14;
                    i12 >>= (int)l2;
                    l3 += i13;
                    f2 = l2;
                    i12 -= i13;
                    Test.iArrFld[i13 + 1] *= 26488;
                }
                i12 += i12;
                switch (((i14 >>> 1) % 10) + 118) {
                case 118:
                    i15 = 1;
                    while (++i15 < 2) {
                        i14 += (int)(0.620F + (i15 * i15));
                        try {
                            Test.iFld1 = (Test.iFld1 % i10);
                            Test.iFld1 = (-236 / i10);
                            i14 = (-1250984783 % i14);
                        } catch (ArithmeticException a_e) {}
                    }
                case 119:
                    b2 = b2;
                    i12 <<= (int)Test.instanceCount;
                    break;
                case 120:
                    i16 = 1;
                    while ((i16 += 3) < 2) {
                        Test.iFld1 -= Test.sFld;
                        l2 = by1;
                        i12 = by1;
                        Test.dFld += f2;
                        i14 += (i16 * i16);
                        try {
                            i12 = (Test.iFld / Test.iArrFld[i16 + 1]);
                            i12 = (i15 / i10);
                            i12 = (i16 % i10);
                        } catch (ArithmeticException a_e) {}
                        Test.iFld = i17;
                    }
                    break;
                case 121:
                    Test.iFld = i14;
                    Test.instanceCount = i15;
                    Test.dFld += by1;
                case 122:
                    l2 += i11;
                    break;
                case 123:
                    if (b2) break;
                    break;
                case 124:
                    Test.dFld -= i15;
                    break;
                case 125:
                    Test.dFld /= (l2 | 1);
                case 126:
                    Test.iFld1 += (((i11 * Test.iFld1) + i13) - i16);
                    break;
                case 127:
                default:
                    Test.iArrFld[i10 + 1] = i17;
                }
            }
        }

        FuzzerUtils.out.println("i10 i11 i12 = " + i10 + "," + i11 + "," + i12);
        FuzzerUtils.out.println("f2 i13 i14 = " + Float.floatToIntBits(f2) + "," + i13 + "," + i14);
        FuzzerUtils.out.println("l2 l3 i15 = " + l2 + "," + l3 + "," + i15);
        FuzzerUtils.out.println("b2 i16 by1 = " + (b2 ? 1 : 0) + "," + i16 + "," + by1);
        FuzzerUtils.out.println("i17 = " + i17);

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.iFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Test.iFld);
        FuzzerUtils.out.println("Test.dFld Test.iFld1 Test.fArrFld = " + Double.doubleToLongBits(Test.dFld) + "," +
            Test.iFld1 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}