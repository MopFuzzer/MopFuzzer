// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:25 2023
public class Test0278 {

    public static final int N = 400;

    public static long instanceCount=-13459L;
    public static int iFld=-5;
    public boolean bFld=true;
    public static float[] fArrFld =new float[N];
    public static short[] sArrFld =new short[N];

    static {
        FuzzerUtils.init(Test0278.fArrFld, 0.607F);
        FuzzerUtils.init(Test0278.sArrFld, (short) 8551);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        boolean b1=true;
        float f1=0.444F;
        int i5=45758;
        int i6=63468;
        int[] iArr1 =new int[N];
        double d1=-98.28426;
        byte[] byArr1 =new byte[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(byArr1, (byte)-96);
        FuzzerUtils.init(iArr1, 254);
        FuzzerUtils.init(lArr, 2217262454L);

        byArr1[(Test0278.iFld >>> 1) % N] = (byte) Test0278.iFld;
        Test0278.instanceCount -= 7501403213765883221L;
        for (int i3 : iArr1) {
            b1 = b1;
            lArr[(i3 >>> 1) % N] = i3;
            iArr1[(i3 >>> 1) % N] -= 11;
            b1 = b1;
        }
        Test0278.instanceCount = Test0278.iFld;
        Test0278.iFld = Test0278.iFld;
        f1 = 1;
        do {
            for (i5 = 1; i5 < 5; ++i5) {
                d1 -= f1;
                Test0278.iFld = Test0278.iFld;
                Test0278.instanceCount = i6;
            }
            if (b1) break;
        } while (++f1 < 322);
        vMeth2_check_sum += (b1 ? 1 : 0) + Float.floatToIntBits(f1) + i5 + i6 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(byArr1) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(int i2, boolean b) {

        short[] sArr =new short[N];

        FuzzerUtils.init(sArr, (short)15253);

        sArr[(i2 >>> 1) % N] += (short) Test0278.fArrFld[(i2 >>> 1) % N];
        vMeth2();
        vMeth1_check_sum += i2 + (b ? 1 : 0) + FuzzerUtils.checkSum(sArr);
    }

    public void vMeth(long l, float f) {

        boolean b2=false;
        int i7=-108;
        int i8=-6766;
        int i9=43041;
        int i10=23952;
        int i11=30;
        int i12=-13;
        int[] iArr =new int[N];
        double d2=125.14973;
        double[] dArr =new double[N];

        FuzzerUtils.init(iArr, -215);
        FuzzerUtils.init(dArr, 2.21387);

        iArr[(Test0278.iFld >>> 1) % N] -= (int) (Test0278.iFld & (long) (Math.abs(-27.332F) - (++Test0278.iFld)));
        Test0278.iFld += (int) (Test0278.instanceCount = (--Test0278.instanceCount));
        Test0278.fArrFld[(233 >>> 1) % N] = 88;
        Test0278.iFld -= (int) Math.max(Test0278.instanceCount, (long) ((++Test0278.iFld) + dArr[(Test0278.iFld >>> 1) % N]));
        vMeth1(Test0278.iFld, b2);
        for (i7 = 2; i7 < 192; i7 += 2) {
            i8 += 61531;
            f += ((long)i7 ^ (long)i8);
            i8 += (i7 * i7);
        }
        for (i9 = 8; i9 < 175; ++i9) {
            d2 = Test0278.iFld;
            i8 = i8;
        }
        for (i11 = 3; i11 < 326; i11++) {
            d2 = i9;
            i12 = i12;
        }
        vMeth_check_sum += l + Float.floatToIntBits(f) + (b2 ? 1 : 0) + i7 + i8 + i9 + i10 +
            Double.doubleToLongBits(d2) + i11 + i12 + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i=1;
        int i1=-111;
        int i13=-45423;
        int i14=-2;
        int i15=-159;
        int i16=-92;
        int[] iArr2 =new int[N];
        double d=1.121504, d3=109.89549;
        float f2=113.378F;
        byte by=119;
        byte[][] byArr =new byte[N][N];
        long l1=-4L;

        FuzzerUtils.init(byArr, (byte)21);
        FuzzerUtils.init(iArr2, 34180);

        for (i = 9; 175 > i; i++) {
            d -= (i1 = i);
            byArr[i][i] <<= (byte) Math.max(Test0278.instanceCount, --Test0278.instanceCount);
            vMeth(Test0278.instanceCount, f2);
            by += (byte) (i - Test0278.iFld);
        }
        i1 -= (int)72.73257;
        for (l1 = 5; l1 < 164; ++l1) {
            Test0278.iFld <<= 226;
            Test0278.instanceCount = Test0278.instanceCount;
            Test0278.instanceCount = Test0278.instanceCount;
            d3 = 1;
            while (++d3 < 158) {
                i1 = -116;
            }
            if (bFld) {
                for (i14 = 2; i14 < 158; i14++) {
                    iArr2[i14 + 1] = (int) Test0278.instanceCount;
                    switch ((((i14 >>> 1) % 9) * 5) + 67) {
                    case 110:
                        Test0278.iFld = i14;
                        i13 += -8;
                        i1 -= (int)f2;
                        i16 = 1;
                        do {
                            if (bFld) continue;
                            Test0278.iFld += (int) -1.153F;
                            Test0278.iFld += by;
                            d *= i;
                            Test0278.sArrFld[i14] -= (short) l1;
                            bFld = false;
                            iArr2[(int)(l1)] = (int)f2;
                        } while (++i16 < 2);
                    case 86:
                        f2 = Test0278.instanceCount;
                        iArr2[i14] = i16;
                        if (bFld) break;
                        break;
                    case 77:
                        i1 <<= i;
                        break;
                    case 94:
                    case 96:
                        iArr2[i14 + 1] = i15;
                        break;
                    case 71:
                        i15 += (int)(-2.501F + (i14 * i14));
                        break;
                    case 105:
                        if (bFld) continue;
                        break;
                    case 68:
                        f2 -= i16;
                        break;
                    case 99:
                        iArr2[(i13 >>> 1) % N] = (int)f2;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 d = " + i + "," + i1 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("f2 by l1 = " + Float.floatToIntBits(f2) + "," + by + "," + l1);
        FuzzerUtils.out.println("i13 d3 i14 = " + i13 + "," + Double.doubleToLongBits(d3) + "," + i14);
        FuzzerUtils.out.println("i15 i16 byArr = " + i15 + "," + i16 + "," + FuzzerUtils.checkSum(byArr));
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test0278.instanceCount Test0278.iFld bFld = " + Test0278.instanceCount + "," + Test0278.iFld + "," +
            (bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0278.fArrFld Test0278.sArrFld = " +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0278.fArrFld)) + "," + FuzzerUtils.checkSum(Test0278.sArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0278 _instance = new Test0278();
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