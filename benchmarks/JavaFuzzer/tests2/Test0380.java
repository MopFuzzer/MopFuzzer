// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:29 2023
public class Test0380 {

    public static final int N = 400;

    public static long instanceCount=-225L;
    public static int iFld=-170;
    public static int[] iArrFld =new int[N];
    public long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0380.iArrFld, -176);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l, long l1) {

        double d=0.87804;
        int i7=12965;
        int i8=-45493;
        int i9=-1;
        int i10=-10;
        int i11=7;
        int i12=27975;
        int i13=-64882;
        int i14=-54752;
        int[] iArr1 =new int[N];

        FuzzerUtils.init(iArr1, 43);

        iArr1[(Test0380.iFld >>> 1) % N] += (int) d;
        Test0380.instanceCount = Test0380.iFld;
        for (i7 = 4; i7 < 284; i7++) {
            Test0380.iFld += i7;
            for (i9 = 1; i9 < 6; ++i9) {
                for (i11 = 1; i11 < 2; i11++) {
                    Test0380.instanceCount += -4312594087453612689L;
                    l1 -= i7;
                    d = i9;
                    if (i10 != 0) {
                    }
                    i12 = (int) Test0380.instanceCount;
                }
                for (i13 = 2; i13 > 1; i13 -= 3) {
                    i14 *= (int)d;
                    i8 += i9;
                    iArr1[i9] = (int) Test0380.instanceCount;
                }
            }
        }
        long meth_res = l + l1 + Double.doubleToLongBits(d) + i7 + i8 + i9 + i10 + i11 + i12 + i13 + i14 +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i4, int i5, int i6) {

        short s=2683;
        float f=1.112F;
        int i15=-12;
        int i16=91;
        int i17=-65186;
        int i18=-13;
        int i19=97;
        int i20=-250;
        int[][] iArr2 =new int[N][N];
        double[][] dArr =new double[N][N];

        FuzzerUtils.init(dArr, 64.7309);
        FuzzerUtils.init(iArr2, 478);

        s = (short)i6;
        f = (i4--);
        Test0380.instanceCount <<= 4016;
        iMeth(Test0380.instanceCount, -87L);
        f -= i6;
        for (i15 = 7; i15 < 385; i15++) {
            f *= i15;
            Test0380.iArrFld[i15 - 1] -= 199;
            for (i17 = 4; i17 > 1; i17 -= 2) {
                dArr[i17 - 1][i17] -= i15;
                try {
                    i16 = (i18 % i16);
                    i5 = (870328229 / Test0380.iArrFld[i17]);
                    Test0380.iArrFld[i15 - 1] = (243 % i15);
                } catch (ArithmeticException a_e) {}
                for (i19 = 1; i19 < 4; i19++) {
                    i18 += i19;
                    i16 -= (int)-51.834F;
                    iArr2 = iArr2;
                }
            }
        }
        vMeth1_check_sum += i4 + i5 + i6 + s + Float.floatToIntBits(f) + i15 + i16 + i17 + i18 + i19 + i20 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth() {

        int i=12;
        int i1=-13;
        int i2=-9;
        int i3=-104;
        int i21=-118;
        int i22=-199;
        int i23=99;
        int[] iArr =new int[N];
        boolean b=false;
        long[] lArr =new long[N];

        FuzzerUtils.init(iArr, 175);
        FuzzerUtils.init(lArr, -7L);

        for (i = 269; i > 11; --i) {
            i2 -= (iArr[i]++);
            i3 = 1;
            do {
                vMeth1(Test0380.iFld, Test0380.iFld, Test0380.iFld);
                for (i21 = 1; i21 < 1; i21++) {
                    if (b) break;
                    Test0380.instanceCount += (-75 + (i21 * i21));
                    iArr[i21 + 1] -= -65415;
                }
                i2 += (-2 + (i3 * i3));
                i22 *= 58063;
                Test0380.iFld += (((i3 * i) + i) - i22);
                Test0380.instanceCount += i21;
            } while (++i3 < 6);
        }
        i23 = 1;
        while (++i23 < 357) {
            i22 += (int)36265L;
            lArr[i23 - 1] *= i21;
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i21 + i22 + (b ? 1 : 0) + i23 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        float f1=-122.249F;
        float[] fArr =new float[N];
        int i24=104, i25=9, i26=12, i27=34, i28=-21871, i29=-36106, i30=30, i31=-3, i32=70, i33=0, i34=-151;
        double d1=0.66246;
        short s1=-32599;
        byte by1=107;

        FuzzerUtils.init(fArr, 90.462F);

        vMeth();
        Test0380.iFld += (int) f1;
        fArr[(Test0380.iFld >>> 1) % N] = 20;
        for (i24 = 6; i24 < 232; ++i24) {
            i26 = 1;
            while (++i26 < 111) {
                for (d1 = 1; d1 < 1; d1++) {
                    byte by=51;
                    i25 += (int)(d1 + i24);
                    by -= (byte)i26;
                }
                fArr[i26 + 1] -= Test0380.iFld;
                Test0380.iFld -= s1;
            }
            Test0380.iFld -= (int) Test0380.instanceCount;
            Test0380.instanceCount += s1;
            i27 -= i26;
            for (i28 = 111; i28 > i24; --i28) {
                i29 += (i28 * i28);
                i29 -= -25089;
                Test0380.instanceCount += (i28 * Test0380.iFld);
                lArrFld[i28 + 1] = i24;
                Test0380.iFld = s1;
                i29 *= i27;
                for (i30 = 1; 1 > i30; i30++) {
                    i31 >>>= -14;
                }
            }
            try {
                i29 = (i24 % 1324953608);
                i31 = (i27 / i31);
                i29 = (32807 / i31);
            } catch (ArithmeticException a_e) {}
            i29 += i24;
            i27 = i28;
        }
        Test0380.iFld *= (int) 1.543;
        for (i32 = 2; i32 < 149; ++i32) {
            i34 = 1;
            do {
                Test0380.instanceCount += i34;
                i33 = by1;
            } while (++i34 < 171);
        }

        FuzzerUtils.out.println("f1 i24 i25 = " + Float.floatToIntBits(f1) + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 d1 i27 = " + i26 + "," + Double.doubleToLongBits(d1) + "," + i27);
        FuzzerUtils.out.println("s1 i28 i29 = " + s1 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 i31 i32 = " + i30 + "," + i31 + "," + i32);
        FuzzerUtils.out.println("i33 i34 by1 = " + i33 + "," + i34 + "," + by1);
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0380.instanceCount Test0380.iFld Test0380.iArrFld = " + Test0380.instanceCount + "," + Test0380.iFld +
                "," + FuzzerUtils.checkSum(Test0380.iArrFld));
        FuzzerUtils.out.println("lArrFld = " + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0380 _instance = new Test0380();
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
