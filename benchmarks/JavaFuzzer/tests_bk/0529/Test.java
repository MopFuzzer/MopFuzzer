// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:06 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-9092326782359227944L;
    public static long lFld=4L;
    public static float fFld=-92.215F;
    public short sFld=31010;
    public boolean bFld=true;
    public int iArrFld[][]=new int[N][N];
    public long lArrFld[]=new long[N];

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public void vMeth1(float f2, int i7, boolean b) {

        int i8=-63297, i9=-13, i10=33251, i11=-42292, i12=-134;
        short s=-2719;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 4L);

        i8 = 1;
        do {
            i7 += (i8 * i8);
            if (b) {
                i7 += i7;
                Test.instanceCount = 28746;
                for (i9 = 1; i9 < 8; ++i9) {
                    i7 = (int)Test.lFld;
                    iArrFld[i9 + 1] = iArrFld[i9 - 1];
                    i10 = i7;
                    f2 = i9;
                    lArr1[i8] = -2919847403L;
                    for (i11 = i9; i11 < 2; ++i11) {
                        i10 -= (int)119.95336;
                        s = (short)i10;
                        i12 += i7;
                    }
                }
            } else {
                i7 += (((i8 * i10) + i9) - i11);
            }
        } while (++i8 < 196);
        vMeth1_check_sum += Float.floatToIntBits(f2) + i7 + (b ? 1 : 0) + i8 + i9 + i10 + i11 + i12 + s +
            FuzzerUtils.checkSum(lArr1);
    }

    public void vMeth(int i4) {

        int i5=9273, i6=-20, i13=-16713;
        float f3=30.730F, f4=29.794F;

        for (i5 = 7; 128 > i5; ++i5) {
            boolean b1=true;
            Test.lFld += Test.instanceCount;
            vMeth1(f3, i4, b1);
            for (f4 = 1; f4 < 13; ++f4) {
                i13 <<= (int)Test.lFld;
                Test.lFld += (4969 + (f4 * f4));
                iArrFld[(int)(f4)] = FuzzerUtils.int1array(N, (int)50701);
                if (b1) continue;
                iArrFld[i5 + 1][i5 - 1] <<= i5;
            }
            iArrFld[i5] = iArrFld[i5];
            if (b1) continue;
            lArrFld[i5 + 1] = (long)f3;
            Test.instanceCount = (long)-53.32226;
            i4 = (int)Test.instanceCount;
        }
        i6 += i6;
        vMeth_check_sum += i4 + i5 + i6 + Float.floatToIntBits(f3) + Float.floatToIntBits(f4) + i13;
    }

    public float fMeth() {

        float f1=0.893F;
        int i1=51881, i2=0, i3=-32214, i14=0, i15=-4;
        byte by=61;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 13L);

        f1 = 1;
        while (++f1 < 347) {
            switch ((int)((f1 % 2) + 23)) {
            case 23:
                i1 <<= i1;
                break;
            case 24:
                for (i2 = 1; i2 < 5; i2 += 2) {
                    iArrFld[i2 + 1][i2 - 1] *= i3;
                    iArrFld[(int)(f1 + 1)][(int)(f1 - 1)] = (Math.min((int)(-lArr[i2 + 1][i2 + 1]), -197) -
                        iArrFld[i2][i2 - 1]);
                    vMeth(i1);
                    i1 += i1;
                    lArrFld[i2 - 1] += Test.lFld;
                    i1 += (int)Test.lFld;
                }
                for (i14 = 1; i14 < 5; i14++) {
                    by ^= (byte)Test.lFld;
                    iArrFld[(int)(f1)] = iArrFld[(int)(f1 - 1)];
                    i15 &= i14;
                    i15 += i14;
                }
                break;
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i1 + i2 + i3 + i14 + i15 + by + FuzzerUtils.checkSum(lArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=-42.46F;
        int i=-5, i16=11, i17=-41122, i18=-8804, i19=58072, i20=-222, i21=166;
        byte by1=-63;
        double d1=103.68423;

        f = i;
        fMeth();
        i += i;
        i16 = 1;
        while (++i16 < 342) {
            by1 >>>= (byte)65386;
            iArrFld[i16 + 1] = iArrFld[i16];
            i = (int)-1.108577;
            i += (i16 * i16);
            f -= i16;
            i -= by1;
            try {
                i = (i16 / i);
                i = (iArrFld[i16][i16] / i16);
                i = (1792891647 / i16);
            } catch (ArithmeticException a_e) {}
        }
        i += (int)Test.fFld;
        i17 = 287;
        while (--i17 > 0) {
            double d=80.122405;
            i += (int)d;
            for (d1 = 5; d1 < 88; d1++) {
                by1 %= (byte)(i | 1);
                Test.instanceCount *= i16;
                iArrFld[i17][i17 + 1] >>>= 40955;
                i18 = i;
                i18 += (int)d1;
                for (i19 = 1; i19 < 2; i19++) {
                    Test.fFld *= i16;
                    i18 -= -87;
                    if (bFld) {
                        i20 >>= (int)Test.instanceCount;
                        iArrFld[(int)(d1)][(i19 >>> 1) % N] = i;
                        i20 += (int)f;
                        sFld += (short)Test.instanceCount;
                    } else {
                        by1 <<= (byte)i21;
                    }
                    i += i19;
                }
            }
        }

        FuzzerUtils.out.println("f i i16 = " + Float.floatToIntBits(f) + "," + i + "," + i16);
        FuzzerUtils.out.println("by1 i17 d1 = " + by1 + "," + i17 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 = " + i21);

        FuzzerUtils.out.println("Test.instanceCount Test.lFld Test.fFld = " + Test.instanceCount + "," + Test.lFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("sFld bFld iArrFld = " + sFld + "," + (bFld ? 1 : 0) + "," +
            FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("lArrFld = " + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
