// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:35 2023
public class Test0501 {

    public static final int N = 400;

    public static long instanceCount=-32L;
    public short sFld=28341;
    public static byte byFld=-114;

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i9=14, i10=245, i11=-237, i12=63655;
        float f=25.219F;
        short s=-27110;
        boolean b=false;

        i9 = 1;
        while (++i9 < 298) {
            switch ((((i9 >>> 1) % 4) * 5) + 110) {
            case 121:
                Test0501.instanceCount += i9;
                i10 = i9;
                i10 = i9;
                break;
            case 120:
                for (i11 = 1; 6 > i11; i11++) {
                    double d=53.8386;
                    f = -80;
                    switch ((i11 % 5) + 52) {
                    case 52:
                        if (i9 != 0) {
                            vMeth1_check_sum += i9 + i10 + i11 + i12 + Float.floatToIntBits(f) + s + (b ? 1 : 0);
                            return;
                        }
                        Test0501.instanceCount += i11;
                        Test0501.instanceCount += (12950 + (i11 * i11));
                        break;
                    case 53:
                        f = s;
                        i12 &= (int) Test0501.instanceCount;
                        b = b;
                        break;
                    case 54:
                        Test0501.instanceCount *= i12;
                        break;
                    case 55:
                        f += i12;
                        break;
                    case 56:
                        i12 *= (int)d;
                        break;
                    }
                }
                break;
            case 114:
                i10 = (int) Test0501.instanceCount;
            case 130:
                i12 <<= i9;
                break;
            default:
                Test0501.instanceCount <<= -34913L;
            }
        }
        vMeth1_check_sum += i9 + i10 + i11 + i12 + Float.floatToIntBits(f) + s + (b ? 1 : 0);
    }

    public void vMeth(int i8) {


        vMeth1();
        vMeth_check_sum += i8;
    }

    public int iMeth(int i6, long l, int i7) {

        int i13=218;
        int i14=-10;
        int i15=9;
        int i16=6;
        int[][] iArr1 =new int[N][N];
        boolean b1=true;
        byte by=-19;
        float f1=-1.463F;

        FuzzerUtils.init(iArr1, -5);

        vMeth(i6);
        for (i13 = 3; i13 < 150; i13++) {
            if (b1) break;
            i15 = 1;
            do {
                i6 = (int) Test0501.instanceCount;
                i14 = sFld;
                i14 *= i15;
                i16 = 1;
                do {
                    by += (byte)i6;
                    if (i16 != 0) {
                    }
                    l += (i16 - i13);
                    i6 += (i16 ^ Test0501.instanceCount);
                    i7 -= (int)f1;
                    iArr1[i13][i16] >>>= (int) Test0501.instanceCount;
                    b1 = b1;
                } while (++i16 < 1);
            } while (++i15 < 11);
        }
        long meth_res = i6 + l + i7 + i13 + i14 + (b1 ? 1 : 0) + i15 + i16 + by + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-56159;
        int i1=-8451;
        int i2=22208;
        int i3=51;
        int i4=-198;
        int i5=23842;
        int i17=-100;
        int i18=25634;
        int i19=16802;
        int i20=57247;
        int i21=-137;
        int i22=12;
        int[] iArr =new int[N];
        float f2=-2.720F;

        FuzzerUtils.init(iArr, -52584);

        for (i = 7; 337 > i; i++) {
            for (i2 = 76; i2 > 3; i2 -= 2) {
                i1 = (++i1);
                try {
                    iArr[i2 + 1] = (i3 % i1);
                    i3 = (54671 % iArr[i2 + 1]);
                    i1 = (i1 / 660130091);
                } catch (ArithmeticException a_e) {}
                for (i4 = 1; i4 < 3; i4++) {
                    i5 = (((i5 - i) + iMeth(i, Test0501.instanceCount, i5)) + i);
                    Test0501.instanceCount += (i4 + i1);
                    Test0501.byFld -= (byte) -54332;
                    Test0501.instanceCount += (((i4 * i4) + f2) - f2);
                    i5 += (i4 ^ i4);
                    iArr[i] >>= (int) Test0501.instanceCount;
                    i1 |= (int)56116L;
                }
            }
            i1 = (int)f2;
            i1 -= (int) Test0501.instanceCount;
            for (i17 = i; i17 < 76; i17++) {
                for (i19 = 1; i19 < 1; i19++) {
                    i20 += (int)22506L;
                    iArr[i + 1] -= (int) Test0501.instanceCount;
                    if (false) continue;
                    Test0501.instanceCount >>= Test0501.instanceCount;
                    Test0501.instanceCount += i19;
                }
                switch (((-102 >>> 1) % 1) + 2) {
                case 2:
                    for (i21 = 1; 1 < i21; --i21) {
                        Test0501.instanceCount -= 7060;
                        i20 = Test0501.byFld;
                        Test0501.byFld >>>= (byte) i4;
                        Test0501.instanceCount -= i17;
                        Test0501.instanceCount += (i21 * i21);
                        i3 += (((i21 * Test0501.instanceCount) + f2) - i2);
                        i1 += i21;
                    }
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 i5 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("f2 i17 i18 = " + Float.floatToIntBits(f2) + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 iArr = " + i22 + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0501.instanceCount sFld Test0501.byFld = " + Test0501.instanceCount + "," + sFld + "," +
                Test0501.byFld);

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0501 _instance = new Test0501();
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