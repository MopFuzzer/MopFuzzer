// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3461440904L;
    public static float fFld=-103.609F;
    public static double dFld=-54.31273;
    public volatile short sFld=-20036;
    public volatile float fArrFld[]=new float[N];
    public int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 2.85032);
    }

    public static long sMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i13, int i14) {

        int i15=-7, i16=-4, i17=12, i18=169, i19=-2440, i20=10, i21=-8, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 188);

        i15 = 1;
        do {
            Test.dFld = i13;
        } while (++i15 < 379);
        for (i16 = 13; i16 < 250; i16++) {
            iArr1[i16 + 1] >>>= i17;
            Test.dFld = -17970;
            i14 -= (int)1.258F;
            for (i18 = 1; i18 < 7; i18++) {
                switch (((i15 >>> 1) % 2) + 85) {
                case 85:
                    for (i20 = 1; i20 < 2; i20++) {
                        iArr1[i20 - 1] = 22921;
                        i21 += 0;
                        Test.fFld -= -74.244F;
                    }
                case 86:
                    i21 <<= i17;
                    iArr1[i18 - 1] = (int)-168L;
                    break;
                }
                i19 += (int)Test.instanceCount;
            }
        }
        vMeth1_check_sum += i13 + i14 + i15 + i16 + i17 + i18 + i19 + i20 + i21 + FuzzerUtils.checkSum(iArr1);
    }

    public void vMeth() {

        int i8=-14841, i9=-5, i10=27849, i11=14, i12=152;
        byte by1=-18;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 150L);

        iArrFld[(i8 >>> 1) % N] ^= i8;
        i8 -= (int)(((i8 + Test.instanceCount) + (i8 - i8)) * 11);
        i8 ^= 22;
        if (true) {
            i9 = 1;
            while (++i9 < 156) {
                if (Test.fFld >= 5) continue;
                Test.fFld *= i9;
                i10 += (int)((lArr[i9] >>= (6 - (++by1))) + ((by1 | 4) * (i10 * Test.instanceCount)));
                i8 += (int)(i8 >>> (long)((Test.fFld - Test.instanceCount) % ((Test.instanceCount + i8) | 1)));
                for (i11 = 1; i11 < 10; ++i11) {
                    if ((Test.dFld * (-Math.max(38968, i10))) != (--i10)) break;
                }
                vMeth1(-62521, i10);
                by1 *= (byte)-70;
                i8 -= 16;
                Test.instanceCount += (i9 * i9);
            }
        } else {
            Test.fFld += 53;
        }
        vMeth_check_sum += i8 + i9 + i10 + by1 + i11 + i12 + FuzzerUtils.checkSum(lArr);
    }

    public short sMeth() {

        int i4=-9200, i5=172, i6=0, i7=-25, i22=55230, i23=38, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 153);

        for (i4 = 5; i4 < 134; i4++) {
            fArrFld[i4] += ((iArr[i4 - 1]--) / (iArr[i4] | 1));
            for (i6 = 1; i6 < 12; ++i6) {
                i7 += (i6 * Test.instanceCount);
                vMeth();
                i5 = (int)Test.instanceCount;
                i7 = -118;
                i5 += (int)Test.instanceCount;
                for (i22 = 1; i22 < 2; i22++) {
                    i23 <<= (int)107L;
                    i7 *= i7;
                    iArr[i4 - 1] <<= i5;
                    sFld = (short)i22;
                    i23 = (int)Test.instanceCount;
                }
            }
            Test.dFld *= i7;
        }
        long meth_res = i4 + i5 + i6 + i7 + i22 + i23 + FuzzerUtils.checkSum(iArr);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-161, i1=-12, i2=5958, i3=-166, i24=12, i25=-1, i26=-26598, i27=13, i28=7;
        byte by=33, byArr[]=new byte[N];
        boolean b=true;

        FuzzerUtils.init(byArr, (byte)75);

        Test.fFld = Test.instanceCount;
        for (i = 10; i < 207; i++) {
            i1 -= (i1--);
            for (i2 = 6; i2 < 127; i2++) {
                by = (byte)sMeth();
                i1 %= (int)(i3 | 1);
                by <<= (byte)i1;
                i3 += (15681 + (i2 * i2));
                i1 += (i2 - i1);
                Test.instanceCount = i;
                i1 -= (int)Test.instanceCount;
            }
            i1 += i2;
            i24 = 1;
            while (++i24 < 127) {
                switch ((i % 10) + 126) {
                case 126:
                    i3 = (int)Test.instanceCount;
                    i3 += (int)Test.instanceCount;
                    break;
                case 127:
                    Test.instanceCount += (i24 + Test.fFld);
                case 128:
                    i1 |= i3;
                    i3 += i3;
                    Test.instanceCount = -7460;
                    Test.fFld = Test.instanceCount;
                    break;
                case 129:
                    for (i25 = 1; i25 < 1; i25++) {
                        b = b;
                        i1 = i2;
                        i26 |= i3;
                        i1 >>= 33694;
                    }
                case 130:
                    iArrFld[i + 1] -= i24;
                    break;
                case 131:
                    for (i27 = 1; i27 < 1; i27++) {
                        i26 = (int)Test.instanceCount;
                        Test.dArrFld[i24] -= Test.instanceCount;
                    }
                    break;
                case 132:
                    Test.instanceCount -= (long)Test.fFld;
                    break;
                case 133:
                    Test.instanceCount += i25;
                    break;
                case 134:
                    byArr[i - 1] = (byte)i1;
                    break;
                case 135:
                    iArrFld[i24] *= sFld;
                    break;
                default:
                    Test.fFld *= -8;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 by i24 = " + i3 + "," + by + "," + i24);
        FuzzerUtils.out.println("i25 i26 b = " + i25 + "," + i26 + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("i27 i28 byArr = " + i27 + "," + i28 + "," + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("sFld fArrFld iArrFld = " + sFld + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("Test.dArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
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
//DEBUG  sMeth ->  sMeth mainTest
//DEBUG  vMeth ->  vMeth sMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth sMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
