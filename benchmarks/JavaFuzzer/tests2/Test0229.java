// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:23 2023
public class Test0229 {

    public static final int N = 400;

    public static long instanceCount=5453L;
    public static double dFld=-47.77647;
    public int iFld=-16645;
    public short sFld=4937;
    public volatile float fFld=1.400F;
    public static float[][] fArrFld =new float[N][N];

    static {
        FuzzerUtils.init(Test0229.fArrFld, -37.215F);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(long l) {

        int i12=237;
        int i13=-12148;
        int[][] iArr1 =new int[N][N];
        float f2=-39.939F;

        FuzzerUtils.init(iArr1, -9);

        Test0229.dFld -= Test0229.instanceCount;
        for (i12 = 5; i12 < 289; i12++) {
            l = i13;
            i13 += (((i12 * i13) + i12) - i12);
            i13 += i12;
            iArr1 = iArr1;
            f2 /= 79;
            switch ((i12 % 2) + 90) {
            case 90:
                i13 /= (int)-8952367471691908760L;
            case 91:
                i13 ^= i12;
                break;
            default:
            }
            i13 <<= i13;
            l *= i12;
            i13 -= i13;
            i13 = 6;
        }
        i13 = (int)l;
        long meth_res = l + i12 + i13 + Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth() {

        int i7=11319;
        int i8=-3;
        int i9=69;
        int i10=-7;
        int i11=-163;
        int i14=50;
        int[] iArr =new int[N];
        float f1=2.1005F;
        boolean b=true;
        short s=-12821;
        double[][] dArr =new double[N][N];

        FuzzerUtils.init(iArr, -34629);
        FuzzerUtils.init(dArr, -2.14676);

        i7 = (((iArr[(i7 >>> 1) % N] *= i7) + (iArr[(-161 >>> 1) % N]++)) * iArr[(i7 >>> 1) % N]);
        for (i8 = 318; i8 > 4; i8--) {
            for (i10 = 1; 5 > i10; ++i10) {
                i7 *= (int)(f1 + (-(i9 * i9)));
                Test0229.fArrFld[i10 + 1][i10 + 1] = (i11 + ((-i9) * lMeth(Test0229.instanceCount)));
                if (b) break;
                dArr[i10 + 1] = FuzzerUtils.double1array(N, (double)-1.51758);
                i14 = 1;
                do {
                    f1 += (((i14 * i10) + i10) - i10);
                    if (false) {
                        i9 = (int) Test0229.instanceCount;
                        s += (short) Test0229.dFld;
                    } else {
                        i7 -= i11;
                    }
                    Test0229.instanceCount += (i14 * i14);
                    f1 = i9;
                } while (++i14 < 2);
            }
        }
        vMeth_check_sum += i7 + i8 + i9 + i10 + i11 + Float.floatToIntBits(f1) + (b ? 1 : 0) + i14 + s +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public int iMeth(int i2, float f, int i3) {

        int i4=1, i5=5, i6=78;
        byte by1=65;

        i4 = 1;
        while (++i4 < 341) {
            i3 = (int) (++Test0229.instanceCount);
            i2 -= (int)((++f) - f);
            for (i5 = 1; i5 < 5; i5++) {
                if (iFld != 0) {
                }
                Test0229.instanceCount -= (long) (sFld + ((iFld + 73.625F) + (-i5)));
                by1 += (byte)(++i2);
                vMeth();
                i6 += (1 + (i5 * i5));
                Test0229.instanceCount += (long) 123.7017;
            }
            f += i2;
            i3 -= (int)f;
            f = Test0229.instanceCount;
            i6 = 2191;
            i6 >>= iFld;
        }
        long meth_res = i2 + Float.floatToIntBits(f) + i3 + i4 + i5 + i6 + by1;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=103;
        int i1=24;
        int i15=5728;
        int i16=132;
        int i17=-27847;
        int i18=2;
        int i19=-9;
        int[] iArr2 =new int[N];
        double d=-2.26030;
        boolean b1=false;
        short[] sArr =new short[N];

        FuzzerUtils.init(iArr2, 26648);
        FuzzerUtils.init(sArr, (short)-5894);

        if (b1) {
            for (i = 6; 135 > i; ++i) {
                byte by=-21;
                by += (byte)(i1++);
                Test0229.dFld -= (((Test0229.instanceCount * Test0229.dFld) + (++Test0229.dFld)) - ((-(Test0229.instanceCount * i1)) *
                    (++i1)));
                i1 = (iFld++);
                iFld += (i * iFld);
                switch (((iMeth(0, fFld, iFld) >>> 1) % 2) + 44) {
                case 44:
                    iArr2[i] += iFld;
                    Test0229.instanceCount = 7;
                    break;
                case 45:
                    i15 = 194;
                    while (--i15 > 0) {
                        for (i16 = 1; 1 > i16; i16++) {
                            Test0229.instanceCount -= (long) Test0229.dFld;
                            iArr2[i15] >>= i17;
                            iArr2[i15] = i;
                        }
                        i17 %= (int)(i1 | 1);
                        i1 = (int) Test0229.instanceCount;
                        i1 >>= i1;
                        iFld = (int) Test0229.instanceCount;
                        i18 = 1;
                        while (++i18 < 1) {
                            iFld *= (int) Test0229.instanceCount;
                            Test0229.instanceCount += i18;
                            iFld -= 26706;
                            sArr[i18] <<= (short) Test0229.instanceCount;
                            iArr2[i] -= i18;
                            iFld = (int)fFld;
                            Test0229.instanceCount += i16;
                        }
                        for (d = 1; d > 1; --d) {
                            iFld &= (int) Test0229.instanceCount;
                            iArr2[i15] += i17;
                            i19 = i15;
                        }
                    }
                    break;
                default:
                    i1 &= i1;
                }
            }
        } else {
            b1 = b1;
        }

        FuzzerUtils.out.println("i i1 i15 = " + i + "," + i1 + "," + i15);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("d i19 b1 = " + Double.doubleToLongBits(d) + "," + i19 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("iArr2 sArr = " + FuzzerUtils.checkSum(iArr2) + "," + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test0229.instanceCount Test0229.dFld iFld = " + Test0229.instanceCount + "," +
                Double.doubleToLongBits(Test0229.dFld) + "," + iFld);
        FuzzerUtils.out.println("sFld fFld Test0229.fArrFld = " + sFld + "," + Float.floatToIntBits(fFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0229.fArrFld)));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0229 _instance = new Test0229();
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
