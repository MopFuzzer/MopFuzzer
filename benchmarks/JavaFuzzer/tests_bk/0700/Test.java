// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:10 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=200L;
    public static float fFld=-2.656F;
    public double dFld=2.91416;
    public volatile boolean bFld=true;
    public static double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];
    public static float fArrFld[][]=new float[N][N];
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 2.22642);
        FuzzerUtils.init(Test.iArrFld, -30075);
        FuzzerUtils.init(Test.fArrFld, 1.431F);
        FuzzerUtils.init(Test.byArrFld, (byte)-104);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(int i7, float f, float f1) {

        float f2=0.43F;
        int i8=-184, i9=-5, i10=64455;
        byte by=-28;

        for (f2 = 7; f2 < 226; f2++) {
            i8 >>>= (int)Test.instanceCount;
        }
        Test.instanceCount = i7;
        for (i9 = 285; i9 > 7; i9--) {
            double d1=0.103735;
            switch ((i9 % 2) + 91) {
            case 91:
            case 92:
                i10 += i9;
                i7 -= i10;
                Test.fArrFld[i9 + 1][i9 - 1] -= f1;
                d1 = -4862;
                break;
            default:
                Test.instanceCount = -247;
                Test.instanceCount += i10;
            }
            i8 = by;
            i10 += i10;
        }
        f1 = 5311;
        Test.byArrFld[(i7 >>> 1) % N] -= (byte)Test.instanceCount;
        long meth_res = i7 + Float.floatToIntBits(f) + Float.floatToIntBits(f1) + Float.floatToIntBits(f2) + i8 + i9 +
            i10 + by;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static int iMeth(int i6) {

        double d=-1.49038;
        float f3=-52.412F;

        d *= fMeth(i6, f3, f3);
        long meth_res = i6 + Double.doubleToLongBits(d) + Float.floatToIntBits(f3);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l) {

        int i3=-15778, i4=-14, i5=230, i11=42, i12=-40997;
        boolean b=false;
        double d2=-1.128018;

        for (i3 = 186; i3 > 7; --i3) {
            i5 = 9;
            while (--i5 > 0) {
                Test.iArrFld[i5 + 1] += iMeth(i3);
                i4 *= i5;
                i4 *= -13480;
                i4 += (-7 + (i5 * i5));
                b = b;
                i11 = 1;
                while (++i11 < 1) {
                    try {
                        i12 = (i11 / i4);
                        i4 = (-517228230 / i12);
                        i4 = (i3 / i12);
                    } catch (ArithmeticException a_e) {}
                    Test.fArrFld[i11 + 1][i11] = i12;
                    l -= (long)d2;
                    i4 += (64384 + (i11 * i11));
                    if (i5 != 0) {
                        vMeth_check_sum += l + i3 + i4 + i5 + (b ? 1 : 0) + i11 + i12 + Double.doubleToLongBits(d2);
                        return;
                    }
                    i12 += (int)d2;
                }
                Test.fFld += (i5 - i12);
            }
        }
        vMeth_check_sum += l + i3 + i4 + i5 + (b ? 1 : 0) + i11 + i12 + Double.doubleToLongBits(d2);
    }

    public void mainTest(String[] strArr1) {

        int i=-12, i1=-15076, i2=80, i13=10, i14=-38223, i15=45334, i16=-7, i17=214, i18=-71;
        short s=-6871;
        boolean bArr[]=new boolean[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(lArr, 1021964996L);

        switch ((((Integer.reverseBytes(-42212) >>> 1) % 6) * 5) + 122) {
        case 137:
            for (i = 6; 124 > i; i++) {
                i2 = 1;
                do {
                    i1 += (i2 + s);
                    Test.dArrFld[i + 1] = Test.iArrFld[i + 1];
                    vMeth(Test.instanceCount);
                    i1 *= (int)Test.instanceCount;
                    bArr = bArr;
                } while (++i2 < 212);
                i1 = (int)Test.instanceCount;
            }
            i1 = i;
            break;
        case 148:
            Test.dArrFld[(i2 >>> 1) % N] *= 669135977L;
            Test.fFld = (float)dFld;
            bFld = true;
            i13 = 1;
            while (++i13 < 344) {
                Test.instanceCount /= 2566043076254253852L;
                dFld = Test.instanceCount;
                dFld -= Test.instanceCount;
                Test.instanceCount = Test.instanceCount;
                Test.instanceCount <<= s;
            }
            break;
        case 128:
            Test.fArrFld[(i >>> 1) % N][(i2 >>> 1) % N] += 36018;
            lArr[(0 >>> 1) % N] -= i2;
            for (i14 = 7; i14 < 343; i14++) {
                s = (short)Test.instanceCount;
                for (i16 = 4; i16 < 75; ++i16) {
                    Test.fFld = i2;
                    Test.iArrFld[i16 + 1] = i17;
                }
            }
            break;
        case 145:
            i18 = 1;
            while (++i18 < 133) {
                Test.fArrFld[i18 - 1][i18] = (float)dFld;
                if (true) break;
                i15 += i18;
            }
            break;
        case 131:
            Test.instanceCount = Test.instanceCount;
        case 142:
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("s i13 i14 = " + s + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 bArr lArr = " + i18 + "," + FuzzerUtils.checkSum(bArr) + "," +
            FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("bFld Test.dArrFld Test.iArrFld = " + (bFld ? 1 : 0) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.fArrFld Test.byArrFld = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.byArrFld));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  fMeth ->  fMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
