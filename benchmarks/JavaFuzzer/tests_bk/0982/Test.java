// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:18 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=12194L;
    public float fFld=2.859F;
    public static short sFld=-13781;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 35270);
        FuzzerUtils.init(Test.fArrFld, 97.16F);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;

    public static void vMeth(int i, long l, int i1) {

        int iArr[]=new int[N];

        FuzzerUtils.init(iArr, 5);

        iArr[(i >>> 1) % N] >>>= (int)((i * (46065 * (-28L - (iArr[(i1 >>> 1) % N]--)))) * (--Test.instanceCount));
        vMeth_check_sum += i + l + i1 + FuzzerUtils.checkSum(iArr);
    }

    public static long lMeth1(boolean b, int i5) {

        int i6=-27690, i7=38725, i8=-103, i9=-7, i10=-151, i11=17718, i12=-8, i13=-44181;
        byte by=52;
        double d=-41.65635;
        float f=68.65F;

        vMeth(i5, Test.instanceCount, 0);
        Test.instanceCount <<= 61967;
        for (i6 = 12; i6 < 226; ++i6) {
            for (i8 = 1; i8 < 8; ++i8) {
                b = b;
            }
            Test.iArrFld = Test.iArrFld;
            i5 += (((i6 * i8) + Test.instanceCount) - by);
            Test.instanceCount *= (long)d;
            Test.instanceCount -= i8;
            Test.iArrFld[i6 - 1] = (int)-6967L;
            for (i10 = 1; i10 < 8; i10++) {
                for (i12 = 1; i12 < 2; ++i12) {
                    f += 14;
                    Test.iArrFld[i6 - 1] &= i11;
                    i9 = i5;
                }
            }
        }
        long meth_res = (b ? 1 : 0) + i5 + i6 + i7 + i8 + i9 + by + Double.doubleToLongBits(d) + i10 + i11 + i12 + i13
            + Float.floatToIntBits(f);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static long lMeth(int i3, int i4) {

        boolean b1=true;
        int i14=9, i15=150, i16=8, i17=-132, i18=9, i19=-19, i20=11, i21=-10;

        vMeth(-((i3 - i3) + i3), lMeth1(b1, -56570) & i4, i3);
        for (i14 = 11; i14 < 207; i14++) {
            i15 = i14;
            if (b1) {
                i4 = (int)12L;
                for (i16 = 1; 8 > i16; ++i16) {
                    for (i18 = i16; i18 < 2; ++i18) {
                        Test.instanceCount = Test.instanceCount;
                    }
                    Test.instanceCount *= i19;
                    switch ((i16 % 2) + 72) {
                    case 72:
                        for (i20 = 2; i20 > 1; --i20) {
                            Test.iArrFld[i20 + 1] %= (int)(i18 | 1);
                            Test.instanceCount = i15;
                            if (b1) continue;
                        }
                        Test.fArrFld = Test.fArrFld;
                    case 73:
                        i15 = Test.sFld;
                        break;
                    }
                }
            } else if (b1) {
                Test.iArrFld[i14 - 1] = i14;
            } else if (b1) {
                i4 |= i21;
            } else {
                Test.iArrFld[i14] = i3;
            }
        }
        long meth_res = i3 + i4 + (b1 ? 1 : 0) + i14 + i15 + i16 + i17 + i18 + i19 + i20 + i21;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i2=35220, i22=-5, i23=-14970, i24=-8, i25=-47508, i26=30962, i27=-30430, i28=-177, i29=44319, i30=-69,
            i31=-41, i32=219, iArr1[]=new int[N];
        byte by1=54;
        long lArr[]=new long[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr1, -169);
        FuzzerUtils.init(lArr, -62222L);
        FuzzerUtils.init(dArr, -78.42968);

        vMeth(i2 -= (iArr1[(i2 >>> 1) % N]++), (long)(fFld - iArr1[(i2 >>> 1) % N]), iArr1[(i2 >>> 1) % N]--);
        i2 *= i2;
        i2 <<= (int)(i2 - ((-(--lArr[(i2 >>> 1) % N])) + (-lMeth(i2, i2))));
        for (i22 = 285; i22 > 7; --i22) {
            i2 = (int)Test.instanceCount;
            i23 = (int)Test.instanceCount;
            Test.instanceCount = -14;
            i2 *= i22;
            if (true) {
                for (i24 = 4; 90 > i24; i24++) {
                    i2 >>= i25;
                }
            } else {
                for (i26 = 4; i26 < 90; ++i26) {
                    switch ((i22 % 8) + 3) {
                    case 3:
                        i2 *= i25;
                        Test.instanceCount -= i27;
                        i27 *= i27;
                    case 4:
                        for (i28 = 1; i28 < 2; i28 += 3) {
                            boolean b2=false;
                            Test.instanceCount += i28;
                            dArr[i26] *= i25;
                            if (b2) break;
                            fFld += i26;
                        }
                        i27 += (i26 * i26);
                        Test.iArrFld[i22] = -1;
                        fFld = Test.instanceCount;
                        break;
                    case 5:
                        i29 = (int)Test.instanceCount;
                        for (i30 = i22; i30 < 2; i30++) {
                            i31 += (i30 * i30);
                            by1 += (byte)i30;
                            iArr1[i30 - 1] += i2;
                            i27 += (((i30 * Test.instanceCount) + fFld) - by1);
                        }
                        break;
                    case 6:
                        i2 += (((i26 * fFld) + i29) - fFld);
                        break;
                    case 7:
                    case 8:
                        Test.iArrFld[i22] <<= i2;
                    case 9:
                        try {
                            i2 = (-186 / i31);
                            i23 = (52089 % i30);
                            i25 = (-24788 % i28);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 10:
                        iArr1[i22] = i32;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i2 i22 i23 = " + i2 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 i31 by1 = " + i30 + "," + i31 + "," + by1);
        FuzzerUtils.out.println("i32 iArr1 lArr = " + i32 + "," + FuzzerUtils.checkSum(iArr1) + "," +
            FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test.instanceCount fFld Test.sFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(fFld) + "," + Test.sFld);
        FuzzerUtils.out.println("Test.iArrFld Test.fArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth mainTest lMeth lMeth1
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
