// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:16 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-208L;
    public static double dFld=-2.98289;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 13);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i5=-14492, i6=6, i7=-49, i8=155, i9=2, i10=195, iArr2[]=new int[N];
        short s1=16523;
        boolean b=true;

        FuzzerUtils.init(iArr2, 42463);

        for (i5 = 10; i5 < 174; i5++) {
            for (i7 = 1; i7 < 10; ++i7) {
                Test.dFld = 138;
                for (i9 = 1; i9 < 2; i9++) {
                    i6 = (int)Test.instanceCount;
                    if (b) {
                        iArr2[i7] = i7;
                        i6 += i9;
                        Test.instanceCount += i9;
                        Test.instanceCount = s1;
                    } else if (false) {
                        iArr2[i7] = (int)8L;
                        i10 *= i8;
                        i6 += (i9 * i9);
                        i6 &= (int)Test.instanceCount;
                    } else if (b) {
                        i6 = i5;
                    } else {
                        if (i5 != 0) {
                            vMeth_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + s1 + (b ? 1 : 0) +
                                FuzzerUtils.checkSum(iArr2);
                            return;
                        }
                    }
                }
            }
        }
        vMeth_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + s1 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr2);
    }

    public static int iMeth1(long l2) {

        int i3=3, i4=4, i11=60608, i12=-59386, i13=11, i14=146, iArr1[]=new int[N];
        float f2=0.974F;
        short s=-30961, sArr[]=new short[N];
        long l3=24709L, lArr1[]=new long[N];
        double dArr[][]=new double[N][N];

        FuzzerUtils.init(dArr, 109.129988);
        FuzzerUtils.init(iArr1, -54);
        FuzzerUtils.init(lArr1, 243L);
        FuzzerUtils.init(sArr, (short)-9820);

        for (i3 = 373; 14 < i3; i3--) {
            i4 += i3;
            switch ((i3 % 8) + 35) {
            case 35:
                f2 = l2;
                dArr[i3][i3] -= ((Math.max(Test.instanceCount, Test.instanceCount) >> (iArr1[i3] = i4)) + (lArr1[i3 -
                    1] + (++s)));
                vMeth();
                sArr[i3 + 1] += (short)f2;
            case 36:
                iArr1[i3 + 1] = i4;
                f2 += i3;
                break;
            case 37:
                for (i11 = 1; i11 < 5; ++i11) {
                    switch (((i11 % 7) * 5) + 81) {
                    case 98:
                        for (i13 = i11; i13 < 2; ++i13) {
                            i14 += i13;
                            l3 += -8;
                            dArr[i13 - 1][i3] -= i13;
                        }
                    case 109:
                        i12 += i12;
                    case 97:
                        i12 *= (int)Test.instanceCount;
                        break;
                    case 99:
                        l3 = (long)Test.dFld;
                        break;
                    case 106:
                        iArr1 = iArr1;
                        break;
                    case 94:
                    case 86:
                        if (i14 != 0) {
                        }
                        break;
                    default:
                        i12 += i11;
                    }
                }
                break;
            case 38:
                iArr1[i3] >>= -40332;
                break;
            case 39:
                iArr1[i3 + 1] *= -18652;
                break;
            case 40:
                l3 *= (long)Test.dFld;
                break;
            case 41:
                Test.instanceCount = -7L;
                break;
            case 42:
                iArr1 = iArr1;
            }
        }
        long meth_res = l2 + i3 + i4 + Float.floatToIntBits(f2) + s + i11 + i12 + i13 + i14 + l3 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(sArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l, long l1, int i1) {

        int i2=14, i15=173, i16=19721, i17=-228, iArr[]=new int[N];
        float f1=2.876F;
        byte by=100;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -10);
        FuzzerUtils.init(lArr, 2312752019L);

        iArr[(i1 >>> 1) % N] = Math.max((int)((lArr[(i1 >>> 1) % N]++) + i1), iArr[(i1 >>> 1) % N]);
        i2 = 1;
        while (++i2 < 286) {
            i1 = i1;
            f1 = iMeth1(l);
            lArr[(i2 >>> 1) % N] = i2;
            i1 += (((i2 * l1) + i2) - i1);
            for (i15 = i2; i15 < 6; i15++) {
                f1 *= i16;
                iArr[i2] = i16;
                switch ((i15 % 1) + 36) {
                case 36:
                    by += (byte)(i15 * i1);
                    i17 = 1;
                    while (++i17 < 1) {
                        i16 *= i15;
                        l = (long)1.888F;
                        f1 -= i16;
                    }
                    break;
                default:
                    i16 &= -1;
                }
            }
        }
        long meth_res = l + l1 + i1 + i2 + Float.floatToIntBits(f1) + i15 + i16 + by + i17 + FuzzerUtils.checkSum(iArr)
            + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=12, i18=-4, i19=-13, i20=45129, i21=58, i22=14, i23=8292;
        float f=78.129F, fArr[]=new float[N];
        boolean b1=true;
        double d=12.130821;
        short s2=9028;
        byte by1=55;
        long lArr2[][]=new long[N][N];

        FuzzerUtils.init(lArr2, 123L);
        FuzzerUtils.init(fArr, 2.898F);

        i = 1;
        do {
            f -= (-(iMeth(Test.instanceCount, Test.instanceCount, i) - i));
            for (i18 = 5; i18 < 85; i18++) {
                lArr2[i + 1][i18 + 1] *= -1;
                i19 *= (int)Test.dFld;
                Test.instanceCount >>= i19;
                Test.instanceCount += (i18 * i19);
                switch (((i18 % 4) * 5) + 4) {
                case 11:
                    lArr2 = lArr2;
                    i19 = i18;
                    f = Test.instanceCount;
                    switch (((i % 5) * 5) + 73) {
                    case 83:
                        lArr2[i18 - 1] = lArr2[i18 + 1];
                        if (b1) continue;
                        for (d = i18; 2 > d; d++) {
                            f += (float)(((d * i20) + f) - i19);
                            i20 >>= (int)Test.instanceCount;
                            Test.instanceCount += i;
                            Test.iArrFld[i18] = i19;
                            i21 = (int)Test.instanceCount;
                        }
                        i20 >>= i19;
                        break;
                    case 89:
                        s2 += (short)i18;
                        switch (((i18 % 10) * 5) + 82) {
                        case 85:
                            Test.instanceCount += (((i18 * i20) + i21) - i18);
                            break;
                        case 103:
                        case 125:
                            i21 = (int)f;
                            for (i22 = i18; i22 < 2; i22++) {
                                by1 = (byte)d;
                                Test.instanceCount = 4088;
                            }
                        case 107:
                            i21 = (int)Test.instanceCount;
                            break;
                        case 123:
                            i23 += (int)(678566175L + (i18 * i18));
                            break;
                        case 129:
                            f = (float)d;
                            break;
                        case 121:
                            Test.instanceCount >>>= Test.instanceCount;
                        case 89:
                            Test.instanceCount += i18;
                            break;
                        case 118:
                            Test.dFld -= Test.instanceCount;
                            break;
                        case 112:
                            i20 <<= i19;
                        default:
                            Test.iArrFld = Test.iArrFld;
                        }
                        break;
                    case 91:
                        i19 += (((i18 * i23) + Test.instanceCount) - i20);
                        break;
                    case 74:
                        f = s2;
                        break;
                    case 90:
                        Test.instanceCount = 14;
                        break;
                    default:
                        i23 -= i20;
                    }
                case 9:
                    fArr = FuzzerUtils.float1array(N, (float)10.420F);
                    break;
                case 12:
                    i23 *= i;
                case 24:
                    s2 = (short)-2686778543L;
                }
            }
        } while (++i < 296);

        FuzzerUtils.out.println("i f i18 = " + i + "," + Float.floatToIntBits(f) + "," + i18);
        FuzzerUtils.out.println("i19 b1 d = " + i19 + "," + (b1 ? 1 : 0) + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i20 i21 s2 = " + i20 + "," + i21 + "," + s2);
        FuzzerUtils.out.println("i22 i23 by1 = " + i22 + "," + i23 + "," + by1);
        FuzzerUtils.out.println("lArr2 fArr = " + FuzzerUtils.checkSum(lArr2) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.iArrFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}