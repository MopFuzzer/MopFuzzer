// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:13 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=8256129229721087348L;
    public static float fFld=-51.9F;
    public byte byFld=-54;
    public boolean bFld=true;
    public int iFld=-218;
    public long lFld=50137L;
    public static long lArrFld[]=new long[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -2801152910L);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i4, int i5) {

        int i6=19870, i7=11, i8=-18242, i9=13;
        short s2=3739;
        float f2=-2.181F;
        double d=-2.111620;
        boolean b=true;

        for (i6 = 12; 248 > i6; i6++) {
            i4 = s2;
            Test.instanceCount += (i6 * i7);
            i5 <<= i7;
            i4 -= i4;
            i4 |= i8;
            i9 = 1;
            do {
                Test.instanceCount <<= Test.instanceCount;
                f2 -= Test.instanceCount;
                if (b) {
                    d = f2;
                    i4 = i5;
                    i5 += (int)Test.instanceCount;
                    Test.instanceCount += (i9 + i6);
                } else if (b) {
                    Test.instanceCount ^= i4;
                } else if (b) {
                    Test.instanceCount = -233L;
                }
            } while (++i9 < 7);
        }
        vMeth_check_sum += i4 + i5 + i6 + i7 + s2 + i8 + i9 + Float.floatToIntBits(f2) + Double.doubleToLongBits(d) +
            (b ? 1 : 0);
    }

    public static int iMeth1(long l, int i2, float f1) {

        long l1=-13L;
        int i3=-38234, i10=13493, i11=208, i12=-14, i13=111;

        for (l1 = 18; l1 < 363; l1++) {
            i2 += (-11007 + (l1 * l1));
            vMeth(i3, 12);
            try {
                i3 = (i3 % i2);
                i3 = (-209931379 % i3);
                i3 = (238 % i2);
            } catch (ArithmeticException a_e) {}
        }
        i3 = i2;
        l = i3;
        Test.instanceCount = i3;
        for (i10 = 2; i10 < 215; i10++) {
            i2 = i10;
            i2 &= i2;
            i12 = 1;
            do {
                i13 = 1;
                do {
                    i3 = (int)l1;
                    i2 &= i13;
                    Test.lArrFld = FuzzerUtils.long1array(N, (long)68L);
                } while ((i13 += 3) < 1);
            } while (++i12 < 8);
        }
        long meth_res = l + i2 + Float.floatToIntBits(f1) + l1 + i3 + i10 + i11 + i12 + i13;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth() {

        int i=-4265, i1=27809, i14=-4;
        short s1=-23578;
        double d1=-49.41329;

        for (i = 13; i < 357; ++i) {
            float f=-10.131F;
            i1 -= (int)(((f + i) % (((long)(f - 0)) | 1)) / ((s1--) | 1));
        }
        i1 -= iMeth1(Test.instanceCount, i1, Test.fFld);
        Test.instanceCount = s1;
        try {
            i14 = 1;
            while (++i14 < 165) {
                Test.instanceCount &= byFld;
                if (bFld) {
                    switch ((i14 % 4) + 63) {
                    case 63:
                        d1 *= Test.fFld;
                        i1 += (((i14 * i) + byFld) - s1);
                        break;
                    case 64:
                    case 65:
                        i1 -= i1;
                        i1 += (-76 + (i14 * i14));
                        i1 &= 13202;
                    case 66:
                        Test.instanceCount = (long)d1;
                        break;
                    default:
                        Test.fFld = i14;
                    }
                } else if (bFld) {
                    Test.instanceCount %= (i | 1);
                } else if (bFld) {
                    i1 = -31958;
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException exc1) {
            i1 >>= i14;
        }
        finally {
            Test.instanceCount = -12;
        }
        long meth_res = i + i1 + s1 + i14 + Double.doubleToLongBits(d1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        short s=4844;
        int i15=-13, i16=-74, i17=7, i18=-9, i19=-46872, i20=-64, i21=-210, i22=4895, i23=63274, i24=201, i25=-24381,
            i26=-103;
        double d2=-1.7540, d3=2.39074;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 1.652F);

        s = (short)iMeth();
        Test.fFld += byFld;
        iFld = iFld;
        for (i15 = 3; i15 < 221; i15++) {
            if (bFld) {
                switch ((i15 % 1) + 116) {
                case 116:
                    i16 = iFld;
                    iArrFld[i15 + 1] -= i16;
                    Test.instanceCount += (((i15 * s) + s) - Test.instanceCount);
                    break;
                }
            }
            i16 = i16;
            iFld += i16;
            for (i17 = 3; i17 < 115; ++i17) {
                i16 /= 17091;
                iArrFld = iArrFld;
                Test.instanceCount -= s;
            }
            iFld += (i15 * i15);
            for (i19 = 115; 5 < i19; i19 -= 3) {
                Test.instanceCount *= (long)d2;
            }
            i21 = 1;
            while (++i21 < 115) {
                Test.lArrFld[i21 - 1] &= i20;
                i20 = iFld;
            }
            for (i22 = 6; i22 < 115; ++i22) {
                for (i24 = i22; i24 < 2; i24++) {
                    i20 &= i24;
                    i23 -= s;
                    i16 = i19;
                }
                fArr[i22] += i21;
                for (d3 = 2; d3 > 1; --d3) {
                    i25 <<= (int)lFld;
                }
            }
            i23 *= -3;
        }

        FuzzerUtils.out.println("s i15 i16 = " + s + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 d2 i21 = " + i20 + "," + Double.doubleToLongBits(d2) + "," + i21);
        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 d3 i26 = " + i25 + "," + Double.doubleToLongBits(d3) + "," + i26);
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld byFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + byFld);
        FuzzerUtils.out.println("bFld iFld lFld = " + (bFld ? 1 : 0) + "," + iFld + "," + lFld);
        FuzzerUtils.out.println("Test.lArrFld iArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," +
            FuzzerUtils.checkSum(iArrFld));

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