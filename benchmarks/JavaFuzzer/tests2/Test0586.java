// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:39 2023
public class Test0586 {

    public static final int N = 400;

    public static long instanceCount=-7230691315782432858L;
    public float fFld=94.917F;
    public static volatile int iFld=12;
    public static long lFld=3271695266L;
    public static float fFld1=16.146F;
    public static boolean bFld=false;
    public double dFld=-75.88221;
    public short[] sArrFld =new short[N];

    public static long byMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l, int i8, float f) {

        byte by=-77;
        int i9=30250;
        int[] iArr1 =new int[N];
        long[] lArr1 =new long[N], lArr2 =new long[N];

        FuzzerUtils.init(lArr1, -4068596281L);
        FuzzerUtils.init(iArr1, 34);
        FuzzerUtils.init(lArr2, 5107039315105505377L);

        lArr1[(-9 >>> 1) % N] *= (long)f;
        by += (byte)f;
        i8 = i8;
        i9 = 1;
        while (++i9 < 127) {
            i8 <<= (int) Test0586.instanceCount;
            i8 >>= (int)l;
        }
        iArr1 = iArr1;
        iArr1[(i8 >>> 1) % N] *= (int)f;
        Test0586.iFld <<= i9;
        lArr2[(Test0586.iFld >>> 1) % N] -= 12;
        vMeth1_check_sum += l + i8 + Float.floatToIntBits(f) + by + i9 + FuzzerUtils.checkSum(lArr1) +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr2);
    }

    public static void vMeth(int i5) {

        int i6=18;
        int i7=10;
        int i11=-81;
        int i12=40;
        int i13=71;
        int[][] iArr2 =new int[N][N];
        short s1=-17928;
        double d1=82.125317;
        float f1=-100.497F;

        FuzzerUtils.init(iArr2, -22);

        i5 = (i5++);
        for (i6 = 6; i6 < 314; i6++) {
            int i10=3;
            s1 = (short) ((Test0586.instanceCount - (d1 * i5)) * (Test0586.instanceCount++));
            vMeth1(Test0586.instanceCount, i10, 1.265F);
            for (i11 = 1; i11 < 5; ++i11) {
                d1 /= (i7 | 1);
                i13 = 1;
                while (++i13 < 2) {
                    switch (((i11 % 9) * 5) + 10) {
                    case 16:
                        Test0586.instanceCount *= i6;
                        Test0586.iFld = i11;
                        Test0586.instanceCount += (((i13 * Test0586.lFld) + i11) - Test0586.instanceCount);
                        Test0586.instanceCount += i13;
                        break;
                    case 50:
                        i5 += (int)(-53664L + (i13 * i13));
                        break;
                    case 33:
                        i10 *= i7;
                        break;
                    case 44:
                        d1 = Test0586.instanceCount;
                        break;
                    case 37:
                        iArr2[i11 - 1][i11 + 1] += (int)f1;
                        break;
                    case 51:
                        i7 *= (int) Test0586.fFld1;
                        break;
                    case 47:
                        i10 += (((i13 * i6) + i6) - i10);
                        break;
                    case 31:
                        d1 += i7;
                        break;
                    case 19:
                        Test0586.fFld1 += (i13 * i13);
                        break;
                    default:
                        try {
                            i12 = (i5 / iArr2[i6][i13]);
                            i7 = (i6 % i11);
                            i5 = (i6 % 41686);
                        } catch (ArithmeticException a_e) {}
                    }
                }
            }
        }
        vMeth_check_sum += i5 + i6 + i7 + s1 + Double.doubleToLongBits(d1) + i11 + i12 + i13 + Float.floatToIntBits(f1)
            + FuzzerUtils.checkSum(iArr2);
    }

    public static byte byMeth(int i1, int i2) {

        int i3=120;
        int i4=-10;
        int i14=-2;
        int i15=28349;
        int i16=109;
        int[] iArr3 =new int[N];
        double d2=-2.87220;
        short s2=3915;
        long[] lArr3 =new long[N];

        FuzzerUtils.init(lArr3, -17072L);
        FuzzerUtils.init(iArr3, 182);

        i1 *= i2;
        for (i3 = 9; i3 < 355; i3++) {
            vMeth(i3);
            for (d2 = 1; d2 < 5; d2++) {
                for (i15 = 2; i15 > 1; i15--) {
                    lArr3[i3 + 1] = i15;
                    if (Test0586.bFld) break;
                    i4 >>>= (int) Test0586.lFld;
                    i16 += (int)(0.778F + (i15 * i15));
                    Test0586.fFld1 += (i15 - Test0586.iFld);
                }
                s2 = (short)-42362;
                i4 &= 3;
            }
            i16 /= (int)(i16 | 1);
            s2 += (short) (i3 - Test0586.iFld);
            iArr3[i3] = i2;
        }
        long meth_res = i1 + i2 + i3 + i4 + Double.doubleToLongBits(d2) + i14 + i15 + i16 + s2 +
            FuzzerUtils.checkSum(lArr3) + FuzzerUtils.checkSum(iArr3);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-5;
        int i17=-28;
        int i18=4;
        int i19=49109;
        int i20=-1;
        int i21=-13;
        int[] iArr =new int[N];
        short s=-13743;
        long[] lArr =new long[N];
        double[] dArr =new double[N];

        FuzzerUtils.init(iArr, -14);
        FuzzerUtils.init(lArr, 203L);
        FuzzerUtils.init(dArr, -123.45990);

        try {
            Test0586.instanceCount = ((Math.abs(-14) - Math.min(i, i)) + (-(Test0586.instanceCount--)));
            iArr[(i >>> 1) % N] /= (int)((7 >>> (++lArr[(i >>> 1) % N])) | 1);
            for (double d : dArr) {
                i <<= (iArr[(i >>> 1) % N] = i);
                Test0586.instanceCount = (s++);
                i += i;
                fFld /= (((long)(fFld + byMeth(i, 122))) | 1);
                Test0586.lFld = Test0586.iFld;
                d *= i;
                iArr = iArr;
                for (i17 = 3; i17 < 63; i17++) {
                    s /= (short)(i | 1);
                    Test0586.iFld = (int) -1502042956L;
                    i += (9 + (i17 * i17));
                    i19 = 2;
                    while (--i19 > 0) {
                        i += (int)(9L + (i19 * i19));
                        iArr[i17 + 1] <<= i;
                        Test0586.instanceCount += Test0586.instanceCount;
                        if (Test0586.bFld) continue;
                        sArrFld[i17] = (short) Test0586.lFld;
                        Test0586.lFld += i19;
                        try {
                            iArr[i19 + 1] = (iArr[i17 - 1] % i17);
                            iArr[(Test0586.iFld >>> 1) % N] = (i18 / i18);
                            i = (Test0586.iFld % 45);
                        } catch (ArithmeticException a_e) {}
                        i18 &= i18;
                    }
                    i18 += (2575 + (i17 * i17));
                }
                if (Test0586.bFld) {
                    if (Test0586.bFld) break;
                    for (i20 = 63; 3 < i20; --i20) {
                        iArr[i20 + 1] *= (int)-2066657145L;
                        i = i18;
                    }
                } else {
                    i18 -= i19;
                }
            }
        }
        catch (NegativeArraySizeException exc1) {
            iArr[(i21 >>> 1) % N] = i;
        }
        finally {
            dFld += Test0586.iFld;
        }

        FuzzerUtils.out.println("i s i17 = " + i + "," + s + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 iArr lArr = " + i21 + "," + FuzzerUtils.checkSum(iArr) + "," +
            FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0586.instanceCount fFld Test0586.iFld = " + Test0586.instanceCount + "," +
                Float.floatToIntBits(fFld) + "," + Test0586.iFld);
        FuzzerUtils.out.println("Test0586.lFld Test0586.fFld1 Test0586.bFld = " + Test0586.lFld + "," +
                Float.floatToIntBits(Test0586.fFld1) + "," + (Test0586.bFld ? 1 : 0));
        FuzzerUtils.out.println("dFld sArrFld = " + Double.doubleToLongBits(dFld) + "," +
            FuzzerUtils.checkSum(sArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0586 _instance = new Test0586();
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
//DEBUG  byMeth ->  byMeth mainTest
//DEBUG  vMeth ->  vMeth byMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
