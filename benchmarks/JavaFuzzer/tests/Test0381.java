// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:02 2023
public class Test0381 {

    public static final int N = 400;

    public static long instanceCount = 196L;
    public static int iFld = 32835;
    public static short sFld = 605;
    public static boolean bFld = true;
    public static double dFld = -2.408;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public float fFld = -83.349F;

    public static long lMeth(int i2, short s, double d) {

        int i3 = -8;
        int i4 = -47316;
        int i5 = -23084;
        int[] iArr2 = new int[N];

        FuzzerUtils.init(iArr2, -22774);

        i3 = 1;
        do {
            if (Test0381.bFld) {
                Test0381.iFld += i3;
                Test0381.iFld = Test0381.iFld;
            } else {
                Test0381.iFld *= -147;
                for (i4 = 1; i4 < 5; ++i4) {
                    byte by = -29;
                    Test0381.instanceCount += (i4 - i3);
                    iArr2[i3] = i2;
                    Test0381.iFld -= Test0381.iFld;
                    by = (byte) i3;
                    i5 >>= -6028;
                }
            }
            Test0381.iFld *= (int) Test0381.instanceCount;
            i5 >>= Test0381.iFld;
            i2 = 6;
            Test0381.iFld += (i3 * i3);
        } while (++i3 < 375);
        long meth_res = i2 + s + Double.doubleToLongBits(d) + i3 + i4 + i5 + FuzzerUtils.checkSum(iArr2);
        lMeth_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void vMeth(int i) {

        float f = 18.806F;
        float[] fArr = new float[N];
        int i1 = -204;
        int i7 = 177;
        int i8 = 34178;
        int i9 = -124;
        int[] iArr1 = new int[N];
        byte by1 = 83;

        FuzzerUtils.init(iArr1, -5);
        FuzzerUtils.init(fArr, -1.436F);

        for (f = 1; f < 133; ++f) {
            iArr1[(int) (f + 1)] -= (Test0381.sFld++);
            if (i1 >= lMeth(i, Test0381.sFld, Test0381.dFld)) continue;
            Test0381.dFld += -1;
            fArr[(int) (f - 1)] *= -7786;
            for (i7 = (int) (f); i7 < 12; ++i7) {
                i9 = 1;
                while (++i9 < 1) {
                    Test0381.instanceCount |= i1;
                    iArr1[(int) (f - 1)] += 13;
                    i1 = i1;
                    i1 = i7;
                    by1 >>>= (byte) 52;
                    i8 = i7;
                    Test0381.instanceCount += (i9 * Test0381.iFld);
                    fArr[i9] -= -199;
                }
            }
        }
        vMeth_check_sum += i + Float.floatToIntBits(f) + i1 + i7 + i8 + i9 + by1 + FuzzerUtils.checkSum(iArr1) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void main(String[] strArr) {

        try {
            Test0381 _instance = new Test0381();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public int iMeth() {

        int i10 = 9;
        int i11 = -9;
        int i12 = 14;
        int i13 = -8;
        int[] iArr = new int[N];
        float f1 = -1.764F;
        float[] fArr1 = new float[N];

        FuzzerUtils.init(iArr, 61);
        FuzzerUtils.init(fArr1, -2.448F);

        iArr[(Test0381.iFld >>> 1) % N] |= (-(Math.abs(Test0381.iFld) * Test0381.iFld));
        vMeth(Test0381.iFld);
        for (i10 = 14; i10 < 320; ++i10) {
            for (f1 = 5; 1 < f1; f1 -= 3) {
                fFld = Test0381.instanceCount;
                Test0381.bFld = Test0381.bFld;
                switch ((int) (((f1 % 4) * 5) + 69)) {
                    case 84:
                        i12 += (int) (f1 - i11);
                    case 78:
                        Test0381.instanceCount += -251;
                        i13 = 1;
                        do {
                            Test0381.iFld += (i13 * i10);
                            Test0381.iFld *= (int) Test0381.instanceCount;
                            Test0381.instanceCount += Test0381.instanceCount;
                            fArr1[(int) (f1)] = f1;
                        } while ((i13 += 2) < 5);
                        break;
                    case 88:
                        i12 *= i10;
                    case 72:
                        Test0381.instanceCount -= i11;
                        break;
                }
            }
        }
        long meth_res = i10 + i11 + Float.floatToIntBits(f1) + i12 + i13 + FuzzerUtils.checkSum(iArr) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void mainTest(String[] strArr1) {


        Test0381.iFld = Test0381.iFld;
        Test0381.iFld *= (int) (iMeth() - Test0381.dFld);
        Test0381.instanceCount = (long) fFld;


        FuzzerUtils.out.println("Test0381.instanceCount Test0381.iFld Test0381.sFld = " + Test0381.instanceCount + "," + Test0381.iFld +
                "," + Test0381.sFld);
        FuzzerUtils.out.println("Test0381.bFld Test0381.dFld fFld = " + (Test0381.bFld ? 1 : 0) + "," +
                Double.doubleToLongBits(Test0381.dFld) + "," + Float.floatToIntBits(fFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
