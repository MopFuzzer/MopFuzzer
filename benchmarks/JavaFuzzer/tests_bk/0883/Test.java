// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:15 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-69L;
    public static short sFld=9551;
    public static float fFld=-1.645F;
    public static long lArrFld[]=new long[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 9L);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i10) {

        int i11=-556, i12=-5, i13=20457, i14=51014, i15=-87, i16=9, iArr2[]=new int[N], iArr3[][]=new int[N][N];
        byte by=110;
        boolean b1=false;

        FuzzerUtils.init(iArr2, -1);
        FuzzerUtils.init(iArr3, 229);

        for (i11 = 6; i11 < 327; i11++) {
            i10 *= i11;
            i10 = i11;
            for (i13 = 1; i13 < 5; ++i13) {
                for (i15 = 1; 2 > i15; ++i15) {
                    i10 >>= (int)Test.instanceCount;
                    if (false) {
                        Test.instanceCount *= i11;
                        i16 += (168 + (i15 * i15));
                    } else if (b1) {
                        iArr2[i13 + 1] <<= i10;
                        i10 += (((i15 * i16) + Test.sFld) - i16);
                        Test.lArrFld[i11 - 1] = i11;
                    } else if (b1) {
                        try {
                            iArr2[i13] = (1752361452 % i12);
                            i10 = (133 / i14);
                            i12 = (-59410 / i16);
                        } catch (ArithmeticException a_e) {}
                        by = (byte)i12;
                        iArr3 = iArr3;
                    } else {
                        b1 = b1;
                    }
                }
            }
        }
        vMeth2_check_sum += i10 + i11 + i12 + i13 + i14 + i15 + i16 + by + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr2) +
            FuzzerUtils.checkSum(iArr3);
    }

    public static void vMeth1(long l1) {

        int i17=9, i18=-61470, i19=-15963, i20=81, i21=72, i22=60712, i23=47211, iArr4[]=new int[N];
        double d1=0.91179, dArr[]=new double[N];
        long l2=-8599916559837103935L;
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, 48.647F);
        FuzzerUtils.init(dArr, -41.127978);
        FuzzerUtils.init(iArr4, -3);

        vMeth2(28);
        fArr1[(i17 >>> 1) % N] = i17;
        i17 *= 12538;
        for (i18 = 3; i18 < 139; ++i18) {
            for (i20 = i18; 12 > i20; i20++) {
                i17 <<= i17;
            }
            for (i22 = 1; i22 < 12; i22++) {
                d1 = 1;
                while (++d1 < 2) {
                    float f1=7.444F;
                    switch (((i18 % 7) * 5) + 2) {
                    case 9:
                        if (i22 != 0) {
                            vMeth1_check_sum += l1 + i17 + i18 + i19 + i20 + i21 + i22 + i23 +
                                Double.doubleToLongBits(d1) + l2 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1))
                                + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr4);
                            return;
                        }
                        i21 >>= i17;
                        f1 += (float)(((d1 * l1) + Test.sFld) - i21);
                        fArr1 = fArr1;
                        break;
                    case 7:
                        dArr[(i21 >>> 1) % N] = i22;
                    case 35:
                        i23 |= i20;
                    case 13:
                        iArr4[(int)(d1 - 1)] = 216;
                        break;
                    case 33:
                        i19 = i21;
                        break;
                    case 12:
                        l2 &= i21;
                        break;
                    case 22:
                        i23 >>= Test.sFld;
                        break;
                    default:
                        i21 *= (int)f1;
                    }
                }
            }
        }
        vMeth1_check_sum += l1 + i17 + i18 + i19 + i20 + i21 + i22 + i23 + Double.doubleToLongBits(d1) + l2 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr))
            + FuzzerUtils.checkSum(iArr4);
    }

    public void vMeth(long l, int i4, int i5) {

        float f=-2.878F;
        int i6=10, i7=-3, i8=121, i9=48512, i24=14107, i25=-5, iArr1[]=new int[N];
        boolean b2=false;

        FuzzerUtils.init(iArr1, 39517);

        iArr1[(i4 >>> 1) % N] /= (int)((i4 % ((++Test.instanceCount) | 1)) | 1);
        Test.sFld -= (short)(Short.reverseBytes((short)(i4 + Test.instanceCount)) /
            (Long.reverseBytes(Test.instanceCount + 236) | 1));
        i4 = (int)(-98 - f);
        for (i6 = 1; i6 < 223; i6++) {
            for (i8 = 1; i8 < 7; ++i8) {
                vMeth1(4L);
                f *= -2293;
                i5 = (int)f;
                i7 += i8;
                i4 += (int)f;
                Test.lArrFld[i8 + 1] = l;
                i5 -= (int)l;
                for (i24 = 1; i24 < 2; ++i24) {
                    i9 += i5;
                    b2 = b2;
                }
            }
        }
        vMeth_check_sum += l + i4 + i5 + Float.floatToIntBits(f) + i6 + i7 + i8 + i9 + i24 + i25 + (b2 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=-250, i1=-59463, i2=13130, i3=2, i26=-48328, i27=8, i28=-18112, i29=-54586, i30=-1, i31=-53, i32=0,
            iArr[]=new int[N];
        boolean b=false;
        double d2=2.95698;
        byte by1=-65;
        float fArr[]=new float[N];
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(iArr, -21195);
        FuzzerUtils.init(fArr, 39.745F);
        FuzzerUtils.init(lArr, 15284L);

        for (i = 388; i > 18; --i) {
            i1 += i;
            for (i2 = 1; i2 < 68; ++i2) {
                double d=-111.127545;
                i1 = (int)((iArr[i - 1] + (5 * (iArr[i + 1]++))) - ((i + 23620) - (Test.instanceCount + i3)));
                fArr[i2 + 1] = Math.abs(13494);
                b = ((lArr[i2 - 1][i] - (--i1)) > (--d));
                vMeth(27134L, i, -119);
                i3 -= Test.sFld;
                for (i26 = 2; 1 < i26; i26--) {
                    try {
                        iArr[i26] = (i27 % i);
                        i3 = (iArr[i - 1] / -3834);
                        i27 = (i2 % i3);
                    } catch (ArithmeticException a_e) {}
                    i3 += i26;
                    Test.bArrFld[i2 + 1] = false;
                    Test.fFld += (-1.758F + (i26 * i26));
                    b = b;
                    d -= i3;
                }
                if (b) break;
                Test.fFld = (float)d;
                for (i28 = 1; i28 < 2; i28++) {
                    i29 += i3;
                    i1 = (int)Test.instanceCount;
                }
            }
            Test.sFld = (short)i26;
            i1 += i29;
            fArr[i] *= i26;
            for (i30 = i; 68 > i30; i30++) {
                Test.instanceCount += i30;
                Test.instanceCount += (-13 + (i30 * i30));
                i31 += i30;
                for (d2 = 1; 1 > d2; ++d2) {
                    lArr[i30 - 1][i30 + 1] *= by1;
                    if (b) continue;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 b i26 = " + i3 + "," + (b ? 1 : 0) + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 i31 d2 = " + i30 + "," + i31 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i32 by1 iArr = " + i32 + "," + by1 + "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("fArr lArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + "," +
            FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.fFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.lArrFld Test.bArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," +
            FuzzerUtils.checkSum(Test.bArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
