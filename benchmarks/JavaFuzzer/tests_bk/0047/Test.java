// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3075772087L;
    public static boolean bFld=false;
    public static volatile float fFld=0.907F;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 1400833103L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i5=-36605, i6=18, i7=6253, i8=1560, i9=40727, i10=214, i11=132, i12=-190, i13=-33405, iArr[]=new int[N];
        double d1=-48.61039;

        FuzzerUtils.init(iArr, 4);

        for (i5 = 17; i5 < 325; i5 += 3) {
            Test.bFld = Test.bFld;
        }
        for (i7 = 2; i7 < 356; i7++) {
            iArr[i7 + 1] ^= 13;
            Test.fFld /= (i8 | 1);
            if (true) {
                for (i9 = 1; i9 < 5; ++i9) {
                    i10 += -55;
                    for (i11 = i9; i11 < 2; ++i11) {
                        i8 += i11;
                        i6 = i8;
                        i10 += (int)Test.instanceCount;
                        Test.fFld += i11;
                        try {
                            i12 = (iArr[i7] % i13);
                            i13 = (iArr[i7 - 1] / iArr[i9 - 1]);
                            i10 = (-40 / i6);
                        } catch (ArithmeticException a_e) {}
                        Test.instanceCount *= i5;
                    }
                }
                vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d1) +
                    FuzzerUtils.checkSum(iArr);
                return;
            } else {
                Test.lArrFld[i7 + 1] = (long)d1;
            }
        }
        vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {

        int i4=-164, i14=14;
        double d=-39.87020;
        long l=156L;

        i4 *= ((i4--) - Math.min(i4, (int)(d - i4)));
        vMeth1();
        for (l = 18; l < 337; ++l) {
            i14 *= (int)Test.instanceCount;
        }
        i4 <<= i14;
        Test.fFld = Test.instanceCount;
        Test.instanceCount = Test.instanceCount;
        vMeth_check_sum += i4 + Double.doubleToLongBits(d) + l + i14;
    }

    public static int iMeth(int i1, int i2, int i3) {

        int i15=251, i16=-199, i17=59996, i18=-64224, i19=-10, iArr1[]=new int[N];
        double d2=-114.5703;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr1, 51);
        FuzzerUtils.init(byArr, (byte)59);

        if (Test.bFld) {
            vMeth();
            for (i15 = 19; i15 < 380; i15++) {
                i2 = (int)Test.instanceCount;
                for (i17 = i15; i17 < 5; ++i17) {
                    Test.instanceCount += i15;
                    Test.instanceCount += (i17 | Test.instanceCount);
                    for (d2 = 1; d2 < 1; d2++) {
                        i3 += (int)Test.instanceCount;
                        iArr1[i17] -= 20643;
                    }
                    iArr1 = iArr1;
                    if (false) continue;
                    i19 = i2;
                    if (Test.bFld) break;
                    i3 = (int)Test.instanceCount;
                }
            }
        } else if (Test.bFld) {
            i19 -= i18;
        } else if (Test.bFld) {
            byArr[(i17 >>> 1) % N] -= (byte)i1;
        } else {
            i1 = (int)Test.instanceCount;
        }
        long meth_res = i1 + i2 + i3 + i15 + i16 + i17 + i18 + Double.doubleToLongBits(d2) + i19 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(byArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=50760, i20=56468, i21=32462, i22=0, i23=-95, i24=3759, i25=-10, i26=-1, i27=-193, i28=-158, i29=6961,
            iArr2[]=new int[N];
        float f=75.412F;
        byte by=124;

        FuzzerUtils.init(iArr2, 42391);

        Test.instanceCount <<= i;
        Test.instanceCount *= ((iMeth(-12, i, 13145) + -33883) + -93);
        for (f = 5; f < 155; ++f) {
            Test.instanceCount += (long)((long)f ^ i);
            if (Test.bFld) break;
            iArr2[(int)(f - 1)] *= by;
            for (i21 = 5; 167 > i21; ++i21) {
                for (i23 = 2; i23 > 1; i23--) {
                    i += (i23 ^ Test.instanceCount);
                    i20 -= i22;
                    Test.fFld += i22;
                    i24 += i23;
                    if (Test.bFld) break;
                    if (Test.bFld) continue;
                    Test.fFld -= 18612;
                    i20 -= i21;
                }
                for (i25 = 1; i25 < 2; ++i25) {
                    i24 %= (int)(Test.instanceCount | 1);
                    Test.fFld += (((i25 * by) + i25) - Test.instanceCount);
                }
                for (i27 = 1; i27 < 2; ++i27) {
                    i24 += i24;
                    iArr2[i21] *= (int)Test.instanceCount;
                    i24 *= i28;
                    iArr2[i27 + 1] <<= i;
                    i26 = i29;
                    i28 <<= i22;
                    i <<= (int)Test.instanceCount;
                    Test.instanceCount = i26;
                }
                i -= i;
            }
            Test.fFld += ((long)f ^ (long)Test.instanceCount);
        }

        FuzzerUtils.out.println("i f i20 = " + i + "," + Float.floatToIntBits(f) + "," + i20);
        FuzzerUtils.out.println("by i21 i22 = " + by + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 iArr2 = " + i29 + "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.fFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}