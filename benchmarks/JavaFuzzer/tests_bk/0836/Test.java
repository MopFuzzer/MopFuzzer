// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:14 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2L;
    public volatile int iFld=-8106;
    public static volatile byte byFld=117;
    public static volatile short sFld=-19588;
    public static float fFld=-1.863F;
    public boolean bFld=false;
    public static int iArrFld[]=new int[N];
    public static byte byArrFld[]=new byte[N];
    public short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 59020);
        FuzzerUtils.init(Test.byArrFld, (byte)85);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i4=19741, i5=6, i6=-88, i7=-7, i8=4;
        float f=-43.43F;

        for (i4 = 9; i4 < 158; i4++) {
            Test.byArrFld = FuzzerUtils.byte1array(N, (byte)-78);
            i5 += (int)Test.instanceCount;
            i6 = 1;
            while (++i6 < 11) {
                Test.instanceCount <<= 61420;
                i5 += i4;
                for (i7 = 1; 1 < i7; --i7) {
                    Test.instanceCount = 2;
                    i5 += (int)f;
                    Test.sFld += (short)(((i7 * i7) + f) - i4);
                    i5 = (int)-9054472118783161936L;
                    Test.byFld += (byte)i7;
                    i8 += (i7 ^ i7);
                    i8 += (int)Test.instanceCount;
                    Test.instanceCount += i6;
                }
            }
        }
        vMeth_check_sum += i4 + i5 + i6 + i7 + i8 + Float.floatToIntBits(f);
    }

    public int iMeth1() {

        boolean b=false;
        int i9=-27014, i10=146, i11=8;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 40L);

        for (int i3 : Test.iArrFld) {
            vMeth();
            switch (((iFld >>> 1) % 1) + 23) {
            case 23:
                if (b) break;
                break;
            }
            iFld <<= (int)Test.instanceCount;
            lArr[(i3 >>> 1) % N] = i3;
            for (i9 = 4; i9 > 1; i9 -= 2) {
                sArrFld[i9] = (short)iFld;
                switch ((i9 % 2) + 67) {
                case 67:
                    lArr[i9] -= i3;
                    Test.instanceCount = Test.instanceCount;
                    i11 = 1;
                    do {
                        i10 = iFld;
                        Test.instanceCount -= (long)Test.fFld;
                        lArr[i9] <<= i3;
                    } while (++i11 < 4);
                    break;
                case 68:
                    iFld |= (int)Test.instanceCount;
                    break;
                }
            }
        }
        long meth_res = (b ? 1 : 0) + i9 + i10 + i11 + FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth(long l, int i) {

        long l1=-4092768171L;
        int i1=5, i2=53166, i12=12004, i13=36637, iArr[]=new int[N];
        double d=-1.35451;

        FuzzerUtils.init(iArr, 171);

        for (l1 = 6; l1 < 187; ++l1) {
            for (d = l1; d < 9; d++) {
                i = (--iArr[(int)(d - 1)]);
                i1 |= Math.min(i1, Integer.reverseBytes(Test.byFld + i1));
            }
            Test.instanceCount &= (-iMeth1());
            switch ((int)((l1 % 3) + 5)) {
            case 5:
                Test.sFld >>= (short)-3;
                for (i12 = 9; i12 > l1; i12 -= 2) {
                    l = Test.byFld;
                    Test.fFld *= Test.byFld;
                }
                break;
            case 6:
                Test.sFld += (short)l1;
                if (bFld) {
                    iFld = (int)d;
                    i13 &= i2;
                }
                i1 += (int)l1;
                break;
            case 7:
                l += (l1 ^ i12);
            }
        }
        long meth_res = l + i + l1 + i1 + Double.doubleToLongBits(d) + i2 + i12 + i13 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i14=-50215, i15=-58609, i16=-11, i17=-16243, i18=-248, i19=-75;
        double d1=1.68091, d2=-2.49308;

        iFld -= (int)(((iFld - Test.instanceCount) - (-5 * (++iFld))) * (iFld * (iFld - 22474L)));
        iFld -= Integer.reverseBytes(Integer.reverseBytes(Test.byFld + iFld));
        Test.instanceCount >>= iMeth(Test.instanceCount, iFld);
        iFld >>= iFld;
        i14 = 235;
        do {
            Test.instanceCount = i14;
            for (i15 = i14; i15 < 107; i15++) {
                Test.iArrFld[i15 - 1] += i16;
                iFld += i15;
                Test.iArrFld[i14 + 1] += i14;
                switch ((i15 % 1) + 89) {
                case 89:
                    i16 = (int)Test.instanceCount;
                }
                iFld += (i15 + Test.instanceCount);
            }
        } while (--i14 > 0);
        i16 -= i15;
        iFld <<= (int)911715427L;
        d1 = 242;
        while ((d1 -= 3) > 0) {
            Test.instanceCount -= iFld;
            i16 *= iFld;
            iFld -= i14;
        }
        Test.iArrFld[(-22879 >>> 1) % N] -= i16;
        for (d2 = 12; d2 < 309; d2++) {
            Test.instanceCount += (long)d2;
            i16 += i17;
            if (false) break;
            Test.instanceCount *= -95;
            Test.instanceCount <<= i16;
            for (i18 = 85; i18 > 3; i18 -= 2) {
                Test.instanceCount *= -29;
                iFld += (i18 ^ Test.instanceCount);
                i19 += (int)(2.372F + (i18 * i18));
            }
        }

        FuzzerUtils.out.println("i14 i15 i16 = " + i14 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("d1 d2 i17 = " + Double.doubleToLongBits(d1) + "," + Double.doubleToLongBits(d2) + ","
            + i17);
        FuzzerUtils.out.println("i18 i19 = " + i18 + "," + i19);

        FuzzerUtils.out.println("Test.instanceCount iFld Test.byFld = " + Test.instanceCount + "," + iFld + "," +
            Test.byFld);
        FuzzerUtils.out.println("Test.sFld Test.fFld bFld = " + Test.sFld + "," + Float.floatToIntBits(Test.fFld) + ","
            + (bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iArrFld Test.byArrFld sArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(Test.byArrFld) + "," + FuzzerUtils.checkSum(sArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}