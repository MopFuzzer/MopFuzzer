// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:50 2023
public class Test0824 {

    public static final int N = 400;

    public static long instanceCount=-53424L;
    public static float fFld=1.5F;
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0824.lArrFld, -3994324737L);
    }

    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(double d2) {

        int i7=63902;
        int i8=5;
        int i9=177;
        int i10=-1;
        int i11=-119;
        int[] iArr1 =new int[N];
        byte by=60;
        short s=-22094;
        boolean b1=true;
        float[] fArr1 =new float[N];

        FuzzerUtils.init(iArr1, -215);
        FuzzerUtils.init(fArr1, 1.34F);

        i7 = 1;
        do {
            for (i8 = i7; i8 < 12; ++i8) {
                by += (byte) Test0824.fFld;
            }
            iArr1[i7] += (int) Test0824.fFld;
            i9 = (int) Test0824.fFld;
            i9 += (((i7 * s) + Test0824.instanceCount) - i8);
            fArr1[i7 + 1] -= -215;
            for (i10 = 1; i10 < 12; ++i10) {
                i9 += (int)-3351060930L;
                by += (byte)i10;
                i11 = i10;
                switch ((i7 % 5) + 108) {
                case 108:
                    i9 += (int)d2;
                    i11 = (int) Test0824.instanceCount;
                    fArr1[i7 + 1] = 121;
                case 109:
                    Test0824.fFld -= i9;
                    break;
                case 110:
                    i11 += (i10 + i11);
                    break;
                case 111:
                    i11 += (((i10 * Test0824.instanceCount) + i11) - i7);
                    break;
                case 112:
                    Test0824.fFld += (i10 - Test0824.instanceCount);
                    break;
                default:
                    b1 = b1;
                }
            }
        } while (++i7 < 130);
        vMeth1_check_sum += Double.doubleToLongBits(d2) + i7 + i8 + i9 + by + s + i10 + i11 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public static short sMeth() {

        int i3=24279;
        int i4=-74;
        int i5=-4;
        int i6=13;
        int i12=-38;
        int[][] iArr =new int[N][N];
        double d=-2.92771;
        boolean b=true;
        float f=-12.377F;
        float[] fArr =new float[N];

        FuzzerUtils.init(iArr, -44);
        FuzzerUtils.init(fArr, 0.966F);

        i3 = (iArr[(i3 >>> 1) % N][(i3 >>> 1) % N] - i3);
        i3 += (++i3);
        for (i4 = 11; 193 > i4; i4++) {
            i3 >>>= i4;
            i5 += (int)(fArr[i4 - 1]--);
            for (d = 1; d < 9; d++) {
                double d1=-57.42973;
                i6 = i4;
                if (b = ((i5 >= -63192) & ((f * Test0824.instanceCount) > (d1 = i5)))) break;
            }
        }
        iArr[(i4 >>> 1) % N][(i5 >>> 1) % N] = (int) (((i6 - -33790) + Test0824.instanceCount) * (--i6));
        vMeth1(d);
        Test0824.instanceCount = Test0824.instanceCount;
        i12 = 1;
        while (++i12 < 223) {
            Test0824.instanceCount <<= Test0824.instanceCount;
            i3 += -37622;
            Test0824.instanceCount %= (Test0824.instanceCount | 1);
        }
        long meth_res = i3 + i4 + i5 + Double.doubleToLongBits(d) + i6 + (b ? 1 : 0) + Float.floatToIntBits(f) + i12 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth(long l) {

        int i2=4535;
        int i13=-4;
        int i14=-59794;
        int i15=22577;
        int i16=126;
        int i17=-14865;
        int[] iArr2 =new int[N];
        boolean b2=false;
        long[][] lArr =new long[N][N];

        FuzzerUtils.init(lArr, 7791498070714525761L);
        FuzzerUtils.init(iArr2, -13);

        i2 += (int)lArr[(i2 >>> 1) % N][(i2 >>> 1) % N];
        i2 /= (int)(sMeth() | 1);
        i2 -= i2;
        i13 = 1;
        while (++i13 < 234) {
            switch ((i13 % 2) + 46) {
            case 46:
                i2 &= -211;
                i2 = (int) Test0824.fFld;
                iArr2[i13 - 1] += i2;
                for (i14 = i13; 7 > i14; ++i14) {
                    if (true) {
                        if (true) continue;
                        i15 -= i15;
                        for (i16 = 1; i16 < 1; ++i16) {
                            i2 += i16;
                            iArr2[i13 + 1] -= i13;
                        }
                    } else if (b2) {
                        i2 += (int)l;
                    } else if (b2) {
                        if (b2) continue;
                    }
                }
                break;
            case 47:
                i17 = i17;
                break;
            }
        }
        vMeth_check_sum += l + i2 + i13 + i14 + i15 + i16 + i17 + (b2 ? 1 : 0) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i=18319;
        int i1=50750;
        int i18=-212;
        int i19=-211;
        int i20=46193;
        int i21=55361;
        int i22=-11;
        int i23=-10;
        int i24=-121;
        int i25=-46;
        int i26=10193;
        int i27=-9;
        int i28=33717;
        int[] iArr3 =new int[N];
        short s1=-21769;
        float[][] fArr2 =new float[N][N];

        FuzzerUtils.init(iArr3, 70);
        FuzzerUtils.init(fArr2, -2.338F);

        for (i = 3; i < 125; i += 3) {
            Test0824.instanceCount = (++i1);
            vMeth(Test0824.instanceCount);
            i1 *= i1;
            for (i18 = 136; i18 > 4; i18--) {
                i19 += (i18 * i18);
                for (i20 = 1; 5 > i20; ++i20) {
                    i19 = (int)18109L;
                    Test0824.fFld = i1;
                    i19 >>= i19;
                }
            }
            i21 *= i18;
            for (i22 = 15; i22 < 365; i22++) {
                i1 -= i23;
                Test0824.lArrFld[i22 + 1] >>= i23;
            }
            i23 = (int) Test0824.instanceCount;
            i21 |= (int) Test0824.instanceCount;
            Test0824.instanceCount += i19;
            s1 *= (short)i;
        }
        for (i24 = 3; 303 > i24; i24++) {
            iArr3[i24 + 1] <<= i25;
            i25 >>= (int)-46084L;
            i23 += (int)(1.55F + (i24 * i24));
            i26 = 1;
            do {
                for (i27 = 1; 1 < i27; i27--) {
                    iArr3[i27] -= i26;
                    iArr3[i26 + 1] *= i;
                    iArr3[i26 + 1] = (int) Test0824.instanceCount;
                    fArr2[i27 - 1][i26 + 1] = 10L;
                    i23 -= i21;
                    i1 = i19;
                }
            } while (++i26 < 84);
        }

        FuzzerUtils.out.println("i i1 i18 = " + i + "," + i1 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 s1 = " + i22 + "," + i23 + "," + s1);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 iArr3 = " + i27 + "," + i28 + "," + FuzzerUtils.checkSum(iArr3));
        FuzzerUtils.out.println("fArr2 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2)));

        FuzzerUtils.out.println("Test0824.instanceCount Test0824.fFld Test0824.lArrFld = " + Test0824.instanceCount + "," +
                Float.floatToIntBits(Test0824.fFld) + "," + FuzzerUtils.checkSum(Test0824.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0824 _instance = new Test0824();
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
//DEBUG  sMeth ->  sMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 sMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}