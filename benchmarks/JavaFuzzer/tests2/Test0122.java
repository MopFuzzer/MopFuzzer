// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:17 2023
public class Test0122 {

    public static final int N = 400;

    public static long instanceCount=-2299832412589862294L;
    public static int iFld=-33;
    public static long lFld=14L;
    public static long[] lArrFld =new long[N];
    public static double[] dArrFld =new double[N];
    public int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test0122.lArrFld, 12L);
        FuzzerUtils.init(Test0122.dArrFld, 2.29183);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l) {

        int i7=-49672;
        int i8=-21;
        int i9=-2;
        int i10=5;
        int i11=40822;
        int i12=158;
        int[] iArr1 =new int[N];
        boolean b=true;
        double d1=10.51344;

        FuzzerUtils.init(iArr1, 219);

        i7 = i7;
        for (i8 = 198; i8 > 9; i8 -= 2) {
            if (b) continue;
            i7 <<= i9;
            i7 = i9;
            i10 = 1;
            while (++i10 < 16) {
                short s=-30044;
                float f=0.27F;
                i7 <<= 82;
                s -= (short)l;
                for (i11 = 1; i11 < 1; ++i11) {
                    l *= s;
                    i9 = i11;
                    i7 |= i9;
                    iArr1[i8] = i12;
                }
                i12 = (int)d1;
                i9 += (int)f;
            }
        }
        vMeth1_check_sum += l + i7 + i8 + i9 + (b ? 1 : 0) + i10 + i11 + i12 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(int i4) {

        int i5=33108;
        int i6=9;
        int i13=-65;
        int i14=-36484;
        int i15=7;
        int i16=-200;
        int[] iArr2 =new int[N];
        double d2=-2.80724;
        float f1=-1.765F;
        float[] fArr =new float[N];

        FuzzerUtils.init(iArr2, 7);
        FuzzerUtils.init(fArr, 71.405F);

        for (i5 = 1; i5 < 203; ++i5) {
            vMeth1(Test0122.instanceCount);
            for (i13 = 1; i13 < 8; ++i13) {
                iArr2[i5] /= (int)-30769L;
                Test0122.instanceCount += (long) d2;
                f1 += i5;
                Test0122.lArrFld = FuzzerUtils.long1array(N, (long) 4L);
                iArr2[i13] <<= i6;
                f1 = i6;
            }
            fArr[i5] -= -71;
            Test0122.dArrFld = Test0122.dArrFld;
            for (i15 = 1; i15 < 8; i15++) {
                i14 = i6;
                i14 -= i14;
                iArr2[i15] = 225;
            }
        }
        long meth_res = i4 + i5 + i6 + i13 + i14 + Double.doubleToLongBits(d2) + Float.floatToIntBits(f1) + i15 + i16 +
            FuzzerUtils.checkSum(iArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, int i1, int i2) {

        int i3=17418;
        int i17=7;
        int i18=-54337;
        int i19=42517;
        int i20=35495;
        int i21=-2;
        int i22=-14;
        int[] iArr =new int[N];
        byte by=-100;
        double d=-78.76542;
        float f2=43.289F;

        FuzzerUtils.init(iArr, -4);

        i3 = 1;
        while (++i3 < 351) {
            by -= (byte) ((-(Test0122.instanceCount -= -65190L)) - (iArr[i3 + 1] + d));
            iArr[i3] += (int) Test0122.instanceCount;
            i += (iMeth(i2) * 4);
            for (i17 = 1; i17 < 5; ++i17) {
                Test0122.lArrFld[i17] ^= Test0122.instanceCount;
                i1 = (int) Test0122.instanceCount;
                for (i19 = i17; i19 < 2; i19++) {
                    i2 += i19;
                    Test0122.instanceCount <<= i20;
                    Test0122.instanceCount += (long) f2;
                }
                iArr[i3] *= (int) Test0122.instanceCount;
                for (i21 = 1; 2 > i21; i21++) {
                    Test0122.instanceCount = (long) d;
                    i20 = by;
                }
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + by + Double.doubleToLongBits(d) + i17 + i18 + i19 + i20 +
            Float.floatToIntBits(f2) + i21 + i22 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        float f3=-1.199F;
        short s1=13224;
        int i23=38908, i24=-32, i25=35076, i26=12477, i27=800, i28=-200, i29=151, i30=11653, i31=0, i32=-14,
            i33=-25216, i34=157;
        boolean b1=false;

        if (b1) {
            vMeth(-132, Test0122.iFld, Test0122.iFld);
            switch ((((Test0122.iFld >>> 1) % 4) * 5) + 119) {
            case 133:
                Test0122.lArrFld[(Test0122.iFld >>> 1) % N] += Test0122.iFld;
                iArrFld[(Test0122.iFld >>> 1) % N] = -14;
                Test0122.instanceCount -= Test0122.instanceCount;
                Test0122.iFld = Test0122.iFld;
            case 121:
                f3 += Test0122.lFld;
            case 137:
                s1 += (short) Test0122.iFld;
                break;
            case 139:
                for (i23 = 22; i23 < 371; i23++) {
                    iArrFld[i23 + 1] += i24;
                    Test0122.iFld &= i24;
                }
                Test0122.lArrFld[(Test0122.iFld >>> 1) % N] -= i24;
                for (i25 = 6; i25 < 241; i25++) {
                    iArrFld[i25] %= (int)(i26 | 1);
                    i24 = i24;
                    Test0122.iFld += i25;
                }
                for (i27 = 2; i27 < 186; i27++) {
                    for (i29 = i27; i29 < 136; ++i29) {
                        for (i31 = 1; i31 < 1; ++i31) {
                            if (b1) break;
                            s1 = (short) Test0122.lFld;
                            Test0122.instanceCount += i30;
                            Test0122.iFld += (-38627 + (i31 * i31));
                            Test0122.lFld <<= i31;
                            i24 = i28;
                        }
                        for (i33 = 1; i33 < 1; ++i33) {
                            i32 = -245;
                        }
                        iArrFld = iArrFld;
                        i34 <<= 9;
                    }
                }
                break;
            }
        }

        FuzzerUtils.out.println("f3 s1 i23 = " + Float.floatToIntBits(f3) + "," + s1 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 i31 i32 = " + i30 + "," + i31 + "," + i32);
        FuzzerUtils.out.println("b1 i33 i34 = " + (b1 ? 1 : 0) + "," + i33 + "," + i34);

        FuzzerUtils.out.println("Test0122.instanceCount Test0122.iFld Test0122.lFld = " + Test0122.instanceCount + "," + Test0122.iFld +
                "," + Test0122.lFld);
        FuzzerUtils.out.println("Test0122.lArrFld Test0122.dArrFld iArrFld = " + FuzzerUtils.checkSum(Test0122.lArrFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0122.dArrFld)) + "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0122 _instance = new Test0122();
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
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
