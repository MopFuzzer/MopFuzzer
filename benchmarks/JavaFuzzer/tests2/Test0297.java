// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:26 2023
public class Test0297 {

    public static final int N = 400;

    public static long instanceCount=1262342315L;
    public static float fFld=2.399F;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0297.iArrFld, 69);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i6) {

        int i7=198, i8=-5684, i9=12, i10=157, i11=-3;

        i6 = (int) Test0297.fFld;
        i6 = (int) Test0297.instanceCount;
        for (i7 = 18; i7 < 383; i7 += 3) {
            switch ((((i6 >>> 1) % 2) * 5) + 53) {
            case 61:
                Test0297.instanceCount += i7;
                Test0297.fFld = i6;
            case 56:
                Test0297.fFld += (i7 - i7);
                break;
            default:
                i8 += i7;
                i8 += (i7 * i7);
            }
            i8 += (i7 * i7);
            Test0297.instanceCount = i7;
            i9 = 1;
            while (++i9 < 13) {
                for (i10 = 1; i10 < 1; i10++) {
                    i6 -= i8;
                    Test0297.instanceCount = Test0297.instanceCount;
                }
            }
        }
        vMeth1_check_sum += i6 + i7 + i8 + i9 + i10 + i11;
    }

    public static void vMeth() {

        int i12=-14, i14=64325, i15=15900, i16=65259, i17=-5;
        boolean b=true;
        short s=-7293;
        byte by=-122;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -70906150234169880L);

        vMeth1(6);
        i12 = 1;
        do {
            int i13=56711;
            lArr[i12 + 1] = Test0297.instanceCount;
            b = b;
            Test0297.iArrFld[i12] += s;
            i13 <<= (int) Test0297.instanceCount;
            by = (byte) Test0297.instanceCount;
            for (i14 = i12; i14 < 7; ++i14) {
                for (i16 = 1; i16 > i14; i16 -= 3) {
                    i17 <<= 60178;
                    i15 *= (int) Test0297.instanceCount;
                    i13 >>= i13;
                    i17 *= i17;
                    i13 -= i17;
                    Test0297.iArrFld[i12] = (int) Test0297.instanceCount;
                }
            }
        } while (++i12 < 245);
        vMeth_check_sum += i12 + (b ? 1 : 0) + s + by + i14 + i15 + i16 + i17 + FuzzerUtils.checkSum(lArr);
    }

    public int iMeth(long l) {

        int i4=9;
        int i5=-19;
        int i18=9168;
        int i19=178;
        int[] iArr1 =new int[N];
        float f=0.584F;
        double d1=0.11716;
        double[] dArr =new double[N];
        long l1=981800728950682683L;

        FuzzerUtils.init(iArr1, 222);
        FuzzerUtils.init(dArr, -1.120541);

        iArr1[(i4 >>> 1) % N] += (int)dArr[(i4 >>> 1) % N];
        i4 += (int) ((-(i4 - 7L)) + (l - Math.abs(Test0297.instanceCount)));
        for (f = 3; f < 213; ++f) {
            vMeth();
            i4 -= 1;
            d1 += d1;
        }
        for (i18 = 303; i18 > 5; i18--) {
            i19 -= i4;
            iArr1[i18 - 1] = i5;
            Test0297.fFld = i4;
            Test0297.fFld = i5;
            i19 |= i4;
            i4 = (int)l1;
            i5 = (int)f;
            if (i4 != 0) {
            }
        }
        long meth_res = l + i4 + Float.floatToIntBits(f) + i5 + Double.doubleToLongBits(d1) + i18 + i19 + l1 +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=2;
        int i1=-114;
        int i2=247;
        int i3=-11;
        int i20=-175;
        int i21=22527;
        int i22=36095;
        int i23=50937;
        int i24=-2;
        int[] iArr =new int[N];
        boolean b1=true;
        byte by1=110;
        short s1=163;

        FuzzerUtils.init(iArr, 63);

        Test0297.instanceCount -= i;
        i1 = 1;
        while (++i1 < 133) {
            double d=-1.19805;
            iArr[i1] -= (int) ((Test0297.instanceCount++) + d);
            switch ((i1 % 1) + 32) {
            case 32:
                for (i2 = 188; i2 > 5; --i2) {
                    switch (((i2 % 6) * 5) + 18) {
                    case 36:
                        i3 = iMeth(Test0297.instanceCount);
                        break;
                    case 19:
                        iArr[i2 + 1] = (int) Test0297.instanceCount;
                        Test0297.instanceCount %= (i2 | 1);
                        i += i2;
                        for (i20 = 2; i20 > 1; --i20) {
                            i3 = i;
                            Test0297.instanceCount += (i20 ^ i20);
                            Test0297.fFld += i20;
                        }
                        break;
                    case 21:
                        i = i21;
                        Test0297.iArrFld[i2] -= (int) d;
                        break;
                    case 39:
                        i21 -= i20;
                        if (b1) {
                            i21 = (int) Test0297.instanceCount;
                            i21 *= i22;
                            i22 += (i2 | Test0297.instanceCount);
                            Test0297.iArrFld[i2 - 1] += (int) Test0297.instanceCount;
                        }
                        break;
                    case 44:
                        for (i23 = 1; i23 < 2; ++i23) {
                            by1 += (byte) (((i23 * Test0297.instanceCount) + i1) - s1);
                            d += s1;
                            Test0297.fFld += Test0297.instanceCount;
                            i3 = i2;
                            s1 /= (short) (Test0297.instanceCount | 1);
                            i += i22;
                        }
                        by1 = (byte)i24;
                        break;
                    case 38:
                        i21 = i;
                        break;
                    }
                }
                break;
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i20 i21 = " + i3 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 b1 i23 = " + i22 + "," + (b1 ? 1 : 0) + "," + i23);
        FuzzerUtils.out.println("i24 by1 s1 = " + i24 + "," + by1 + "," + s1);
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0297.instanceCount Test0297.fFld Test0297.iArrFld = " + Test0297.instanceCount + "," +
                Float.floatToIntBits(Test0297.fFld) + "," + FuzzerUtils.checkSum(Test0297.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0297 _instance = new Test0297();
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
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
