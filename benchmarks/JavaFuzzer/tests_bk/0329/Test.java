// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:01 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-9L;
    public static boolean bFld=false;
    public static volatile short sFld=9803;
    public static int iFld=-185;

    public static long byMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth(int i2, int i3, float f1) {

        short s=-20539;

        s %= (short)(s | 1);
        vMeth_check_sum += i2 + i3 + Float.floatToIntBits(f1) + s;
    }

    public static void vMeth1(long l) {

        int i4=14, i5=8, i6=9, i7=-6, iArr1[]=new int[N];
        float f2=-1.194F;
        long l1=8087151932414689783L;
        double d=0.46335;

        FuzzerUtils.init(iArr1, -90);

        i4 = 1;
        do {
            try {
                i5 = (47791 % i4);
                i5 = (i4 / iArr1[i4]);
                iArr1[i4 - 1] = (i4 / i5);
            } catch (ArithmeticException a_e) {}
            vMeth(i4, i5, f2);
            i5 = 0;
            Test.instanceCount += (i4 | i4);
        } while (++i4 < 269);
        i5 = (int)l;
        Test.instanceCount = -5L;
        i6 = i5;
        iArr1[(-12 >>> 1) % N] >>= i6;
        Test.instanceCount <<= i6;
        i7 = 1;
        do {
            iArr1[i7 + 1] |= (int)Test.instanceCount;
            l1 = 1;
            do {
                i6 = -2;
                d = i4;
            } while (++l1 < 5);
        } while (++i7 < 339);
        vMeth1_check_sum += l + i4 + i5 + Float.floatToIntBits(f2) + i6 + i7 + l1 + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static byte byMeth(int i1, float f) {

        int iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, 2);

        vMeth((int)(Test.instanceCount + (~Test.instanceCount)), i1++, f);
        vMeth1(Test.instanceCount);
        i1 = (int)Test.instanceCount;
        iArr2[(i1 >>> 1) % N] -= i1;
        long meth_res = i1 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr2);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=1168, i8=-6059, i9=119, i10=40039, i11=-162, i12=219, i13=2, iArr[]=new int[N];
        float f3=0.51F;
        double d1=37.59061;
        long l2=-44551L;
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr, -15009);
        FuzzerUtils.init(sArr, (short)27728);

        iArr[(i >>> 1) % N] = (int)(byMeth(i, -110.862F) * f3);
        sArr[(i >>> 1) % N] -= (short)i;
        for (i8 = 24; 393 > i8; i8 += 3) {
            i9 += -15661;
            d1 += i9;
        }
        i = (int)Test.instanceCount;
        i -= (int)f3;
        for (i10 = 1; i10 < 126; ++i10) {
            i11 <<= i8;
            for (i12 = 9; 201 > i12; i12++) {
                i11 -= (int)f3;
                try {
                    i11 = (-207 % i9);
                    i13 = (80 / i10);
                    i9 = (i13 % -41953);
                } catch (ArithmeticException a_e) {}
                if (Test.bFld) {
                    f3 += i9;
                } else if (Test.bFld) {
                    i13 = i11;
                }
                l2 = 1;
                do {
                    byte by=76;
                    d1 /= (i9 | 1);
                    Test.instanceCount <<= i9;
                    i9 += (-36387 + (l2 * l2));
                    i9 += i13;
                    i13 /= (int)((long)(f3) | 1);
                    i11 += (-3728 + (l2 * l2));
                    switch ((int)(((l2 % 5) * 5) + 70)) {
                    case 84:
                        Test.instanceCount = Test.instanceCount;
                        f3 -= i13;
                        f3 += (l2 * i9);
                        break;
                    case 87:
                        i += (int)Test.instanceCount;
                        i9 += (int)l2;
                        d1 += Test.sFld;
                        Test.instanceCount += (-46454 + (l2 * l2));
                        break;
                    case 89:
                        Test.instanceCount = Test.sFld;
                        break;
                    case 88:
                        by = (byte)i11;
                        break;
                    case 79:
                        iArr[i12 + 1] &= (int)l2;
                        break;
                    default:
                        Test.iFld -= (int)54L;
                    }
                } while (++l2 < 2);
            }
        }

        FuzzerUtils.out.println("i f3 i8 = " + i + "," + Float.floatToIntBits(f3) + "," + i8);
        FuzzerUtils.out.println("i9 d1 i10 = " + i9 + "," + Double.doubleToLongBits(d1) + "," + i10);
        FuzzerUtils.out.println("i11 i12 i13 = " + i11 + "," + i12 + "," + i13);
        FuzzerUtils.out.println("l2 iArr sArr = " + l2 + "," + FuzzerUtils.checkSum(iArr) + "," +
            FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.sFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Test.sFld);
        FuzzerUtils.out.println("Test.iFld = " + Test.iFld);

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
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
//DEBUG  byMeth ->  byMeth mainTest
//DEBUG  vMeth ->  vMeth byMeth mainTest vMeth1
//DEBUG  vMeth1 ->  vMeth1 byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
