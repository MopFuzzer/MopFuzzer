// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:46 2023
public class Test0734 {

    public static final int N = 400;

    public static long instanceCount=-4259786142797062569L;
    public static float fFld=-2.185F;
    public static boolean bFld=true;
    public double dFld=0.122814;
    public static float[] fArrFld =new float[N];
    public static long[] lArrFld =new long[N];
    public static volatile int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0734.fArrFld, -26.870F);
        FuzzerUtils.init(Test0734.lArrFld, -3125083106L);
        FuzzerUtils.init(Test0734.iArrFld, -6);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        byte by1=-48;
        byte[] byArr =new byte[N];
        int i5=-7;
        int i6=-233;
        int i7=-1;
        int i8=13;
        int[] iArr =new int[N];
        short s1=26703;

        FuzzerUtils.init(iArr, -130);
        FuzzerUtils.init(byArr, (byte)77);

        by1 -= by1;
        Test0734.instanceCount -= 92;
        Test0734.lArrFld[(i5 >>> 1) % N] <<= i5;
        i6 = 1;
        while ((i6 += 3) < 362) {
            switch ((i6 % 2) + 58) {
            case 58:
                if (Test0734.bFld) continue;
                i5 = (int) Test0734.instanceCount;
                i5 += (((i6 * i5) + i6) - i6);
                break;
            case 59:
                iArr[i6] = (int) Test0734.instanceCount;
            }
        }
        for (i7 = 2; i7 < 253; i7++) {
            if (i7 != 0) {
            }
            Test0734.fArrFld[i7 + 1] += 89.181F;
            i8 = s1;
        }
        i8 *= -48;
        Test0734.instanceCount = i5;
        long meth_res = by1 + i5 + i6 + i7 + i8 + s1 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(byArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l) {

        byte by=101;
        int i4=-9, i9=-43939, i10=8;
        short s=-5709;
        double d=-1.73201;

        by -= (byte)((i4--) - ((s += (short)13) - d));
        for (float f : Test0734.fArrFld) {
            i4 = (((i4--) + iMeth1()) * i4);
            Test0734.instanceCount >>= i4;
            for (i9 = 1; i9 < 4; ++i9) {
                i4 = s;
                i10 |= 108;
                s *= (short)7826;
                f = f;
                if (Test0734.bFld) {
                    Test0734.lArrFld[i9 - 1] |= i10;
                    Test0734.instanceCount *= 6747;
                    Test0734.instanceCount = i4;
                } else if (Test0734.bFld) {
                    i10 = 48032;
                } else {
                    i10 = i9;
                }
            }
        }
        vMeth_check_sum += l + by + i4 + s + Double.doubleToLongBits(d) + i9 + i10;
    }

    public int iMeth() {

        byte by3=1;
        int i11=0;
        int i12=-4;
        int i13=67;
        int i14=-7;
        int i15=34020;
        int i16=-8133;
        int i17=-3;
        int[][] iArr1 =new int[N][N];

        FuzzerUtils.init(iArr1, 44);

        vMeth(Test0734.instanceCount);
        by3 = (byte)8L;
        if (Test0734.bFld) {
            i11 *= -38548;
            for (i12 = 283; i12 > 8; i12--) {
                for (i14 = 6; i14 > 1; i14 -= 3) {
                    for (i16 = 6; i16 > 1; i16 -= 2) {
                        Test0734.instanceCount = i15;
                        i13 += i12;
                        iArr1[i14][i12 + 1] *= (int) Test0734.instanceCount;
                        switch ((i16 % 1) + 8) {
                        case 8:
                            i17 = by3;
                            break;
                        default:
                            i15 += (((i16 * i12) + Test0734.instanceCount) - i11);
                            i13 = i14;
                        }
                        i13 -= (int) Test0734.instanceCount;
                    }
                }
            }
        }
        long meth_res = by3 + i11 + i12 + i13 + i14 + i15 + i16 + i17 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=230, i1=131, i2=-55675, i3=-137, i18=-60546, i19=-8, i20=-11, i21=-181, i22=-35;
        byte by5=-120;
        short s2=-18901;

        for (i = 16; i < 397; ++i) {
            i1 &= i1;
            i1 = (int) (~(long) ((Test0734.instanceCount + i) + (Test0734.fFld - i1)));
        }
        for (i2 = 15; i2 < 308; i2++) {
            i1 += (((i2 * Test0734.instanceCount) + Test0734.instanceCount) - i1);
            iMeth();
            i1 >>= i2;
            dFld -= Test0734.instanceCount;
            i1 = -39477;
            Test0734.iArrFld[i2] += i3;
        }
        for (i18 = 13; i18 < 231; i18++) {
            for (i20 = 1; i20 < 115; ++i20) {
                if (Test0734.bFld) break;
                i19 >>= i2;
                i22 = 1;
                while (++i22 < 2) {
                    byte by4=68;
                    i3 *= i2;
                    i19 *= (int)-77.406F;
                    Test0734.iArrFld[(-13 >>> 1) % N] += i18;
                    by4 = (byte)-5;
                    i21 += (i22 * Test0734.instanceCount);
                    Test0734.instanceCount -= Test0734.instanceCount;
                    Test0734.instanceCount += (i22 | (long) Test0734.fFld);
                }
                i3 += (int) Test0734.fFld;
            }
            by5 *= (byte)45211;
            Test0734.instanceCount = 11718;
            switch ((i18 % 1) + 66) {
            case 66:
                s2 = (short)i3;
                Test0734.instanceCount |= i21;
                i3 -= (int)125L;
                by5 >>= (byte)i;
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i18 i19 = " + i3 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("by5 s2 = " + by5 + "," + s2);

        FuzzerUtils.out.println("Test0734.instanceCount Test0734.fFld Test0734.bFld = " + Test0734.instanceCount + "," +
                Float.floatToIntBits(Test0734.fFld) + "," + (Test0734.bFld ? 1 : 0));
        FuzzerUtils.out.println("dFld Test0734.fArrFld Test0734.lArrFld = " + Double.doubleToLongBits(dFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0734.fArrFld)) + "," + FuzzerUtils.checkSum(Test0734.lArrFld));
        FuzzerUtils.out.println("Test0734.iArrFld = " + FuzzerUtils.checkSum(Test0734.iArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0734 _instance = new Test0734();
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
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}