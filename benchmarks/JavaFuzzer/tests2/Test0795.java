// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:49 2023
public class Test0795 {

    public static final int N = 400;

    public static volatile long instanceCount=-1701066712150117685L;
    public static float fFld=79.115F;
    public static volatile boolean bFld=false;
    public byte byFld=121;
    public static short[] sArrFld =new short[N];

    static {
        FuzzerUtils.init(Test0795.sArrFld, (short) -13465);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static int iMeth1(int i4, int i5, int i6) {


        i4 += Test0795.sArrFld[(-8 >>> 1) % N];
        long meth_res = i4 + i5 + i6;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i8, int i9, int i10) {

        int i11=4;
        int i12=-9;
        int i13=-10;
        int[] iArr =new int[N];
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -2446423577406233294L);
        FuzzerUtils.init(iArr, 159);

        for (i11 = 8; i11 < 363; i11++) {
            lArr[i11 + 1] = (long) Test0795.fFld;
            Test0795.fFld -= Test0795.instanceCount;
        }
        iArr[(i11 >>> 1) % N] -= (int) Test0795.fFld;
        i13 = 1;
        do {
            iArr = iArr;
            i9 = i8;
            i12 -= (int) Test0795.instanceCount;
            i8 = (int) Test0795.fFld;
            i12 *= 31354;
            i12 += i13;
            Test0795.fFld = Test0795.fFld;
            if (Test0795.bFld) break;
            i10 <<= i13;
        } while (++i13 < 205);
        vMeth_check_sum += i8 + i9 + i10 + i11 + i12 + i13 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth2(int i7) {

        int i14=13, i15=253, i16=-92, i17=199, i18=25, i19=-44063;
        double d=0.45936;

        vMeth(i7, i7, i7);
        for (i14 = 7; i14 < 121; ++i14) {
            for (i16 = 1; i16 < 14; ++i16) {
                for (i18 = 1; i18 < 2; i18++) {
                    i15 += (((i18 * Test0795.instanceCount) + i16) - Test0795.instanceCount);
                    i17 *= (int) Test0795.instanceCount;
                    d = i19;
                    switch ((i16 % 5) + 45) {
                    case 45:
                        i19 += (i18 * i18);
                        Test0795.fFld += (i18 * i18);
                        Test0795.instanceCount = (long) Test0795.fFld;
                        i19 >>= i14;
                        break;
                    case 46:
                        Test0795.instanceCount = i19;
                    case 47:
                        d = Test0795.fFld;
                        Test0795.fFld += -28;
                        break;
                    case 48:
                        i17 += i18;
                    case 49:
                        i15 += -34896;
                        break;
                    default:
                        Test0795.fFld -= i18;
                    }
                }
            }
        }
        long meth_res = i7 + i14 + i15 + i16 + i17 + i18 + i19 + Double.doubleToLongBits(d);
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i3) {

        byte by=20;

        by = (byte)Math.max(iMeth1(i3, -11, i3) * iMeth1(i3, 31, i3), iMeth1(iMeth2(i3), i3, i3));
        long meth_res = i3 + by;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=-2.921F;
        int i=-50;
        int i1=44;
        int i2=179;
        int i20=-10;
        int i21=-7;
        int i22=-10;
        int i23=-47111;
        int i24=-37187;
        int[] iArr1 =new int[N];
        double d1=-25.89765;
        long l=7L;

        FuzzerUtils.init(iArr1, -10);

        f += i;
        for (i1 = 2; 350 > i1; ++i1) {
            Test0795.instanceCount *= iMeth(-2);
            for (i20 = 3; i20 < 72; ++i20) {
                i21 = i2;
                Test0795.fFld *= Test0795.instanceCount;
                i2 += (i20 * i21);
                if (true) {
                    i2 += byFld;
                    iArr1[i20] *= (int)160442804L;
                    Test0795.instanceCount += (-6 + (i20 * i20));
                    f += i20;
                } else if (Test0795.bFld) {
                    i = 44676;
                    Test0795.fFld += i20;
                    for (d1 = i20; d1 < 2; ++d1) {
                        Test0795.instanceCount += Test0795.instanceCount;
                    }
                } else if (Test0795.bFld) {
                    i22 += i20;
                    iArr1[i1 + 1] -= (int) Test0795.instanceCount;
                    for (l = 1; l < 2; ++l) {
                        if (Test0795.bFld) break;
                        byFld += (byte)i;
                    }
                } else {
                }
                byFld = (byte)i23;
                iArr1[i1] <<= i1;
                i2 += (((i20 * Test0795.instanceCount) + l) - i22);
                i24 = 1;
                do {
                    if (Test0795.bFld) break;
                    Test0795.fFld += 10;
                    i += i24;
                    try {
                        i2 = (i24 / -98);
                        i2 = (i23 / -110);
                        iArr1[i24] = (i24 % -48222);
                    } catch (ArithmeticException a_e) {}
                    i += (int)-1.35058;
                } while (++i24 < 2);
            }
        }

        FuzzerUtils.out.println("f i i1 = " + Float.floatToIntBits(f) + "," + i + "," + i1);
        FuzzerUtils.out.println("i2 i20 i21 = " + i2 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("d1 i22 l = " + Double.doubleToLongBits(d1) + "," + i22 + "," + l);
        FuzzerUtils.out.println("i23 i24 iArr1 = " + i23 + "," + i24 + "," + FuzzerUtils.checkSum(iArr1));

        FuzzerUtils.out.println("Test0795.instanceCount Test0795.fFld Test0795.bFld = " + Test0795.instanceCount + "," +
                Float.floatToIntBits(Test0795.fFld) + "," + (Test0795.bFld ? 1 : 0));
        FuzzerUtils.out.println("byFld Test0795.sArrFld = " + byFld + "," + FuzzerUtils.checkSum(Test0795.sArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth2_check_sum: " + iMeth2_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0795 _instance = new Test0795();
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
//DEBUG  iMeth2 ->  iMeth2 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth2 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
