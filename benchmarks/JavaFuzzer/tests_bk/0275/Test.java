// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:59 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=8L;
    public static volatile byte byFld=26;
    public static short sFld=-10386;
    public volatile double dArrFld[]=new double[N];

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i6=195, i7=28200, i8=-13, i9=65421, i10=219, iArr2[]=new int[N];
        short s=-1975;
        long l1=8L;
        byte by=-103;
        double d1=2.44997, d2=-44.72177;

        FuzzerUtils.init(iArr2, -47781);

        i6 *= i6;
        for (i7 = 12; i7 < 230; ++i7) {
            i8 &= (int)Test.instanceCount;
            Test.instanceCount |= s;
            l1 = 7;
            do {
                for (i9 = 1; i9 < 1; i9++) {
                    if (false) continue;
                    by *= (byte)d1;
                    i8 -= i9;
                    i8 = (int)5664391713526939098L;
                    d2 = i7;
                    i6 |= (int)Test.instanceCount;
                    try {
                        i6 = (i9 / i10);
                        i8 = (0 % i10);
                        i8 = (iArr2[i7 + 1] % 226);
                    } catch (ArithmeticException a_e) {}
                }
                i6 += (int)(((l1 * i6) + i9) - l1);
                Test.instanceCount -= (long)d1;
            } while (--l1 > 0);
        }
        vMeth1_check_sum += i6 + i7 + i8 + s + l1 + i9 + i10 + by + Double.doubleToLongBits(d1) +
            Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth() {

        int i5=190;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 6753113626782940893L);

        i5 = (int)(((i5--) - lArr[(i5 >>> 1) % N]) * Test.instanceCount);
        vMeth1();
        i5 *= i5;
        vMeth_check_sum += i5 + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(int i3) {

        long l=89L;
        int i4=-46619, i11=-11, i12=-11, i13=0, i14=29450, iArr1[][]=new int[N][N];
        float f=-71.403F;
        double d=2.74840;
        short s1=-1984;

        FuzzerUtils.init(iArr1, 133);

        i3 *= (int)(++Test.instanceCount);
        for (l = 10; l < 356; ++l) {
            i4 += (--i3);
            i3 = (int)((f - (-d)) * (iArr1[(int)(l)][(int)(l - 1)] - Test.instanceCount));
        }
        vMeth();
        Test.instanceCount = l;
        iArr1[(-36276 >>> 1) % N][(i4 >>> 1) % N] = (int)d;
        i4 = -36244;
        for (i11 = 312; i11 > 3; --i11) {
            i12 ^= 45;
            Test.byFld += (byte)(i11 * i11);
            for (i13 = 1; i13 < 5; ++i13) {
                s1 %= (short)(s1 | 1);
                i3 = i3;
                iArr1[i13 - 1][i11] <<= i14;
            }
        }
        long meth_res = i3 + l + i4 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i11 + i12 + i13 + i14 + s1
            + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=64684, i1=-31169, i2=-40240, i15=64968, i16=230, i17=35606, iArr[]=new int[N], iArr3[][]=new int[N][N];
        float f1=-61.306F, f2=1.158F;
        double d4=-2.22727;
        long lArr1[]=new long[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr, -12);
        FuzzerUtils.init(lArr1, -3L);
        FuzzerUtils.init(iArr3, 4);
        FuzzerUtils.init(sArr, (short)2224);

        iArr[(-974 >>> 1) % N] <<= iArr[(i >>> 1) % N];
        i = (++i);
        dArrFld = (dArrFld = (dArrFld = (dArrFld = dArrFld)));
        i += iArr[(i >>> 1) % N];
        for (i1 = 6; i1 < 260; i1++) {
            double d3=-2.122340;
            iMeth(i2);
            i2 = (int)d3;
            f1 = 1;
            do {
                i += (-170 + (f1 * f1));
                f2 += i;
                switch ((((-12 >>> 1) % 10) * 5) + 95) {
                case 127:
                    i += (int)(((f1 * Test.instanceCount) + Test.byFld) - Test.instanceCount);
                    i = i1;
                    for (i15 = 1; i15 < 1; ++i15) {
                        i2 >>= i1;
                        iArr[i15 + 1] = Test.sFld;
                        i2 *= i15;
                        i16 = (int)-68.981F;
                        lArr1[(int)(f1 + 1)] *= 58906L;
                        i16 = i;
                    }
                    break;
                case 114:
                    i16 += (int)(((f1 * i) + i2) - i);
                    i2 = (int)Test.instanceCount;
                    Test.byFld += (byte)(f1 * i2);
                    i %= -11;
                    break;
                case 101:
                    i -= -46;
                    i = i15;
                    break;
                case 100:
                    for (d4 = 1; d4 < 1; d4++) {
                        iArr3 = iArr3;
                        i16 -= i2;
                        i = i;
                    }
                    break;
                case 123:
                    sArr[(int)(f1)] -= (short)d4;
                    break;
                case 136:
                    try {
                        i = (i15 / -4844);
                        iArr3[i1 + 1][i1] = (i2 % 7991);
                        iArr[i1] = (i15 / 1017450452);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 107:
                    i2 += (int)(((f1 * i17) + Test.instanceCount) - Test.sFld);
                    break;
                case 104:
                    i16 >>= i16;
                    break;
                case 131:
                    i17 *= i17;
                    break;
                case 98:
                default:
                    i >>= (int)Test.instanceCount;
                }
            } while (++f1 < 99);
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("f1 f2 i15 = " + Float.floatToIntBits(f1) + "," + Float.floatToIntBits(f2) + "," + i15);
        FuzzerUtils.out.println("i16 d4 i17 = " + i16 + "," + Double.doubleToLongBits(d4) + "," + i17);
        FuzzerUtils.out.println("iArr lArr1 iArr3 = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(lArr1)
            + "," + FuzzerUtils.checkSum(iArr3));
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.sFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Test.sFld);
        FuzzerUtils.out.println("dArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
