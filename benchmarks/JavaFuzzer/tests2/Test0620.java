// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:41 2023
public class Test0620 {

    public static final int N = 400;

    public static long instanceCount=3198099194048841282L;
    public int iFld=-30951;
    public boolean bFld=true;
    public static int iFld1=91;
    public static byte byFld=-90;
    public short sFld=-15984;
    public static int[][] iArrFld =new int[N][N];
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0620.iArrFld, 56244);
        FuzzerUtils.init(Test0620.lArrFld, 1890784115257723098L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        float f1=-48.848F;
        int i8=-3, i9=137, i10=-64392, i11=-41774, i12=5, i13=10, i14=-1;
        short s=25930;
        double d=1.13821;

        Test0620.iArrFld[(Test0620.iFld1 >>> 1) % N][(Test0620.iFld1 >>> 1) % N] = (int) f1;
        Test0620.instanceCount <<= i8;
        s = (short)12;
        Test0620.iArrFld[(i8 >>> 1) % N][(i8 >>> 1) % N] = Test0620.iFld1;
        Test0620.instanceCount = Test0620.iFld1;
        for (i9 = 209; i9 > 6; i9 -= 2) {
            for (i11 = 1; i11 < 15; ++i11) {
                d -= Test0620.instanceCount;
            }
            switch ((i9 % 7) + 45) {
            case 45:
                for (i13 = 1; i13 < 15; i13++) {
                    f1 += Test0620.instanceCount;
                    Test0620.iFld1 *= (int) Test0620.instanceCount;
                    Test0620.iFld1 = i11;
                    f1 -= 210L;
                    i10 = i12;
                }
                break;
            case 46:
                i10 += (i9 | i14);
                break;
            case 47:
                d += 4992;
            case 48:
                Test0620.instanceCount += i9;
            case 49:
                Test0620.iFld1 = i9;
                break;
            case 50:
                Test0620.iFld1 = Test0620.iFld1;
                break;
            case 51:
                f1 += (((i9 * Test0620.instanceCount) + i11) - f1);
                break;
            }
        }
        vMeth2_check_sum += Float.floatToIntBits(f1) + i8 + s + i9 + i10 + i11 + i12 + Double.doubleToLongBits(d) + i13
            + i14;
    }

    public static void vMeth1() {

        int i6=-57712, i7=10, i15=24, i16=-7, i17=13173;
        float f2=-1.318F;
        byte by1=-6;

        Test0620.iFld1 |= -216;
        for (i6 = 7; i6 < 204; i6++) {
            vMeth2();
            i7 <<= (int) Test0620.instanceCount;
            i15 = 1;
            while (++i15 < 8) {
                Test0620.iFld1 = i6;
            }
        }
        f2 *= -9;
        by1 |= (byte) Test0620.iFld1;
        i7 = (int)1.607F;
        Test0620.lArrFld[(Test0620.iFld1 >>> 1) % N] = Test0620.iFld1;
        Test0620.iFld1 = i6;
        i7 = Test0620.iFld1;
        for (i16 = 6; i16 < 126; i16++) {
            Test0620.iArrFld[i16 - 1][i16 + 1] = i15;
            i17 += i16;
        }
        vMeth1_check_sum += i6 + i7 + i15 + Float.floatToIntBits(f2) + by1 + i16 + i17;
    }

    public static void vMeth(long l, int i5, long l1) {


        vMeth1();
        vMeth_check_sum += l + i5 + l1;
    }

    public void mainTest(String[] strArr1) {

        float f=0.168F;
        float f3=0.857F;
        float[] fArr =new float[N];
        int i=-11242;
        int i1=-29247;
        int i2=57435;
        int i3=-45241;
        int i4=-151;
        int i18=-186;
        int i19=-8;
        int i20=56823;
        int[] iArr =new int[N];
        double d1=2.94181;

        FuzzerUtils.init(fArr, 33.884F);
        FuzzerUtils.init(iArr, 11878);

        fArr[(59942 >>> 1) % N] -= (f += (f--));
        i = (i * ((i * iFld) - (iFld--)));
        iFld = (iFld * ((i + i) + iArr[(-109 >>> 1) % N]));
        for (i1 = 4; i1 < 256; i1++) {
            byte by=-108;
            iArr[i1 - 1] = (++by);
            Test0620.instanceCount += (i1 * i2);
            for (i3 = 3; i3 < 100; ++i3) {
                Test0620.instanceCount += (i3 * i);
                if (bFld) continue;
                vMeth(-63492L, i2, Test0620.instanceCount);
                iArr[i3] = iFld;
                i2 = i3;
            }
            i4 <<= i1;
        }
        for (f3 = 6; f3 < 269; f3++) {
            i19 = 1;
            while (++i19 < 96) {
                i += (((i19 * Test0620.byFld) + i18) - i1);
                i -= i;
                i20 = 1;
                while (++i20 < 1) {
                    iArr[i19] = i3;
                    Test0620.iFld1 = i1;
                    d1 = -50367;
                    switch ((i19 % 5) + 28) {
                    case 28:
                        switch (((i19 % 1) * 5) + 79) {
                        case 84:
                            iArr[(int) (f3)] = (int) Test0620.instanceCount;
                            break;
                        }
                        switch (((i4 >>> 1) % 5) + 5) {
                        case 5:
                            i4 += (i20 + i1);
                            break;
                        case 6:
                            d1 -= Test0620.instanceCount;
                            Test0620.instanceCount -= i18;
                            Test0620.iFld1 += (i20 * i20);
                            break;
                        case 7:
                            i18 += (((i20 * Test0620.iFld1) + i) - i2);
                        case 8:
                            i4 = i1;
                            break;
                        case 9:
                            Test0620.iArrFld[i20] = FuzzerUtils.int1array(N, (int) -166);
                            break;
                        }
                    case 29:
                        Test0620.instanceCount -= i3;
                        break;
                    case 30:
                        Test0620.iFld1 += (int) d1;
                        break;
                    case 31:
                        sFld += (short)i1;
                        break;
                    case 32:
                        Test0620.iArrFld[i20 - 1] = iArr;
                        break;
                    default:
                        iFld = i;
                    }
                }
            }
        }

        FuzzerUtils.out.println("f i i1 = " + Float.floatToIntBits(f) + "," + i + "," + i1);
        FuzzerUtils.out.println("i2 i3 i4 = " + i2 + "," + i3 + "," + i4);
        FuzzerUtils.out.println("f3 i18 i19 = " + Float.floatToIntBits(f3) + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 d1 fArr = " + i20 + "," + Double.doubleToLongBits(d1) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0620.instanceCount iFld bFld = " + Test0620.instanceCount + "," + iFld + "," + (bFld ? 1 :
            0));
        FuzzerUtils.out.println("Test0620.iFld1 Test0620.byFld sFld = " + Test0620.iFld1 + "," + Test0620.byFld + "," + sFld);
        FuzzerUtils.out.println("Test0620.iArrFld Test0620.lArrFld = " + FuzzerUtils.checkSum(Test0620.iArrFld) + "," +
                FuzzerUtils.checkSum(Test0620.lArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0620 _instance = new Test0620();
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
