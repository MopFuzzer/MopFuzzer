// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:35 2023
public class Test0503 {

    public static final int N = 400;

    public static long instanceCount=32L;
    public static int iFld=19745;
    public static byte byFld=-46;
    public int iFld1=-125;
    public short sFld=-28889;
    public float fFld=0.502F;

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(boolean b) {

        float f1=-125.857F, f2=2.267F;
        short s=-3897;
        short[] sArr =new short[N];
        int i2=97;
        int i3=-13;
        int i4=4;
        int i5=14;
        int i6=-62;
        int[] iArr =new int[N];
        long l=3174707402310533822L;
        byte by=-12;
        double d=108.6719;

        FuzzerUtils.init(sArr, (short)19588);
        FuzzerUtils.init(iArr, -31357);

        Test0503.instanceCount = (long) f1;
        f1 *= s;
        for (f2 = 15; f2 < 311; ++f2) {
            switch ((int)((f2 % 10) + 111)) {
            case 111:
                sArr[(int)(f2 - 1)] += s;
                break;
            case 112:
                i2 -= (int)3594628908L;
                for (l = 1; 6 > l; l++) {
                    Test0503.instanceCount = i3;
                    Test0503.instanceCount = i3;
                    i2 -= s;
                    i2 += i3;
                }
                for (i4 = (int)(f2); i4 < 6; ++i4) {
                    iArr[(int) (f2 - 1)] = (int) Test0503.instanceCount;
                    by = (byte)i4;
                    iArr[i4 + 1] = (int)f1;
                }
                break;
            case 113:
                iArr[(int)(f2)] *= i4;
                break;
            case 114:
                i3 += (int)(f2 * f2);
                break;
            case 115:
                Test0503.instanceCount >>>= i4;
                break;
            case 116:
                Test0503.iFld -= i6;
            case 117:
            case 118:
                d *= s;
                break;
            case 119:
                Test0503.instanceCount >>= i6;
                break;
            case 120:
                i3 >>= by;
                break;
            default:
                Test0503.instanceCount = Test0503.instanceCount;
            }
        }
        long meth_res = (b ? 1 : 0) + Float.floatToIntBits(f1) + s + Float.floatToIntBits(f2) + i2 + l + i3 + i4 + i5 +
            by + i6 + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static int iMeth(int i1) {

        float f=2.170F;
        double d1=0.91044;
        int i7=-57714;
        int i8=60;
        int i9=-14;
        int i10=9317;
        int[] iArr1 =new int[N];
        long l1=-2062175521L;

        FuzzerUtils.init(iArr1, 54);

        f *= (fMeth(false) + Test0503.instanceCount);
        for (d1 = 7; d1 < 154; d1++) {
            switch (((Test0503.iFld >>> 1) % 2) + 91) {
            case 91:
                iArr1 = iArr1;
                i7 *= i7;
                break;
            case 92:
                Test0503.iFld += (int) d1;
                i1 -= i7;
                break;
            }
            Test0503.instanceCount *= Test0503.instanceCount;
            Test0503.instanceCount = 5;
            for (i8 = (int)(d1); i8 < 11; ++i8) {
                i1 -= Test0503.byFld;
                for (l1 = 1; 1 > l1; ++l1) {
                    i10 = (int)-3446214593238505123L;
                    Test0503.instanceCount += i1;
                    if (i7 != 0) {
                    }
                }
            }
        }
        long meth_res = i1 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i7 + i8 + i9 + l1 + i10 +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public long lMeth(int i) {

        int i11=3;
        int i12=2;
        int[] iArr2 =new int[N];
        double d2=-9.97587;
        double[] dArr =new double[N];

        FuzzerUtils.init(iArr2, -174);
        FuzzerUtils.init(dArr, 2.82414);

        i -= iMeth(i);
        iArr2[(iFld1 >>> 1) % N] >>= (int) Test0503.instanceCount;
        dArr[(i >>> 1) % N] += iFld1;
        i &= sFld;
        i11 = 1;
        do {
            d2 -= i;
            Test0503.instanceCount = iFld1;
            iFld1 += (i11 - Test0503.instanceCount);
            i12 = 1;
            while (++i12 < 13) {
                iFld1 -= 60015;
                sFld *= (short)i11;
                i = i12;
                fFld += (i12 - Test0503.instanceCount);
                Test0503.instanceCount *= (long) d2;
                Test0503.iFld += (((i12 * i11) + i12) - i11);
            }
        } while (++i11 < 123);
        long meth_res = i + i11 + Double.doubleToLongBits(d2) + i12 + FuzzerUtils.checkSum(iArr2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i13=30860;
        int i14=42671;
        int i15=-154;
        int i16=49389;
        int i17=-9;
        int i18=-2;
        int i19=-28507;
        int i20=232;
        int i21=-1;
        int[] iArr3 =new int[N];
        float f3=19.333F;
        float f4=125.27F;
        float[] fArr =new float[N];
        boolean b1=true;
        double d3=18.95786;

        FuzzerUtils.init(iArr3, -36135);
        FuzzerUtils.init(fArr, -1.864F);

        lMeth(Test0503.iFld);
        for (i13 = 2; i13 < 222; ++i13) {
            for (i15 = i13; 114 > i15; ++i15) {
                iFld1 = iFld1;
                Test0503.instanceCount *= (long) f3;
                iArr3[i13] += (int)1.65186;
                i14 += (int) Test0503.instanceCount;
                Test0503.instanceCount <<= i14;
                f3 -= Test0503.byFld;
            }
            if (b1) {
                f3 += (2448277179L + (i13 * i13));
                Test0503.iFld = iFld1;
            } else {
                iFld1 += (-1 + (i13 * i13));
                f4 += i16;
                i17 = 114;
                while (--i17 > 0) {
                    Test0503.iFld -= (int) Test0503.instanceCount;
                    Test0503.iFld += (((i17 * iFld1) + i16) - i15);
                    Test0503.instanceCount += i17;
                    switch ((((i14 >>> 1) % 6) * 5) + 13) {
                    case 31:
                        i14 += i17;
                        Test0503.instanceCount += (long) 86.85F;
                    case 22:
                        for (i18 = 1; i18 > 1; i18--) {
                            iArr3[i13] = (int) Test0503.instanceCount;
                        }
                        f3 *= i18;
                        i19 += i17;
                        f4 += 7;
                        break;
                    case 33:
                        if (b1) continue;
                        for (i20 = 1; i20 < 1; i20++) {
                            Test0503.instanceCount *= (long) fFld;
                            sFld += (short)(i20 * i20);
                        }
                        break;
                    case 38:
                        fArr[i13] += Test0503.iFld;
                        break;
                    case 28:
                        Test0503.instanceCount += i17;
                    case 37:
                        iFld1 >>= i20;
                        break;
                    default:
                        i19 -= (int)d3;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i13 i14 i15 = " + i13 + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 f3 b1 = " + i16 + "," + Float.floatToIntBits(f3) + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("f4 i17 i18 = " + Float.floatToIntBits(f4) + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("d3 iArr3 fArr = " + Double.doubleToLongBits(d3) + "," + FuzzerUtils.checkSum(iArr3) +
            "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0503.instanceCount Test0503.iFld Test0503.byFld = " + Test0503.instanceCount + "," + Test0503.iFld +
                "," + Test0503.byFld);
        FuzzerUtils.out.println("iFld1 sFld fFld = " + iFld1 + "," + sFld + "," + Float.floatToIntBits(fFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0503 _instance = new Test0503();
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  fMeth ->  fMeth iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
