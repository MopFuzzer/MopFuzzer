// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:29 2023
public class Test0366 {

    public static final int N = 400;

    public static long instanceCount=-2205918224L;
    public static byte byFld=-99;
    public static double dFld=33.129042;
    public int[] iArrFld =new int[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i5, int i6) {

        int i7=31;
        int i8=37868;
        int i9=31485;
        int[] iArr1 =new int[N];
        short s=-11947;
        short[][] sArr =new short[N][N];
        byte by1=-9;

        FuzzerUtils.init(iArr1, 4);
        FuzzerUtils.init(sArr, (short)23867);

        Test0366.instanceCount = i6;
        i6 = i6;
        switch (((i6 >>> 1) % 1) + 114) {
        case 114:
            for (i7 = 5; i7 < 251; ++i7) {
                iArr1 = iArr1;
                i8 += i7;
                iArr1[i7 + 1] = i6;
                i6 += (i7 - Test0366.instanceCount);
                Test0366.instanceCount += (((i7 * i8) + Test0366.instanceCount) - i5);
                iArr1 = iArr1;
                i9 = 7;
                while (--i9 > 0) {
                    Test0366.instanceCount += s;
                }
                sArr = sArr;
                by1 += (byte)(((i7 * i6) + s) - i8);
                Test0366.instanceCount += (i7 * i7);
            }
            break;
        }
        long meth_res = i5 + i6 + i7 + i8 + i9 + s + by1 + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1() {

        int i4=-50103, i10=-186, i11=58, i12=-13, i13=-12;
        long l=-93L;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -5L);

        i4 = 1;
        while (++i4 < 166) {
            if (i4 != 0) {
                vMeth1_check_sum += i4 + i10 + i11 + i12 + l + i13 + FuzzerUtils.checkSum(lArr);
                return;
            }
            lArr[i4 - 1] = ((i4 * iMeth(i4, -46054)) - Test0366.instanceCount);
            i10 -= i4;
            Test0366.byFld -= (byte) Test0366.instanceCount;
            for (i11 = 1; i11 < 10; ++i11) {
                float f1=-59.439F;
                Test0366.instanceCount += (((i11 * i12) + i11) - i11);
                Test0366.instanceCount = i10;
                f1 = i10;
                f1 -= -57.338F;
                for (l = 1; l < 2; l++) {
                    Test0366.instanceCount *= Test0366.instanceCount;
                    lArr = lArr;
                    f1 += 1.723F;
                    f1 += (((l * i13) + i13) - l);
                }
            }
        }
        vMeth1_check_sum += i4 + i10 + i11 + i12 + l + i13 + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i1, byte by) {

        int i2=11;
        int i3=123;
        int i14=2;
        int[] iArr =new int[N];
        float f2=88.886F;

        FuzzerUtils.init(iArr, 3);

        iArr[(i1 >>> 1) % N] >>= i1;
        i1 += i1;
        for (i2 = 11; i2 < 227; ++i2) {
            vMeth1();
            i3 <<= i3;
            i14 = 1;
            while (++i14 < 7) {
                Test0366.instanceCount *= i14;
                i1 = i2;
                i3 = (int)384080440L;
                i3 = Test0366.byFld;
            }
            i3 = i2;
            Test0366.dFld -= i14;
            f2 += i1;
            i1 /= (int) (Test0366.instanceCount | 1);
            i3 += (((i2 * i14) + Test0366.instanceCount) - i2);
        }
        vMeth_check_sum += i1 + by + i2 + i3 + i14 + Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=154, i15=58956, i16=-14, i17=-28169, i18=6, i19=-9, i20=-237, i21=-7;
        float f=-2.534F;
        double d=18.114986, d1=2.75598;
        boolean b=false;

        i -= (i++);
        Test0366.instanceCount = (long) f;
        i >>>= (iArrFld[(140 >>> 1) % N] - Math.abs(i));
        d = 1;
        do {
            i -= (int)(f++);
            vMeth(i, Test0366.byFld);
        } while (++d < 274);
        i = (int)d;
        d1 = i;
        i15 = 1;
        do {
            if (true) {
                for (i16 = 1; i16 < 67; i16++) {
                    iArrFld = iArrFld;
                    i *= (int)f;
                    b = b;
                }
                if (b) {
                    i17 = i17;
                    i17 <<= -9;
                } else {
                    Test0366.instanceCount = i15;
                    for (i18 = 67; i18 > 2; i18--) {
                        for (i20 = 1; i20 < 2; i20++) {
                            short s1=-6701;
                            i19 <<= 15452;
                            i19 = i16;
                            iArrFld = iArrFld;
                            if (b) {
                                iArrFld[i18] -= 50990;
                            } else {
                                i17 -= (int) Test0366.instanceCount;
                                i21 += (((i20 * i16) + i15) - i21);
                            }
                            s1 >>= s1;
                            i21 = (int) Test0366.instanceCount;
                        }
                        f = i19;
                    }
                }
            } else {
                i += (int)(-68.864F + (i15 * i15));
            }
        } while (++i15 < 377);

        FuzzerUtils.out.println("i f d = " + i + "," + Float.floatToIntBits(f) + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("d1 i15 i16 = " + Double.doubleToLongBits(d1) + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 b i18 = " + i17 + "," + (b ? 1 : 0) + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);

        FuzzerUtils.out.println("Test0366.instanceCount Test0366.byFld Test0366.dFld = " + Test0366.instanceCount + "," + Test0366.byFld +
                "," + Double.doubleToLongBits(Test0366.dFld));
        FuzzerUtils.out.println("iArrFld = " + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0366 _instance = new Test0366();
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
