// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:27 2023
public class Test0321 {

    public static final int N = 400;

    public static long instanceCount=-8L;
    public static float fFld=-2.367F;
    public static short sFld=11667;
    public byte byFld=-102;
    public static short[] sArrFld =new short[N];

    static {
        FuzzerUtils.init(Test0321.sArrFld, (short) 6180);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(float f1, float f2, long l) {

        int i3=-1, i4=-59517, i5=-86, i6=-1161;
        boolean b=false;
        long[] lArr1 =new long[N];
        float[] fArr =new float[N];

        FuzzerUtils.init(lArr1, 7926466361858887160L);
        FuzzerUtils.init(fArr, -1.175F);

        for (short s : Test0321.sArrFld) {
            i3 = 1;
            do {
                i4 += i4;
                i4 *= -26;
                i4 = i3;
                i4 *= (int)l;
                Test0321.instanceCount >>= l;
                l *= Test0321.instanceCount;
                for (i5 = 1; i5 > 1; --i5) {
                    b = false;
                    lArr1[i5 + 1] >>= l;
                    fArr[i3 + 1] += i4;
                    f1 += i6;
                    f2 += (8 + (i5 * i5));
                    i4 &= i5;
                }
            } while (++i3 < 4);
        }
        vMeth1_check_sum += Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + l + i3 + i4 + i5 + i6 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(lArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(int i2) {

        int i7=88, i8=648, i9=-53122, i10=-61245, i11=4, i12=14;
        boolean b1=true;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -11L);

        lArr[(i2 >>> 1) % N] -= (long)Float.intBitsToFloat(i2 -= (i2 - i2));
        vMeth1(-82.666F, Test0321.fFld, Test0321.instanceCount);
        for (i7 = 5; 176 > i7; i7 += 2) {
            double d=-11.105920;
            d -= i8;
            Test0321.sArrFld = FuzzerUtils.short1array(N, (short) -26591);
            for (i9 = 1; i9 < 18; i9++) {
                i10 >>= 6;
                Test0321.fFld += (float) d;
                for (i11 = 1; i11 < 2; i11++) {
                    i8 *= i8;
                    i2 -= (int) Test0321.fFld;
                    Test0321.instanceCount -= i12;
                    i12 = (int) Test0321.instanceCount;
                    b1 = b1;
                    i12 += (int)(0.818F + (i11 * i11));
                }
            }
        }
        vMeth_check_sum += i2 + i7 + i8 + i9 + i10 + i11 + i12 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(int i) {

        int i1=-24991;
        int i13=-34225;
        int i14=13;
        int i15=26347;
        int i16=237;
        int[] iArr =new int[N];
        float f=1.187F;
        long l2=-2308064668L;

        FuzzerUtils.init(iArr, -42);

        i1 = 1;
        while (++i1 < 132) {
            f += i1;
            f = (Test0321.instanceCount * (++iArr[i1]));
        }
        vMeth(i);
        i13 -= (int)f;
        i14 = 1;
        while (++i14 < 157) {
            i13 &= i13;
        }
        switch (((i >>> 1) % 1) + 104) {
        case 104:
            i13 += (int) Test0321.instanceCount;
            for (i15 = 9; i15 < 207; ++i15) {
                l2 = 8;
                while (--l2 > 0) {
                    Test0321.sFld += (short) (38323 + (l2 * l2));
                    Test0321.fFld = i16;
                    try {
                        iArr[i15] = (-16953 % i13);
                        iArr[(int)(l2 + 1)] = (-253437950 / i16);
                        i = (30913 % i13);
                    } catch (ArithmeticException a_e) {}
                    Test0321.sFld >>= (short) i1;
                }
            }
            break;
        }
        long meth_res = i + i1 + Float.floatToIntBits(f) + i13 + i14 + i15 + i16 + l2 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i17=11;
        int i19=-216;
        int i20=-32261;
        int i21=50533;
        int i22=94;
        int i23=10759;
        int[] iArr1 =new int[N];
        double d1=1.14792;
        boolean b2=false;
        boolean[] bArr =new boolean[N];
        byte[] byArr =new byte[N];
        float[] fArr1 =new float[N];
        long[] lArr2 =new long[N];

        FuzzerUtils.init(byArr, (byte)-48);
        FuzzerUtils.init(fArr1, -87.766F);
        FuzzerUtils.init(iArr1, -154);
        FuzzerUtils.init(lArr2, 12463L);
        FuzzerUtils.init(bArr, false);

        iMeth(i17);
        byArr[(-36789 >>> 1) % N] *= (byte)d1;
        for (float f3 : fArr1) {
            Test0321.sFld <<= (short) i17;
            d1 = 58624;
            i19 = 1;
            while (++i19 < 63) {
                lArr2[i19] &= i17;
            }
            lArr2 = lArr2;
            iArr1[(i19 >>> 1) % N] = -243;
            for (i20 = 2; i20 < 63; ++i20) {
                for (i22 = i20; 2 > i22; i22++) {
                    i17 += (i22 + i19);
                    Test0321.instanceCount = i19;
                    i23 = i21;
                    i23 |= Test0321.sFld;
                    i21 = (int)f3;
                    switch ((i22 % 2) + 89) {
                    case 89:
                        i23 -= (int)-2.34261;
                        Test0321.fFld = i22;
                        i17 = (int)f3;
                        f3 += (i22 * i22);
                    case 90:
                        i23 = Test0321.sFld;
                        bArr[i20] = b2;
                        i17 += (i22 * i22);
                        break;
                    default:
                        i17 = i21;
                    }
                    fArr1 = FuzzerUtils.float1array(N, (float)-125.476F);
                    i23 += (int) Test0321.fFld;
                }
                byFld -= (byte) Test0321.instanceCount;
                Test0321.fFld = i17;
            }
            i17 -= (int) Test0321.instanceCount;
        }

        FuzzerUtils.out.println("i17 d1 i19 = " + i17 + "," + Double.doubleToLongBits(d1) + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 b2 byArr = " + i23 + "," + (b2 ? 1 : 0) + "," + FuzzerUtils.checkSum(byArr));
        FuzzerUtils.out.println("fArr1 iArr1 lArr2 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + "," +
            FuzzerUtils.checkSum(iArr1) + "," + FuzzerUtils.checkSum(lArr2));
        FuzzerUtils.out.println("bArr = " + FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test0321.instanceCount Test0321.fFld Test0321.sFld = " + Test0321.instanceCount + "," +
                Float.floatToIntBits(Test0321.fFld) + "," + Test0321.sFld);
        FuzzerUtils.out.println("byFld Test0321.sArrFld = " + byFld + "," + FuzzerUtils.checkSum(Test0321.sArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0321 _instance = new Test0321();
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
