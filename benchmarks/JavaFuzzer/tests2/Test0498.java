// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:35 2023
public class Test0498 {

    public static final int N = 400;

    public static long instanceCount=-179550321922589556L;
    public static short sFld=18128;
    public static volatile boolean bFld=false;
    public static int[] iArrFld =new int[N];
    public static float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test0498.iArrFld, 8);
        FuzzerUtils.init(Test0498.fArrFld, -2.96F);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;

    public static void vSmallMeth(long l, int i, boolean b) {


        Test0498.iArrFld = (Test0498.iArrFld = Test0498.iArrFld);
        vSmallMeth_check_sum += l + i + (b ? 1 : 0);
    }

    public static byte byMeth(int i10, int i11) {


        i11 += i11;
        long meth_res = i10 + i11;
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static float fMeth(int i6) {

        int i7=26031, i8=-55952, i9=10;
        float f1=-87.415F;

        i6 &= (int) ((Math.max(i6, i6) - (i6 + Test0498.instanceCount)) * Test0498.iArrFld[(i6 >>> 1) % N]);
        i7 = 1;
        do {
            i6 += (i7 * i7);
            for (i8 = i7; 8 > i8; ++i8) {
                i6 ^= Test0498.iArrFld[i8];
                i6 = (int) (Math.max((int) (i9 / 5L), i7) - ((Test0498.instanceCount--) + (f1 - i9)));
                i6 -= -200;
                switch ((i8 % 2) + 117) {
                case 117:
                    Test0498.instanceCount *= (long) Double.longBitsToDouble(byMeth(i6, i6) + Test0498.instanceCount);
                case 118:
                    i9 = (int)f1;
                    i9 -= i8;
                    break;
                }
                if (Test0498.bFld) {
                    if (i6 != 0) {
                    }
                    i6 |= i9;
                    Test0498.instanceCount = i9;
                }
            }
        } while (++i7 < 195);
        long meth_res = i6 + i7 + i8 + i9 + Float.floatToIntBits(f1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static double dMeth(long l1, int i4) {

        int i5=-179;

        i5 = 1;
        while (++i5 < 391) {
            Test0498.sFld += (short) i5;
            if (i5 != 0) {
            }
            i4 <<= (int)-12L;
            try {
                i4 = (i4 / -29500);
                i4 = (i4 / -50534);
                i4 = (i4 / i4);
            } catch (ArithmeticException a_e) {}
            i4 += (int)(Math.abs(i5 + i5) + fMeth(i4));
        }
        long meth_res = l1 + i4 + i5;
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i1=26910, i2=-6, i3=221, i12=35859, i13=57770, i14=12, i15=-11, i16=9375, i17=181, i18=186;
        float f=0.123F;
        double d=0.53574;
        long l2=-1089542068307045676L;
        byte[] byArr =new byte[N];

        FuzzerUtils.init(byArr, (byte)126);

        for (int smallinvoc = 0; smallinvoc < 726; smallinvoc++)
            vSmallMeth(Test0498.instanceCount, (int) (((++i1) % ((long) (f)
                    | 1)) + ((i1 - i1) * (-6605454760224243535L * (d--)))), (Test0498.instanceCount + (Test0498.instanceCount - i1)) >=
            (-(i1 - i1)));
        i1 -= (++i1);
        for (i2 = 379; 20 < i2; --i2) {
            i3 <<= (int) (-9 / (((long) ((i3 * 17.863F) * (Test0498.sFld % (i2 | 1)))) | 1));
            d *= Math.min((int)(Integer.reverseBytes(i3) - dMeth(7L, i3)), i2);
            i1 += i3;
            Test0498.fArrFld[i2] = i3;
        }
        for (i12 = 11; i12 < 188; ++i12) {
            Test0498.instanceCount += i12;
            Test0498.instanceCount = Test0498.instanceCount;
            i1 >>= i13;
            for (i14 = 4; i14 < 142; ++i14) {
                i13 += i14;
                i13 -= (int)0L;
                byArr[i12 - 1] = (byte)i1;
                if (true) continue;
                for (i16 = 1; i16 < 2; i16++) {
                    i1 -= i12;
                    f = 0.127F;
                    i15 = i2;
                    i15 -= -8058;
                    f += i16;
                    i15 >>= 8;
                    if (false) continue;
                    i1 += i16;
                }
                i3 = i1;
                i13 ^= i16;
                i18 = 1;
                do {
                    Test0498.instanceCount -= -22;
                    i1 *= (int)l2;
                } while (++i18 < 2);
            }
        }

        FuzzerUtils.out.println("i1 f d = " + i1 + "," + Float.floatToIntBits(f) + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i2 i3 i12 = " + i2 + "," + i3 + "," + i12);
        FuzzerUtils.out.println("i13 i14 i15 = " + i13 + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("l2 byArr = " + l2 + "," + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test0498.instanceCount Test0498.sFld Test0498.bFld = " + Test0498.instanceCount + "," + Test0498.sFld +
                "," + (Test0498.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0498.iArrFld Test0498.fArrFld = " + FuzzerUtils.checkSum(Test0498.iArrFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0498.fArrFld)));

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0498 _instance = new Test0498();
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  fMeth ->  fMeth dMeth mainTest
//DEBUG  byMeth ->  byMeth fMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
