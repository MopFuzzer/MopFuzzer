// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:35 2023
public class Test0488 {

    public static final int N = 400;

    public static long instanceCount=-225L;
    public static short sFld=21837;
    public static volatile boolean[] bArrFld =new boolean[N];

    static {
        FuzzerUtils.init(Test0488.bArrFld, true);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(double d1, int i6, int i7) {

        int i8=-10;
        int i9=-2438;
        int i10=64808;
        int i11=64296;
        int i12=-4;
        int[] iArr =new int[N];
        float f3=-5.486F;
        boolean b=true;

        FuzzerUtils.init(iArr, -92);

        d1 *= i6;
        i8 = 336;
        while (--i8 > 0) {
            switch ((i8 % 10) + 76) {
            case 76:
                i6 -= (int) Test0488.instanceCount;
                i7 = (int) Test0488.instanceCount;
                i6 += 18894;
                f3 = i6;
                break;
            case 77:
                if (b) continue;
                f3 *= f3;
                for (i9 = 1; 5 > i9; ++i9) {
                    iArr[i9] %= (int)(i6 | 1);
                }
                Test0488.instanceCount &= i7;
                break;
            case 78:
                for (i11 = 1; i11 < 5; i11++) {
                    if (i6 != 0) {
                    }
                    Test0488.bArrFld[i11 - 1] = b;
                }
                break;
            case 79:
                i7 -= (int)d1;
                break;
            case 80:
                i7 *= i7;
                break;
            case 81:
                if (b) continue;
                break;
            case 82:
                i7 -= i9;
                break;
            case 83:
                i7 -= i9;
                break;
            case 84:
                Test0488.instanceCount = Test0488.instanceCount;
                break;
            case 85:
                iArr[i8] <<= i10;
                break;
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + i6 + i7 + i8 + Float.floatToIntBits(f3) + (b ? 1 : 0) + i9 + i10
            + i11 + i12 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1() {

        int i5=8;
        int i13=10;
        int i14=-23403;
        int[] iArr1 =new int[N];
        double d2=-45.12039;
        float f4=92.978F;
        short s=-22790;
        boolean b2=true;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -3118895943L);
        FuzzerUtils.init(iArr1, -5);

        switch (((((i5 + i5) >>> 1) % 2) * 5) + 125) {
        case 133:
            iMeth(d2, -3, i5);
            break;
        case 134:
            if (true) {
                for (f4 = 2; 262 > f4; f4++) {
                    float f5=-15.86F;
                    lArr[(int) (f4 - 1)] -= Test0488.instanceCount;
                    if (b2) {
                        f5 -= s;
                        i5 += -7753;
                        if (i5 != 0) {
                            vMeth1_check_sum += i5 + Double.doubleToLongBits(d2) + Float.floatToIntBits(f4) + i13 + s +
                                i14 + (b2 ? 1 : 0) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
                            return;
                        }
                        f5 += f4;
                    } else if (b2) {
                        i14 = 1;
                        do {
                            boolean b1=false;
                            i5 <<= i14;
                            if (b1) continue;
                        } while (++i14 < 6);
                        i5 = i5;
                    } else if (b2) {
                        iArr1[(int)(f4)] = i14;
                    } else {
                        Test0488.instanceCount -= (long) d2;
                    }
                }
            } else if (b2) {
                i5 = (int) Test0488.instanceCount;
            } else {
                i5 = (int)d2;
            }
            break;
        }
        vMeth1_check_sum += i5 + Double.doubleToLongBits(d2) + Float.floatToIntBits(f4) + i13 + s + i14 + (b2 ? 1 : 0)
            + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(float f1, int i2, int i3) {

        int i4=8615;
        int i16=59903;
        int i17=-11;
        int i18=2;
        int[][] iArr2 =new int[N][N];
        int[] iArr3 =new int[N];
        float f2=0.1019F;

        FuzzerUtils.init(iArr2, -54413);
        FuzzerUtils.init(iArr3, 5);

        i4 = 1;
        while (++i4 < 249) {
            f2 = 133;
            i3 += (-14 + (i4 * i4));
            vMeth1();
            i3 -= Test0488.sFld;
        }
        iArr2[(i4 >>> 1) % N][(i3 >>> 1) % N] = i2;
        i3 = (int) Test0488.instanceCount;
        for (int i15 : iArr3) {
            i16 = 1;
            while (++i16 < 4) {
                for (i17 = 1; i17 > 1; --i17) {
                    i2 = (int)-60.114148;
                    f2 = i3;
                    if (i15 != 0) {
                        vMeth_check_sum += Float.floatToIntBits(f1) + i2 + i3 + i4 + Float.floatToIntBits(f2) + i16 +
                            i17 + i18 + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(iArr3);
                        return;
                    }
                }
                if (i17 != 0) {
                    vMeth_check_sum += Float.floatToIntBits(f1) + i2 + i3 + i4 + Float.floatToIntBits(f2) + i16 + i17 +
                        i18 + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(iArr3);
                    return;
                }
                i15 += i3;
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f1) + i2 + i3 + i4 + Float.floatToIntBits(f2) + i16 + i17 + i18 +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(iArr3);
    }

    public void mainTest(String[] strArr1) {

        int i=12;
        int i1=0;
        int i19=12654;
        int i20=-7;
        int i21=23224;
        int i22=46;
        int i23=10;
        int[] iArr4 =new int[N];
        double d=0.11094;
        double[] dArr =new double[N];
        float f=-2.126F;
        float[] fArr =new float[N];
        boolean b3=false;
        byte by=88;

        FuzzerUtils.init(fArr, -90.818F);
        FuzzerUtils.init(iArr4, 64054);
        FuzzerUtils.init(dArr, 0.81405);

        for (i = 4; 165 > i; i++) {
            i1 ^= i1;
            d -= fArr[i];
            f = fArr[i + 1];
        }
        vMeth(f, -12, 185);
        for (i19 = 323; 19 < i19; i19--) {
            i1 = i19;
            i1 += (i19 | i20);
            switch ((i19 % 8) + 35) {
            case 35:
                Test0488.instanceCount -= i1;
                i20 -= 180;
                Test0488.instanceCount -= i;
            case 36:
                i1 += (i19 * i19);
                i1 >>= Test0488.sFld;
                i1 += (-190 + (i19 * i19));
                break;
            case 37:
                i21 = 1;
                while (++i21 < 83) {
                    if (b3) {
                        for (i22 = 1; i22 < 1; i22++) {
                            i23 += (((i22 * Test0488.instanceCount) + i23) - i20);
                            Test0488.instanceCount >>= i;
                            i20 >>>= i23;
                            Test0488.bArrFld[i19 - 1] = b3;
                            i20 = (int)d;
                            i1 = i22;
                            i1 >>>= (int) Test0488.instanceCount;
                            f = -12;
                            switch (((i22 % 2) * 5) + 7) {
                            case 17:
                                i1 *= i1;
                            case 9:
                                Test0488.instanceCount = i22;
                                iArr4[i22] -= (int) Test0488.instanceCount;
                                break;
                            }
                        }
                    } else {
                        dArr[i21] -= i1;
                    }
                }
            case 38:
                i1 -= by;
                break;
            case 39:
                fArr = FuzzerUtils.float1array(N, (float)-115.49F);
                break;
            case 40:
                Test0488.instanceCount += (long) 2.56193;
                break;
            case 41:
                i1 = i20;
                break;
            case 42:
                i23 += i19;
            }
        }

        FuzzerUtils.out.println("i i1 d = " + i + "," + i1 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("f i19 i20 = " + Float.floatToIntBits(f) + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("b3 by fArr = " + (b3 ? 1 : 0) + "," + by + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("iArr4 dArr = " + FuzzerUtils.checkSum(iArr4) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0488.instanceCount Test0488.sFld Test0488.bArrFld = " + Test0488.instanceCount + "," + Test0488.sFld +
                "," + FuzzerUtils.checkSum(Test0488.bArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0488 _instance = new Test0488();
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
