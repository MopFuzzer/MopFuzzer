// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:04 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=21L;
    public static byte byFld=-119;
    public static boolean bFld=false;
    public static short sFld=-11826;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 30901);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i3, long l1) {

        int i4=-53999, i5=0, i6=-61078, i7=36487, i8=-7, i9=-224;
        short s=18632;
        float f2=2.692F;

        i3 = i3;
        i3 -= Test.byFld;
        Test.instanceCount += i3;
        for (i4 = 4; 150 > i4; i4 += 2) {
            l1 = s;
            if (Test.bFld) {
                for (i6 = 1; i6 < 21; i6++) {
                    f2 = i5;
                    i3 >>= i7;
                    for (i8 = 1; i8 < 2; i8 += 3) {
                        i9 += i8;
                    }
                    i7 -= (int)f2;
                }
                Test.instanceCount -= (long)f2;
                l1 -= -14;
            } else {
                Test.instanceCount |= l1;
            }
        }
        vMeth1_check_sum += i3 + l1 + i4 + i5 + s + i6 + i7 + Float.floatToIntBits(f2) + i8 + i9;
    }

    public static void vMeth(int i1, int i2, float f1) {

        double d=-36.28076;
        long l2=-3686496023L;
        int i10=11, i11=-12344, i12=-230, i13=214, i14=-93, i15=12, i16=-19755, i17=-52243;

        d -= -10;
        vMeth1(i2, Test.instanceCount);
        l2 = 1;
        while (++l2 < 173) {
            i1 <<= i1;
            f1 += (((l2 * l2) + f1) - Test.instanceCount);
            for (i10 = 1; i10 < 9; ++i10) {
                Test.sFld += (short)i10;
            }
        }
        i2 = i2;
        Test.bFld = false;
        for (i12 = 3; i12 < 379; ++i12) {
            for (i14 = 4; i14 > 1; --i14) {
                i2 += i14;
                for (i16 = 2; 1 < i16; i16 -= 3) {
                    i11 += (i16 * i16);
                }
                i1 += 21450;
            }
        }
        vMeth_check_sum += i1 + i2 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) + l2 + i10 + i11 + i12 + i13
            + i14 + i15 + i16 + i17;
    }

    public static void vSmallMeth(int i, long l, float f) {


        vMeth(i, i, f);
        vSmallMeth_check_sum += i + l + Float.floatToIntBits(f);
    }

    public void mainTest(String[] strArr1) {

        int i18=13, i19=1345, i20=242, i21=-198, i22=-125, i23=-10, i24=44, i25=14, i26=-9;
        float f3=1.834F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, 13.160F);

        for (int smallinvoc=0; smallinvoc<228; smallinvoc++) vSmallMeth(i18, 8806616685021828978L, f3);
        for (i19 = 7; i19 < 168; ++i19) {
            i20 >>>= i18;
            fArr = fArr;
            for (i21 = 9; i21 < 156; i21++) {
                Test.iArrFld[i19] = i21;
                Test.instanceCount -= (long)f3;
                f3 += 12;
                i20 = 53886;
                i20 += i20;
                i22 >>= (int)Test.instanceCount;
                Test.instanceCount >>= Test.instanceCount;
            }
            for (i23 = 3; i23 < 156; i23++) {
                Test.byFld <<= (byte)i21;
                i22 += i23;
                i22 += (i23 | Test.instanceCount);
                f3 = 113;
                i18 += (i23 + i21);
                if (Test.bFld) {
                    Test.instanceCount = i20;
                    i24 >>= (int)-4291356629768897426L;
                    Test.iArrFld = Test.iArrFld;
                    if (Test.bFld) break;
                } else if (Test.bFld) {
                    i20 += (int)-2.327F;
                    Test.iArrFld[i23] = 14;
                    if (Test.bFld) {
                        for (i25 = 1; i25 < 2; i25++) {
                            i20 = Test.sFld;
                        }
                        Test.iArrFld[i23] >>>= i22;
                    } else if (Test.bFld) {
                        if (Test.bFld) break;
                    }
                } else {
                    Test.instanceCount -= Test.sFld;
                }
            }
        }

        FuzzerUtils.out.println("i18 f3 i19 = " + i18 + "," + Float.floatToIntBits(f3) + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 fArr = " + i26 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.bFld = " + Test.instanceCount + "," + Test.byFld +
            "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.sFld Test.iArrFld = " + Test.sFld + "," + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
