// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:30 2023
public class Test0390 {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static int iFld=51534;
    public static volatile float fFld=-69.648F;
    public byte byFld=68;
    public int[] iArrFld =new int[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i5) {

        int i6=2551;
        int i7=-205;
        int i8=-27159;
        int i9=-6338;
        int i10=72;
        int i11=-17213;
        int i12=46008;
        int[] iArr =new int[N];
        float f=0.188F;
        double d=59.128718;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 210L);
        FuzzerUtils.init(iArr, 10565);

        for (i6 = 17; 353 > i6; ++i6) {
            Test0390.iFld = i8;
            Test0390.iFld += (i6 * i6);
            f -= 0.167F;
        }
        i9 = 1;
        do {
            i10 = 1;
            do {
                for (i11 = 1; i11 < 1; ++i11) {
                    Test0390.instanceCount >>>= i7;
                    lArr[i10] = (long)d;
                    iArr[i9 + 1] += -56155;
                    iArr[i11] = i7;
                }
                f += 2709936792L;
            } while (++i10 < 5);
            iArr = iArr;
            Test0390.instanceCount -= Test0390.instanceCount;
            i5 = i9;
        } while (++i9 < 364);
        long meth_res = i5 + i6 + i7 + i8 + Float.floatToIntBits(f) + i9 + i10 + i11 + i12 + Double.doubleToLongBits(d)
            + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1() {

        double d1=-1.61360;
        int i13=-49270;
        int i14=-60198;
        int i15=-172;
        int i16=119;
        int i17=56165;
        int[] iArr1 =new int[N];
        short s=19329;
        byte by=-60;

        FuzzerUtils.init(iArr1, -91);

        Test0390.iFld += (int) ((Test0390.iFld >> lMeth(Test0390.iFld)) * Test0390.instanceCount);
        for (d1 = 14; d1 < 383; ++d1) {
            iArr1[(int)(d1 + 1)] = i13;
            Test0390.iFld = i13;
            for (i14 = (int)(d1); i14 < 5; i14++) {
                switch (((-7 >>> 1) % 8) + 24) {
                case 24:
                    if (i15 != 0) {
                        vMeth1_check_sum += Double.doubleToLongBits(d1) + i13 + i14 + i15 + i16 + i17 + s + by +
                            FuzzerUtils.checkSum(iArr1);
                        return;
                    }
                    for (i16 = 1; i16 < 1; i16 += 3) {
                        i17 *= (int) Test0390.instanceCount;
                        switch ((int)(((d1 % 2) * 5) + 19)) {
                        case 23:
                            s %= (short)(i17 | 1);
                            break;
                        case 25:
                            i13 = Test0390.iFld;
                            break;
                        }
                        Test0390.instanceCount = i14;
                        iArr1[i14 - 1] = i14;
                        Test0390.instanceCount = -9L;
                    }
                    break;
                case 25:
                    Test0390.instanceCount *= (long) d1;
                    break;
                case 26:
                    by += (byte)-7671920947796056694L;
                case 27:
                    iArr1[(int)(d1)] *= (int)-41.663F;
                    break;
                case 28:
                    Test0390.fFld += Test0390.instanceCount;
                    break;
                case 29:
                    i13 += (int) Test0390.fFld;
                case 30:
                    Test0390.instanceCount += i14;
                    break;
                case 31:
                    i17 = s;
                    break;
                default:
                    i17 = -117;
                }
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d1) + i13 + i14 + i15 + i16 + i17 + s + by +
            FuzzerUtils.checkSum(iArr1);
    }

    public void vMeth(int i, int i1) {

        int i2=32195, i3=-19180, i4=-43546, i18=-58977, i19=42825, i20=0;

        for (i2 = 238; 2 < i2; --i2) {
            i4 = 1;
            do {
                vMeth1();
                try {
                    iArrFld[i2 + 1] = (-34292 % i2);
                    i1 = (i3 % -15695);
                    iArrFld[i2] = (Test0390.iFld / iArrFld[i4 - 1]);
                } catch (ArithmeticException a_e) {}
            } while (++i4 < 7);
            i1 -= (int)-5589642601982417073L;
            i |= 98;
            i3 += -60;
            for (i18 = 1; i18 < 7; i18++) {
                i20 = 1;
                do {
                    i = -27;
                    Test0390.fFld *= Test0390.iFld;
                    i3 *= i1;
                } while (++i20 < 2);
                i3 += i18;
                iArrFld[i2 - 1] -= byFld;
                i3 = i19;
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i4 + i18 + i19 + i20;
    }

    public void mainTest(String[] strArr1) {

        int i21=219;
        int i22=-66;
        int i23=14;
        int i24=-60850;
        int i25=-1;
        int i26=-76;
        int i27=68;
        int[][] iArr2 =new int[N][N];
        double[] dArr =new double[N];
        float[] fArr =new float[N];
        long[][] lArr1 =new long[N][N];

        FuzzerUtils.init(dArr, 0.85064);
        FuzzerUtils.init(fArr, 0.664F);
        FuzzerUtils.init(iArr2, -8);
        FuzzerUtils.init(lArr1, 8535614346525156049L);

        iArrFld[(-10 >>> 1) % N] -= Integer.reverseBytes(iArrFld[(Test0390.iFld >>> 1) % N]--);
        vMeth(Test0390.iFld, 102);
        for (double d2 : dArr) {
            short s1=4582;
            fArr[(Test0390.iFld >>> 1) % N] += s1;
            for (i21 = 1; i21 < 63; ++i21) {
                Test0390.fFld -= 0.431F;
                for (i23 = 2; i23 > 1; --i23) {
                    s1 <<= (short) Test0390.instanceCount;
                    Test0390.instanceCount = i23;
                    i24 -= (int) Test0390.instanceCount;
                    Test0390.iFld += (int) Test0390.instanceCount;
                    Test0390.instanceCount *= i24;
                    iArr2 = iArr2;
                }
                lArr1[i21 + 1][i21] += i23;
                i24 += (i21 * i21);
                i22 = 233;
                for (i25 = 1; i25 < 2; i25++) {
                    i26 >>= i26;
                    Test0390.iFld = i24;
                    i22 *= (int)5636499270916850167L;
                    iArrFld[i21 - 1] = i21;
                    i24 = Test0390.iFld;
                    iArrFld[i21 + 1] = (int)-1.41094;
                }
                i27 = 1;
                while (++i27 < 2) {
                    Test0390.instanceCount *= Test0390.instanceCount;
                    iArr2[i21 + 1][i21] += i27;
                    iArr2[i27][i21] = (int) Test0390.instanceCount;
                    try {
                        i22 = (Test0390.iFld % Test0390.iFld);
                        Test0390.iFld = (i27 % iArr2[i21 - 1][i21 - 1]);
                        i24 = (-216 % i27);
                    } catch (ArithmeticException a_e) {}
                    i22 = i21;
                    Test0390.iFld = i25;
                }
            }
        }

        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 dArr fArr = " + i27 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("iArr2 lArr1 = " + FuzzerUtils.checkSum(iArr2) + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0390.instanceCount Test0390.iFld Test0390.fFld = " + Test0390.instanceCount + "," + Test0390.iFld +
                "," + Float.floatToIntBits(Test0390.fFld));
        FuzzerUtils.out.println("byFld iArrFld = " + byFld + "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0390 _instance = new Test0390();
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
