// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:41 2023
public class Test0611 {

    public static final int N = 400;

    public static volatile long instanceCount=-4L;
    public float fFld=1.576F;
    public boolean bFld=true;
    public int[] iArrFld =new int[N];
    public double[] dArrFld =new double[N];
    public static int[] iArrFld1 =new int[N];
    public static boolean[] bArrFld =new boolean[N];

    static {
        FuzzerUtils.init(Test0611.iArrFld1, 163);
        FuzzerUtils.init(Test0611.bArrFld, true);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(double d1, boolean b1) {

        int i16=24882, i17=-57;
        short s1=-18720;
        short[] sArr =new short[N];
        byte by=-28;
        boolean b2=true;
        long[][] lArr =new long[N][N];

        FuzzerUtils.init(lArr, 214L);
        FuzzerUtils.init(sArr, (short)-31240);

        for (i16 = 11; i16 < 356; ++i16) {
            Test0611.iArrFld1[i16 + 1] -= i17;
            if (false) {
                if (b1) break;
                i17 -= (int)d1;
                lArr[i16 + 1][i16 + 1] *= i16;
                i17 *= i17;
            } else {
                sArr[i16] -= (short)i16;
                i17 -= i17;
                i17 = i17;
                s1 <<= (short)i16;
            }
            Test0611.iArrFld1[i16 - 1] <<= by;
            i17 = i17;
            b1 = b2;
            if (i16 != 0) {
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + (b1 ? 1 : 0) + i16 + i17 + s1 + by + (b2 ? 1 : 0) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(sArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(int i9, int i10) {

        double d=-32.20303, d2=2.82984;
        int i11=-101, i12=-3, i13=-38411, i14=3, i15=-234;
        short s=31583;
        boolean b=false;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, -2268648462L);

        for (d = 1; d < 186; ++d) {
            i11 = (((i11 * i10) >> Math.max(i10, i10)) * ((i9 ^ i10) + (-(i9 + -35))));
            i9 = (-((i9++) + (-(i9++))));
            switch (((Integer.reverseBytes(i11) >>> 1) % 4) + 22) {
            case 22:
                s += (short) (Test0611.iArrFld1[(int) (d)] * 3.13742);
                try {
                    i9 = (i9 % 171811754);
                    Test0611.iArrFld1[(int) (d + 1)] = (i9 / i10);
                    i10 = (Test0611.iArrFld1[(int) (d)] / 65);
                } catch (ArithmeticException a_e) {}
                Test0611.bArrFld[(int) (d)] = (!(Test0611.bArrFld[(int) (d)] = b));
            case 23:
                i9 >>= (int)-49L;
                for (i12 = 1; i12 < 9; ++i12) {
                    for (i14 = 1; i14 < 2; i14++) {
                        i11 += (int)(2296373895L ^ i12);
                        i13 <<= (int)(lMeth(d, b) - i13);
                        d2 = i11;
                        i13 += i10;
                    }
                    d2 = i12;
                }
            case 24:
                lArr1[(int)(d)] += i13;
                break;
            case 25:
                i10 *= i15;
            }
        }
        vMeth1_check_sum += i9 + i10 + Double.doubleToLongBits(d) + i11 + s + (b ? 1 : 0) + i12 + i13 + i14 + i15 +
            Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth(float f, int i5, int i6) {

        int i7=11, i8=-7, i18=15, i19=11;
        byte by1=38;
        boolean b3=true;
        short s2=-17087;
        double d3=-5.10392;

        for (i7 = 340; i7 > 15; --i7) {
            vMeth1(i5, i5);
            i6 *= by1;
            for (i18 = 1; i18 < 5; ++i18) {
                switch (((i7 % 2) * 5) + 4) {
                case 11:
                    i8 |= (int) Test0611.instanceCount;
                    Test0611.iArrFld1[i18 + 1] = (int) Test0611.instanceCount;
                    Test0611.instanceCount += (((i18 * i6) + i19) - i6);
                    i8 += (((i18 * i7) + Test0611.instanceCount) - i19);
                    break;
                case 13:
                    b3 = b3;
                    Test0611.instanceCount += i8;
                    s2 += (short) (((i18 * i7) + Test0611.instanceCount) - i6);
                default:
                    Test0611.instanceCount = Test0611.instanceCount;
                }
                f = (float)d3;
                i6 = 74;
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i5 + i6 + i7 + i8 + by1 + i18 + i19 + (b3 ? 1 : 0) + s2 +
            Double.doubleToLongBits(d3);
    }

    public void mainTest(String[] strArr1) {

        int i=-12557, i1=220, i2=-53801, i3=-37, i4=-37186, i20=52686, i22=13313, i23=-1;
        short s3=-5811;
        byte by2=7;
        long[] lArr2 =new long[N];
        float[] fArr =new float[N];

        FuzzerUtils.init(lArr2, -58L);
        FuzzerUtils.init(fArr, 98.599F);

        Test0611.instanceCount -= (iArrFld[(i >>> 1) % N]--);
        Test0611.instanceCount = (long) (((i - i) + (i++)) - (fFld + dArrFld[(i >>> 1) % N]));
        for (i1 = 299; i1 > 5; i1 -= 2) {
            i += (int) ((--Test0611.instanceCount) + (--i));
            for (i3 = 5; i3 < 171; ++i3) {
                int i21=55777;
                i4 -= (int) (++Test0611.instanceCount);
                vMeth(fFld, i2, i4);
                switch (((i3 % 8) * 5) + 112) {
                case 116:
                    fFld += -3935453296L;
                    i20 = 1;
                    while (++i20 < 2) {
                        lArr2[i20 + 1] = i1;
                        i4 += (-1 + (i20 * i20));
                        i2 += (((i20 * i1) + i1) - Test0611.instanceCount);
                    }
                    Test0611.instanceCount *= -165L;
                    i4 = -44403;
                case 152:
                    switch (((i21 >>> 1) % 2) + 7) {
                    case 7:
                        s3 = (short)-9476L;
                        if (true) break;
                    case 8:
                        if (bFld) continue;
                        break;
                    }
                    for (i22 = 1; i22 < 2; i22++) {
                        Test0611.iArrFld1[i1] = i;
                        i2 += (-26734 + (i22 * i22));
                        i23 += i22;
                        i4 -= i23;
                        i4 += (int)fFld;
                        switch (((i1 % 4) * 5) + 38) {
                        case 40:
                        case 43:
                            fArr = FuzzerUtils.float1array(N, (float)-1.795F);
                        case 53:
                            Test0611.instanceCount -= Test0611.instanceCount;
                            Test0611.iArrFld1[i22] += i2;
                            Test0611.instanceCount &= 10;
                            break;
                        case 48:
                            s3 = (short) Test0611.instanceCount;
                            break;
                        default:
                            i23 = (int)fFld;
                        }
                    }
                    break;
                case 150:
                    i -= by2;
                case 126:
                    s3 = (short)i4;
                case 119:
                    i |= i23;
                    break;
                case 132:
                    i23 = i;
                    break;
                case 125:
                    i2 -= i4;
                    break;
                case 135:
                    iArrFld[i1] += i4;
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 i20 = " + i3 + "," + i4 + "," + i20);
        FuzzerUtils.out.println("s3 i22 i23 = " + s3 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("by2 lArr2 fArr = " + by2 + "," + FuzzerUtils.checkSum(lArr2) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0611.instanceCount fFld bFld = " + Test0611.instanceCount + "," +
            Float.floatToIntBits(fFld) + "," + (bFld ? 1 : 0));
        FuzzerUtils.out.println("iArrFld dArrFld Test0611.iArrFld1 = " + FuzzerUtils.checkSum(iArrFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)) + "," + FuzzerUtils.checkSum(Test0611.iArrFld1));
        FuzzerUtils.out.println("Test0611.bArrFld = " + FuzzerUtils.checkSum(Test0611.bArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0611 _instance = new Test0611();
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
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
