// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:57 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=6475331791901906967L;
    public static boolean bFld=false;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[][]=new int[N][N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -4053985439L);
        FuzzerUtils.init(Test.iArrFld, 27971);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i6) {

        int i7=-12491, i8=35312, i9=7, i10=36253, i11=-12, iArr[]=new int[N];
        boolean b=true;
        byte by=-111;
        double d=0.67203;

        FuzzerUtils.init(iArr, -219);

        i6 <<= i6;
        for (i7 = 6; i7 < 136; ++i7) {
            iArr[i7] = (int)-2068367339688610740L;
            i6 += (i7 + i6);
            if (b) break;
            Test.instanceCount += (i7 ^ i8);
            i8 = by;
        }
        i6 += i8;
        i9 = 1;
        while (++i9 < 387) {
            i6 += (int)d;
            i6 = i6;
            i8 += (i9 * i9);
            for (i10 = 4; i10 > 1; i10--) {
                i8 *= i11;
                if (true) break;
            }
        }
        long meth_res = i6 + i7 + i8 + (b ? 1 : 0) + by + i9 + Double.doubleToLongBits(d) + i10 + i11 +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i4, int i5) {

        int i12=252, i13=3, i14=2, i15=5, i16=-220, iArr1[]=new int[N];
        short s1=-26020;
        float f1=-50.479F;

        FuzzerUtils.init(iArr1, 14);

        i4 -= (int)((Integer.reverseBytes(i5) + (33859 - iMeth(i4))) * 106.12511);
        i12 = 1;
        do {
            i13 = 5;
            while (--i13 > 0) {
                iArr1 = iArr1;
                i4 = 0;
                i4 -= (int)Test.instanceCount;
                Test.lArrFld[i13] = Test.instanceCount;
            }
            i5 += (i12 - Test.instanceCount);
        } while (++i12 < 355);
        i14 = 1;
        do {
            for (i15 = 10; 1 < i15; i15--) {
                i4 = i14;
                i5 = (int)Test.instanceCount;
            }
            Test.instanceCount += (i14 ^ s1);
            f1 = i16;
            i4 = i14;
        } while (++i14 < 160);
        vMeth_check_sum += i4 + i5 + i12 + i13 + i14 + i15 + i16 + s1 + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static boolean bMeth(int i2, short s) {

        int i3=-53513, i17=-8, i18=-51045, i19=32390, i20=3, i21=-75;
        float f2=-1.400F;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-75);

        i3 = 1;
        while (++i3 < 280) {
            vMeth(0, -162);
        }
        s -= (short)i2;
        i2 *= 12;
        for (i17 = 3; 388 > i17; i17++) {
            Test.lArrFld = Test.lArrFld;
            i19 = 1;
            while (++i19 < 4) {
                byArr[i17] = (byte)25290;
            }
            i18 += (i17 * f2);
            i18 += i3;
            for (i20 = 1; i20 < 4; ++i20) {
                f2 -= i19;
                Test.instanceCount = (long)2.117201;
                i18 += i17;
                i21 = -15517;
            }
        }
        long meth_res = i2 + s + i3 + i17 + i18 + i19 + Float.floatToIntBits(f2) + i20 + i21 +
            FuzzerUtils.checkSum(byArr);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        int i=3, i1=54749, i22=-119;
        long l=-4161572292L;
        short s2=-9583;
        double d1=-68.61159;
        byte by1=-100;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 0.809F);

        i = 1;
        while (++i < 198) {
            for (l = 127; l > 2; --l) {
                float f=19.925F;
                fArr[i] -= i1;
                i1 += (int)(--f);
                if (bMeth(i1, s2)) break;
                Test.instanceCount = i1;
                switch (((i % 6) * 5) + 37) {
                case 45:
                    Test.instanceCount += s2;
                    Test.lArrFld[(int)(l - 1)] += i1;
                    break;
                case 64:
                    d1 = f;
                    break;
                case 62:
                    i1 = i1;
                    i1 += (int)(l + i);
                    i1 -= (int)l;
                    i1 -= i1;
                    break;
                case 40:
                    i22 = 1;
                    while (++i22 < 2) {
                        f = i1;
                        f += s2;
                        d1 -= -4064505482511775630L;
                        i1 *= i22;
                        Test.iArrFld[(int)(l + 1)] = Test.iArrFld[i];
                    }
                    if (Test.bFld) continue;
                    by1 /= (byte)(i22 | 1);
                    switch ((int)((l % 2) + 8)) {
                    case 8:
                        f += i1;
                        i1 += (-13 + (l * l));
                    case 9:
                    default:
                        Test.bArrFld = FuzzerUtils.boolean1array(N, (boolean)false);
                        Test.instanceCount += -207L;
                        i1 += i1;
                    }
                    break;
                case 49:
                    d1 = l;
                    break;
                case 58:
                    if (Test.bFld) break;
                default:
                    Test.lArrFld[(19 >>> 1) % N] |= i;
                }
            }
        }

        FuzzerUtils.out.println("i l i1 = " + i + "," + l + "," + i1);
        FuzzerUtils.out.println("s2 d1 i22 = " + s2 + "," + Double.doubleToLongBits(d1) + "," + i22);
        FuzzerUtils.out.println("by1 fArr = " + by1 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.lArrFld = " + Test.instanceCount + "," + (Test.bFld
            ? 1 : 0) + "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.iArrFld Test.bArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(Test.bArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
