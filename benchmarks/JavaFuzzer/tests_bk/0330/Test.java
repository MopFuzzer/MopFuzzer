// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:01 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1798288518L;
    public float fFld=126.605F;
    public boolean bFld=true;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 10L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i11, short s) {

        double d=-1.14680;
        int i12=10, i13=-171, i14=-28871, i15=-43, i16=-50114, iArr1[]=new int[N];
        float f2=-1.433F;

        FuzzerUtils.init(iArr1, 16);

        iArr1[(i11 >>> 1) % N] = 147;
        i11 = (int)-37L;
        iArr1[(-147 >>> 1) % N] += (int)Test.instanceCount;
        Test.instanceCount = s;
        d += i11;
        i12 = 1;
        while (++i12 < 221) {
            switch ((i12 % 2) + 20) {
            case 20:
                i11 = (int)12499L;
                i11 += (i12 * i12);
                i11 = s;
                for (i13 = 1; i13 < 7; i13++) {
                    iArr1[i13 + 1] = (int)f2;
                    for (i15 = i12; 2 > i15; i15++) {
                        try {
                            i14 = (-258506183 % iArr1[i12 - 1]);
                            i14 = (i15 % i15);
                            i14 = (i16 / 33457);
                        } catch (ArithmeticException a_e) {}
                        if (i16 != 0) {
                            vMeth1_check_sum += i11 + s + Double.doubleToLongBits(d) + i12 + i13 + i14 +
                                Float.floatToIntBits(f2) + i15 + i16 + FuzzerUtils.checkSum(iArr1);
                            return;
                        }
                    }
                }
                break;
            case 21:
                i11 += i11;
                break;
            default:
                i16 = (int)Test.instanceCount;
            }
        }
        vMeth1_check_sum += i11 + s + Double.doubleToLongBits(d) + i12 + i13 + i14 + Float.floatToIntBits(f2) + i15 +
            i16 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i9) {

        long l=-6L, l1=4294L;
        int i10=3, i17=-170, i18=3;
        short s1=9724;
        boolean b=false;
        double d1=-62.8812;
        float fArr[]=new float[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(fArr, 62.464F);
        FuzzerUtils.init(byArr, (byte)-19);

        for (l = 5; 314 > l; ++l) {
            Test.instanceCount = i10;
            vMeth1(i9, s1);
            for (i17 = 1; i17 < 5; ++i17) {
                i9 = i17;
                if (b) continue;
            }
            fArr[(int)(l - 1)] -= (float)d1;
            i18 &= i18;
            l1 = 1;
            do {
                i9 *= (int)l;
                i10 = i10;
                byArr[(int)(l1)] >>= (byte)-48851;
                i10 += (int)l1;
                Test.instanceCount = (long)1.830F;
                Test.instanceCount -= (long)d1;
            } while (++l1 < 5);
        }
        vMeth_check_sum += i9 + l + i10 + s1 + i17 + i18 + (b ? 1 : 0) + Double.doubleToLongBits(d1) + l1 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(byArr);
    }

    public int iMeth(float f1, int i5, int i6) {

        int i7=-52, i8=-174, i19=-100, i20=-9828, i21=27390, i22=-203, i23=-28, iArr2[]=new int[N];
        boolean b1=true;
        byte by=84, byArr1[]=new byte[N];

        FuzzerUtils.init(iArr2, 29935);
        FuzzerUtils.init(byArr1, (byte)-7);

        for (i7 = 6; i7 < 127; i7++) {
            switch ((i7 % 2) + 39) {
            case 39:
                vMeth(i5);
                if (b1) break;
                for (i19 = i7; i19 < 13; i19++) {
                    Test.lArrFld[i7 - 1] |= i21;
                }
                break;
            case 40:
                i8 |= i7;
                break;
            default:
                Test.instanceCount = Test.instanceCount;
                iArr2[(-196 >>> 1) % N] <<= (int)16515L;
            }
            i21 += i19;
            i5 |= (int)Test.instanceCount;
            for (i22 = i7; i22 < 13; ++i22) {
                byArr1[i22] -= (byte)i8;
                i23 += by;
            }
            i6 -= (int)8330511434584049329L;
        }
        long meth_res = Float.floatToIntBits(f1) + i5 + i6 + i7 + i8 + (b1 ? 1 : 0) + i19 + i20 + i21 + i22 + i23 + by
            + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(byArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=-1.506F, fArr1[]=new float[N];
        int i=189, i1=-69, i2=50588, i3=13, i4=-9, i24=-213, i25=-15953, i26=-46, i27=-97, i28=7, i29=0, iArr[]=new
            int[N];
        double d2=2.7143;
        byte by1=121;
        short s2=-24249;

        FuzzerUtils.init(iArr, -28);
        FuzzerUtils.init(fArr1, -59.349F);

        for (f = 285; f > 12; f -= 2) {
            i ^= (int)Test.instanceCount;
            for (i1 = 1; i1 < 184; i1++) {
                iArr[(int)(f + 1)] -= (int)((Test.instanceCount++) + (Math.min(i2, i) - (-(f / (Test.instanceCount |
                    1)))));
            }
            i2 += i;
            for (i3 = 4; i3 < 184; i3++) {
                i <<= (int)((-(--Test.lArrFld[(int)(f + 1)])) - (iMeth(f, 148, i3) + i1));
                for (i24 = 1; i24 < 2; ++i24) {
                    fArr1[i3] = i1;
                    i4 += (int)d2;
                    Test.instanceCount += (i24 * i2);
                }
                switch ((int)((f % 6) + 88)) {
                case 88:
                    i = i24;
                    break;
                case 89:
                    for (i26 = 1; i26 < 2; i26++) {
                        i27 <<= i3;
                        fFld += i24;
                    }
                    Test.instanceCount += (((i3 * i26) + i24) - i3);
                    iArr[(int)(f - 1)] >>= i25;
                    i25 = by1;
                    break;
                case 90:
                    i2 += (((i3 * i3) + i2) - fFld);
                    s2 += (short)(i3 * i3);
                    iArr[i3] <<= i24;
                    for (i28 = 1; 2 > i28; i28++) {
                        i29 += (i28 + Test.instanceCount);
                        s2 &= (short)i4;
                        if (bFld) continue;
                        if (bFld) continue;
                        Test.instanceCount |= Test.instanceCount;
                        i2 += (((i28 * i26) + i2) - i25);
                        if (bFld) continue;
                    }
                    break;
                case 91:
                    Test.instanceCount += (i3 - Test.instanceCount);
                    break;
                case 92:
                    i2 += i3;
                    break;
                case 93:
                    d2 += -1.500F;
                    break;
                }
            }
        }

        FuzzerUtils.out.println("f i i1 = " + Float.floatToIntBits(f) + "," + i + "," + i1);
        FuzzerUtils.out.println("i2 i3 i4 = " + i2 + "," + i3 + "," + i4);
        FuzzerUtils.out.println("i24 i25 d2 = " + i24 + "," + i25 + "," + Double.doubleToLongBits(d2));
        FuzzerUtils.out.println("i26 i27 by1 = " + i26 + "," + i27 + "," + by1);
        FuzzerUtils.out.println("s2 i28 i29 = " + s2 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("iArr fArr1 = " + FuzzerUtils.checkSum(iArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test.instanceCount fFld bFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(fFld) + "," + (bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
