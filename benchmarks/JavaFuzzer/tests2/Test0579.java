// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:39 2023
public class Test0579 {

    public static final int N = 400;

    public static long instanceCount=-13L;
    public static int iFld=-99;
    public static volatile byte byFld=-96;
    public static volatile boolean bFld=true;
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0579.lArrFld, -11L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l, byte by) {

        int i6=14;
        int i7=131;
        int i8=217;
        int i9=-12698;
        int i10=210;
        int i11=14;
        int[] iArr =new int[N];
        double d1=-2.6375;
        long[] lArr =new long[N];
        short[] sArr =new short[N];

        FuzzerUtils.init(iArr, 0);
        FuzzerUtils.init(lArr, 3551966806377564651L);
        FuzzerUtils.init(sArr, (short)32715);

        i6 = 322;
        do {
            for (i7 = 1; i7 < 5; i7++) {
                iArr[i7 - 1] = i7;
                try {
                    iArr[i6 - 1] = (-1868561466 % i7);
                    i8 = (Test0579.iFld % 149);
                    i8 = (i6 / -4);
                } catch (ArithmeticException a_e) {}
            }
            Test0579.instanceCount |= Test0579.iFld;
            i9 = 1;
            while ((i9 += 3) < 5) {
                by += (byte)d1;
                i8 = (int)1.414F;
                sArr[i9] >>= (short) Test0579.instanceCount;
                for (i10 = 1; i10 < 5; i10++) {
                    i8 *= i9;
                    Test0579.iFld = by;
                    i11 -= (int)d1;
                    d1 -= 144;
                    Test0579.iFld |= i10;
                }
            }
        } while (--i6 > 0);
        long meth_res = l + by + i6 + i7 + i8 + i9 + Double.doubleToLongBits(d1) + i10 + i11 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i3) {

        double d=2.53679;
        int i4=-10840, i5=-12;
        float f=-16.755F;

        for (d = 13; d < 224; ++d) {
            i5 = 1;
            while (++i5 < 8) {
                i3 = i4;
                if (Math.max(i3, iMeth(Test0579.instanceCount, Test0579.byFld)) < -174) continue;
                i3 += -796;
            }
        }
        f = i4;
        vMeth1_check_sum += i3 + Double.doubleToLongBits(d) + i4 + i5 + Float.floatToIntBits(f);
    }

    public static void vMeth() {

        int i12=21;
        int i13=-11523;
        int i14=-17942;
        int i15=-15467;
        int i16=238;
        int i17=41192;
        int[][] iArr1 =new int[N][N];
        boolean b=true;
        float f1=0.785F;
        short s=-31068;

        FuzzerUtils.init(iArr1, 25251);

        if (b) {
            vMeth1(Test0579.iFld);
            for (i12 = 11; i12 < 350; i12++) {
                b = b;
                if (i12 != 0) {
                    vMeth_check_sum += i12 + i13 + (b ? 1 : 0) + i14 + i15 + i16 + Float.floatToIntBits(f1) + i17 + s +
                        FuzzerUtils.checkSum(iArr1);
                    return;
                }
            }
            iArr1 = FuzzerUtils.int2array(N, (int)41510);
        } else if (false) {
            Test0579.iFld = (int) 76.94F;
            for (i14 = 9; i14 < 302; ++i14) {
                Test0579.instanceCount >>>= i15;
                iArr1[i14 + 1][(i14 >>> 1) % N] ^= i14;
                i13 = (int)1.349F;
                i16 = 1;
                while (++i16 < 6) {
                    for (f1 = 1; f1 < 1; f1++) {
                        iArr1[i14 + 1][i16 + 1] -= s;
                        i15 += (int) (f1 + Test0579.iFld);
                    }
                }
            }
        }
        vMeth_check_sum += i12 + i13 + (b ? 1 : 0) + i14 + i15 + i16 + Float.floatToIntBits(f1) + i17 + s +
            FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=34873, i1=-63, i2=-25, i18=-79, i19=10, i20=0, i21=17044, i22=6;
        short s1=18304;
        short[] sArr1 =new short[N];

        FuzzerUtils.init(sArr1, (short)-11412);

        Test0579.instanceCount >>= (++Test0579.iFld);
        for (i = 6; i < 288; i++) {
            i2 = 1;
            while (++i2 < 89) {
                vMeth();
            }
            switch ((i % 3) + 92) {
            case 92:
                Test0579.iFld <<= i;
                Test0579.instanceCount = Test0579.iFld;
                Test0579.lArrFld[i - 1] = i1;
            case 93:
                Test0579.iFld = i;
                for (i18 = i; 89 > i18; i18++) {
                    i1 = i;
                    i20 = 1;
                    while (++i20 < 1) {
                        Test0579.instanceCount += (i20 * i20);
                        i19 = i;
                        i1 += i20;
                        i19 = (int) Test0579.instanceCount;
                        Test0579.iFld += (int) Test0579.instanceCount;
                        if (Test0579.bFld) break;
                    }
                    sArr1[i18 - 1] = (short) Test0579.instanceCount;
                    i19 |= i20;
                    for (i21 = 1; i21 < 1; i21++) {
                        Test0579.instanceCount >>= i21;
                        switch ((i % 2) + 101) {
                        case 101:
                            switch (((i % 2) * 5) + 51) {
                            case 59:
                                Test0579.instanceCount /= (i19 | 1);
                            case 61:
                                Test0579.lArrFld[i21 - 1] = 56863;
                                break;
                            default:
                                s1 = (short) Test0579.iFld;
                                i19 = (int)-69.85910;
                                i22 = i2;
                            }
                            break;
                        case 102:
                            i1 += (i21 * i21);
                            break;
                        default:
                            i22 &= 6;
                        }
                    }
                }
                break;
            case 94:
                Test0579.iFld -= -56661;
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 s1 = " + i21 + "," + i22 + "," + s1);
        FuzzerUtils.out.println("sArr1 = " + FuzzerUtils.checkSum(sArr1));

        FuzzerUtils.out.println("Test0579.instanceCount Test0579.iFld Test0579.byFld = " + Test0579.instanceCount + "," + Test0579.iFld +
                "," + Test0579.byFld);
        FuzzerUtils.out.println("Test0579.bFld Test0579.lArrFld = " + (Test0579.bFld ? 1 : 0) + "," +
                FuzzerUtils.checkSum(Test0579.lArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0579 _instance = new Test0579();
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
