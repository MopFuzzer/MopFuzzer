// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:49 2023
public class Test0785 {

    public static final int N = 400;

    public static volatile long instanceCount=2270856641L;
    public static double dFld=-74.32603;
    public static float fFld=-2.815F;
    public int iFld=37805;
    public int iFld1=78;
    public static short sFld=-15271;
    public int[] iArrFld =new int[N];
    public boolean[] bArrFld =new boolean[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i1) {

        int i2=155;
        int i3=-254;
        int i4=15784;
        int i5=-11;
        int i6=48707;
        int[] iArr =new int[N];
        long l=-49412L;

        FuzzerUtils.init(iArr, -51847);

        iArr[(-41 >>> 1) % N] += (int)7L;
        Test0785.instanceCount = (long) Test0785.fFld;
        i1 -= i1;
        for (i2 = 9; i2 < 169; ++i2) {
            i3 = (int)l;
            i1 = (int) Test0785.instanceCount;
            i1 = (int) Test0785.instanceCount;
            i4 = 1;
            while (++i4 < 10) {
                i3 = i2;
            }
            iArr[i2 + 1] = i1;
            try {
                i1 = (iArr[i2 - 1] % 1196908433);
                iArr[i2 + 1] = (i2 % 1162471802);
                i1 = (i1 / -43521);
            } catch (ArithmeticException a_e) {}
            for (i5 = i2; i5 < 10; ++i5) {
                i1 += (((i5 * i4) + i5) - i2);
                i3 += (int) Test0785.instanceCount;
                Test0785.fFld *= i4;
            }
        }
        vMeth2_check_sum += i1 + i2 + i3 + l + i4 + i5 + i6 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1() {

        int i7=-208;
        int i8=-10;
        int i9=5;
        int i10=-43;
        int i11=-51;
        int i12=8;
        int[] iArr1 =new int[N];
        short s=-11154;

        FuzzerUtils.init(iArr1, 8);

        vMeth2(i7);
        i7 = i7;
        for (i8 = 4; i8 < 333; i8++) {
            iArr1 = FuzzerUtils.int1array(N, (int)7);
            i9 += (((i8 * Test0785.instanceCount) + i9) - i7);
            i9 += (-9 + (i8 * i8));
            i10 = 1;
            do {
                i7 >>>= (int)-2292874440L;
            } while (++i10 < 5);
            iArr1[i8 - 1] = i7;
            s = (short) Test0785.instanceCount;
            for (i11 = 1; i11 < 5; i11++) {
                i9 -= i7;
                try {
                    i12 = (iArr1[i11] / 13206);
                    i7 = (i10 % -49705);
                    i9 = (-22744 % i10);
                } catch (ArithmeticException a_e) {}
                Test0785.instanceCount += (long) Test0785.fFld;
                try {
                    i9 = (i9 % i12);
                    i7 = (i10 / iArr1[i8 - 1]);
                    i7 = (i7 / -188);
                } catch (ArithmeticException a_e) {}
            }
        }
        vMeth1_check_sum += i7 + i8 + i9 + i10 + s + i11 + i12 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i) {

        int i13=-10415;
        int i14=-100;
        int i15=9;
        int i16=-53;
        int i17=3;
        int[] iArr2 =new int[N];
        short s1=19238;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -161L);
        FuzzerUtils.init(iArr2, 62);

        Test0785.dFld += (lArr[(i >>> 1) % N] + ((i + Test0785.instanceCount) + i));
        vMeth1();
        i13 = 1;
        while (++i13 < 195) {
            boolean b=true;
            for (i14 = 1; i14 < 8; ++i14) {
                i16 = 1;
                while (++i16 < 2) {
                    iArr2[i13] = i13;
                    Test0785.fFld *= Test0785.instanceCount;
                    i15 *= i;
                }
                i <<= (int) Test0785.instanceCount;
            }
            b = b;
            i15 += i;
            i17 = 1;
            do {
                lArr[(i >>> 1) % N] = Test0785.instanceCount;
                iArr2[i17 + 1] >>= i13;
                Test0785.fFld -= s1;
            } while (++i17 < 8);
        }
        vMeth_check_sum += i + i13 + i14 + i15 + i16 + i17 + s1 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        boolean b1=true;
        int i18=3, i19=49, i20=67, i21=23403, i22=-32508, i23=-200, i24=3;
        byte by=27;
        float f=76.315F;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(lArr1, 86L);

        vMeth(iFld);
        b1 = b1;
        iArrFld = iArrFld;
        bArrFld[(iFld >>> 1) % N] = false;
        for (i18 = 1; i18 < 177; i18++) {
            iFld1 = iFld1;
            iFld1 = i19;
            lArr1[i18 + 1] = i18;
        }
        for (i20 = 4; i20 < 176; i20++) {
            for (i22 = 6; i22 < 146; i22++) {
                i21 += (((i22 * Test0785.sFld) + i20) - Test0785.fFld);
                Test0785.instanceCount += (long) Test0785.fFld;
                Test0785.instanceCount -= -5;
                try {
                    i19 = (i20 % -191);
                    iArrFld[i20 + 1] = (iArrFld[i20 - 1] / 1869383704);
                    iArrFld[i20 - 1] = (i22 / 912386633);
                } catch (ArithmeticException a_e) {}
                i21 -= i23;
                i23 <<= Test0785.sFld;
                i23 -= iFld1;
                i23 = i21;
            }
            switch ((i20 % 8) + 82) {
            case 82:
                i19 += (-6 + (i20 * i20));
                iFld = (int) Test0785.instanceCount;
                Test0785.fFld += Test0785.fFld;
                break;
            case 83:
                Test0785.dFld *= by;
                for (f = 146; f > 1; f--) {
                    i23 -= i19;
                    i23 = (int) Test0785.instanceCount;
                    iFld1 += i19;
                    iArrFld = iArrFld;
                    i23 >>= 11;
                    lArr1[i20 + 1] += Test0785.instanceCount;
                }
                break;
            case 84:
                i19 -= (int) Test0785.fFld;
                break;
            case 85:
                i19 += (i20 * i20);
                break;
            case 86:
                Test0785.instanceCount += iFld1;
            case 87:
                i23 = -15383;
            case 88:
                i21 -= i19;
                break;
            case 89:
                i23 *= i21;
                break;
            }
        }

        FuzzerUtils.out.println("b1 i18 i19 = " + (b1 ? 1 : 0) + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 by f = " + i23 + "," + by + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i24 lArr1 = " + i24 + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test0785.instanceCount Test0785.dFld Test0785.fFld = " + Test0785.instanceCount + "," +
                Double.doubleToLongBits(Test0785.dFld) + "," + Float.floatToIntBits(Test0785.fFld));
        FuzzerUtils.out.println("iFld iFld1 Test0785.sFld = " + iFld + "," + iFld1 + "," + Test0785.sFld);
        FuzzerUtils.out.println("iArrFld bArrFld = " + FuzzerUtils.checkSum(iArrFld) + "," +
            FuzzerUtils.checkSum(bArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0785 _instance = new Test0785();
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
