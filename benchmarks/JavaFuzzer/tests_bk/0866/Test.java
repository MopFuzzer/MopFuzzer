// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:15 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1945228490L;
    public static volatile int iFld=-75;
    public long lFld=2548701938L;
    public static long lArrFld[]=new long[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -17022L);
        FuzzerUtils.init(Test.fArrFld, 99.338F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(float f, int i6) {


        i6 = i6;
        Test.instanceCount >>= Test.instanceCount;
        long meth_res = Float.floatToIntBits(f) + i6;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1(int i4) {

        long l1=-51090L;
        int i5=33045, i7=21142, i8=133, i9=1, iArr1[]=new int[N];
        double d=0.114183;
        byte by=114;

        FuzzerUtils.init(iArr1, -90);

        for (l1 = 150; 5 < l1; --l1) {
            float f1=0.725F;
            iArr1[(int)(l1 + 1)] >>= iArr1[(int)(l1 - 1)];
            i4 *= i5;
            i4 = (int)lMeth(f1, i4);
            switch ((int)(((l1 % 3) * 5) + 60)) {
            case 63:
                i7 = 1;
                while (++i7 < 11) {
                    if (true) break;
                    i4 = (int)d;
                    iArr1[(int)(l1)] = i4;
                    Test.instanceCount += i7;
                    for (i8 = 1; i8 > 1; --i8) {
                        Test.instanceCount += (-8 + (i8 * i8));
                        i5 += (i8 + Test.instanceCount);
                        Test.instanceCount = l1;
                    }
                    f1 = by;
                }
                break;
            case 62:
                f1 = f1;
                break;
            case 64:
                i9 = -11;
            default:
                Test.lArrFld[(int)(l1 - 1)] -= i4;
            }
        }
        vMeth1_check_sum += i4 + l1 + i5 + i7 + Double.doubleToLongBits(d) + i8 + i9 + by + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(long l) {

        int i=-183, i1=16918, i2=-12, i3=-32968, i10=-203, i11=-39834, iArr[]=new int[N];
        double d1=2.95285;
        short s=-14411;
        boolean b=false;

        FuzzerUtils.init(iArr, 14);

        for (i = 18; i < 339; i++) {
            for (i2 = 1; i2 < 5; ++i2) {
                i3 ^= iArr[i2];
                vMeth1(i1);
                d1 = l;
                s = (short)Test.instanceCount;
                try {
                    i1 = (i1 % -105);
                    iArr[i2] = (iArr[i] % -165);
                    i3 = (iArr[i + 1] % 75);
                } catch (ArithmeticException a_e) {}
                if (b) {
                    if (true) continue;
                    i10 = 1;
                    do {
                        i3 -= (int)d1;
                        i3 &= i;
                        b = b;
                        i1 = i2;
                        try {
                            i3 = (iArr[i + 1] / -228);
                            i3 = (-1501471542 / i);
                            i1 = (-38407 % i3);
                        } catch (ArithmeticException a_e) {}
                    } while (++i10 < 2);
                } else if (b) {
                    try {
                        iArr[i2 - 1] = (-31 % i10);
                        i11 = (1805 % i1);
                        iArr[i2] = (i2 / 39541);
                    } catch (ArithmeticException a_e) {}
                } else {
                    i1 -= i;
                }
            }
        }
        vMeth_check_sum += l + i + i1 + i2 + i3 + Double.doubleToLongBits(d1) + s + i10 + (b ? 1 : 0) + i11 +
            FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i12=119, i13=201, i14=-142, i15=-3, i16=-37614, i17=-41690, i18=46900, iArr2[][]=new int[N][N];
        short s1=-27854;
        boolean b1=true;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -6.2254);
        FuzzerUtils.init(iArr2, -6);

        vMeth(Test.instanceCount);
        i12 += (int)Test.instanceCount;
        i12 |= i12;
        for (i13 = 1; i13 < 122; ++i13) {
            i15 = 1;
            while (++i15 < 207) {
                for (i16 = 1; i16 < 1; i16++) {
                    i17 += (int)1.516F;
                    Test.fArrFld[i15] -= i17;
                }
                switch (((i13 >>> 1) % 5) + 66) {
                case 66:
                    i17 >>>= s1;
                    dArr = dArr;
                    Test.instanceCount = Test.instanceCount;
                    break;
                case 67:
                    s1 += (short)Test.instanceCount;
                    i18 = 1;
                    while (++i18 < 1) {
                        i12 = 225;
                        try {
                            i17 = (i15 % -34287);
                            i12 = (-10943 % iArr2[i13][i18 + 1]);
                            i14 = (i16 / 63773);
                        } catch (ArithmeticException a_e) {}
                        if (b1) {
                            i14 = (int)-5564347362491326524L;
                            iArr2[i15 + 1][i13] = (int)Test.instanceCount;
                            i17 -= (int)1.87F;
                        } else {
                            iArr2[i15 - 1][i18 - 1] >>>= i16;
                            i12 -= i17;
                            dArr[i15 - 1] = i15;
                            iArr2[i15][i18 + 1] -= (int)Test.instanceCount;
                        }
                        iArr2[(i12 >>> 1) % N] = iArr2[i18 + 1];
                        i14 >>= (int)Test.instanceCount;
                    }
                    break;
                case 68:
                    Test.iFld = i18;
                    i12 *= -64086;
                    break;
                case 69:
                case 70:
                    Test.iFld *= i12;
                    lFld = -10;
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i12 i13 i14 = " + i12 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("s1 i18 b1 = " + s1 + "," + i18 + "," + (b1 ? 1 : 0));
        FuzzerUtils.out.println("dArr iArr2 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + "," +
            FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld lFld = " + Test.instanceCount + "," + Test.iFld + "," +
            lFld);
        FuzzerUtils.out.println("Test.lArrFld Test.fArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

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
