// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:53 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1L;
    public int iFld=-1;
    public static short sFld=-15733;
    public static float fFld=89.988F;
    public double dFld=-103.48767;
    public int iArrFld[]=new int[N];

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i8, int i9, float f2) {

        byte by=-86;
        int i10=11, i11=10;
        boolean b=false;
        double dArr[]=new double[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(dArr, -1.129841);
        FuzzerUtils.init(lArr, 161L);

        for (double d : dArr) {
            i8 *= i9;
            Test.instanceCount >>>= Test.instanceCount;
            by -= (byte)i9;
            if (b) {
                lArr = lArr;
                for (i10 = 1; i10 < 4; i10++) {
                    long l=3634311182L;
                    if (i11 != 0) {
                        vMeth1_check_sum += i8 + i9 + Float.floatToIntBits(f2) + by + i10 + i11 + (b ? 1 : 0) +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr);
                        return;
                    }
                    i11 = i8;
                    Test.sFld >>= (short)i8;
                    switch ((((i8 >>> 1) % 5) * 5) + 101) {
                    case 122:
                        i8 += (int)Test.instanceCount;
                        l >>>= Test.instanceCount;
                        break;
                    case 108:
                        b = b;
                        i8 -= i9;
                        break;
                    case 116:
                        i8 *= (int)f2;
                        break;
                    case 114:
                        i11 += (int)(-7236817309018649227L + (i10 * i10));
                        break;
                    case 112:
                        i9 += (((i10 * i8) + i11) - i8);
                        break;
                    }
                }
            } else {
                Test.instanceCount ^= by;
            }
        }
        vMeth1_check_sum += i8 + i9 + Float.floatToIntBits(f2) + by + i10 + i11 + (b ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i2, int i3) {

        int i4=-3, i5=239, i6=-72, i7=-8451, i12=222, i13=-55639, i14=-10;
        short s1=-16962;
        double d1=114.25383;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 121.880F);

        for (i4 = 10; i4 < 228; i4++) {
            switch (((i4 % 2) * 5) + 26) {
            case 28:
                for (i6 = 1; i6 < 7; ++i6) {
                    i2 += (i6 | s1);
                    vMeth1(i12, i6, Test.fFld);
                    Test.instanceCount += (long)d1;
                    fArr[i4] *= Test.instanceCount;
                    for (i13 = 1; i13 < 2; i13++) {
                        Test.instanceCount -= i4;
                        fArr[i4 + 1] += i7;
                        i12 = (int)-6499205251359797156L;
                    }
                    if (true) break;
                    if (i4 != 0) {
                        vMeth_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + s1 + i12 + Double.doubleToLongBits(d1) + i13 +
                            i14 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                        return;
                    }
                }
                fArr[i4 + 1] = i2;
                Test.instanceCount += i4;
                break;
            case 34:
                Test.sFld += (short)Test.instanceCount;
            }
        }
        vMeth_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + s1 + i12 + Double.doubleToLongBits(d1) + i13 + i14 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth(float f1) {

        int i15=2, i16=7, i17=58926, i18=-67, i19=-2, i20=-27901, i21=198, iArr[]=new int[N];
        float f3=0.189F;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 1048072737L);
        FuzzerUtils.init(iArr, -30725);

        vMeth(i15, i15);
        for (i16 = 23; 376 > i16; i16++) {
            lArr1 = lArr1;
            Test.instanceCount -= i17;
            Test.fFld *= Test.instanceCount;
            Test.instanceCount += Test.sFld;
        }
        i18 = 1;
        do {
            try {
                iArr[i18 + 1] = (iArr[i18 - 1] / i15);
                i15 = (i17 % 74);
                i15 = (254 / i16);
            } catch (ArithmeticException a_e) {}
            if (i18 != 0) {
            }
        } while (++i18 < 149);
        for (i19 = 2; i19 < 394; ++i19) {
            Test.fFld *= 140;
            for (f3 = 4; f3 > 1; f3--) {
                Test.instanceCount = (long)f1;
                i15 -= i15;
                i20 = 197;
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i15 + i16 + i17 + i18 + i19 + i20 + Float.floatToIntBits(f3) + i21 +
            FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        short s=-28728;
        float f=111.802F;
        int i=54, i1=18329, i22=-125, i23=-225, i24=-22634, i25=-7, i26=-6963, i27=44270, i28=19811, i29=-12;
        boolean b1=true;
        byte by1=69;
        long lArr2[]=new long[N];

        FuzzerUtils.init(lArr2, 1290293325220706566L);

        iFld += (int)(-(-187L << (long)(Test.instanceCount = (long)1.1003F)));
        Test.instanceCount -= ((++iFld) - (--s));
        f -= Math.min(1, iFld--);
        for (i = 16; i < 351; i++) {
            i1 += (-31821 + (i * i));
            iFld <<= Math.max((int)(Math.abs(i1) - (iFld + f)), (int)((iFld * Test.instanceCount) >> iMeth(7.301F)));
            Test.fFld -= i;
            for (i22 = 2; 75 > i22; i22++) {
                for (i24 = 1; 2 > i24; i24++) {
                    if (b1) continue;
                    iArrFld[i22 + 1] -= (int)Test.instanceCount;
                    i25 *= i1;
                }
            }
            for (i26 = i; i26 < 75; ++i26) {
                iArrFld[i + 1] >>>= i1;
                iFld += i26;
                i27 += i26;
                iFld %= (int)(Test.instanceCount | 1);
                for (i28 = 1; i28 > 1; i28--) {
                    switch ((i % 7) + 112) {
                    case 112:
                    case 113:
                        i23 += i28;
                        break;
                    case 114:
                        iFld += (i28 * i1);
                        break;
                    case 115:
                        i25 = 121;
                        i27 = i27;
                        break;
                    case 116:
                        dFld -= by1;
                        if (false) continue;
                        iFld -= -35536;
                    case 117:
                        i27 -= i27;
                        try {
                            iArrFld[i + 1] = (iArrFld[i28] % i23);
                            i1 = (47707 % i28);
                            i27 = (i26 / -162);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 118:
                        dFld *= i22;
                        break;
                    }
                }
                lArr2[i + 1] ^= i28;
            }
        }

        FuzzerUtils.out.println("s f i = " + s + "," + Float.floatToIntBits(f) + "," + i);
        FuzzerUtils.out.println("i1 i22 i23 = " + i1 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 b1 = " + i24 + "," + i25 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 by1 lArr2 = " + i29 + "," + by1 + "," + FuzzerUtils.checkSum(lArr2));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.sFld = " + Test.instanceCount + "," + iFld + "," +
            Test.sFld);
        FuzzerUtils.out.println("Test.fFld dFld iArrFld = " + Float.floatToIntBits(Test.fFld) + "," +
            Double.doubleToLongBits(dFld) + "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
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
