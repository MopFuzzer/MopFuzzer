// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:09 2023
public class Test0659 {

    public static final int N = 400;

    public static long instanceCount = -45426L;
    public static float fFld = 0.260F;
    public static boolean bFld = false;

    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l1, int i6, double d1) {

        int[] iArr1 = new int[N];

        FuzzerUtils.init(iArr1, 27237);

        Test0659.fFld = i6;
        iArr1[(i6 >>> 1) % N] -= -81;
        i6 |= i6;
        long meth_res = l1 + i6 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public static short sMeth(long l) {

        int i3 = -15;
        int i4 = 211;
        int i5 = -238;
        int i7 = 3;
        int[] iArr = new int[N];
        double d = -51.93861;
        byte by = 33;
        boolean b1 = true;

        FuzzerUtils.init(iArr, -48);

        i3 = 1;
        do {
            if (true) continue;
            d = (~(long) ((l + d) - (i3 - 0.10510)));
            Test0659.instanceCount += (i3 * i3);
            by += (byte) i3;
            i4 += (i3 | i3);
            i4 += iArr[i3 - 1];
            i5 = 1;
            while (++i5 < 5) {
                b1 = (iMeth(2190L, i4, d) != -64796);
            }
            l = i4;
            iArr[i3 + 1] = (int) 1.15358;
        } while (++i3 < 362);
        Test0659.instanceCount >>= 9;
        i7 = 1;
        while ((i7 += 2) < 260) {
            i4 += (((i7 * i4) + i3) - i4);
            i4 += i7;
        }
        long meth_res = l + i3 + Double.doubleToLongBits(d) + by + i4 + i5 + (b1 ? 1 : 0) + i7 +
                FuzzerUtils.checkSum(iArr);
        sMeth_check_sum += meth_res;
        return (short) meth_res;
    }

    public static void main(String[] strArr) {

        try {
            Test0659 _instance = new Test0659();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void vMeth(int i1, int i2, boolean b) {


        sMeth(Test0659.instanceCount);
        vMeth_check_sum += i1 + i2 + (b ? 1 : 0);
    }

    public void mainTest(String[] strArr1) {

        int i = 13725;
        int i8 = -22;
        int i9 = 198;
        int i10 = -18;
        int i11 = -1;
        int i12 = 11060;
        int i13 = 153;
        int i14 = 10;
        int[] iArr2 = new int[N];
        double d2 = 1.125559;
        short s = 21501;
        float[] fArr = new float[N];

        FuzzerUtils.init(iArr2, 31406);
        FuzzerUtils.init(fArr, 0.406F);

        Test0659.instanceCount *= (((i >>> 33135) * (Test0659.instanceCount * i)) + (-(Test0659.instanceCount * i)));
        vMeth(i, i, Test0659.bFld);
        i8 = 1;
        while (++i8 < 213) {
            if (false) {
                for (i9 = 4; i9 < 118; ++i9) {
                    i10 += (int) Test0659.fFld;
                    for (i11 = 2; i11 > 1; --i11) {
                        iArr2[i8] &= (int) Test0659.instanceCount;
                        fArr[i8 + 1] = (float) d2;
                    }
                    Test0659.instanceCount ^= i9;
                    Test0659.fFld = -48649L;
                    iArr2[i8] = -238;
                    if (false) continue;
                    if (Test0659.bFld) {
                        Test0659.bFld = Test0659.bFld;
                        i12 += i9;
                        s = (short) i9;
                        i12 -= i9;
                    } else if (Test0659.bFld) {
                        for (i13 = 1; i13 < 2; i13 += 2) {
                            i14 = (int) Test0659.instanceCount;
                        }
                        i12 = (int) 1.46765;
                        i10 += (((i9 * Test0659.instanceCount) + i9) - s);
                        try {
                            i10 = (9469 / iArr2[i8 - 1]);
                            i = (i13 / -33950);
                            i14 = (139 / i13);
                        } catch (ArithmeticException a_e) {
                        }
                    } else {
                        i14 = -27635;
                        d2 -= 34766;
                        iArr2[i8 - 1] <<= i;
                    }
                    d2 += i;
                    i -= i11;
                    i14 = (int) -1323373423L;
                }
                s += (short) i14;
            } else if (Test0659.bFld) {
                Test0659.instanceCount = -133L;
            } else if (Test0659.bFld) {
                i14 += (i8 - Test0659.instanceCount);
            } else {
                Test0659.instanceCount = i8;
            }
        }

        FuzzerUtils.out.println("i i8 i9 = " + i + "," + i8 + "," + i9);
        FuzzerUtils.out.println("i10 i11 i12 = " + i10 + "," + i11 + "," + i12);
        FuzzerUtils.out.println("d2 s i13 = " + Double.doubleToLongBits(d2) + "," + s + "," + i13);
        FuzzerUtils.out.println("i14 iArr2 fArr = " + i14 + "," + FuzzerUtils.checkSum(iArr2) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0659.instanceCount Test0659.fFld Test0659.bFld = " + Test0659.instanceCount + "," +
                Float.floatToIntBits(Test0659.fFld) + "," + (Test0659.bFld ? 1 : 0));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  sMeth ->  sMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth sMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}