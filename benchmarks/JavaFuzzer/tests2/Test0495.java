// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:35 2023
public class Test0495 {

    public static final int N = 400;

    public static long instanceCount=3006399751L;
    public boolean bFld=false;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0495.iArrFld, 11);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static int iMeth2(int i11, double d) {

        int i12=-34428, i13=2, i14=-40433;
        double[] dArr =new double[N];

        FuzzerUtils.init(dArr, 0.113486);

        Test0495.instanceCount += i11;
        Test0495.iArrFld[(i11 >>> 1) % N] -= i11;
        dArr[(-61118 >>> 1) % N] *= i11;
        for (i12 = 6; i12 < 285; i12++) {
            i14 = 6;
            do {
                float f4=-63.319F;
                f4 += f4;
                d = -44894;
                i13 |= i14;
                i13 += i12;
                f4 = Test0495.instanceCount;
                Test0495.instanceCount = i11;
                i13 = i14;
                i11 = (int)d;
                i13 >>>= -62;
            } while (--i14 > 0);
            i13 += i12;
        }
        long meth_res = i11 + Double.doubleToLongBits(d) + i12 + i13 + i14 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(long l1, int i7) {

        int i8=-14473, i9=3247, i10=12, i15=7, i16=-148, i17=25715, i18=-28318;
        double d1=1.100548;
        double[] dArr1 =new double[N];
        float f5=65.724F;
        boolean b=false;
        byte[] byArr =new byte[N];

        FuzzerUtils.init(dArr1, 1.1327);
        FuzzerUtils.init(byArr, (byte)-7);

        i8 = 1;
        while (++i8 < 245) {
            for (i9 = 1; i9 < 7; ++i9) {
                float f3=-2.224F;
                Test0495.iArrFld[i9] &= (++i10);
                f3 = (170 + iMeth2(i9, d1));
                i7 %= (int)((long)(f3) | 1);
                if (i8 != 0) {
                }
            }
        }
        i15 = 1;
        do {
            f5 *= i8;
            for (i16 = 1; i16 < 4; ++i16) {
                dArr1[i15] -= f5;
                byArr[i16 - 1] = (byte)l1;
            }
            b = true;
            i10 = i7;
            if (true) break;
        } while (++i15 < 383);
        Test0495.instanceCount = i18;
        long meth_res = l1 + i7 + i8 + i9 + i10 + Double.doubleToLongBits(d1) + i15 + Float.floatToIntBits(f5) + i16 +
            i17 + (b ? 1 : 0) + i18 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)) +
            FuzzerUtils.checkSum(byArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        float f1=88.682F;
        float f2=0.894F;
        float[] fArr =new float[N];
        int i2=-2, i3=-11, i4=-30994, i5=-232, i6=4546, i19=46134;
        boolean b1=true;
        short s1=15555;
        byte by1=19;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -91L);
        FuzzerUtils.init(fArr, 65.686F);

        for (f1 = 21; f1 < 337; ++f1) {
            for (i3 = 1; i3 < 5; i3++) {
                switch ((int)((f1 % 7) + 73)) {
                case 73:
                    for (i5 = 1; i5 < 2; ++i5) {
                        f2 -= ((long) ((f2 *= i5) - (5 * iMeth1(Test0495.instanceCount, 34932))) >>> -11L);
                        i6 = i6;
                        if (b1) continue;
                        Test0495.instanceCount += (i5 + s1);
                        lArr[i5 - 1] += i2;
                        switch (((i5 >>> 1) % 2) + 5) {
                        case 5:
                            Test0495.iArrFld[(int) (f1 - 1)] = i5;
                            Test0495.iArrFld[i5 - 1] <<= i4;
                            i4 += (((i5 * i19) + Test0495.instanceCount) - i5);
                            break;
                        case 6:
                            s1 += (short)i5;
                            i2 = (int) Test0495.instanceCount;
                        }
                    }
                    break;
                case 74:
                    fArr[(int)(f1 + 1)] -= f1;
                    break;
                case 75:
                case 76:
                    f2 += Test0495.instanceCount;
                    break;
                case 77:
                    i6 = i2;
                    break;
                case 78:
                    i2 *= (int) Test0495.instanceCount;
                    break;
                case 79:
                    f2 += by1;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f1) + i2 + i3 + i4 + i5 + i6 + Float.floatToIntBits(f2) + (b1 ? 1 : 0) +
            s1 + i19 + by1 + FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=18195;
        int i1=-25004;
        int i20=-238;
        int i21=-32;
        int i22=-60619;
        int i23=64;
        int[] iArr =new int[N];
        float f=-1.113F;
        float f6=2.1005F;
        float[] fArr1 =new float[N];
        short s=18178;
        byte by=94;
        long l=-620080551274847518L;
        long[] lArr1 =new long[N];
        double d2=-1.34260;

        FuzzerUtils.init(iArr, -12);
        FuzzerUtils.init(lArr1, -54401L);
        FuzzerUtils.init(fArr1, -1.793F);

        i -= (int) ((Test0495.instanceCount--) - ((i + i) + (-21597 - (-f))));
        s = (short)(((i++) % ((-(i * by)) | 1)) - s);
        iArr[(i >>> 1) % N] += (int) (((f * Test0495.instanceCount) * Test0495.instanceCount) + (++i));
        for (l = 15; l < 315; l++) {
            iArr[(int)(l)] = (iMeth() - i);
            bFld = bFld;
        }
        for (i20 = 17; i20 < 286; ++i20) {
            i22 = 93;
            while (--i22 > 0) {
                for (f6 = 1; 1 > f6; ++f6) {
                    f = Test0495.instanceCount;
                    i1 -= (int)f6;
                    Test0495.iArrFld[(int) (f6)] += i;
                    Test0495.instanceCount += (long) (f6 * f6);
                    Test0495.iArrFld[i20] += (int) 1344130962838466985L;
                    switch ((((147 >>> 1) % 10) * 5) + 52) {
                    case 57:
                        i1 >>= -172;
                        break;
                    case 93:
                        i1 = (int) Test0495.instanceCount;
                    case 87:
                        Test0495.instanceCount = by;
                        lArr1[i22 - 1] -= i;
                        fArr1[i22] -= i;
                        break;
                    case 72:
                        i21 += (int)(((f6 * l) + i22) - l);
                        f %= ((long)(f6) | 1);
                        break;
                    case 96:
                        i21 *= i;
                        break;
                    case 77:
                    case 62:
                        i1 -= (int)l;
                        switch ((i20 % 2) + 126) {
                        case 126:
                            Test0495.iArrFld[(int) (f6 - 1)] *= (int) d2;
                            i1 -= i21;
                            d2 -= 21285L;
                            lArr1[(int)(f6 + 1)] += l;
                            break;
                        case 127:
                            Test0495.instanceCount = i21;
                        }
                        break;
                    case 99:
                        by = (byte)l;
                    case 94:
                        lArr1[i22] *= i23;
                        break;
                    case 97:
                        lArr1[(int) (f6 + 1)] = Test0495.instanceCount;
                        break;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i f s = " + i + "," + Float.floatToIntBits(f) + "," + s);
        FuzzerUtils.out.println("by l i1 = " + by + "," + l + "," + i1);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("f6 i23 d2 = " + Float.floatToIntBits(f6) + "," + i23 + "," +
            Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("iArr lArr1 fArr1 = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(lArr1)
            + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test0495.instanceCount bFld Test0495.iArrFld = " + Test0495.instanceCount + "," + (bFld ? 1 : 0) +
                "," + FuzzerUtils.checkSum(Test0495.iArrFld));

        FuzzerUtils.out.println("iMeth2_check_sum: " + iMeth2_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0495 _instance = new Test0495();
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
