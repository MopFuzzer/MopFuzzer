// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:05 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=247L;
    public static short sFld=-20960;
    public static double dFld=35.95268;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -165);
    }

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i7) {

        int i8=10, i9=87, i10=-13, i11=-163, i12=-3566, i13=49990;
        float f=-30.935F, f1=1.541F;

        for (i8 = 12; 295 > i8; ++i8) {
            i9 |= i7;
            f += -13L;
            if (i9 != 0) {
            }
            i7 += (i8 - i8);
            for (i10 = 1; 6 > i10; ++i10) {
                i11 = (int)-5357235555949980403L;
                if (true) continue;
                f1 -= (float)Test.dFld;
                for (i12 = 1; i12 < 2; i12++) {
                    i11 += (i12 | Test.instanceCount);
                    i7 += Test.sFld;
                    i7 += i7;
                    Test.iArrFld[i12] -= (int)Test.instanceCount;
                }
                i9 *= (int)-1.20742;
            }
        }
        long meth_res = i7 + i8 + i9 + Float.floatToIntBits(f) + i10 + i11 + Float.floatToIntBits(f1) + i12 + i13;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        int i6=108;

        Test.iArrFld[(i6 >>> 1) % N] &= iMeth1(i6);
        Test.sFld *= (short)i6;
        i6 = i6;
        long meth_res = i6;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(int i1, int i2, int i3) {

        int i4=9, i5=-49493, i14=11, i15=36139, i16=172;
        byte by=-74;
        float f2=-34.805F;
        boolean b1=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -147L);

        for (i4 = 1; i4 < 127; ++i4) {
            lArr[i4 - 1] >>= (i3--);
            Test.sFld &= (short)(((-201 - (i5 += i1)) - (++i5)) + (iMeth() - i4));
            i5 += (i4 * i4);
            i14 = 1;
            do {
                i1 = (int)Test.instanceCount;
                i1 *= i3;
                switch ((i14 % 10) + 2) {
                case 2:
                    by -= (byte)Test.instanceCount;
                    i1 = (int)Test.instanceCount;
                    for (i15 = 1; i15 < 1; ++i15) {
                        f2 *= (float)Test.dFld;
                        i3 -= -62899;
                        i2 >>= 242;
                        Test.instanceCount = i3;
                    }
                    break;
                case 3:
                    Test.instanceCount <<= i15;
                case 4:
                    Test.dFld = Test.dFld;
                    break;
                case 5:
                    Test.dFld = f2;
                    break;
                case 6:
                    f2 *= -29;
                case 7:
                    i2 += (i14 + i3);
                    break;
                case 8:
                    i5 = (int)5154095961406181698L;
                case 9:
                    i2 += i16;
                    break;
                case 10:
                case 11:
                    if (b1) continue;
                    break;
                }
            } while (++i14 < 12);
        }
        long meth_res = i1 + i2 + i3 + i4 + i5 + i14 + by + i15 + i16 + Float.floatToIntBits(f2) + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=189, i17=27729, i18=85, i19=26001, i20=-12197, i21=-40, i22=12, i23=10102, i24=-9, i25=-59, i26=11,
            i27=-70;
        boolean b=false;
        double d=0.102057, dArr[][]=new double[N][N];
        byte by1=29;
        long l=31014L, lArr1[]=new long[N];
        float f3=30.889F, fArr[]=new float[N];

        FuzzerUtils.init(lArr1, 6L);
        FuzzerUtils.init(dArr, 1.58560);
        FuzzerUtils.init(fArr, -2.643F);

        i >>= (++i);
        i -= (i++);
        i %= (int)(Test.instanceCount | 1);
        b = (((d + i) + (Test.instanceCount *= (long)d)) != Long.reverseBytes(lMeth(i, -29576, i)));
        Test.dFld += by1;
        for (i17 = 10; i17 < 308; ++i17) {
            for (i19 = 84; i19 > 5; i19 -= 3) {
                for (i21 = 1; i21 < 4; ++i21) {
                    Test.instanceCount = i19;
                    i = -141;
                    i20 = i21;
                    lArr1[i17 - 1] &= Test.instanceCount;
                    i = -21903;
                    i20 >>>= 10;
                }
            }
            for (i23 = i17; i23 < 84; ++i23) {
                Test.instanceCount -= i;
                i20 = i22;
                i22 += (-3 + (i23 * i23));
                Test.instanceCount += -131;
                lArr1[i17] >>= i23;
                dArr[i17 - 1][i23 - 1] += i18;
                for (i25 = 1; 1 > i25; ++i25) {
                    if (false) {
                        Test.instanceCount += (i25 | l);
                        fArr[i17] -= -162;
                        lArr1 = lArr1;
                        f3 += i23;
                    } else if (b) {
                        l *= i27;
                        lArr1[i17 - 1] += i26;
                        i24 -= i24;
                    } else {
                        f3 *= -62296;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i b d = " + i + "," + (b ? 1 : 0) + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("by1 i17 i18 = " + by1 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 l = " + i25 + "," + i26 + "," + l);
        FuzzerUtils.out.println("f3 i27 lArr1 = " + Float.floatToIntBits(f3) + "," + i27 + "," +
            FuzzerUtils.checkSum(lArr1));
        FuzzerUtils.out.println("dArr fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.dFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth1 ->  iMeth1 iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
