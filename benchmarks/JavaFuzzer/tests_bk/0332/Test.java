// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:01 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2794952345L;
    public static int iFld=-162;
    public static float fFld=-90.123F;
    public boolean bFld=true;
    public double dFld=109.55602;
    public float fFld1=-68.637F;
    public static int iArrFld[][]=new int[N][N];
    public static double dArrFld[][]=new double[N][N];
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 173);
        FuzzerUtils.init(Test.dArrFld, 0.15785);
        FuzzerUtils.init(Test.lArrFld, 3354239458L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i5=14, i6=14, i7=-13, i8=24168, i9=25517, iArr1[][]=new int[N][N];
        boolean b=true;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -1.429F);
        FuzzerUtils.init(iArr1, -167);

        for (i5 = 19; i5 < 307; i5++) {
            Test.iArrFld[i5][i5] = i5;
            switch ((((Test.iFld >>> 1) % 2) * 5) + 65) {
            case 73:
            case 72:
                Test.fFld -= Test.instanceCount;
            }
            for (i7 = 1; i7 < 6; i7++) {
                Test.iArrFld = Test.iArrFld;
                i8 = i6;
                i8 += (-95 + (i7 * i7));
                switch ((i7 % 8) + 123) {
                case 123:
                    i9 = 1;
                    while (++i9 < 2) {
                        fArr[i9] = i8;
                        i6 += (int)Test.instanceCount;
                        iArr1[i7][i5 + 1] -= i5;
                        Test.iFld >>= i9;
                        Test.instanceCount <<= i5;
                    }
                    break;
                case 124:
                    Test.instanceCount += 21094;
                    break;
                case 125:
                    Test.instanceCount -= i5;
                    break;
                case 126:
                    Test.instanceCount -= Test.instanceCount;
                    break;
                case 127:
                case 128:
                    Test.dArrFld[i5] = Test.dArrFld[i7];
                    break;
                case 129:
                    if (b) continue;
                case 130:
                    i8 += (int)Test.instanceCount;
                    break;
                default:
                    Test.iFld = i5;
                }
            }
        }
        long meth_res = i5 + i6 + i7 + i8 + i9 + (b ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i4) {

        float f=0.221F;
        int i10=14561, i11=79;

        f = (Test.iFld = iMeth1());
        for (i10 = 15; i10 < 354; ++i10) {
            Test.instanceCount = Test.instanceCount;
        }
        long meth_res = i4 + Float.floatToIntBits(f) + i10 + i11;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i2=11, i3=40380, i12=0, i13=10, i14=11, iArr2[]=new int[N];
        double d=2.48640;
        boolean b1=false;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)33);
        FuzzerUtils.init(iArr2, 0);

        if (b1) {
            Test.iFld = (byArr[(-13 >>> 1) % N]--);
            for (i2 = 7; i2 < 136; i2++) {
                try {
                    i3 = (i3 / i3);
                    Test.iFld = (i2 % Test.iFld);
                    i3 = (i3 / Test.iFld);
                } catch (ArithmeticException a_e) {}
                Test.iFld >>= (iMeth(i3) - Test.iFld);
                switch (((i2 % 1) * 5) + 94) {
                case 99:
                    i3 += (64733 + (i2 * i2));
                    break;
                default:
                    switch (((i2 >>> 1) % 5) + 9) {
                    case 9:
                        i3 = i2;
                    case 10:
                        Test.fFld += i12;
                        i13 = 1;
                        while (++i13 < 12) {
                            if (true) break;
                            for (d = 1; d < 1; ++d) {
                                Test.iFld = Test.iFld;
                                Test.iFld *= (int)Test.fFld;
                            }
                        }
                        break;
                    case 11:
                        Test.instanceCount *= -7L;
                        break;
                    case 12:
                        Test.iArrFld[i2][i2 - 1] = i14;
                    case 13:
                        iArr2 = Test.iArrFld[i2];
                        break;
                    default:
                        Test.iFld = (int)-720124527L;
                    }
                }
            }
        } else if (b1) {
            i12 *= i3;
        } else if (b1) {
            Test.iArrFld[(i13 >>> 1) % N][(Test.iFld >>> 1) % N] %= (int)(i12 | 1);
        } else {
            Test.instanceCount -= 61519L;
        }
        vMeth_check_sum += i2 + i3 + i12 + i13 + Double.doubleToLongBits(d) + i14 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i=53367, i1=8, i16=11737, i17=-6, i18=-146, i19=0, i20=-55095, i21=-4, i22=63567, iArr[]=new int[N];
        short s=-4515;
        long l=-454358270L;
        float fArr1[][]=new float[N][N];

        FuzzerUtils.init(iArr, 34352);
        FuzzerUtils.init(fArr1, -97.229F);

        i += i;
        iArr[(i >>> 1) % N] = (int)(Test.instanceCount--);
        i1 = 1;
        do {
            vMeth();
            s += (short)(((i1 * Test.instanceCount) + Test.fFld) - Test.iFld);
            for (l = 3; l < 70; l++) {
                Test.instanceCount *= Test.instanceCount;
                Test.iArrFld[i1][i1 + 1] <<= i16;
            }
            bFld = true;
            for (i17 = 2; 70 > i17; i17++) {
                i *= (int)Test.instanceCount;
                Test.iFld += (253 + (i17 * i17));
                Test.iFld -= (int)l;
                for (i19 = 1; i19 < 2; i19++) {
                    Test.iFld -= i17;
                    fArr1[i19 + 1][i17] = Test.fFld;
                    i >>= i20;
                    Test.iFld = 11;
                    Test.iArrFld[i19 + 1] = iArr;
                    i20 += (int)l;
                }
                i18 = i;
                iArr[i1 + 1] += (int)l;
                i20 += (i17 + i1);
                dFld += fFld1;
                Test.lArrFld[i17] *= l;
                i16 = (int)Test.fFld;
            }
            Test.instanceCount += (i1 ^ i17);
            for (i21 = 3; 70 > i21; i21++) {
                i += (int)Test.instanceCount;
                s = (short)i18;
            }
        } while (++i1 < 358);

        FuzzerUtils.out.println("i i1 s = " + i + "," + i1 + "," + s);
        FuzzerUtils.out.println("l i16 i17 = " + l + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 iArr = " + i21 + "," + i22 + "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("fArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.fFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("bFld dFld fFld1 = " + (bFld ? 1 : 0) + "," + Double.doubleToLongBits(dFld) + "," +
            Float.floatToIntBits(fFld1));
        FuzzerUtils.out.println("Test.iArrFld Test.dArrFld Test.lArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + ","
            + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
