// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:52 2023
public class Test0855 {

    public static final int N = 400;

    public static long instanceCount=-2L;
    public byte byFld=-13;
    public static float fFld=0.959F;
    public static volatile byte byFld1=-43;
    public static short sFld=-6053;
    public static double dFld=1.41464;
    public static volatile long lFld=-45L;
    public long[] lArrFld =new long[N];
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0855.iArrFld, 64712);
    }

    public static long dMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static boolean bMeth(long l3) {

        double d2=2.69948;

        d2 -= d2;
        long meth_res = l3 + Double.doubleToLongBits(d2);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static int iMeth1() {

        int i12=-1, i13=-63936, i14=-126, i15=13, i16=-127;
        double d3=-25.128083;
        float[] fArr =new float[N];
        short[] sArr =new short[N];

        FuzzerUtils.init(fArr, -91.878F);
        FuzzerUtils.init(sArr, (short)-21331);

        for (i12 = 20; i12 < 325; i12++) {
            Test0855.instanceCount += (((i12 * Test0855.fFld) + i13) - i12);
            switch ((((i12 >>> 1) % 2) * 5) + 68) {
            case 71:
                for (d3 = i12; d3 < 5; ++d3) {
                    for (i15 = 1; 1 > i15; ++i15) {
                        i16 += (i15 * i15);
                        Test0855.iArrFld[(int) (d3 - 1)] -= Test0855.byFld1;
                        i16 = (int) Test0855.fFld;
                        switch ((i15 % 7) + 10) {
                        case 10:
                            if (i15 != 0) {
                            }
                            Test0855.instanceCount = -54147;
                            switch ((int)((d3 % 2) + 73)) {
                            case 73:
                            case 74:
                                Test0855.iArrFld[(int) (d3)] = i13;
                            }
                            break;
                        case 11:
                            Test0855.sFld = (short) i14;
                            i16 <<= (int) Test0855.instanceCount;
                            break;
                        case 12:
                            i13 = i15;
                            break;
                        case 13:
                            Test0855.dFld += i12;
                        case 14:
                            i16 = 8;
                            break;
                        case 15:
                            fArr = fArr;
                            break;
                        case 16:
                            Test0855.instanceCount += (i15 - i14);
                            break;
                        default:
                            sArr[i12 - 1] += (short)179;
                        }
                    }
                }
                break;
            case 78:
                Test0855.iArrFld[i12 - 1] = i13;
            }
        }
        long meth_res = i12 + i13 + Double.doubleToLongBits(d3) + i14 + i15 + i16 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(sArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l4, int i9) {

        int i10=-202, i11=-16555, i17=-23651, i18=-10, i19=-164, i20=-206, i21=1;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -35640149836979002L);

        Test0855.instanceCount -= i9;
        for (i10 = 15; i10 < 298; i10++) {
            i9 = (Test0855.iArrFld[i10 - 1] = ((3376 * Integer.reverseBytes(-3)) + iMeth1()));
            i9 >>= (int) Test0855.instanceCount;
            for (i17 = i10; i17 < 6; ++i17) {
                i18 >>= (int)664712818L;
                i18 >>>= (int)l4;
                i9 = (int)2.123904;
                lArr[i17 - 1] += i10;
                i11 += (((i17 * Test0855.fFld) + Test0855.byFld1) - i9);
                i19 += (int) Test0855.fFld;
                l4 -= -13L;
                for (i20 = 1; 1 > i20; ++i20) {
                    Test0855.fFld -= Test0855.fFld;
                    i11 = (int) Test0855.instanceCount;
                }
            }
        }
        long meth_res = l4 + i9 + i10 + i11 + i17 + i18 + i19 + i20 + i21 + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public double dMeth(short s, long l1) {

        int i3=4, i4=-122, i5=-203, i6=-8, i7=1027, i8=-14;
        long l2=3059041620L;
        double d1=-2.19799;

        for (i3 = 16; i3 < 381; ++i3) {
            for (i5 = 5; i5 > 1; i5 -= 2) {
                byFld *= (byte)(((i4 + i4) + (l2 / -11)) + (d1 * (d1 + l1)));
                for (i7 = 3; i7 > 1; i7--) {
                    boolean b1=false;
                    lArrFld[i3] += (long) Test0855.fFld;
                    if (b1 = bMeth(l2)) continue;
                    switch ((i5 % 1) + 61) {
                    case 61:
                        l2 += i7;
                        i4 >>= (i8 ^ i7);
                        i6 = (iMeth(Test0855.instanceCount, -8) * i7);
                        l2 += i7;
                    default:
                        Test0855.fFld /= (i5 | 1);
                        i8 = (int)-45.726F;
                    }
                    i8 += (int)(-105.710F + (i7 * i7));
                    i4 >>= (int)l1;
                }
            }
        }
        long meth_res = s + l1 + i3 + i4 + i5 + i6 + l2 + Double.doubleToLongBits(d1) + i7 + i8;
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr3) {

        long l=-7L;
        int i1=112, i2=0, i22=8, i23=61, i24=3, i25=1, i26=12671;
        boolean b=true;
        short s1=13032;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, 0.42463);

        l = 1;
        do {
            for (i1 = 1; i1 < 92; ++i1) {
                i2 += (((i1 * i2) + i1) - byFld);
                b = (((i2 - -188) - dMeth(Test0855.sFld, l)) != i1);
            }
            b = b;
        } while (++l < 274);
        i2 >>= i2;
        i22 = 1;
        while (++i22 < 146) {
            for (i23 = i22; i23 < 172; i23++) {
                Test0855.instanceCount += (i23 * i23);
                i24 &= i22;
                dArr[i23 + 1] = Test0855.lFld;
                for (i25 = 1; 1 > i25; ++i25) {
                    Test0855.iArrFld[i22 + 1] = i1;
                    Test0855.dFld = i2;
                    i2 += (int)224L;
                    Test0855.iArrFld[i22 + 1] -= (int) -4112011746L;
                    i26 += (-33722 + (i25 * i25));
                    switch ((i23 % 3) + 24) {
                    case 24:
                        i26 = s1;
                        break;
                    case 25:
                        Test0855.lFld = Test0855.instanceCount;
                    case 26:
                        i2 = (int) Test0855.lFld;
                        i2 *= i22;
                        break;
                    }
                }
            }
            if (b) {
                if (b) continue;
            } else if (b) {
                Test0855.iArrFld[i22 + 1] |= i26;
                if (b) continue;
            } else {
                Test0855.fFld -= i23;
                Test0855.instanceCount += i22;
                i26 += (i22 * i25);
                i2 = (int) Test0855.fFld;
            }
        }

        FuzzerUtils.out.println("l i1 i2 = " + l + "," + i1 + "," + i2);
        FuzzerUtils.out.println("b i22 i23 = " + (b ? 1 : 0) + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("s1 dArr = " + s1 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0855.instanceCount byFld Test0855.fFld = " + Test0855.instanceCount + "," + byFld + "," +
                Float.floatToIntBits(Test0855.fFld));
        FuzzerUtils.out.println("Test0855.byFld1 Test0855.sFld Test0855.dFld = " + Test0855.byFld1 + "," + Test0855.sFld + "," +
                Double.doubleToLongBits(Test0855.dFld));
        FuzzerUtils.out.println("Test0855.lFld lArrFld Test0855.iArrFld = " + Test0855.lFld + "," + FuzzerUtils.checkSum(lArrFld) +
                "," + FuzzerUtils.checkSum(Test0855.iArrFld));

        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
    }
    public static void main(String[] strArr2) {

        try {
            Test0855 _instance = new Test0855();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr2);
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
//DEBUG  bMeth ->  bMeth dMeth mainTest
//DEBUG  iMeth ->  iMeth dMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}