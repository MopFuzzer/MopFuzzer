// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:01 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=181L;
    public int iFld=57909;
    public static float fFld=-105.631F;
    public static int iFld1=4;
    public static boolean bFld=false;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 2);
        FuzzerUtils.init(Test.lArrFld, 286206107L);
    }

    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i12=7, i13=-163, i14=-119, iArr[]=new int[N];
        boolean b=true;
        short s=-6666;

        FuzzerUtils.init(iArr, 244);

        i12 = 1;
        while ((i12 += 3) < 155) {
            Test.fFld += i12;
            i13 = i13;
        }
        i14 = 1;
        while (++i14 < 315) {
            byte by=11;
            by -= (byte)i13;
            Test.instanceCount -= i12;
            b = b;
            s = (short)i13;
            Test.instanceCount += i14;
            Test.fFld += (30L + (i14 * i14));
            i13 = i12;
            if (b) {
                i13 -= (int)-7L;
                try {
                    iArr[i14 - 1] = (iArr[i14] / iArr[i14]);
                    i13 = (i13 / 10);
                    i13 = (i12 / 46733);
                } catch (ArithmeticException a_e) {}
                i13 += (-45031 + (i14 * i14));
            } else {
                Test.instanceCount = i12;
            }
        }
        vMeth1_check_sum += i12 + i13 + i14 + (b ? 1 : 0) + s + FuzzerUtils.checkSum(iArr);
    }

    public static short sMeth(int i6, long l) {

        int i7=-27782, i8=-5, i9=-164, i10=-12, i11=40, i15=-8, i16=-4;
        double d=-1.129239;
        float f=-55.729F;

        for (i7 = 4; i7 < 191; ++i7) {
            for (d = 1; d < 9; d++) {
                for (i10 = (int)(d); i10 < 2; i10++) {
                    if (d != ((++f) + (--i9))) continue;
                    i8 += (((i10 * i7) + i9) - Test.instanceCount);
                    i11 += i10;
                    vMeth1();
                    i6 = i10;
                    try {
                        i9 = (Test.iArrFld[i10] % i9);
                        i15 = (-566471931 % i8);
                        Test.iArrFld[i10] = (59668 / i10);
                    } catch (ArithmeticException a_e) {}
                }
                i9 += (int)(d * d);
                Test.fFld -= i9;
                Test.lArrFld = Test.lArrFld;
                i16 = 1;
                do {
                    i11 += i16;
                    i15 = (int)Test.fFld;
                } while (++i16 < 2);
            }
        }
        long meth_res = i6 + l + i7 + i8 + Double.doubleToLongBits(d) + i9 + i10 + i11 + Float.floatToIntBits(f) + i15
            + i16;
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth(int i1, int i2, int i3) {

        int i4=1, i5=59796, i17=-47365, i18=-56181, iArr1[]=new int[N];
        long l1=-5L, l2=619417010L;
        byte by1=-94;

        FuzzerUtils.init(iArr1, 11);

        for (i4 = 1; i4 < 265; i4++) {
            if (sMeth(Test.iFld1, Test.instanceCount) >= -41668) continue;
            Test.fFld = l1;
            Test.instanceCount += (((i4 * Test.fFld) + by1) - Test.instanceCount);
            Test.fFld = by1;
            for (l2 = 1; l2 < 6; l2++) {
                try {
                    i2 = (115 % iArr1[(int)(l2 - 1)]);
                    i2 = (i3 % i3);
                    i1 = (-7210 / iArr1[(int)(l2)]);
                } catch (ArithmeticException a_e) {}
                i18 = 1;
                while (++i18 < 2) {
                    i3 -= (int)Test.instanceCount;
                    switch (((i18 % 2) * 5) + 45) {
                    case 53:
                        if (Test.bFld) continue;
                        l1 += 8915785654605191067L;
                        if (Test.bFld) break;
                        Test.iFld1 = -59;
                        break;
                    case 54:
                        l1 += 187;
                    default:
                        i3 = i17;
                    }
                }
            }
        }
        vMeth_check_sum += i1 + i2 + i3 + i4 + i5 + l1 + by1 + l2 + i17 + i18 + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=-20464, i19=-114, i20=28835, i21=-16, i22=24506, i23=20828, i24=-12, i25=-2, i26=-198, i27=64453;
        double d1=-1.116084;
        byte by2=86;
        short s1=-28019;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 2.680F);

        switch (((((i ^ iFld) >>> 1) % 4) * 5) + 16) {
        case 27:
            vMeth(i, iFld, iFld);
            for (i19 = 239; i19 > 14; i19 -= 3) {
                for (i21 = 2; i21 < 334; i21++) {
                    for (i23 = 2; i23 > i19; --i23) {
                        d1 += i19;
                        i22 += -1;
                        Test.instanceCount = 38867L;
                        Test.iFld1 = -251;
                        Test.iArrFld = FuzzerUtils.int1array(N, (int)-126);
                        iFld += i25;
                        iFld = 14;
                    }
                    by2 |= (byte)i23;
                    i += (i21 - i23);
                    i20 = i25;
                    i24 += (i21 ^ i22);
                    i22 = iFld;
                    Test.iArrFld[i19 + 1] += i19;
                    iFld += (i21 ^ i);
                    Test.instanceCount *= i22;
                }
                i25 = 24;
                i22 += (i19 * i19);
                i20 = s1;
                iFld += (i19 - Test.instanceCount);
                iFld = Test.iFld1;
            }
            for (i26 = 167; i26 > 1; i26--) {
                Test.instanceCount /= (i25 | 1);
                fArr[i26 - 1] = -18L;
                Test.iArrFld[i26] = (int)Test.instanceCount;
                i24 >>= i26;
            }
            break;
        case 28:
            i22 *= (int)Test.instanceCount;
            break;
        case 24:
            Test.iArrFld[(i25 >>> 1) % N] -= i23;
        case 30:
            Test.fFld *= Test.iFld1;
            break;
        default:
            i25 -= iFld;
        }

        FuzzerUtils.out.println("i i19 i20 = " + i + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 d1 i25 = " + i24 + "," + Double.doubleToLongBits(d1) + "," + i25);
        FuzzerUtils.out.println("by2 s1 i26 = " + by2 + "," + s1 + "," + i26);
        FuzzerUtils.out.println("i27 fArr = " + i27 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.fFld = " + Test.instanceCount + "," + iFld + "," +
            Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.iFld1 Test.bFld Test.iArrFld = " + Test.iFld1 + "," + (Test.bFld ? 1 : 0) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
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
//DEBUG  sMeth ->  sMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 sMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}