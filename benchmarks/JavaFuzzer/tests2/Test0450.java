// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:33 2023
public class Test0450 {

    public static final int N = 400;

    public static long instanceCount=47457L;
    public static int iFld=23790;
    public static long lFld=7278552829823610447L;
    public static float fFld=-1.543F;
    public double dFld=-1.51849;
    public static long lFld1=-13L;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0450.iArrFld, -12);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l, int i1) {

        float f2=-12.798F;
        int i2=10;
        int i4=250;
        int[] iArr1 =new int[N];
        boolean b=true;
        double d=102.52500;

        FuzzerUtils.init(iArr1, 17168);

        f2 -= -109;
        Test0450.instanceCount += i1;
        i2 *= (int)l;
        iArr1 = FuzzerUtils.int1array(N, (int)-57762);
        for (int i3 : iArr1) {
            f2 -= Test0450.instanceCount;
            iArr1[(60 >>> 1) % N] = -3;
            if (b) break;
            d = 1;
            while (++d < 4) {
                i4 = 1;
                while (++i4 < 1) {
                    switch ((int)((d % 2) + 22)) {
                    case 22:
                        iArr1[(int)(d - 1)] += (int)l;
                        if (i4 != 0) {
                            vMeth2_check_sum += l + i1 + Float.floatToIntBits(f2) + i2 + (b ? 1 : 0) +
                                Double.doubleToLongBits(d) + i4 + FuzzerUtils.checkSum(iArr1);
                            return;
                        }
                        Test0450.lFld = Test0450.iFld;
                        i3 -= (int)f2;
                    case 23:
                        Test0450.iFld = (int) -12963L;
                        break;
                    default:
                        iArr1[(int)(d + 1)] += i3;
                    }
                }
            }
        }
        vMeth2_check_sum += l + i1 + Float.floatToIntBits(f2) + i2 + (b ? 1 : 0) + Double.doubleToLongBits(d) + i4 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1(short s, int i) {

        int i5=7;
        int i6=-183;
        int i7=-69;
        int i8=3;
        int i9=-32055;
        int[] iArr2 =new int[N];
        double d1=0.105623;
        double[][] dArr =new double[N][N];
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 92L);
        FuzzerUtils.init(iArr2, -178);
        FuzzerUtils.init(dArr, 108.99038);

        vMeth2(Test0450.lFld, Test0450.iFld);
        Test0450.iFld *= (int) Test0450.instanceCount;
        for (i5 = 14; i5 < 301; i5++) {
            i -= i6;
            d1 += i;
            lArr = lArr;
            Test0450.iFld = Test0450.iFld;
            i7 = 1;
            do {
                for (i8 = 1; i8 > 1; --i8) {
                    iArr2[i7] = (int)d1;
                    i9 >>= i6;
                    d1 *= i7;
                }
                i6 = (int) Test0450.instanceCount;
                iArr2[i5] = (int) Test0450.lFld;
                dArr[(i9 >>> 1) % N][i7 - 1] *= i6;
            } while (++i7 < 6);
        }
        vMeth1_check_sum += s + i + i5 + i6 + Double.doubleToLongBits(d1) + i7 + i8 + i9 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth() {

        short s1=21012;
        int i10=-208, i11=-4828, i12=-112, i13=0, i14=34299;
        float[][] fArr =new float[N][N];

        FuzzerUtils.init(fArr, 52.105F);

        vMeth1(s1, Test0450.iFld);
        Test0450.iFld = (int) -1.97134;
        try {
            for (i10 = 180; i10 > 9; i10--) {
                Test0450.iFld += -1;
                i12 = 1;
                do {
                    i11 += i12;
                    Test0450.fFld -= Test0450.fFld;
                    if (false) continue;
                    Test0450.iFld = i12;
                    for (i13 = 1; 1 > i13; i13++) {
                        i11 += 44;
                        i14 <<= i12;
                        Test0450.iFld += (((i13 * i11) + Test0450.iFld) - Test0450.instanceCount);
                        Test0450.iArrFld[i13 - 1] = i14;
                    }
                } while (++i12 < 9);
            }
        }
        catch (NegativeArraySizeException exc1) {
            fArr[(Test0450.iFld >>> 1) % N][(Test0450.iFld >>> 1) % N] = 108;
        }
        vMeth_check_sum += s1 + i10 + i11 + i12 + i13 + i14 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        float f=-1.63F, f1=64.342F;
        long l1=-87L;
        long[] lArr1 =new long[N];
        int i15=40;
        int i16=-6;
        int i17=7;
        int i18=-81;
        int i19=-13;
        int i20=-8;
        int i21=26453;
        int i22=34955;
        int[] iArr =new int[N];
        double d2=1.21076;
        short s2=919;
        byte by=59;
        byte[] byArr =new byte[N];

        FuzzerUtils.init(iArr, 8);
        FuzzerUtils.init(lArr1, 26138L);
        FuzzerUtils.init(byArr, (byte)-57);

        Test0450.instanceCount += Math.min((long) ((Test0450.iFld + Test0450.iFld) + (104.471F -
                Long.reverseBytes(Test0450.instanceCount))), (long) (f - (Test0450.iFld--)));
        f1 = ((Integer.reverseBytes(Test0450.iFld) - (Test0450.iFld & Test0450.instanceCount)) * (++Test0450.iFld));
        iArr = (iArr = (iArr = (iArr = iArr)));
        Test0450.iFld -= (int) ((Test0450.instanceCount--) + (f + (iArr[(Test0450.iFld >>> 1) % N]++)));
        vMeth();
        for (l1 = 1; l1 < 140; l1++) {
            Test0450.iFld = i15;
        }
        Test0450.iFld >>= (int) l1;
        iArr[(i15 >>> 1) % N] = Test0450.iFld;
        Test0450.iFld += 28841;
        for (i16 = 362; i16 > 13; --i16) {
            for (i18 = 4; i18 < 72; ++i18) {
                d2 = 2;
                do {
                    s2 = by;
                    lArr1[i18 - 1] = i16;
                    iArr[(int) (d2 + 1)] *= (int) Test0450.lFld;
                    try {
                        i17 = (i16 / Test0450.iFld);
                        Test0450.iFld = (-42677 / i17);
                        i19 = (-47258 / i17);
                    } catch (ArithmeticException a_e) {}
                } while (--d2 > 0);
                byArr[i16] >>= (byte)i19;
                i17 *= i15;
                Test0450.lFld = (long) 1.369F;
                iArr[i18] <<= i16;
                Test0450.iArrFld[i16 + 1] += i17;
                i15 = i16;
            }
        }
        for (i20 = 15; i20 < 398; ++i20) {
            Test0450.instanceCount = Test0450.instanceCount;
            i22 = 1;
            while ((i22 += 2) < 66) {
                dFld -= 22;
                Test0450.instanceCount = i19;
            }
        }
        Test0450.iFld <<= i20;
        i21 *= (int) Test0450.lFld1;

        FuzzerUtils.out.println("f f1 l1 = " + Float.floatToIntBits(f) + "," + Float.floatToIntBits(f1) + "," + l1);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 d2 = " + i18 + "," + i19 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("s2 by i20 = " + s2 + "," + by + "," + i20);
        FuzzerUtils.out.println("i21 i22 iArr = " + i21 + "," + i22 + "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("lArr1 byArr = " + FuzzerUtils.checkSum(lArr1) + "," + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test0450.instanceCount Test0450.iFld Test0450.lFld = " + Test0450.instanceCount + "," + Test0450.iFld +
                "," + Test0450.lFld);
        FuzzerUtils.out.println("Test0450.fFld dFld Test0450.lFld1 = " + Float.floatToIntBits(Test0450.fFld) + "," +
                Double.doubleToLongBits(dFld) + "," + Test0450.lFld1);
        FuzzerUtils.out.println("Test0450.iArrFld = " + FuzzerUtils.checkSum(Test0450.iArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0450 _instance = new Test0450();
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
