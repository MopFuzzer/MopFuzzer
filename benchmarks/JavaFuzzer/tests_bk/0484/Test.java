// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:05 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=6851651786594716499L;
    public volatile float fFld=0.1000F;
    public static volatile double dFld=62.80028;
    public static int iFld=29995;
    public static boolean bFld=true;
    public static float fFld1=77.894F;
    public static long lArrFld[][]=new long[N][N];
    public static volatile byte byArrFld[]=new byte[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -3465982302L);
        FuzzerUtils.init(Test.byArrFld, (byte)-123);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i4=-40904, i5=-14385, i6=36578, i7=20397, i8=7916;
        float f1=15.602F;
        boolean b=false;
        byte by=114;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-21167);

        i4 = 1;
        while (++i4 < 162) {
            Test.instanceCount *= i4;
            for (i5 = 10; 1 < i5; i5 -= 3) {
                Test.instanceCount ^= 164;
                i6 *= i5;
                sArr[i4 - 1] = (short)Test.dFld;
                i6 = (int)Test.dFld;
                i6 += i5;
                i6 -= i6;
            }
            for (i7 = 1; i7 < 10; i7++) {
                i8 -= (int)Test.dFld;
                Test.instanceCount = i8;
                if (b) {
                    Test.instanceCount = (long)f1;
                    i6 += (i7 * i7);
                } else if (false) {
                    Test.lArrFld[i4][i7 + 1] += -78;
                } else {
                    by >>= (byte)-6;
                }
            }
        }
        vMeth1_check_sum += i4 + i5 + i6 + i7 + i8 + Float.floatToIntBits(f1) + (b ? 1 : 0) + by +
            FuzzerUtils.checkSum(sArr);
    }

    public static int iMeth(int i1, int i2) {

        float f=86.758F;
        int i3=2384, i9=-42791, i10=215, i11=33085, iArr[]=new int[N], iArr1[]=new int[N];
        short s=-24043;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, -57L);
        FuzzerUtils.init(iArr, 1);
        FuzzerUtils.init(iArr1, -21923);

        for (f = 3; f < 135; f++) {
            Test.instanceCount = i1;
            if (false) {
                vMeth1();
                lArr[(int)(f)][(int)(f)] = i2;
                i9 = 1;
                while (++i9 < 12) {
                    boolean b1=true;
                    i3 += (int)94.427F;
                    s -= (short)Test.instanceCount;
                    Test.iFld = (int)-1932343705L;
                    for (i10 = 1; i10 < 1; ++i10) {
                        lArr[(int)(f - 1)][i9 + 1] -= i2;
                    }
                    iArr = iArr1;
                    Test.instanceCount += i9;
                    Test.instanceCount += i10;
                    if (b1) break;
                }
            } else if (Test.bFld) {
                iArr[(int)(f - 1)] = (int)Test.instanceCount;
            } else {
                if (i2 != 0) {
                }
            }
        }
        long meth_res = i1 + i2 + Float.floatToIntBits(f) + i3 + i9 + s + i10 + i11 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i12=-54661, i13=-111, i14=12, i15=4, i16=-1, iArr2[]=new int[N];
        short s1=16870;
        byte by1=-53;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -1.118942);
        FuzzerUtils.init(iArr2, 224);

        Test.instanceCount += (iMeth(-5, Test.iFld) - Test.iFld);
        for (i12 = 1; i12 < 251; ++i12) {
            Test.byArrFld[i12 - 1] *= (byte)-12;
            for (i14 = 1; i14 < 7; ++i14) {
                dArr[i12] = Test.instanceCount;
                switch ((i14 % 3) + 91) {
                case 91:
                case 92:
                    Test.iFld += (int)Test.dFld;
                    s1 += (short)i13;
                    i16 = 2;
                    while (--i16 > 0) {
                        iArr2[i14 - 1] = (int)Test.fFld1;
                        i13 >>>= by1;
                        by1 <<= (byte)i14;
                        i13 -= (int)-4632679334009977285L;
                        Test.instanceCount = i16;
                        Test.bFld = Test.bFld;
                    }
                case 93:
                    Test.dFld = i13;
                    break;
                default:
                    i15 <<= i14;
                }
            }
        }
        vMeth_check_sum += i12 + i13 + i14 + i15 + s1 + i16 + by1 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr))
            + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i=-5, i17=8, i18=4, i19=214, i20=-3700, i21=6, i22=2;
        short s2=-4584;
        long l=-22L;
        double dArr1[]=new double[N];

        FuzzerUtils.init(dArr1, 0.22602);

        i = 1;
        do {
            fFld += (i * i);
            Test.instanceCount += (i * i);
            Test.instanceCount += (i - i);
            switch ((i % 2) + 97) {
            case 97:
                vMeth();
                for (i17 = 1; i17 < 152; ++i17) {
                    Test.instanceCount >>= i17;
                    iArrFld[i17 + 1] = s2;
                    for (i19 = 1; i19 < 2; i19++) {
                        Test.instanceCount = -3888161794L;
                        Test.lArrFld[i + 1][i19 - 1] -= i18;
                        Test.instanceCount = i20;
                        Test.dFld += -6;
                        s2 += (short)(((i19 * i) + Test.iFld) - i19);
                        dArr1[i17] = Test.instanceCount;
                        Test.instanceCount = s2;
                        Test.iFld *= 42000;
                        dArr1[i] = i20;
                        iArrFld[i + 1] = -4;
                    }
                    switch (((i19 >>> 1) % 4) + 60) {
                    case 60:
                        for (i21 = 2; i21 > 1; i21 -= 3) {
                            l *= (long)Test.dFld;
                            l -= Test.iFld;
                            i20 -= (int)Test.instanceCount;
                            Test.instanceCount = Test.iFld;
                            i18 <<= i22;
                            i22 += (i21 - s2);
                            if (Test.bFld) continue;
                            i20 += i;
                        }
                    case 61:
                        fFld -= (float)Test.dFld;
                        break;
                    case 62:
                        i18 &= i17;
                        break;
                    case 63:
                        i20 += (51414 + (i17 * i17));
                    default:
                        iArrFld[i17 - 1] = (int)2.37895;
                    }
                }
                break;
            case 98:
                Test.lArrFld[i][i] = -49200L;
                break;
            default:
                if (false) break;
            }
        } while (++i < 165);

        FuzzerUtils.out.println("i i17 i18 = " + i + "," + i17 + "," + i18);
        FuzzerUtils.out.println("s2 i19 i20 = " + s2 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 l = " + i21 + "," + i22 + "," + l);
        FuzzerUtils.out.println("dArr1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)));

        FuzzerUtils.out.println("Test.instanceCount fFld Test.dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(fFld) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.iFld Test.bFld Test.fFld1 = " + Test.iFld + "," + (Test.bFld ? 1 : 0) + "," +
            Float.floatToIntBits(Test.fFld1));
        FuzzerUtils.out.println("Test.lArrFld Test.byArrFld iArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," +
            FuzzerUtils.checkSum(Test.byArrFld) + "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
