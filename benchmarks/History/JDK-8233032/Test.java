// Generated by Java* Fuzzer test generator (1.0.001). Fri Oct 25 09:08:33 2019
public class Test {

    public static final int N = 400;

    public static long instanceCount=-5406791010231515173L;
    public static float fFld=73.594F;
    public static byte byFld=-63;
    public int iFld=-161;
    public static double dFld=2.43739;
    public double dFld1=-1.114229;
    public static long lFld=4002968675L;
    public byte[][] byArrFld =new byte[N][N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i3, int i4, int i5) {

        int i6=2;
        int i7=-4;
        int i8=4;
        int i9=53;
        int i10=-147;
        int i11=-64143;
        int[] iArr =new int[N];
        float f1=1.503F;
        boolean b=false;

        FuzzerUtils.init(iArr, -2);

        for (i6 = 23; i6 < 378; i6 += 2) {
            for (i8 = 1; 9 > i8; i8++) {
                for (i10 = i6; i10 < 2; i10++) {
                    i11 = i4;
                }
                switch ((((i8 >>> 1) % 3) * 5) + 86) {
                case 87:
                    f1 += f1;
                    break;
                case 101:
                    iArr[i8 + 1] -= (int)f1;
                    if (b) break;
                case 94:
                    if (true) continue;
                    i3 >>= i7;
                    iArr[i8 + 1] -= i11;
                    break;
                default:
                    i5 |= i7;
                    i3 = (int)-1L;
                }
                i4 = i6;
                Test.instanceCount = Test.instanceCount;
            }
        }
        vMeth2_check_sum += i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11 + Float.floatToIntBits(f1) + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr);
    }

    public void vMeth1(int i2, long l1) {

        int i12=-36081, i13=-49819;
        double d=48.27433;
        long l2=-940887920608831607L;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -60112L);

        vMeth2(i2, -214, i2);
        i2 = i2;
        i2 += (int)Test.fFld;
        for (i12 = 1; i12 < 262; i12 += 3) {
            i13 = i2;
        }
        lArr[(36595 >>> 1) % N] >>>= i13;
        d += i12;
        i13 -= (int)d;
        l1 = (long)Test.fFld;
        l2 = Test.byFld;
        lArr[(-21 >>> 1) % N] *= 53;
        vMeth1_check_sum += i2 + l1 + i12 + i13 + Double.doubleToLongBits(d) + l2 + FuzzerUtils.checkSum(lArr);
    }

    public void vMeth(int i, long l, int i1) {

        float f=0.253F;
        int i14=-208;
        int i15=-202;
        int i16=-13;
        int i17=-18507;
        int i18=12371;
        int i19=-253;
        int[][] iArr1 =new int[N][N];
        boolean b1=false;

        FuzzerUtils.init(iArr1, 4);

        i1 = (int)(l + ((i1 - f) - (l - i)));
        vMeth1(i1, 3401652677761426762L);
        i -= i;
        for (i14 = 11; i14 < 388; ++i14) {
            if (b1) {
                i1 = i15;
                for (i16 = 4; i16 > 1; i16 -= 3) {
                    for (i18 = 1; i18 < 4; ++i18) {
                        double d1=13.121322;
                        f += f;
                        if (true) break;
                        i19 = (int)Test.fFld;
                        iArr1[i16 + 1][i14 + 1] -= (int)d1;
                        i = i;
                        i15 += (i18 | i16);
                        l = i1;
                    }
                }
            }
        }
        vMeth_check_sum += i + l + i1 + Float.floatToIntBits(f) + i14 + i15 + i16 + i17 + i18 + i19 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i20=53;
        int i21=179;
        int i22=4;
        int i23=50417;
        int i24=7;
        int i25=-52379;
        int i26=-83;
        int[] iArr2 =new int[N];
        short s=-18763;
        long[] lArr1 =new long[N];
        float[] fArr =new float[N];

        FuzzerUtils.init(lArr1, 7475461608860395713L);
        FuzzerUtils.init(fArr, 0.33F);
        FuzzerUtils.init(iArr2, -11);

        vMeth(iFld, Test.instanceCount, iFld);
        lArr1[(iFld >>> 1) % N] = (long)Test.fFld;
        Test.byFld *= (byte)-9869;
        for (i20 = 5; i20 < 349; i20++) {
            fArr[i20 + 1] /= ((long)(Test.fFld) | 1);
            iFld += (i20 | Test.instanceCount);
            i21 = (int)1005018514L;
            fArr[i20 - 1] -= i21;
            Test.instanceCount <<= -8;
            Test.fFld += i20;
            fArr[i20 + 1] -= -11770;
            i22 = 73;
            do {
                for (i23 = 1; i23 < 1; i23++) {
                    byArrFld[i23][i22 + 1] += (byte)13205;
                    iArr2[i23] += Test.byFld;
                    Test.instanceCount = (long)Test.dFld;
                    iArr2[i22] = i24;
                    i24 += (i23 + Test.byFld);
                }
            } while (--i22 > 0);
            iArr2[i20] *= s;
            i24 = (int)-4088606019L;
        }
        for (i25 = 12; i25 < 300; ++i25) {
            Test.instanceCount >>= 63440;
            i26 = i23;
            Test.fFld -= Test.instanceCount;
            Test.instanceCount -= Test.instanceCount;
            Test.fFld += (float)Test.dFld;
        }
        lArr1 = lArr1;
        Test.fFld = (float)dFld1;
        Test.lFld = 139;
        i24 += i21;

        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 s = " + i23 + "," + i24 + "," + s);
        FuzzerUtils.out.println("i25 i26 lArr1 = " + i25 + "," + i26 + "," + FuzzerUtils.checkSum(lArr1));
        FuzzerUtils.out.println("fArr iArr2 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + "," +
            FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.byFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.byFld);
        FuzzerUtils.out.println("iFld Test.dFld dFld1 = " + iFld + "," + Double.doubleToLongBits(Test.dFld) + "," +
            Double.doubleToLongBits(dFld1));
        FuzzerUtils.out.println("Test.lFld byArrFld = " + Test.lFld + "," + FuzzerUtils.checkSum(byArrFld));

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