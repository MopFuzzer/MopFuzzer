// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:18 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4031321880L;
    public double dFld=0.74017;
    public int iFld=34756;
    public static short sFld=21878;
    public static boolean bFld=false;
    public static double dFld1=-76.80616;
    public float fFld=-1.421F;
    public byte byFld=26;

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(byte by, int i5, int i6) {

        int i7=123, i8=-5, i9=-14, i10=-242;
        float f=-13.226F, fArr[]=new float[N];
        long l=-7L, lArr[]=new long[N];

        FuzzerUtils.init(fArr, 42.593F);
        FuzzerUtils.init(lArr, 64546L);

        for (i7 = 180; i7 > 5; --i7) {
            Test.instanceCount += (((i7 * i5) + Test.instanceCount) - f);
            i5 *= 1;
            if (Test.bFld) {
                i5 += i8;
            } else {
                for (l = 1; l < 9; l += 2) {
                    f += (l * l);
                }
                i10 = 1;
                while (++i10 < 9) {
                    Test.dFld1 = i6;
                    i6 += i7;
                    Test.dFld1 -= Test.dFld1;
                    i8 += i10;
                    fArr[i10] = Test.sFld;
                    lArr[i10 - 1] >>>= l;
                }
                fArr[i7 + 1] = 714143043L;
            }
        }
        vMeth_check_sum += by + i5 + i6 + i7 + i8 + Float.floatToIntBits(f) + l + i9 + i10 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
    }

    public int iMeth(int i, int i1) {

        int i2=2, i3=78, i11=10, i12=-43674, i13=25843, i14=104, i15=-114, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 0);

        for (i2 = 2; 332 > i2; ++i2) {
            byte by1=91;
            i1 += (((i2 * Test.sFld) + i2) - Test.instanceCount);
            vMeth(by1, iFld, i3);
            Test.instanceCount += (long)Test.dFld1;
        }
        iFld = i;
        fFld += iFld;
        i11 = 1;
        while (++i11 < 143) {
            fFld -= Test.instanceCount;
            for (i12 = i11; i12 < 11; ++i12) {
                for (i14 = 1; i14 < 1; i14++) {
                    Test.instanceCount += (((i14 * i13) + i1) - i15);
                    i3 += (i14 - Test.instanceCount);
                    i3 += (((i14 * i3) + fFld) - i12);
                    fFld += i14;
                    i15 >>= i3;
                }
            }
        }
        long meth_res = i + i1 + i2 + i3 + i11 + i12 + i13 + i14 + i15 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public long lMeth() {

        int i16=-18209, i17=9, i18=223, i19=4, i20=123, iArr1[]=new int[N];
        float f1=0.517F;

        FuzzerUtils.init(iArr1, 32);

        iFld <<= (iFld ^ ((iFld >> iFld) - (-iMeth(iFld, iFld))));
        iFld *= iFld;
        Test.bFld = Test.bFld;
        iFld -= iFld;
        iFld = iFld;
        for (i16 = 22; i16 < 363; i16++) {
            iFld = i17;
            for (f1 = i16; f1 < 5; f1++) {
                fFld -= i16;
                Test.sFld += (short)f1;
                iArr1[i16] = i18;
                byFld = (byte)i16;
                for (i19 = 1; i19 < 1; i19++) {
                    iFld += i19;
                    dFld = i18;
                }
            }
        }
        long meth_res = i16 + i17 + Float.floatToIntBits(f1) + i18 + i19 + i20 + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i21=11, i22=-44532, i23=-52785, i24=-243, i25=24616, i26=-8, i27=-41270, i28=13, i29=-183, iArr2[]=new
            int[N];
        long l1=-10L, lArr1[][]=new long[N][N];
        byte byArr[]=new byte[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(byArr, (byte)-58);
        FuzzerUtils.init(iArr2, -11);
        FuzzerUtils.init(lArr1, -211L);
        FuzzerUtils.init(sArr, (short)-29558);

        dFld -= (++byArr[(iFld >>> 1) % N]);
        lMeth();
        for (i21 = 16; i21 < 307; i21++) {
            for (i23 = 3; i23 < 86; ++i23) {
                if (Test.bFld) continue;
                Test.instanceCount = Test.sFld;
                i24 *= (int)2803494839L;
                i24 = (int)Test.instanceCount;
                iArr2[i21] *= (int)Test.instanceCount;
                Test.instanceCount = i22;
                for (i25 = 1; i25 < 2; i25++) {
                    switch ((i25 % 1) + 17) {
                    case 17:
                        lArr1[i21 + 1] = lArr1[i21];
                        dFld = 1.700F;
                        Test.instanceCount += i24;
                        i24 += i25;
                        break;
                    }
                    Test.instanceCount -= iFld;
                    sArr[i25 + 1] = Test.sFld;
                }
                iFld <<= (int)Test.instanceCount;
            }
            Test.instanceCount = 3;
            for (l1 = 5; l1 < 86; ++l1) {
                i24 = (int)dFld;
                i27 >>= i22;
                i24 = iFld;
                fFld %= -9633;
                for (i28 = 1; i28 < 2; ++i28) {
                    byFld <<= (byte)i23;
                    i24 = (int)Test.dFld1;
                    Test.dFld1 += i26;
                    i27 -= i23;
                }
            }
        }

        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("l1 i27 i28 = " + l1 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("i29 byArr iArr2 = " + i29 + "," + FuzzerUtils.checkSum(byArr) + "," +
            FuzzerUtils.checkSum(iArr2));
        FuzzerUtils.out.println("lArr1 sArr = " + FuzzerUtils.checkSum(lArr1) + "," + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount dFld iFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(dFld) + "," + iFld);
        FuzzerUtils.out.println("Test.sFld Test.bFld Test.dFld1 = " + Test.sFld + "," + (Test.bFld ? 1 : 0) + "," +
            Double.doubleToLongBits(Test.dFld1));
        FuzzerUtils.out.println("fFld byFld = " + Float.floatToIntBits(fFld) + "," + byFld);

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
