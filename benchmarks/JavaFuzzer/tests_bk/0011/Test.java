// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:53 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=860L;
    public double dFld=0.26631;
    public static volatile float fFld=-23.704F;
    public static volatile short sFld=-27690;
    public static byte byFld=106;
    public double dFld1=9.17736;
    public static float fArrFld[]=new float[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 122.741F);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth(float f, float f1, float f2) {

        int i2=246;

        i2 += (int)(-40.482F - Integer.reverseBytes(i2--));
        vMeth_check_sum += Float.floatToIntBits(f) + Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i2;
    }

    public static void vMeth1(long l1, long l2, long l3) {

        int i7=13, i8=-35601, i9=157, i10=5, i11=-21099, iArr[]=new int[N];
        float f4=33.965F;
        boolean b=false;
        double d=0.27892;
        long l4=-102L;

        FuzzerUtils.init(iArr, 67);

        i7 >>= -211;
        for (i8 = 4; i8 < 281; i8++) {
            f4 *= Test.instanceCount;
            l1 += Test.instanceCount;
            i7 = i8;
            f4 += (i8 * i7);
            if (b) continue;
            l3 += (-61 + (i8 * i8));
            if (b) break;
            i10 += (52568 + (i8 * i8));
        }
        if (b) {
            d = d;
            vMeth1_check_sum += l1 + l2 + l3 + i7 + i8 + i9 + Float.floatToIntBits(f4) + (b ? 1 : 0) + i10 +
                Double.doubleToLongBits(d) + l4 + i11 + FuzzerUtils.checkSum(iArr);
            return;
        } else if (b) {
            for (l4 = 12; 387 > l4; ++l4) {
                iArr = iArr;
                b = b;
            }
            vMeth1_check_sum += l1 + l2 + l3 + i7 + i8 + i9 + Float.floatToIntBits(f4) + (b ? 1 : 0) + i10 +
                Double.doubleToLongBits(d) + l4 + i11 + FuzzerUtils.checkSum(iArr);
            return;
        }
        vMeth1_check_sum += l1 + l2 + l3 + i7 + i8 + i9 + Float.floatToIntBits(f4) + (b ? 1 : 0) + i10 +
            Double.doubleToLongBits(d) + l4 + i11 + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth1(int i6) {

        int i12=-6, i13=-14, i14=56309, i15=0;

        i6 *= (i6++);
        vMeth1(-4L, Test.instanceCount, Test.instanceCount);
        for (i12 = 361; i12 > 1; i12 -= 3) {
            switch ((i12 % 2) + 24) {
            case 24:
                Test.fFld = i6;
                Test.instanceCount -= i13;
                Test.fArrFld[i12] *= i13;
                if (false) continue;
                break;
            case 25:
                Test.instanceCount <<= i6;
                i13 += i13;
                i6 /= (int)(i13 | 1);
                break;
            default:
                for (i14 = 1; 13 > i14; ++i14) {
                    Test.fFld -= i15;
                    Test.instanceCount = i13;
                    i13 *= 18632;
                }
            }
        }
        long meth_res = i6 + i12 + i13 + i14 + i15;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth() {

        int i1=59611, i3=199, i4=-9, i5=-44291, i16=2, i17=14990;
        float f3=-116.365F;
        long l=-6202L, lArr[]=new long[N];

        FuzzerUtils.init(lArr, -14L);

        i1 = 1;
        while (++i1 < 166) {
            vMeth(f3, f3--, 0.10F);
            for (i3 = 1; 10 > i3; ++i3) {
                i4 <<= (int)(i3 + ((i1 + 4) * (i4 + f3)));
                i5 = 1;
                while (++i5 < 2) {
                    byte by=-110;
                    if (Math.min(--i4, (int)(i4 = (int)(Test.instanceCount * l))) != (l * ((62 * (f3 / 14489L)) * (5 *
                        (Test.instanceCount - i4))))) break;
                    dFld += (by + ((i4++) * (i4 -= i1)));
                    iMeth1(i4);
                    f3 += i5;
                    iArrFld[i3 + 1] *= 54262;
                    i4 *= (int)-83L;
                }
                for (i16 = 1; 2 > i16; i16++) {
                    i17 += i3;
                    lArr[i16] += -18293;
                    Test.sFld >>= (short)i17;
                }
            }
        }
        long meth_res = i1 + Float.floatToIntBits(f3) + i3 + i4 + i5 + l + i16 + i17 + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=27322, i18=-11, i19=-162, i20=10, i21=121, i22=-3, i23=-88, i24=-14, i25=9, i26=-46911;
        float f5=2.656F;
        boolean b1=true;

        dFld -= (i |= iMeth());
        for (f5 = 3; f5 < 237; ++f5) {
            i19 = 107;
            do {
                i <<= i19;
                i18 += (i19 * i19);
                i += i19;
                Test.instanceCount = Test.instanceCount;
                Test.byFld += (byte)Test.instanceCount;
            } while (--i19 > 0);
            Test.instanceCount = i19;
            Test.instanceCount = Test.instanceCount;
            Test.fArrFld[(int)(f5)] -= i18;
            for (i20 = 4; i20 < 107; i20++) {
                Test.fArrFld[(int)(f5 - 1)] *= Test.byFld;
            }
            if (true) break;
            i = (int)dFld1;
        }
        i22 = 1;
        do {
            Test.instanceCount = i21;
            i23 = 1;
            while (++i23 < 64) {
                i18 = (int)dFld1;
            }
            i18 *= i20;
            i24 = 1;
            while (++i24 < 64) {
                Test.instanceCount += (i24 - Test.instanceCount);
                Test.byFld >>>= (byte)Test.instanceCount;
                i18 &= i23;
                i = (int)-2859326688202452804L;
                for (i25 = 1; i25 > 1; i25 -= 3) {
                    i26 <<= Test.byFld;
                    if (b1) break;
                    dFld += Test.fFld;
                    Test.instanceCount <<= i19;
                }
            }
        } while (++i22 < 392);

        FuzzerUtils.out.println("i f5 i18 = " + i + "," + Float.floatToIntBits(f5) + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 b1 = " + i25 + "," + i26 + "," + (b1 ? 1 : 0));

        FuzzerUtils.out.println("Test.instanceCount dFld Test.fFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(dFld) + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.sFld Test.byFld dFld1 = " + Test.sFld + "," + Test.byFld + "," +
            Double.doubleToLongBits(dFld1));
        FuzzerUtils.out.println("Test.fArrFld iArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld))
            + "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}