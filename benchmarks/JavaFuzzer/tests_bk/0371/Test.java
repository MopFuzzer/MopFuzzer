// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:02 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-2L;
    public static float fFld=104.244F;
    public static boolean bFld=true;
    public int iFld=-126;
    public static double dFld=26.114124;
    public static volatile byte byArrFld[][]=new byte[N][N];
    public byte byArrFld1[]=new byte[N];
    public static double dArrFld[][]=new double[N][N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)-27);
        FuzzerUtils.init(Test.dArrFld, -23.69209);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i4) {

        int i5=253, i6=0, i8=-8, i9=-8, i10=-194, iArr1[]=new int[N];
        short s=10185;
        long l3=-4L, lArr1[]=new long[N];
        double d1=1.106733, dArr[]=new double[N];

        FuzzerUtils.init(lArr1, 4070602563681756234L);
        FuzzerUtils.init(iArr1, -14);
        FuzzerUtils.init(dArr, 2.77336);

        lArr1[(i5 >>> 1) % N] <<= s;
        i6 = 1;
        do {
            i4 *= -10;
            for (l3 = 1; l3 < 5; ++l3) {
                i8 -= (int)106L;
                Test.instanceCount -= i5;
                Test.instanceCount = i6;
                iArr1[i6] *= (int)-7963061898173778822L;
                i4 += (int)l3;
                for (i9 = (int)(l3); i9 < 2; ++i9) {
                    i8 -= (int)Test.instanceCount;
                    Test.instanceCount = i9;
                    i10 = i4;
                    Test.byArrFld[i9 - 1][i9] <<= (byte)122L;
                    dArr[(int)(l3 + 1)] += d1;
                }
            }
        } while (++i6 < 333);
        vMeth2_check_sum += i4 + i5 + s + i6 + l3 + i8 + i9 + i10 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth1(long l2, int i3) {

        double d2=-1.11494;
        int i12=-198, i13=20979, i14=-13, i15=-14, i16=57471, iArr2[]=new int[N];
        boolean b=false;

        FuzzerUtils.init(iArr2, 45538);

        vMeth2(i3);
        d2 *= 8L;
        for (int i11 : iArr2) {
            l2 += l2;
            switch ((((i3 >>> 1) % 2) * 5) + 6) {
            case 9:
                i11 -= i11;
                iArr2[(i3 >>> 1) % N] += i11;
                for (i12 = 1; i12 < 4; i12++) {
                    i13 += (-250 + (i12 * i12));
                    i14 = 1;
                    do {
                        i11 = i13;
                    } while ((i14 += 2) < 2);
                    for (i15 = 1; i15 < 2; ++i15) {
                        Test.instanceCount = i15;
                        i16 = i16;
                        i11 += i15;
                    }
                }
            case 10:
                b = b;
                break;
            }
        }
        vMeth1_check_sum += l2 + i3 + Double.doubleToLongBits(d2) + i12 + i13 + i14 + i15 + i16 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth(long l, float f, long l1) {

        int i1=-232, i2=-78, i17=11, i18=-24603, i19=167, i20=53940, iArr3[]=new int[N];
        boolean b1=true;

        FuzzerUtils.init(iArr3, 63191);

        for (i1 = 249; i1 > 11; --i1) {
            vMeth1(l, i2);
            i2 = (int)f;
            i2 = (int)l;
            f -= -46;
            try {
                i2 = (i1 / 25306);
                iArr3[i1 + 1] = (i2 % 158);
                i2 = (i1 / 253);
            } catch (ArithmeticException a_e) {}
            i2 = i1;
            i2 = (int)Test.instanceCount;
            for (i17 = 1; i17 < 7; i17++) {
                for (i19 = 1; i19 < 2; ++i19) {
                    i20 = i20;
                    i18 += (int)Test.instanceCount;
                    b1 = true;
                    b1 = false;
                    i20 <<= (int)Test.instanceCount;
                }
            }
        }
        vMeth_check_sum += l + Float.floatToIntBits(f) + l1 + i1 + i2 + i17 + i18 + i19 + i20 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr3);
    }

    public void mainTest(String[] strArr1) {

        double d=0.83587;
        int i=-73, i21=11318, i22=-9, i23=-14, i24=12, i25=-3728, i26=-12, i27=-12, i28=1, i29=0, i30=-175, iArr[]=new
            int[N];
        byte by=23;
        long lArr[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, 30);
        FuzzerUtils.init(lArr, 35967L);
        FuzzerUtils.init(fArr, -92.104F);

        d = 1;
        do {
            iArr[(int)(d - 1)] += i;
            lArr[(int)(d - 1)] += i;
            vMeth(-4L, Test.fFld, Test.instanceCount);
        } while (++d < 220);
        byArrFld1[(i >>> 1) % N] *= (byte)1.212F;
        fArr[(i >>> 1) % N] = Test.instanceCount;
        i21 = 1;
        do {
            for (i22 = 79; 4 < i22; --i22) {
                Test.dArrFld[i22][i21 + 1] -= i23;
                by += (byte)Test.instanceCount;
                Test.instanceCount &= i;
                try {
                    i = (i22 % iArr[i21]);
                    i23 = (iArr[(i22 >>> 1) % N] % 1526748805);
                    i23 = (i22 % iArr[i21]);
                } catch (ArithmeticException a_e) {}
                iArr[i22] <<= i22;
                iArr = iArr;
            }
            Test.instanceCount /= ((long)(Test.fFld) | 1);
        } while (++i21 < 318);
        Test.instanceCount *= i;
        i23 = i22;
        for (i24 = 377; 15 < i24; --i24) {
            if (Test.bFld) continue;
        }
        Test.fFld = i21;
        i23 = -9986;
        for (i26 = 18; i26 < 362; i26++) {
            for (i28 = 3; i28 < 73; i28++) {
                i29 += i28;
                Test.instanceCount = i25;
                i = iFld;
                switch (((i26 % 7) * 5) + 88) {
                case 102:
                    i -= (int)d;
                    Test.fFld -= i29;
                    i30 -= (int)-13L;
                case 101:
                case 116:
                    i23 = i21;
                case 105:
                    Test.dFld -= i29;
                    break;
                case 122:
                    iArr[i26 - 1] = i21;
                    break;
                case 107:
                    i27 = 235;
                case 108:
                }
            }
        }

        FuzzerUtils.out.println("d i i21 = " + Double.doubleToLongBits(d) + "," + i + "," + i21);
        FuzzerUtils.out.println("i22 i23 by = " + i22 + "," + i23 + "," + by);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 iArr lArr = " + i30 + "," + FuzzerUtils.checkSum(iArr) + "," +
            FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.bFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("iFld Test.dFld Test.byArrFld = " + iFld + "," + Double.doubleToLongBits(Test.dFld) +
            "," + FuzzerUtils.checkSum(Test.byArrFld));
        FuzzerUtils.out.println("byArrFld1 Test.dArrFld = " + FuzzerUtils.checkSum(byArrFld1) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
