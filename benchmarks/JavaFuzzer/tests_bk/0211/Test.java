// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:58 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2119064649440758426L;
    public float fFld=-90.586F;
    public static volatile double dFld=-2.16841;
    public static boolean bFld=false;
    public int iArrFld[]=new int[N];
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)-37);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i8) {

        int iArr[]=new int[N];

        FuzzerUtils.init(iArr, -34809);

        iArr[(i8 >>> 1) % N] = -230;
        long meth_res = i8 + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(int i7) {


        lMeth(i7);
        long meth_res = i7;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        byte by=-11;
        int i5=-42, i6=-10, i9=-195, i10=-67, i11=93, iArr1[]=new int[N];
        short s=-20908;
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, 77.846F);
        FuzzerUtils.init(iArr1, 32689);

        Test.dFld -= ((-8 - (by + i5)) + i5);
        i6 = 1;
        do {
            float f=-124.833F;
            try {
                i5 = (i6 % i5);
                i5 = (i6 / i5);
                i5 = (i6 / -47367);
            } catch (ArithmeticException a_e) {}
            if (i5 != 0) {
                vMeth_check_sum += by + i5 + i6 + i9 + i10 + i11 + s +
                    Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr1);
                return;
            }
            i5 += i6;
            iMeth(i5);
            i5 += (int)f;
            i5 -= (int)Test.instanceCount;
            for (i9 = i6; i9 < 6; ++i9) {
                fArr[i9][i6] *= i11;
                f -= i5;
            }
            i11 ^= 5;
            if (Test.bFld) {
                try {
                    i10 = (i9 % 244);
                    i10 = (i11 / 87);
                    i10 = (12964 / iArr1[i6 + 1]);
                } catch (ArithmeticException a_e) {}
            } else if (Test.bFld) {
                s -= (short)i11;
            } else {
                i5 *= 40058;
                vMeth_check_sum += by + i5 + i6 + i9 + i10 + i11 + s +
                    Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr1);
                return;
            }
        } while (++i6 < 278);
        vMeth_check_sum += by + i5 + i6 + i9 + i10 + i11 + s + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=-6, i1=-107, i2=-216, i3=-4, i4=-6, i12=6, i13=7, i14=9, i15=4, i16=31668;
        double d=-21.115995, d1=-2.267;
        short s1=-14317, sArr[][]=new short[N][N];
        byte by2=63;

        FuzzerUtils.init(sArr, (short)25674);

        i = 1;
        while (++i < 377) {
            byte by1=7;
            for (i1 = 4; i1 < 67; i1++) {
                d = 2;
                while ((d -= 3) > 0) {
                    Test.instanceCount = (long)(++d1);
                    i2 = (int)(i1 + (i * (fFld = fFld)));
                    iArrFld[i + 1] = (((i * i2) ^ (i1 + i2)) / ((i1 >>> (Test.byArrFld[(int)(d + 1)]--)) | 1));
                    i2 = (int)Test.instanceCount;
                    Test.instanceCount >>= (((i2--) - (--iArrFld[i + 1])) * i2);
                    Test.instanceCount += (long)(d * i);
                    Test.instanceCount += (long)(d * d);
                }
            }
            for (i3 = 3; 67 > i3; ++i3) {
                vMeth();
            }
            i2 += (int)d;
            by1 -= (byte)d;
            Test.dFld += i;
            i12 += (i * Test.instanceCount);
            iArrFld[i - 1] ^= (int)Test.instanceCount;
            i12 += (-8135 + (i * i));
            i12 += s1;
        }
        i4 = i2;
        for (i13 = 2; i13 < 210; i13++) {
            i12 >>= 3;
            i2 -= (int)fFld;
            for (i15 = 7; i15 < 121; i15++) {
                iArrFld[i13] = i13;
                i12 = by2;
                fFld += i2;
                Test.instanceCount = i12;
                i16 *= i14;
                sArr[i15 + 1][i15 - 1] -= (short)i1;
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("d d1 i3 = " + Double.doubleToLongBits(d) + "," + Double.doubleToLongBits(d1) + "," +
            i3);
        FuzzerUtils.out.println("i4 i12 s1 = " + i4 + "," + i12 + "," + s1);
        FuzzerUtils.out.println("i13 i14 i15 = " + i13 + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 by2 sArr = " + i16 + "," + by2 + "," + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount fFld Test.dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(fFld) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.bFld iArrFld Test.byArrFld = " + (Test.bFld ? 1 : 0) + "," +
            FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(Test.byArrFld));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}