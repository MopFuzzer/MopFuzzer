// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:04 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=43746L;
    public static volatile boolean bFld=true;
    public static int iFld=122;
    public float fFld=-54.730F;
    public byte byFld=36;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 6);
    }

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i5=5, i6=-50138, i7=13, i8=-14, i9=4488, i10=23395;
        double d1=-90.68399;
        short s=-3196;
        long lArr[]=new long[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(lArr, 2167989223704557365L);
        FuzzerUtils.init(bArr, true);

        for (i5 = 5; 130 > i5; ++i5) {
            i6 = (int)-1626355229L;
            lArr[i5] -= 49084;
            lArr = lArr;
            for (i7 = 1; 13 > i7; i7++) {
                Test.iArrFld[i5] -= i7;
                for (i9 = 1; i9 < 2; i9++) {
                    i8 = -10;
                    i10 = (int)d1;
                    s *= (short)i8;
                    lArr[i9 + 1] = i7;
                }
                bArr[i7 - 1] = Test.bFld;
                i6 |= -60694;
                Test.iArrFld[i5 + 1] -= i9;
                i8 = -104;
            }
        }
        vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + Double.doubleToLongBits(d1) + s + FuzzerUtils.checkSum(lArr)
            + FuzzerUtils.checkSum(bArr);
    }

    public static float fMeth(int i4) {

        int i11=-48172, i12=-2, i13=12, i14=8, i15=-4, i16=-1, i17=38832;
        double d2=53.77927;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 8L);

        vMeth1();
        i11 = 1;
        while (++i11 < 123) {
            Test.iArrFld[i11 + 1] -= (int)Test.instanceCount;
            i4 >>>= i11;
            i12 = Test.iFld;
            lArr1[i11 + 1] += Test.iFld;
            i13 = 1;
            do {
                for (i14 = 1; i14 < 1; i14++) {
                    float f=54.662F;
                    Test.instanceCount += (long)d2;
                    i15 -= (int)f;
                }
                Test.iArrFld[i11 + 1] *= i14;
                for (i16 = 1; i16 > 1; i16--) {
                    if (Test.bFld) break;
                    i12 = i11;
                }
                Test.instanceCount = 4;
            } while (++i13 < 13);
        }
        long meth_res = i4 + i11 + i12 + i13 + i14 + i15 + Double.doubleToLongBits(d2) + i16 + i17 +
            FuzzerUtils.checkSum(lArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void vMeth(long l) {

        int i=0, i1=179, i2=0, i3=138, i18=-157, i19=-118, i20=12, iArr[]=new int[N];
        byte by=-27;
        double d=54.100406;
        long l1=-4765358929015358704L;
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr, -49380);
        FuzzerUtils.init(sArr, (short)25084);

        for (i = 8; 280 > i; i++) {
            by = (byte)(iArr[i + 1] - sArr[i]);
        }
        for (i2 = 3; i2 < 377; i2++) {
            d += fMeth(i2);
            for (i18 = 1; 5 > i18; ++i18) {
                if (Test.bFld) {
                    i3 += i18;
                } else {
                    Test.bFld = Test.bFld;
                }
            }
            for (l1 = 1; l1 < 5; l1++) {
                fFld = i20;
                switch ((int)((l1 % 2) + 98)) {
                case 98:
                    by = (byte)i19;
                case 99:
                    i20 += (int)(((l1 * fFld) + l1) - i2);
                    Test.iArrFld[i2 + 1] = i;
                    Test.iFld = i20;
                    break;
                }
            }
        }
        vMeth_check_sum += l + i + i1 + by + i2 + i3 + Double.doubleToLongBits(d) + i18 + i19 + l1 + i20 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(sArr);
    }

    public void mainTest(String[] strArr1) {

        int i21=201, i22=63960, i23=-8, i24=-62166, i25=-26086, i26=-14, i27=-40266, i28=229;
        double d3=-1.20326;
        short s1=-1679;

        vMeth(Test.instanceCount);
        for (i21 = 8; i21 < 371; i21++) {
            Test.instanceCount = i22;
            for (i23 = 3; 69 > i23; i23 += 2) {
                for (i25 = 1; i25 < 3; i25 += 2) {
                    i26 = i22;
                    d3 -= i25;
                    i24 += (((i25 * fFld) + Test.instanceCount) - i23);
                    Test.iFld -= (int)Test.instanceCount;
                    s1 >>>= (short)-8;
                }
                i24 -= (int)fFld;
                i24 -= (int)Test.instanceCount;
                byFld += (byte)(14626 + (i23 * i23));
                Test.iFld = i25;
                for (i27 = i23; i27 < 3; ++i27) {
                    i22 >>= (int)Test.instanceCount;
                    i28 = i25;
                    Test.iArrFld[i27] -= i28;
                    if (Test.bFld) continue;
                    Test.instanceCount -= Test.iFld;
                    i26 -= i23;
                    Test.iArrFld[i23 + 1] /= (int)(i27 | 1);
                }
                i22 %= (int)(i23 | 1);
                i26 -= (int)71.82620;
                Test.instanceCount -= 2177;
            }
            i28 = i28;
            fFld += i21;
        }

        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("d3 s1 i27 = " + Double.doubleToLongBits(d3) + "," + s1 + "," + i27);
        FuzzerUtils.out.println("i28 = " + i28);

        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.iFld = " + Test.instanceCount + "," + (Test.bFld ? 1
            : 0) + "," + Test.iFld);
        FuzzerUtils.out.println("fFld byFld Test.iArrFld = " + Float.floatToIntBits(fFld) + "," + byFld + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
