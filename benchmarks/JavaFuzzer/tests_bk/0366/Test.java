// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:02 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1336685328800548392L;
    public static double dFld=0.116891;
    public static boolean bFld=false;
    public static int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 35052);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i5=35334, i6=-2213, i7=-3, i8=7, i9=5;
        boolean b1=false;
        float f1=18.944F;
        double d=2.115927;

        Test.iArrFld[(i5 >>> 1) % N][(i5 >>> 1) % N] += -43651;
        b1 = b1;
        for (f1 = 6; f1 < 146; ++f1) {
            Test.iArrFld[(int)(f1)][(int)(f1)] = (int)Test.instanceCount;
            Test.dFld += i5;
            for (d = f1; d < 11; d++) {
                i5 += i6;
                i8 = 1;
                while (++i8 < 1) {
                    if (false) continue;
                    if (b1) break;
                    Test.instanceCount += (long)(0.13F + (i8 * i8));
                    if (b1) break;
                    Test.dFld -= 8;
                    i5 += (i8 * i8);
                    i7 = i9;
                }
            }
        }
        vMeth1_check_sum += i5 + (b1 ? 1 : 0) + Float.floatToIntBits(f1) + i6 + Double.doubleToLongBits(d) + i7 + i8 +
            i9;
    }

    public static void vMeth(int i3, short s, int i4) {


        vMeth1();
        vMeth_check_sum += i3 + s + i4;
    }

    public static long lMeth(int i1, float f) {

        boolean b=false, bArr[]=new boolean[N];
        short s1=26422;
        int i10=-63554, i11=13, i12=176, iArr[]=new int[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr, -9);
        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(dArr, 2.46974);

        for (int i2 : iArr) {
            if (bArr[(i2 >>> 1) % N] = (b = b)) break;
            vMeth(i2, s1, 33391);
            i1 >>= i2;
            dArr[(i2 >>> 1) % N] += Test.instanceCount;
            i2 = i2;
        }
        Test.iArrFld[(i1 >>> 1) % N][(i1 >>> 1) % N] = (int)-71L;
        i1 = -1;
        i1 = i1;
        i1 <<= i1;
        i1 += i1;
        i10 = 1;
        do {
            for (i11 = 1; i11 < 9; ++i11) {
                f = i1;
                i12 = i11;
            }
        } while (++i10 < 179);
        long meth_res = i1 + Float.floatToIntBits(f) + (b ? 1 : 0) + s1 + i10 + i11 + i12 + FuzzerUtils.checkSum(iArr)
            + FuzzerUtils.checkSum(bArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=230, i13=177, i14=123, i15=-14002, i16=-15231, i17=91;
        byte by=-120, byArr[]=new byte[N];
        float f2=-1.928F, f4=2.388F, fArr[]=new float[N];
        short s2=10946;
        double dArr1[]=new double[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(fArr, 1.415F);
        FuzzerUtils.init(byArr, (byte)91);
        FuzzerUtils.init(dArr1, -3.4475);
        FuzzerUtils.init(lArr, -5L);

        i &= (int)((-1L - (++Test.dFld)) * ((by -= (byte)-46827L) * (++Test.instanceCount)));
        lMeth(i, f2);
        i = i;
        i = i;
        Test.instanceCount -= 49;
        i = i;
        i += (int)-59.347F;
        Test.dFld *= Test.dFld;
        for (float f3 : fArr) {
            for (i13 = 1; 63 > i13; ++i13) {
                i14 = (int)Test.instanceCount;
                i -= i14;
                byArr[i13 - 1] = (byte)Test.instanceCount;
                f3 -= i13;
                Test.bFld = Test.bFld;
                i15 = 1;
                while (++i15 < 2) {
                    Test.dFld += Test.dFld;
                    Test.iArrFld = Test.iArrFld;
                    i14 %= (int)(i | 1);
                    i14 += (((i15 * i15) + f4) - i);
                }
                i %= (int)(i13 | 1);
                i14 = i13;
                i += i14;
            }
            Test.iArrFld[(i15 >>> 1) % N][(i14 >>> 1) % N] -= i13;
            switch (((i15 >>> 1) % 9) + 102) {
            case 102:
                for (i16 = 1; i16 < 63; ++i16) {
                    by += (byte)(i16 + Test.instanceCount);
                }
            case 103:
                f3 += Test.instanceCount;
                dArr1[(i >>> 1) % N] *= -13L;
            case 104:
                i14 >>= (int)Test.instanceCount;
                break;
            case 105:
                Test.instanceCount += (long)f3;
                break;
            case 106:
                i14 = (int)9L;
                break;
            case 107:
                i = s2;
                break;
            case 108:
                s2 *= (short)Test.instanceCount;
                break;
            case 109:
                lArr[(i16 >>> 1) % N] -= i17;
                break;
            case 110:
                Test.iArrFld[(i15 >>> 1) % N][(-10 >>> 1) % N] *= (int)f3;
            default:
                i17 = (int)Test.dFld;
            }
        }

        FuzzerUtils.out.println("i by f2 = " + i + "," + by + "," + Float.floatToIntBits(f2));
        FuzzerUtils.out.println("i13 i14 i15 = " + i13 + "," + i14 + "," + i15);
        FuzzerUtils.out.println("f4 i16 i17 = " + Float.floatToIntBits(f4) + "," + i16 + "," + i17);
        FuzzerUtils.out.println("s2 fArr byArr = " + s2 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            "," + FuzzerUtils.checkSum(byArr));
        FuzzerUtils.out.println("dArr1 lArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)) + "," +
            FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.bFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
