// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:55 2023
public class Test0921 {

    public static final int N = 400;

    public static long instanceCount=-2769681234628239952L;
    public static byte byFld=88;
    public static volatile int iFld=-9;
    public static double dFld=-1.56394;

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(double d, double d1, int i3) {

        double d2=123.52568;
        int i4=-24349;
        int i5=11;
        int i6=86;
        int i7=7;
        int i8=-26154;
        int[] iArr =new int[N];
        long l1=8L;
        boolean b=false;

        FuzzerUtils.init(iArr, -34635);

        for (d2 = 11; d2 < 274; d2++) {
            Test0921.byFld |= (byte) -66;
            for (i5 = 6; i5 > 1; i5 -= 2) {
                i3 += (i5 * i5);
                i3 = i6;
                i4 += (((i5 * l1) + i5) - l1);
                for (i7 = 1; i7 < 3; i7++) {
                    switch (((i7 % 2) * 5) + 83) {
                    case 84:
                        iArr = iArr;
                        break;
                    case 89:
                        iArr[(int)(d2)] -= i4;
                        break;
                    default:
                        i4 += (i7 + i5);
                        iArr[(int)(d2)] += i7;
                    }
                    Test0921.byFld = (byte) i6;
                    b = b;
                    i3 += i7;
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) + i3 + Double.doubleToLongBits(d2) +
            i4 + i5 + i6 + l1 + i7 + i8 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i) {

        int i1=-154;
        int i2=8939;
        int i9=8;
        int i10=191;
        int i11=-2;
        int i12=232;
        int[] iArr1 =new int[N];
        double d3=-2.64527;
        boolean b1=false;
        short[] sArr =new short[N];

        FuzzerUtils.init(sArr, (short)4879);
        FuzzerUtils.init(iArr1, -2);

        sArr[(i >>> 1) % N] -= (short)-34;
        for (i1 = 194; i1 > 2; --i1) {
            iMeth1(d3, d3, -25729);
            for (i9 = 8; i9 > 1; --i9) {
                short s=-1786;
                Test0921.instanceCount += (((i9 * Test0921.instanceCount) + i) - Test0921.instanceCount);
                s *= (short)i9;
                i2 -= i1;
                switch (((i1 % 4) * 5) + 93) {
                case 99:
                    if (b1) continue;
                    try {
                        i2 = (i9 / i);
                        i10 = (i2 / i);
                        iArr1[i1] = (iArr1[(i9 >>> 1) % N] / 107);
                    } catch (ArithmeticException a_e) {}
                    for (i11 = 1; i11 < 2; ++i11) {
                        i12 = (int) Test0921.instanceCount;
                        i10 >>= (int)-567340082693503213L;
                        if (b1) continue;
                        if (b1) break;
                    }
                    break;
                case 94:
                    i2 += (int)(10367L + (i9 * i9));
                    break;
                case 108:
                    i2 &= 66;
                case 104:
                    i -= (int)-4346736680027586494L;
                    break;
                }
            }
        }
        long meth_res = i + i1 + i2 + Double.doubleToLongBits(d3) + i9 + i10 + (b1 ? 1 : 0) + i11 + i12 +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(byte by, long l) {

        int i13=-47780, i14=-78;
        byte[] byArr =new byte[N];
        float[] fArr =new float[N];

        FuzzerUtils.init(byArr, (byte)-27);
        FuzzerUtils.init(fArr, 0.519F);

        byArr[(-11940 >>> 1) % N] = (byte) (Test0921.instanceCount -= (long) -1.388F);
        iMeth(1);
        fArr[(Test0921.iFld >>> 1) % N] -= Test0921.iFld;
        for (i13 = 297; i13 > 12; i13 -= 2) {
            i14 += (int)(2251919485796130464L + (i13 * i13));
        }
        vMeth_check_sum += by + l + i13 + i14 + FuzzerUtils.checkSum(byArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i15=-135;
        int i16=-61;
        int i17=-235;
        int i18=-33659;
        int i19=-82;
        int i20=8;
        int i21=-26144;
        int i22=6;
        int[] iArr2 =new int[N];
        long l2=-9L;
        long l3=-3445619973L;
        long[] lArr =new long[N];
        float f=29.236F, f1=-1.18F;
        boolean b2=true;
        short[] sArr1 =new short[N];

        FuzzerUtils.init(lArr, -3469520690664986038L);
        FuzzerUtils.init(iArr2, -4);
        FuzzerUtils.init(sArr1, (short)1858);

        vMeth(Test0921.byFld, Test0921.instanceCount);
        for (i15 = 8; i15 < 186; ++i15) {
            lArr = lArr;
            for (l2 = 3; l2 < 141; ++l2) {
                i17 = -205;
                Test0921.instanceCount &= i15;
                f += i16;
            }
        }
        iArr2[(i15 >>> 1) % N] -= (int) Test0921.dFld;
        f -= i16;
        sArr1[(i15 >>> 1) % N] *= (short)i15;
        Test0921.iFld += (int) Test0921.dFld;
        Test0921.iFld >>= Test0921.iFld;
        for (l3 = 11; l3 < 383; ++l3) {
            Test0921.dFld += -94;
            f1 = 68;
            do {
                i18 >>= Test0921.iFld;
            } while ((f1 -= 2) > 0);
            for (i19 = 4; i19 < 68; i19++) {
                if (b2) break;
                iArr2[(int)(l3 - 1)] = i15;
                i18 -= (int)f;
                i20 *= (int)l3;
            }
            i20 += (int)(l3 ^ l3);
        }
        for (i21 = 10; i21 < 344; i21++) {
            switch ((i21 % 4) + 93) {
            case 93:
                i22 *= 1;
                Test0921.iFld /= (int) ((long) (f1) | 1);
                if (b2) continue;
                Test0921.instanceCount = (long) Test0921.dFld;
                break;
            case 94:
                i18 -= (int) Test0921.instanceCount;
                break;
            case 95:
                i17 = -62764;
                break;
            case 96:
                i18 += (i21 ^ (long)f1);
                break;
            default:
                i16 -= i22;
            }
        }

        FuzzerUtils.out.println("i15 i16 l2 = " + i15 + "," + i16 + "," + l2);
        FuzzerUtils.out.println("i17 f l3 = " + i17 + "," + Float.floatToIntBits(f) + "," + l3);
        FuzzerUtils.out.println("i18 f1 i19 = " + i18 + "," + Float.floatToIntBits(f1) + "," + i19);
        FuzzerUtils.out.println("i20 b2 i21 = " + i20 + "," + (b2 ? 1 : 0) + "," + i21);
        FuzzerUtils.out.println("i22 lArr iArr2 = " + i22 + "," + FuzzerUtils.checkSum(lArr) + "," +
            FuzzerUtils.checkSum(iArr2));
        FuzzerUtils.out.println("sArr1 = " + FuzzerUtils.checkSum(sArr1));

        FuzzerUtils.out.println("Test0921.instanceCount Test0921.byFld Test0921.iFld = " + Test0921.instanceCount + "," + Test0921.byFld +
                "," + Test0921.iFld);
        FuzzerUtils.out.println("Test0921.dFld = " + Double.doubleToLongBits(Test0921.dFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0921 _instance = new Test0921();
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
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
