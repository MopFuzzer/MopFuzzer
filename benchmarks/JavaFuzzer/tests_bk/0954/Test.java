// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:17 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3840989012L;
    public static volatile float fFld=23.250F;
    public static short sFld=-3350;
    public static byte byFld=84;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -36898);
        FuzzerUtils.init(Test.lArrFld, -18031L);
    }

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static int iMeth(long l) {

        long l1=32L;
        int i1=147, i2=194, i3=1, i4=-26249, iArr[]=new int[N];
        byte by=-39;
        double d=-2.54779;
        short s=31380;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 0.180F);
        FuzzerUtils.init(iArr, 52);

        l1 = 1;
        do {
            fArr[(int)(l1)] *= (--Test.instanceCount);
        } while (++l1 < 123);
        i1 ^= (int)(l1 + ((i1 * i1) * i1));
        for (i2 = 4; i2 < 232; i2++) {
            i4 = 1;
            do {
                Test.fFld *= (i3 / (((i3 / 20) | (101 * i3)) | 1));
                Test.instanceCount += (i4 - i3);
                Test.instanceCount += (i4 * i3);
                i3 = i1;
                i3 += (i4 + i2);
                Test.instanceCount = (long)((by = (byte)(Test.fFld = l)) + ((i1 * i4) * 14232));
                i3 = (int)((-1.206F + (d - i2)) * (-s));
                Test.fFld -= (float)(14 - (d *= (i1 <<= i4)));
                iArr[i4] += i1;
            } while (++i4 < 7);
            i1 = iArr[i2 + 1];
        }
        long meth_res = l + l1 + i1 + i2 + i3 + i4 + by + Double.doubleToLongBits(d) + s +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static double dMeth(int i10, long l2) {


        Test.instanceCount *= i10;
        long meth_res = i10 + l2;
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static int iMeth1(int i5) {

        int i7=-54990, i8=26994, i9=-35, i11=120, i12=125, iArr1[]=new int[N];
        float f=2.285F;
        double d1=2.84463;

        FuzzerUtils.init(iArr1, 0);

        i5 = (int)(--Test.instanceCount);
        for (int i6 : iArr1) {
            for (i7 = 1; i7 < 4; i7++) {
                for (f = 1; f < 2; f++) {
                    Test.instanceCount *= (long)(((i8 + i7) + (Test.instanceCount + i5)) - (dMeth(-3,
                        Test.instanceCount) + -12544));
                    Test.sFld -= (short)Test.fFld;
                    Test.instanceCount = 1178147927L;
                    Test.instanceCount += (long)f;
                    Test.instanceCount -= (long)d1;
                    i6 *= i6;
                }
                iArr1 = iArr1;
                for (i11 = 1; i11 < 2; i11++) {
                    Test.fFld += (-8989 + (i11 * i11));
                    i8 += (int)Test.instanceCount;
                    i6 += (i11 ^ i8);
                }
            }
        }
        long meth_res = i5 + i7 + i8 + Float.floatToIntBits(f) + i9 + Double.doubleToLongBits(d1) + i11 + i12 +
            FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i) {

        int i13=-52272, i14=20, i15=33100;
        byte by1=66;
        boolean b=true;
        double d2=-2.82244;

        i = Math.min(iMeth(Math.min(Test.instanceCount, Test.instanceCount)), iMeth1(i));
        i13 = 1;
        do {
            if (b) {
                i *= i;
                Test.instanceCount |= Test.instanceCount;
                i += i13;
                Test.instanceCount = by1;
            } else if (b) {
                for (i14 = 1; i14 < 7; i14++) {
                    Test.iArrFld[i14] = i14;
                    i15 &= (int)324125462L;
                    by1 = (byte)-1;
                    if (b) {
                        Test.instanceCount += 224;
                        Test.fFld -= Test.instanceCount;
                        Test.fFld += i;
                    } else if (b) {
                        Test.iArrFld[i13 + 1] %= (int)(by1 | 1);
                    }
                }
            } else {
                d2 = -142;
            }
        } while (++i13 < 220);
        long meth_res = i + i13 + by1 + i14 + i15 + (b ? 1 : 0) + Double.doubleToLongBits(d2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i16=1008, i17=199, i18=-13348, i19=15738, i20=-14, i21=-26935, i22=-32131, i23=91, i24=-39, i25=116,
            i26=-7340, iArr2[][]=new int[N][N];
        boolean b1=false;
        double d3=0.6471;

        FuzzerUtils.init(iArr2, -206);

        lMeth(i16);
        i17 = 1;
        do {
            i16 = (int)47623L;
            Test.fFld /= 112.16F;
            i18 = 1;
            while (++i18 < 75) {
                i16 *= i17;
                Test.byFld = (byte)i18;
            }
            i16 = (int)Test.instanceCount;
            Test.lArrFld[i17 - 1] = i18;
            Test.iArrFld[i17 - 1] = i16;
            i16 = i18;
            for (i19 = 4; i19 < 75; i19++) {
                b1 = b1;
                i16 += (-62050 + (i19 * i19));
                Test.instanceCount += (i19 * Test.instanceCount);
                for (i21 = 1; i21 < 2; ++i21) {
                    d3 -= Test.instanceCount;
                    i22 <<= Test.sFld;
                }
                i16 += (int)6.1F;
                Test.iArrFld[i19 + 1] = i17;
                Test.lArrFld[i17 - 1] = Test.instanceCount;
                try {
                    i20 = (12 % i20);
                    i16 = (37169 % i21);
                    i20 = (i18 / 42910);
                } catch (ArithmeticException a_e) {}
            }
            if (true) {
                for (i23 = 4; i23 < 75; i23++) {
                    i24 = 83;
                    i20 -= (int)d3;
                    iArr2[i17 + 1][i23 - 1] >>>= -108;
                }
            } else {
                for (i25 = 1; 75 > i25; i25++) {
                    if (b1) break;
                    iArr2[i17 + 1][i25] -= i16;
                }
            }
        } while (++i17 < 337);

        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 b1 = " + i19 + "," + i20 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("i21 i22 d3 = " + i21 + "," + i22 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 iArr2 = " + i26 + "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.sFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.sFld);
        FuzzerUtils.out.println("Test.byFld Test.iArrFld Test.lArrFld = " + Test.byFld + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 lMeth mainTest
//DEBUG  dMeth ->  dMeth iMeth1 lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
