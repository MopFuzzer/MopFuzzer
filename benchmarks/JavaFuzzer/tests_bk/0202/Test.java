// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:58 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=10122L;
    public boolean bFld=false;
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 42.80413);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(long l1, int i10, long l2) {

        int i11=-12, i12=60194, i13=9705, iArr2[]=new int[N];
        double d=-2.62118;
        float f=10.228F;
        byte by=15;

        FuzzerUtils.init(iArr2, -10380);

        i10 <<= (int)Test.instanceCount;
        for (i11 = 9; 152 > i11; i11 += 3) {
            if (i11 != 0) {
                vMeth_check_sum += l1 + i10 + l2 + i11 + i12 + Double.doubleToLongBits(d) + i13 +
                    Float.floatToIntBits(f) + by + FuzzerUtils.checkSum(iArr2);
                return;
            }
            i10 >>= (int)Test.instanceCount;
            for (d = 1; d < 32; d++) {
                if (i13 != 0) {
                    vMeth_check_sum += l1 + i10 + l2 + i11 + i12 + Double.doubleToLongBits(d) + i13 +
                        Float.floatToIntBits(f) + by + FuzzerUtils.checkSum(iArr2);
                    return;
                }
                f += l1;
                i13 += (int)((long)d ^ i10);
                iArr2[i11] += i13;
                i10 -= (int)Test.instanceCount;
                iArr2[(i10 >>> 1) % N] = by;
                l1 <<= -54991L;
                i10 += (int)(((d * i13) + i12) - i12);
                i12 += (int)d;
                i13 += (int)((long)d ^ i10);
            }
        }
        vMeth_check_sum += l1 + i10 + l2 + i11 + i12 + Double.doubleToLongBits(d) + i13 + Float.floatToIntBits(f) + by
            + FuzzerUtils.checkSum(iArr2);
    }

    public static int iMeth1() {

        int i7=-8453, i8=65362, i9=-14, i14=-127, iArr3[]=new int[N];
        float f1=102.481F;
        double d1=-71.107016;

        FuzzerUtils.init(iArr3, -44617);

        for (i7 = 15; i7 < 335; i7 += 3) {
            i9 = 1;
            do {
                vMeth(Test.instanceCount, i8, Test.instanceCount);
                i8 -= i8;
                switch ((i7 % 8) + 26) {
                case 26:
                    iArr3[i7 + 1] = i7;
                    i8 += i7;
                    iArr3[i9 + 1] += i7;
                    break;
                case 27:
                    f1 += Test.instanceCount;
                    break;
                case 28:
                    i8 = i9;
                    d1 += i7;
                    i8 -= i7;
                    break;
                case 29:
                    i8 += (9 + (i9 * i9));
                    Test.instanceCount += (long)f1;
                    Test.instanceCount = Test.instanceCount;
                case 30:
                    Test.instanceCount += -23876;
                    break;
                case 31:
                    if (i9 != 0) {
                    }
                    break;
                case 32:
                    i8 += (int)d1;
                case 33:
                    i14 += i7;
                    break;
                default:
                    d1 = Test.instanceCount;
                }
            } while (++i9 < 15);
        }
        long meth_res = i7 + i8 + i9 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d1) + i14 +
            FuzzerUtils.checkSum(iArr3);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i, int i1, int i2) {

        int i3=-213, i4=45, i5=-8868, i6=30451, iArr1[][]=new int[N][N];
        long l=-2120335959L;
        byte by1=68;
        boolean b=false;
        short s=26640;
        float f2=0.34F, fArr[]=new float[N];

        FuzzerUtils.init(iArr1, 4);
        FuzzerUtils.init(fArr, -1.991F);

        for (i3 = 2; 152 > i3; i3++) {
            i2 = (int)((++Test.instanceCount) + (++iArr1[i3][i3 - 1]));
            for (i5 = i3; i5 < 11; i5++) {
                switch ((i5 % 6) + 14) {
                case 14:
                    l = 1;
                    do {
                        i4 += (int)l;
                        fArr[(int)(l)] *= ((++Test.instanceCount) + iMeth1());
                        i4 = by1;
                        Test.instanceCount += -85;
                        if (b) continue;
                        fArr[i5 - 1] = l;
                        i2 += (int)l;
                    } while ((l -= 3) > 0);
                    break;
                case 15:
                    iArr1[i3] = iArr1[i3 + 1];
                    Test.dArrFld = FuzzerUtils.double1array(N, (double)0.23134);
                    break;
                case 16:
                    i2 ^= s;
                    break;
                case 17:
                    i1 -= i;
                case 18:
                    i6 += (-54758 + (i5 * i5));
                    break;
                case 19:
                    f2 = i2;
                    break;
                default:
                    i4 += i6;
                }
            }
        }
        long meth_res = i + i1 + i2 + i3 + i4 + i5 + i6 + l + by1 + (b ? 1 : 0) + s + Float.floatToIntBits(f2) +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i15=17, i16=5, i17=12, i18=247, i19=42564, i20=-7432, i21=-249, iArr[]=new int[N];
        long l3=2405623944L, lArr[][]=new long[N][N];
        float f3=-1.589F;
        short s1=22926;
        byte by2=-13;
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr, 3);
        FuzzerUtils.init(dArr, -97.58178);
        FuzzerUtils.init(lArr, 9L);

        iArr[(13 >>> 1) % N] = (iArr[(55934 >>> 1) % N]++);
        dArr[(-181 >>> 1) % N] += ((iMeth(i15, i15, 3) + i15) - Test.instanceCount);
        for (l3 = 2; l3 < 287; ++l3) {
            lArr[(int)(l3 - 1)][(int)(l3 + 1)] *= Test.instanceCount;
            if (bFld) continue;
            for (i17 = 3; i17 < 88; i17++) {
                i19 = 1;
                while ((i19 += 2) < 2) {
                    double d2=48.69232;
                    f3 *= i15;
                    Test.instanceCount += (long)(0.64F + (i19 * i19));
                    i15 *= s1;
                    i15 = 15487;
                    d2 += -53;
                    switch ((int)((l3 % 1) + 120)) {
                    case 120:
                        Test.instanceCount += (i19 * i19);
                        i18 >>= (int)-3549195815L;
                        break;
                    default:
                        i16 += i19;
                        switch (((23 >>> 1) % 2) + 8) {
                        case 8:
                            Test.instanceCount -= i19;
                            Test.instanceCount += l3;
                            switch (((i16 >>> 1) % 1) + 39) {
                            case 39:
                                Test.instanceCount = i18;
                                f3 += (((i19 * f3) + i19) - i15);
                                break;
                            default:
                                i16 += (i19 - i16);
                            }
                        case 9:
                        default:
                            Test.instanceCount = l3;
                        }
                        Test.instanceCount *= by2;
                    }
                    i16 -= (int)f3;
                }
                for (i20 = 1; i20 < 2; i20++) {
                    i16 >>= 24213;
                    i16 >>= by2;
                    Test.instanceCount <<= 145;
                }
            }
        }

        FuzzerUtils.out.println("i15 l3 i16 = " + i15 + "," + l3 + "," + i16);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("f3 s1 by2 = " + Float.floatToIntBits(f3) + "," + s1 + "," + by2);
        FuzzerUtils.out.println("i20 i21 iArr = " + i20 + "," + i21 + "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("dArr lArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + "," +
            FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount bFld Test.dArrFld = " + Test.instanceCount + "," + (bFld ? 1 : 0) +
            "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}