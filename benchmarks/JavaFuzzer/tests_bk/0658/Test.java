// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:09 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=17419L;
    public static volatile boolean bFld=false;
    public static float fFld=-56.693F;
    public static short sFld=18560;
    public static double dFld=0.43553;
    public byte byArrFld[]=new byte[N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.dArrFld, -9.36247);
    }

    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i12, int i13) {

        byte by=31;
        int i14=5, i15=-35997, i16=12870, i17=-9, i18=-18605, i19=-140, i20=11, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 30);

        Test.fFld *= i12;
        i13 >>= (int)51592L;
        i12 = i13;
        Test.instanceCount -= i13;
        iArr[(i13 >>> 1) % N] <<= by;
        for (i14 = 5; i14 < 157; ++i14) {
            for (i16 = 1; i16 < 10; ++i16) {
                Test.instanceCount = i14;
                for (i18 = i16; i18 < 2; ++i18) {
                    i19 += (((i18 * i12) + by) - i17);
                    i20 *= i15;
                    i20 = i16;
                }
            }
            Test.instanceCount *= 13;
            i17 -= i12;
            i19 += (i14 - Test.instanceCount);
        }
        long meth_res = i12 + i13 + by + i14 + i15 + i16 + i17 + i18 + i19 + i20 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static short sMeth() {

        int i8=-7, i9=52121, i10=-133, i11=99, iArr1[]=new int[N];
        double d=1.42192;

        FuzzerUtils.init(iArr1, 0);

        switch (((((int)(Test.fFld + i8)) >>> 1) % 1) + 15) {
        case 15:
            for (i9 = 12; 247 > i9; i9++) {
                for (d = i9; d < 7; ++d) {
                    i11 >>= (int)((Test.dArrFld[(int)(d)] = (64.580F * i10)) - ((Test.instanceCount * i9) -
                        (Test.instanceCount >> i11)));
                    i10 |= (int)(((i10 - Test.sFld) + iMeth(i8, i10)) - Test.fFld);
                    Test.instanceCount += 1;
                }
            }
            Test.fFld -= Test.sFld;
            iArr1[(i11 >>> 1) % N] &= i8;
            i8 += (int)Test.instanceCount;
            break;
        }
        i8 += 13;
        i10 = -29;
        Test.dFld = -115;
        i8 = -13264;
        iArr1[(i11 >>> 1) % N] *= (int)Test.instanceCount;
        long meth_res = i8 + i9 + i10 + Double.doubleToLongBits(d) + i11 + FuzzerUtils.checkSum(iArr1);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public void vMeth(int i4, long l1, float f) {

        int i5=-107, i6=-7, i7=132, i21=-179, i22=9;
        byte by1=61;

        i4 *= byArrFld[(i4 >>> 1) % N];
        for (i5 = 7; i5 < 135; ++i5) {
            i7 = 1;
            while (++i7 < 12) {
                Test.instanceCount *= Short.reverseBytes(sMeth());
                switch (((-195 >>> 1) % 7) + 26) {
                case 26:
                    i4 = 0;
                    Test.instanceCount += (long)48.17F;
                    Test.instanceCount = i4;
                    i6 = by1;
                case 27:
                    i6 = (int)l1;
                    f = i5;
                    for (i21 = i7; i21 < 1; i21++) {
                        Test.sFld = (short)i21;
                        i4 += (int)6689915443880264930L;
                        Test.dFld = Test.instanceCount;
                    }
                    break;
                case 28:
                    i6 = i4;
                case 29:
                    l1 >>>= l1;
                    break;
                case 30:
                    i22 += i7;
                case 31:
                    if (i21 != 0) {
                        vMeth_check_sum += i4 + l1 + Float.floatToIntBits(f) + i5 + i6 + i7 + by1 + i21 + i22;
                        return;
                    }
                case 32:
                    by1 *= (byte)-215;
                }
            }
        }
        vMeth_check_sum += i4 + l1 + Float.floatToIntBits(f) + i5 + i6 + i7 + by1 + i21 + i22;
    }

    public void mainTest(String[] strArr1) {

        long l=-2986035470L, lArr[]=new long[N];
        int i=0, i1=5, i2=-8, i3=50977, i23=16155, i24=-831, i25=232, i26=-5, iArr2[]=new int[N];
        byte by2=-61;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)14911);
        FuzzerUtils.init(iArr2, -106);
        FuzzerUtils.init(lArr, 244L);

        l = 292;
        do {
            for (i = 256; i > l; i -= 3) {
                Test.bFld = ((Test.instanceCount++) != Math.min(i1 * 31887, (int)(-Test.instanceCount)));
                for (i2 = 1; i2 < 1; i2++) {
                    vMeth(i1, Test.instanceCount, Test.fFld);
                    Test.dFld = by2;
                }
                i23 |= -11;
                sArr[(int)(l + 1)] = (short)Test.instanceCount;
                i3 += (i * i);
                i23 >>>= i3;
                Test.fFld = 197;
                by2 = (byte)i1;
            }
            i23 = 2495;
            i24 = 1;
            while (++i24 < 256) {
                Test.fFld *= i2;
                for (i25 = (int)(l); 1 > i25; ++i25) {
                    Test.instanceCount += (i25 + i23);
                    i23 += (i25 * i25);
                    iArr2[i25 - 1] = 83;
                    switch (((i24 % 1) * 5) + 78) {
                    case 82:
                        lArr = lArr;
                        i23 = i24;
                        Test.instanceCount *= i25;
                        break;
                    }
                    i23 >>= (int)251L;
                    Test.instanceCount -= i3;
                    Test.dFld -= i1;
                    iArr2[i24] >>= 0;
                    i3 += i3;
                }
                Test.fFld -= i;
                i1 = i23;
            }
        } while ((l -= 3) > 0);

        FuzzerUtils.out.println("l i i1 = " + l + "," + i + "," + i1);
        FuzzerUtils.out.println("i2 i3 by2 = " + i2 + "," + i3 + "," + by2);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 sArr iArr2 = " + i26 + "," + FuzzerUtils.checkSum(sArr) + "," +
            FuzzerUtils.checkSum(iArr2));
        FuzzerUtils.out.println("lArr = " + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.fFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.sFld Test.dFld byArrFld = " + Test.sFld + "," +
            Double.doubleToLongBits(Test.dFld) + "," + FuzzerUtils.checkSum(byArrFld));
        FuzzerUtils.out.println("Test.dArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
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
//DEBUG  sMeth ->  sMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth sMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
