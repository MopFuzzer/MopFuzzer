// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:55 2023
public class Test0927 {

    public static final int N = 400;

    public static long instanceCount=78L;
    public int iFld=62;
    public boolean bFld=true;
    public static float fFld=1.986F;
    public static int[] iArrFld =new int[N];
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0927.iArrFld, -145);
        FuzzerUtils.init(Test0927.lArrFld, -5070577031336292869L);
    }

    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i6) {

        double d1=0.49476;
        int i7=46155, i8=33150, i9=77;
        float f=-1.323F;
        long[] lArr =new long[N];

        FuzzerUtils.init(lArr, -2252L);

        for (d1 = 7; d1 < 211; ++d1) {
            Test0927.instanceCount += (long) d1;
            f += Test0927.instanceCount;
            i7 *= i6;
        }
        Test0927.instanceCount -= i7;
        f += 1.145F;
        for (i8 = 1; i8 < 147; ++i8) {
            Test0927.iArrFld[i8 - 1] = (int) Test0927.instanceCount;
            lArr[i8 + 1] = (long)d1;
            i9 -= (int) Test0927.instanceCount;
        }
        Test0927.instanceCount = i6;
        i6 = (int) Test0927.instanceCount;
        i6 = i6;
        Test0927.instanceCount >>>= Test0927.instanceCount;
        Test0927.iArrFld[(i7 >>> 1) % N] >>= i8;
        vMeth1_check_sum += i6 + Double.doubleToLongBits(d1) + i7 + Float.floatToIntBits(f) + i8 + i9 +
            FuzzerUtils.checkSum(lArr);
    }

    public static short sMeth(int i3) {

        int i4=3, i5=-1, i10=-13, i11=-7955;
        short s=-19270;
        short[] sArr =new short[N];
        float f1=69.283F;
        float[] fArr =new float[N];
        long l=14L;

        FuzzerUtils.init(sArr, (short)14060);
        FuzzerUtils.init(fArr, 2.917F);

        i3 |= Math.abs(i3);
        for (i4 = 15; i4 < 355; ++i4) {
            sArr[i4] = (short)i4;
            Test0927.iArrFld[i4 + 1] += (int) ((++Test0927.iArrFld[i4 + 1]) - Math.abs(-(3 + (i4 - s))));
            i3 *= (i3--);
            vMeth1(i3);
            i3 = (int) Test0927.instanceCount;
            for (i10 = 1; i10 < 5; ++i10) {
                i11 = i4;
                i11 &= i11;
                f1 += 20352;
                l = 1;
                while (++l < 2) {
                    f1 /= 97.609F;
                    if (true) break;
                    fArr[(int)(l)] -= i11;
                }
            }
        }
        long meth_res = i3 + i4 + i5 + s + i10 + i11 + Float.floatToIntBits(f1) + l + FuzzerUtils.checkSum(sArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth() {

        double d=0.79453;
        int i12=2, i13=65271;
        short[] sArr1 =new short[N];

        FuzzerUtils.init(sArr1, (short)-8489);

        Test0927.instanceCount += (long) (((5227 - (d - -61.65074)) * sMeth(i12)) + -40579);
        sArr1[(i12 >>> 1) % N] -= (short)3755442890L;
        i13 = 1;
        while (++i13 < 123) {
            Test0927.lArrFld[i13 - 1] = i12;
            i12 = i13;
        }
        i12 /= -42151;
        Test0927.lArrFld[(i12 >>> 1) % N] = i12;
        vMeth_check_sum += Double.doubleToLongBits(d) + i12 + i13 + FuzzerUtils.checkSum(sArr1);
    }

    public void mainTest(String[] strArr1) {

        int i=0, i1=-5, i2=32;
        double d2=-2.129028;
        short s1=-1058;
        long l1=-701395484L;
        float f2=84.847F;

        i = 1;
        while (++i < 363) {
            i1 = 1;
            while ((i1 += 2) < 69) {
                i2 = 1;
                do {
                    switch (((i % 4) * 5) + 54) {
                    case 58:
                        vMeth();
                        switch ((((i1 >>> 1) % 10) * 5) + 66) {
                        case 81:
                            switch (((i1 % 1) * 5) + 38) {
                            case 41:
                                Test0927.instanceCount = Test0927.instanceCount;
                                Test0927.iArrFld[i2 + 1] ^= i2;
                                iFld *= i1;
                                d2 = Test0927.instanceCount;
                                break;
                            default:
                                iFld += (int)-3143255475342475028L;
                                switch ((i % 6) + 123) {
                                case 123:
                                    switch (((i2 % 3) * 5) + 69) {
                                    case 73:
                                        Test0927.iArrFld[i1] = (int) Test0927.instanceCount;
                                        break;
                                    case 83:
                                        iFld += (int)d2;
                                        bFld = bFld;
                                        break;
                                    case 84:
                                        iFld += (int) Test0927.fFld;
                                        iFld -= (int)3760349150630632577L;
                                        iFld <<= (int) Test0927.instanceCount;
                                        break;
                                    default:
                                        iFld >>= i1;
                                    }
                                    s1 = (short)i2;
                                    switch (((i2 % 9) * 5) + 64) {
                                    case 72:
                                        Test0927.instanceCount += i1;
                                    case 89:
                                        iFld *= (int) Test0927.instanceCount;
                                        break;
                                    case 68:
                                        iFld = i2;
                                        break;
                                    case 108:
                                        iFld *= i1;
                                        break;
                                    case 88:
                                        d2 -= Test0927.instanceCount;
                                        iFld += (i2 - iFld);
                                        iFld = i1;
                                        break;
                                    case 104:
                                        Test0927.iArrFld[i1] = i2;
                                        break;
                                    case 78:
                                        iFld = i2;
                                        break;
                                    case 85:
                                        try {
                                            iFld = (-59240 / i);
                                            iFld = (45302 / iFld);
                                            iFld = (iFld % Test0927.iArrFld[i2]);
                                        } catch (ArithmeticException a_e) {}
                                        break;
                                    case 102:
                                        Test0927.iArrFld[i - 1] = i;
                                        break;
                                    default:
                                        iFld = (int) Test0927.instanceCount;
                                    }
                                case 124:
                                    iFld = iFld;
                                    break;
                                case 125:
                                    Test0927.lArrFld[i2 - 1] -= (long) Test0927.fFld;
                                    break;
                                case 126:
                                    iFld = i1;
                                case 127:
                                    Test0927.fFld += l1;
                                case 128:
                                    iFld = i1;
                                    break;
                                default:
                                    Test0927.fFld += (i2 * i2);
                                }
                            }
                            break;
                        case 105:
                            Test0927.instanceCount /= (i | 1);
                            break;
                        case 97:
                            f2 += (i2 * i2);
                            break;
                        case 84:
                            Test0927.instanceCount >>= i;
                            break;
                        case 108:
                            iFld >>>= 6411;
                            break;
                        case 80:
                            l1 += (i2 | i1);
                            break;
                        case 76:
                            iFld = i2;
                            break;
                        case 113:
                            iFld >>= (int) Test0927.instanceCount;
                        case 74:
                            iFld += (i2 * i2);
                        case 90:
                            s1 = (short)i2;
                            break;
                        }
                    case 59:
                        iFld += (i2 - i);
                    case 70:
                        if (bFld) continue;
                        break;
                    case 56:
                        d2 += -84L;
                        break;
                    default:
                        iFld ^= (int)l1;
                    }
                } while (++i2 < 3);
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("d2 s1 l1 = " + Double.doubleToLongBits(d2) + "," + s1 + "," + l1);
        FuzzerUtils.out.println("f2 = " + Float.floatToIntBits(f2));

        FuzzerUtils.out.println("Test0927.instanceCount iFld bFld = " + Test0927.instanceCount + "," + iFld + "," + (bFld ? 1 :
            0));
        FuzzerUtils.out.println("Test0927.fFld Test0927.iArrFld Test0927.lArrFld = " + Float.floatToIntBits(Test0927.fFld) + "," +
                FuzzerUtils.checkSum(Test0927.iArrFld) + "," + FuzzerUtils.checkSum(Test0927.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0927 _instance = new Test0927();
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
//DEBUG  sMeth ->  sMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 sMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}