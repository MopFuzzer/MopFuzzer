// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:17 2023
public class Test0101 {

    public static final int N = 400;

    public static long instanceCount=49L;
    public static boolean bFld=true;
    public static float fFld=72.506F;
    public double dFld=-2.37192;
    public long lFld=215L;
    public static int[] iArrFld =new int[N];
    public double[] dArrFld =new double[N];
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0101.iArrFld, 105);
        FuzzerUtils.init(Test0101.lArrFld, 100L);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i7, double d, int i8) {

        int i9=-2, i10=16140, i11=-97, i12=129, i13=13, i14=131;
        short s1=6369;
        float f2=-9.996F;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, 114.909F);

        for (i9 = 14; i9 < 374; ++i9) {
            for (i11 = 5; i11 > 1; i11--) {
                for (i13 = 1; i13 < 2; i13 += 3) {
                    Test0101.instanceCount = i14;
                    i12 >>= s1;
                    i12 = i10;
                    Test0101.instanceCount += i11;
                    i7 >>= i9;
                    f2 -= -6;
                    i14 += i13;
                    if (false) break;
                    i12 = i10;
                }
                d = -14;
                Test0101.instanceCount -= i13;
                fArr[i11 + 1] *= Test0101.instanceCount;
            }
        }
        long meth_res = i7 + Double.doubleToLongBits(d) + i8 + i9 + i10 + i11 + i12 + i13 + i14 + s1 +
            Float.floatToIntBits(f2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i3, int i4, float f1) {

        int i5=-24808, i6=-56871, i15=4, i16=50262, i17=1, i18=0;
        short s=-27648;
        double d1=0.70976;
        long l=-2032455832L, l1=2579053569293737949L;

        for (i5 = 2; i5 < 146; ++i5) {
            if (i3 != 0) {
                vMeth_check_sum += i3 + i4 + Float.floatToIntBits(f1) + i5 + i6 + s + Double.doubleToLongBits(d1) + i15
                    + i16 + l + i17 + i18 + l1;
                return;
            }
            s <<= (short)i3;
            i4 += ((Test0101.iArrFld[i5 - 1]--) + iMeth(13, d1, i6));
            for (i15 = 1; i15 < 11; i15++) {
                switch ((i5 % 3) + 58) {
                case 58:
                    i6 *= -161;
                    for (l = 1; l < 2; ++l) {
                        i18 += i17;
                        Test0101.bFld = Test0101.bFld;
                        if (Test0101.bFld) {
                            i16 += (14 + (l * l));
                            Test0101.iArrFld[i15 + 1] = (int) l;
                            i17 += (int)(((l * i3) + i17) - l1);
                            vMeth_check_sum += i3 + i4 + Float.floatToIntBits(f1) + i5 + i6 + s +
                                Double.doubleToLongBits(d1) + i15 + i16 + l + i17 + i18 + l1;
                            return;
                        }
                    }
                    i3 <<= i16;
                    break;
                case 59:
                    if (Test0101.bFld) break;
                    break;
                case 60:
                    l1 += i15;
                    break;
                }
            }
        }
        vMeth_check_sum += i3 + i4 + Float.floatToIntBits(f1) + i5 + i6 + s + Double.doubleToLongBits(d1) + i15 + i16 +
            l + i17 + i18 + l1;
    }

    public static long lMeth(float f) {

        int i19=0;
        long l2=-5043010053865539573L;

        vMeth(227, i19, 0.699F);
        Test0101.instanceCount += l2;
        long meth_res = Float.floatToIntBits(f) + i19 + l2;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=14386, i1=215, i2=-7, i20=-99, i21=-16593, i22=-3, i23=11, i24=2589, i25=-45094, i26=-6026;
        short s2=-18280;
        float[] fArr1 =new float[N];

        FuzzerUtils.init(fArr1, -2.737F);

        i *= -22134;
        for (i1 = 4; i1 < 181; i1++) {
            i2 &= i2;
            Test0101.instanceCount = lMeth(Test0101.fFld);
            i2 ^= i;
            i = i1;
            Test0101.instanceCount = (long) -1.82913;
        }
        i20 = 1;
        while (++i20 < 148) {
            dFld *= -118;
            for (i21 = 7; 169 > i21; i21++) {
                Test0101.instanceCount += (i21 + i21);
                s2 = (short)2.80413;
                s2 *= (short)i2;
                i23 = (int)-3291359588L;
                i23 += (int)(-316416796975824606L + (i21 * i21));
                if (Test0101.bFld) {
                    dArrFld[(i2 >>> 1) % N] -= i21;
                    i >>= s2;
                    dFld -= i20;
                }
                switch ((i21 % 2) + 108) {
                case 108:
                    lFld <<= i1;
                    lFld -= (long)-2.614F;
                    if (Test0101.bFld) continue;
                    break;
                case 109:
                    Test0101.lArrFld[i21 + 1] = lFld;
                    for (i24 = 1; i24 < 2; ++i24) {
                        i23 += i24;
                        Test0101.lArrFld[i20] = i25;
                        i -= (int) Test0101.fFld;
                        Test0101.instanceCount += (((i24 * i20) + i26) - i22);
                        fArr1[(i1 >>> 1) % N] *= 253;
                    }
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("s2 i23 i24 = " + s2 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 fArr1 = " + i25 + "," + i26 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test0101.instanceCount Test0101.bFld Test0101.fFld = " + Test0101.instanceCount + "," + (Test0101.bFld ? 1
                : 0) + "," + Float.floatToIntBits(Test0101.fFld));
        FuzzerUtils.out.println("dFld lFld Test0101.iArrFld = " + Double.doubleToLongBits(dFld) + "," + lFld + "," +
                FuzzerUtils.checkSum(Test0101.iArrFld));
        FuzzerUtils.out.println("dArrFld Test0101.lArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)) +
                "," + FuzzerUtils.checkSum(Test0101.lArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0101 _instance = new Test0101();
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
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}