// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:16 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=886068818L;
    public static float fFld=3.1002F;
    public byte byFld=-123;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 4407);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(double d, double d1) {

        int i10=-5, i11=195, i12=-13, i13=-64365, i14=57670, i15=-52072, i16=-36506;
        float f2=1.991F;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)12566);

        i10 += i10;
        sArr[(i10 >>> 1) % N] >>= (short)Test.instanceCount;
        i10 >>>= i10;
        i11 = 1;
        do {
            i12 = 1;
            while (++i12 < 5) {
                try {
                    i10 = (15664 / Test.iArrFld[i11 + 1]);
                    i10 = (i10 % -857376297);
                    Test.iArrFld[i12 - 1] = (i10 % i11);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount -= i11;
                for (i13 = 1; i13 < 1; ++i13) {
                    f2 += (((i13 * i10) + Test.instanceCount) - Test.instanceCount);
                    Test.iArrFld[i12 + 1] = -1;
                    f2 = i14;
                    i10 = i12;
                    i15 = 111;
                    i10 += i16;
                    i14 -= i14;
                }
            }
        } while (++i11 < 366);
        long meth_res = Double.doubleToLongBits(d) + Double.doubleToLongBits(d1) + i10 + i11 + i12 + i13 + i14 +
            Float.floatToIntBits(f2) + i15 + i16 + FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i3) {

        int i4=55975, i5=-22, i6=15637, i7=-44613, i8=-112, i9=1;
        float f=-78.168F, f1=-114.294F;
        byte by=114;
        long l1=-3L;
        short s=6240;
        double d2=68.48802;

        for (i4 = 14; 356 > i4; i4++) {
            i5 += (i4 + f);
            i5 -= (int)((--by) - f);
            for (f1 = 1; f1 < 5; f1++) {
                for (l1 = 1; l1 < 2; ++l1) {
                    i5 <<= (int)((i6++) - ((++Test.instanceCount) - (s - i4)));
                }
                for (i8 = 1; i8 < 2; ++i8) {
                    iMeth(d2, d2);
                    i6 -= (int)d2;
                    Test.iArrFld = Test.iArrFld;
                    Test.instanceCount ^= s;
                }
                d2 -= f1;
                s = (short)-41.2655;
                i9 += (int)f1;
                i5 = (int)3896080798L;
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + Float.floatToIntBits(f) + by + Float.floatToIntBits(f1) + i6 + l1 + i7 + s +
            i8 + i9 + Double.doubleToLongBits(d2);
    }

    public static void vMeth(int i2, long l) {

        double d3=2.26164, d4=-24.57323, dArr[]=new double[N];
        int i17=191, i19=-226, i20=18, i21=8, i22=194;
        long l2=-4L;

        FuzzerUtils.init(dArr, 66.49446);

        i2 %= (int)101.96114;
        vMeth1(i2);
        for (d3 = 306; d3 > 12; d3--) {
            d4 -= l2;
            for (i19 = 1; i19 < 6; i19 += 3) {
                i2 = 27688;
                i17 += i20;
                for (i21 = i19; i21 < 6; i21++) {
                    float f3=-3.184F;
                    dArr[i21 + 1] = i2;
                    i20 += (i21 ^ i20);
                    i2 = (int)l2;
                    i17 >>>= i2;
                    i20 %= (int)(l | 1);
                    if (false) break;
                    i17 = (int)f3;
                }
            }
        }
        vMeth_check_sum += i2 + l + Double.doubleToLongBits(d3) + i17 + Double.doubleToLongBits(d4) + l2 + i19 + i20 +
            i21 + i22 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i=55368, i1=-3, i23=-44153, i24=-26, i25=26993, i26=15857, i27=-3, i28=5, i29=-58331, i30=-62, i31=-168;
        double d5=118.114264;
        short sArr1[]=new short[N];
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(sArr1, (short)550);
        FuzzerUtils.init(fArr, 2.135F);

        for (i = 14; i < 296; i++) {
            vMeth(i1, Test.instanceCount);
        }
        i1 *= i1;
        i1 >>= i1;
        Test.fFld -= Test.instanceCount;
        for (i23 = 2; i23 < 121; i23++) {
            Test.instanceCount += i24;
            for (i25 = 12; i25 < 211; i25 += 2) {
                i26 -= i24;
                for (i27 = 3; i27 > 1; i27--) {
                    try {
                        Test.iArrFld[i25] = (i26 / i24);
                        i1 = (Test.iArrFld[i23] % 229);
                        Test.iArrFld[i27 + 1] = (i1 / i29);
                    } catch (ArithmeticException a_e) {}
                    i1 += (i27 ^ i29);
                    Test.instanceCount += (i27 * i23);
                }
                Test.instanceCount += Test.instanceCount;
                for (i30 = 1; i30 < 3; ++i30) {
                    i28 = -228;
                }
                Test.instanceCount >>>= i29;
                d5 = byFld;
                i1 += (i25 ^ Test.instanceCount);
                sArr1[i25] ^= (short)Test.instanceCount;
            }
            switch (((i1 >>> 1) % 7) + 40) {
            case 40:
                Test.iArrFld[i23] += i;
                i24 += (i23 * i23);
                i1 += (int)(-17L + (i23 * i23));
                i31 = i29;
                break;
            case 41:
            case 42:
                fArr = fArr;
            case 43:
                i28 -= (int)Test.instanceCount;
                break;
            case 44:
                Test.instanceCount = 7;
                Test.instanceCount = i28;
                d5 %= (Test.instanceCount | 1);
                break;
            case 45:
                byFld = (byte)2.78104;
                break;
            case 46:
                fArr[(i1 >>> 1) % N][i23] = Test.instanceCount;
                break;
            default:
                Test.fFld += (-7389399319003303841L + (i23 * i23));
            }
        }

        FuzzerUtils.out.println("i i1 i23 = " + i + "," + i1 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 i31 d5 = " + i30 + "," + i31 + "," + Double.doubleToLongBits(d5));
        FuzzerUtils.out.println("sArr1 fArr = " + FuzzerUtils.checkSum(sArr1) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld byFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + byFld);
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}