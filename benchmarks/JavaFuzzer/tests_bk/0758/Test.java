// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=27437L;
    public static boolean bFld=false;
    public static volatile float fFld=41.669F;
    public static int iFld=91;
    public static float fArrFld[]=new float[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 0.979F);
        FuzzerUtils.init(Test.lArrFld, 1497870758714891683L);
    }

    public static long bMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(float f1, long l2, int i6) {

        int i7=-158, i8=-129, i9=62385, i10=9, iArr1[]=new int[N];
        double d1=76.114575, dArr[][]=new double[N][N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 1325898134245609356L);
        FuzzerUtils.init(iArr1, -13);
        FuzzerUtils.init(dArr, 0.35065);

        for (i7 = 21; i7 < 357; ++i7) {
            if (Test.bFld) continue;
            f1 += i6;
            for (i9 = 1; i9 < 5; i9++) {
                Test.instanceCount += (i9 * i9);
                lArr[i7 - 1] = i7;
                switch (((i9 >>> 1) % 5) + 91) {
                case 91:
                    iArr1[i9 - 1] -= i7;
                    switch ((i7 % 8) + 3) {
                    case 3:
                        i10 = (int)d1;
                        lArr[i9] %= ((long)(d1) | 1);
                        i10 *= (int)7012752088773526315L;
                        break;
                    case 4:
                        i8 %= (int)8875268857227164270L;
                        i6 -= (int)Test.instanceCount;
                        break;
                    case 5:
                        if (Test.bFld) break;
                        break;
                    case 6:
                        i6 += (i9 * i9);
                        break;
                    case 7:
                        f1 += ((long)i9 | (long)i6);
                        break;
                    case 8:
                        iArr1[i9 - 1] = i8;
                    case 9:
                        i10 &= i8;
                        break;
                    case 10:
                        i6 += (i9 * i9);
                    default:
                        iArr1[i9 - 1] += (int)l2;
                    }
                    break;
                case 92:
                case 93:
                    l2 *= (long)f1;
                    break;
                case 94:
                    iArr1[i9 - 1] &= i7;
                    break;
                case 95:
                    i10 = i7;
                default:
                    dArr[i7 + 1][i9 - 1] = d1;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f1) + l2 + i6 + i7 + i8 + i9 + i10 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(long l, long l1) {

        int i11=-179, i12=-60, i13=8, i14=50830, i15=-53461, i16=5, i17=58, iArr2[]=new int[N];
        double d2=0.129945;

        FuzzerUtils.init(iArr2, 234);

        l >>>= (long)((88.20528 * Test.fArrFld[(7 >>> 1) % N]) - lMeth(Test.fFld, -10L, Test.iFld));
        i11 = 1;
        while (++i11 < 334) {
            Test.iFld *= Test.iFld;
            Test.iFld += (i11 ^ Test.iFld);
            i12 = 1;
            do {
                iArr2[i12 + 1] = Test.iFld;
                iArr2[i11] |= Test.iFld;
                i13 = 1;
                do {
                    Test.iFld *= (int)Test.fFld;
                } while ((i13 -= 3) > 0);
                Test.fFld = Test.iFld;
            } while (++i12 < 5);
        }
        iArr2[(i11 >>> 1) % N] += (int)d2;
        for (i14 = 126; i14 > 7; i14--) {
            for (i16 = 13; i16 > 1; i16--) {
                if (Test.bFld) continue;
                i15 += (int)-61.41482;
            }
        }
        long meth_res = l + l1 + i11 + i12 + i13 + Double.doubleToLongBits(d2) + i14 + i15 + i16 + i17 +
            FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static boolean bMeth() {

        int i2=110, i3=243, i4=34, i5=8, i18=-11, i19=85, i20=6, iArr[]=new int[N];
        short s=22865;
        float f=-66.982F;
        double d=66.5997;

        FuzzerUtils.init(iArr, -13);

        for (i2 = 5; i2 < 177; ++i2) {
            s = (short)Test.instanceCount;
            for (i4 = 1; 9 > i4; i4++) {
                f = (float)d;
                iArr[i4] -= Math.abs(iArr[i2]);
                i3 = ((-iMeth(Test.instanceCount, Test.instanceCount)) >> Test.iFld);
                switch ((i2 % 10) + 35) {
                case 35:
                    Test.iFld ^= Test.iFld;
                    break;
                case 36:
                    d *= Test.iFld;
                    iArr[i4] += (int)f;
                case 37:
                    for (i18 = 1; 2 > i18; ++i18) {
                        Test.iFld += (int)d;
                        i19 >>>= (int)Test.instanceCount;
                        i5 *= -242;
                        if (Test.bFld) break;
                    }
                case 38:
                    f = i18;
                    break;
                case 39:
                    i20 += (((i4 * i3) + i18) - Test.iFld);
                    break;
                case 40:
                    if (Test.bFld) break;
                    break;
                case 41:
                    Test.fFld = i2;
                case 42:
                    Test.instanceCount -= Test.instanceCount;
                case 43:
                    Test.fFld += i20;
                case 44:
                default:
                    try {
                        i20 = (Test.iFld / 20549);
                        i20 = (i20 % -64);
                        i20 = (174 % i3);
                    } catch (ArithmeticException a_e) {}
                }
            }
        }
        long meth_res = i2 + i3 + s + i4 + i5 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i18 + i19 + i20
            + FuzzerUtils.checkSum(iArr);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        int i=3, i1=14, i21=33, i22=57484, i23=5, i24=-156, i25=79, i26=-12, i27=139, i28=9, iArr3[]=new int[N];
        short s1=7557;
        float f2=-1.298F, f3=1.504F;
        long l3=-186L;
        byte by=102;
        double d3=33.74940, dArr1[]=new double[N];

        FuzzerUtils.init(iArr3, 13);
        FuzzerUtils.init(dArr1, 49.64926);

        for (i = 13; i < 218; i++) {
            if (bMeth()) break;
            iArr3 = iArr3;
            Test.iFld = i;
            Test.iFld = i1;
            Test.instanceCount += (((i * i1) + s1) - i);
            Test.iFld %= -3;
            Test.iFld += (11569 + (i * i));
        }
        Test.iFld = s1;
        for (f2 = 8; f2 < 257; f2++) {
            iArr3[(int)(f2 - 1)] -= i;
            for (f3 = f2; f3 < 101; f3++) {
                for (l3 = 1; l3 < 1; ++l3) {
                    Test.fArrFld[(int)(l3)] -= Test.instanceCount;
                    i22 *= i1;
                    i23 -= i1;
                    dArr1[(int)(l3 + 1)] += f3;
                }
                i21 = by;
                i24 = Test.iFld;
                switch ((int)((f2 % 2) + 4)) {
                case 4:
                    for (i25 = 1; i25 < 1; ++i25) {
                        i26 *= i23;
                    }
                    by >>>= (byte)i21;
                case 5:
                    i21 += -216;
                    break;
                }
                Test.lArrFld[(int)(f3 - 1)] *= Test.instanceCount;
                for (i27 = 1; 1 < i27; i27--) {
                    i28 = (int)d3;
                    Test.instanceCount *= Test.instanceCount;
                    d3 *= f2;
                    iArr3[(int)(f3)] = i23;
                }
            }
        }

        FuzzerUtils.out.println("i i1 s1 = " + i + "," + i1 + "," + s1);
        FuzzerUtils.out.println("f2 i21 f3 = " + Float.floatToIntBits(f2) + "," + i21 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i22 l3 i23 = " + i22 + "," + l3 + "," + i23);
        FuzzerUtils.out.println("by i24 i25 = " + by + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("d3 iArr3 dArr1 = " + Double.doubleToLongBits(d3) + "," + FuzzerUtils.checkSum(iArr3) +
            "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.fFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.iFld Test.fArrFld Test.lArrFld = " + Test.iFld + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  iMeth ->  iMeth bMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}