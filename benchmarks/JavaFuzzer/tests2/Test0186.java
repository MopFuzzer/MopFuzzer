// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:20 2023
public class Test0186 {

    public static final int N = 400;

    public static long instanceCount=-187L;
    public static int iFld=1;
    public static short sFld=-15905;
    public static float fFld=-66.680F;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i2=-6;
        int[] iArr =new int[N];
        float f=0.252F;

        FuzzerUtils.init(iArr, -219);

        Test0186.iFld *= Test0186.sFld;
        Test0186.iFld = 9423;
        iArr[(Test0186.iFld >>> 1) % N] *= Test0186.iFld;
        iArr[(-49 >>> 1) % N] >>= Test0186.iFld;
        Test0186.iFld = (int) Test0186.instanceCount;
        iArr[(Test0186.iFld >>> 1) % N] -= -44190;
        i2 = 1;
        do {
            Test0186.iFld *= (int) Test0186.instanceCount;
            Test0186.instanceCount ^= Test0186.iFld;
            switch ((i2 % 1) + 120) {
            case 120:
                switch ((((34851 >>> 1) % 1) * 5) + 66) {
                case 68:
                    Test0186.iFld += (i2 * i2);
                    break;
                }
                f = i2;
                iArr[i2] -= Test0186.iFld;
                iArr[i2 - 1] = i2;
            }
        } while (++i2 < 144);
        long meth_res = i2 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i, int i1) {

        boolean b=false;
        int i3=47740;
        int i4=-35158;
        int i5=7052;
        int i6=-77;
        int i7=58416;
        int i8=2;
        int i9=2;
        int i10=-30;
        int i11=-234;
        int[] iArr1 =new int[N];
        byte by=-67;
        byte[] byArr =new byte[N];
        long[] lArr1 =new long[N];
        short[] sArr =new short[N];
        double[] dArr =new double[N];

        FuzzerUtils.init(byArr, (byte)-23);
        FuzzerUtils.init(lArr1, 14L);
        FuzzerUtils.init(iArr1, 243);
        FuzzerUtils.init(sArr, (short)-26276);
        FuzzerUtils.init(dArr, -2.79389);

        b = ((iMeth() * Test0186.instanceCount) != Test0186.iFld);
        byArr[(-32 >>> 1) % N] >>= (byte)i3;
        by *= (byte)-191L;
        for (i4 = 6; i4 < 164; ++i4) {
            for (i6 = 1; 10 > i6; i6++) {
                lArr1[i6] = i7;
                i1 += Test0186.iFld;
                for (i8 = 1; 2 > i8; i8++) {
                    Test0186.instanceCount = -15;
                    iArr1[i4 - 1] = -156;
                    sArr[i6 - 1] += (short)i3;
                    i7 -= (int)424984402L;
                }
                for (i10 = 1; i10 < 2; ++i10) {
                    dArr[i6] = i8;
                    if (i4 != 0) {
                        vMeth1_check_sum += i + i1 + (b ? 1 : 0) + i3 + by + i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11 +
                            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr1) +
                            FuzzerUtils.checkSum(sArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                        return;
                    }
                }
            }
        }
        vMeth1_check_sum += i + i1 + (b ? 1 : 0) + i3 + by + i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11 +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(sArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth() {

        short s=-3010;
        boolean b1=true;
        double d=83.25842;
        int i12=178;
        int i13=-130;
        int[] iArr2 =new int[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -1058L);
        FuzzerUtils.init(iArr2, 13);

        if (b1) {
            s = (short) (Test0186.iFld + ((-Math.min(Test0186.iFld, 28213)) - (lArr[(Test0186.iFld >>> 1) % N] <<= -63343L)));
            Test0186.instanceCount = Test0186.iFld;
        } else if (b1) {
            Test0186.iFld += Test0186.iFld;
            Test0186.instanceCount >>= (Test0186.instanceCount++);
            vMeth1(Test0186.iFld, Test0186.iFld);
            Test0186.iFld -= Test0186.iFld;
        }
        for (d = 15; d < 292; ++d) {
            i13 = 1;
            do {
                s = (short)d;
                i12 -= 207;
                lArr[i13] = Test0186.iFld;
                i12 = Test0186.iFld;
                Test0186.iFld += (((i13 * i12) + Test0186.iFld) - Test0186.fFld);
                iArr2[(int) (d + 1)] = (int) Test0186.fFld;
            } while (++i13 < 6);
        }
        vMeth_check_sum += s + (b1 ? 1 : 0) + Double.doubleToLongBits(d) + i12 + i13 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {


        vMeth();


        FuzzerUtils.out.println("Test0186.instanceCount Test0186.iFld Test0186.sFld = " + Test0186.instanceCount + "," + Test0186.iFld +
                "," + Test0186.sFld);
        FuzzerUtils.out.println("Test0186.fFld = " + Float.floatToIntBits(Test0186.fFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0186 _instance = new Test0186();
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