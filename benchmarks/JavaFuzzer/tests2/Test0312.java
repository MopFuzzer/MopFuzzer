// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:26 2023
public class Test0312 {

    public static final int N = 400;

    public static long instanceCount=-11L;
    public static int iFld=7;
    public static float fFld=0.939F;
    public static boolean bFld=false;

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        boolean b=true;
        byte by=55;
        float f1=2.616F;
        double d=-10.71194;
        int i6=-6;
        int i7=18713;
        int i8=178;
        int[] iArr1 =new int[N];

        FuzzerUtils.init(iArr1, 54);

        b = b;
        by /= (byte) (Test0312.iFld | 1);
        Test0312.iFld += (int) Test0312.instanceCount;
        Test0312.iFld = by;
        iArr1[(25120 >>> 1) % N] = Test0312.iFld;
        f1 = Test0312.instanceCount;
        Test0312.iFld >>= Test0312.iFld;
        d = 1;
        while (++d < 129) {
            for (i6 = 12; i6 > d; i6 -= 3) {
                by = (byte) Test0312.iFld;
                Test0312.iFld += i7;
                switch ((((Test0312.iFld >>> 1) % 7) * 5) + 41) {
                case 45:
                    i8 = 1;
                    do {
                        iArr1[i6 - 1] += Test0312.iFld;
                        Test0312.instanceCount += (((i8 * by) + Test0312.instanceCount) - i7);
                    } while (++i8 < 1);
                    break;
                case 60:
                    Test0312.iFld = (int) -66.88331;
                case 56:
                    Test0312.iFld = i8;
                case 67:
                    f1 = i8;
                case 50:
                    iArr1[(int)(d)] -= (int)f1;
                    break;
                case 54:
                    i7 = Test0312.iFld;
                    break;
                case 65:
                    Test0312.instanceCount -= (long) f1;
                default:
                    Test0312.iFld = 191;
                }
            }
        }
        vMeth_check_sum += (b ? 1 : 0) + by + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) + i6 + i7 + i8 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth1() {

        int i4=57222, i5=50816;
        double d1=-1.16961;
        short[] sArr =new short[N];

        FuzzerUtils.init(sArr, (short)23650);

        for (i4 = 155; 6 < i4; --i4) {
            i5 += (i4 | Test0312.instanceCount);
            vMeth();
            Test0312.iFld >>= Test0312.iFld;
            Test0312.iFld += (int) Test0312.fFld;
            Test0312.instanceCount = i5;
            Test0312.fFld = Test0312.instanceCount;
            i5 -= (int)d1;
            Test0312.iFld += (i4 * i4);
        }
        for (short s2 : sArr) {
            Test0312.iFld <<= (int) Test0312.instanceCount;
            i5 >>>= i5;
            if (true) break;
            Test0312.iFld = Test0312.iFld;
            i5 += (int) Test0312.fFld;
        }
        long meth_res = i4 + i5 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(sArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(short s1, int i2) {

        int i3=-14;
        int i9=10;
        int i10=121;
        int i11=45334;
        int i12=-12;
        int i13=-8;
        int[] iArr =new int[N];
        double d2=-1.36903;
        byte by1=-51;

        FuzzerUtils.init(iArr, 221);

        iArr[(Test0312.iFld >>> 1) % N] += (((++i3) - (-50209 << iMeth1())) + i3);
        i2 = i9;
        for (d2 = 2; 299 > d2; d2++) {
            i11 = 1;
            while (++i11 < 6) {
                switch ((i11 % 6) + 96) {
                case 96:
                case 97:
                    for (i12 = 1; i12 < 1; i12 += 3) {
                        i9 = i3;
                        if (Test0312.bFld) continue;
                        if (Test0312.iFld != 0) {
                        }
                        i9 = i11;
                        by1 += (byte)i10;
                        i10 += (i12 * i12);
                        s1 = (short)i12;
                        Test0312.bFld = Test0312.bFld;
                    }
                    Test0312.iFld += (((i11 * i3) + i9) - Test0312.instanceCount);
                    break;
                case 98:
                    i13 += 147;
                case 99:
                    Test0312.fFld -= i10;
                    break;
                case 100:
                    Test0312.instanceCount += (((i11 * Test0312.fFld) + i11) - Test0312.instanceCount);
                case 101:
                    Test0312.instanceCount >>= 16;
                    break;
                }
            }
        }
        long meth_res = s1 + i2 + i3 + i9 + Double.doubleToLongBits(d2) + i10 + i11 + i12 + i13 + by1 +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        short s=9659;
        short[] sArr1 =new short[N];
        float f=0.867F;
        float[][] fArr =new float[N][N];
        int i=105, i1=-26706, i14=-2, i15=47595, i16=-196, i17=-46741, i18=52416, i19=-47077, i20=2;
        double d3=1.17837;
        byte by2=0;
        long[] lArr =new long[N];

        FuzzerUtils.init(fArr, -44.385F);
        FuzzerUtils.init(lArr, -1840864323L);
        FuzzerUtils.init(sArr1, (short)24579);

        Test0312.iFld = (int) ((--s) / (((long) (f--)) | 1));
        for (i = 10; i < 188; ++i) {
            s += (short) ((fArr[i - 1][i]--) - iMeth(s, Test0312.iFld));
        }
        i1 = -234;
        Test0312.iFld += s;
        i1 = (int)d3;
        for (long l : lArr) {
            for (i14 = 63; i14 > 3; --i14) {
                l *= l;
                i16 = 1;
                while (++i16 < 2) {
                    d3 -= i15;
                    sArr1[i16] -= by2;
                    Test0312.instanceCount *= Test0312.iFld;
                    l = i14;
                    i1 /= (int)(i16 | 1);
                    i1 = (int)d3;
                    i1 <<= i14;
                    i15 += (((i16 * f) + i1) - i16);
                    Test0312.instanceCount <<= -7;
                    i15 = i15;
                }
            }
            Test0312.iFld -= (int) d3;
            for (i17 = 1; i17 < 63; i17++) {
                l += 3033091258745934696L;
                i18 += i17;
                fArr[i17 - 1] = fArr[i17 + 1];
                for (i19 = 1; i19 < 2; i19++) {
                    i18 &= s;
                    i1 += (((i19 * s) + i15) - i17);
                    i18 = i19;
                    Test0312.fFld -= i20;
                }
            }
        }

        FuzzerUtils.out.println("s f i = " + s + "," + Float.floatToIntBits(f) + "," + i);
        FuzzerUtils.out.println("i1 d3 i14 = " + i1 + "," + Double.doubleToLongBits(d3) + "," + i14);
        FuzzerUtils.out.println("i15 i16 by2 = " + i15 + "," + i16 + "," + by2);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 fArr lArr = " + i20 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            "," + FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("sArr1 = " + FuzzerUtils.checkSum(sArr1));

        FuzzerUtils.out.println("Test0312.instanceCount Test0312.iFld Test0312.fFld = " + Test0312.instanceCount + "," + Test0312.iFld +
                "," + Float.floatToIntBits(Test0312.fFld));
        FuzzerUtils.out.println("Test0312.bFld = " + (Test0312.bFld ? 1 : 0));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0312 _instance = new Test0312();
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
