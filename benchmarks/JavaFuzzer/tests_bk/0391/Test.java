// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:02 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-223L;
    public static volatile byte byFld=37;
    public static short sFld=2028;
    public static byte byArrFld[]=new byte[N];
    public int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)-81);
    }

    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i6, int i7, double d) {

        byte by=-56;

        by -= (byte)i7;
        vMeth_check_sum += i6 + i7 + Double.doubleToLongBits(d) + by;
    }

    public static long lMeth(int i3) {

        int i4=-13, i5=-64620, i8=-22664, i9=7, i10=20010, i11=13;
        double d1=-82.28798;
        boolean b=true;
        float f=19.120F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 1044919059693318904L);

        if (b) {
            Test.instanceCount = lArr[(i3 >>> 1) % N];
            for (i4 = 14; i4 < 225; ++i4) {
                vMeth(i3, -13, d1);
                i5 += (i4 | i3);
                Test.byFld += (byte)i4;
            }
            i5 *= i4;
        } else {
            Test.byArrFld[(i4 >>> 1) % N] = (byte)i5;
            i3 = i3;
            for (i8 = 332; i8 > 3; --i8) {
                i5 += i3;
                switch (((i3 >>> 1) % 4) + 106) {
                case 106:
                case 107:
                    for (i10 = 1; i10 < 5; ++i10) {
                        Test.instanceCount <<= i11;
                    }
                    f += Test.sFld;
                    break;
                case 108:
                    i9 += i8;
                    break;
                case 109:
                    i5 += (i8 * i8);
                }
            }
        }
        long meth_res = i3 + i4 + i5 + Double.doubleToLongBits(d1) + (b ? 1 : 0) + i8 + i9 + i10 + i11 +
            Float.floatToIntBits(f) + FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth() {

        int i2=246, i12=5, i13=20, i14=-180, i15=21433, iArr[][]=new int[N][N];
        double d2=-49.3696;
        long l=-133L;

        FuzzerUtils.init(iArr, -103);

        Test.byFld = (byte)(((i2 & i2) + lMeth(i2)) + i2);
        i12 = 275;
        do {
            i13 = 1;
            do {
                i2 = i12;
            } while (++i13 < 11);
            d2 -= i13;
            i2 = i2;
            i2 = i13;
            for (i14 = 1; i14 < 11; ++i14) {
                i15 = i12;
                l = 1;
                while (++l < 2) {
                    d2 = 16472;
                    iArr[i12][i14] = (int)Test.instanceCount;
                    i15 += (int)(l ^ i2);
                    iArr[i14][i14] = (int)l;
                    i2 += i12;
                }
            }
        } while ((i12 -= 2) > 0);
        long meth_res = i2 + i12 + i13 + Double.doubleToLongBits(d2) + i14 + i15 + l + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-6, i1=-148, i16=3, i17=3, i18=-13, i19=47223, i20=30;
        boolean b1=true;
        float f1=63.941F, fArr[]=new float[N];
        long l1=126710589L;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 1.81391);
        FuzzerUtils.init(fArr, -1.339F);

        for (i = 9; i < 235; ++i) {
            i1 += iMeth();
            iArrFld[i + 1][i] %= (int)(i1 | 1);
            switch ((i % 9) + 90) {
            case 90:
            case 91:
                i1 = (int)Test.instanceCount;
                if (b1) continue;
                i16 = 1;
                while (++i16 < 111) {
                    i1 |= -147;
                    iArrFld[i16][i16 - 1] -= -54249;
                    for (i17 = 1; i17 < 1; i17++) {
                        i1 = (int)f1;
                        i18 *= 377;
                        f1 = i1;
                        i18 = i17;
                        Test.instanceCount = i18;
                        i18 *= i18;
                    }
                    switch (((i % 2) * 5) + 4) {
                    case 8:
                        i1 = -7;
                        if (true) continue;
                        i1 += i16;
                        break;
                    case 9:
                        if (b1) {
                            switch ((i % 3) + 81) {
                            case 81:
                                dArr[i] = i1;
                                for (i19 = i16; 1 > i19; ++i19) {
                                    if (b1) {
                                        i1 += i20;
                                    }
                                    iArrFld[i16 + 1][i19 + 1] >>= (int)l1;
                                }
                                i20 = Test.sFld;
                                i1 *= (int)l1;
                                break;
                            case 82:
                                f1 += i16;
                                break;
                            case 83:
                                i1 += (i16 * i17);
                                break;
                            default:
                                l1 += -114;
                            }
                        } else if (b1) {
                            l1 = i20;
                        } else {
                            f1 = i16;
                        }
                    default:
                        fArr[i + 1] = i19;
                    }
                }
                break;
            case 92:
                Test.instanceCount = i16;
                break;
            case 93:
                i20 += i;
                break;
            case 94:
                i18 += (int)Test.instanceCount;
            case 95:
                i20 = i16;
                break;
            case 96:
                i1 &= i19;
                break;
            case 97:
                l1 += i18;
                break;
            case 98:
                iArrFld[i][i - 1] -= (int)l1;
                break;
            default:
                Test.instanceCount = -3118726262440682416L;
            }
        }

        FuzzerUtils.out.println("i i1 b1 = " + i + "," + i1 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("f1 i19 i20 = " + Float.floatToIntBits(f1) + "," + i19 + "," + i20);
        FuzzerUtils.out.println("l1 dArr fArr = " + l1 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.sFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Test.sFld);
        FuzzerUtils.out.println("Test.byArrFld iArrFld = " + FuzzerUtils.checkSum(Test.byArrFld) + "," +
            FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
