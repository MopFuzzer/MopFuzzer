// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:57 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=935L;
    public float fFld=-2.901F;
    public static double dFld=0.36535;
    public static int iArrFld[]=new int[N];
    public boolean bArrFld[][]=new boolean[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 7);
    }

    public static long lMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;

    public static long lMeth1(int i6, int i7) {

        int i8=81, i9=-4, i10=14;
        double d=2.38099, dArr[]=new double[N];
        short s=-9500;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -1L);
        FuzzerUtils.init(dArr, -124.67899);

        for (i8 = 202; i8 > 2; --i8) {
            boolean b=true;
            b = b;
            if (b) continue;
            if (b) {
                i9 += (((i8 * i6) + i8) - Test.instanceCount);
                i7 = -22101;
            } else if (b) {
                d -= i8;
                if (i6 != 0) {
                }
                Test.instanceCount = Test.instanceCount;
            }
            i9 -= (int)Test.instanceCount;
            Test.instanceCount = -95;
            i10 = 1;
            while (++i10 < 8) {
                s += (short)(-86 + (i10 * i10));
                Test.instanceCount += (long)-1.38984;
                i6 += i10;
            }
        }
        long meth_res = i6 + i7 + i8 + i9 + Double.doubleToLongBits(d) + i10 + s + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public float fMeth(long l1) {

        int i3=144, i4=105, i5=-9668, i11=30391;
        byte by=-87;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -57474L);

        i3 = 1;
        do {
            for (i4 = i3; i4 < 21; i4++) {
                i5 += (-173 + (i4 * i4));
                fFld = lMeth1(247, i3);
                i11 = 1;
                while (++i11 < 1) {
                    i5 += (i11 - i3);
                    fFld += (((i11 * i3) + i4) - i11);
                    Test.dFld *= i5;
                    i5 = i4;
                    i5 = by;
                    i5 += (i11 + Test.instanceCount);
                }
                i5 *= (int)fFld;
                lArr1 = lArr1;
                if (i5 != 0) {
                }
                if (i11 != 0) {
                }
            }
        } while ((i3 += 3) < 224);
        long meth_res = l1 + i3 + i4 + i5 + i11 + by + FuzzerUtils.checkSum(lArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public long lMeth(int i2, long l) {

        long l3=-183L, lArr2[]=new long[N];
        int i12=13, i13=0, i15=11, i16=198;
        boolean b1=true;
        float fArr1[]=new float[N];

        FuzzerUtils.init(lArr2, -13L);
        FuzzerUtils.init(fArr1, 2.895F);

        fFld -= fMeth(l);
        lArr2[(i2 >>> 1) % N] = i2;
        for (l3 = 14; l3 < 317; l3++) {
            i12 += (int)l3;
            Test.dFld *= i12;
            i2 -= i13;
            Test.instanceCount += (((l3 * i12) + i2) - i13);
            i12 += (int)l3;
        }
        for (int i14 : Test.iArrFld) {
            fFld %= (0 | 1);
            for (i15 = 1; 4 > i15; ++i15) {
                short s1=11865;
                Test.instanceCount += (i15 * i15);
                if (b1) {
                    fArr1[i15] += s1;
                    Test.iArrFld[i15 - 1] >>= i12;
                } else {
                    l = i13;
                }
            }
        }
        long meth_res = i2 + l + l3 + i12 + i13 + i15 + i16 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(lArr2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=9, i1=24739, i17=-3, i18=-26, i19=10, i20=2, i21=12, i22=61636;
        float f=0.850F, fArr[][]=new float[N][N];
        boolean b2=true;
        short s2=-30986;
        long lArr3[]=new long[N];

        FuzzerUtils.init(fArr, 74.531F);
        FuzzerUtils.init(lArr3, -14L);

        for (i = 11; i < 203; i++) {
            fArr[i][i - 1] = (float)(lMeth(i1, Test.instanceCount) + Test.dFld);
            Test.instanceCount = (long)Test.dFld;
            lArr3[i + 1] = Test.instanceCount;
            Test.iArrFld[i - 1] += i;
            for (i17 = 2; i17 < 131; i17++) {
                f = 1;
                do {
                    lArr3[i17 + 1] >>>= -26;
                    Test.iArrFld[i17] -= i;
                    Test.iArrFld[i - 1] = (int)Test.instanceCount;
                    if (b2) continue;
                    i18 = i1;
                    i18 -= i18;
                    i18 = s2;
                    i18 *= i18;
                    i1 = -38510;
                } while (++f < 2);
                i1 = i18;
                Test.iArrFld[(-51174 >>> 1) % N] = (int)Test.instanceCount;
                i18 = i18;
                Test.instanceCount = (long)fFld;
                for (i19 = 1; 2 > i19; i19++) {
                    Test.iArrFld[i17 + 1] *= i;
                    i1 = -11;
                    Test.instanceCount += Test.instanceCount;
                    if (b2) continue;
                    fFld -= fFld;
                    lArr3 = FuzzerUtils.long1array(N, (long)-8186396468098102185L);
                }
                for (i21 = 1; 2 > i21; ++i21) {
                    bArrFld[i21] = bArrFld[i17 + 1];
                    if (b2) continue;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i17 = " + i + "," + i1 + "," + i17);
        FuzzerUtils.out.println("i18 f b2 = " + i18 + "," + Float.floatToIntBits(f) + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("s2 i19 i20 = " + s2 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 fArr = " + i21 + "," + i22 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("lArr3 = " + FuzzerUtils.checkSum(lArr3));

        FuzzerUtils.out.println("Test.instanceCount fFld Test.dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(fFld) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.iArrFld bArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(bArrFld));

        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth lMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 fMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
