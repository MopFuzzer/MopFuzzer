// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:10 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1604458900L;
    public static int iFld=10571;
    public float fFld=1.222F;
    public static double dFld=-48.12711;
    public static boolean bFld=false;

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public double dMeth() {

        int i4=0, i5=-8, i6=0, i7=3, i8=138, i9=-160, iArr[]=new int[N];
        short s1=21851, sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)6558);
        FuzzerUtils.init(iArr, 220);

        for (i4 = 165; i4 > 2; --i4) {
            Test.iFld = i4;
            i5 *= i5;
            for (i6 = 1; i6 < 10; i6++) {
                Test.iFld *= 120;
            }
            i5 += (((i4 * Test.instanceCount) + fFld) - s1);
        }
        for (i8 = 11; i8 < 378; i8++) {
            sArr[i8] += (short)i9;
            fFld = Test.instanceCount;
            i7 = i6;
            Test.dFld -= i7;
            try {
                Test.iFld = (-37251 % iArr[i8 + 1]);
                iArr[i8] = (i4 / 156);
                i5 = (iArr[i8 - 1] % -236);
            } catch (ArithmeticException a_e) {}
            i5 = i9;
            i7 *= s1;
        }
        Test.iFld = Test.iFld;
        long meth_res = i4 + i5 + i6 + i7 + s1 + i8 + i9 + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public int iMeth(int i, int i1) {

        int i2=-11703, i3=0, i11=228, i12=169, i13=4, i14=-9, i15=-177, i16=9, iArr1[]=new int[N];
        byte by=0;
        long lArr[]=new long[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr, 7530604225682133997L);
        FuzzerUtils.init(iArr1, 233);
        FuzzerUtils.init(fArr, 39.108F);

        for (i2 = 3; i2 < 273; ++i2) {
            i1 = (int)dMeth();
            for (i11 = 6; i11 > 1; --i11) {
                lArr[i11] = i1;
                iArr1[i2 + 1] += (int)-556394373L;
                try {
                    Test.iFld = (-155 / i2);
                    i12 = (22948 % i3);
                    i12 = (i12 % 55902);
                } catch (ArithmeticException a_e) {}
            }
        }
        i3 <<= i12;
        for (i13 = 12; i13 < 219; i13++) {
            fArr[i13 - 1] = Test.instanceCount;
            Test.iFld += (-25439 + (i13 * i13));
            for (i15 = 1; i15 < 8; i15++) {
                Test.instanceCount <<= by;
                i3 = -13;
                Test.instanceCount = -225;
                Test.instanceCount *= i1;
            }
        }
        long meth_res = i + i1 + i2 + i3 + i11 + i12 + i13 + i14 + i15 + i16 + by + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public long lMeth(long l) {

        int i17=5, i18=11, i19=-215, i20=13, i21=-214, iArr2[]=new int[N];
        short sArr1[][]=new short[N][N];

        FuzzerUtils.init(iArr2, 29);
        FuzzerUtils.init(sArr1, (short)15532);

        Test.instanceCount = iMeth(Test.iFld, 20);
        for (i17 = 8; 147 > i17; i17++) {
            i18 = 18794;
            iArr2[i17 + 1] = (int)fFld;
            i19 = 1;
            do {
                Test.iFld += (int)Test.dFld;
                l *= i19;
                i18 += (((i19 * Test.iFld) + Test.instanceCount) - i19);
                Test.iFld *= i19;
                fFld = i19;
                Test.iFld -= i17;
                sArr1[(-17956 >>> 1) % N] = sArr1[i19];
                for (i20 = 1; i20 < 1; ++i20) {
                    Test.iFld += i20;
                    Test.iFld += (i20 * i20);
                }
            } while (++i19 < 11);
        }
        long meth_res = l + i17 + i18 + i19 + i20 + i21 + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(sArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        short s=31819;
        double d=49.90616, dArr[]=new double[N];
        int i22=-217, i23=133, i24=186, i25=-9, i26=236, i27=29974, iArr3[]=new int[N];
        float f=-1.357F;
        long l1=-3963885602259257476L, lArr1[]=new long[N];

        FuzzerUtils.init(dArr, -52.64693);
        FuzzerUtils.init(iArr3, 15955);
        FuzzerUtils.init(lArr1, 7L);

        Test.iFld += (int)(((s * -12190) - (Test.instanceCount - fFld)) - (-(Test.iFld << -40842L)));
        Test.iFld -= (int)(1.62061 + ((Test.instanceCount - d) - Test.iFld));
        s = (short)((lMeth(Test.instanceCount) - Test.iFld) * Test.iFld);
        if (Test.bFld) {
            Test.iFld = Test.iFld;
            Test.iFld += Test.iFld;
            Test.iFld += Test.iFld;
            for (double d1 : dArr) {
                fFld = Test.iFld;
                Test.iFld = Test.iFld;
                fFld = fFld;
                for (i22 = 3; i22 < 63; ++i22) {
                    d += i23;
                    iArr3[i22 + 1] >>>= i23;
                    fFld = (float)d;
                    Test.iFld <<= (int)Test.instanceCount;
                }
                fFld = i22;
                Test.instanceCount = 175;
                for (f = 1; f < 63; f++) {
                    iArr3[(int)(f + 1)] &= i22;
                    for (i25 = 1; i25 < 2; ++i25) {
                        if (Test.bFld) continue;
                        lArr1[(int)(f + 1)] |= i25;
                        lArr1[i25 + 1] *= Test.instanceCount;
                        i26 += i25;
                    }
                    Test.iFld = 8;
                }
            }
        } else {
            Test.instanceCount = (long)d;
        }
        for (l1 = 8; l1 < 271; ++l1) {
            if (Test.bFld) break;
            i23 += i27;
        }

        FuzzerUtils.out.println("s d i22 = " + s + "," + Double.doubleToLongBits(d) + "," + i22);
        FuzzerUtils.out.println("i23 f i24 = " + i23 + "," + Float.floatToIntBits(f) + "," + i24);
        FuzzerUtils.out.println("i25 i26 l1 = " + i25 + "," + i26 + "," + l1);
        FuzzerUtils.out.println("i27 dArr iArr3 = " + i27 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            "," + FuzzerUtils.checkSum(iArr3));
        FuzzerUtils.out.println("lArr1 = " + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld fFld = " + Test.instanceCount + "," + Test.iFld + "," +
            Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test.dFld Test.bFld = " + Double.doubleToLongBits(Test.dFld) + "," + (Test.bFld ? 1 :
            0));

        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  dMeth ->  dMeth iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
