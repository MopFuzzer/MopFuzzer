// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:05 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-2555906785049829413L;
    public static float fFld=111.987F;
    public static byte byFld=95;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 13322);
        FuzzerUtils.init(Test.fArrFld, 20.746F);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth(long l, int i3) {


        i3 = i3;
        vMeth_check_sum += l + i3;
    }

    public static void vMeth1() {

        int i8=-72;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)54);

        byArr[(i8 >>> 1) % N] += (byte)Test.instanceCount;
        vMeth1_check_sum += i8 + FuzzerUtils.checkSum(byArr);
    }

    public static long lMeth(long l1, long l2) {

        int i6=45376, i7=-48561, i9=0, i10=-1, i11=-6, i12=-26168;
        float f=0.505F;
        double d1=-94.108441;
        byte byArr1[]=new byte[N];

        FuzzerUtils.init(byArr1, (byte)70);

        for (i6 = 8; i6 < 213; ++i6) {
            vMeth1();
            Test.fFld += i7;
            Test.iArrFld[i6 + 1] = (int)l2;
            if (true) {
                f = Test.fFld;
            }
            switch (((186 >>> 1) % 10) + 122) {
            case 122:
                i7 = (int)l2;
                break;
            case 123:
                i7 -= i6;
                break;
            case 124:
                for (i9 = 1; i9 < 8; ++i9) {
                    i7 = i9;
                    byArr1[i6 + 1] -= (byte)i9;
                    for (i11 = 1; i11 < 2; ++i11) {
                        Test.instanceCount = Test.instanceCount;
                        i7 -= (int)l1;
                    }
                }
                break;
            case 125:
                i12 += (int)l1;
            case 126:
                Test.iArrFld[(i9 >>> 1) % N] = i11;
                break;
            case 127:
                i12 *= 2169;
                break;
            case 128:
                Test.iArrFld[i6] += (int)l1;
                break;
            case 129:
                i7 |= (int)l1;
                break;
            case 130:
                f -= (float)d1;
                break;
            case 131:
                Test.byFld = (byte)i6;
                break;
            default:
                try {
                    i12 = (i10 / 2048124768);
                    i10 = (-43803 % i9);
                    Test.iArrFld[i6] = (Test.iArrFld[i6] % i9);
                } catch (ArithmeticException a_e) {}
            }
        }
        long meth_res = l1 + l2 + i6 + i7 + Float.floatToIntBits(f) + i9 + i10 + i11 + i12 +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(byArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(int i1, int i2) {

        double d=2.77325, d2=105.6192;
        short s=28743;
        int i4=6, i5=-1, i13=185, i14=237;
        boolean b=false;

        Test.fFld -= Test.instanceCount;
        vMeth((long)((d - (i2 - s)) - (-25552 - (d + s))), (int)(Test.fFld - i2));
        Test.instanceCount -= ((++i1) * i2);
        Test.fFld -= (float)((i1--) - ((i1 * 8.69622) - Test.iArrFld[(-3 >>> 1) % N]));
        if (true) {
            for (i4 = 9; 168 > i4; ++i4) {
                lMeth(Test.instanceCount, Test.instanceCount);
                Test.fFld -= Test.byFld;
                switch ((i4 % 5) + 26) {
                case 26:
                    d2 = 1;
                    do {
                        i1 = (int)Test.instanceCount;
                        Test.fFld = i4;
                        for (i13 = 1; i13 < 1; i13 += 2) {
                            b = b;
                            i14 += s;
                        }
                    } while (++d2 < 10);
                    break;
                case 27:
                    i5 += i1;
                    break;
                case 28:
                case 29:
                    Test.iArrFld[i4] += (int)88.795F;
                case 30:
                    Test.fFld -= i14;
                    break;
                }
            }
        } else {
            Test.instanceCount -= Test.byFld;
        }
        long meth_res = i1 + i2 + Double.doubleToLongBits(d) + s + i4 + i5 + Double.doubleToLongBits(d2) + i13 + i14 +
            (b ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=13, i15=-4, i16=-24713, i17=175, i18=188, i19=33585, i20=-20876, i21=-44384, i22=17031;
        float f1=0.760F;
        short s1=11059, s2=-10188;
        long lArr[]=new long[N];
        byte byArr2[]=new byte[N];

        FuzzerUtils.init(lArr, 6018742808471281544L);
        FuzzerUtils.init(byArr2, (byte)-31);

        i = iMeth(i, i);
        Test.iArrFld[(i >>> 1) % N] = i;
        Test.instanceCount += -10;
        Test.fFld += -111;
        Test.fArrFld = Test.fArrFld;
        for (i15 = 5; 257 > i15; ++i15) {
            f1 = 1;
            do {
                for (i17 = 1; i17 < 1; i17++) {
                    s1 += (short)i19;
                    Test.fFld = Test.instanceCount;
                    Test.fFld += i;
                    Test.fFld *= Test.instanceCount;
                    lArr[i15 - 1] = i15;
                    i19 -= (int)Test.fFld;
                    i20 -= -14;
                    i20 -= i18;
                    i18 |= -58004;
                    Test.fArrFld[i15 - 1] = s2;
                }
                i = i15;
                i20 *= (int)f1;
                Test.instanceCount += Test.byFld;
                i20 += (int)f1;
                i20 += i17;
                for (i21 = (int)(f1); 1 > i21; i21++) {
                    s1 = (short)i15;
                    Test.iArrFld[(i17 >>> 1) % N] <<= -1;
                    i16 += (-13580 + (i21 * i21));
                    i20 >>>= (int)-7300714031955456091L;
                }
                Test.instanceCount += i19;
                byArr2 = byArr2;
            } while (++f1 < 100);
        }

        FuzzerUtils.out.println("i i15 i16 = " + i + "," + i15 + "," + i16);
        FuzzerUtils.out.println("f1 i17 i18 = " + Float.floatToIntBits(f1) + "," + i17 + "," + i18);
        FuzzerUtils.out.println("s1 i19 i20 = " + s1 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("s2 i21 i22 = " + s2 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("lArr byArr2 = " + FuzzerUtils.checkSum(lArr) + "," + FuzzerUtils.checkSum(byArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.byFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.iArrFld Test.fArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 lMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}