// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:37 2023
public class Test0527 {

    public static final int N = 400;

    public static volatile long instanceCount=4L;
    public static int iFld=93;
    public static float fFld=-1.836F;
    public int iFld1=23;
    public int iFld2=-2;
    public int[] iArrFld =new int[N];
    public static long[][] lArrFld =new long[N][N];

    static {
        FuzzerUtils.init(Test0527.lArrFld, -7796973235791673746L);
    }

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        long l=5175232081666928464L;
        int i2=41816;
        int i3=-17286;
        int i4=-42786;
        int i5=-16443;
        int i6=-55857;
        int[] iArr =new int[N];
        byte by=-1;
        float[] fArr =new float[N];

        FuzzerUtils.init(iArr, -1);
        FuzzerUtils.init(fArr, -110.565F);

        for (l = 11; 342 > l; ++l) {
            Test0527.iFld += (int) (l ^ i2);
            for (i3 = (int)(l); i3 < 5; i3++) {
                i4 += (i3 ^ by);
                for (i5 = 1; i5 < 1; i5++) {
                    Test0527.iFld = (int) l;
                    Test0527.fFld *= i5;
                    iArr[(int)(l)] += i5;
                    i2 = Test0527.iFld;
                    Test0527.instanceCount += i6;
                    Test0527.iFld += (i5 * i5);
                    Test0527.instanceCount += (((i5 * i3) + i2) - by);
                }
                Test0527.fFld -= Test0527.instanceCount;
                Test0527.iFld = (int) 1.194F;
                fArr[i3] += i6;
            }
        }
        vMeth_check_sum += l + i2 + i3 + i4 + by + i5 + i6 + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth(short s) {

        int i=-115;
        int i1=-28109;
        int i7=47788;
        int i8=0;
        int i9=11434;
        int i10=-10321;
        int[] iArr1 =new int[N];
        boolean b=true;
        double d=41.107078;

        FuzzerUtils.init(iArr1, 45078);

        for (i = 13; 234 > i; i++) {
            vMeth();
            for (i7 = i; i7 < 7; ++i7) {
                Test0527.iFld += (i7 | Test0527.iFld);
                if (b) break;
                i8 = Test0527.iFld;
                for (i9 = i7; i9 < 1; i9++) {
                    i1 = i9;
                    Test0527.instanceCount += (((i9 * i8) + i9) - Test0527.instanceCount);
                    Test0527.iFld += (((i9 * Test0527.fFld) + i) - i10);
                    switch (((i7 % 2) * 5) + 30) {
                    case 38:
                        Test0527.instanceCount *= Test0527.instanceCount;
                        i8 = i7;
                        break;
                    case 32:
                        iArr1[i + 1] = (int) Test0527.instanceCount;
                    }
                    d *= 49403;
                }
            }
        }
        long meth_res = s + i + i1 + i7 + i8 + (b ? 1 : 0) + i9 + i10 + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(float f) {

        short s1=-17159;
        int i11=-3;
        int i12=-3;
        int i13=-10;
        int i14=-8;
        int i15=-200;
        int i16=9915;
        int[] iArr2 =new int[N];
        double[] dArr =new double[N];
        float[][] fArr1 =new float[N][N];

        FuzzerUtils.init(dArr, -100.44162);
        FuzzerUtils.init(fArr1, 72.28F);
        FuzzerUtils.init(iArr2, 54831);

        dArr[(Test0527.iFld >>> 1) % N] += iMeth(s1);
        Test0527.iFld += Test0527.iFld;
        Test0527.instanceCount = Test0527.iFld;
        Test0527.iFld += Test0527.iFld;
        fArr1[(Test0527.iFld >>> 1) % N][(-41 >>> 1) % N] -= Test0527.instanceCount;
        for (i11 = 12; i11 < 229; ++i11) {
            for (i13 = 1; i13 < 7; i13++) {
                for (i15 = 1; i15 < 2; i15++) {
                    iArr2[i13 + 1] -= 12452;
                }
                Test0527.iFld *= i11;
                Test0527.iFld += i12;
                iArr2 = iArr2;
                if (Test0527.iFld != 0) {
                }
            }
            Test0527.instanceCount += (i11 * i11);
            i14 <<= i16;
        }
        long meth_res = Float.floatToIntBits(f) + s1 + i11 + i12 + i13 + i14 + i15 + i16 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1))
            + FuzzerUtils.checkSum(iArr2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i17=-26678;
        int i18=13;
        int i19=-21577;
        int i20=-14;
        int i21=-2;
        int i22=10;
        int i23=0;
        int[] iArr3 =new int[N];
        int[] iArr4 =new int[N];
        boolean b1=false;
        float f1=1.199F;
        double d1=0.77998;

        FuzzerUtils.init(iArr3, 86);
        FuzzerUtils.init(iArr4, 12);

        lMeth(-81.485F);
        for (i17 = 10; 309 > i17; i17++) {
            Test0527.iFld |= i18;
            for (i19 = 3; 84 > i19; ++i19) {
                Test0527.iFld += 10;
                i20 = (int)-7L;
                for (i21 = 1; i21 < 2; ++i21) {
                    try {
                        iArr3[i19 - 1] = (i22 % -1561142335);
                        i20 = (iFld1 % i19);
                        iArr4[i21 + 1] = (i19 / iArrFld[i21 + 1]);
                    } catch (ArithmeticException a_e) {}
                    Test0527.iFld = i22;
                    iFld1 = Test0527.iFld;
                    Test0527.iFld += -9;
                    if (b1) continue;
                    iArr4 = iArrFld;
                }
                f1 = i22;
                i22 = i18;
                Test0527.lArrFld[i17 - 1][i19 + 1] += iFld1;
                i23 = 2;
                do {
                    i22 = iFld2;
                    switch ((i23 % 2) + 42) {
                    case 42:
                        d1 -= Test0527.instanceCount;
                    case 43:
                        Test0527.instanceCount += Test0527.instanceCount;
                        f1 = i17;
                        iArr4[i19 - 1] += (int) Test0527.instanceCount;
                        Test0527.instanceCount += (i23 ^ i22);
                        break;
                    }
                    Test0527.instanceCount = Test0527.iFld;
                    Test0527.iFld >>= iFld1;
                    d1 = -2.368F;
                    i20 -= (int)f1;
                    Test0527.iFld = 14;
                    i18 += (int) Test0527.instanceCount;
                } while ((i23 -= 3) > 0);
            }
        }

        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("b1 f1 i23 = " + (b1 ? 1 : 0) + "," + Float.floatToIntBits(f1) + "," + i23);
        FuzzerUtils.out.println("d1 iArr3 iArr4 = " + Double.doubleToLongBits(d1) + "," + FuzzerUtils.checkSum(iArr3) +
            "," + FuzzerUtils.checkSum(iArr4));

        FuzzerUtils.out.println("Test0527.instanceCount Test0527.iFld Test0527.fFld = " + Test0527.instanceCount + "," + Test0527.iFld +
                "," + Float.floatToIntBits(Test0527.fFld));
        FuzzerUtils.out.println("iFld1 iFld2 iArrFld = " + iFld1 + "," + iFld2 + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("Test0527.lArrFld = " + FuzzerUtils.checkSum(Test0527.lArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0527 _instance = new Test0527();
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
//DEBUG  vMeth ->  vMeth iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
