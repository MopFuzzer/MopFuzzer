// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:09 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-173L;
    public static short sFld=-8218;
    public static float fFld=99.730F;
    public static long lArrFld[]=new long[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -4798890779776319710L);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i9) {

        float f1=2.934F, f2=-108.23F, fArr[]=new float[N];
        int i10=-51840, i11=14, i12=6, i13=-116;
        boolean b=true;

        FuzzerUtils.init(fArr, 2.509F);

        f1 *= i9;
        i10 = 1;
        while (++i10 < 211) {
            for (f2 = 1; 8 > f2; f2 += 2) {
                for (i12 = 1; 3 > i12; ++i12) {
                    Test.instanceCount *= Test.instanceCount;
                    switch ((i12 % 1) + 34) {
                    case 34:
                        fArr[i10] += -9;
                        Test.instanceCount = Test.sFld;
                        f1 = i9;
                        i11 += (((i12 * i11) + i13) - i11);
                        break;
                    }
                    fArr[(int)(f2 + 1)] += i9;
                    b = b;
                    if (b) {
                        i9 *= -63;
                    } else {
                        if (b) continue;
                    }
                }
            }
        }
        vMeth2_check_sum += i9 + Float.floatToIntBits(f1) + i10 + Float.floatToIntBits(f2) + i11 + i12 + i13 + (b ? 1 :
            0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth1(int i7, int i8, long l3) {

        long l4=2108034277950706131L;
        float f3=-75.391F;
        int i14=-27540, iArr1[]=new int[N];
        byte by=65;

        FuzzerUtils.init(iArr1, 147);

        vMeth2(i7);
        i7 = 22764;
        l4 = 1;
        while (++l4 < 377) {
            float f4=122.881F;
            i7 += (-28871 + (l4 * l4));
            iArr1[(int)(l4 - 1)] = (int)Test.fFld;
            i7 += (int)l4;
            for (f3 = 1; f3 < 4; f3++) {
                i7 += i7;
                i7 += i8;
                l3 = i8;
                Test.lArrFld[(int)(f3 - 1)] *= i14;
                by = (byte)i8;
            }
            f4 *= Test.sFld;
            if (false) break;
            Test.lArrFld[(int)(l4)] &= i7;
        }
        vMeth1_check_sum += i7 + i8 + l3 + l4 + Float.floatToIntBits(f3) + i14 + by + FuzzerUtils.checkSum(iArr1);
    }

    public void vMeth(int i, int i1, long l) {

        int i2=15676, i3=59663, i4=-129, i5=20695, i6=-45993, iArr[]=new int[N];
        long l1=209L, l2=-959081569L;
        double d=-2.114174;
        float f=0.548F;
        boolean b1=true;

        FuzzerUtils.init(iArr, -42);

        iArr[(-225 >>> 1) % N] *= i1;
        for (i2 = 12; 210 > i2; i2++) {
            switch ((i2 % 2) + 110) {
            case 110:
                for (l1 = 1; l1 < 8; l1++) {
                    i1 = (int)(((l2++) * i1) % (Math.abs(i3 - 24504) | 1));
                    for (i5 = 1; i5 < 2; ++i5) {
                        switch (((((int)(l1 + i5)) >>> 1) % 8) + 78) {
                        case 78:
                            i6 = -5;
                            break;
                        case 79:
                            i6 = (int)Math.min(--l, (long)(d + (-95 >> (i - i6))));
                            i6 += (i5 ^ (long)f);
                        case 80:
                            i6 += (int)657823613L;
                            vMeth1(i4, i2, l1);
                            break;
                        case 81:
                            i = i1;
                            break;
                        case 82:
                            Test.fFld = i2;
                            break;
                        case 83:
                            i3 >>= i5;
                            break;
                        case 84:
                            i1 += i5;
                        case 85:
                            i6 >>= i4;
                            break;
                        }
                    }
                }
                break;
            case 111:
                Test.sFld += (short)i4;
                break;
            default:
                if (b1) continue;
            }
        }
        vMeth_check_sum += i + i1 + l + i2 + i3 + l1 + i4 + l2 + i5 + i6 + Double.doubleToLongBits(d) +
            Float.floatToIntBits(f) + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i15=63640, i16=-5, i17=46, i18=-37100, i19=-8, i20=-10503, i21=-14, i22=-225, i23=13, iArr2[]=new int[N];
        boolean b2=true, b3=true;
        double d1=55.13714;
        byte by1=-119;

        FuzzerUtils.init(iArr2, -37855);

        vMeth(39517, 29292, Test.instanceCount);
        if (b2) {
            Test.instanceCount ^= i15;
            Test.fFld = Test.instanceCount;
            for (i16 = 3; i16 < 134; i16++) {
                Test.instanceCount = i16;
                i17 -= i16;
                Test.fFld = 127;
                b2 = b3;
                for (i18 = 2; i18 < 191; i18++) {
                    Test.fFld -= Test.fFld;
                    i15 >>= 228;
                    Test.bArrFld[i18] = true;
                    i15 -= i18;
                    i15 = Test.sFld;
                    i17 = i18;
                    i19 = (int)Test.instanceCount;
                }
                Test.instanceCount += (13 + (i16 * i16));
                i17 = i18;
            }
        } else if (b3) {
            for (i20 = 10; i20 < 226; i20++) {
                Test.instanceCount += i20;
                i21 = -13;
                for (i22 = 6; 116 > i22; ++i22) {
                    d1 = 2;
                    do {
                        i15 -= -111;
                        by1 -= (byte)7;
                        i23 += (int)19413L;
                        i17 += i21;
                    } while (--d1 > 0);
                    iArr2[i20 + 1] >>>= i18;
                    i23 *= i17;
                }
            }
        } else if (b3) {
            Test.instanceCount = i23;
        } else {
            i17 += (int)Test.instanceCount;
        }

        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("b2 b3 i18 = " + (b2 ? 1 : 0) + "," + (b3 ? 1 : 0) + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 i23 d1 = " + i22 + "," + i23 + "," + Double.doubleToLongBits(d1));
        FuzzerUtils.out.println("by1 iArr2 = " + by1 + "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.fFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.lArrFld Test.bArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," +
            FuzzerUtils.checkSum(Test.bArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
