// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:32 2023
public class Test0428 {

    public static final int N = 400;

    public static long instanceCount=17021L;
    public static int iFld=11;
    public boolean bFld=true;
    public static short sFld=12162;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0428.iArrFld, -5689);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth() {

        float f1=-81.592F;
        int i4=155;
        int i5=-245;
        int i6=13;
        int[] iArr =new int[N];
        boolean b=true;
        boolean[] bArr =new boolean[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 8747959329027278693L);
        FuzzerUtils.init(iArr, 3);
        FuzzerUtils.init(bArr, false);

        lArr[(15088 >>> 1) % N] &= Test0428.iFld;
        Test0428.iFld -= Test0428.iFld;
        f1 += Test0428.iFld;
        iArr[(Test0428.iFld >>> 1) % N] = -253;
        Test0428.instanceCount += 37073;
        bArr[(Test0428.iFld >>> 1) % N] = false;
        Test0428.iFld += Test0428.iFld;
        i4 = 289;
        while (--i4 > 0) {
            if (b) {
                bArr[i4 - 1] = true;
                iArr[i4 - 1] <<= Test0428.iFld;
            } else if (false) {
                for (i5 = i4; i5 < 6; ++i5) {
                    i6 += (i5 * i4);
                }
                Test0428.iFld = Test0428.iFld;
                iArr[i4 - 1] = (int)f1;
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i4 + i5 + i6 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(bArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(int i2, long l, int i3) {

        double d=-2.88013;

        i3 += (int) ((Math.min(i2, i3) + Test0428.instanceCount) - (dMeth() + d));
        vMeth_check_sum += i2 + l + i3 + Double.doubleToLongBits(d);
    }

    public static void vSmallMeth(int i, float f, int i1) {


        vMeth(Test0428.iFld, Test0428.instanceCount, Test0428.iFld);
        Test0428.iFld = Test0428.iFld;
        vSmallMeth_check_sum += i + Float.floatToIntBits(f) + i1;
    }

    public void mainTest(String[] strArr1) {

        int i7=43, i8=-3, i9=2, i10=-1, i11=10, i12=-13, i13=217, i14=-3, i15=-1, i16=-58632, i17=-148;
        float f2=2.962F;
        double d1=111.3643;
        long l1=6951521592449035135L;
        long[] lArr1 =new long[N];
        byte by=86;

        FuzzerUtils.init(lArr1, 98L);

        for (int smallinvoc = 0; smallinvoc < 142; smallinvoc++) vSmallMeth(5, -1.886F, Test0428.iFld);
        Test0428.instanceCount = Test0428.iFld;
        i7 = 178;
        while ((i7 -= 3) > 0) {
            for (i8 = 306; i8 > i7; i8 -= 3) {
                try {
                    Test0428.iFld = (i8 % 46);
                    Test0428.iFld = (i8 / -6464);
                    i9 = (Test0428.iFld % -219);
                } catch (ArithmeticException a_e) {}
            }
            i9 -= i7;
            Test0428.iFld = i7;
            Test0428.iFld += (((i7 * i9) + Test0428.instanceCount) - f2);
            i10 = 1;
            do {
                Test0428.iArrFld[i7 + 1] = (int) Test0428.instanceCount;
                if (bFld) break;
                Test0428.instanceCount += (((i10 * Test0428.instanceCount) + i9) - i10);
            } while (++i10 < 174);
            Test0428.sFld += (short) i10;
            for (i11 = 7; i11 < 170; i11++) {
                Test0428.instanceCount = (long) d1;
                Test0428.iArrFld[i11] = i12;
                for (i13 = i7; i13 < 3; i13++) {
                    Test0428.instanceCount = i9;
                    d1 -= Test0428.instanceCount;
                }
                lArr1[i7 - 1] -= (long)d1;
                i15 = 1;
                do {
                    l1 *= i12;
                    i9 -= -14;
                    by -= (byte) Test0428.instanceCount;
                } while (++i15 < 3);
                f2 = Test0428.iFld;
                for (i16 = 1; i16 < 3; ++i16) {
                    Test0428.iFld *= (int) Test0428.instanceCount;
                    Test0428.iArrFld[i11 - 1] = i16;
                    i17 -= -2;
                    Test0428.instanceCount >>= i10;
                }
            }
        }

        FuzzerUtils.out.println("i7 i8 i9 = " + i7 + "," + i8 + "," + i9);
        FuzzerUtils.out.println("f2 i10 i11 = " + Float.floatToIntBits(f2) + "," + i10 + "," + i11);
        FuzzerUtils.out.println("i12 d1 i13 = " + i12 + "," + Double.doubleToLongBits(d1) + "," + i13);
        FuzzerUtils.out.println("i14 i15 l1 = " + i14 + "," + i15 + "," + l1);
        FuzzerUtils.out.println("by i16 i17 = " + by + "," + i16 + "," + i17);
        FuzzerUtils.out.println("lArr1 = " + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0428.instanceCount Test0428.iFld bFld = " + Test0428.instanceCount + "," + Test0428.iFld + "," +
            (bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0428.sFld Test0428.iArrFld = " + Test0428.sFld + "," + FuzzerUtils.checkSum(Test0428.iArrFld));

        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0428 _instance = new Test0428();
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  dMeth ->  dMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}