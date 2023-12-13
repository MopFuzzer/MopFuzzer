// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:04 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=11L;
    public static int iFld=-32;
    public static boolean bFld=false;
    public static double dFld=-2.23469;
    public static float fFld=2.676F;

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static int iMeth2(boolean b, double d, int i5) {


        d = i5;
        Test.iFld %= -10382;
        i5 = i5;
        long meth_res = (b ? 1 : 0) + Double.doubleToLongBits(d) + i5;
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(int i3, int i4, float f) {


        i3 = (((Test.iFld--) * iMeth2(Test.bFld, Test.dFld, Test.iFld)) + Test.iFld);
        long meth_res = i3 + i4 + Float.floatToIntBits(f);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(byte by, int i) {

        int i1=-49454, i2=-23884, i6=-64280, i7=107, i8=117, i9=-11, i10=-53914, iArr[]=new int[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, 14);
        FuzzerUtils.init(fArr, -12.727F);

        for (i1 = 260; i1 > 10; --i1) {
            iArr[i1] -= (iMeth1(27275, -5539, 0.837F) * -3);
            Test.instanceCount += (i1 * i1);
            for (i6 = 1; i6 < 7; ++i6) {
                Test.fFld -= i;
                Test.dFld -= i2;
                try {
                    i2 = (Test.iFld % i);
                    Test.iFld = (-17648 / iArr[i6]);
                    i7 = (i1 % iArr[i6]);
                } catch (ArithmeticException a_e) {}
                for (i8 = 1; 2 > i8; ++i8) {
                    switch (((-7 >>> 1) % 5) + 20) {
                    case 20:
                        Test.iFld = i9;
                        i7 &= (int)Test.instanceCount;
                        i7 += (((i8 * Test.fFld) + i7) - i8);
                        break;
                    case 21:
                        Test.fFld = i10;
                        break;
                    case 22:
                        i += (i8 * i8);
                        Test.fFld = i8;
                        break;
                    case 23:
                        fArr[i8 - 1] -= Test.instanceCount;
                        break;
                    case 24:
                        iArr = iArr;
                        break;
                    default:
                        Test.instanceCount = i6;
                    }
                }
            }
        }
        long meth_res = by + i + i1 + i2 + i6 + i7 + i8 + i9 + i10 + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by1=-112;
        int i11=-109, i12=-108, i13=14, i14=63419, i15=-12389, i16=16, i17=-198, i18=-42039, i19=0, i20=-53824,
            i21=154, i22=-46173, i23=-194, iArr1[][]=new int[N][N], iArr2[]=new int[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)18317);
        FuzzerUtils.init(iArr1, -33833);
        FuzzerUtils.init(iArr2, -85);

        if (Test.bFld) {
            sArr[(Test.iFld >>> 1) % N] -= (short)iMeth(by1, Test.iFld);
            Test.instanceCount += 9;
            i11 = 1;
            while (++i11 < 156) {
                Test.iFld >>= Test.iFld;
            }
        }
        for (i12 = 18; i12 < 342; i12++) {
            i13 += i12;
            Test.dFld -= -14;
            Test.dFld = i12;
            iArr1[i12][i12 - 1] = Test.iFld;
        }
        for (i14 = 16; i14 < 395; i14++) {
            Test.instanceCount += (i14 * i14);
            i13 <<= -4;
            if (Test.bFld) break;
            for (i16 = 3; i16 < 66; ++i16) {
                Test.dFld += -163L;
            }
            for (i18 = i14; i18 < 66; i18++) {
                i15 = i16;
            }
            try {
                i13 = (195 / i18);
                i17 = (iArr2[i14 - 1] % 172);
                iArr1[i14 - 1][i14] = (-264372401 / i19);
            } catch (ArithmeticException a_e) {}
            i13 = Test.iFld;
        }
        for (i20 = 5; i20 < 123; i20++) {
            for (i22 = 212; i22 > 13; --i22) {
                i21 += i20;
                i23 = (int)Test.instanceCount;
                by1 *= by1;
            }
            Test.fFld += -44199;
            i21 = i15;
            i19 += (((i20 * i19) + i13) - i21);
            i23 = Test.iFld;
            Test.instanceCount >>>= -58L;
        }

        FuzzerUtils.out.println("by1 i11 i12 = " + by1 + "," + i11 + "," + i12);
        FuzzerUtils.out.println("i13 i14 i15 = " + i13 + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 sArr = " + i22 + "," + i23 + "," + FuzzerUtils.checkSum(sArr));
        FuzzerUtils.out.println("iArr1 iArr2 = " + FuzzerUtils.checkSum(iArr1) + "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.bFld = " + Test.instanceCount + "," + Test.iFld +
            "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.dFld Test.fFld = " + Double.doubleToLongBits(Test.dFld) + "," +
            Float.floatToIntBits(Test.fFld));

        FuzzerUtils.out.println("iMeth2_check_sum: " + iMeth2_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}