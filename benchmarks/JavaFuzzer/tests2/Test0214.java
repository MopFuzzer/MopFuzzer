// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:22 2023
public class Test0214 {

    public static final int N = 400;

    public static long instanceCount=8595373718300155698L;
    public static volatile byte byFld=-13;
    public volatile float fFld=3.123F;
    public int iFld=-7;
    public int[][] iArrFld =new int[N][N];

    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i7=11;
        int i8=-146;
        int i9=16374;
        int i10=-2;
        int i11=1;
        int i12=22337;
        int i13=-53;
        int[] iArr1 =new int[N];
        double d2=2.109060;
        float[] fArr =new float[N];

        FuzzerUtils.init(iArr1, 17051);
        FuzzerUtils.init(fArr, -85.657F);

        iArr1[(47132 >>> 1) % N] *= Test0214.byFld;
        for (i7 = 1; 264 > i7; ++i7) {
            i8 = i7;
            for (i9 = i7; i9 < 6; ++i9) {
                i8 += (i9 - i9);
                Test0214.instanceCount += i7;
                for (i11 = i9; i11 < 1; ++i11) {
                    d2 -= i12;
                    Test0214.instanceCount += i7;
                }
            }
            i13 = 1;
            while (++i13 < 6) {
                i12 = -179;
                Test0214.instanceCount -= -5867;
                i12 = i9;
                fArr[i13 + 1] = 7;
                i12 = i13;
            }
        }
        vMeth1_check_sum += i7 + i8 + i9 + i10 + i11 + i12 + Double.doubleToLongBits(d2) + i13 +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static double dMeth(float f, int i5, double d1) {

        int i6=11, i14=3, i15=-1, i16=26, i17=-13;
        short s=4615;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -14016L);

        i6 = 1;
        do {
            vMeth1();
            i5 <<= i5;
            for (i14 = 1; i14 < 7; ++i14) {
                i15 += (((i14 * Test0214.instanceCount) + Test0214.byFld) - s);
                if (i15 != 0) {
                }
                i5 = i6;
                i5 += i14;
                i15 <<= i15;
                f = 166;
                i5 -= i5;
                lArr[i14] = (long)d1;
                for (i16 = 1; i16 < 2; i16++) {
                    Test0214.instanceCount += (88 + (i16 * i16));
                    i5 = (int) Test0214.instanceCount;
                }
            }
        } while (++i6 < 229);
        long meth_res = Float.floatToIntBits(f) + i5 + Double.doubleToLongBits(d1) + i6 + i14 + i15 + s + i16 + i17 +
            FuzzerUtils.checkSum(lArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void vMeth(int i2, double d) {

        int i3=-53309;
        int i4=-20;
        int i18=47209;
        int i19=11;
        int i20=12;
        int[] iArr =new int[N];
        boolean b=true;
        boolean[] bArr =new boolean[N];
        short s1=-7920;

        FuzzerUtils.init(iArr, -14);
        FuzzerUtils.init(bArr, false);

        for (i3 = 5; i3 < 235; i3++) {
            iArr[i3] *= (int)dMeth(fFld, i4, d);
            Test0214.instanceCount -= i4;
            Test0214.byFld = (byte) i3;
            i2 += i3;
            iArr[i3 + 1] = (int)fFld;
            bArr[i3 + 1] = b;
            for (i18 = 7; i3 < i18; i18--) {
                Test0214.instanceCount = i19;
                i19 >>>= s1;
                i20 = 1;
                while (++i20 < 1) {
                    i19 = (int) Test0214.instanceCount;
                    d = i19;
                    i19 ^= (int) Test0214.instanceCount;
                    Test0214.instanceCount >>= i2;
                }
            }
        }
        vMeth_check_sum += i2 + Double.doubleToLongBits(d) + i3 + i4 + (b ? 1 : 0) + i18 + i19 + s1 + i20 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-9673, i1=-198, i21=-5, i22=-173, i23=163, i24=-36540, i25=-7, i26=56817, i27=-27748;
        double d3=-23.29447;
        short s2=-25619;
        long l=-58926L;
        long[] lArr1 =new long[N];
        boolean[] bArr1 =new boolean[N];

        FuzzerUtils.init(bArr1, true);
        FuzzerUtils.init(lArr1, -10L);

        for (i = 133; i > 7; i -= 3) {
            vMeth(-27, d3);
        }
        for (i21 = 14; i21 < 353; ++i21) {
            i1 |= (int) Test0214.instanceCount;
        }
        for (i23 = 15; i23 < 344; ++i23) {
            boolean b1=true;
            i24 += (121 + (i23 * i23));
            switch ((i23 % 1) + 21) {
            case 21:
                i22 += 177;
                if (b1) {
                    i1 = i23;
                    i24 -= (int)-4287810329512262564L;
                }
                i22 -= (int)-2518712827L;
                break;
            default:
                fFld *= -45.96F;
                i22 = s2;
                Test0214.instanceCount -= i22;
                for (l = i23; l < 76; l++) {
                    i1 += (int)l;
                    for (i26 = 1; i26 < 1; i26++) {
                        i24 = (int) Test0214.instanceCount;
                        i1 -= i27;
                        s2 += (short)(2969038721L + (i26 * i26));
                        switch (((i23 % 10) * 5) + 87) {
                        case 107:
                            i24 += (((i26 * i1) + i1) - i25);
                            i24 -= i21;
                            s2 >>= (short)i21;
                            break;
                        case 113:
                        case 116:
                            bArr1[i26 + 1] = true;
                            i1 += (i26 * i26);
                            s2 = (short)l;
                            lArr1[i23 + 1] >>= Test0214.instanceCount;
                        case 89:
                            fFld -= fFld;
                        case 115:
                            i1 = i24;
                            break;
                        case 110:
                            iArrFld[i23 + 1][i23] -= -4;
                            break;
                        case 98:
                            i24 <<= (int)l;
                            break;
                        case 108:
                            i1 = i22;
                            break;
                        case 111:
                            iArrFld[(int)(l)][(int)(l - 1)] = (int)fFld;
                            break;
                        case 100:
                            iArrFld[i26][i26 + 1] >>= i21;
                            break;
                        default:
                            try {
                                iFld = (iArrFld[i23][i23] / -23461);
                                i22 = (i24 / -12974);
                                i24 = (i24 % i26);
                            } catch (ArithmeticException a_e) {}
                        }
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 d3 = " + i + "," + i1 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 s2 l = " + i24 + "," + s2 + "," + l);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("bArr1 lArr1 = " + FuzzerUtils.checkSum(bArr1) + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0214.instanceCount Test0214.byFld fFld = " + Test0214.instanceCount + "," + Test0214.byFld + "," +
            Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("iFld iArrFld = " + iFld + "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0214 _instance = new Test0214();
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
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
