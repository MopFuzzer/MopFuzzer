// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:03 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=143L;
    public static int iFld=159;
    public double dFld=9.43167;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 2.736F);
        FuzzerUtils.init(Test.iArrFld, -11);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, int i5) {

        int i6=-163, i7=4, i8=16866, i9=-3172, i10=86, i11=211;
        boolean b=true;
        float f=-63.885F;
        short s1=-28215;
        double d=-52.71730;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -614478161L);

        for (i6 = 8; 368 > i6; ++i6) {
            if (i6 != 0) {
                vMeth1_check_sum += l + i5 + i6 + i7 + i8 + i9 + (b ? 1 : 0) + i10 + i11 + Float.floatToIntBits(f) + s1
                    + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(lArr);
                return;
            }
            for (i8 = 1; i8 < 5; i8++) {
                lArr[i6 - 1] = l;
                if (b) continue;
                for (i10 = 1; i10 < 2; ++i10) {
                    switch (((i8 % 5) * 5) + 27) {
                    case 30:
                        i5 += (((i10 * i6) + i5) - f);
                        i5 *= (int)l;
                        i9 >>= -36053;
                        try {
                            i9 = (i11 % i10);
                            i5 = (i6 / -610585005);
                            i7 = (i7 / i11);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 46:
                        s1 += (short)10;
                        Test.instanceCount -= (long)d;
                        break;
                    case 42:
                        Test.fArrFld[i6 + 1] = -2.773F;
                        try {
                            i7 = (i7 % -1771868289);
                            i9 = (-12490 % i10);
                            i9 = (i9 / Test.iArrFld[i6]);
                        } catch (ArithmeticException a_e) {}
                    case 37:
                        d *= i7;
                        break;
                    case 41:
                        f -= i9;
                    }
                }
            }
        }
        vMeth1_check_sum += l + i5 + i6 + i7 + i8 + i9 + (b ? 1 : 0) + i10 + i11 + Float.floatToIntBits(f) + s1 +
            Double.doubleToLongBits(d) + FuzzerUtils.checkSum(lArr);
    }

    public static long lMeth() {

        int i=8, i1=-27828, i2=19, i3=118, i4=27336, iArr[]=new int[N];
        short s=11630;
        byte by1=22;

        FuzzerUtils.init(iArr, -205);

        for (i = 2; i < 371; i++) {
            for (i2 = 1; i2 < 5; ++i2) {
                if (true) break;
                i1 = (int)(i3 += (int)((Test.instanceCount + s) - Test.fArrFld[i]));
                Test.instanceCount += Test.instanceCount;
                i3 = (iArr[i2] * (i2 / 118));
                i1 = i2;
                i3 %= (int)((Math.abs((int)(Test.instanceCount * i2)) + ((i3 + Test.instanceCount) + i2)) | 1);
            }
            i4 = 1;
            do {
                if (i3 != 0) {
                }
            } while (++i4 < 5);
            i1 *= (int)((-(-530939127L * (i3 + by1))) - (0.312F - (i1 + Test.instanceCount)));
            vMeth1(Test.instanceCount, i4);
        }
        long meth_res = i + i1 + i2 + i3 + s + i4 + by1 + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(byte by) {

        int i12=155, i13=-37689, i14=35835;
        double d1=-2.41399;
        float f1=-1.451F;
        short s2=-22421;
        boolean b1=true, b2=true;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -7667887611065042367L);

        by -= (byte)((lMeth() - Test.instanceCount) - Test.iFld);
        for (i12 = 3; i12 < 293; i12++) {
            i13 *= (int)d1;
            for (f1 = 1; f1 < 6; f1++) {
                if (b2) {
                    switch (((-5 >>> 1) % 3) + 62) {
                    case 62:
                        Test.iFld *= Test.iFld;
                        Test.instanceCount += (long)f1;
                        i14 = Test.iFld;
                        switch ((int)(((f1 % 1) * 5) + 109)) {
                        case 111:
                            switch (((i12 % 4) * 5) + 70) {
                            case 78:
                                s2 = (short)Test.iFld;
                                break;
                            case 83:
                                by -= (byte)i14;
                                break;
                            case 85:
                                Test.instanceCount += (long)(((f1 * s2) + Test.iFld) - Test.instanceCount);
                                break;
                            case 80:
                                b1 = false;
                                break;
                            default:
                                Test.iArrFld = Test.iArrFld;
                            }
                        }
                        break;
                    case 63:
                    case 64:
                        lArr1[(int)(f1)] = (long)1.54120;
                        break;
                    default:
                        Test.iArrFld[i12 - 1] += Test.iFld;
                    }
                } else if (b1) {
                    i13 <<= (int)Test.instanceCount;
                } else if (b1) {
                    Test.iFld = Test.iFld;
                } else {
                    Test.iFld += (int)(f1 - f1);
                }
            }
        }
        vMeth_check_sum += by + i12 + i13 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f1) + i14 + s2 + (b1 ? 1
            : 0) + (b2 ? 1 : 0) + FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        byte by2=-25;

        vMeth(by2);
        dFld = Test.instanceCount;

        FuzzerUtils.out.println("by2 = " + by2);

        FuzzerUtils.out.println("Test.instanceCount Test.iFld dFld = " + Test.instanceCount + "," + Test.iFld + "," +
            Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test.fArrFld Test.iArrFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}