// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:18 2023
public class Test0149 {

    public static final int N = 400;

    public static long instanceCount=-2125204283678107364L;
    public static byte byFld=55;
    public static int iFld=187;
    public boolean bFld=true;
    public static short sFld=13771;
    public int[] iArrFld =new int[N];

    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static void vSmallMeth(double d, long l, int i) {

        byte by=-89;
        float f=-41.873F;

        by *= (byte)(((f / (i | 1)) - Integer.reverseBytes(2316)) * (i--));
        vSmallMeth_check_sum += Double.doubleToLongBits(d) + l + i + by + Float.floatToIntBits(f);
    }

    public static int iMeth2(long l4, int i8) {

        int i9=-2, i10=48431, i11=209;
        double d3=-23.75116, d4=-40.6525;
        short s=23870;
        byte by1=64;
        float f2=-114.558F;

        i9 = 1;
        do {
            i8 = i9;
            l4 = i8;
            for (i10 = 1; i10 < 33; i10++) {
                d3 = 1;
                while (++d3 < 2) {
                    i11 = (int)4080L;
                    i11 += i8;
                    l4 *= i8;
                    s >>= (short)i8;
                    by1 -= (byte)i10;
                    f2 = i10;
                    i11 = i10;
                    d4 -= i10;
                }
                l4 &= i8;
                i11 = i9;
            }
        } while ((i9 += 3) < 139);
        long meth_res = l4 + i8 + i9 + i10 + i11 + Double.doubleToLongBits(d3) + s + by1 + Float.floatToIntBits(f2) +
            Double.doubleToLongBits(d4);
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(long l1, int i7, long l2) {

        long l3=-90046514L;
        boolean b=false;
        boolean[] bArr =new boolean[N];
        int i12=13, i13=201, i14=167;
        short s1=16652;

        FuzzerUtils.init(bArr, false);

        i7 -= (int)Float.intBitsToFloat((int)(i7 - Math.min(l3, l2)));
        iMeth2(l2, i7);
        l1 |= i7;
        bArr[(i7 >>> 1) % N] = b;
        i7 -= Test0149.byFld;
        for (i12 = 5; i12 < 200; ++i12) {
            if (b) continue;
            l3 = Test0149.byFld;
            i13 <<= -76;
            if (Test0149.iFld != 0) {
            }
            i14 = 1;
            do {
                float f3=0.586F;
                Test0149.iFld += (((i14 * i7) + f3) - i13);
                i13 -= -42367;
                Test0149.iFld = i7;
                i7 |= s1;
            } while (++i14 < 8);
        }
        long meth_res = l1 + i7 + l2 + l3 + (b ? 1 : 0) + i12 + i13 + i14 + s1 + FuzzerUtils.checkSum(bArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(double d2) {

        int i3=-27;
        int i4=-44510;
        int i5=114;
        int i6=-56;
        int i15=-8;
        int i16=56103;
        int[] iArr =new int[N];
        float f1=87.520F;
        long l5=-3919024506L;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(iArr, 9);
        FuzzerUtils.init(lArr1, -179L);

        i3 = 1;
        while (++i3 < 379) {
            i4 -= iArr[i3 + 1];
            i4 = 10;
            vSmallMeth(d2, ++Test0149.instanceCount, --i4);
            for (i5 = i3; 4 > i5; ++i5) {
                i6 = (~(i6--));
                i6 *= (int) (Test0149.instanceCount = (i4--));
            }
            f1 += (iMeth1(-6L, Test0149.iFld, Test0149.instanceCount) * -3);
            iArr[i3 + 1] += i4;
        }
        for (l5 = 7; 192 > l5; ++l5) {
            i16 = 1;
            do {
                i15 += (((i16 * Test0149.iFld) + i3) - Test0149.iFld);
            } while (++i16 < 9);
            lArr1[(int)(l5 - 1)] = i6;
            iArr[(int)(l5 + 1)] += (int)f1;
            Test0149.instanceCount |= i16;
        }
        long meth_res = Double.doubleToLongBits(d2) + i3 + i4 + i5 + i6 + Float.floatToIntBits(f1) + l5 + i15 + i16 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i1=-13, i17=14, i18=38423, i19=-239, i20=7, i21=-253;
        float f4=111.745F;
        long[] lArr =new long[N];
        double[] dArr =new double[N];

        FuzzerUtils.init(lArr, -1969649866338313136L);
        FuzzerUtils.init(dArr, 0.24438);

        for (int smallinvoc=0; smallinvoc<949; smallinvoc++) vSmallMeth((++i1) - i1, Math.min((long)(-(0.769F * (i1 %
            0.890F))), ++lArr[(0 >>> 1) % N]), ++i1);
        i1 += (int) Test0149.instanceCount;
        for (double d1 : dArr) {
            iMeth(d1);
            f4 *= Test0149.iFld;
            i17 = 1;
            while (++i17 < 63) {
                if (bFld) continue;
                i1 = -239;
                for (i18 = 1; i18 < 1; i18++) {
                    f4 += (i18 - i19);
                }
                i1 = Test0149.iFld;
                Test0149.iFld = -40702;
                Test0149.iFld += (((i17 * i18) + i1) - Test0149.iFld);
                switch ((((i18 >>> 1) % 3) * 5) + 79) {
                case 92:
                    for (i20 = i17; i20 < 1; i20++) {
                        Test0149.iFld += (((i20 * i20) + i20) - f4);
                        Test0149.byFld = (byte) i21;
                        f4 += i20;
                        Test0149.byFld = (byte) Test0149.instanceCount;
                        switch (((i1 >>> 1) % 2) + 11) {
                        case 11:
                            Test0149.sFld -= (short) Test0149.iFld;
                            Test0149.instanceCount = (long) f4;
                        case 12:
                            Test0149.instanceCount <<= -8L;
                            i21 -= Test0149.iFld;
                            bFld = bFld;
                            break;
                        default:
                            i21 += 8;
                            i1 = (int)d1;
                        }
                        iArrFld[i20] = i20;
                    }
                    i21 = Test0149.iFld;
                    i19 = (int) Test0149.instanceCount;
                    break;
                case 93:
                    i21 += (i17 * i17);
                    break;
                case 84:
                    Test0149.iFld += i17;
                }
            }
        }

        FuzzerUtils.out.println("i1 f4 i17 = " + i1 + "," + Float.floatToIntBits(f4) + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 lArr dArr = " + i21 + "," + FuzzerUtils.checkSum(lArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test0149.instanceCount Test0149.byFld Test0149.iFld = " + Test0149.instanceCount + "," + Test0149.byFld +
                "," + Test0149.iFld);
        FuzzerUtils.out.println("bFld Test0149.sFld iArrFld = " + (bFld ? 1 : 0) + "," + Test0149.sFld + "," +
            FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("iMeth2_check_sum: " + iMeth2_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0149 _instance = new Test0149();
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test iMeth
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
