// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:08 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=175L;
    public static int iFld=12;
    public static volatile long lFld=-399880737L;
    public double dFld=-2.96648;
    public float fArrFld[]=new float[N];
    public volatile double dArrFld[][]=new double[N][N];
    public static float fArrFld1[][]=new float[N][N];

    static {
        FuzzerUtils.init(Test.fArrFld1, 0.815F);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i5) {

        int i6=14, i7=-44250, i8=3, i9=-19516, i10=-124, iArr1[]=new int[N];
        byte byArr1[]=new byte[N];

        FuzzerUtils.init(iArr1, -43021);
        FuzzerUtils.init(byArr1, (byte)25);

        i5 -= (int)Test.instanceCount;
        for (i6 = 11; i6 < 372; ++i6) {
            for (i8 = 1; 5 > i8; ++i8) {
                float f1=112.645F;
                i7 = i8;
                f1 += i7;
                switch ((i6 % 3) + 55) {
                case 55:
                    iArr1[i8] = (int)Test.instanceCount;
                    break;
                case 56:
                    i10 = 1;
                    do {
                        i5 = 35227;
                        i7 = Test.iFld;
                        i5 += i5;
                        byArr1 = byArr1;
                    } while (++i10 < 2);
                    break;
                case 57:
                }
                i5 &= i5;
                if (i5 != 0) {
                    vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + FuzzerUtils.checkSum(iArr1) +
                        FuzzerUtils.checkSum(byArr1);
                    return;
                }
                i5 = (int)Test.instanceCount;
            }
        }
        vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(byArr1);
    }

    public static int iMeth() {

        int i11=1, i12=0, i13=61626, i14=7, i15=-155, i16=-37889, i17=-12, iArr2[][]=new int[N][N];
        double d=-1.36854;
        boolean b=true;
        byte by1=16;
        float f2=0.630F;

        FuzzerUtils.init(iArr2, 180);

        vMeth1(Test.iFld);
        switch (((Test.iFld >>> 1) % 10) + 111) {
        case 111:
            Test.iFld += (int)Test.instanceCount;
            if (b) {
                i11 = 286;
                do {
                    iArr2 = iArr2;
                } while ((i11 -= 2) > 0);
                for (i12 = 16; i12 < 318; i12++) {
                    i13 *= i11;
                    for (i14 = 1; i14 < 5; i14++) {
                        Test.instanceCount = (long)d;
                        Test.fArrFld1[i14][i14 - 1] += i14;
                        for (i16 = 1; i16 < 2; ++i16) {
                            iArr2[i12][i14 - 1] = (int)-2.4711;
                            Test.iFld += (-10 + (i16 * i16));
                            i15 = i15;
                        }
                    }
                }
            } else if (b) {
                iArr2[(7 >>> 1) % N][(i11 >>> 1) % N] += i12;
            }
        case 112:
            Test.instanceCount = -2237;
            break;
        case 113:
            i13 -= (int)Test.lFld;
            break;
        case 114:
            Test.iFld = i13;
            break;
        case 115:
            iArr2[(i16 >>> 1) % N][(i17 >>> 1) % N] = i12;
            break;
        case 116:
            by1 *= (byte)f2;
            break;
        case 117:
            i15 >>= 1370;
            break;
        case 118:
            d /= 63254;
            break;
        case 119:
            Test.iFld *= (int)Test.lFld;
            break;
        case 120:
            Test.lFld = i14;
            break;
        }
        long meth_res = i11 + i12 + i13 + i14 + i15 + Double.doubleToLongBits(d) + i16 + i17 + (b ? 1 : 0) + by1 +
            Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l, int i1, int i2) {

        float f=-31.203F;
        int i3=-8, i4=-66, iArr[]=new int[N];
        short s=904;
        double d1=118.29455;
        boolean b1=false;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr, -2);
        FuzzerUtils.init(byArr, (byte)-16);

        i1 = Integer.reverseBytes(iArr[(i1 >>> 1) % N]);
        iArr[(9 >>> 1) % N] -= (int)((long)((Test.instanceCount + i1) - (-7205885986972273451L * (f - i1))) << (i2 +
            (Test.iFld * l)));
        i2 = (int)(Test.instanceCount + (iArr[(70 >>> 1) % N]++));
        for (byte by : byArr) {
            i2 = i1;
            for (i3 = 1; i3 < 4; i3++) {
                s = (short)(((--i1) - iMeth()) + d1);
                if (b1) continue;
                if (i3 != 0) {
                    vMeth_check_sum += l + i1 + i2 + Float.floatToIntBits(f) + i3 + i4 + s +
                        Double.doubleToLongBits(d1) + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr) +
                        FuzzerUtils.checkSum(byArr);
                    return;
                }
                Test.iFld = Test.iFld;
                Test.iFld = i1;
                f *= 210;
                iArr[i3] += (int)Test.instanceCount;
            }
        }
        i2 = (int)50112L;
        i1 = i4;
        vMeth_check_sum += l + i1 + i2 + Float.floatToIntBits(f) + i3 + i4 + s + Double.doubleToLongBits(d1) + (b1 ? 1
            : 0) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-46025, i18=13, i19=246, i20=-34601, i21=22932, i22=43119, i23=-125, i24=-53075, i25=-14;
        short s1=25464;
        float f3=111.813F;
        byte by2=99, byArr2[]=new byte[N];

        FuzzerUtils.init(byArr2, (byte)7);

        fArrFld[(i >>> 1) % N] = (float)(((i++) * dArrFld[(i >>> 1) % N][(i >>> 1) % N]) * i);
        vMeth(Test.lFld, i, -57337);
        for (i18 = 7; i18 < 384; ++i18) {
            s1 -= (short)f3;
            for (i20 = 1; i20 < 67; i20++) {
                i += (i20 - by2);
                i19 += Test.iFld;
                i += Test.iFld;
                i22 = 1;
                do {
                    i23 += (i22 | i);
                    dFld += Test.instanceCount;
                    s1 += (short)i;
                    Test.iFld += (((i22 * i21) + i) - i20);
                    i21 += -42;
                    i21 = -52018;
                    by2 >>= (byte)-3554540914L;
                    fArrFld[i18] -= 12.181F;
                    by2 += (byte)(i22 - i);
                    Test.iFld = i21;
                } while (++i22 < 2);
                i23 += (((i20 * i20) + Test.lFld) - i22);
                Test.instanceCount += -11;
                i21 ^= 13967;
                byArr2[i20] = (byte)14;
            }
            for (i24 = 4; i24 < 67; i24++) {
                byArr2[(i19 >>> 1) % N] >>= (byte)i;
                f3 += (i24 * i24);
                f3 = Test.instanceCount;
                dFld = -1L;
                i21 <<= i21;
            }
            Test.lFld = i24;
        }

        FuzzerUtils.out.println("i i18 i19 = " + i + "," + i18 + "," + i19);
        FuzzerUtils.out.println("s1 f3 i20 = " + s1 + "," + Float.floatToIntBits(f3) + "," + i20);
        FuzzerUtils.out.println("i21 by2 i22 = " + i21 + "," + by2 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("byArr2 = " + FuzzerUtils.checkSum(byArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.lFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Test.lFld);
        FuzzerUtils.out.println("dFld fArrFld dArrFld = " + Double.doubleToLongBits(dFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println("Test.fArrFld1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld1)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
