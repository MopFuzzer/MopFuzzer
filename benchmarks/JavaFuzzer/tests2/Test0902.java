// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:54 2023
public class Test0902 {

    public static final int N = 400;

    public static long instanceCount=-8281136810090081733L;
    public static int iFld=-58591;
    public static byte byFld=40;
    public int iFld1=-13885;
    public double dFld=78.41119;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0902.iArrFld, -58);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l1) {

        int i=222;
        int i1=8;
        int i2=-65420;
        int i3=21;
        int i4=67;
        int i5=192;
        int i6=1;
        int i7=-191;
        int[] iArr =new int[N];
        short s=-17841;
        float f1=16.149F;
        double d=0.24803;
        long l2=33L;

        FuzzerUtils.init(iArr, 3389);

        for (i = 4; i < 358; ++i) {
            for (i2 = 1; i2 < 5; ++i2) {
                iArr[i2 + 1] = i2;
                s += (short)(((i2 * i) + l1) - l1);
                iArr[i + 1] <<= i3;
                i1 += (i2 - f1);
                i3 <<= i3;
                iArr[i2 - 1] = Test0902.iFld;
                Test0902.byFld = (byte) -254;
            }
            for (i4 = 1; i4 < 5; ++i4) {
                for (i6 = 2; 1 < i6; --i6) {
                    l1 -= (long)d;
                    Test0902.byFld >>>= (byte) 9;
                }
            }
            l2 = -8;
            i3 += (((i * i5) + i5) - i1);
        }
        vMeth2_check_sum += l1 + i + i1 + i2 + i3 + s + Float.floatToIntBits(f1) + i4 + i5 + i6 + i7 +
            Double.doubleToLongBits(d) + l2 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1() {

        double d1=117.92381;
        int i8=58210;
        int i9=5593;
        int i10=-15;
        int i11=-2;
        int i12=6;
        int i13=-31007;
        int[] iArr1 =new int[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(iArr1, -2299);
        FuzzerUtils.init(lArr, 3L);

        vMeth2(Test0902.instanceCount);
        Test0902.instanceCount -= (long) d1;
        for (i8 = 10; i8 < 214; i8++) {
            short s1=15196;
            for (i10 = 8; i8 < i10; i10 -= 3) {
                Test0902.iFld *= i9;
                i9 = i9;
                iArr1[i8] += (int) Test0902.instanceCount;
            }
            i9 = i11;
            i9 += (i8 ^ Test0902.instanceCount);
            switch ((i8 % 4) + 69) {
            case 69:
                iArr1 = iArr1;
                for (i12 = 8; i12 > 1; i12 -= 3) {
                    if (i12 != 0) {
                        vMeth1_check_sum += Double.doubleToLongBits(d1) + i8 + i9 + i10 + i11 + i12 + i13 +
                            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
                        return;
                    }
                }
            case 70:
                i11 = (int) Test0902.instanceCount;
                Test0902.instanceCount -= -11;
                break;
            case 71:
                i11 += i8;
            case 72:
                lArr[i8 + 1] *= i8;
                break;
            default:
                i11 = s1;
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d1) + i8 + i9 + i10 + i11 + i12 + i13 + FuzzerUtils.checkSum(iArr1)
            + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(long l, float f) {

        int i14=-10, i15=-8, i16=2, i17=12, i18=-102, i19=10;
        short s2=-15055;
        double d2=-2.29345;

        vMeth1();
        for (i14 = 13; i14 < 234; i14++) {
            if (true) {
                i15 = (int)l;
                Test0902.iFld += (((i14 * Test0902.iFld) + f) - f);
                Test0902.iArrFld = Test0902.iArrFld;
                for (i16 = 1; i16 < 7; ++i16) {
                    s2 -= (short)i16;
                    d2 = i16;
                    Test0902.iArrFld[i14 + 1] |= i14;
                    for (i18 = 1; i18 < 2; ++i18) {
                        if (true) continue;
                        i15 += (((i18 * Test0902.iFld) + i16) - i17);
                        Test0902.iArrFld[i18] += (int) l;
                        Test0902.iArrFld[i16 + 1] = Test0902.byFld;
                    }
                }
            } else {
                Test0902.iArrFld = Test0902.iArrFld;
            }
        }
        vMeth_check_sum += l + Float.floatToIntBits(f) + i14 + i15 + i16 + i17 + s2 + Double.doubleToLongBits(d2) + i18
            + i19;
    }

    public void mainTest(String[] strArr1) {

        float f2=0.43F;
        int i20=4710, i21=-251, i22=16027, i23=-6, i24=-39345, i25=0, i26=-3, i27=63521;
        boolean b=false, b1=true;
        short s3=-11530;

        vMeth(Test0902.instanceCount, f2);
        Test0902.iFld -= (int) -6L;
        Test0902.iFld >>= (int) Test0902.instanceCount;
        i20 = 1;
        while (++i20 < 198) {
            f2 += (i20 - Test0902.iFld);
            for (i21 = 1; i21 < 127; i21++) {
                switch ((i20 % 2) + 114) {
                case 114:
                    Test0902.iFld += (-1 + (i21 * i21));
                    Test0902.iArrFld[i21 + 1] = (int) 7153302489927232882L;
                    break;
                case 115:
                    Test0902.iArrFld[i20 + 1] = i21;
                    f2 -= -14;
                    break;
                }
                Test0902.instanceCount += (((i21 * i20) + Test0902.instanceCount) - iFld1);
                for (i23 = 1; i23 < 2; ++i23) {
                    b = true;
                    b1 = b;
                    Test0902.instanceCount = -35;
                    Test0902.instanceCount *= (long) dFld;
                    i24 >>= iFld1;
                }
                i25 = 1;
                do {
                    s3 -= (short) Test0902.iFld;
                } while (++i25 < 2);
                if (b) continue;
                if (false) {
                    Test0902.iArrFld[i21] += i22;
                    i22 = i25;
                    if (b) continue;
                    Test0902.iArrFld[i20 - 1] -= s3;
                } else if (b1) {
                    for (i26 = 2; i26 > 1; i26 -= 2) {
                        i27 += i26;
                    }
                    f2 = i26;
                    if (b1) continue;
                } else {
                    s3 -= (short) Test0902.instanceCount;
                }
            }
        }

        FuzzerUtils.out.println("f2 i20 i21 = " + Float.floatToIntBits(f2) + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("b b1 i25 = " + (b ? 1 : 0) + "," + (b1 ? 1 : 0) + "," + i25);
        FuzzerUtils.out.println("s3 i26 i27 = " + s3 + "," + i26 + "," + i27);

        FuzzerUtils.out.println("Test0902.instanceCount Test0902.iFld Test0902.byFld = " + Test0902.instanceCount + "," + Test0902.iFld +
                "," + Test0902.byFld);
        FuzzerUtils.out.println("iFld1 dFld Test0902.iArrFld = " + iFld1 + "," + Double.doubleToLongBits(dFld) + "," +
                FuzzerUtils.checkSum(Test0902.iArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0902 _instance = new Test0902();
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