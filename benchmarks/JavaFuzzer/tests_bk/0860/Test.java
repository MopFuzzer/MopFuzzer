// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:15 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=6432899789728798872L;
    public static short sFld=-19303;
    public double dFld=-31.39884;
    public float fFld=57.930F;
    public static long lArrFld[]=new long[N];
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -677837989L);
        FuzzerUtils.init(Test.byArrFld, (byte)111);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i4, int i5) {

        int i6=39, i7=70, i8=49899, i9=-23530, iArr1[]=new int[N];
        double d=1.524;
        float f=-1.341F;
        boolean b=true;

        FuzzerUtils.init(iArr1, 0);

        i4 = (int)Test.instanceCount;
        i6 = 286;
        do {
            for (i7 = 6; i7 > 1; i7 -= 3) {
                i8 = i8;
                i4 >>= (int)Test.instanceCount;
                iArr1[(i5 >>> 1) % N] = (int)d;
            }
            f += i6;
            i8 -= (int)d;
            i9 = 1;
            do {
                i8 >>= i8;
                b = b;
                Test.sFld += (short)i6;
                i8 += (((i9 * i9) + i7) - Test.instanceCount);
                i5 -= (int)f;
                i5 += -28204;
            } while (++i9 < 6);
        } while (--i6 > 0);
        vMeth1_check_sum += i4 + i5 + i6 + i7 + i8 + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i9 + (b ? 1
            : 0) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth() {

        long l=-50951L, l1=4877117995361251570L;
        int i3=8, i10=63975, i11=-40383, i12=59;
        float f1=2.9F;
        double d1=-94.31084;

        for (l = 374; l > 23; l -= 2) {
            vMeth1(i3, i3);
            for (i10 = 1; i10 < 9; ++i10) {
                f1 -= i10;
                for (l1 = i10; l1 < 2; l1++) {
                    switch (((i10 % 1) * 5) + 55) {
                    case 60:
                        Test.instanceCount += (((l1 * i3) + i11) - i3);
                        Test.instanceCount >>= i3;
                        Test.instanceCount = (long)f1;
                        switch ((int)(((l % 2) * 5) + 105)) {
                        case 114:
                            i3 |= (int)l1;
                            d1 -= -2328406320L;
                            Test.instanceCount += i12;
                            i11 += (int)(l1 - i3);
                            break;
                        case 112:
                            Test.lArrFld[(int)(l + 1)] >>>= i3;
                            break;
                        default:
                            i3 += Test.sFld;
                        }
                    }
                }
            }
        }
        vMeth_check_sum += l + i3 + i10 + i11 + Float.floatToIntBits(f1) + l1 + i12 + Double.doubleToLongBits(d1);
    }

    public static void vSmallMeth(int i2, short s) {


        vMeth();
        vSmallMeth_check_sum += i2 + s;
    }

    public void mainTest(String[] strArr1) {

        int i=-135, i1=-50240, i13=36185, i14=61670, i15=-32404, i16=3589, i17=0, i18=14, iArr[]=new int[N];
        byte by=-83;
        boolean b1=false;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, -8);
        FuzzerUtils.init(fArr, -6.444F);

        i = 199;
        do {
            i1 = (int)(iArr[i + 1] = (int)((i >>> Test.instanceCount) - (Test.instanceCount - i1)));
            for (int smallinvoc=0; smallinvoc<62; smallinvoc++) vSmallMeth(i, Test.sFld);
            Test.instanceCount += (i * i);
            dFld += i;
            fFld += i1;
            Test.sFld |= (short)173;
            for (i13 = 126; i13 > 1; i13 -= 2) {
                Test.instanceCount &= i13;
                Test.instanceCount -= (long)1.53994;
                Test.byArrFld[i + 1] = (byte)i14;
                fFld += i13;
            }
        } while (--i > 0);
        fArr[(i13 >>> 1) % N] = i14;
        Test.instanceCount -= 8620924745760095566L;
        for (i15 = 1; i15 < 301; i15++) {
            i16 = (int)-11L;
            i14 += i15;
            Test.instanceCount += (long)dFld;
            i16 -= i1;
            i14 -= (int)Test.instanceCount;
            iArr[i15] = by;
            iArr[i15 - 1] -= 141;
            iArr = iArr;
            i14 += 12;
        }
        for (i17 = 8; i17 < 240; i17++) {
            switch (((i17 % 1) * 5) + 13) {
            case 17:
                i14 -= (int)886027555L;
                break;
            }
            i14 >>= -13;
            iArr[i17] += i13;
            b1 = b1;
        }

        FuzzerUtils.out.println("i i1 i13 = " + i + "," + i1 + "," + i13);
        FuzzerUtils.out.println("i14 i15 i16 = " + i14 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("by i17 i18 = " + by + "," + i17 + "," + i18);
        FuzzerUtils.out.println("b1 iArr fArr = " + (b1 ? 1 : 0) + "," + FuzzerUtils.checkSum(iArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld dFld = " + Test.instanceCount + "," + Test.sFld + "," +
            Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("fFld Test.lArrFld Test.byArrFld = " + Float.floatToIntBits(fFld) + "," +
            FuzzerUtils.checkSum(Test.lArrFld) + "," + FuzzerUtils.checkSum(Test.byArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}