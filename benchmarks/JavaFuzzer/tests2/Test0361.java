// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:29 2023
public class Test0361 {

    public static final int N = 400;

    public static long instanceCount=53782L;
    public boolean bFld=false;
    public volatile int iFld=13;
    public static double dFld=48.61470;
    public byte byFld=-102;
    public float fFld=1.845F;
    public int iFld1=8;
    public static short[][] sArrFld =new short[N][N];

    static {
        FuzzerUtils.init(Test0361.sArrFld, (short) -22608);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        boolean b=false;
        int i7=54787;
        int i8=154;
        int i9=-35293;
        int i10=41990;
        int i11=11;
        int[] iArr =new int[N];
        byte by=33;
        float f1=2.846F;

        FuzzerUtils.init(iArr, -2);

        b = b;
        for (i7 = 355; i7 > 9; --i7) {
            switch ((i7 % 2) + 66) {
            case 66:
                i9 = 1;
                do {
                    long l=4635512314381582897L;
                    for (i10 = 1; i10 < 1; i10 += 3) {
                        if (b) break;
                        by -= (byte)f1;
                        b = b;
                        i11 += i10;
                        f1 -= 197;
                        Test0361.instanceCount = Test0361.instanceCount;
                    }
                    f1 *= i11;
                    l *= i8;
                    by += (byte)(-1.38F + (i9 * i9));
                    iArr[i9 + 1] = i10;
                } while (++i9 < 5);
                break;
            case 67:
                i11 += (-2 + (i7 * i7));
            default:
                i8 += (-56451 + (i7 * i7));
            }
        }
        vMeth2_check_sum += (b ? 1 : 0) + i7 + i8 + i9 + i10 + i11 + by + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(int i5, int i6) {


        vMeth2();
        vMeth1_check_sum += i5 + i6;
    }

    public void vMeth() {

        int i2=39;
        int i3=-22987;
        int i4=-125;
        int[] iArr1 =new int[N];
        float f=0.890F;

        FuzzerUtils.init(iArr1, -83);

        i2 = 1;
        do {
            bFld = ((Integer.reverseBytes(i2) * (Test0361.instanceCount + 49.969F)) == -4);
            i3 = (int)((++f) + 16233);
            Test0361.instanceCount += (Test0361.instanceCount--);
            i4 = 7;
            do {
                Test0361.instanceCount = (i3 |= (i3++));
                i3 += (int) (Test0361.instanceCount + Long.reverseBytes(Test0361.instanceCount++));
                bFld = bFld;
                vMeth1(-3998, i4);
                i3 += (i4 | Test0361.instanceCount);
            } while ((i4 -= 2) > 0);
        } while (++i2 < 229);
        f -= f;
        i3 *= i3;
        i3 -= (int)-636040128L;
        Test0361.instanceCount <<= i3;
        iArr1[(i2 >>> 1) % N] >>= iFld;
        vMeth_check_sum += i2 + i3 + Float.floatToIntBits(f) + i4 + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=76;
        int i1=1790;
        int i12=26815;
        int i13=1320;
        int i14=-2;
        int i15=-57141;
        int i16=-2;
        int i17=-12;
        int i18=-239;
        int i20=-14;
        int i21=177;
        int i22=13;
        int[] iArr2 =new int[N];
        float f2=0.276F;
        short s=14363;
        long[] lArr =new long[N];

        FuzzerUtils.init(iArr2, 13);
        FuzzerUtils.init(lArr, 1158612400103982227L);

        for (i = 6; 365 > i; i++) {
            vMeth();
            i12 = 1;
            do {
                i1 ^= (int) Test0361.instanceCount;
                for (i13 = 1; i13 < 1; ++i13) {
                    iArr2[i12] = i1;
                }
                for (i15 = 1; i15 < 1; ++i15) {
                    iArr2[i12 + 1] -= i16;
                    lArr[i15] *= i15;
                }
                for (i17 = 1; i17 < 1; i17++) {
                    int i19=8;
                    i1 = i19;
                    iFld -= i19;
                }
                for (f2 = 1; f2 > 1; --f2) {
                    i14 += (int) Test0361.dFld;
                }
                iArr2[i] >>>= (int) Test0361.instanceCount;
                Test0361.instanceCount = i18;
                byFld += (byte)s;
            } while (++i12 < 70);
        }
        iFld <<= i;
        i1 <<= i17;
        Test0361.instanceCount -= i14;
        iFld = i16;
        for (i21 = 121; i21 > 6; --i21) {
            fFld -= i22;
            iArr2[i21 + 1] = i17;
            Test0361.instanceCount >>= i22;
            iFld = i;
            i1 /= -10;
        }
        i14 += i16;
        Test0361.sArrFld[(iFld1 >>> 1) % N][(i22 >>> 1) % N] -= (short) i16;
        i14 %= (int)(i17 | 1);

        FuzzerUtils.out.println("i i1 i12 = " + i + "," + i1 + "," + i12);
        FuzzerUtils.out.println("i13 i14 i15 = " + i13 + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("f2 i20 s = " + Float.floatToIntBits(f2) + "," + i20 + "," + s);
        FuzzerUtils.out.println("i21 i22 iArr2 = " + i21 + "," + i22 + "," + FuzzerUtils.checkSum(iArr2));
        FuzzerUtils.out.println("lArr = " + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test0361.instanceCount bFld iFld = " + Test0361.instanceCount + "," + (bFld ? 1 : 0) + "," +
            iFld);
        FuzzerUtils.out.println("Test0361.dFld byFld fFld = " + Double.doubleToLongBits(Test0361.dFld) + "," + byFld + "," +
            Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("iFld1 Test0361.sArrFld = " + iFld1 + "," + FuzzerUtils.checkSum(Test0361.sArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0361 _instance = new Test0361();
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
