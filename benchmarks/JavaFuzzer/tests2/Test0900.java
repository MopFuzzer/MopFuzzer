// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:54 2023
public class Test0900 {

    public static final int N = 400;

    public static volatile long instanceCount=-28445L;
    public static volatile byte byFld=70;
    public static float fFld=2.678F;
    public static volatile double dFld=-2.91059;
    public static volatile short sFld=-16610;
    public static int[][] iArrFld =new int[N][N];
    public static long[][] lArrFld =new long[N][N];
    public static short[] sArrFld =new short[N];
    public volatile int[] iArrFld1 =new int[N];

    static {
        FuzzerUtils.init(Test0900.iArrFld, 8);
        FuzzerUtils.init(Test0900.lArrFld, -1455931385L);
        FuzzerUtils.init(Test0900.sArrFld, (short) -5848);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l) {

        int i2=60;
        int i3=102;
        int i4=138;
        int i5=10;
        int i6=29637;
        int[] iArr =new int[N];
        float f=2.259F;

        FuzzerUtils.init(iArr, 45205);

        i2 = -234;
        for (i3 = 4; i3 < 150; ++i3) {
            boolean b1=false;
            for (i5 = i3; 11 > i5; i5++) {
                i2 >>= i2;
                iArr[i3 + 1] = Test0900.byFld;
                i2 *= -14;
                f += i3;
                i6 -= i3;
                iArr[i3] >>>= i5;
                Test0900.lArrFld[i5 + 1][i3] += i4;
                i6 += i4;
                f *= i3;
                i2 >>= -201;
            }
            b1 = true;
            Test0900.sArrFld[i3 + 1] = (short) i3;
        }
        long meth_res = l + i2 + i3 + i4 + i5 + i6 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i1) {

        long l1=-1779120487L;
        long[] lArr =new long[N];
        double d=-71.77887, d1=74.65226;
        short s=-3232;
        int i7=-30350, i8=-12;
        boolean b2=false;
        boolean[] bArr =new boolean[N];

        FuzzerUtils.init(lArr, 9145L);
        FuzzerUtils.init(bArr, true);

        lArr[(i1 >>> 1) % N] = (Test0900.instanceCount = (4256739302L % (i1 | 1)));
        i1 -= (int) (iMeth(l1) * Test0900.fFld);
        Test0900.byFld >>>= (byte) -87;
        Test0900.fFld -= (float) d;
        Test0900.instanceCount *= s;
        for (d1 = 7; d1 < 140; d1 += 2) {
            if (b2) {
                Test0900.fFld += (-97.962F + (d1 * d1));
                Test0900.iArrFld[(int) (d1 - 1)][(int) (d1 + 1)] = i1;
                i8 = 1;
                do {
                    Test0900.instanceCount -= 53;
                    i1 += (i8 + i7);
                    Test0900.iArrFld[i8][(int) (d1 + 1)] ^= Test0900.byFld;
                    Test0900.lArrFld[i8][i8 - 1] = (long) d;
                    l1 -= (long)-1.797F;
                } while (++i8 < 23);
            } else if (b2) {
                Test0900.fFld += Test0900.instanceCount;
            } else {
                bArr[(int)(d1 - 1)] = false;
            }
        }
        vMeth1_check_sum += i1 + l1 + Double.doubleToLongBits(d) + s + Double.doubleToLongBits(d1) + i7 + i8 + (b2 ? 1
            : 0) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(bArr);
    }

    public void vMeth(int i, boolean b) {

        int i9=-43423, i10=0, i11=-6, i12=-6;
        long l2=-298516029699519433L;

        Test0900.iArrFld = (Test0900.iArrFld = (Test0900.iArrFld = (Test0900.iArrFld = Test0900.iArrFld)));
        vMeth1(i);
        for (i9 = 22; i9 < 366; ++i9) {
            for (i11 = 1; i11 < 5; i11 += 2) {
                Test0900.lArrFld[i11 - 1][i11 + 1] -= (long) 1.89057;
                Test0900.instanceCount = i11;
                i += i10;
                l2 = 1;
                while (++l2 < 3) {
                    i12 = (int)l2;
                    Test0900.fFld += i10;
                    Test0900.dFld -= -7345620968610698884L;
                    if (i10 != 0) {
                        vMeth_check_sum += i + (b ? 1 : 0) + i9 + i10 + i11 + i12 + l2;
                        return;
                    }
                    if (b) break;
                    Test0900.instanceCount -= i;
                }
            }
            Test0900.instanceCount = i9;
        }
        vMeth_check_sum += i + (b ? 1 : 0) + i9 + i10 + i11 + i12 + l2;
    }

    public void mainTest(String[] strArr1) {

        int i13=-30546, i15=8, i16=-23711, i17=-169, i18=-4, i19=7460, i20=70, i21=-6, i22=22;
        boolean b3=true;
        long l3=-2L;
        short s1=588;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, 110.158F);

        vMeth(i13, b3);
        switch (((i13 >>> 1) % 10) + 117) {
        case 117:
            for (int i14 : iArrFld1) {
                Test0900.instanceCount = 113;
            }
            Test0900.fFld += Test0900.instanceCount;
            i13 += i13;
            break;
        case 118:
            for (i15 = 7; i15 < 243; ++i15) {
                i16 <<= i16;
                Test0900.iArrFld[i15] = FuzzerUtils.int1array(N, (int) -50763);
                for (i17 = 106; i17 > i15; i17--) {
                    i16 -= (int) Test0900.instanceCount;
                    for (i19 = 1; 1 < i19; i19 -= 2) {
                        fArr[i19] = i17;
                        iArrFld1 = Test0900.iArrFld[i17 - 1];
                        Test0900.fFld /= 2567L;
                        i18 += (i19 + l3);
                        Test0900.fFld += s1;
                        Test0900.lArrFld[i15 + 1][i17 + 1] *= (long) Test0900.fFld;
                        Test0900.fFld *= -57234;
                        Test0900.fFld = i17;
                    }
                    i18 = i17;
                    i13 = i13;
                    for (i21 = 1; i21 < 1; ++i21) {
                        i22 += (((i21 * Test0900.fFld) + i21) - i20);
                        i22 += i21;
                        Test0900.sArrFld[i15] &= (short) i19;
                        Test0900.sArrFld[i17 - 1] = (short) 14;
                        l3 /= (Test0900.instanceCount | 1);
                        Test0900.fFld -= i22;
                        i22 = (int) Test0900.instanceCount;
                    }
                }
            }
            break;
        case 119:
            iArrFld1[(i15 >>> 1) % N] -= Test0900.sFld;
            break;
        case 120:
            l3 -= l3;
            break;
        case 121:
            i20 = (int)l3;
            break;
        case 122:
            i22 *= (int) Test0900.dFld;
            break;
        case 123:
            i18 = i19;
            break;
        case 124:
            s1 -= (short) Test0900.instanceCount;
        case 125:
        case 126:
            Test0900.dFld = l3;
            break;
        }

        FuzzerUtils.out.println("i13 b3 i15 = " + i13 + "," + (b3 ? 1 : 0) + "," + i15);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 l3 = " + i19 + "," + i20 + "," + l3);
        FuzzerUtils.out.println("s1 i21 i22 = " + s1 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test0900.instanceCount Test0900.byFld Test0900.fFld = " + Test0900.instanceCount + "," + Test0900.byFld +
                "," + Float.floatToIntBits(Test0900.fFld));
        FuzzerUtils.out.println("Test0900.dFld Test0900.sFld Test0900.iArrFld = " + Double.doubleToLongBits(Test0900.dFld) + "," +
                Test0900.sFld + "," + FuzzerUtils.checkSum(Test0900.iArrFld));
        FuzzerUtils.out.println("Test0900.lArrFld Test0900.sArrFld iArrFld1 = " + FuzzerUtils.checkSum(Test0900.lArrFld) + "," +
                FuzzerUtils.checkSum(Test0900.sArrFld) + "," + FuzzerUtils.checkSum(iArrFld1));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0900 _instance = new Test0900();
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}