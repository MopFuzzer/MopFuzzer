// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:21 2023
public class Test0204 {

    public static final int N = 400;

    public static volatile long instanceCount=139L;
    public int iFld=-119;
    public static double dFld=-56.10184;
    public static byte byFld=113;
    public long lFld=-180L;
    public boolean bFld=true;
    public double[] dArrFld =new double[N];

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth() {

        float f2=-2.353F;
        int i4=53, i5=-127, i6=-171, i7=29, i8=1, i9=113, i10=206, i11=11983;

        f2 -= (float) Test0204.dFld;
        i4 = 112;
        Test0204.dFld += i4;
        i4 *= i4;
        for (i5 = 8; i5 < 282; i5++) {
            i7 = 1;
            while (++i7 < 6) {
                i6 >>>= i6;
            }
            switch ((i5 % 2) + 125) {
            case 125:
                Test0204.instanceCount = Test0204.instanceCount;
                i6 = i4;
                f2 += (i5 * i4);
                for (i8 = 1; i8 < 6; i8++) {
                    for (i10 = 1; i10 < 2; i10++) {
                        i4 += (((i10 * i5) + i8) - Test0204.byFld);
                        f2 *= i6;
                    }
                }
                break;
            case 126:
                if (i11 != 0) {
                }
            }
        }
        long meth_res = Float.floatToIntBits(f2) + i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static long lMeth(boolean b) {

        float f1=53.256F;
        float f3=1.10F;
        float[][] fArr1 =new float[N][N];
        int i3=-19540;
        int i12=9;
        int i13=-45;
        int[] iArr =new int[N];
        long l1=16115L;
        long[] lArr =new long[N];
        short s=6415;

        FuzzerUtils.init(lArr, -4648490278374112841L);
        FuzzerUtils.init(fArr1, 2.941F);
        FuzzerUtils.init(iArr, -76);

        for (f1 = 187; f1 > 1; f1 -= 2) {
            lArr[(int) (f1)] = (long) (((Test0204.dFld * -36022) * (Test0204.instanceCount | Test0204.byFld)) * i3);
            fArr1[(int)(f1)][(int)(f1 - 1)] -= iArr[(int)(f1)];
            iArr[(int)(f1 + 1)] *= i3;
            Test0204.instanceCount *= (long) fMeth();
            i3 += (int) (((f1 * Test0204.instanceCount) + i3) - f1);
            for (l1 = 17; l1 > 1; l1 -= 2) {
                f3 -= i3;
                iArr[(int)(f1)] >>= s;
                i3 += (int) (((l1 * i3) + Test0204.instanceCount) - s);
                switch ((int)(((l1 % 4) * 5) + 11)) {
                case 19:
                    i12 = i12;
                    break;
                case 21:
                    i13 = 3;
                    while (--i13 > 0) {
                        f3 = 14;
                        s %= (short)(s | 1);
                    }
                    break;
                case 20:
                    iArr[(int) (l1)] -= (int) Test0204.instanceCount;
                    break;
                case 29:
                    i12 += (int)(l1 + i3);
                    break;
                }
            }
        }
        long meth_res = (b ? 1 : 0) + Float.floatToIntBits(f1) + i3 + l1 + i12 + Float.floatToIntBits(f3) + s + i13 +
            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) +
            FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(long l) {

        byte by1=66;
        int i2=162, i14=0, i15=-30360;
        boolean b1=false;
        float f4=2.750F;
        float[] fArr2 =new float[N];
        short s1=17039;

        FuzzerUtils.init(fArr2, 2.1003F);

        by1 <<= (byte)(by1 - ((i2++) * lMeth(b1)));
        for (i14 = 6; i14 < 196; ++i14) {
            Test0204.dFld %= -56321;
            f4 += i15;
            i15 -= (int) Test0204.instanceCount;
            s1 += (short) Test0204.instanceCount;
            Test0204.instanceCount -= (long) Test0204.dFld;
            if (b1) break;
            f4 -= Test0204.instanceCount;
            i15 = i14;
            if (false) break;
            i2 += (i14 + i14);
        }
        fArr2[(i14 >>> 1) % N] *= Test0204.instanceCount;
        i15 += i14;
        vMeth_check_sum += l + by1 + i2 + (b1 ? 1 : 0) + i14 + i15 + Float.floatToIntBits(f4) + s1 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2));
    }

    public void mainTest(String[] strArr1) {

        byte by=-88;
        int i=39681;
        int i1=12759;
        int i16=141;
        int i17=-3;
        int i18=-11;
        int i19=61625;
        int i20=48981;
        int i21=-92;
        int i22=5;
        int i23=-22671;
        int[] iArr1 =new
                    int[N];
        float f=2.62F;
        float[][] fArr =new float[N][N];
        double d=2.97041;
        short s2=-31838;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(fArr, 1.975F);
        FuzzerUtils.init(iArr1, -7551);
        FuzzerUtils.init(lArr1, -59186L);

        by &= (byte)(((dArrFld[(iFld >>> 1) % N]--) + (--iFld)) * (-by));
        for (i = 12; i < 250; i++) {
            f -= ((i1--) + (i + (210 * (fArr[i + 1][i]++))));
            vMeth(Test0204.instanceCount);
            switch (((iFld >>> 1) % 2) + 7) {
            case 7:
                switch ((i % 10) + 90) {
                case 90:
                    iFld = i;
                    for (d = 5; d < 106; ++d) {
                        f += (float)d;
                        s2 = (short) Test0204.instanceCount;
                        for (i17 = 2; i17 > 1; --i17) {
                            iArr1[(int)(d - 1)] = -216;
                            Test0204.instanceCount += i17;
                            i16 += i16;
                        }
                        iArr1[i - 1] += iFld;
                        f %= (lFld | 1);
                        for (i19 = (int)(d); i19 < 2; ++i19) {
                            i16 += -117;
                            f = i;
                            i1 = i18;
                        }
                    }
                    switch ((i % 6) + 58) {
                    case 58:
                        i20 ^= i;
                        lArr1[i - 1] ^= Test0204.instanceCount;
                        i18 <<= i20;
                        break;
                    case 59:
                        if (bFld) continue;
                        i21 = 1;
                        while (++i21 < 106) {
                            i1 = 25;
                            for (i22 = 1; i22 < 1; ++i22) {
                                lFld -= -49040;
                                i23 >>>= i20;
                            }
                        }
                        break;
                    case 60:
                        iFld += i;
                        break;
                    case 61:
                        iFld %= (int)((long)(f) | 1);
                    case 62:
                        i1 -= (int)lFld;
                        break;
                    case 63:
                        i23 = (int)125085592L;
                        break;
                    default:
                        i23 *= (int)f;
                    }
                    break;
                case 91:
                    lArr1[i + 1] <<= -10;
                case 92:
                    i16 += (((i * s2) + Test0204.instanceCount) - i1);
                    break;
                case 93:
                    i1 = i17;
                    break;
                case 94:
                    if (bFld) continue;
                    break;
                case 95:
                case 96:
                    try {
                        iFld = (-26848810 % iArr1[i]);
                        i18 = (iFld % i21);
                        i18 = (-18 % i16);
                    } catch (ArithmeticException a_e) {}
                case 97:
                    Test0204.instanceCount *= i23;
                    break;
                case 98:
                    i1 *= i19;
                    break;
                case 99:
                    i1 *= -7;
                }
                break;
            case 8:
                f += 79;
                break;
            default:
                i20 = -10599;
            }
        }

        FuzzerUtils.out.println("by i i1 = " + by + "," + i + "," + i1);
        FuzzerUtils.out.println("f d i16 = " + Float.floatToIntBits(f) + "," + Double.doubleToLongBits(d) + "," + i16);
        FuzzerUtils.out.println("s2 i17 i18 = " + s2 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 fArr = " + i22 + "," + i23 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("iArr1 lArr1 = " + FuzzerUtils.checkSum(iArr1) + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0204.instanceCount iFld Test0204.dFld = " + Test0204.instanceCount + "," + iFld + "," +
                Double.doubleToLongBits(Test0204.dFld));
        FuzzerUtils.out.println("Test0204.byFld lFld bFld = " + Test0204.byFld + "," + lFld + "," + (bFld ? 1 : 0));
        FuzzerUtils.out.println("dArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0204 _instance = new Test0204();
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  fMeth ->  fMeth lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
