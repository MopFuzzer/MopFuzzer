// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=60611L;
    public static short sFld=7574;
    public static volatile long lArrFld[]=new long[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 6151138756057441694L);
        FuzzerUtils.init(Test.fArrFld, 1.32F);
    }

    public static long vMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i5, byte by, long l) {

        int i6=6, i7=187, i8=21285, i9=1, i10=120, i11=47748, i12=-6;
        float f=-42.527F;
        boolean b1=true;
        double d1=13.27707, dArr[]=new double[N];

        FuzzerUtils.init(dArr, -2.60373);

        i6 = 1;
        while (++i6 < 133) {
            for (i7 = 12; i7 > 1; --i7) {
                f = i6;
                i5 += (i7 ^ (long)f);
                i9 = i5;
                b1 = b1;
            }
            switch ((i6 % 4) + 25) {
            case 25:
                i5 &= i7;
                i9 /= (int)(i9 | 1);
                i9 += (int)l;
            case 26:
                i9 = i6;
                for (i10 = i6; 12 > i10; i10 += 3) {
                    for (d1 = 1; d1 > 1; d1 -= 3) {
                        dArr[i6 - 1] = 64;
                        i12 = i5;
                    }
                }
                break;
            case 27:
                dArr[i6 + 1] += i7;
                break;
            case 28:
                Test.lArrFld[i6 - 1] &= i5;
            }
        }
        vMeth1_check_sum += i5 + by + l + i6 + i7 + i8 + Float.floatToIntBits(f) + i9 + (b1 ? 1 : 0) + i10 + i11 +
            Double.doubleToLongBits(d1) + i12 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static boolean bMeth(int i4) {

        int i13=-12, i14=-26627, i15=14, i16=-9, i17=14, i18=2930;
        float f1=-19.885F;
        double d2=-2.48322;
        byte by1=21;
        short s1=20417;
        boolean b2=false;

        vMeth1(i4, (byte)(36), Test.instanceCount);
        i13 = 1;
        while (++i13 < 173) {
            if (b2) {
                switch ((((i4 >>> 1) % 3) * 5) + 90) {
                case 105:
                    for (i14 = 1; 9 > i14; i14 += 2) {
                        for (f1 = 1; f1 < 3; f1++) {
                            i16 -= 13922;
                            d2 += -29014;
                        }
                        i4 /= (int)(by1 | 1);
                        for (i17 = 3; 1 < i17; --i17) {
                            i15 -= i17;
                            i4 = i4;
                            Test.instanceCount += i17;
                            i18 -= s1;
                            i16 = i13;
                        }
                    }
                    break;
                case 97:
                    i16 *= (int)f1;
                case 101:
                    Test.fArrFld[i13] /= (i18 | 1);
                    break;
                default:
                    i4 -= i17;
                }
            }
        }
        long meth_res = i4 + i13 + i14 + i15 + Float.floatToIntBits(f1) + i16 + Double.doubleToLongBits(d2) + by1 + i17
            + i18 + s1 + (b2 ? 1 : 0);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static void vMeth(short s) {

        int i2=23160, i3=2, i19=-133, i20=166, i21=-47, iArr1[]=new int[N];
        double d=0.4448;
        boolean b=false;
        float f2=-104.1022F;

        FuzzerUtils.init(iArr1, 11577);

        for (i2 = 18; i2 < 296; i2++) {
            i3 >>= (int)(((i3 - d) - (i2 - Test.instanceCount)) * (Integer.reverseBytes(212) + (-(--iArr1[i2]))));
            if (b = bMeth(i3)) break;
            i3 = (int)Test.instanceCount;
            i3 <<= (int)Test.instanceCount;
        }
        for (i19 = 8; i19 < 251; i19++) {
            s -= (short)d;
        }
        i21 = 1;
        do {
            i3 += (i21 * i21);
            i3 >>= i21;
            i20 = (int)f2;
            iArr1 = iArr1;
            s -= (short)i20;
            i3 = i2;
            i20 -= i2;
        } while (++i21 < 335);
        vMeth_check_sum += s + i2 + i3 + Double.doubleToLongBits(d) + (b ? 1 : 0) + i19 + i20 + i21 +
            Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=0, i1=3, iArr[]=new int[N];
        float f3=71.449F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -1L);
        FuzzerUtils.init(iArr, -32033);

        i += (int)Float.intBitsToFloat((int)((0.70675 + lArr[(i1 >>> 1) % N]) * iArr[(229 >>> 1) % N]));
        iArr = iArr;
        vMeth(Test.sFld);
        Test.lArrFld[(i >>> 1) % N] = i;
        i1 = (int)f3;
        i >>= (int)Test.instanceCount;
        Test.sFld = (short)2;

        FuzzerUtils.out.println("i i1 f3 = " + i + "," + i1 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("lArr iArr = " + FuzzerUtils.checkSum(lArr) + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.lArrFld = " + Test.instanceCount + "," + Test.sFld +
            "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("Test.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
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
//DEBUG  bMeth ->  bMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 bMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
