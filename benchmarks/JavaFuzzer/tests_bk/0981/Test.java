// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:18 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2940237334830608762L;
    public static boolean bFld=false;
    public static byte byFld=-127;
    public static volatile int iFld=-18;
    public long lFld=1272418003L;
    public short sFld=-319;
    public volatile int iArrFld[]=new int[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l, float f, int i3) {

        double d2=-84.83083;
        byte by=34;
        float f1=125.760F;
        int i4=-13, i5=-2, i6=-32302, iArr[]=new int[N];
        short s=-18511;
        long lArr1[][]=new long[N][N];

        FuzzerUtils.init(iArr, 33);
        FuzzerUtils.init(lArr1, -4531736006691845226L);

        iArr[(i3 >>> 1) % N] *= (int)d2;
        by = (byte)Test.instanceCount;
        f -= i3;
        i3 += (int)Test.instanceCount;
        lArr1[(i3 >>> 1) % N][(i3 >>> 1) % N] &= 27652;
        l += i3;
        i3 -= by;
        for (f1 = 10; 330 > f1; f1++) {
            for (i5 = 1; i5 < 5; i5++) {
                i4 ^= -47489;
                if (Test.bFld) continue;
                if (Test.bFld) {
                    i6 = (int)-97.9983;
                    i4 = i5;
                } else {
                    l = s;
                }
            }
        }
        vMeth2_check_sum += l + Float.floatToIntBits(f) + i3 + Double.doubleToLongBits(d2) + by +
            Float.floatToIntBits(f1) + i4 + i5 + i6 + s + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth1(double d1) {

        int i1=28, i2=172, i7=-11, i8=-217, i9=9, iArr1[]=new int[N];
        float f2=55.503F, f3=110.176F, fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -225191033L);
        FuzzerUtils.init(fArr, 1.27F);
        FuzzerUtils.init(iArr1, -91);

        for (i1 = 369; i1 > 19; --i1) {
            lArr[i1] += (i1 - (i2++));
            vMeth2(Test.instanceCount, f2, i1);
            i2 = i2;
            for (f3 = 1; f3 < 5; ++f3) {
                i2 += (int)f3;
                d1 = i2;
                fArr = fArr;
                i7 += (int)f3;
                i7 += (int)d1;
                iArr1[(int)(f3 - 1)] -= i2;
                for (i8 = 1; i8 < 2; ++i8) {
                    Test.instanceCount = i1;
                    if (Test.bFld) break;
                    fArr[(int)(f3 - 1)] = i7;
                }
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d1) + i1 + i2 + Float.floatToIntBits(f2) + Float.floatToIntBits(f3)
            + i7 + i8 + i9 + FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i) {

        double d=-86.5865;
        float f4=121.783F;
        int i10=-137, i11=149, i12=43364, i13=-8, i14=-26991, iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, -3);

        i >>= (--i);
        d = 1;
        do {
            i ^= i;
            vMeth1(d);
            i = i;
        } while (++d < 369);
        f4 = Test.byFld;
        for (i10 = 6; 176 > i10; i10++) {
            Test.instanceCount = Test.instanceCount;
            iArr2[(Test.iFld >>> 1) % N] = -128;
            Test.instanceCount -= 22626;
            i12 = 1;
            while (++i12 < 9) {
                for (i13 = 1; i13 < 1; ++i13) {
                    iArr2 = iArr2;
                    i11 = i10;
                    if (i != 0) {
                        vMeth_check_sum += i + Double.doubleToLongBits(d) + Float.floatToIntBits(f4) + i10 + i11 + i12
                            + i13 + i14 + FuzzerUtils.checkSum(iArr2);
                        return;
                    }
                }
            }
        }
        vMeth_check_sum += i + Double.doubleToLongBits(d) + Float.floatToIntBits(f4) + i10 + i11 + i12 + i13 + i14 +
            FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i15=-33898, i16=-1, i17=-56320, i18=5, i19=-8796, i20=-13;
        float f5=-44.652F;
        long lArr2[]=new long[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(lArr2, 197L);
        FuzzerUtils.init(dArr, 2.8558);

        vMeth(Test.iFld);
        for (i15 = 4; i15 < 183; i15++) {
            Test.iFld *= (int)4293779277544587056L;
            for (i17 = 2; i17 < 140; ++i17) {
                double d3=-58.39168;
                Test.instanceCount *= i18;
                lFld += i17;
                d3 = sFld;
                i18 += (i17 - i16);
                switch ((i17 % 7) + 127) {
                case 127:
                    f5 -= lFld;
                    lArr2[i15 + 1] = Test.byFld;
                    break;
                case 128:
                    iArrFld[i15 + 1] <<= Test.iFld;
                    i16 += (i17 * i17);
                    iArrFld[i15] *= (int)Test.instanceCount;
                    break;
                case 129:
                    Test.iFld = i15;
                    Test.bFld = false;
                    iArrFld[i15] *= i15;
                    break;
                case 130:
                case 131:
                    for (i19 = 1; i19 < 2; i19++) {
                        switch (((i19 % 6) * 5) + 119) {
                        case 149:
                            d3 *= i16;
                            i18 = 8;
                            Test.instanceCount *= (long)f5;
                            Test.instanceCount = i19;
                            break;
                        case 138:
                            i20 = i19;
                        case 127:
                            i18 = (int)lFld;
                            i16 = (int)lFld;
                            Test.byFld += (byte)Test.instanceCount;
                            dArr[i17] -= i18;
                            break;
                        case 132:
                            iArrFld[i15 + 1] |= i17;
                            i16 *= (int)d3;
                        case 148:
                            Test.instanceCount = sFld;
                            break;
                        case 141:
                            i16 = 0;
                            break;
                        }
                    }
                    break;
                case 132:
                    iArrFld[i15 - 1] += (int)Test.instanceCount;
                    break;
                case 133:
                    i18 = i18;
                    break;
                default:
                    Test.byFld += (byte)(49.464F + (i17 * i17));
                }
            }
        }

        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 f5 i19 = " + i18 + "," + Float.floatToIntBits(f5) + "," + i19);
        FuzzerUtils.out.println("i20 lArr2 dArr = " + i20 + "," + FuzzerUtils.checkSum(lArr2) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.byFld = " + Test.instanceCount + "," + (Test.bFld ?
            1 : 0) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.iFld lFld sFld = " + Test.iFld + "," + lFld + "," + sFld);
        FuzzerUtils.out.println("iArrFld = " + FuzzerUtils.checkSum(iArrFld));

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