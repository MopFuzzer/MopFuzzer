// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:18 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=6936849796780902603L;
    public static float fFld=2.510F;
    public static volatile boolean bFld=false;
    public static byte byFld=-126;
    public static short sFld=13981;
    public double dFld=0.12066;
    public static int iArrFld[][]=new int[N][N];
    public boolean bArrFld[][]=new boolean[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 45428);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(long l2, long l3, short s) {

        int i6=-4, i7=35, i8=-11, i9=50391, i10=16;
        short s1=-27207;
        long l4=-4688155841565141296L;
        double d=0.14530;
        byte by1=8;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -1.708F);

        Test.fFld = Test.instanceCount;
        for (i6 = 10; i6 < 245; i6++) {
            i8 = 1;
            while (++i8 < 7) {
                i7 >>= s1;
                i7 = i6;
                i7 += (int)l3;
                l3 = i7;
                if (Test.bFld) {
                    switch ((i6 % 10) + 14) {
                    case 14:
                        Test.iArrFld[i8 - 1][i8 + 1] *= (int)Test.fFld;
                        for (i9 = 1; 1 > i9; i9++) {
                            switch (((i9 % 3) * 5) + 75) {
                            case 78:
                                i10 += (i9 + Test.fFld);
                                fArr = fArr;
                            case 80:
                                i7 &= (int)l4;
                                break;
                            case 86:
                                d -= Test.fFld;
                                break;
                            }
                        }
                    case 15:
                        i7 += by1;
                        break;
                    case 16:
                        i10 <<= (int)l4;
                        break;
                    case 17:
                        i7 -= (int)l4;
                        break;
                    case 18:
                        d -= i8;
                    case 19:
                        l2 &= l3;
                    case 20:
                        i10 %= (int)(i7 | 1);
                    case 21:
                        i7 >>= i7;
                        break;
                    case 22:
                        Test.iArrFld[i6][i6 - 1] -= i10;
                    case 23:
                        Test.iArrFld[i6 + 1][i8] -= i6;
                        break;
                    }
                } else if (Test.bFld) {
                    Test.fFld = l2;
                }
            }
        }
        long meth_res = l2 + l3 + s + i6 + i7 + i8 + s1 + i9 + i10 + l4 + Double.doubleToLongBits(d) + by1 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(int i3, int i4, int i5) {

        long l5=-4L, lArr[]=new long[N];
        short s2=9198;
        int i11=-9549, i12=-27460, i13=-9192;
        boolean b=true;
        float fArr1[]=new float[N];

        FuzzerUtils.init(lArr, 57L);
        FuzzerUtils.init(fArr1, 65.600F);

        lArr[(i5 >>> 1) % N] = lMeth(-1839418263L, l5, s2);
        i3 *= i5;
        i11 = 1;
        while (++i11 < 348) {
            for (i12 = 1; i12 < 5; ++i12) {
                i3 += (i12 - i12);
                fArr1[i11] += i13;
                i5 ^= (int)l5;
                Test.iArrFld = Test.iArrFld;
                i13 = i12;
                i4 *= i12;
                Test.instanceCount *= i5;
                if (Test.bFld) continue;
                fArr1[i11 - 1] = Test.fFld;
            }
            Test.iArrFld[i11] = Test.iArrFld[i11];
            Test.bFld = b;
        }
        vMeth1_check_sum += i3 + i4 + i5 + l5 + s2 + i11 + i12 + i13 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public static void vMeth(int i, long l, int i1) {

        byte by=84, byArr[][]=new byte[N][N];
        long l1=-603138093L;
        int i2=120, i14=10, i15=56467, i16=-38368, i17=53, i18=-9;

        FuzzerUtils.init(byArr, (byte)14);

        byArr[(i >>> 1) % N][(i >>> 1) % N] = (byte)(-98 + ((Test.fFld - by) * i1));
        for (l1 = 9; l1 < 331; l1 += 2) {
            vMeth1(i1, i, i1);
            Test.iArrFld[(int)(l1 - 1)][(int)(l1)] -= i;
            for (i14 = 1; i14 < 10; i14++) {
                try {
                    i1 = (37720 % i2);
                    Test.iArrFld[(int)(l1)][(int)(l1)] = (i15 / -202);
                    Test.iArrFld[(int)(l1 + 1)][i14 - 1] = (i % i1);
                } catch (ArithmeticException a_e) {}
            }
            i2 = (int)l1;
            i15 = 107;
            l += (l1 * l1);
            if (Test.bFld) {
                i16 = 1;
                while ((i16 += 3) < 10) {
                    for (i17 = i16; i17 < 4; i17++) {
                        Test.instanceCount = i17;
                        i = i15;
                        i18 += (((i17 * i15) + Test.fFld) - i16);
                    }
                }
            } else {
                i1 += i17;
            }
        }
        vMeth_check_sum += i + l + i1 + by + l1 + i2 + i14 + i15 + i16 + i17 + i18 + FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        int i19=9, i21=46703, i22=39275, i23=-65300, i24=-133, i25=37528, i26=-85, i27=-5, iArr[]=new int[N];
        float f=-65.547F;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr, -76);
        FuzzerUtils.init(lArr1, -8042970790225615227L);

        vMeth(148, -99L, i19);
        for (int i20 : iArr) {
            Test.byFld -= (byte)i20;
            bArrFld[(i20 >>> 1) % N][(i19 >>> 1) % N] = Test.bFld;
            i19 = (int)Test.instanceCount;
            i20 *= i20;
            i20 = 47204;
            iArr[(i19 >>> 1) % N] = i20;
            Test.sFld += (short)71.54601;
            for (i21 = 3; i21 < 63; ++i21) {
                dFld -= dFld;
                if (Test.bFld) break;
                dFld -= Test.instanceCount;
                dFld += -2.1246;
                Test.iArrFld[i21][i21] = (int)Test.instanceCount;
                i20 += (int)Test.fFld;
                i22 = 31483;
                i22 += (int)(-2882231712L + (i21 * i21));
                Test.instanceCount = i22;
                if (Test.bFld) continue;
            }
            Test.instanceCount *= i22;
        }
        switch (((941 >>> 1) % 2) + 10) {
        case 10:
            Test.instanceCount = -5652;
            for (f = 277; f > 5; --f) {
                for (i24 = (int)(f); i24 < 92; i24++) {
                    lArr1[(int)(f)] = (long)Test.fFld;
                    for (i26 = 1; 1 > i26; i26 += 3) {
                        Test.bFld = Test.bFld;
                        i19 *= -2729;
                        i22 = i26;
                    }
                }
            }
        case 11:
            Test.iArrFld[(i25 >>> 1) % N][(i23 >>> 1) % N] = i22;
            break;
        }

        FuzzerUtils.out.println("i19 i21 i22 = " + i19 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("f i23 i24 = " + Float.floatToIntBits(f) + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("iArr lArr1 = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.bFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.byFld Test.sFld dFld = " + Test.byFld + "," + Test.sFld + "," +
            Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test.iArrFld bArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(bArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
