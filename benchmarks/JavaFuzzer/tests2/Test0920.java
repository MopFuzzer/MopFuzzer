// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:55 2023
public class Test0920 {

    public static final int N = 400;

    public static long instanceCount=3132902266L;
    public static double dFld=26.34213;
    public static long lFld=-2005763367L;
    public volatile int iFld=42;
    public static boolean bFld=true;
    public boolean bFld1=true;
    public static byte byFld=-5;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0920.iArrFld, -10253);
    }

    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i8, boolean b) {

        float f1=2.675F;
        long l2=3334738766431697485L;
        long[] lArr =new long[N];
        byte by=10;
        int i10=22834, i11=-60390;

        FuzzerUtils.init(lArr, 14L);

        i8 = i8;
        Test0920.dFld = 3;
        f1 = i8;
        for (int i9 : Test0920.iArrFld) {
            l2 = 1;
            do {
                Test0920.iArrFld[(int) (l2 + 1)] = (int) l2;
                i9 &= i9;
                lArr = lArr;
                Test0920.instanceCount += (((l2 * i8) + by) - Test0920.instanceCount);
                Test0920.lFld = (long) f1;
                try {
                    i8 = (Test0920.iArrFld[(int) (l2)] % Test0920.iArrFld[(int) (l2)]);
                    i9 = (Test0920.iArrFld[(int) (l2)] / 658020166);
                    i8 = (-13284 % i8);
                } catch (ArithmeticException a_e) {}
                i8 -= i8;
            } while (++l2 < 4);
        }
        for (i10 = 7; i10 < 154; ++i10) {
            i11 += (i10 | i10);
            i8 = i11;
        }
        vMeth1_check_sum += i8 + (b ? 1 : 0) + Float.floatToIntBits(f1) + l2 + by + i10 + i11 +
            FuzzerUtils.checkSum(lArr);
    }

    public static short sMeth(int i7, long l, long l1) {

        boolean b1=true;
        boolean b2=false;
        boolean[] bArr =new boolean[N];
        int i12=-57, i13=11, i14=5, i15=-61, i16=162;
        short s=29040;
        short[] sArr =new short[N];
        byte by1=107;

        FuzzerUtils.init(sArr, (short)13259);
        FuzzerUtils.init(bArr, false);

        vMeth1(i7, b1);
        i12 = 1;
        while (++i12 < 284) {
            i7 += i12;
            for (i13 = i12; 6 > i13; ++i13) {
                float f3=107.765F;
                switch ((((-173 >>> 1) % 2) * 5) + 91) {
                case 101:
                    Test0920.lFld += i12;
                    b1 = b2;
                    break;
                case 100:
                    switch (((i7 >>> 1) % 1) + 120) {
                    case 120:
                        sArr[i13] = (short)i7;
                        for (i15 = 1; i15 < 1; i15++) {
                            float f2=-46.274F;
                            f2 /= (i12 | 1);
                            bArr[i15 - 1] = b2;
                            i16 = (int)f2;
                            i7 >>>= (int)l;
                            f2 += s;
                        }
                        break;
                    default:
                        by1 += (byte)(i13 + f3);
                    }
                }
            }
        }
        long meth_res = i7 + l + l1 + (b1 ? 1 : 0) + i12 + i13 + i14 + (b2 ? 1 : 0) + i15 + i16 + s + by1 +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(bArr);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth() {

        double d=-37.90006;
        int i2=-9203, i3=-142, i4=38892, i5=-13, i6=-44038, i17=-41839, i18=0, i19=14, i20=14967;
        float f=81.566F;
        long l3=32347L;

        d *= (((-220 * (i2 * i2)) + (Test0920.instanceCount - Test0920.instanceCount)) + i2);
        for (i3 = 2; 125 > i3; i3++) {
            for (i5 = i3; i5 < 13; ++i5) {
                if ((f != (Test0920.instanceCount--)) && (Math.abs(3 - (--i4)) >= sMeth(i6, Test0920.instanceCount,
                        Test0920.lFld))) continue;
            }
            switch (((-14 >>> 1) % 10) + 51) {
            case 51:
                i6 = (int)d;
                break;
            case 52:
                f %= -93L;
                for (i17 = 1; i17 < 13; i17++) {
                    i6 *= (int)f;
                    Test0920.instanceCount = l3;
                    for (i19 = 1; i19 < 2; i19++) {
                        Test0920.iArrFld = Test0920.iArrFld;
                        i6 += i4;
                        i20 = i2;
                        Test0920.instanceCount >>= i19;
                    }
                }
            case 53:
                Test0920.instanceCount = i17;
                break;
            case 54:
                f += (((i3 * i17) + i20) - l3);
            case 55:
                Test0920.lFld += (-17164 + (i3 * i3));
                break;
            case 56:
                f += i3;
            case 57:
                Test0920.dFld *= i2;
            case 58:
                i20 >>>= -5;
                break;
            case 59:
                f %= (i3 | 1);
                break;
            case 60:
                if (i6 != 0) {
                    vMeth_check_sum += Double.doubleToLongBits(d) + i2 + i3 + i4 + i5 + i6 + Float.floatToIntBits(f) +
                        i17 + i18 + l3 + i19 + i20;
                    return;
                }
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i2 + i3 + i4 + i5 + i6 + Float.floatToIntBits(f) + i17 + i18 +
            l3 + i19 + i20;
    }

    public void mainTest(String[] strArr1) {

        int i=12, i1=3766, i21=-11, i22=-9, i23=-146, i24=-51893, i25=91;
        float f4=88.493F;
        float[] fArr =new float[N];
        long[] lArr1 =new long[N];
        boolean[] bArr1 =new boolean[N];
        double[] dArr =new double[N];

        FuzzerUtils.init(lArr1, 184L);
        FuzzerUtils.init(fArr, -33.614F);
        FuzzerUtils.init(bArr1, true);
        FuzzerUtils.init(dArr, 2.48395);

        for (i = 376; i > 12; --i) {
            vMeth();
            i1 *= (int) Test0920.instanceCount;
        }
        Test0920.iArrFld[(i1 >>> 1) % N] *= (int) f4;
        for (i21 = 1; 362 > i21; i21 += 2) {
            i23 = 1;
            while (++i23 < 139) {
                i24 = 1;
                do {
                    switch ((i23 % 2) + 96) {
                    case 96:
                        Test0920.instanceCount += (((i24 * i) + i) - Test0920.lFld);
                        Test0920.instanceCount += i1;
                        break;
                    case 97:
                        lArr1[i24 - 1] = i24;
                    default:
                        i1 -= i24;
                        i22 <<= 253;
                    }
                    if (bFld1) {
                        iFld = i22;
                        if (Test0920.bFld) break;
                    }
                    iFld = Test0920.byFld;
                    i1 = Test0920.byFld;
                    fArr[i23 - 1] += f4;
                    Test0920.lFld += (3 + (i24 * i24));
                    lArr1[i24] = i21;
                } while (++i24 < 1);
                if (Test0920.bFld) {
                    i25 = 1;
                    bArr1[i21] = true;
                    i1 %= (int)(i23 | 1);
                    dArr[i21 + 1] *= i1;
                }
                Test0920.dFld -= Test0920.byFld;
            }
            i22 += i25;
            if (Test0920.bFld) break;
            Test0920.instanceCount -= (long) Test0920.dFld;
        }

        FuzzerUtils.out.println("i i1 f4 = " + i + "," + i1 + "," + Float.floatToIntBits(f4));
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 lArr1 = " + i24 + "," + i25 + "," + FuzzerUtils.checkSum(lArr1));
        FuzzerUtils.out.println("fArr bArr1 dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + "," +
            FuzzerUtils.checkSum(bArr1) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0920.instanceCount Test0920.dFld Test0920.lFld = " + Test0920.instanceCount + "," +
                Double.doubleToLongBits(Test0920.dFld) + "," + Test0920.lFld);
        FuzzerUtils.out.println("iFld Test0920.bFld bFld1 = " + iFld + "," + (Test0920.bFld ? 1 : 0) + "," + (bFld1 ? 1 : 0));
        FuzzerUtils.out.println("Test0920.byFld Test0920.iArrFld = " + Test0920.byFld + "," + FuzzerUtils.checkSum(Test0920.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0920 _instance = new Test0920();
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
//DEBUG  sMeth ->  sMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 sMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
