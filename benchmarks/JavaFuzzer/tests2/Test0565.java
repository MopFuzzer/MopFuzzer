// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:38 2023
public class Test0565 {

    public static final int N = 400;

    public static long instanceCount=63834L;
    public static int iFld=-8;
    public static byte byFld=112;
    public static boolean bFld=false;
    public static double dFld=-2.37054;

    public static long vMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i13=9;
        int i14=-93;
        int i15=-51915;
        int i16=9;
        int i17=56;
        int i18=56812;
        int i19=9;
        int[] iArr2 =new int[N];
        float f2=-1.405F;
        short s=-4104;

        FuzzerUtils.init(iArr2, -128);

        for (i13 = 2; i13 < 182; i13++) {
            i14 = Test0565.byFld;
            Test0565.instanceCount -= i15;
            i15 += (int)f2;
            i14 -= Test0565.byFld;
        }
        for (i16 = 10; 315 > i16; ++i16) {
            switch ((i16 % 3) + 57) {
            case 57:
                for (i18 = 1; 5 > i18; i18++) {
                    Test0565.bFld = Test0565.bFld;
                    i19 += (i18 + i14);
                    s += (short)i18;
                    iArr2[i16] = i18;
                    i17 = (int) Test0565.instanceCount;
                    i17 -= (int)2.31893;
                    Test0565.iFld += (i18 | Test0565.instanceCount);
                }
                break;
            case 58:
                if (Test0565.bFld) break;
            case 59:
                iArr2[i16 - 1] = s;
                break;
            }
        }
        vMeth1_check_sum += i13 + i14 + i15 + Float.floatToIntBits(f2) + i16 + i17 + i18 + i19 + s +
            FuzzerUtils.checkSum(iArr2);
    }

    public static byte byMeth(byte by, int i9, int i10) {

        int i11=-127;
        int i12=50;
        int i20=5;
        int i21=6809;
        int i22=22989;
        int i23=-7;
        int[] iArr1 =new int[N];
        float f1=18.566F;
        double d=-2.31726;
        long l=9615L;
        short s1=-5055;

        FuzzerUtils.init(iArr1, 43420);

        for (i11 = 22; i11 < 357; i11++) {
            f1 = (float)(f1 - (i12 * (i9 -= (int)d)));
            iArr1 = FuzzerUtils.int1array(N, (int)-62930);
            vMeth1();
            d = i12;
            Test0565.iFld = (int) Test0565.instanceCount;
            i12 += (i11 | i11);
            Test0565.iFld += (i11 | i20);
            i20 ^= (int)-8288179730835215702L;
            for (l = 1; l < 5; l++) {
                for (i22 = 1; i22 < 2; ++i22) {
                    if (Test0565.bFld) continue;
                }
                s1 -= (short) Test0565.iFld;
                i21 += (int)l;
                s1 = (short) Test0565.instanceCount;
            }
        }
        long meth_res = by + i9 + i10 + i11 + i12 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) + i20 + l +
            i21 + i22 + i23 + s1 + FuzzerUtils.checkSum(iArr1);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public static void vMeth() {

        int i6=26049;
        int i7=43226;
        int i8=6;
        int i24=-224;
        int i25=-7;
        int i26=3;
        int i27=-12;
        int i28=-31946;
        int[] iArr =new int[N];
        float f=2.878F, f3=-109.409F;
        short s2=-30714;

        FuzzerUtils.init(iArr, 57384);

        iArr[(-10 >>> 1) % N] ^= Test0565.iFld;
        i6 = 1;
        do {
            for (i7 = i6; i7 < 8; i7 += 2) {
                f *= (Test0565.instanceCount - byMeth(Test0565.byFld, i6, i8));
                for (i24 = 1; 1 < i24; i24 -= 2) {
                    i8 += (((i24 * Test0565.instanceCount) + Test0565.iFld) - Test0565.iFld);
                    i8 += (i24 - Test0565.iFld);
                    s2 = (short) Test0565.instanceCount;
                }
            }
            switch ((i6 % 7) + 97) {
            case 97:
                i25 += i6;
                break;
            case 98:
                for (f3 = i6; f3 < 8; f3++) {
                    for (i27 = 1; i27 < 1; i27++) {
                        Test0565.instanceCount *= Test0565.iFld;
                        Test0565.byFld <<= (byte) -8358;
                        iArr[(int)(f3 - 1)] *= (int)9.55788;
                    }
                }
                break;
            case 99:
                i26 <<= (int) Test0565.instanceCount;
                break;
            case 100:
                i26 -= 149;
                break;
            case 101:
                iArr[i6] >>= i8;
                break;
            case 102:
                Test0565.byFld -= (byte) Test0565.dFld;
                break;
            case 103:
                i28 = i7;
                break;
            }
        } while (++i6 < 203);
        vMeth_check_sum += i6 + i7 + i8 + Float.floatToIntBits(f) + i24 + i25 + s2 + Float.floatToIntBits(f3) + i26 +
            i27 + i28 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-74;
        int i1=-6637;
        int i2=39;
        int i3=10;
        int i4=50;
        int i5=7;
        int i29=59;
        int i30=84;
        int i31=-134;
        int i32=55828;
        int[] iArr3 =new int[N];
        float f4=-70.21F;
        double d1=0.112519;

        FuzzerUtils.init(iArr3, -8);

        for (i = 9; i < 165; i++) {
            for (i2 = 4; 161 > i2; ++i2) {
                long l1=-2L;
                for (i4 = 1; i4 < 2; ++i4) {
                    Test0565.instanceCount = (i5++);
                }
                vMeth();
                Test0565.iFld >>= i;
                l1 += (i2 * i2);
                for (i29 = 1; i29 < 2; i29++) {
                    l1 = (long)f4;
                    Test0565.dFld += Test0565.iFld;
                }
                iArr3[i2] = i2;
                iArr3[i + 1] += (int) Test0565.dFld;
                if (Test0565.bFld) continue;
                if (Test0565.bFld) break;
            }
            for (i31 = 161; i31 > i; --i31) {
                i32 += (i31 - Test0565.iFld);
                iArr3[i31] = i3;
                d1 = 1;
                while (++d1 < 1) {
                    i5 -= (int)f4;
                    Test0565.byFld += (byte) d1;
                    i1 += i29;
                    f4 += (float)d1;
                    Test0565.byFld = (byte) i1;
                    if (Test0565.bFld) {
                        Test0565.dFld -= i4;
                    } else if (Test0565.bFld) {
                        i32 = i1;
                        i5 -= i;
                        Test0565.instanceCount <<= i31;
                    } else if (false) {
                        i5 -= 3287;
                        i32 -= (int) Test0565.instanceCount;
                    } else {
                        i30 = i5;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 i5 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("i29 i30 f4 = " + i29 + "," + i30 + "," + Float.floatToIntBits(f4));
        FuzzerUtils.out.println("i31 i32 d1 = " + i31 + "," + i32 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("iArr3 = " + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test0565.instanceCount Test0565.iFld Test0565.byFld = " + Test0565.instanceCount + "," + Test0565.iFld +
                "," + Test0565.byFld);
        FuzzerUtils.out.println("Test0565.bFld Test0565.dFld = " + (Test0565.bFld ? 1 : 0) + "," +
                Double.doubleToLongBits(Test0565.dFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0565 _instance = new Test0565();
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
//DEBUG  byMeth ->  byMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 byMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
