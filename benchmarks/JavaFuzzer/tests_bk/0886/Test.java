// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:15 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=37054L;
    public static volatile short sFld=19938;
    public static float fFld=2.409F;
    public byte byFld=116;
    public static long lFld=5701671598223858998L;
    public double dFld=2.63791;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 8742814060952290804L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i4=17132, i5=-49769, i6=-49123, i7=-11508, i8=16, i9=40, iArr[]=new int[N];
        boolean b1=true;
        double d=-2.26247;
        byte byArr[][]=new byte[N][N];

        FuzzerUtils.init(byArr, (byte)-61);
        FuzzerUtils.init(iArr, 144);

        for (i4 = 13; 209 > i4; i4++) {
            byArr = byArr;
            switch ((((-41298 >>> 1) % 6) * 5) + 21) {
            case 49:
                Test.instanceCount += Test.instanceCount;
                i5 = -109;
                for (i6 = 1; i6 < 8; i6 += 2) {
                    iArr = FuzzerUtils.int1array(N, (int)6);
                    for (i8 = i6; i8 < 3; ++i8) {
                        try {
                            i7 = (i5 % i6);
                            i7 = (i7 % iArr[i8 - 1]);
                            i9 = (82 / i7);
                        } catch (ArithmeticException a_e) {}
                        i7 = i9;
                        i7 += i8;
                    }
                    i7 -= i4;
                }
                i9 *= (int)Test.instanceCount;
                break;
            case 45:
                try {
                    i7 = (-5283 % i8);
                    i9 = (-59452219 % i5);
                    i5 = (i6 / -1846566247);
                } catch (ArithmeticException a_e) {}
                break;
            case 30:
                iArr[i4] = (int)Test.instanceCount;
            case 24:
                if (b1) continue;
                break;
            case 43:
                Test.sFld = (short)d;
                break;
            case 42:
                d = i8;
                break;
            default:
                i5 -= i6;
            }
        }
        long meth_res = i4 + i5 + i6 + i7 + i8 + i9 + (b1 ? 1 : 0) + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(boolean b) {

        float f1=0.680F;
        int i3=14, i10=-34326, i11=57, i12=215, i13=158, i14=-2741, i15=-236;
        double d1=1.102257;
        byte by=43;

        f1 = Math.max(--i3, (i3 - i3) + iMeth());
        for (i10 = 10; i10 < 298; ++i10) {
            for (i12 = i10; i12 < 6; ++i12) {
                i13 += i11;
                if (b) {
                    i3 += (i12 - Test.instanceCount);
                    i13 += i13;
                }
                b = false;
            }
            Test.instanceCount *= i13;
            if (i11 != 0) {
                vMeth1_check_sum += (b ? 1 : 0) + Float.floatToIntBits(f1) + i3 + i10 + i11 + i12 + i13 +
                    Double.doubleToLongBits(d1) + i14 + i15 + by;
                return;
            }
            for (d1 = 1; d1 < 6; ++d1) {
                i13 += i3;
                i14 -= Test.sFld;
                i3 -= i3;
                Test.instanceCount += (long)(((d1 * i15) + by) - i10);
            }
        }
        vMeth1_check_sum += (b ? 1 : 0) + Float.floatToIntBits(f1) + i3 + i10 + i11 + i12 + i13 +
            Double.doubleToLongBits(d1) + i14 + i15 + by;
    }

    public static void vMeth(int i, float f, int i1) {

        int i2=0, i17=12, i18=-6, iArr1[]=new int[N];
        boolean b2=true, bArr[]=new boolean[N];
        double d2=0.35801;

        FuzzerUtils.init(iArr1, 44737);
        FuzzerUtils.init(bArr, false);

        i2 = 1;
        while (++i2 < 361) {
            i1 >>>= Integer.reverseBytes((int)(-(f - -14)));
            vMeth1(b2);
        }
        Test.lArrFld[(i1 >>> 1) % N] += (long)117.108235;
        i -= i2;
        Test.lArrFld[(i >>> 1) % N] = (long)d2;
        for (int i16 : iArr1) {
            Test.instanceCount -= i16;
            for (i17 = 1; i17 < 4; i17 += 2) {
                iArr1[(i2 >>> 1) % N] = (int)Test.instanceCount;
                i16 += (i17 ^ i);
                Test.instanceCount -= Test.instanceCount;
                if (false) {
                    d2 *= i1;
                } else if (b2) {
                    bArr[i17 + 1] = b2;
                }
            }
        }
        vMeth_check_sum += i + Float.floatToIntBits(f) + i1 + i2 + (b2 ? 1 : 0) + Double.doubleToLongBits(d2) + i17 +
            i18 + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {

        int i19=2, i20=71, i21=-92, i22=-3, i23=-24445, i24=20163, i25=-69, i26=30586, iArr2[]=new int[N];
        boolean b3=true;
        double d3=18.17073, d4=2.108147;

        FuzzerUtils.init(iArr2, 2);

        vMeth(i19, Test.fFld, i19);
        Test.instanceCount += Test.instanceCount;
        i20 = 329;
        while (--i20 > 0) {
            i19 += i20;
            byFld >>= (byte)i20;
            if (b3) continue;
            i19 = (int)Test.fFld;
            i19 *= i19;
            i19 = i19;
        }
        Test.instanceCount = i19;
        Test.instanceCount = -121;
        for (d3 = 3; d3 < 123; d3++) {
            for (d4 = 13; d4 < 209; d4++) {
                boolean b4=false;
                i19 = (int)Test.instanceCount;
                i19 >>>= 218;
                if (b4) {
                    iArr2[(int)(d3)] -= i22;
                    Test.lFld = 4253903789L;
                    for (i23 = 2; i23 > 1; i23--) {
                        b3 = false;
                        Test.lFld += i23;
                        i24 = (int)d3;
                        Test.fFld += i24;
                        i19 |= i21;
                    }
                    i19 += i20;
                } else if (b4) {
                    i19 = i23;
                    switch ((((i21 >>> 1) % 2) * 5) + 17) {
                    case 21:
                        for (i25 = 2; 1 < i25; --i25) {
                            dFld = i26;
                            Test.instanceCount += i25;
                        }
                    case 20:
                        Test.instanceCount -= (long)-1.74737;
                        break;
                    default:
                        dFld = Test.fFld;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i19 i20 b3 = " + i19 + "," + i20 + "," + (b3 ? 1 : 0));
        FuzzerUtils.out.println("d3 i21 d4 = " + Double.doubleToLongBits(d3) + "," + i21 + "," +
            Double.doubleToLongBits(d4));
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 iArr2 = " + i25 + "," + i26 + "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.fFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("byFld Test.lFld dFld = " + byFld + "," + Test.lFld + "," +
            Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

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
