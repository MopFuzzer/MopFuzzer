// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:00 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=203L;
    public static double dFld=0.114728;
    public static short sFld=23812;
    public static int iArrFld[]=new int[N];
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -8);
        FuzzerUtils.init(Test.byArrFld, (byte)105);
    }

    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i12, float f3) {

        int i13=2, i14=-9, i15=-6, i16=-106, i17=-17, i18=65;

        i12 -= i12;
        i12 = i12;
        for (i13 = 2; i13 < 144; i13++) {
            i14 = i14;
            Test.instanceCount &= i14;
            for (i15 = i13; 11 > i15; i15 += 3) {
                Test.instanceCount -= i14;
                f3 += i16;
                i12 = (int)Test.instanceCount;
                i16 = -240;
            }
            Test.iArrFld = Test.iArrFld;
            i16 = i13;
        }
        for (i17 = 8; 301 > i17; i17++) {
            i14 += (i17 * i17);
            i14 += (i17 * i17);
        }
        vMeth_check_sum += i12 + Float.floatToIntBits(f3) + i13 + i14 + i15 + i16 + i17 + i18;
    }

    public static long lMeth1(byte by, int i9) {

        int i10=-34666, i11=0, i19=-6, iArr2[][]=new int[N][N];
        short s=-2228;
        float f1=0.380F, f2=73.605F;

        FuzzerUtils.init(iArr2, -14);

        for (i10 = 15; i10 < 326; i10++) {
            i11 += (int)(((i9 -= i11) - s) - (Test.instanceCount + (Test.dFld * 3749)));
            f1 = 1;
            while (++f1 < 5) {
                f2 += (float)Test.dFld;
                try {
                    i9 = (i10 % i9);
                    i11 = (i11 / 126);
                    iArr2[i10][i10] = (i10 / -182);
                } catch (ArithmeticException a_e) {}
                i11 += (int)(((f1 * i9) + Test.instanceCount) - i10);
                vMeth(i10, f2);
                i9 = i10;
            }
            s *= (short)Test.instanceCount;
            i11 += i10;
            i19 = 1;
            do {
                Test.instanceCount = i10;
                i9 = (int)Test.dFld;
            } while (++i19 < 5);
            i11 += i10;
            by += (byte)i11;
        }
        long meth_res = by + i9 + i10 + i11 + s + Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i19 +
            FuzzerUtils.checkSum(iArr2);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static long lMeth(long l, int i3) {

        int i4=-41717, i5=-43, i6=-47791, i7=10, i8=35905, iArr1[]=new int[N];
        byte by1=124;
        float f4=2.474F;
        boolean b=true, bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(iArr1, 14);

        for (i4 = 20; 329 > i4; ++i4) {
            i3 = (++i3);
            l = (--i5);
            if (bArr[i4 + 1]) break;
            i6 = 1;
            while (++i6 < 5) {
                iArr1[(i5 >>> 1) % N] = i3;
                for (i7 = i6; i7 < 1; ++i7) {
                    i8 += (int)(Long.reverseBytes(Test.instanceCount--) + (lMeth1(by1, 56944) * i6));
                    f4 = -48466;
                    bArr[i6] = b;
                    Test.sFld = (short)i7;
                    Test.dFld = Test.sFld;
                    i5 = i5;
                    Test.dFld += i3;
                }
                i5 += i6;
            }
        }
        long meth_res = l + i3 + i4 + i5 + i6 + i7 + i8 + by1 + Float.floatToIntBits(f4) + (b ? 1 : 0) +
            FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=0, i1=29, i2=25, i20=41, i21=5, i22=13, i23=3618, iArr[][]=new int[N][N];
        float f=-97.719F, f5=2.817F, f6=-44.166F;
        boolean b1=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 0);
        FuzzerUtils.init(lArr, -6591093385048294078L);

        switch ((((iArr[(i >>> 1) % N][(i >>> 1) % N] >>> 1) % 9) * 5) + 120) {
        case 142:
            f = 1;
            while (++f < 167) {
                for (i1 = 2; i1 < 150; ++i1) {
                    i >>>= (int)(lMeth(Test.instanceCount, i2) / ((long)(f) | 1));
                    i2 = (int)f;
                    Test.iArrFld[i1 - 1] = i2;
                    i += (i1 | i1);
                    b1 = b1;
                    Test.iArrFld = iArr[i1];
                    i <<= i1;
                    for (i20 = 1; i20 < 2; ++i20) {
                        Test.dFld = i20;
                        i2 -= -2;
                        Test.byArrFld[(int)(f)] >>= (byte)-24655;
                        i2 += (((i20 * i) + i1) - i);
                        Test.instanceCount %= 50247;
                    }
                    Test.dFld = -13;
                }
                i += (int)f;
                Test.instanceCount += (long)f;
                i22 = 1;
                while (++i22 < 150) {
                    iArr[(int)(f - 1)][(int)(f)] >>= 14;
                    for (f5 = f; f5 < 1; ++f5) {
                        f6 += i22;
                        i23 += (int)(f5 * f5);
                        iArr[i22 + 1] = iArr[i22 + 1];
                        f6 *= Test.instanceCount;
                        Test.instanceCount += (long)(f5 - Test.sFld);
                        if (b1) break;
                        iArr[(int)(f)][i22 - 1] = i21;
                        i2 -= i;
                    }
                }
            }
            break;
        case 140:
            i21 /= (int)(i23 | 1);
            break;
        case 158:
            i2 <<= (int)Test.instanceCount;
            break;
        case 129:
            i = i;
            break;
        case 137:
            f6 += f5;
            break;
        case 153:
            i23 ^= 24;
            break;
        case 159:
            i21 *= (int)Test.dFld;
            break;
        case 127:
            lArr[(i2 >>> 1) % N] -= i22;
            break;
        case 156:
            Test.dFld /= (Test.instanceCount | 1);
            break;
        }

        FuzzerUtils.out.println("i f i1 = " + i + "," + Float.floatToIntBits(f) + "," + i1);
        FuzzerUtils.out.println("i2 b1 i20 = " + i2 + "," + (b1 ? 1 : 0) + "," + i20);
        FuzzerUtils.out.println("i21 i22 f5 = " + i21 + "," + i22 + "," + Float.floatToIntBits(f5));
        FuzzerUtils.out.println("i23 f6 iArr = " + i23 + "," + Float.floatToIntBits(f6) + "," +
            FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("lArr = " + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.sFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Test.sFld);
        FuzzerUtils.out.println("Test.iArrFld Test.byArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(Test.byArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth1 lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
