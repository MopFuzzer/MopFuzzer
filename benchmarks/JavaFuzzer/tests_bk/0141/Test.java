// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:56 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3L;
    public static volatile int iFld=12;
    public static double dFld=73.54159;
    public static short sFld=-1441;
    public static byte byFld=111;
    public boolean bFld=false;
    public static float fFld=-64.885F;
    public static double dArrFld[]=new double[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 0.19190);
        FuzzerUtils.init(Test.lArrFld, 13L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        float f=-1.935F, f1=-2.239F;
        short s=-11764;
        int i4=16482, i5=-53, i6=-144, i7=13, i8=-74, i9=4, i10=60556, iArr[]=new int[N];

        FuzzerUtils.init(iArr, -211);

        f = Test.instanceCount;
        Test.iFld -= Test.iFld;
        Test.instanceCount = (long)Test.dFld;
        Test.iFld >>= s;
        Test.iFld = Test.iFld;
        for (i4 = 7; i4 < 370; ++i4) {
            for (i6 = i4; i6 < 5; i6++) {
                for (f1 = 1; f1 < 1; ++f1) {
                    Test.instanceCount = Test.instanceCount;
                    iArr[i6 + 1] &= i4;
                    iArr[i6 + 1] = (int)10.1009F;
                    Test.iFld >>= i6;
                }
                for (i9 = 1; i9 < 1; ++i9) {
                    f += i10;
                    Test.dArrFld = FuzzerUtils.double1array(N, (double)-92.40164);
                }
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + s + i4 + i5 + i6 + i7 + Float.floatToIntBits(f1) + i8 + i9 + i10
            + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(boolean b, long l1) {

        int i11=0, i12=10, i13=-167, i14=-1, i15=37345, i16=-14, i17=-165;
        float f2=-2.927F, f3=-54.801F;

        vMeth1();
        Test.iFld *= Test.iFld;
        for (i11 = 5; i11 < 275; i11++) {
            for (f2 = 1; f2 < 6; f2++) {
                Test.iFld += (int)f2;
                i12 += (int)(((f2 * f2) + l1) - i11);
                i14 -= (int)l1;
                Test.iFld += i11;
                Test.instanceCount |= Test.sFld;
            }
        }
        for (i15 = 2; i15 < 272; ++i15) {
            long l2=-1911781874117659952L;
            Test.iFld -= (int)l2;
            i17 = 6;
            while (--i17 > 0) {
                l1 -= i12;
                f3 -= 3405859338L;
                Test.dFld += i13;
            }
        }
        long meth_res = (b ? 1 : 0) + l1 + i11 + i12 + Float.floatToIntBits(f2) + i13 + i14 + i15 + i16 + i17 +
            Float.floatToIntBits(f3);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l) {

        int i2=3340, i3=13, i18=20, i19=185, iArr1[]=new int[N];
        boolean b1=true;
        float f4=24.85F, fArr[]=new float[N];

        FuzzerUtils.init(iArr1, 63);
        FuzzerUtils.init(fArr, -47.157F);

        for (i2 = 8; 334 > i2; ++i2) {
            i3 *= (int)(((++Test.instanceCount) + iMeth(b1, l)) - -4486126818947542142L);
            i18 = 1;
            while (++i18 < 5) {
                iArr1[i2 + 1] = i18;
                l >>= i2;
                i3 += (((i18 * Test.instanceCount) + i2) - i2);
            }
            Test.iFld = Test.byFld;
        }
        i19 = 1;
        do {
            i3 += (i19 * f4);
            fArr[i19 - 1] += 221;
        } while (++i19 < 246);
        for (float f5 : fArr) {
            Test.instanceCount += 18878;
            Test.instanceCount *= i18;
            if (i2 != 0) {
                vMeth_check_sum += l + i2 + i3 + (b1 ? 1 : 0) + i18 + i19 + Float.floatToIntBits(f4) +
                    FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                return;
            }
        }
        i3 -= i19;
        vMeth_check_sum += l + i2 + i3 + (b1 ? 1 : 0) + i18 + i19 + Float.floatToIntBits(f4) +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i=42036, i1=-125, i20=-152, i21=-40081, i22=-171, i23=12, i24=-8, i25=6, i26=96, i27=22532, i28=-53,
            i29=23721, i30=-54, i31=14867, i32=99, i33=-11, iArr2[]=new int[N];
        double d=90.130319;

        FuzzerUtils.init(iArr2, -50985);

        for (i = 7; i < 149; i++) {
            vMeth(Test.instanceCount);
            Test.dFld += i1;
            for (i20 = 177; i20 > 2; i20--) {
                i1 *= Test.iFld;
            }
        }
        for (i22 = 12; i22 < 350; i22++) {
            if (bFld) break;
            iArr2[i22] *= (int)Test.dFld;
            Test.fFld = i1;
        }
        for (i24 = 309; i24 > 5; i24--) {
            i25 = (int)Test.instanceCount;
            d = 83;
            while ((d -= 2) > 0) {
                i1 += (int)(((d * i1) + i21) - i22);
                for (i26 = 2; i26 > i24; --i26) {
                    Test.lArrFld[(i1 >>> 1) % N] = Test.instanceCount;
                    i23 -= (int)2L;
                }
                i23 %= (int)(Test.iFld | 1);
                Test.instanceCount += (171 + (d * d));
            }
            for (i28 = 5; i28 < 83; ++i28) {
                i29 += i28;
                Test.instanceCount = i28;
            }
            for (i30 = 3; i30 < 83; ++i30) {
                for (i32 = 2; i32 > 1; i32--) {
                    i1 &= (int)Test.instanceCount;
                    try {
                        i25 = (507879615 / iArr2[i32 - 1]);
                        i27 = (i31 / i21);
                        i25 = (iArr2[i24 - 1] % 310152263);
                    } catch (ArithmeticException a_e) {}
                    i23 += i32;
                    i33 &= -8;
                    i33 *= i20;
                    Test.instanceCount += (((i32 * Test.instanceCount) + i22) - Test.fFld);
                    Test.instanceCount += i32;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i20 = " + i + "," + i1 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 d = " + i24 + "," + i25 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 i30 i31 = " + i29 + "," + i30 + "," + i31);
        FuzzerUtils.out.println("i32 i33 iArr2 = " + i32 + "," + i33 + "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.dFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.sFld Test.byFld bFld = " + Test.sFld + "," + Test.byFld + "," + (bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.fFld Test.dArrFld Test.lArrFld = " + Float.floatToIntBits(Test.fFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
