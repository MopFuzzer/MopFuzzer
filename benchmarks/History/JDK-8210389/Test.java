// Generated by Java* Fuzzer test generator (1.0.001). Mon Aug 13 08:57:33 2018
public class Test {

    public static final int N = 400;

    public static long instanceCount=-94L;
    public static volatile byte byFld=-108;
    public static int[] iArrFld =new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 7);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i5=13, i6=118;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, 4851106031938173462L);

        for (int i4 : Test.iArrFld) {
            i4 = 252;
            i4 = i4;
        }
        for (i5 = 5; i5 < 173; i5++) {
            i6 *= (int)Test.instanceCount;
        }
        Test.iArrFld[(i5 >>> 1) % N] -= i5;
        Test.instanceCount -= Test.byFld;
        lArr[(17694 >>> 1) % N] &= i6;
        vMeth2_check_sum += i5 + i6 + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(float f1, int i3, short s) {

        double d=30.44521, d1=-31.120544;
        int i7=26186, i8=41, i9=60;

        i3 = (int)d;
        vMeth2();
        for (d1 = 5; 145 > d1; d1++) {
            i7 -= i7;
            i3 = i3;
            Test.instanceCount = 173;
            i3 += (int)d1;
            i7 += (int)Test.instanceCount;
            i7 = 1;
        }
        i7 += i7;
        for (i8 = 7; i8 < 133; ++i8) {
            Test.iArrFld[i8] += i3;
            i3 += i8;
            i7 += i8;
            Test.iArrFld[i8 - 1] = i9;
        }
        vMeth1_check_sum += Float.floatToIntBits(f1) + i3 + s + Double.doubleToLongBits(d) +
            Double.doubleToLongBits(d1) + i7 + i8 + i9;
    }

    public static void vMeth(long l, int i1, int i2) {

        float f=-1.627F;
        long l1=125L;
        long l2=1447112904L;
        long[] lArr1 =new long[N];
        short s1=18228;
        int i10=49080;
        int i11=228;
        int i12=-10691;
        int i13=6;
        int i14=22;
        int i15=176;
        int i16=-201;
        int[] iArr1 =new int[N];
        boolean b=false;
        double d2=0.5146;

        FuzzerUtils.init(iArr1, 11);
        FuzzerUtils.init(lArr1, -6L);

        iArr1[(i2 >>> 1) % N] = (int)((f - (l1 + Test.instanceCount)) + ((--i1) - (l * l)));
        vMeth1(f, i2, s1);
        l1 += 11;
        for (i10 = 348; 8 < i10; --i10) {
            for (l2 = i10; l2 < 5; l2++) {
                if (b) continue;
                l += i11;
                lArr1[i10 + 1] *= l;
                f += (((l2 * l) + i1) - i1);
            }
        }
        i1 = i1;
        for (i13 = 189; i13 > 7; i13--) {
            for (i15 = 1; i15 < 9; i15++) {
                i14 = (int)-9218L;
                if (b) break;
                d2 = f;
            }
        }
        vMeth_check_sum += l + i1 + i2 + Float.floatToIntBits(f) + l1 + s1 + i10 + i11 + l2 + i12 + (b ? 1 : 0) + i13 +
            i14 + i15 + i16 + Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        float f2=0.884F;
        float[] fArr =new float[N];
        int i17=9;
        int i18=-222;
        int i19=1;
        int i20=63;
        int i21=-32916;
        int i22=0;
        int[] iArr =new int[N];
        boolean b1=false;
        double d3=76.18241;
        long[] lArr2 =new long[N];

        FuzzerUtils.init(iArr, 10);
        FuzzerUtils.init(lArr2, -3184620569L);
        FuzzerUtils.init(fArr, 0.536F);

        for (int i : iArr) {
            vMeth(Test.instanceCount, 13, i);
            f2 = i;
            for (i17 = 2; i17 < 63; i17++) {
                i = (int)Test.instanceCount;
                if (b1) break;
                Test.byFld += (byte)(0.131F + (i17 * i17));
                Test.instanceCount = Test.instanceCount;
            }
            f2 += Test.instanceCount;
            i = i18;
            i18 -= (int)d3;
            for (i19 = 1; 63 > i19; ++i19) {
                for (i21 = 1; i21 < 2; i21++) {
                    i20 = i20;
                    d3 = i22;
                    i20 %= (int)(Test.instanceCount | 1);
                    lArr2 = lArr2;
                    i20 += i17;
                    i *= i18;
                    if (b1) continue;
                    i20 = i21;
                }
                i += (i19 - f2);
                d3 -= Test.byFld;
                i22 &= i;
                i22 -= i19;
                Test.instanceCount = 46725L;
            }
            switch ((((i22 >>> 1) % 4) * 5) + 91) {
            case 98:
                i22 = i;
                i20 = 14;
                i22 = i19;
                break;
            case 110:
                Test.instanceCount >>>= i19;
                break;
            case 105:
                Test.instanceCount = 1996485678L;
                break;
            case 103:
                i22 -= (int)Test.instanceCount;
                break;
            default:
                fArr[(-8 >>> 1) % N] = 14;
            }
        }

        FuzzerUtils.out.println("f2 i17 i18 = " + Float.floatToIntBits(f2) + "," + i17 + "," + i18);
        FuzzerUtils.out.println("b1 d3 i19 = " + (b1 ? 1 : 0) + "," + Double.doubleToLongBits(d3) + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("iArr lArr2 fArr = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(lArr2) +
            "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.iArrFld = " + Test.instanceCount + "," + Test.byFld
            + "," + FuzzerUtils.checkSum(Test.iArrFld));

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