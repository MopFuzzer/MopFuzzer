// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-12L;
    public byte byFld=-17;
    public short sFld=14801;
    public static int iFld=33;
    public int iArrFld[][]=new int[N][N];
    public static int iArrFld1[]=new int[N];
    public float fArrFld[]=new float[N];
    public short sArrFld[][]=new short[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld1, 7);
    }

    public static long dMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(double d2, int i11) {

        int i12=13, i13=-11, i14=-67, i15=23, i16=37925, i17=-47, iArr[]=new int[N];
        float f1=-2.628F;
        boolean b=false;
        byte by=-88;
        long lArr2[]=new long[N];

        FuzzerUtils.init(iArr, 6);
        FuzzerUtils.init(lArr2, 678192359L);

        for (i12 = 4; 287 > i12; i12++) {
            iArr[i12] -= 114;
            i13 >>= 0;
            f1 += (i12 * i12);
            i11 = (int)-5L;
            for (i14 = 1; 6 > i14; i14 += 2) {
                iArr = iArr;
                d2 = i13;
                if (b) break;
                iArr[i12] *= by;
                i11 >>>= i13;
                for (i16 = 1; i16 < 3; ++i16) {
                    f1 = i11;
                    i17 >>= -9;
                    f1 += i16;
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d2) + i11 + i12 + i13 + Float.floatToIntBits(f1) + i14 + i15 + (b ? 1 :
            0) + by + i16 + i17 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr2);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i4, int i5, double d1) {

        int i6=-95, i7=-53410, i8=65, i9=-33640, i10=-44224;
        short s=18658;
        boolean b1=false;
        float f2=1.183F;
        long lArr3[]=new long[N];

        FuzzerUtils.init(lArr3, -2L);

        for (i6 = 5; 280 > i6; i6++) {
            i8 = 1;
            while ((i8 += 2) < 6) {
                switch ((i8 % 9) + 23) {
                case 23:
                    switch ((i8 % 1) + 40) {
                    case 40:
                        for (i9 = 1; i9 < 2; ++i9) {
                            float f=49.189F;
                            Test.instanceCount += (((i9 * i10) + Test.instanceCount) - i7);
                            s -= (short)(i5++);
                            f += iMeth1(d1, i10);
                            i7 = i10;
                            i7 = 59781;
                            switch (((i6 % 2) * 5) + 97) {
                            case 99:
                                i7 += (((i9 * i4) + Test.instanceCount) - i10);
                                break;
                            case 98:
                                i4 = i7;
                                b1 = b1;
                                lArr3 = lArr3;
                                break;
                            default:
                                Test.iArrFld1[i6 + 1] = 14;
                            }
                        }
                        break;
                    default:
                        i7 = i10;
                    }
                    break;
                case 24:
                    f2 = i5;
                    break;
                case 25:
                    i10 >>= -37;
                    break;
                case 26:
                    i4 = 12;
                    break;
                case 27:
                    d1 -= i7;
                    break;
                case 28:
                    if (true) continue;
                    break;
                case 29:
                    Test.iArrFld1[i6] <<= i9;
                case 30:
                    f2 -= i5;
                    break;
                case 31:
                    i5 += (i8 * i8);
                    break;
                }
            }
        }
        long meth_res = i4 + i5 + Double.doubleToLongBits(d1) + i6 + i7 + i8 + i9 + i10 + s + (b1 ? 1 : 0) +
            Float.floatToIntBits(f2) + FuzzerUtils.checkSum(lArr3);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public double dMeth(double d, int i3) {

        int i18=0, i19=226, i20=-8553, i21=-34728, i22=-254;
        float f3=30.276F;
        double d3=0.8690;
        boolean b2=false;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -148L);

        i3 += (int)(i3 += (int)(lArr1[(i3 >>> 1) % N] + iMeth(i3, i3, d)));
        for (i18 = 9; i18 < 201; ++i18) {
            for (i20 = 1; i20 < 8; i20++) {
                i21 >>>= i21;
                Test.instanceCount *= (long)f3;
                fArrFld[i18] += (float)d;
                for (d3 = 1; d3 < 2; d3++) {
                    iArrFld[(int)(d3 - 1)][(int)(d3 + 1)] = (int)Test.instanceCount;
                    i3 |= i3;
                    f3 += (float)(d3 * d3);
                    i22 += i20;
                    i21 = (int)d3;
                    i22 += (int)((long)d3 ^ i21);
                    if (b2) break;
                    i19 = i3;
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i3 + i18 + i19 + i20 + i21 + Float.floatToIntBits(f3) +
            Double.doubleToLongBits(d3) + i22 + (b2 ? 1 : 0) + FuzzerUtils.checkSum(lArr1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=9, i1=6, i2=0, i24=-195, i25=12, i26=-5;
        float f4=0.457F, f5=25.1009F;
        long l1=138L, l2=252L, lArr[]=new long[N];
        boolean b3=false;

        FuzzerUtils.init(lArr, 7010825973180889392L);

        i |= (int)Test.instanceCount;
        lArr[(10 >>> 1) % N] = (((~iArrFld[(i >>> 1) % N][(-13 >>> 1) % N]) - (iArrFld[(i >>> 1) % N][(-9 >>> 1) % N]
            >>= i)) + i);
        for (i1 = 4; i1 < 156; i1 += 3) {
            byFld += (byte)dMeth(-95.35061, i2);
            if (b3) {
                sArrFld[i1 - 1][i1 - 1] += (short)f4;
                l1 = 1;
                while (++l1 < 352) {
                    f4 += -169;
                    Test.iArrFld1[(int)(l1 - 1)] /= (int)(byFld | 1);
                }
                i2 -= i2;
                if (false) break;
            } else {
                for (int i23 : Test.iArrFld1) {
                    i2 = sFld;
                    i23 += (int)f4;
                    for (i24 = 1; i24 < 2; i24++) {
                        iArrFld[i1 - 1][i1] -= (int)247L;
                        sFld = (short)i;
                        iArrFld[i24 + 1][(i >>> 1) % N] <<= -1;
                        Test.instanceCount /= (Test.instanceCount | 1);
                    }
                    i2 -= i1;
                    l2 += i1;
                    Test.iArrFld1[i1] = (int)l2;
                }
                b3 = b3;
                i26 = 1;
                do {
                    i = Test.iFld;
                    f5 = 1;
                    while ((f5 += 3) < 2) {
                        Test.instanceCount = i24;
                        Test.instanceCount = i2;
                        i = Test.iFld;
                        i25 = i;
                    }
                } while (++i26 < 254);
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("f4 l1 b3 = " + Float.floatToIntBits(f4) + "," + l1 + "," + (b3 ? 1 : 0));
        FuzzerUtils.out.println("i24 i25 l2 = " + i24 + "," + i25 + "," + l2);
        FuzzerUtils.out.println("i26 f5 lArr = " + i26 + "," + Float.floatToIntBits(f5) + "," +
            FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount byFld sFld = " + Test.instanceCount + "," + byFld + "," + sFld);
        FuzzerUtils.out.println("Test.iFld iArrFld Test.iArrFld1 = " + Test.iFld + "," + FuzzerUtils.checkSum(iArrFld)
            + "," + FuzzerUtils.checkSum(Test.iArrFld1));
        FuzzerUtils.out.println("fArrFld sArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," +
            FuzzerUtils.checkSum(sArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  iMeth ->  iMeth dMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
