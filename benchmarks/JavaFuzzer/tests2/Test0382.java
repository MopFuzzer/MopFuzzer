// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:29 2023
public class Test0382 {

    public static final int N = 400;

    public static long instanceCount=-102L;
    public static int iFld=-95;
    public static float fFld=-1.422F;
    public static short sFld=-22276;
    public static volatile double dFld=0.74596;
    public long lFld=-2339043320L;
    public static volatile float[] fArrFld =new float[N];
    public int[] iArrFld =new int[N];
    public double[] dArrFld =new double[N];

    static {
        FuzzerUtils.init(Test0382.fArrFld, -2.584F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i4) {

        long l=9L;

        i4 -= (int) Test0382.fFld;
        l = 1;
        while (++l < 313) {
            Test0382.iFld += (int) l;
            i4 *= (int)l;
        }
        vMeth2_check_sum += i4 + l;
    }

    public static void vMeth1(double d1) {

        float f=0.497F, f1=1.7F;
        int i=-12;
        int i1=-10;
        int i2=1;
        int i3=9;
        int i5=-11;
        int[] iArr =new int[N];
        byte by=56;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -2251116040L);
        FuzzerUtils.init(iArr, 187);

        Test0382.iFld -= (int) (-f);
        Test0382.iFld >>= Math.abs(Test0382.iFld);
        Test0382.fArrFld = (Test0382.fArrFld = (Test0382.fArrFld = (Test0382.fArrFld = Test0382.fArrFld)));
        for (i = 13; i < 355; i++) {
            for (i2 = 1; 5 > i2; i2++) {
                lArr[i2 + 1] >>= by;
                i1 -= (int)f;
                Test0382.instanceCount = Test0382.instanceCount;
            }
            Test0382.instanceCount >>>= i2;
        }
        vMeth2(Test0382.iFld);
        iArr[(i2 >>> 1) % N] &= (int) Test0382.instanceCount;
        i1 *= Test0382.iFld;
        for (f1 = 6; f1 < 155; ++f1) {
            Test0382.instanceCount -= i3;
        }
        i3 <<= Test0382.iFld;
        vMeth1_check_sum += Double.doubleToLongBits(d1) + Float.floatToIntBits(f) + i + i1 + i2 + i3 + by +
            Float.floatToIntBits(f1) + i5 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {

        int i6=-233;
        int i7=61211;
        int i8=-40222;
        int[] iArr1 =new int[N];
        long l1=-65147L;
        short s=-1542;
        byte by1=-46;

        FuzzerUtils.init(iArr1, -64);

        vMeth1(-34.2390);
        Test0382.iFld = Test0382.iFld;
        Test0382.iFld |= (int) Test0382.instanceCount;
        for (i6 = 8; i6 < 138; ++i6) {
            l1 = 1;
            do {
                i7 = (int) Test0382.instanceCount;
                Test0382.iFld = s;
                i7 *= i7;
                i7 = (int)l1;
                Test0382.iFld = (int) -16850L;
                i8 *= Test0382.iFld;
                switch (((i6 % 1) * 5) + 1) {
                case 5:
                    i7 += (int)l1;
                    break;
                default:
                    Test0382.iFld -= by1;
                    iArr1 = FuzzerUtils.int1array(N, (int)118);
                }
            } while (++l1 < 12);
        }
        vMeth_check_sum += i6 + i7 + l1 + s + i8 + by1 + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        double d=-1.126280;
        int i9=18, i10=69, i11=-14, i12=-3463, i13=-1;
        byte by2=-127;
        boolean b=true;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, -93068204188322457L);

        d = 1;
        while (++d < 333) {
            vMeth();
            Test0382.fFld = Test0382.iFld;
            iArrFld[(int) (d + 1)] = Test0382.iFld;
            for (i9 = 1; 76 > i9; i9++) {
                Test0382.iFld >>= by2;
                i10 += (int)d;
                Test0382.iFld ^= i9;
                by2 += (byte) (((i9 * Test0382.iFld) + Test0382.sFld) - Test0382.instanceCount);
                Test0382.iFld += i9;
            }
            if (b) {
                for (i11 = 4; i11 < 76; i11++) {
                    i12 = i10;
                    i13 = 1;
                    do {
                        Test0382.dFld = i12;
                        Test0382.fArrFld[i11] -= i12;
                        try {
                            i10 = (i10 / iArrFld[(int)(d + 1)]);
                            i12 = (i9 % 41087);
                            iArrFld[i13] = (Test0382.iFld / -72);
                        } catch (ArithmeticException a_e) {}
                        i12 >>= (int)-2L;
                        i12 >>= i13;
                        dArrFld[i13 - 1] -= Test0382.fFld;
                        Test0382.iFld += Test0382.iFld;
                        by2 += (byte) (((i13 * Test0382.instanceCount) + i12) - Test0382.fFld);
                    } while (++i13 < 2);
                    i12 += i10;
                    Test0382.instanceCount += (i11 * i12);
                    iArrFld[(int)(d)] |= i13;
                    Test0382.instanceCount -= 39927;
                    switch ((i11 % 9) + 93) {
                    case 93:
                        i12 += (((i11 * by2) + i9) - lFld);
                        iArrFld[(int)(d)] -= 14334;
                        lFld = Test0382.iFld;
                        break;
                    case 94:
                        Test0382.iFld += (int) -9126L;
                        break;
                    case 95:
                        Test0382.fFld += (i11 * i11);
                        break;
                    case 96:
                        lFld -= Test0382.sFld;
                    case 97:
                        Test0382.iFld -= i10;
                        break;
                    case 98:
                        i10 %= (int) ((long) (Test0382.fFld) | 1);
                        break;
                    case 99:
                        Test0382.instanceCount += i11;
                    case 100:
                        lArr1 = lArr1;
                        break;
                    case 101:
                        Test0382.instanceCount = 62787;
                        break;
                    }
                }
            } else if (b) {
                i12 += (int) Test0382.fFld;
            } else if (b) {
                Test0382.dFld *= i12;
            } else {
                i10 += (int)d;
            }
        }

        FuzzerUtils.out.println("d i9 i10 = " + Double.doubleToLongBits(d) + "," + i9 + "," + i10);
        FuzzerUtils.out.println("by2 i11 i12 = " + by2 + "," + i11 + "," + i12);
        FuzzerUtils.out.println("i13 b lArr1 = " + i13 + "," + (b ? 1 : 0) + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0382.instanceCount Test0382.iFld Test0382.fFld = " + Test0382.instanceCount + "," + Test0382.iFld +
                "," + Float.floatToIntBits(Test0382.fFld));
        FuzzerUtils.out.println("Test0382.sFld Test0382.dFld lFld = " + Test0382.sFld + "," + Double.doubleToLongBits(Test0382.dFld) +
            "," + lFld);
        FuzzerUtils.out.println("Test0382.fArrFld iArrFld dArrFld = " +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0382.fArrFld)) + "," + FuzzerUtils.checkSum(iArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0382 _instance = new Test0382();
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
