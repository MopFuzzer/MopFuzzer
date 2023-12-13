// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:07 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-60L;
    public static byte byFld=-18;
    public boolean bFld=true;
    public long lArrFld[]=new long[N];

    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i6=23355, i7=-9, i8=16645, i9=-4, i10=30364, i11=52, i12=3, iArr1[]=new int[N];
        float f2=-77.958F;
        short s=-1543;
        boolean b=false;

        FuzzerUtils.init(iArr1, -139);

        i6 *= (int)Test.instanceCount;
        f2 = f2;
        for (i7 = 6; 248 > i7; i7++) {
            i6 += (i7 * s);
            i9 = 1;
            do {
                if (b) {
                    i6 -= i8;
                } else if (false) {
                    for (i10 = i7; i10 < 1; i10++) {
                        Test.instanceCount -= i9;
                        i8 = (int)Test.instanceCount;
                        i6 = i8;
                        Test.byFld = (byte)i7;
                    }
                    i12 = 1;
                    while (++i12 < 1) {
                        if (i6 != 0) {
                            vMeth1_check_sum += i6 + Float.floatToIntBits(f2) + i7 + i8 + s + i9 + i10 + i11 + i12 + (b
                                ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
                            return;
                        }
                        iArr1[i12 + 1] *= i6;
                    }
                }
            } while (++i9 < 7);
        }
        vMeth1_check_sum += i6 + Float.floatToIntBits(f2) + i7 + i8 + s + i9 + i10 + i11 + i12 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1);
    }

    public void vMeth(long l1, int i3, double d1) {

        int i4=-1, i5=1, i13=9, i14=235, iArr2[]=new int[N];
        float f1=-1.28F;
        boolean b1=false, bArr[]=new boolean[N];

        FuzzerUtils.init(iArr2, -14);
        FuzzerUtils.init(bArr, true);

        for (i4 = 1; i4 < 211; ++i4) {
            f1 += i3;
            vMeth1();
            iArr2[i4] |= i5;
            for (i13 = 1; i13 < 8; ++i13) {
                bArr[i4] = b1;
                i14 = (int)l1;
            }
        }
        vMeth_check_sum += l1 + i3 + Double.doubleToLongBits(d1) + i4 + i5 + Float.floatToIntBits(f1) + i13 + i14 + (b1
            ? 1 : 0) + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(bArr);
    }

    public double dMeth(int i1, float f, int i2) {

        double d2=-1.72293, d3=1.104420, d4=-94.116270;
        int i15=56271, i16=249, i17=-38882, i18=35;

        vMeth(Test.instanceCount, 96, d2);
        for (d3 = 5; d3 < 198; ++d3) {
            Test.instanceCount += (long)(d3 - i2);
            i2 = (int)f;
            if (false) {
                for (i16 = (int)(d3); i16 < 8; ++i16) {
                    Test.instanceCount -= Test.instanceCount;
                    i1 = i17;
                    d2 *= i15;
                    i17 += i1;
                    bFld = false;
                    Test.instanceCount <<= i2;
                }
            } else if (bFld) {
                for (d4 = 8; d4 > 1; d4--) {
                    i17 = (int)2.2F;
                    Test.instanceCount = 34071;
                }
            }
        }
        long meth_res = i1 + Float.floatToIntBits(f) + i2 + Double.doubleToLongBits(d2) + Double.doubleToLongBits(d3) +
            i15 + i16 + i17 + Double.doubleToLongBits(d4) + i18;
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-7233, iArr[]=new int[N];
        double d=71.25073, dArr[]=new double[N];
        float f3=2.144F;

        FuzzerUtils.init(iArr, 13);
        FuzzerUtils.init(dArr, -15.64599);

        i *= Integer.reverseBytes((int)((d + i) - i));
        iArr = (iArr = (iArr = (iArr = iArr)));
        for (long l : lArrFld) {
            iArr[(i >>> 1) % N] = i;
            d = dMeth(i, f3, -42);
            dArr[(-64578 >>> 1) % N] *= i;
        }
        Test.instanceCount += i;

        FuzzerUtils.out.println("i d f3 = " + i + "," + Double.doubleToLongBits(d) + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("iArr dArr = " + FuzzerUtils.checkSum(iArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld bFld = " + Test.instanceCount + "," + Test.byFld + "," +
            (bFld ? 1 : 0));
        FuzzerUtils.out.println("lArrFld = " + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth dMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
