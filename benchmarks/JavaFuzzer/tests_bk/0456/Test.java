// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:04 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-45873L;
    public double dFld=2.26789;
    public static boolean bFld=true;
    public static int iArrFld[]=new int[N];
    public static volatile long lArrFld[]=new long[N];
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -32037);
        FuzzerUtils.init(Test.lArrFld, -4284147761L);
        FuzzerUtils.init(Test.byArrFld, (byte)-5);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static void vMeth(int i4, int i5) {

        long l=2L;

        i5 += (int)(i5 += (int)Math.min(++l, 0L));
        vMeth_check_sum += i4 + i5 + l;
    }

    public static double dMeth(double d1, float f2, int i13) {

        int i14=753, i15=-3, i16=4, i17=-2;
        boolean b=false;
        byte by1=16;
        short s1=-21186;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 2216366189L);

        Test.instanceCount *= i13;
        for (i14 = 6; i14 < 224; ++i14) {
            if (false) {
                if (b) break;
                for (i16 = 7; i16 > i14; --i16) {
                    b = true;
                    i13 += (int)f2;
                    by1 = (byte)i16;
                    switch ((i16 % 2) + 121) {
                    case 121:
                        switch (((i13 >>> 1) % 4) + 100) {
                        case 100:
                            Test.instanceCount &= i16;
                            i15 = 10310;
                            i17 = i15;
                            break;
                        case 101:
                            lArr1[i16] ^= -1;
                            b = b;
                            break;
                        case 102:
                            Test.instanceCount = i17;
                            break;
                        case 103:
                            Test.instanceCount += 40942;
                            break;
                        default:
                            i13 += i16;
                        }
                        break;
                    case 122:
                        f2 += (((i16 * f2) + f2) - s1);
                    }
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + Float.floatToIntBits(f2) + i13 + i14 + i15 + (b ? 1 : 0) + i16 +
            i17 + by1 + s1 + FuzzerUtils.checkSum(lArr1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static int iMeth1(int i12) {

        double d2=2.47785;
        float f3=1.1F, fArr[]=new float[N];
        int i18=15, i19=-13, i20=32;
        byte by2=33;
        long lArr2[]=new long[N];

        FuzzerUtils.init(fArr, -1.582F);
        FuzzerUtils.init(lArr2, -91L);

        for (float f1 : fArr) {
            Test.iArrFld[(i12 >>> 1) % N] = (i12++);
            Test.iArrFld[(i12 >>> 1) % N] <<= (Test.iArrFld[(i12 >>> 1) % N]--);
        }
        i12 -= (int)dMeth(d2, f3, i12);
        i18 = 1;
        while (++i18 < 321) {
            by2 = (byte)189;
            f3 -= Test.instanceCount;
            for (i19 = 1; i19 < 5; i19++) {
                f3 = i12;
                lArr2[i18 + 1] += Test.instanceCount;
                Test.bFld = Test.bFld;
                Test.instanceCount -= Test.instanceCount;
                try {
                    Test.iArrFld[i18 - 1] = (i12 % i20);
                    i20 = (i19 % i18);
                    i20 = (Test.iArrFld[i18] % -64171);
                } catch (ArithmeticException a_e) {}
                if (Test.bFld) break;
            }
            i20 -= (int)-100.103096;
        }
        long meth_res = i12 + Double.doubleToLongBits(d2) + Float.floatToIntBits(f3) + i18 + by2 + i19 + i20 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr2);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth() {

        int i9=38482, i10=-185, i11=206, i21=-5, i22=42802;
        short s2=-10944;
        float f4=-1.109F;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 14.72120);

        i9 = 350;
        do {
            for (i10 = 1; 5 > i10; i10++) {
                dFld = (i11 <<= (i11 - (-169 + iMeth1(i9))));
                i11 = 3;
                i11 = -35;
                switch ((i9 % 8) + 118) {
                case 118:
                    switch ((i10 % 7) + 17) {
                    case 17:
                        for (i21 = 1; i21 < 2; i21++) {
                            switch ((i21 % 3) + 28) {
                            case 28:
                                Test.instanceCount += i21;
                            case 29:
                                i22 += (i21 ^ Test.instanceCount);
                                i11 >>>= 79;
                                break;
                            case 30:
                                i22 = i22;
                            }
                            dFld /= -6673;
                            i22 <<= (int)Test.instanceCount;
                        }
                        break;
                    case 18:
                        Test.bFld = Test.bFld;
                        break;
                    case 19:
                        Test.lArrFld[i10 - 1] = i9;
                        break;
                    case 20:
                        s2 = (short)f4;
                        break;
                    case 21:
                        f4 = i11;
                    case 22:
                        Test.iArrFld[i10] *= i10;
                        break;
                    case 23:
                        Test.iArrFld[i10] = i11;
                        break;
                    }
                    break;
                case 119:
                    i22 -= (int)dFld;
                case 120:
                    Test.lArrFld[i10 - 1] = Test.instanceCount;
                    break;
                case 121:
                    Test.instanceCount -= i11;
                case 122:
                    try {
                        i11 = (i22 % i11);
                        i11 = (i22 % i21);
                        i11 = (i9 / i9);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 123:
                    dArr[i10 + 1] -= i9;
                    break;
                case 124:
                    i22 >>>= (int)6938740127528305309L;
                    break;
                case 125:
                    i22 <<= -61712;
                    break;
                }
            }
        } while (--i9 > 0);
        long meth_res = i9 + i10 + i11 + i21 + i22 + s2 + Float.floatToIntBits(f4) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=3, i1=0, i2=-33822, i3=10553, i6=4, i7=29258, i8=-23011, i23=-2, i24=-106, iArr[]=new int[N],
            iArr1[][]=new int[N][N];
        double d=-43.100947, d3=-2.98413;
        byte by=-10;
        float f=33.959F, f5=0.22F;
        short s3=-102;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 0);
        FuzzerUtils.init(lArr, -7554067217060898408L);
        FuzzerUtils.init(iArr1, -11274);

        for (i = 6; 154 > i; ++i) {
            for (i2 = 4; i2 < 169; i2++) {
                i1 += (-12 + (i2 * i2));
                i1 += i2;
                Test.instanceCount = iArr[i];
                try {
                    i1 = (-15762 % i2);
                    iArr[i + 1] = (-25548 / i);
                    i1 = (i2 / i2);
                } catch (ArithmeticException a_e) {}
                vMeth(i1, ++i1);
                i3 += (i2 + i2);
                for (i6 = 1; i6 < 2; i6++) {
                    short s=-29389;
                    d += (-((59118 + (-(++Test.instanceCount))) - (140 - (i3 - by))));
                    lArr[i + 1] = (long)((-d) - (--Test.instanceCount));
                    vMeth((int)(-12 + (f + i1)), (int)((++s) - ((-(Test.instanceCount + s)) - (Test.instanceCount++))));
                    lArr[i2 - 1] *= (long)(Float.intBitsToFloat(i3 + -8) - ((f + i6) - (s + by)));
                }
                i3 = i2;
                i8 = 1;
                do {
                    vMeth(25802 - (-(8 * iMeth())), i6);
                    i3 = by;
                    f5 -= Test.instanceCount;
                    if (Test.bFld) continue;
                    Test.byArrFld[i2 + 1] += (byte)i8;
                    s3 /= (short)-2;
                    dFld -= i1;
                    Test.instanceCount *= (long)2.518F;
                    i7 = i1;
                    Test.iArrFld[i2 - 1] += (int)f;
                } while (++i8 < 2);
                d3 = 2;
                do {
                    i7 >>>= i3;
                } while ((d3 -= 2) > 0);
            }
            for (i23 = 3; i23 < 169; ++i23) {
                try {
                    i1 = (i7 % -1349514507);
                    i1 = (i2 / -33581);
                    i24 = (iArr1[i23 - 1][i23 - 1] / 26413);
                } catch (ArithmeticException a_e) {}
                lArr[i + 1] = i7;
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i6 i7 = " + i3 + "," + i6 + "," + i7);
        FuzzerUtils.out.println("d by f = " + Double.doubleToLongBits(d) + "," + by + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i8 f5 s3 = " + i8 + "," + Float.floatToIntBits(f5) + "," + s3);
        FuzzerUtils.out.println("d3 i23 i24 = " + Double.doubleToLongBits(d3) + "," + i23 + "," + i24);
        FuzzerUtils.out.println("iArr lArr iArr1 = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(lArr) +
            "," + FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test.instanceCount dFld Test.bFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(dFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iArrFld Test.lArrFld Test.byArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + ","
            + FuzzerUtils.checkSum(Test.lArrFld) + "," + FuzzerUtils.checkSum(Test.byArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  dMeth ->  dMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}