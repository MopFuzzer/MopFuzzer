// Generated by Java* Fuzzer test generator (1.0.001). Wed Jun 17 10:51:21 2020
public class Test {

    public static final int N = 400;

    public static long instanceCount=-64837L;
    public static float fFld=2.476F;
    public boolean bFld=true;
    public static long[] lArrFld =new long[N];
    public static int[][] iArrFld =new int[N][N];
    public float[] fArrFld =new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 1991694827756211876L);
        FuzzerUtils.init(Test.iArrFld, 32552);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        byte by=18;
        int i4=148, i5=-5, i6=-58;
        float f1=78.70F;
        float[] fArr =new float[N];
        double d1=-1.92854;
        boolean b=false;

        FuzzerUtils.init(fArr, 2.879F);

        by ^= (byte)-4699703362783820082L;
        Test.instanceCount = i4;
        if (b) {
            i4 = i4;
            f1 -= f1;
        } else if (b) {
            f1 -= i4;
        } else if (b) {
            i4 = i4;
            i4 -= (int)f1;
            Test.instanceCount -= i4;
            for (i5 = 15; 308 > i5; ++i5) {
                i6 += i5;
                f1 -= -188;
                fArr = FuzzerUtils.float1array(N, (float)-1.485F);
                f1 += (float)d1;
                i6 -= 11;
            }
        } else {
            i6 |= (int)26342231L;
        }
        vMeth1_check_sum += by + i4 + Float.floatToIntBits(f1) + i5 + i6 + Double.doubleToLongBits(d1) + (b ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(int i3) {

        int i7=-127, i8=-61, i9=-162;
        boolean b1=true;
        byte[] byArr =new byte[N];

        FuzzerUtils.init(byArr, (byte)19);

        i3 += (int)Test.instanceCount;
        vMeth1();
        i3 = i3;
        Test.fFld = Test.instanceCount;
        Test.fFld += Test.fFld;
        for (byte by1 : byArr) {
            i7 = 1;
            do {
                Test.iArrFld = Test.iArrFld;
                i3 = i3;
                byArr = byArr;
                if (b1) {
                    for (i8 = 1; i8 < 1; ++i8) {
                        i3 += i8;
                        Test.instanceCount >>= Test.instanceCount;
                    }
                } else if (b1) {
                    i3 *= (int)Test.instanceCount;
                } else {
                    Test.fFld += (i7 - Test.fFld);
                }
            } while (++i7 < 4);
        }
        vMeth_check_sum += i3 + i7 + i8 + i9 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(byArr);
    }

    public static float fMeth() {

        int i2=45370, i10=-4;
        short s=-12203;
        float f=40.819F;
        double d=0.40207;
        byte by2=-45;

        i2 = (int)((++s) + ((f++) * (f - i2)));
        Test.lArrFld[(i2 >>> 1) % N] <<= (long)((++d) * 6);
        vMeth(i2);
        i2 = i2;
        i2 -= i10;
        i2 = (int)f;
        Test.iArrFld[(i2 >>> 1) % N][(i10 >>> 1) % N] &= by2;
        i10 = i10;
        i10 += (int)Test.instanceCount;
        Test.iArrFld[(i10 >>> 1) % N][(i2 >>> 1) % N] -= (int)61.695F;
        long meth_res = i2 + s + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i10 + by2;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-1, i1=55258, i11=147, i12=-43741, i13=5, i14=-11;
        short s1=-6050;
        byte by3=49;
        double d2=2.78477;

        if (bFld) {
            if (bFld) {
                for (i = 5; i < 367; ++i) {
                    Test.instanceCount = (i1++);
                    switch (((((int)(-31 + Test.instanceCount)) >>> 1) % 2) + 94) {
                    case 94:
                        i1 += (int)fMeth();
                        i1 += i1;
                        i1 <<= i1;
                        break;
                    case 95:
                        s1 = (short)i1;
                        fArrFld[i - 1] = Test.instanceCount;
                        bFld = bFld;
                        break;
                    }
                    Test.fFld += (((i * i) + Test.instanceCount) - i);
                    for (i11 = 70; i11 > 1; i11 -= 2) {
                        try {
                            Test.iArrFld[i][i] = (35494 % i11);
                            i1 = (i1 / i);
                            i1 = (i / 51);
                        } catch (ArithmeticException a_e) {}
                        for (i13 = 3; i13 > 1; i13--) {
                            i12 = i13;
                            i1 += i13;
                            Test.instanceCount -= i1;
                            Test.instanceCount = Test.instanceCount;
                            switch ((i11 % 4) + 22) {
                            case 22:
                                switch ((i11 % 10) + 81) {
                                case 81:
                                    i1 -= (int)Test.instanceCount;
                                    Test.lArrFld[i11] *= Test.instanceCount;
                                    i1 += (((i13 * i1) + by3) - i13);
                                    break;
                                case 82:
                                    i14 += (i13 ^ i);
                                    Test.instanceCount += i13;
                                    break;
                                case 83:
                                    s1 >>= (short)i12;
                                    Test.iArrFld[i11 + 1][i - 1] += i12;
                                    break;
                                case 84:
                                    Test.iArrFld[i11][i13] >>= i;
                                case 85:
                                    i12 += i11;
                                    break;
                                case 86:
                                    i14 >>= (int)8206501549519641983L;
                                    break;
                                case 87:
                                    Test.instanceCount |= i11;
                                    break;
                                case 88:
                                    d2 = Test.instanceCount;
                                    break;
                                case 89:
                                    i12 += (i13 + i14);
                                    break;
                                case 90:
                                    i1 = (int)Test.instanceCount;
                                }
                                break;
                            case 23:
                            case 24:
                            case 25:
                                i1 -= (int)Test.fFld;
                                break;
                            default:
                                Test.fFld = Test.fFld;
                            }
                        }
                    }
                }
            } else if (false) {
                Test.iArrFld[(i11 >>> 1) % N][(i13 >>> 1) % N] = i13;
            } else {
                i1 >>>= -118;
            }
        } else if (bFld) {
            Test.iArrFld[(-65 >>> 1) % N][(i13 >>> 1) % N] = -967;
        }

        FuzzerUtils.out.println("i i1 s1 = " + i + "," + i1 + "," + s1);
        FuzzerUtils.out.println("i11 i12 i13 = " + i11 + "," + i12 + "," + i13);
        FuzzerUtils.out.println("i14 by3 d2 = " + i14 + "," + by3 + "," + Double.doubleToLongBits(d2));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld bFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + (bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.lArrFld Test.iArrFld fArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

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
