// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:11 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=106L;
    public static short sFld=-8189;
    public static int iFld=100;
    public volatile boolean bFld=true;
    public int iArrFld[]=new int[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i2) {

        double d=89.126740;
        int i3=-175, i4=-63, i5=48587, i6=-247, iArr[]=new int[N];
        float f=-47.727F, fArr[]=new float[N];
        byte by1=-103;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 3L);
        FuzzerUtils.init(iArr, -60);
        FuzzerUtils.init(fArr, -26.789F);

        lArr = lArr;
        i2 *= (int)Test.instanceCount;
        i2 -= (int)d;
        i2 = i2;
        switch (((i2 >>> 1) % 7) + 113) {
        case 113:
        case 114:
            for (i3 = 389; i3 > 21; i3 -= 2) {
                iArr[i3 - 1] = (int)Test.instanceCount;
                i2 = (int)Test.instanceCount;
                for (i5 = 1; i5 < 9; ++i5) {
                    if (i4 != 0) {
                    }
                    iArr[i3 + 1] -= (int)d;
                    d = f;
                    f *= (float)d;
                    Test.instanceCount = 44943;
                    i6 -= i3;
                }
            }
        case 115:
            Test.instanceCount -= i3;
        case 116:
            f = 45209;
            break;
        case 117:
            iArr = iArr;
        case 118:
            fArr[(i4 >>> 1) % N] -= Test.instanceCount;
            break;
        case 119:
            i4 -= i2;
        default:
            f -= by1;
        }
        long meth_res = i2 + Double.doubleToLongBits(d) + i3 + i4 + i5 + i6 + Float.floatToIntBits(f) + by1 +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void vMeth1(int i, long l, int i1) {

        byte by2=79;
        int i7=19563, i8=24941, i9=139, i10=-26210;
        float f1=2.6F, fArr1[][]=new float[N][N];
        boolean b=true;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-13461);
        FuzzerUtils.init(fArr1, 1.609F);

        Test.instanceCount >>= (lMeth(i) + i1);
        i1 ^= by2;
        i7 = 1;
        do {
            l -= i1;
            iArrFld = iArrFld;
            for (i8 = 1; i8 < 5; ++i8) {
                Test.instanceCount -= -124;
                sArr[i7 - 1] -= (short)1.105515;
                i -= i;
                fArr1[i8] = fArr1[i8 - 1];
                i10 = 1;
                while (++i10 < 2) {
                    f1 = f1;
                    b = b;
                    Test.sFld += (short)i10;
                    l -= (long)2.479F;
                }
            }
        } while (++i7 < 352);
        vMeth1_check_sum += i + l + i1 + by2 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1) + (b ? 1 : 0) +
            FuzzerUtils.checkSum(sArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public void vMeth(byte by) {

        int i11=36939, i12=0, i13=-48765, i14=-158, i15=-9, i16=246, i17=-102;
        long l2=-42223L;
        short sArr1[]=new short[N];

        FuzzerUtils.init(sArr1, (short)-13227);

        vMeth1(Test.iFld, Test.instanceCount, Test.iFld);
        for (i11 = 398; 8 < i11; i11 -= 2) {
            for (i13 = 8; i13 > 1; i13 -= 2) {
                for (l2 = i13; l2 < 3; l2 += 3) {
                    Test.instanceCount = 88;
                    try {
                        i14 = (iArrFld[i13] / iArrFld[i11]);
                        i12 = (165 % i14);
                        Test.iFld = (Test.iFld / 1600785025);
                    } catch (ArithmeticException a_e) {}
                    iArrFld = iArrFld;
                    i14 = i12;
                    Test.instanceCount *= 0;
                    sArr1[(int)(l2 - 1)] += (short)60517;
                    if (bFld) continue;
                }
                for (i16 = 1; i16 < 3; ++i16) {
                    i12 = Test.sFld;
                    Test.instanceCount = Test.instanceCount;
                    i14 = i12;
                }
            }
        }
        vMeth_check_sum += by + i11 + i12 + i13 + i14 + l2 + i15 + i16 + i17 + FuzzerUtils.checkSum(sArr1);
    }

    public void mainTest(String[] strArr1) {

        byte by3=113;
        int i18=1, i19=11453, i20=6613, i21=24518, i22=31835, i23=0, i24=-184, i25=0, i26=10, i27=4, i28=-389;
        float f2=-57.719F;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -3384485678L);

        vMeth(by3);
        for (i18 = 170; i18 > 1; i18--) {
            f2 += f2;
            lArr1[i18 + 1] = i18;
            f2 -= f2;
            Test.iFld += (i18 * i18);
            iArrFld[i18] -= (int)f2;
            Test.sFld += (short)(i18 * i18);
            Test.instanceCount += i18;
            Test.instanceCount += (((i18 * i18) + i18) - f2);
        }
        for (i20 = 16; i20 < 340; ++i20) {
            Test.iFld *= i19;
        }
        i19 += (int)4070558700L;
        for (i22 = 169; i22 > 2; i22 -= 2) {
            Test.instanceCount = i19;
            if (bFld) break;
            for (i24 = 4; i24 < 302; ++i24) {
                for (i26 = 1; i26 < 2; ++i26) {
                    i21 ^= (int)-684518413L;
                    i27 ^= (int)Test.instanceCount;
                    Test.instanceCount -= 57539;
                    i21 = i21;
                    iArrFld[i24] >>= 151;
                    i21 >>= Test.sFld;
                }
                i19 -= i18;
                i23 <<= i18;
            }
            i25 /= (int)(Test.instanceCount | 1);
            i28 = 1;
            while (++i28 < 302) {
                iArrFld[i28] >>= (int)Test.instanceCount;
                Test.instanceCount += i23;
            }
        }

        FuzzerUtils.out.println("by3 i18 i19 = " + by3 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("f2 i20 i21 = " + Float.floatToIntBits(f2) + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 lArr1 = " + i28 + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.iFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Test.iFld);
        FuzzerUtils.out.println("bFld iArrFld = " + (bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}