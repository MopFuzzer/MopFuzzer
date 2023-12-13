// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:03 2023
public class Test0432 {

    public static final int N = 400;

    public static long instanceCount = -33319L;
    public static int iFld = 7;
    public static double dFld = -2.89716;
    public static short sFld = 1717;
    public static boolean bFld = false;
    public static int iFld1 = -145;
    public static int iFld2 = -9;

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        float f = 52.796F;
        int i2 = 3;
        int i3 = 1;
        int i4 = 5;
        int[] iArr = new int[N];
        long[] lArr1 = new long[N];
        short[][] sArr = new short[N][N];

        FuzzerUtils.init(lArr1, -3819647869199155021L);
        FuzzerUtils.init(sArr, (short) -28157);
        FuzzerUtils.init(iArr, 153);

        Test0432.iFld /= (int) ((long) (f) | 1);
        Test0432.iFld = (int) f;
        lArr1[(117 >>> 1) % N] += Test0432.instanceCount;
        Test0432.iFld *= (int) Test0432.dFld;
        sArr = sArr;
        Test0432.iFld = (int) Test0432.dFld;
        Test0432.iFld <<= Test0432.iFld;
        Test0432.instanceCount = Test0432.iFld;
        Test0432.instanceCount += Test0432.iFld;
        for (i2 = 9; i2 < 293; i2++) {
            i3 = i2;
            Test0432.iFld = i4;
        }
        iArr[(i4 >>> 1) % N] <<= i4;
        vMeth1_check_sum += Float.floatToIntBits(f) + i2 + i3 + i4 + FuzzerUtils.checkSum(lArr1) +
                FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr);
    }

    public static void main(String[] strArr) {

        try {
            Test0432 _instance = new Test0432();
            for (int i = 0; i < 10; i++) {
                _instance.mainTest(strArr);
            }
        } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
        }
    }

    public void vMeth() {


        vMeth1();
        vMeth_check_sum += 0;
    }

    public int iMeth(long l, long l1) {

        int i = 193;
        int i1 = -126;
        int i5 = -4;
        int i6 = 1;
        int i7 = -45962;
        int i8 = 60;
        int i9 = -21828;
        int[] iArr1 = new int[N];
        long[] lArr = new long[N];

        FuzzerUtils.init(lArr, -94L);
        FuzzerUtils.init(iArr1, 11);

        lArr[(Test0432.iFld >>> 1) % N] += (l--);
        for (i = 199; i > 5; i -= 2) {
            i1 += i;
            vMeth();
            i1 += (((i * l1) + l) - l1);
            i1 <<= Test0432.iFld;
        }
        for (i5 = 8; i5 < 210; i5++) {
            i7 = 1;
            while (++i7 < 8) {
                Test0432.iFld += Test0432.sFld;
                lArr[i7] >>>= Test0432.sFld;
                for (i8 = 1; 1 > i8; i8++) {
                    iArr1[i5 - 1] -= i7;
                    lArr[i8] += Test0432.iFld;
                    i1 = i6;
                    i6 += i8;
                }
            }
        }
        long meth_res = l + l1 + i + i1 + i5 + i6 + i7 + i8 + i9 + FuzzerUtils.checkSum(lArr) +
                FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int) meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i10 = -13712;
        int i11 = -37035;
        int i12 = 224;
        int i13 = -138;
        int i14 = -236;
        int i15 = 107;
        int i16 = -53707;
        int i17 = 179;
        int[] iArr2 = new int[N];
        byte by = -112;
        float f1 = 39.929F;
        long l2 = 6599585439573549076L;
        long l3 = 462036345L;
        long[] lArr2 = new long[N];

        FuzzerUtils.init(iArr2, -186);
        FuzzerUtils.init(lArr2, 7531822310271382191L);

        Test0432.iFld += iMeth(Test0432.instanceCount, Test0432.instanceCount);
        for (i10 = 6; i10 < 185; i10++) {
            Test0432.iFld *= i11;
            by += (byte) (i10 | (long) f1);
            if (Test0432.bFld) break;
            for (i12 = 5; 140 > i12; i12++) {
                switch (((i11 >>> 1) % 7) + 81) {
                    case 81:
                        Test0432.bFld = Test0432.bFld;
                        try {
                            Test0432.iFld = (i12 / 156);
                            i11 = (i11 / -11);
                            Test0432.iFld = (iArr2[i10] % i10);
                        } catch (ArithmeticException a_e) {
                        }
                        Test0432.dFld = l2;
                    case 82:
                        for (i14 = i10; i14 < 2; i14++) {
                            Test0432.iFld += Test0432.sFld;
                            i13 -= (int) Test0432.instanceCount;
                            l2 = l3;
                        }
                        i15 <<= i14;
                        i15 += i13;
                        i11 = (int) l2;
                        break;
                    case 83:
                        Test0432.iFld = (int) Test0432.instanceCount;
                        Test0432.iFld = 7269;
                        Test0432.iFld1 += (0 + (i12 * i12));
                    case 84:
                        i15 += (2 + (i12 * i12));
                        iArr2[i10 - 1] &= i13;
                        for (i16 = 1; i16 < 2; i16 += 3) {
                            i11 += (int) Test0432.dFld;
                            Test0432.iFld1 = Test0432.iFld2;
                            i17 <<= Test0432.iFld1;
                        }
                        i17 = i15;
                        break;
                    case 85:
                        Test0432.iFld1 = (int) 1.19502;
                        lArr2[i10 + 1] = i13;
                        break;
                    case 86:
                        l3 ^= i14;
                        break;
                    case 87:
                        l2 -= -202;
                        break;
                }
            }
        }

        FuzzerUtils.out.println("i10 i11 by = " + i10 + "," + i11 + "," + by);
        FuzzerUtils.out.println("f1 i12 i13 = " + Float.floatToIntBits(f1) + "," + i12 + "," + i13);
        FuzzerUtils.out.println("l2 i14 i15 = " + l2 + "," + i14 + "," + i15);
        FuzzerUtils.out.println("l3 i16 i17 = " + l3 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("iArr2 lArr2 = " + FuzzerUtils.checkSum(iArr2) + "," + FuzzerUtils.checkSum(lArr2));

        FuzzerUtils.out.println("Test0432.instanceCount Test0432.iFld Test0432.dFld = " + Test0432.instanceCount + "," + Test0432.iFld +
                "," + Double.doubleToLongBits(Test0432.dFld));
        FuzzerUtils.out.println("Test0432.sFld Test0432.bFld Test0432.iFld1 = " + Test0432.sFld + "," + (Test0432.bFld ? 1 : 0) + "," +
                Test0432.iFld1);
        FuzzerUtils.out.println("Test0432.iFld2 = " + Test0432.iFld2);

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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