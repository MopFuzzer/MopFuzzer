// Generated by Java* Fuzzer test generator (1.0.001). Fri Feb 28 23:32:09 2020
public class Test {

    public static final int N = 400;

    public static long instanceCount=727275458L;
    public static int iFld=-10;
    public static volatile byte byFld=-36;
    public static volatile short sFld=-2966;
    public static boolean bFld=true;
    public static float fFld=1.682F;
    public static long lFld=-192L;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 1);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(long l, int i6, float f) {

        short s1=24726;
        int i7=250, i8=-12;
        boolean b1=false;
        boolean[][] bArr =new boolean[N][N];
        double d1=-2.5024;

        FuzzerUtils.init(bArr, true);

        Test.iFld = 19;
        i6 = -16000;
        Test.byFld -= (byte)s1;
        Test.iFld += (int)31478L;
        Test.iArrFld[(i6 >>> 1) % N] &= 8;
        i6 = Test.byFld;
        for (i7 = 3; i7 < 137; ++i7) {
            if (b1) break;
        }
        l = 29;
        d1 = 1;
        do {
            bArr = bArr;
            i8 = i7;
            if (b1) break;
        } while (++d1 < 296);
        Test.iFld = Test.iFld;
        Test.iFld = (int)l;
        long meth_res = l + i6 + Float.floatToIntBits(f) + s1 + i7 + i8 + (b1 ? 1 : 0) + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(bArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(double d, int i, int i1) {

        boolean b=true;
        int i2=132, i3=4, i4=3, i5=53, i10=104;
        float f1=-52.551F;
        long[] lArr =new long[N], lArr1 =new long[N];

        FuzzerUtils.init(lArr, 47L);
        FuzzerUtils.init(lArr1, 4039783739L);

        i1 = (int)lArr[(Test.iFld >>> 1) % N];
        b = (Integer.reverseBytes(i1 << 5) < (Test.instanceCount++));
        for (i2 = 1; i2 < 146; i2++) {
            Test.iFld >>= (++i3);
        }
        if (b) {
            for (i4 = 4; i4 < 218; ++i4) {
                Test.instanceCount = Test.iArrFld[i4 - 1];
                lMeth(Test.instanceCount, i2, f1);
                i5 &= (int)Test.instanceCount;
                Test.instanceCount = -5;
                i10 = 1;
                while (++i10 < 8) {
                    lArr1[i4] += 61384L;
                }
                Test.iFld *= i5;
                lArr[i4 + 1] = i4;
                i3 += Test.sFld;
            }
        } else {
            lArr[(i4 >>> 1) % N] = (long)d;
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + i + i1 + (b ? 1 : 0) + i2 + i3 + i4 + i5 +
            Float.floatToIntBits(f1) + i10 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(lArr1);
    }

    public static void vMeth(short s) {

        double d2=-1.120025;
        int i11=18625;
        int i12=-29;
        int i13=-20120;
        int i14=-3;
        int i15=-253;
        int i16=-155;
        int[][] iArr =new int[N][N];
        float[] fArr =new float[N];
        short[] sArr =new short[N];

        FuzzerUtils.init(iArr, 154);
        FuzzerUtils.init(fArr, -42.5F);
        FuzzerUtils.init(sArr, (short)-14124);

        Test.iFld = iArr[(-1 >>> 1) % N][(Test.iFld >>> 1) % N];
        vMeth1(d2, 208, Test.iFld);
        for (i11 = 175; i11 > 7; i11--) {
            if (false) break;
            Test.instanceCount += (i11 * i11);
            for (i13 = 1; i13 < 9; ++i13) {
                i14 = i14;
                for (i15 = 1; i15 < 2; ++i15) {
                    Test.instanceCount = (long)d2;
                    fArr[i11 + 1] += 3145083051046855841L;
                    if (i16 != 0) {
                        vMeth_check_sum += s + Double.doubleToLongBits(d2) + i11 + i12 + i13 + i14 + i15 + i16 +
                            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
                            FuzzerUtils.checkSum(sArr);
                        return;
                    }
                    sArr[i13 - 1] &= (short)i15;
                    Test.iArrFld[i11 - 1] = 17312;
                    if (Test.bFld) break;
                    d2 = Test.fFld;
                }
            }
        }
        vMeth_check_sum += s + Double.doubleToLongBits(d2) + i11 + i12 + i13 + i14 + i15 + i16 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(sArr);
    }

    public void mainTest(String[] strArr1) {

        int i17=36045, i18=-43104, i19=-180, i20=-170, i21=-18592, i22=113;
        short s2=-12111;
        double d3=58.33517;
        double[] dArr =new double[N];
        long[] lArr2 =new long[N];

        FuzzerUtils.init(dArr, -2.48852);
        FuzzerUtils.init(lArr2, -7L);

        vMeth(Test.sFld);
        for (i17 = 8; i17 < 140; ++i17) {
            dArr[i17 + 1] += -3L;
            for (i19 = 2; i19 < 190; i19++) {
                dArr[i19] *= i19;
                i18 = i20;
                i18 >>= 34;
                Test.instanceCount += (((i19 * i18) + i18) - Test.fFld);
                Test.byFld -= (byte)i19;
                i20 = (int)Test.instanceCount;
                Test.fFld += s2;
                for (i21 = 1; i21 < 2; i21++) {
                    Test.iFld = (int)Test.lFld;
                    Test.iFld += i21;
                    Test.byFld += (byte)i21;
                    i22 <<= -238;
                    if (Test.bFld) break;
                    switch (((i17 % 2) * 5) + 115) {
                    case 125:
                        d3 -= Test.lFld;
                        Test.bFld = Test.bFld;
                        Test.iFld += i21;
                        break;
                    case 123:
                        switch (((i17 % 2) * 5) + 31) {
                        case 37:
                            lArr2 = lArr2;
                            d3 -= Test.byFld;
                            Test.iFld = i17;
                            Test.fFld += i19;
                            break;
                        case 34:
                            Test.lFld -= Test.iFld;
                            if (Test.bFld) break;
                            break;
                        default:
                            Test.lFld = i20;
                            Test.instanceCount = i19;
                        }
                        break;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 s2 i21 = " + i20 + "," + s2 + "," + i21);
        FuzzerUtils.out.println("i22 d3 dArr = " + i22 + "," + Double.doubleToLongBits(d3) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));
        FuzzerUtils.out.println("lArr2 = " + FuzzerUtils.checkSum(lArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.byFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Test.byFld);
        FuzzerUtils.out.println("Test.sFld Test.bFld Test.fFld = " + Test.sFld + "," + (Test.bFld ? 1 : 0) + "," +
            Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.lFld Test.iArrFld = " + Test.lFld + "," + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
