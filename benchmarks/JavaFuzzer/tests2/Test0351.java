// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:28 2023
public class Test0351 {

    public static final int N = 400;

    public static volatile long instanceCount=8096177509614674002L;
    public static int iFld=-82;
    public static byte byFld=69;
    public static float fFld=2.295F;
    public static short[] sArrFld =new short[N];
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0351.sArrFld, (short) 1473);
        FuzzerUtils.init(Test0351.lArrFld, 102L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(float f2, int i5) {

        int i6=9;
        int i7=-12;
        int i8=-23;
        int i9=-207;
        int i10=1;
        int i11=-7;
        int i12=-121;
        int[] iArr1 =new int[N];
        int[] iArr2 =new int[N];
        double d=27.25153;
        boolean b=false;
        short s=-18407;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, 0.513F);
        FuzzerUtils.init(iArr1, -56582);
        FuzzerUtils.init(iArr2, 41189);

        switch (((-19 >>> 1) % 3) + 54) {
        case 54:
            for (i6 = 258; i6 > 1; i6--) {
                Test0351.instanceCount += Test0351.instanceCount;
                d = Test0351.instanceCount;
                Test0351.instanceCount = i6;
                switch ((i6 % 1) + 104) {
                case 104:
                    switch ((i6 % 10) + 72) {
                    case 72:
                        i5 += (int)f2;
                        i7 += (5 + (i6 * i6));
                        for (i8 = 1; i8 < 6; i8++) {
                            for (i10 = i8; i10 < 2; i10++) {
                                i5 -= i7;
                                Test0351.instanceCount = i10;
                                i5 *= i10;
                                iArr1 = iArr2;
                            }
                        }
                        break;
                    case 73:
                        iArr1[i6 + 1] <<= i7;
                        break;
                    case 74:
                        i7 += i8;
                        break;
                    case 75:
                        iArr1[i6] *= i7;
                    case 76:
                        if (b) continue;
                    case 77:
                        try {
                            Test0351.iFld = (i5 % i9);
                            i12 = (i12 % -37149);
                            i9 = (i7 / -51);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 78:
                        iArr1 = iArr2;
                        break;
                    case 79:
                        if (i12 != 0) {
                        }
                        break;
                    case 80:
                        iArr2[i6] = 13;
                        break;
                    case 81:
                        s += (short)i9;
                        break;
                    }
                    break;
                default:
                    Test0351.iFld += i12;
                }
            }
            break;
        case 55:
            i9 *= i9;
            break;
        case 56:
            fArr[(i6 >>> 1) % N] %= (Test0351.instanceCount | 1);
            break;
        }
        long meth_res = Float.floatToIntBits(f2) + i5 + i6 + i7 + Double.doubleToLongBits(d) + i8 + i9 + i10 + i11 + (b
            ? 1 : 0) + i12 + s + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(iArr2);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static int iMeth(int i4) {

        byte by=99;
        float f1=-1.512F;
        double d1=-1.16151;
        int i13=-85;
        int i14=-14;
        int i15=4;
        int[] iArr =new int[N];
        long l=-370350177514199631L;
        short s1=-10959;

        FuzzerUtils.init(iArr, 208);

        by %= (byte)(((long)(((f1 + i4) - (++i4)) * (i4 *= (++iArr[(i4 >>> 1) % N])))) | 1);
        i4 = (int)(-((-32122 + fMeth(f1, 14579)) + f1));
        iArr[(i4 >>> 1) % N] <<= Test0351.iFld;
        Test0351.instanceCount &= i4;
        for (d1 = 10; d1 < 178; d1 += 2) {
            double d2=-51.106444;
            i13 -= Test0351.iFld;
            l >>= i4;
            i13 += (int) (((d1 * Test0351.iFld) + l) - Test0351.iFld);
            l = Test0351.instanceCount;
            d2 *= 5050;
            i4 -= i13;
            iArr[(i13 >>> 1) % N] *= 34;
            for (i14 = 1; i14 < 18; i14++) {
                i13 = i15;
                s1 = (short)l;
            }
        }
        long meth_res = i4 + by + Float.floatToIntBits(f1) + Double.doubleToLongBits(d1) + i13 + l + i14 + i15 + s1 +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(float f) {

        int i3=131, i16=41807, i17=46532, i18=11, i19=14, i20=-9371, i21=0, i22=35154;
        boolean b1=true;
        short s2=-21072;
        float[] fArr1 =new float[N];

        FuzzerUtils.init(fArr1, 25.527F);

        Test0351.instanceCount -= (((++i3) + iMeth(i3)) - -48508);
        if (b1) {
            for (i16 = 6; i16 < 153; i16 += 2) {
                i18 *= i17;
                if (b1) {
                    if (i18 != 0) {
                        vMeth_check_sum += Float.floatToIntBits(f) + i3 + i16 + i17 + i18 + (b1 ? 1 : 0) + i19 + i20 +
                            i21 + i22 + s2 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
                        return;
                    }
                    b1 = b1;
                } else if (b1) {
                    for (i19 = 1; i19 < 21; ++i19) {
                        for (i21 = 1; i21 < 2; i21++) {
                            i18 <<= Test0351.byFld;
                            Test0351.iFld += 2;
                            Test0351.instanceCount += (i21 * i21);
                            s2 += (short) Test0351.instanceCount;
                            Test0351.instanceCount += i21;
                            i17 -= (int) Test0351.instanceCount;
                        }
                    }
                } else {
                    Test0351.instanceCount = i3;
                }
            }
        } else if (b1) {
            f = Test0351.byFld;
            vMeth_check_sum += Float.floatToIntBits(f) + i3 + i16 + i17 + i18 + (b1 ? 1 : 0) + i19 + i20 + i21 + i22 +
                s2 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
            return;
        } else if (b1) {
            fArr1[(0 >>> 1) % N] -= -27862;
        } else {
            i17 >>= i22;
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i3 + i16 + i17 + i18 + (b1 ? 1 : 0) + i19 + i20 + i21 + i22 + s2 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public void mainTest(String[] strArr1) {

        int i=40735, i1=-46311, i2=0, i23=-10, i24=6, i25=54203, i26=193;
        short s3=19872;

        Test0351.sArrFld[(i >>> 1) % N] >>= (short) (++Test0351.instanceCount);
        for (i1 = 14; i1 < 257; ++i1) {
            i <<= (int) (Test0351.lArrFld[i1 - 1]++);
            i >>= (--i2);
        }
        vMeth(Test0351.fFld);
        i2 = -68;
        for (i23 = 373; i23 > 4; i23 -= 2) {
            s3 += (short)i24;
        }
        for (i25 = 4; i25 < 260; i25++) {
            i24 += i25;
            i += i2;
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i23 i24 s3 = " + i23 + "," + i24 + "," + s3);
        FuzzerUtils.out.println("i25 i26 = " + i25 + "," + i26);

        FuzzerUtils.out.println("Test0351.instanceCount Test0351.iFld Test0351.byFld = " + Test0351.instanceCount + "," + Test0351.iFld +
                "," + Test0351.byFld);
        FuzzerUtils.out.println("Test0351.fFld Test0351.sArrFld Test0351.lArrFld = " + Float.floatToIntBits(Test0351.fFld) + "," +
                FuzzerUtils.checkSum(Test0351.sArrFld) + "," + FuzzerUtils.checkSum(Test0351.lArrFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0351 _instance = new Test0351();
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  fMeth ->  fMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}