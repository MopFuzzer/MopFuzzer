// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:56 2023
public class Test0943 {

    public static final int N = 400;

    public static long instanceCount=-6L;
    public int iFld=5;
    public static boolean bFld=true;
    public static short sFld=3220;
    public static float fFld=-43.803F;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i6, long l, short s1) {

        int i7=197, i8=-95, i9=-57852, i10=8;
        double d1=2.115513;
        float f1=-108.990F;
        boolean[] bArr =new boolean[N];

        FuzzerUtils.init(bArr, true);

        i7 = 1;
        do {
            i6 = i6;
            for (i8 = 1; 6 > i8; i8++) {
                i9 -= (int)l;
                i10 = 1;
                while (++i10 < 2) {
                    i6 += (i10 * i9);
                    i9 += (int)l;
                    d1 = l;
                    i9 -= (int) Test0943.instanceCount;
                    bArr[i10] = Test0943.bFld;
                    i6 = i8;
                    Test0943.bFld = Test0943.bFld;
                    Test0943.instanceCount = (long) f1;
                }
                i6 *= i8;
                i9 *= i9;
            }
        } while (++i7 < 286);
        vMeth2_check_sum += i6 + l + s1 + i7 + i8 + i9 + i10 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth1(short s, float f, int i2) {

        int i3=204;
        int i4=9;
        int i5=41930;
        int i11=11113;
        int i12=6509;
        int[] iArr =new int[N];
        byte by=95;
        boolean b=false;
        long[] lArr =new long[N];

        FuzzerUtils.init(iArr, -101);
        FuzzerUtils.init(lArr, -7L);

        i3 = 1;
        while (++i3 < 365) {
            by += (byte) (Test0943.instanceCount + Test0943.instanceCount);
            for (i4 = 1; i4 < 5; ++i4) {
                double d=1.81172;
                b = (((i2 += i4) * (d * i3)) != ((0.172F - (++i5)) + Test0943.instanceCount));
                vMeth2(i2, Test0943.instanceCount, s);
                Test0943.instanceCount = (long) f;
                for (i11 = 1; i11 < 2; i11 += 2) {
                    iArr[i3] >>= 9;
                    if (b) {
                        s = (short)i4;
                        lArr[i11 - 1] = (long)f;
                    } else if (false) {
                        f = (float)d;
                        iArr[i3] &= i3;
                    }
                    i2 += (i11 * i12);
                    f += (i11 - i3);
                }
            }
        }
        vMeth1_check_sum += s + Float.floatToIntBits(f) + i2 + i3 + by + i4 + i5 + (b ? 1 : 0) + i11 + i12 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(int i, int i1) {

        double d2=0.58726;
        int i13=54288;
        int i14=-14216;
        int i15=-52434;
        int i16=-47;
        int i17=185;
        int i18=-3129;
        int i19=5003;
        int[] iArr1 =new int[N];
        float f2=110.754F;
        float[] fArr =new float[N];

        FuzzerUtils.init(iArr1, 146);
        FuzzerUtils.init(fArr, -9.240F);

        vMeth1(Test0943.sFld, Test0943.fFld, i1);
        for (d2 = 9; d2 < 296; d2 += 3) {
            for (i14 = (int)(d2); 16 > i14; i14++) {
                iArr1[i14 + 1] -= i14;
                Test0943.fFld += (8 + (i14 * i14));
                for (f2 = 1; f2 < 1; f2++) {
                    i17 = i14;
                    iArr1[(int)(f2 + 1)] -= i16;
                    i17 = i15;
                }
                switch (((i14 % 10) * 5) + 75) {
                case 93:
                    Test0943.bFld = Test0943.bFld;
                    for (i18 = i14; i18 < 1; i18++) {
                        Test0943.instanceCount += Test0943.instanceCount;
                        i = i;
                        iArr1[i14 + 1] = 31;
                    }
                    break;
                case 85:
                    Test0943.bFld = Test0943.bFld;
                    break;
                case 99:
                    i16 += (i14 + i17);
                    break;
                case 76:
                    i = i14;
                    break;
                case 81:
                    Test0943.instanceCount -= Test0943.instanceCount;
                case 97:
                    i15 *= i17;
                    break;
                case 77:
                    iArr1[(int)(d2 - 1)] ^= i17;
                    break;
                case 124:
                case 105:
                case 110:
                    fArr[(int)(d2)] = i16;
                    break;
                }
            }
        }
        vMeth_check_sum += i + i1 + Double.doubleToLongBits(d2) + i13 + i14 + i15 + Float.floatToIntBits(f2) + i16 +
            i17 + i18 + i19 + FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i20=10316;
        int i21=-8;
        int i22=56185;
        int i23=-168;
        int i24=-34936;
        int i25=-27039;
        int i26=5;
        int i27=-8;
        int i28=-1;
        int i29=13648;
        int[] iArr2 =new int[N];
        byte by1=56;
        double d3=-2.91893;
        float f3=46.517F;

        FuzzerUtils.init(iArr2, -14);

        iFld = iFld;
        vMeth(iFld, iFld);
        i20 = 1;
        while (++i20 < 211) {
            iFld = (int) Test0943.fFld;
        }
        iFld >>= iFld;
        for (i21 = 13; i21 < 352; ++i21) {
            i23 = 74;
            while (--i23 > 0) {
                for (i24 = 1; 1 < i24; --i24) {
                    iFld = i25;
                    iArr2[i24] = by1;
                    iArr2[i23] ^= by1;
                    i22 = iFld;
                    iFld += (i24 - i22);
                }
                iFld += -1;
            }
            d3 -= i25;
            i22 -= by1;
            Test0943.instanceCount -= -4801003860451449621L;
            switch ((i21 % 3) + 51) {
            case 51:
                i22 = iFld;
            case 52:
                i26 = 1;
                while (++i26 < 74) {
                    for (f3 = 1; f3 < 1; ++f3) {
                        i22 *= i26;
                        i22 -= i20;
                        by1 = (byte) Test0943.instanceCount;
                    }
                    i27 -= i23;
                    for (i28 = i21; i28 < 1; i28++) {
                        Test0943.instanceCount += (i28 * i28);
                        Test0943.instanceCount += (((i28 * i21) + i27) - Test0943.instanceCount);
                        d3 = Test0943.instanceCount;
                        d3 = Test0943.instanceCount;
                    }
                }
                break;
            case 53:
                iFld += (((i21 * Test0943.instanceCount) + Test0943.instanceCount) - i23);
                break;
            }
        }

        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("by1 d3 i26 = " + by1 + "," + Double.doubleToLongBits(d3) + "," + i26);
        FuzzerUtils.out.println("f3 i27 i28 = " + Float.floatToIntBits(f3) + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 iArr2 = " + i29 + "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test0943.instanceCount iFld Test0943.bFld = " + Test0943.instanceCount + "," + iFld + "," +
                (Test0943.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0943.sFld Test0943.fFld = " + Test0943.sFld + "," + Float.floatToIntBits(Test0943.fFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0943 _instance = new Test0943();
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
