// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:05 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2195L;
    public static long lFld=1371203397L;
    public static volatile boolean bFld=false;
    public static float fFld=-1.983F;
    public static float fFld1=-2.490F;
    public static byte byFld=-83;
    public short sFld=27114;
    public byte byArrFld[]=new byte[N];

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i9=24658, i10=11, i11=0, i12=-46679, i13=196, i14=-60945, i15=-57425, i16=23366, iArr[]=new int[N];
        float f=1.980F;
        double d=24.28555;
        short s=-15926;
        byte by1=-60;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(iArr, 150);

        i9 -= i9;
        i10 = 1;
        while (++i10 < 293) {
            Test.instanceCount += i10;
            i9 = (int)f;
            d += d;
        }
        for (i11 = 7; i11 < 152; i11++) {
            i9 += (i11 ^ i12);
            for (i13 = 1; i13 < 11; ++i13) {
                i15 = 1;
                while (++i15 < 2) {
                    s ^= (short)i10;
                    bArr[i11 + 1] = Test.bFld;
                }
                i12 -= (int)Test.lFld;
                i16 = 1;
                do {
                    iArr[i13] *= by1;
                    f += (i16 - i9);
                } while (++i16 < 2);
            }
        }
        vMeth1_check_sum += i9 + i10 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i11 + i12 + i13 + i14 +
            i15 + s + i16 + by1 + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(boolean b, int i7, int i8) {

        short s1=1427;
        int i17=1, i18=-145, i19=9, iArr1[][]=new int[N][N];
        float f1=0.947F;
        byte by2=-87;

        FuzzerUtils.init(iArr1, -3);

        vMeth1();
        Test.lFld ^= s1;
        i17 = 1;
        do {
            for (i18 = 1; i18 < 12; i18++) {
                switch ((((i17 >>> 1) % 8) * 5) + 103) {
                case 107:
                    f1 += (float)7.114117;
                    s1 += (short)f1;
                    iArr1[i18 + 1][i18 + 1] /= -6;
                    break;
                case 130:
                    i19 *= i18;
                    Test.instanceCount = 28088;
                    if (b) continue;
                    i19 += (((i18 * i7) + f1) - f1);
                    break;
                case 118:
                    i7 = s1;
                    i19 += (int)-3117425761719911064L;
                    i8 |= i7;
                    break;
                case 120:
                case 121:
                    Test.lFld -= i17;
                case 122:
                    if (i8 != 0) {
                    }
                    break;
                case 132:
                    i8 >>= -10;
                    break;
                case 123:
                    by2 -= (byte)-103.958F;
                    break;
                }
            }
        } while (++i17 < 134);
        long meth_res = (b ? 1 : 0) + i7 + i8 + s1 + i17 + i18 + i19 + Float.floatToIntBits(f1) + by2 +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i1=2, i2=11, i3=139, i4=3549, i5=-17155, i6=1;
        byte by=45;
        short s2=-9419, sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)7064);

        for (i1 = 1; i1 < 354; ++i1) {
            switch ((i1 % 1) + 32) {
            case 32:
                for (i3 = i1; i3 < 5; i3++) {
                    for (i5 = 1; i5 < 1; ++i5) {
                        Test.lFld += ((--i6) - Test.instanceCount);
                        i2 >>>= (int)(((Test.lFld - i5) - (++i6)) * ((++by) << iMeth(true, 145, i5)));
                        i2 = s2;
                        i2 |= i2;
                        Test.lFld = i5;
                        Test.instanceCount += (i5 | i3);
                        i2 += i5;
                        switch (((i5 % 6) * 5) + 16) {
                        case 23:
                            if (Test.bFld) {
                                i6 += (((i5 * i5) + i4) - i5);
                                s2 += (short)i5;
                            } else if (Test.bFld) {
                                i6 = i5;
                                vMeth_check_sum += i1 + i2 + i3 + i4 + i5 + i6 + by + s2 + FuzzerUtils.checkSum(sArr);
                                return;
                            } else {
                                i4 *= i5;
                            }
                            break;
                        case 22:
                            s2 += (short)i4;
                            break;
                        case 36:
                            i4 += i5;
                            break;
                        case 35:
                            sArr[i5 - 1] *= (short)i5;
                            break;
                        case 39:
                        case 30:
                            by &= (byte)i3;
                        }
                    }
                }
            }
        }
        vMeth_check_sum += i1 + i2 + i3 + i4 + i5 + i6 + by + s2 + FuzzerUtils.checkSum(sArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-7, i20=181, i21=10, i22=-1957, i23=-127, i24=-12, i25=40, i26=232, i27=14905, i28=-4517, iArr2[]=new
            int[N];
        double d1=-2.27819, dArr[]=new double[N];
        short sArr1[]=new short[N];
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(iArr2, 0);
        FuzzerUtils.init(sArr1, (short)5768);
        FuzzerUtils.init(dArr, 1.106998);
        FuzzerUtils.init(fArr, 109.902F);

        i = (--i);
        vMeth();
        switch ((((i >>> 1) % 10) * 5) + 19) {
        case 30:
            iArr2[(i >>> 1) % N] >>= (int)Test.instanceCount;
        case 34:
            i20 = 1;
            while (++i20 < 256) {
                float f2=2.1018F;
                f2 = -9178;
            }
            iArr2[(i >>> 1) % N] = i20;
            break;
        case 52:
            for (i21 = 9; i21 < 366; ++i21) {
                Test.fFld -= 1.356F;
                Test.fFld -= i;
                i += (int)Test.lFld;
                i += i;
                i22 = i21;
                d1 = 14L;
                Test.lFld = i20;
            }
            switch (((i20 >>> 1) % 2) + 112) {
            case 112:
                i = i21;
                i22 += i22;
                if (Test.bFld) {
                    Test.fFld1 = i21;
                } else if (Test.bFld) {
                    for (i23 = 179; i23 > 10; --i23) {
                        for (i25 = 148; i25 > i23; i25--) {
                            if (Test.bFld) {
                                for (i27 = 1; i27 < 1; ++i27) {
                                    i22 = i20;
                                    iArr2[i25] -= (int)Test.fFld;
                                    switch (((i22 >>> 1) % 8) + 109) {
                                    case 109:
                                        if (Test.bFld) continue;
                                        Test.bFld = Test.bFld;
                                        i26 &= 15731;
                                    case 110:
                                        Test.instanceCount >>= Test.lFld;
                                        break;
                                    case 111:
                                        i <<= (int)Test.instanceCount;
                                    case 112:
                                        i26 += (int)d1;
                                        break;
                                    case 113:
                                        i28 += i24;
                                        break;
                                    case 114:
                                        i26 >>>= i28;
                                        break;
                                    case 115:
                                        d1 += i21;
                                    case 116:
                                        i22 <<= Test.byFld;
                                        break;
                                    default:
                                        sArr1[i27] = (short)i25;
                                    }
                                }
                            } else if (Test.bFld) {
                                i26 += i25;
                            } else {
                                i += (i25 + i26);
                            }
                        }
                    }
                }
                break;
            case 113:
                Test.bFld = Test.bFld;
            }
            break;
        case 55:
            i22 = i20;
            break;
        case 43:
            i >>= i20;
            break;
        case 62:
            i24 *= i27;
            break;
        case 28:
            Test.bFld = Test.bFld;
            break;
        case 33:
            fArr[(i26 >>> 1) % N][(i27 >>> 1) % N] -= i27;
            break;
        case 56:
            Test.lFld = sFld;
        case 41:
            Test.fFld += 236L;
            break;
        }

        FuzzerUtils.out.println("i i20 i21 = " + i + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 d1 i23 = " + i22 + "," + Double.doubleToLongBits(d1) + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 iArr2 = " + i27 + "," + i28 + "," + FuzzerUtils.checkSum(iArr2));
        FuzzerUtils.out.println("sArr1 dArr fArr = " + FuzzerUtils.checkSum(sArr1) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.lFld Test.bFld = " + Test.instanceCount + "," + Test.lFld +
            "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.fFld Test.fFld1 Test.byFld = " + Float.floatToIntBits(Test.fFld) + "," +
            Float.floatToIntBits(Test.fFld1) + "," + Test.byFld);
        FuzzerUtils.out.println("sFld byArrFld = " + sFld + "," + FuzzerUtils.checkSum(byArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}