// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:35 2023
public class Test0509 {

    public static final int N = 400;

    public static long instanceCount=-238L;
    public static long lFld=3983226750253480110L;
    public static volatile int iFld=-13;
    public static double dFld=-10.49077;
    public static volatile float fFld=0.286F;
    public int iFld1=-46;
    public boolean bFld=true;
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0509.lArrFld, -144L);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(short s1, int i4, int i5) {

        int i6=97;
        int i7=2;
        int i9=11;
        int i10=2;
        int i11=-1;
        int i12=-12;
        int i13=-45872;
        int[] iArr =new int[N];
        boolean b=false;
        float f2=77.777F;

        FuzzerUtils.init(iArr, -11);

        i5 >>= i5;
        for (i6 = 2; i6 < 365; i6++) {
            i7 += i6;
            if (b) {
                Test0509.lFld += i7;
                i7 = i6;
            } else if (b) {
                b = b;
            } else if (b) {
                Test0509.lFld -= i7;
                vMeth_check_sum += s1 + i4 + i5 + i6 + i7 + (b ? 1 : 0) + i9 + i10 + i11 + Float.floatToIntBits(f2) +
                    i12 + i13 + FuzzerUtils.checkSum(iArr);
                return;
            } else {
                for (i9 = 1; i9 < 5; ++i9) {
                    i11 = 1;
                    do {
                        f2 = i11;
                    } while (++i11 < 2);
                    for (i12 = i9; 2 > i12; i12++) {
                        iArr = iArr;
                        f2 -= i7;
                        i13 += (i12 - i5);
                    }
                }
            }
        }
        vMeth_check_sum += s1 + i4 + i5 + i6 + i7 + (b ? 1 : 0) + i9 + i10 + i11 + Float.floatToIntBits(f2) + i12 + i13
            + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth1(long l) {

        float f1=-49.746F;
        short s2=32039;
        int i14=-1;
        int i15=2167;
        int[] iArr1 =new int[N];
        double d=1.48982;

        FuzzerUtils.init(iArr1, 59770);

        l = (Test0509.instanceCount--);
        f1 -= (Test0509.lFld *= (++Test0509.lFld));
        Test0509.instanceCount %= (Test0509.lFld | 1);
        vMeth(s2, 13, Test0509.iFld);
        i14 = 1;
        while (++i14 < 230) {
            Test0509.iFld = i14;
            Test0509.dFld += s2;
            s2 += (short) Test0509.iFld;
            iArr1[i14] >>= i14;
            for (d = 7; d > 1; d--) {
                Test0509.iFld >>= i15;
                Test0509.instanceCount += (long) (d * d);
                i15 += (int)d;
            }
            i15 = i14;
            i15 <<= i14;
        }
        long meth_res = l + Float.floatToIntBits(f1) + s2 + i14 + Double.doubleToLongBits(d) + i15 +
            FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i3) {

        int i16=-30849, i17=9, i18=54763;
        double d1=0.43303;
        short s3=-6634;

        i3 >>>= 5;
        i3 -= ((i3 <<= iMeth1(Test0509.lFld)) * Test0509.iFld);
        for (i16 = 4; i16 < 147; ++i16) {
            for (d1 = 1; d1 < 11; d1 += 2) {
                Test0509.lArrFld[(int) (d1)] = -3966333253L;
                i17 -= 10;
                Test0509.iFld *= s3;
            }
            i18 = -243;
            Test0509.dFld -= -13;
            Test0509.lFld >>= i17;
        }
        long meth_res = i3 + i16 + i17 + Double.doubleToLongBits(d1) + i18 + s3;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=-1.945F;
        int i=17699;
        int i1=6;
        int i2=16;
        int i19=-14;
        int i20=-3;
        int i21=72;
        int i22=-6469;
        int i23=163;
        int i24=-16336;
        int i25=1;
        int i26=58541;
        int[][] iArr2 =new int[N][N];
        short s=11843;
        long l1=-2579059101L;
        byte by=15;

        FuzzerUtils.init(iArr2, 3);

        f = 1;
        do {
            i *= Integer.reverseBytes((int) ((s + Test0509.instanceCount) * (--i)));
            Test0509.lArrFld[(int) (f)] += ((i * (i %= (int) (Test0509.instanceCount | 1))) + i);
            for (i1 = (int)(f); i1 < 117; i1++) {
                Test0509.instanceCount = (-Integer.reverseBytes(-(i1 * i)));
                i2 -= iMeth(i);
                for (i19 = 1; i19 < 1; ++i19) {
                    Test0509.fFld = iFld1;
                }
            }
            Test0509.iFld <<= Test0509.iFld;
            i20 &= i2;
            Test0509.iFld -= i;
            iFld1 = i2;
            for (i21 = 5; i21 < 117; i21++) {
                Test0509.fFld += (((i21 * iFld1) + Test0509.fFld) - i1);
                i2 = (int) Test0509.dFld;
                i20 <<= i19;
                i20 >>= i1;
                if (bFld) continue;
            }
        } while (++f < 215);
        Test0509.dFld += 0.101225;
        for (i23 = 9; i23 < 149; i23++) {
            Test0509.fFld += (i23 + i21);
            l1 = 1;
            while (++l1 < 179) {
                switch ((int)(((l1 % 5) * 5) + 24)) {
                case 45:
                    Test0509.iFld &= iFld1;
                    Test0509.lFld += l1;
                    for (i25 = 1; i25 < 1; ++i25) {
                        Test0509.lFld -= i19;
                        i += (((i25 * l1) + by) - i26);
                        i26 += (((i25 * f) + by) - Test0509.instanceCount);
                    }
                    Test0509.lFld -= i26;
                    break;
                case 27:
                    Test0509.lFld >>= Test0509.lFld;
                    break;
                case 28:
                    Test0509.fFld = i19;
                    break;
                case 31:
                    iArr2[i23 - 1][i23 + 1] = i;
                case 37:
                    i2 = i20;
                    break;
                }
            }
        }

        FuzzerUtils.out.println("f i s = " + Float.floatToIntBits(f) + "," + i + "," + s);
        FuzzerUtils.out.println("i1 i2 i19 = " + i1 + "," + i2 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 l1 = " + i23 + "," + i24 + "," + l1);
        FuzzerUtils.out.println("i25 i26 by = " + i25 + "," + i26 + "," + by);
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test0509.instanceCount Test0509.lFld Test0509.iFld = " + Test0509.instanceCount + "," + Test0509.lFld +
                "," + Test0509.iFld);
        FuzzerUtils.out.println("Test0509.dFld Test0509.fFld iFld1 = " + Double.doubleToLongBits(Test0509.dFld) + "," +
                Float.floatToIntBits(Test0509.fFld) + "," + iFld1);
        FuzzerUtils.out.println("bFld Test0509.lArrFld = " + (bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(Test0509.lArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0509 _instance = new Test0509();
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
