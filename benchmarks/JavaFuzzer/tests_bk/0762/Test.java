// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-59L;
    public static float fFld=0.1016F;
    public short sFld=439;
    public double dFld=-1.40033;
    public static volatile double dArrFld[]=new double[N];
    public volatile byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 89.92697);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(long l2) {

        int iArr[]=new int[N];

        FuzzerUtils.init(iArr, 2);

        iArr = iArr;
        long meth_res = l2 + FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        long l1=-91L, lArr[]=new long[N];
        int i4=-102, i5=-9, i6=9960, i7=-9, i8=4, i9=2, i10=68, i11=32, iArr1[]=new int[N];
        boolean b=true;
        short s1=20736;
        double d=0.88206;
        float f=0.22F;

        FuzzerUtils.init(iArr1, 14);
        FuzzerUtils.init(lArr, -1566906911669552485L);

        for (l1 = 215; l1 > 13; --l1) {
            Test.instanceCount = (((-7792L - Math.max(l1, Test.instanceCount)) - (-29699 << (i4--))) + ((--i4) *
                (i4++)));
            i4 *= (i4 -= (-(6 + (--i4))));
            i4 = iMeth1(l1);
            if (false) continue;
            if (b) break;
        }
        for (i5 = 1; i5 < 314; i5 += 3) {
            i4 += (((i5 * i4) + s1) - i5);
            i7 = i6;
            d += -106.923F;
            for (i8 = 15; i8 > 1; i8--) {
                switch ((i8 % 6) + 115) {
                case 115:
                    for (i10 = 1; i10 < 2; ++i10) {
                        iArr1[i5] = (int)6861848888210534982L;
                        i9 += i7;
                    }
                    break;
                case 116:
                    b = b;
                    break;
                case 117:
                    try {
                        i7 = (i10 / i8);
                        i7 = (-18937 % i5);
                        i11 = (i10 % -4);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 118:
                    lArr[i8] |= l1;
                    break;
                case 119:
                    d /= 0.63898;
                    break;
                case 120:
                    i6 += (i8 - f);
                default:
                    Test.instanceCount += i8;
                }
            }
        }
        long meth_res = l1 + i4 + (b ? 1 : 0) + i5 + i6 + s1 + i7 + Double.doubleToLongBits(d) + i8 + i9 + i10 + i11 +
            Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(byte by, int i1) {

        int i2=14, i3=40, i12=0, i13=11, i14=16578;
        boolean b1=true;

        for (i2 = 11; i2 < 377; i2++) {
            Test.instanceCount += (-12 + (i2 * i2));
            Test.instanceCount = iMeth();
            for (i12 = 1; i12 < 5; ++i12) {
                switch (((i12 % 2) * 5) + 78) {
                case 84:
                    switch ((i12 % 1) + 67) {
                    case 67:
                        Test.dArrFld[i12 - 1] -= 35;
                        i14 = 2;
                        do {
                            i13 <<= (int)Test.instanceCount;
                            i3 -= i3;
                            Test.instanceCount = i13;
                        } while (--i14 > 0);
                        i13 = i13;
                    }
                    break;
                case 87:
                    Test.instanceCount = i1;
                    Test.instanceCount <<= -69;
                    break;
                }
                b1 = b1;
            }
        }
        vMeth_check_sum += by + i1 + i2 + i3 + i12 + i13 + i14 + (b1 ? 1 : 0);
    }

    public void mainTest(String[] strArr1) {

        long l=3L;
        int i=59713, i15=51, i16=40968, i17=-9, i18=-173, i19=99, i20=65435, i21=-11, i22=37318, i23=48, i24=20609,
            i25=-1;
        byte by1=7;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-18118);

        for (l = 3; l < 344; l += 2) {
            vMeth(by1, i);
            Test.fFld += (30555 + (l * l));
            i -= i;
        }
        for (i15 = 9; i15 < 293; i15++) {
            i17 = 1;
            do {
                i16 *= (int)l;
                i -= i15;
                Test.instanceCount *= (long)-1.646F;
                Test.instanceCount += (-53824 + (i17 * i17));
                sFld = (short)i17;
                for (i18 = i17; i18 < 1; ++i18) {
                    i = i19;
                    Test.instanceCount = i;
                    i16 += (int)dFld;
                }
                Test.instanceCount ^= i17;
            } while (++i17 < 89);
            Test.instanceCount = i17;
        }
        byArrFld[(i15 >>> 1) % N] = (byte)i18;
        i16 >>= (int)Test.instanceCount;
        dFld -= 98;
        i <<= i15;
        for (i20 = 8; i20 < 201; i20++) {
            for (i22 = i20; i22 < 130; ++i22) {
                dFld *= i18;
                for (i24 = i20; i24 < 1; i24++) {
                    i23 += (((i24 * Test.instanceCount) + Test.fFld) - Test.fFld);
                    i19 += (i24 ^ (long)Test.fFld);
                    dFld = Test.fFld;
                    dFld = i18;
                    i21 = i18;
                }
            }
        }

        FuzzerUtils.out.println("l i by1 = " + l + "," + i + "," + by1);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 sArr = " + i24 + "," + i25 + "," + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld sFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + sFld);
        FuzzerUtils.out.println("dFld Test.dArrFld byArrFld = " + Double.doubleToLongBits(dFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)) + "," + FuzzerUtils.checkSum(byArrFld));

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