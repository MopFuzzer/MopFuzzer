// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:43 2023
public class Test0670 {

    public static final int N = 400;

    public static volatile long instanceCount=-28294L;
    public static short sFld=-28913;
    public static double dFld=0.103821;
    public static boolean bFld=true;
    public static float fFld=2.789F;
    public int iFld=-12;
    public long lFld=159L;
    public static int iFld1=7;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth() {

        int i5=-14;
        int i6=5;
        int i7=6;
        int i8=73;
        int i9=28806;
        int[] iArr1 =new int[N];
        byte by=7;

        FuzzerUtils.init(iArr1, 217);

        i5 = 378;
        do {
            if (Test0670.bFld) {
            } else if (Test0670.bFld) {
                if (true) {
                    iArr1 = FuzzerUtils.int1array(N, (int)7);
                } else {
                    for (i6 = 1; 12 > i6; ++i6) {
                        switch ((i5 % 7) + 75) {
                        case 75:
                            Test0670.instanceCount -= by;
                            for (i8 = 1; 2 > i8; i8++) {
                                Test0670.instanceCount = i7;
                                Test0670.instanceCount += (long) Test0670.dFld;
                                Test0670.instanceCount *= i7;
                                i7 &= (int) Test0670.instanceCount;
                                i7 -= -214;
                                Test0670.instanceCount >>= i5;
                                i9 += (((i8 * Test0670.instanceCount) + i8) - i9);
                            }
                            break;
                        case 76:
                            i9 += (int) Test0670.instanceCount;
                        case 77:
                            i9 -= 32546;
                        case 78:
                            i9 &= Test0670.sFld;
                            break;
                        case 79:
                            i7 = Test0670.sFld;
                            break;
                        case 80:
                            if (true) break;
                            break;
                        case 81:
                            iArr1[i5] += (int) Test0670.dFld;
                            break;
                        default:
                            i9 += (((i6 * Test0670.sFld) + Test0670.instanceCount) - i7);
                        }
                    }
                }
            } else if (true) {
                i9 += 140;
            } else {
                i7 -= 26;
            }
        } while ((i5 -= 3) > 0);
        long meth_res = i5 + i6 + i7 + by + i8 + i9 + FuzzerUtils.checkSum(iArr1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth1(long l, long l1) {

        int i2=19025;
        int i3=-11;
        int i4=4;
        int i10=2;
        int i11=52044;
        int[] iArr =new int[N];
        float[] fArr =new float[N];

        FuzzerUtils.init(iArr, 13378);
        FuzzerUtils.init(fArr, 43.807F);

        i2 = 342;
        do {
            for (i3 = 1; i3 < 14; i3++) {
                iArr[i3 + 1] <<= (int) (--Test0670.instanceCount);
                fArr[i3 - 1] += ((-(i4 >>= i3)) + (Test0670.sFld + i3));
            }
            i4 = (--i4);
            i4 += (int)(i4 = (int)(dMeth() - l));
            l1 = i3;
            iArr[i2] -= 4;
            iArr[i2] -= i2;
            Test0670.fFld = i2;
            for (i10 = 14; 1 < i10; --i10) {
                if (Test0670.bFld) continue;
                i4 += (((i10 * i2) + i4) - i10);
                Test0670.sFld += (short) (((i10 * i2) + l) - i10);
                i4 = i4;
            }
        } while ((i2 -= 3) > 0);
        vMeth1_check_sum += l + l1 + i2 + i3 + i4 + i10 + i11 + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(int i, int i1) {


        vMeth1(Test0670.instanceCount, -169L);
        i *= i;
        vMeth_check_sum += i + i1;
    }

    public void mainTest(String[] strArr1) {

        int i12=-63411, i13=91, i14=-5278, i15=7092, i16=185, i17=-47818, i18=-4;

        vMeth(iFld, 170);
        for (i12 = 14; i12 < 315; i12++) {
            for (i14 = i12; i14 < 84; i14++) {
                lFld += (long)-127.40F;
                Test0670.iFld1 -= i12;
            }
            i16 = 1;
            do {
                iFld = Test0670.iFld1;
                for (i17 = 1; 1 > i17; ++i17) {
                    Test0670.dFld *= Test0670.instanceCount;
                    if (Test0670.bFld) break;
                    i18 += (i17 - lFld);
                    i18 >>= (int) Test0670.instanceCount;
                }
                Test0670.instanceCount &= i12;
            } while (++i16 < 84);
        }
        lFld *= i14;
        Test0670.dFld += Test0670.iFld1;

        FuzzerUtils.out.println("i12 i13 i14 = " + i12 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 = " + i18);

        FuzzerUtils.out.println("Test0670.instanceCount Test0670.sFld Test0670.dFld = " + Test0670.instanceCount + "," + Test0670.sFld +
                "," + Double.doubleToLongBits(Test0670.dFld));
        FuzzerUtils.out.println("Test0670.bFld Test0670.fFld iFld = " + (Test0670.bFld ? 1 : 0) + "," +
                Float.floatToIntBits(Test0670.fFld) + "," + iFld);
        FuzzerUtils.out.println("lFld Test0670.iFld1 = " + lFld + "," + Test0670.iFld1);

        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0670 _instance = new Test0670();
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
//DEBUG  dMeth ->  dMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
