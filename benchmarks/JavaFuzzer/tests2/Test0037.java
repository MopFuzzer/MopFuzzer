// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:14 2023
public class Test0037 {

    public static final int N = 400;

    public static long instanceCount=-18653L;
    public float fFld=0.922F;
    public static volatile double dFld=2.100007;
    public static short sFld=-18533;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0037.iArrFld, 182);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth(int i2) {

        int i3=-41, i4=130, i5=-35, i6=9, i7=9, i8=6, i9=8;
        short s=2410;

        for (i3 = 1; 128 > i3; i3++) {
            for (i5 = i3; i5 < 12; ++i5) {
                for (i7 = 1; 1 > i7; ++i7) {
                    i2 += i3;
                }
            }
            i9 += (i3 * i3);
            i8 = s;
        }
        vMeth_check_sum += i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + s;
    }

    public static void vMeth1(int i12, int i13, long l) {

        int i14=-2, i15=-59101, i16=-55484, i17=8, i18=-7;
        long l1=40335L;
        long[] lArr =new long[N];
        boolean b=true;
        float f=1.698F;
        byte[] byArr =new byte[N];

        FuzzerUtils.init(byArr, (byte)-39);
        FuzzerUtils.init(lArr, -10L);

        for (i14 = 4; i14 < 210; ++i14) {
            for (i16 = 1; i16 < 8; ++i16) {
                for (l1 = 1; 2 > l1; l1++) {
                    switch (((i16 % 7) * 5) + 28) {
                    case 40:
                        byArr[i14] = (byte)lArr[i16];
                        break;
                    case 36:
                        Test0037.iArrFld[i14 - 1] <<= (i18 = i12);
                        vMeth(i16);
                        switch ((int)((l1 % 2) + 61)) {
                        case 61:
                            i17 += (int)l1;
                            Test0037.instanceCount = l;
                            Test0037.instanceCount = (long) Test0037.dFld;
                            break;
                        case 62:
                            if (b) continue;
                            Test0037.instanceCount = i15;
                            i13 *= -58088;
                            Test0037.iArrFld[(int) (l1)] >>= 4;
                            break;
                        }
                        break;
                    case 42:
                        i15 = (int)f;
                    case 63:
                        i17 = i16;
                        break;
                    case 44:
                    case 48:
                        i15 += i13;
                        break;
                    case 50:
                        Test0037.sFld += (short) (((l1 * l) + i12) - i12);
                    default:
                        Test0037.iArrFld[i16] *= 113;
                    }
                }
            }
        }
        vMeth1_check_sum += i12 + i13 + l + i14 + i15 + i16 + i17 + l1 + i18 + (b ? 1 : 0) + Float.floatToIntBits(f) +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth() {

        int i10=-34, i11=51590, i19=-106, i20=12;
        float f1=0.1013F;

        for (i10 = 177; i10 > 4; i10--) {
            vMeth1(-9, i10, 3113365469L);
            f1 = -20;
            Test0037.iArrFld = Test0037.iArrFld;
            for (i19 = 9; i19 > i10; --i19) {
                i20 += i20;
                Test0037.sFld = Test0037.sFld;
            }
            if (i20 != 0) {
            }
            i20 += (i10 | i10);
        }
        long meth_res = i10 + i11 + Float.floatToIntBits(f1) + i19 + i20;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-13, i1=242, i21=-64, i22=22324, i23=-11, i24=-158, i25=-7, i26=43174;
        byte by=-77;
        byte[] byArr1 =new byte[N];
        float f2=0.632F;
        long[] lArr1 =new long[N];
        short[] sArr =new short[N];

        FuzzerUtils.init(byArr1, (byte)-14);
        FuzzerUtils.init(lArr1, -127L);
        FuzzerUtils.init(sArr, (short)4901);

        for (i = 374; 17 < i; i -= 3) {
            vMeth(49);
            i1 += i;
            fFld = ((fFld *= i) - (i - iMeth()));
            for (i21 = 211; i21 > 1; i21 -= 2) {
                i22 += (28 + (i21 * i21));
                switch (((i >>> 1) % 2) + 5) {
                case 5:
                    i22 += -14;
                    break;
                case 6:
                    switch ((i % 10) + 81) {
                    case 81:
                        Test0037.instanceCount = Test0037.instanceCount;
                    case 82:
                        byArr1 = byArr1;
                        for (i23 = i21; i23 < 3; i23++) {
                            i22 &= (int) Test0037.instanceCount;
                            i1 -= i22;
                        }
                        break;
                    case 83:
                    case 84:
                        switch ((i21 % 9) + 127) {
                        case 127:
                            i1 += 37129;
                            for (i25 = 1; i25 < 3; i25++) {
                                lArr1[i] += i23;
                                switch ((i21 % 2) + 27) {
                                case 27:
                                    Test0037.instanceCount -= i21;
                                    break;
                                case 28:
                                    by += (byte)53.584F;
                                    break;
                                }
                                Test0037.instanceCount = i1;
                                i26 = i26;
                                i24 -= (int) Test0037.instanceCount;
                                i22 = i25;
                            }
                            i22 = i24;
                            Test0037.sFld += (short) (i21 * i21);
                            break;
                        case 128:
                            i22 += (12682 + (i21 * i21));
                            break;
                        case 129:
                            i22 += (((i21 * i22) + f2) - i26);
                            sArr[i] *= (short)i1;
                            break;
                        case 130:
                            i24 *= (int) Test0037.instanceCount;
                            break;
                        case 131:
                            i24 += (i21 * i21);
                        case 132:
                            Test0037.instanceCount += (-25114 + (i21 * i21));
                            break;
                        case 133:
                            i24 = (int)-47.11551;
                            break;
                        case 134:
                            i1 = (int)1455204786285145020L;
                            break;
                        case 135:
                            Test0037.instanceCount += i21;
                        default:
                        }
                        break;
                    case 85:
                        byArr1 = byArr1;
                        break;
                    case 86:
                        Test0037.dFld = i22;
                        break;
                    case 87:
                        Test0037.iArrFld[i21] = i25;
                        break;
                    case 88:
                        i26 += (int) Test0037.instanceCount;
                        break;
                    case 89:
                        f2 *= i;
                    case 90:
                        i26 += -34081;
                        break;
                    }
                    break;
                default:
                    Test0037.instanceCount -= (long) f2;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i21 = " + i + "," + i1 + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 by = " + i25 + "," + i26 + "," + by);
        FuzzerUtils.out.println("f2 byArr1 lArr1 = " + Float.floatToIntBits(f2) + "," + FuzzerUtils.checkSum(byArr1) +
            "," + FuzzerUtils.checkSum(lArr1));
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test0037.instanceCount fFld Test0037.dFld = " + Test0037.instanceCount + "," +
                Float.floatToIntBits(fFld) + "," + Double.doubleToLongBits(Test0037.dFld));
        FuzzerUtils.out.println("Test0037.sFld Test0037.iArrFld = " + Test0037.sFld + "," + FuzzerUtils.checkSum(Test0037.iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0037 _instance = new Test0037();
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
//DEBUG  vMeth ->  vMeth mainTest vMeth1 iMeth
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}