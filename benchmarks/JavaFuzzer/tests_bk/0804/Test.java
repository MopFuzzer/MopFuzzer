// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:13 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=28444L;
    public static double dFld=-2.39612;
    public static int iFld=0;
    public volatile float fFld=53.684F;
    public static long lArrFld[]=new long[N];
    public static volatile int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.lArrFld, 3359530141L);
        FuzzerUtils.init(Test.iArrFld, 227);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i5=-10985, i6=-185, i7=39613, i8=-9, i9=-220, i10=233, i11=7;
        short s=7037;
        double d2=0.128048;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -117.168F);

        for (i5 = 6; 320 > i5; ++i5) {
            i6 += i6;
            i6 = i6;
        }
        i6 = (int)Test.instanceCount;
        for (i7 = 6; i7 < 122; i7++) {
            i6 += (i7 * i7);
            i9 = 13;
            do {
                Test.lArrFld[i7 - 1] = Test.instanceCount;
                s = (short)Test.instanceCount;
                i6 -= i7;
                for (i10 = 1; i10 < 3; ++i10) {
                    boolean b=false;
                    if (true) {
                        Test.instanceCount -= i7;
                        fArr[i10] -= Test.instanceCount;
                        i6 += (3623 + (i10 * i10));
                    } else if (b) {
                        Test.instanceCount -= 1529140390L;
                    } else if (b) {
                        d2 -= i9;
                    } else {
                        i8 += i6;
                    }
                }
            } while ((i9 -= 3) > 0);
        }
        vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + s + i10 + i11 + Double.doubleToLongBits(d2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(int i2, double d1) {

        int i3=14, i4=-11, i12=-14, i13=-5, i14=189, iArr[]=new int[N];
        short s1=3636;
        float f1=58.507F;
        long l=-1688721184265230825L;

        FuzzerUtils.init(iArr, 13304);

        for (i3 = 17; i3 < 393; i3++) {
            vMeth1();
            d1 *= s1;
            i2 += (((i3 * Test.instanceCount) + i3) - f1);
            for (i12 = 1; i12 < 4; i12++) {
                for (l = 1; 2 > l; l++) {
                    iArr[(int)(l)] = i13;
                    f1 += -18974;
                    switch ((i12 % 3) + 43) {
                    case 43:
                        Test.iArrFld = Test.iArrFld;
                        Test.lArrFld[(int)(l + 1)] += i12;
                        i13 = 230;
                        break;
                    case 44:
                        i13 = i14;
                        break;
                    case 45:
                        i4 -= i14;
                        d1 *= 172;
                        break;
                    }
                }
            }
        }
        vMeth_check_sum += i2 + Double.doubleToLongBits(d1) + i3 + i4 + s1 + Float.floatToIntBits(f1) + i12 + i13 + l +
            i14 + FuzzerUtils.checkSum(iArr);
    }

    public static float fMeth(float f) {

        int i1=-249, i15=6, i16=0, i17=-2, i18=10;
        byte by=3;

        i1 -= i1;
        vMeth(i1, Test.dFld);
        for (i15 = 362; i15 > 7; i15--) {
            i17 = 1;
            do {
                Test.instanceCount += (-10 + (i17 * i17));
                i18 = 1;
                do {
                    i16 -= (int)Test.dFld;
                    if (true) continue;
                    Test.instanceCount -= (long)f;
                    i1 += (((i18 * f) + by) - i1);
                    i16 = i16;
                } while (--i18 > 0);
                if (false) continue;
                Test.lArrFld[i17 + 1] -= i1;
                i16 = Test.iFld;
                Test.dFld *= by;
            } while (++i17 < 5);
        }
        long meth_res = Float.floatToIntBits(f) + i1 + i15 + i16 + i17 + i18 + by;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=-2.61736, d3=-36.34145;
        int i=-48781, i19=-157, i20=-49650, i21=7192, i22=-8, i23=168, i24=-18853, i25=81, i26=11;
        long l1=-11L;
        short s2=28206;
        float f2=42.214F;

        for (d = 7; d < 378; d++) {
            Test.lArrFld[(int)(d - 1)] += (long)fMeth(fFld);
        }
        for (i19 = 179; i19 > 1; i19 -= 3) {
            Test.dFld = i;
            Test.iFld = i20;
            for (i21 = i19; 284 > i21; ++i21) {
                fFld += i20;
                l1 = 48552;
                i23 = 1;
                while (++i23 < 2) {
                    i += (int)81.397F;
                }
            }
            fFld += (i19 * i19);
            i22 += (i19 * Test.instanceCount);
            i22 += (i19 ^ l1);
            i = (int)Test.instanceCount;
            i22 += (i19 * i19);
            for (d3 = 1; d3 < i19; ++d3) {
                Test.dFld *= i23;
                i22 = i20;
                i20 = i22;
                for (i25 = 1; 2 > i25; i25++) {
                    Test.iArrFld[i19][i25] = i23;
                    l1 *= s2;
                }
                i24 += i26;
                f2 = 1;
                while (++f2 < 2) {
                    l1 *= i26;
                    l1 += i22;
                    i26 -= i24;
                    Test.instanceCount += Test.instanceCount;
                    Test.dFld += i;
                }
                fFld += (float)(((d3 * l1) + f2) - i25);
            }
        }

        FuzzerUtils.out.println("d i i19 = " + Double.doubleToLongBits(d) + "," + i + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("l1 i23 d3 = " + l1 + "," + i23 + "," + Double.doubleToLongBits(d3));
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("s2 f2 = " + s2 + "," + Float.floatToIntBits(f2));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.iFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Test.iFld);
        FuzzerUtils.out.println("fFld Test.lArrFld Test.iArrFld = " + Float.floatToIntBits(fFld) + "," +
            FuzzerUtils.checkSum(Test.lArrFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
