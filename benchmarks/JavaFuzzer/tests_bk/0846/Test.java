// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:14 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=41494L;
    public float fFld=-104.290F;
    public static volatile int iFld=-54027;
    public static volatile double dFld=-2.124355;
    public static boolean bFld=true;
    public int iArrFld[]=new int[N];

    public static long dMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static double dMeth(int i4, int i5, int i6) {

        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, -14629L);

        i4 = (int)lArr[(i5 >>> 1) % N][(i5 >>> 1) % N];
        long meth_res = i4 + i5 + i6 + FuzzerUtils.checkSum(lArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth() {

        int i12=-17, i13=127, i14=-215, i15=76, iArr[]=new int[N];
        short s=-19288;

        FuzzerUtils.init(iArr, 97);

        Test.iFld = Test.iFld;
        iArr[(Test.iFld >>> 1) % N] *= Test.iFld;
        for (i12 = 13; i12 < 350; ++i12) {
            float f=127.914F;
            Test.iFld += i13;
            Test.iFld = i13;
            f += i12;
            Test.instanceCount += i12;
            Test.iFld <<= i12;
            for (i14 = i12; i14 < 5; i14++) {
                iArr[i14 + 1] -= 115;
                Test.iFld = (int)Test.instanceCount;
                f -= Test.instanceCount;
                s += (short)Test.iFld;
                i15 += (14399 + (i14 * i14));
                Test.instanceCount += (i14 + Test.iFld);
            }
        }
        vMeth_check_sum += i12 + i13 + i14 + i15 + s + FuzzerUtils.checkSum(iArr);
    }

    public static long lMeth(int i11) {

        int i16=-19054, i17=-159, i19=10284, iArr1[]=new int[N], iArr2[]=new int[N];
        float f1=0.853F, fArr[]=new float[N];
        short s1=8421;
        byte by1=83;

        FuzzerUtils.init(iArr1, 8);
        FuzzerUtils.init(fArr, 97.71F);
        FuzzerUtils.init(iArr2, -55);

        i11 -= (int)(--Test.instanceCount);
        vMeth();
        try {
            switch ((((Test.iFld >>> 1) % 9) * 5) + 95) {
            case 127:
                i11 = 63647;
                break;
            case 107:
                i16 = 1;
                do {
                    i11 >>= 167;
                    Test.instanceCount = Test.instanceCount;
                    i11 = (int)Test.instanceCount;
                    i17 = 1;
                    while (++i17 < 8) {
                        Test.iFld += (int)f1;
                        Test.iFld -= s1;
                        try {
                            i11 = (23049 % i17);
                            i11 = (-27 % i11);
                            Test.iFld = (68 / Test.iFld);
                        } catch (ArithmeticException a_e) {}
                        Test.instanceCount = i11;
                    }
                    Test.instanceCount *= Test.instanceCount;
                } while (++i16 < 188);
                break;
            case 110:
                i11 <<= i11;
                break;
            case 124:
                iArr1[(-25 >>> 1) % N] *= i16;
                break;
            case 131:
                Test.iFld = i16;
                break;
            case 128:
                Test.dFld = -3514L;
                break;
            case 119:
                s1 += (short)Test.iFld;
                break;
            case 105:
            case 121:
                Test.instanceCount -= i17;
                break;
            default:
                Test.iFld -= 12;
            }
        }
        catch (ArrayIndexOutOfBoundsException exc1) {
            i11 -= (int)Test.instanceCount;
        }
        finally {
            iArr2[(i19 >>> 1) % N] += by1;
        }
        long meth_res = i11 + i16 + i17 + Float.floatToIntBits(f1) + s1 + i19 + by1 + FuzzerUtils.checkSum(iArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public int iMeth(int i7) {

        int i8=7, i9=31, i10=53;
        byte by=-31;
        boolean b=false, bArr[]=new boolean[N];
        short s2=31679;

        FuzzerUtils.init(bArr, false);

        for (i8 = 5; i8 < 307; ++i8) {
            i9 = (--i7);
            Test.instanceCount = iArrFld[i8];
            by += (byte)(4176 + (i8 * i8));
            i7 += (i8 * i8);
            iArrFld = iArrFld;
            by += (byte)i8;
            i10 = 1;
            do {
                Test.instanceCount *= lMeth(i7);
                if (b) break;
                bArr[i8 - 1] = b;
                Test.instanceCount |= s2;
                fFld -= Test.instanceCount;
                i7 += i10;
                s2 *= (short)i10;
            } while ((i10 += 3) < 5);
        }
        long meth_res = i7 + i8 + i9 + by + i10 + (b ? 1 : 0) + s2 + FuzzerUtils.checkSum(bArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=24, i1=-40846, i2=23861, i3=64125, i20=49776, i21=-11, i22=-167, i23=2, i24=-55537, i25=132;
        byte by2=-115;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 66L);

        for (i = 10; 163 > i; ++i) {
            fFld *= (--i1);
            for (i2 = 2; i2 < 164; ++i2) {
                i3 = (int)(((--Test.instanceCount) * (5 * dMeth(i3, i1, 0))) + iMeth(i3));
                i1 += (i2 ^ Test.iFld);
            }
        }
        for (i20 = 7; i20 < 249; ++i20) {
            i1 *= by2;
            i21 = i1;
            Test.instanceCount *= Test.iFld;
            Test.instanceCount >>= i1;
            for (i22 = 5; 104 > i22; ++i22) {
                for (i24 = 1; i24 < 2; i24++) {
                    Test.iFld -= (int)Test.instanceCount;
                    i1 += (i24 * i24);
                    i1 = (int)Test.instanceCount;
                    Test.iFld -= Test.iFld;
                    i21 = i3;
                    i21 -= (int)-12L;
                    iArrFld[i20 + 1] ^= i1;
                }
                switch ((i22 % 4) + 102) {
                case 102:
                    if (Test.bFld) {
                        lArr1 = lArr1;
                        lArr1[i22 + 1] += 11;
                    } else {
                        fFld = i23;
                        iArrFld = iArrFld;
                        Test.instanceCount = Test.instanceCount;
                        iArrFld[i20 + 1] = by2;
                    }
                    break;
                case 103:
                    Test.iFld *= (int)fFld;
                    try {
                        Test.iFld = (iArrFld[i22 + 1] % Test.iFld);
                        i25 = (i21 % i22);
                        iArrFld[i20] = (i21 % i20);
                    } catch (ArithmeticException a_e) {}
                    i3 = (int)Test.instanceCount;
                case 104:
                    Test.dFld *= 0L;
                    break;
                case 105:
                    if (Test.bFld) break;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i20 i21 = " + i3 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("by2 i22 i23 = " + by2 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 lArr1 = " + i24 + "," + i25 + "," + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount fFld Test.iFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(fFld) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.dFld Test.bFld iArrFld = " + Double.doubleToLongBits(Test.dFld) + "," +
            (Test.bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  dMeth ->  dMeth mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
