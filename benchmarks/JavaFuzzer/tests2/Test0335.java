// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:27 2023
public class Test0335 {

    public static final int N = 400;

    public static long instanceCount=-4175565596004567714L;
    public static float fFld=110.192F;
    public static int[] iArrFld =new int[N];
    public long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0335.iArrFld, -184);
    }

    public static long dMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        double d=87.76590, d1=0.36642;
        int i13=71, i14=226, i15=-17955, i16=-43665, i17=-7;
        float f1=0.576F, f2=1.6F;
        boolean b=false;
        short s=10182;

        for (d = 8; d < 167; ++d) {
            f1 = Test0335.instanceCount;
            d1 += i13;
            Test0335.iArrFld[(int) (d)] += (int) d1;
            switch ((int)(((d % 3) * 5) + 43)) {
            case 45:
                i13 += (int) ((long) d | Test0335.instanceCount);
                Test0335.iArrFld = Test0335.iArrFld;
                break;
            case 52:
                i14 = 10;
                while (--i14 > 0) {
                    if (b) break;
                    for (i15 = 1; i15 < 1; i15++) {
                        i16 = i13;
                        Test0335.instanceCount = i15;
                    }
                }
            case 49:
                for (f2 = 1; f2 < 10; f2++) {
                    Test0335.instanceCount += s;
                    b = false;
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i13 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d1) + i14
            + (b ? 1 : 0) + i15 + i16 + Float.floatToIntBits(f2) + i17 + s;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static short sMeth(int i10, int i11, int i12) {

        int i18=46;
        boolean b1=false;
        float f3=0.306F;

        i11 = (--i10);
        Test0335.iArrFld[(i10 >>> 1) % N] -= (int) (-585994188917027852L - iMeth());
        i18 = 1;
        while (++i18 < 170) {
            b1 = true;
            i10 = i10;
            Test0335.instanceCount = i10;
            i12 = (int)f3;
        }
        long meth_res = i10 + i11 + i12 + i18 + (b1 ? 1 : 0) + Float.floatToIntBits(f3);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static double dMeth() {

        int i6=1, i7=108, i8=31, i9=240;
        boolean b2=true;
        float[] fArr =new float[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(fArr, 60.309F);
        FuzzerUtils.init(lArr, -52932L);

        for (int i5 : Test0335.iArrFld) {
            for (i6 = 1; i6 < 4; i6++) {
                Test0335.instanceCount = i7;
                for (i8 = 1; 2 > i8; ++i8) {
                    i9 = (sMeth(i7, 2, i7) + i8);
                    i7 &= -10;
                    i5 += i6;
                    Test0335.instanceCount <<= 16040;
                    fArr[i6 + 1] -= (float)-8.1551;
                    switch (((i8 % 4) * 5) + 53) {
                    case 60:
                        Test0335.instanceCount = i9;
                        Test0335.iArrFld[i8] *= i8;
                        b2 = b2;
                        lArr[i6 - 1] -= i6;
                        break;
                    case 68:
                        Test0335.iArrFld = Test0335.iArrFld;
                        break;
                    case 65:
                        if (b2) break;
                        break;
                    case 54:
                    }
                }
            }
        }
        long meth_res = i6 + i7 + i8 + i9 + (b2 ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(lArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-128, i1=-46404, i2=8, i3=2, i4=-36710, i19=-88, i20=-11, i21=-6, i22=-3;
        float f=0.799F;
        double d2=1.75105;
        boolean b3=true;
        short s1=-27173;

        for (i = 3; i < 178; ++i) {
            for (i2 = 2; 143 > i2; i2++) {
                for (f = 2; 1 < f; f--) {
                    Test0335.iArrFld[i2 + 1] = i2;
                    Test0335.instanceCount += (long) (dMeth() - i1);
                    d2 = i3;
                    Test0335.fFld = -8860;
                }
                i3 = -34088;
                Test0335.instanceCount <<= Test0335.instanceCount;
                lArrFld[i + 1] <<= i4;
                i3 += i;
                for (i19 = 1; i19 < 2; ++i19) {
                    Test0335.instanceCount = i3;
                    switch ((i2 % 1) + 78) {
                    case 78:
                        d2 += f;
                        break;
                    }
                    i3 -= (int)f;
                    b3 = b3;
                    Test0335.fFld += 14259;
                }
            }
            Test0335.fFld = i20;
            if (b3) continue;
            i3 += (((i * s1) + f) - i2);
            Test0335.iArrFld[i + 1] >>= i20;
            i3 *= i2;
            if (b3) {
                d2 += Test0335.instanceCount;
                i21 = 1;
                do {
                    i22 = 1;
                    while (++i22 < 1) {
                        if (b3) {
                            i3 = (int) Test0335.instanceCount;
                        } else if (b3) {
                            if (b3) continue;
                        } else {
                            if (b3) continue;
                        }
                    }
                } while (++i21 < 143);
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 f i4 = " + i3 + "," + Float.floatToIntBits(f) + "," + i4);
        FuzzerUtils.out.println("d2 i19 i20 = " + Double.doubleToLongBits(d2) + "," + i19 + "," + i20);
        FuzzerUtils.out.println("b3 s1 i21 = " + (b3 ? 1 : 0) + "," + s1 + "," + i21);
        FuzzerUtils.out.println("i22 = " + i22);

        FuzzerUtils.out.println("Test0335.instanceCount Test0335.fFld Test0335.iArrFld = " + Test0335.instanceCount + "," +
                Float.floatToIntBits(Test0335.fFld) + "," + FuzzerUtils.checkSum(Test0335.iArrFld));
        FuzzerUtils.out.println("lArrFld = " + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0335 _instance = new Test0335();
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  sMeth ->  sMeth dMeth mainTest
//DEBUG  iMeth ->  iMeth sMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
