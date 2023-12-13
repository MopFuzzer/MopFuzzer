// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:53 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-73684965L;
    public static byte byFld=-23;
    public static short sFld=-16428;
    public float fFld=2.49F;
    public int iArrFld[]=new int[N];

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;

    public static byte byMeth(short s) {

        int i7=7, i8=-25816, i9=8, i10=21965, i11=4051, i12=7, iArr1[][]=new int[N][N];
        float f1=-56.379F, fArr1[]=new float[N];

        FuzzerUtils.init(iArr1, -75);
        FuzzerUtils.init(fArr1, -78.942F);

        for (i7 = 13; i7 < 270; ++i7) {
            iArr1[i7 - 1][i7 - 1] >>= (int)0L;
            for (i9 = 1; i9 < 6; i9++) {
                i10 += (((i9 * Test.instanceCount) + i10) - f1);
                fArr1[i9] = f1;
                for (i11 = 1; i11 < 2; ++i11) {
                    if (i12 != 0) {
                    }
                    iArr1[i7 - 1][i9 + 1] <<= 66;
                    f1 += (((i11 * i9) + Test.instanceCount) - Test.byFld);
                    Test.instanceCount = Test.instanceCount;
                    iArr1[i11 - 1][i9] = (int)Test.instanceCount;
                    try {
                        i8 = (7911 / i11);
                        iArr1[i11 + 1][i7 - 1] = (i11 / i12);
                        i8 = (i11 / 50028);
                    } catch (ArithmeticException a_e) {}
                    f1 += ((long)i11 | (long)i9);
                }
                i8 += s;
                try {
                    iArr1[i7 - 1][i9] = (iArr1[i7 - 1][i7 - 1] / -38931);
                    i8 = (i8 / 244);
                    i8 = (-9797 / i8);
                } catch (ArithmeticException a_e) {}
            }
        }
        long meth_res = s + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1) + i11 + i12 + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static void vMeth(float f, int i6, byte by) {

        short s1=-21851;
        float fArr[]=new float[N];
        int iArr[]=new int[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(fArr, -2.1012F);
        FuzzerUtils.init(iArr, -208);
        FuzzerUtils.init(dArr, 45.129222);

        f *= fArr[(i6 >>> 1) % N];
        iArr[(i6 >>> 1) % N] *= (int)(((i6 *= (int)-1430495871179737465L) / (((long)(++dArr[(9 >>> 1) % N])) | 1)) * f);
        i6 -= (byMeth(s1) * i6);
        vMeth_check_sum += Float.floatToIntBits(f) + i6 + by + s1 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr))
            + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth(int i4, int i5) {

        float f2=1.203F;
        int i13=-12, i14=-7, i15=41743, i16=-7, i17=22055, iArr2[]=new int[N];
        long l=821784459638056140L, lArr[]=new long[N];
        double dArr1[]=new double[N];

        FuzzerUtils.init(dArr1, -1.34442);
        FuzzerUtils.init(lArr, -55612L);
        FuzzerUtils.init(iArr2, -74);

        vMeth(f2, i4, Test.byFld);
        for (i13 = 9; 187 > i13; ++i13) {
            l = 9;
            do {
                dArr1[i13 + 1] = i14;
                f2 += (((l * Test.byFld) + i4) - Test.sFld);
                i5 -= (int)f2;
                lArr[i13 + 1] -= i14;
            } while ((l -= 3) > 0);
            for (i15 = 9; i15 > i13; --i15) {
                dArr1[i15 - 1] %= (i5 | 1);
                iArr2[i15 - 1] = (int)l;
                i17 = 1;
                while (--i17 > 0) {
                    i14 -= (int)-9129818983554473654L;
                    Test.instanceCount &= i4;
                    i4 >>>= Test.byFld;
                    Test.instanceCount = i4;
                }
            }
        }
        long meth_res = i4 + i5 + Float.floatToIntBits(f2) + i13 + i14 + l + i15 + i16 + i17 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)) + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=30.15504;
        int i=10642, i1=-9, i2=8, i3=-2, i18=-154, i19=-2421, i20=-53697, i21=-16392, i22=9;
        boolean b=false;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 0L);

        d = 1;
        while (++d < 218) {
            for (i = 115; i > 3; i -= 3) {
                for (i2 = i; 4 > i2; i2++) {
                    i3 %= (int)(((iMeth(i1, i) * i1) - Test.instanceCount) | 1);
                    i3 = i3;
                    i3 += i;
                }
                Test.instanceCount += -167;
                iArrFld[i + 1] = (int)Test.instanceCount;
                for (i18 = 4; i18 > i; i18 -= 3) {
                    iArrFld[i18 + 1] <<= i18;
                    i1 -= i18;
                    lArr1[(int)(d - 1)] = (long)fFld;
                    Test.byFld += (byte)i18;
                    i3 -= (int)Test.instanceCount;
                    i3 <<= i18;
                    lArr1[i + 1] -= Test.instanceCount;
                    iArrFld = iArrFld;
                    i3 += i19;
                }
                i20 = 4;
                do {
                    b = b;
                    try {
                        iArrFld[i20] = (i19 % i);
                        i3 = (i20 / 27654);
                        i3 = (i1 % i);
                    } catch (ArithmeticException a_e) {}
                } while (--i20 > 0);
                i19 = i2;
                i1 = -23745;
            }
            for (i21 = (int)(d); 115 > i21; i21++) {
                i3 = 3;
                Test.instanceCount += (i21 | i20);
                switch (((-8 >>> 1) % 3) + 14) {
                case 14:
                    iArrFld[i21] *= i22;
                    fFld += Test.instanceCount;
                    i22 <<= (int)Test.instanceCount;
                case 15:
                    i1 = 3374;
                    break;
                case 16:
                    Test.instanceCount = 120;
                default:
                    Test.instanceCount += i;
                }
            }
        }

        FuzzerUtils.out.println("d i i1 = " + Double.doubleToLongBits(d) + "," + i + "," + i1);
        FuzzerUtils.out.println("i2 i3 i18 = " + i2 + "," + i3 + "," + i18);
        FuzzerUtils.out.println("i19 i20 b = " + i19 + "," + i20 + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("i21 i22 lArr1 = " + i21 + "," + i22 + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.sFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Test.sFld);
        FuzzerUtils.out.println("fFld iArrFld = " + Float.floatToIntBits(fFld) + "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
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
//DEBUG  byMeth ->  byMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
