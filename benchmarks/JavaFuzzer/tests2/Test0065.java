// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:15 2023
public class Test0065 {

    public static final int N = 400;

    public static long instanceCount=160L;
    public static byte byFld=18;
    public static volatile int iFld=-58323;
    public float fFld=0.577F;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i4, int i5) {

        int i6=13;
        int i7=7311;
        int i8=223;
        int i9=-14;
        int i10=-169;
        int i11=37;
        int[] iArr2 =new int[N];
        boolean b=true;

        FuzzerUtils.init(iArr2, -34668);

        i5 = i4;
        for (i6 = 10; i6 < 233; ++i6) {
            for (i8 = 1; i8 < 7; i8 += 3) {
                switch (((i8 % 2) * 5) + 59) {
                case 65:
                    if (b) continue;
                    Test0065.instanceCount -= -35385;
                    i7 = -9;
                    break;
                case 63:
                    i9 += i8;
                    i4 += (((i8 * i7) + i5) - i6);
                    Test0065.instanceCount -= i7;
                    iArr2[i8 + 1] += (int)233L;
                default:
                    if (i5 != 0) {
                    }
                    for (i10 = 1; i10 < 4; i10++) {
                        Test0065.instanceCount -= -15006;
                        Test0065.byFld += Test0065.byFld;
                    }
                }
            }
        }
        long meth_res = i4 + i5 + i6 + i7 + i8 + i9 + (b ? 1 : 0) + i10 + i11 + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i2) {

        int i12=-14427;
        int i13=3;
        int i14=-12;
        int i15=-3474;
        int i16=-9;
        int[] iArr1 =new int[N];
        short s=15019;
        float f=0.804F;

        FuzzerUtils.init(iArr1, -13);

        for (int i3 : iArr1) {
            Test0065.instanceCount *= i2;
            iMeth(i2, i3);
            for (i12 = 1; 4 > i12; i12++) {
                Test0065.instanceCount = 0;
                i14 = 1;
                do {
                    i13 -= (int) Test0065.instanceCount;
                    s = (short)i3;
                    Test0065.instanceCount = (long) f;
                    i3 += i14;
                    i13 -= i13;
                } while (++i14 < 2);
                for (i15 = i12; i15 < 2; i15++) {
                    boolean b1=true;
                    Test0065.instanceCount += (((i15 * i2) + i16) - Test0065.instanceCount);
                    b1 = b1;
                    iArr1[i15] -= 14;
                }
            }
        }
        vMeth1_check_sum += i2 + i12 + i13 + i14 + s + Float.floatToIntBits(f) + i15 + i16 +
            FuzzerUtils.checkSum(iArr1);
    }

    public void vMeth() {

        int[] iArr3 =new int[N];

        FuzzerUtils.init(iArr3, 52166);

        vMeth1(Test0065.iFld);
        fFld = Test0065.iFld;
        Test0065.iFld = Test0065.iFld;
        Test0065.instanceCount >>>= Test0065.iFld;
        for (int i17 : iArr3) {
            Test0065.instanceCount -= 41802;
        }
        vMeth_check_sum += FuzzerUtils.checkSum(iArr3);
    }

    public void mainTest(String[] strArr1) {

        double d=1.96397;
        int i=-57559;
        int i18=40387;
        int i19=-133;
        int i20=65303;
        int i21=-14;
        int i22=-1;
        int i24=80;
        int i25=-65233;
        int i26=230;
        int i27=-44368;
        int i28=-201;
        int[] iArr =new int[N];
        short s1=-25786;
        boolean b2=true;

        FuzzerUtils.init(iArr, 9);

        d = (61870 / ((i--) | 1));
        for (int i1 : iArr) {
            vMeth();
            i18 = 1;
            while (++i18 < 63) {
                iArr[i18 + 1] = -232;
            }
            iArr[(i18 >>> 1) % N] = (int)-119L;
            for (i19 = 2; i19 < 63; ++i19) {
                i >>= s1;
            }
            iArr[(i20 >>> 1) % N] = Test0065.iFld;
            Test0065.instanceCount %= ((long) (fFld) | 1);
        }
        Test0065.iFld = i19;
        i += i;
        b2 = b2;
        for (i21 = 13; i21 < 248; i21++) {
            i22 = 52732;
            Test0065.instanceCount *= i19;
            Test0065.iFld = (int) Test0065.instanceCount;
            for (i24 = 107; 5 < i24; --i24) {
                if (b2) break;
                i26 = 2;
                do {
                    Test0065.instanceCount = -850L;
                } while (--i26 > 0);
                i22 += (((i24 * Test0065.instanceCount) + i19) - i21);
            }
            Test0065.iFld *= (int) Test0065.instanceCount;
            if (b2) break;
            Test0065.instanceCount >>>= i19;
        }
        Test0065.instanceCount -= (long) d;
        Test0065.instanceCount = i21;
        for (i27 = 5; i27 < 359; i27++) {
            i += (((i27 * i26) + i18) - Test0065.instanceCount);
            fFld *= (float)-1.25953;
        }

        FuzzerUtils.out.println("d i i18 = " + Double.doubleToLongBits(d) + "," + i + "," + i18);
        FuzzerUtils.out.println("i19 i20 s1 = " + i19 + "," + i20 + "," + s1);
        FuzzerUtils.out.println("b2 i21 i22 = " + (b2 ? 1 : 0) + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 iArr = " + i27 + "," + i28 + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0065.instanceCount Test0065.byFld Test0065.iFld = " + Test0065.instanceCount + "," + Test0065.byFld +
                "," + Test0065.iFld);
        FuzzerUtils.out.println("fFld = " + Float.floatToIntBits(fFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0065 _instance = new Test0065();
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
