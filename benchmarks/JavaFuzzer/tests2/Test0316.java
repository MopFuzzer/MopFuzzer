// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:26 2023
public class Test0316 {

    public static final int N = 400;

    public static long instanceCount=7L;
    public static short sFld=27157;
    public byte byFld=45;
    public static volatile double dFld=48.8373;
    public static boolean bFld=true;
    public int iFld=14619;
    public long[][] lArrFld =new long[N][N];
    public static float[] fArrFld =new float[N];
    public short[] sArrFld =new short[N];

    static {
        FuzzerUtils.init(Test0316.fArrFld, 0.137F);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(long l1) {

        int i12=-9;
        int i13=-39358;
        int i14=13;
        int i15=-131;
        int i16=-89;
        int i17=80;
        int i18=-16685;
        int[] iArr1 =new int[N];
        float f3=1.727F;
        boolean b=true;

        FuzzerUtils.init(iArr1, -21289);

        if (true) {
            for (i12 = 5; i12 < 330; i12++) {
                i13 = i12;
                for (i14 = i12; i14 < 5; ++i14) {
                    i15 += (int)l1;
                    f3 += i12;
                    for (i16 = 1; i16 < 1; ++i16) {
                        iArr1[i14] -= 49226;
                        i13 *= i12;
                    }
                    i18 = 1;
                    do {
                        i15 -= (int)-1.104531;
                        Test0316.instanceCount = i18;
                        l1 += i18;
                        l1 += (i18 * i18);
                        b = b;
                    } while (++i18 < 1);
                }
            }
        } else if (b) {
            i15 = 92;
        } else if (b) {
            l1 = 60;
        }
        long meth_res = l1 + i12 + i13 + i14 + i15 + Float.floatToIntBits(f3) + i16 + i17 + i18 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth() {

        int i7=235;
        int i8=-150;
        int i9=-28059;
        int i10=-107;
        int i11=4828;
        int i19=11;
        int i20=-34898;
        int[] iArr2 =new int[N];
        float f2=0.482F;
        boolean b1=false;

        FuzzerUtils.init(iArr2, 42655);

        for (i7 = 3; i7 < 342; ++i7) {
            for (i9 = 1; i9 < 5; ++i9) {
                for (f2 = 1; f2 < 2; f2++) {
                    i11 -= ((i11++) * iMeth1(Test0316.instanceCount));
                    Test0316.instanceCount <<= 9;
                    i11 += (int) (((f2 * i7) + Test0316.instanceCount) - f2);
                    if (b1) continue;
                    Test0316.instanceCount += byFld;
                    i8 = -2413;
                    Test0316.instanceCount += (long) (f2 * f2);
                }
                for (i19 = i7; i19 < 2; ++i19) {
                    float f4=0.588F;
                    f4 = Test0316.instanceCount;
                    iArr2[i7 + 1] = i19;
                    Test0316.dFld = i7;
                    f4 = Test0316.sFld;
                }
            }
        }
        vMeth_check_sum += i7 + i8 + i9 + i10 + Float.floatToIntBits(f2) + i11 + (b1 ? 1 : 0) + i19 + i20 +
            FuzzerUtils.checkSum(iArr2);
    }

    public int iMeth() {

        int i21=-106;

        Test0316.fArrFld = (Test0316.fArrFld = Test0316.fArrFld);
        vMeth();
        Test0316.dFld = i21;
        Test0316.dFld += 110.57663;
        long meth_res = i21;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-6;
        int i1=-34260;
        int i2=39277;
        int i3=-2;
        int i4=180;
        int i5=88;
        int i6=151;
        int i22=-46779;
        int[] iArr =new int[N];
        long l=149L;
        float f=1.184F, f5=-42.44F, f6=116.788F;
        double d1=111.111657, d2=-69.88792;

        FuzzerUtils.init(iArr, -1);

        for (i = 9; 190 > i; ++i) {
            for (l = 8; l < 139; l += 2) {
                double d=79.33998;
                i1 *= (int)(++d);
            }
        }
        i3 = 1;
        do {
            for (i4 = 177; i4 > i3; i4 -= 3) {
                for (f = 1; f < 1; ++f) {
                    float f1=-2.479F;
                    f1 += iArr[i3 - 1];
                    Test0316.instanceCount <<= (long) ((Test0316.sFld + i1) - ((++i2) + (d1 + -3246621020151477668L)));
                    byFld >>= (byte)(i5--);
                    lArrFld[(int)(f + 1)][(int)(f)] ^= (long)(Math.min((long)(22667 * (d1++)), 4L) - (iMeth() - f));
                }
                iArr = FuzzerUtils.int1array(N, (int)81);
                byFld >>= (byte)i1;
                Test0316.sFld <<= (short) Test0316.instanceCount;
                i22 = 1;
                do {
                    iArr[i4 - 1] = i4;
                    i2 >>= -3002;
                    Test0316.instanceCount -= (long) d1;
                    d1 = -36225;
                    f5 = l;
                    i2 += (int)d2;
                    i2 *= i6;
                    i6 *= Test0316.sFld;
                    Test0316.bFld = Test0316.bFld;
                    i1 += i22;
                } while (++i22 < 1);
            }
            switch (((i3 % 5) * 5) + 109) {
            case 116:
                f6 = 1;
                while (++f6 < 177) {
                    i5 += (int)f6;
                }
                i1 -= (int)3826405113L;
                i6 <<= iFld;
                break;
            case 131:
                sArrFld[i3 + 1] *= (short)81;
                break;
            case 121:
                Test0316.instanceCount -= l;
                break;
            case 110:
                byFld -= (byte)l;
                break;
            case 118:
                i6 >>= (int) Test0316.instanceCount;
                break;
            }
        } while (++i3 < 142);

        FuzzerUtils.out.println("i i1 l = " + i + "," + i1 + "," + l);
        FuzzerUtils.out.println("i2 i3 i4 = " + i2 + "," + i3 + "," + i4);
        FuzzerUtils.out.println("i5 f i6 = " + i5 + "," + Float.floatToIntBits(f) + "," + i6);
        FuzzerUtils.out.println("d1 i22 f5 = " + Double.doubleToLongBits(d1) + "," + i22 + "," +
            Float.floatToIntBits(f5));
        FuzzerUtils.out.println("d2 f6 iArr = " + Double.doubleToLongBits(d2) + "," + Float.floatToIntBits(f6) + "," +
            FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0316.instanceCount Test0316.sFld byFld = " + Test0316.instanceCount + "," + Test0316.sFld + "," +
            byFld);
        FuzzerUtils.out.println("Test0316.dFld Test0316.bFld iFld = " + Double.doubleToLongBits(Test0316.dFld) + "," + (Test0316.bFld ?
            1 : 0) + "," + iFld);
        FuzzerUtils.out.println("lArrFld Test0316.fArrFld sArrFld = " + FuzzerUtils.checkSum(lArrFld) + "," +
                Double.doubleToLongBits(FuzzerUtils.checkSum(Test0316.fArrFld)) + "," + FuzzerUtils.checkSum(sArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0316 _instance = new Test0316();
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
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
