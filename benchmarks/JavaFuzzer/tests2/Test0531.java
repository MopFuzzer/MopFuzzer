// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:37 2023
public class Test0531 {

    public static final int N = 400;

    public static volatile long instanceCount=8572465380388990997L;
    public byte byFld=-16;
    public static double dFld=69.102499;
    public static int iFld=-13;
    public float fFld=-77.449F;
    public short sFld=-27905;
    public int[] iArrFld =new int[N];

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(byte by, int i8) {

        int i9=8, i10=-9, i11=-219, i12=-23957, i13=15802;
        float f=61.1007F, f1=0.239F;
        boolean b=false;
        byte[] byArr =new byte[N];

        FuzzerUtils.init(byArr, (byte)45);

        Test0531.instanceCount &= i9;
        f *= Test0531.instanceCount;
        i9 -= i8;
        i8 *= i8;
        i9 += (int) Test0531.instanceCount;
        for (i10 = 222; i10 > 9; i10--) {
            i11 += i10;
            Test0531.instanceCount = i11;
            for (i12 = 8; 1 < i12; --i12) {
                f1 = 1;
                do {
                    i13 *= (int) Test0531.instanceCount;
                    Test0531.instanceCount <<= i12;
                    i8 += (int)(f1 + f);
                    byArr[(i11 >>> 1) % N] += (byte) Test0531.instanceCount;
                    b = b;
                } while (++f1 < 2);
            }
        }
        long meth_res = by + i8 + i9 + Float.floatToIntBits(f) + i10 + i11 + i12 + i13 + Float.floatToIntBits(f1) + (b
            ? 1 : 0) + FuzzerUtils.checkSum(byArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void vMeth() {

        int i5=164, i6=2, i7=-48, i14=8, i15=-57855;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, 55.264F);

        i5 = 1;
        do {
            for (i6 = 1; 5 > i6; i6++) {
                lMeth(byFld, 64222);
                i7 /= (int) (Test0531.instanceCount | 1);
                i7 -= i5;
                Test0531.dFld *= i6;
                for (i14 = 2; i14 > 1; i14 -= 2) {
                    i7 += i14;
                    Test0531.instanceCount = i5;
                    if (true) break;
                    iArrFld = iArrFld;
                    Test0531.iFld -= (int) 1.125619;
                }
                i7 >>= Test0531.iFld;
                i7 -= -76;
            }
            fArr[i5 + 1] = (float) Test0531.dFld;
        } while (++i5 < 339);
        vMeth_check_sum += i5 + i6 + i7 + i14 + i15 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public float fMeth() {

        int i16=-35477, i17=8, i18=-13334, i19=-11, i20=9687, i21=218;
        short s=-9789;

        vMeth();
        Test0531.dFld += Test0531.instanceCount;
        for (i16 = 275; i16 > 3; --i16) {
            i17 = i17;
            s += (short) Test0531.dFld;
            for (i18 = 1; i18 < 6; i18++) {
                for (i20 = 1; i20 < 2; ++i20) {
                    byFld += (byte) (((i20 * fFld) + i20) - Test0531.instanceCount);
                    i21 -= Test0531.iFld;
                    Test0531.iFld += i20;
                    i21 += (int) Test0531.dFld;
                    i19 += (i20 + Test0531.instanceCount);
                    i21 += (int) Test0531.instanceCount;
                    Test0531.iFld = (int) fFld;
                }
                Test0531.dFld -= i17;
            }
        }
        long meth_res = i16 + i17 + s + i18 + i19 + i20 + i21;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-33458, i1=-20089, i2=-209, i3=-12, i4=253, i22=783, i23=52890, i24=-33080, i25=120;
        long l=-35L;
        boolean b1=false;
        double d=2.50680;

        for (i = 5; i < 238; i++) {
            for (i2 = i; i2 < 108; i2++) {
                i3 += (int) ((-(i - i4)) + (Test0531.instanceCount + fMeth()));
                sFld = (short)i;
                fFld += i2;
                byFld = (byte) Test0531.iFld;
                for (l = 1; 1 < l; l--) {
                    i3 += Test0531.iFld;
                }
                for (i23 = 1; i23 < 1; ++i23) {
                    i1 += (-108 + (i23 * i23));
                    b1 = b1;
                }
                for (d = 1; d < 1; d++) {
                    i25 = i22;
                    sFld = (short)i25;
                    switch ((i % 8) + 104) {
                    case 104:
                        byFld += (byte)i3;
                        Test0531.dFld -= i4;
                        i1 -= (int)l;
                        break;
                    case 105:
                        Test0531.instanceCount = i;
                        i1 = i3;
                        break;
                    case 106:
                        Test0531.iFld *= 1;
                        break;
                    case 107:
                        Test0531.instanceCount -= (long) d;
                        Test0531.instanceCount -= (long) -1.68253;
                    case 108:
                        i4 += (int)(-1.98F + (d * d));
                        Test0531.iFld = i25;
                        Test0531.instanceCount += (long) (((d * i4) + i23) - i2);
                        Test0531.iFld += i1;
                        break;
                    case 109:
                        i1 += (int) (((d * i25) + Test0531.instanceCount) - fFld);
                        break;
                    case 110:
                        b1 = b1;
                    case 111:
                        i25 = (int)l;
                        break;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 l = " + i3 + "," + i4 + "," + l);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("b1 d i25 = " + (b1 ? 1 : 0) + "," + Double.doubleToLongBits(d) + "," + i25);

        FuzzerUtils.out.println("Test0531.instanceCount byFld Test0531.dFld = " + Test0531.instanceCount + "," + byFld + "," +
                Double.doubleToLongBits(Test0531.dFld));
        FuzzerUtils.out.println("Test0531.iFld fFld sFld = " + Test0531.iFld + "," + Float.floatToIntBits(fFld) + "," + sFld);
        FuzzerUtils.out.println("iArrFld = " + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0531 _instance = new Test0531();
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}