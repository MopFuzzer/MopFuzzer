// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:54 2023
public class Test0050 {

    public static final int N = 400;

    public static long instanceCount = 4024905480L;
    public static volatile short sFld = -6607;
    public static float fFld = 127.152F;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i9 = 34869;
        int i11 = -160;
        int i12 = -54006;
        int i13 = -19;
        int[] iArr1 = new int[N];
        float f = 2.168F, f1 = 42.6F;
        byte by1 = -59;
        long l1 = 33759L;
        short[] sArr = new short[N];

        FuzzerUtils.init(iArr1, -103);
        FuzzerUtils.init(sArr, (short) 16084);

        Test0050.instanceCount *= i9;
        f += i9;
        for (int i10 : iArr1) {
            for (f1 = 1; f1 < 4; ++f1) {
                by1 = (byte) i9;
                Test0050.instanceCount /= (l1 | 1);
                try {
                    i10 = (i11 / i11);
                    i11 = (i10 % 37953);
                    i10 = (36217 / iArr1[(int) (f1)]);
                } catch (ArithmeticException a_e) {
                }
                i9 -= i11;
                i11 = Test0050.sFld;
                Test0050.instanceCount = i10;
                i10 += (int) (((f1 * i11) + Test0050.instanceCount) - i9);
                for (i12 = 1; i12 < 2; i12++) {
                    sArr[i12] = (short) 12;
                }
            }
            i11 = i12;
            i9 *= i13;
        }
        long meth_res = i9 + Float.floatToIntBits(f) + Float.floatToIntBits(f1) + i11 + by1 + l1 + i12 + i13 +
                FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void vMeth1() {

        byte by = -13;
        int i14 = 8;
        int i15 = -222;
        int i16 = -2845;
        int[] iArr2 = new int[N];
        boolean b = true;
        boolean[] bArr = new boolean[N];
        long l2 = 45461L, l3 = -26997L;

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(iArr2, -12);

        by = (byte) (((-iMeth()) + Test0050.fFld) - -24486);
        i14 -= i14;
        i15 = 1;
        while (++i15 < 290) {
            i14 %= (int) -123.66195;
            if (i14 != 0) {
                vMeth1_check_sum += by + i14 + i15 + (b ? 1 : 0) + l2 + l3 + i16 + FuzzerUtils.checkSum(bArr) +
                        FuzzerUtils.checkSum(iArr2);
                return;
            }
            bArr[i15] = b;
            i14 = (int) l2;
            i14 -= -47518;
            i14 += i15;
            for (l3 = 1; 6 > l3; ++l3) {
                i14 *= (int) Test0050.fFld;
                by *= (byte) Test0050.fFld;
                i14 = i15;
                iArr2[i15] >>= (int) Test0050.instanceCount;
                i16 += (int) (l3 ^ l2);
            }
        }
        vMeth1_check_sum += by + i14 + i15 + (b ? 1 : 0) + l2 + l3 + i16 + FuzzerUtils.checkSum(bArr) +
                FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth(int i8, long l) {

        int i17 = -4, i18 = 9, i19 = -38879, i20 = 218, i21 = -155;
        long l4 = -208L;
        long[] lArr1 = new long[N];
        boolean b1 = false;
        double[] dArr = new double[N];

        FuzzerUtils.init(lArr1, 56273L);
        FuzzerUtils.init(dArr, -2.91886);

        vMeth1();
        i8 += i8;
        lArr1[(i8 >>> 1) % N] = i8;
        for (i17 = 188; i17 > 10; --i17) {
            for (i19 = 1; i19 < 9; ++i19) {
                i21 -= i20;
                l4 = 1;
                while (++l4 < 2) {
                    double d2 = -2.41451;
                    i18 >>= i21;
                    i20 += (int) (l4 | i18);
                    d2 = Test0050.fFld;
                    Test0050.instanceCount += (l4 * l4);
                    if (b1) {
                        dArr = FuzzerUtils.double1array(N, (double) 0.9265);
                        l = 51402L;
                        i21 += (int) (l4 * l4);
                    }
                }
            }
        }
        vMeth_check_sum += i8 + l + i17 + i18 + i19 + i20 + i21 + l4 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr1) +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void main(String[] strArr) {

        try {
            Test0050 _instance = new Test0050();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void mainTest(String[] strArr1) {

        int i = -58941;
        int i1 = -108;
        int i2 = 7;
        int i3 = -239;
        int i4 = -14302;
        int i5 = -34063;
        int i6 = -16598;
        int i7 = 23;
        int i22 = -62;
        int i23 = 5;
        int i24 = 27362;
        int[] iArr = new int[N];
        double d = 2.70995, d1 = -22.55068;
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, 18757L);
        FuzzerUtils.init(iArr, 56901);

        for (i = 3; i < 174; ++i) {
            for (i2 = i; i2 < 147; i2++) {
                for (i4 = 1; i4 > 1; --i4) {
                    d -= Math.abs((int) (i5 & (long) (0.472F * (-4096630194665624969L + (d = 29716)))));
                    i3 += i4;
                }
            }
            i3 = -179;
            for (i6 = 4; i6 < 147; ++i6) {
                i3 -= (int) (((i + i7) + (--i1)) + (lArr[i6] <<= (iArr[i6] -= i)));
                d1 = 1;
                do {
                    Test0050.instanceCount += (long) (iArr[i6 + 1] + ((i2 + Test0050.sFld) * (0.517F + iArr[i6 - 1])));
                    i3 += (int) ((long) d1 | i4);
                    i7 -= (--i1);
                } while (++d1 < 2);
                vMeth(i3, Test0050.instanceCount);
                Test0050.fFld += Test0050.fFld;
                iArr[i] = (int) Test0050.instanceCount;
                switch ((((i3 >>> 1) % 2) * 5) + 116) {
                    case 119:
                        Test0050.instanceCount += i6;
                        i1 += i6;
                        break;
                    case 126:
                        Test0050.fFld = i1;
                        Test0050.fFld *= -9L;
                        iArr[i] *= i2;
                    default:
                        iArr[i - 1] += -7;
                        d = i6;
                        d -= i1;
                        i1 += i6;
                }
                Test0050.instanceCount += Test0050.instanceCount;
                for (i22 = 1; i22 < 2; ++i22) {
                    Test0050.instanceCount >>= i3;
                    try {
                        iArr[i] = (i23 % 21);
                        i24 = (i23 / -129);
                        iArr[i22 + 1] = (iArr[i22 + 1] % i24);
                    } catch (ArithmeticException a_e) {
                    }
                }
                Test0050.instanceCount += (94 + (i6 * i6));
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 i5 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("d i6 i7 = " + Double.doubleToLongBits(d) + "," + i6 + "," + i7);
        FuzzerUtils.out.println("d1 i22 i23 = " + Double.doubleToLongBits(d1) + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 lArr iArr = " + i24 + "," + FuzzerUtils.checkSum(lArr) + "," +
                FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0050.instanceCount Test0050.sFld Test0050.fFld = " + Test0050.instanceCount + "," + Test0050.sFld +
                "," + Float.floatToIntBits(Test0050.fFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
