// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:23 2023
public class Test0253 {

    public static final int N = 400;

    public static long instanceCount=926733651L;
    public static double dFld=-127.82603;
    public short sFld=12791;
    public float[] fArrFld =new float[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i3, double d, float f2) {

        int[] iArr =new int[N];

        FuzzerUtils.init(iArr, 36794);

        iArr[(i3 >>> 1) % N] = i3;
        long meth_res = i3 + Double.doubleToLongBits(d) + Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(int i1, int i2, byte by) {

        float f3=114.816F;
        double d1=65.86720;
        int i4=118;
        int i5=-8;
        int i6=-60;
        int i7=6151;
        int i8=-109;
        int[] iArr1 =new int[N];
        boolean b=true;
        long l1=-3173329857L;

        FuzzerUtils.init(iArr1, 4);

        lMeth(13, -115.55979, f3);
        if (false) {
            iArr1[(i1 >>> 1) % N] *= i1;
            i1 &= (int) Test0253.instanceCount;
            for (d1 = 297; d1 > 18; d1 -= 2) {
                i5 = 11;
                do {
                    i1 |= i4;
                    f3 += (-202L + (i5 * i5));
                    for (i6 = (int)(d1); i6 < 1; i6++) {
                        i4 -= (int)f3;
                    }
                    i2 += i6;
                    i1 += (77 + (i5 * i5));
                    i8 = 1;
                    while (++i8 < 1) {
                        Test0253.instanceCount += (i8 ^ i8);
                        by -= (byte)f3;
                    }
                } while (--i5 > 0);
            }
        } else if (b) {
            i4 = i1;
        } else {
            i1 -= (int)l1;
        }
        vMeth1_check_sum += i1 + i2 + by + Float.floatToIntBits(f3) + Double.doubleToLongBits(d1) + i4 + i5 + i6 + i7 +
            i8 + (b ? 1 : 0) + l1 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(float f1, long l) {

        int i10=-11;
        byte by1=-60;

        vMeth1(i10, i10, by1);
        vMeth_check_sum += Float.floatToIntBits(f1) + l + i10 + by1;
    }

    public void mainTest(String[] strArr1) {

        float f=2.481F;
        int i=5;
        int i11=0;
        int i12=-12;
        int i13=31727;
        int i14=9;
        int i15=46;
        int[] iArr2 =new int[N];
        boolean b1=false, b2=false;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -3554487288L);
        FuzzerUtils.init(iArr2, 112);

        f = (fArrFld[(i >>> 1) % N] % ((i--) | 1));
        switch (((((int) (Test0253.instanceCount * 2)) >>> 1) % 2) + 79) {
        case 79:
            vMeth(f, Test0253.instanceCount);
        case 80:
        default:
            lArr[(4 >>> 1) % N] -= Test0253.instanceCount;
        }
        i -= -3801;
        for (i11 = 3; i11 < 291; ++i11) {
            i = i12;
            i13 = 1;
            do {
                i12 = i11;
                i12 *= (int) Test0253.dFld;
                try {
                    iArr2[i11 + 1] = (i11 / 14);
                    i = (i / 68);
                    i12 = (i / -37);
                } catch (ArithmeticException a_e) {}
                i12 -= i11;
                for (i14 = 1; i14 < 1; ++i14) {
                    byte by2=-35;
                    i *= i;
                    f += i;
                    i *= (int)165L;
                    sFld *= (short)i13;
                    lArr[i11] += i13;
                    i15 = (int) Test0253.instanceCount;
                    try {
                        i12 = (-45 % i13);
                        i = (i15 % i13);
                        iArr2[i11 + 1] = (i14 % -45506);
                    } catch (ArithmeticException a_e) {}
                    iArr2[i13 + 1] *= i15;
                    Test0253.instanceCount += (((i14 * i14) + i11) - by2);
                }
                f += f;
                i12 += i14;
            } while (++i13 < 87);
            iArr2[i11 + 1] += i13;
            i = i;
            iArr2[i11 + 1] <<= (int)31691L;
        }
        if (b1) {
            i += i13;
        } else if (b2) {
            i12 = i14;
        }

        FuzzerUtils.out.println("f i i11 = " + Float.floatToIntBits(f) + "," + i + "," + i11);
        FuzzerUtils.out.println("i12 i13 i14 = " + i12 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 b1 b2 = " + i15 + "," + (b1 ? 1 : 0) + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("lArr iArr2 = " + FuzzerUtils.checkSum(lArr) + "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test0253.instanceCount Test0253.dFld sFld = " + Test0253.instanceCount + "," +
                Double.doubleToLongBits(Test0253.dFld) + "," + sFld);
        FuzzerUtils.out.println("fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0253 _instance = new Test0253();
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