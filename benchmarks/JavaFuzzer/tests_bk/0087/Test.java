// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:54 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3484834537L;
    public volatile int iFld=198;
    public static double dFld=96.101206;
    public static float fFld=-108.862F;
    public static byte byFld=-25;
    public volatile int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;

    public static long lMeth1(int i2) {

        short s=-1907;
        boolean b=false;
        int i3=-4, i4=60230, i5=-37655, i6=-1;

        Test.instanceCount += s;
        if (b) {
            Test.dFld = i2;
        } else {
            for (i3 = 299; 7 < i3; i3--) {
                i4 -= i4;
                i2 *= (int)Test.instanceCount;
                i4 -= i3;
                i2 >>= (int)Test.instanceCount;
                i4 -= (int)Test.instanceCount;
                for (i5 = 1; i5 < 6; ++i5) {
                    i4 = i5;
                    Test.instanceCount += i3;
                    if (b) continue;
                    i6 <<= i6;
                    i4 = -135;
                }
            }
        }
        long meth_res = i2 + s + (b ? 1 : 0) + i3 + i4 + i5 + i6;
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static long lMeth(double d) {

        float f=1.8F, f1=0.821F;
        int i7=132, i8=51, i9=3, i10=-7, i11=-75, i12=3, i13=36, iArr[]=new int[N];
        double d1=-34.73653;

        FuzzerUtils.init(iArr, 169);

        f = (float)((Test.instanceCount = (long)(d * Test.instanceCount)) + (lMeth1(41) - i7));
        i7 = (int)d1;
        for (i8 = 11; i8 < 236; i8++) {
            i7 *= i7;
            i7 = i7;
            i10 = 7;
            while (--i10 > 0) {
                for (i11 = 1; i11 < 1; ++i11) {
                    i9 >>= i13;
                    if (i8 != 0) {
                    }
                    switch (((i10 % 6) * 5) + 66) {
                    case 81:
                        if (i7 != 0) {
                        }
                    case 71:
                        i7 = (int)d1;
                        break;
                    case 96:
                        Test.instanceCount += (i11 + i11);
                        iArr = FuzzerUtils.int1array(N, (int)14);
                        i12 += i11;
                        break;
                    case 78:
                        try {
                            i7 = (i10 % 10911);
                            i9 = (iArr[i11 + 1] % i7);
                            i12 = (i8 % -59468);
                        } catch (ArithmeticException a_e) {}
                    case 73:
                        f1 += i7;
                        break;
                    case 95:
                        i9 = (int)-55.579F;
                        break;
                    }
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d) + Float.floatToIntBits(f) + i7 + Double.doubleToLongBits(d1) + i8 +
            i9 + i10 + i11 + i12 + i13 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth() {

        int i=-58456, i1=64617, i14=9, i15=130, i16=-62;
        double d2=-78.33645;
        boolean b1=false;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-43);

        for (i = 1; i < 309; ++i) {
            byArr[i - 1] += (byte)lMeth(Test.dFld);
            for (d2 = 1; 5 > d2; d2++) {
                i15 = 1;
                do {
                    byte by=56;
                    Test.instanceCount >>= i16;
                    i1 = i16;
                    if (b1) {
                        Test.instanceCount += i1;
                        vMeth_check_sum += i + i1 + Double.doubleToLongBits(d2) + i14 + i15 + i16 + (b1 ? 1 : 0) +
                            FuzzerUtils.checkSum(byArr);
                        return;
                    } else {
                        switch ((i15 % 2) + 29) {
                        case 29:
                            i14 += (((i15 * by) + i15) - i);
                            Test.instanceCount <<= i15;
                            i14 = i14;
                            break;
                        case 30:
                            i16 |= (int)Test.instanceCount;
                            Test.instanceCount ^= i14;
                        }
                        Test.instanceCount += (long)Test.fFld;
                    }
                } while (++i15 < 2);
            }
        }
        vMeth_check_sum += i + i1 + Double.doubleToLongBits(d2) + i14 + i15 + i16 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        float f2=-29.774F;
        int i17=-251, i18=-252, i19=104, i20=-10, i21=-210, i22=-11283;
        boolean b2=true, bArr[]=new boolean[N];
        short s1=-24517, sArr[][]=new short[N][N];

        FuzzerUtils.init(sArr, (short)13955);
        FuzzerUtils.init(bArr, true);

        iFld += (iArrFld[(iFld >>> 1) % N]++);
        iFld = (int)(lArrFld[(iFld >>> 1) % N] + ((-2546 * Test.instanceCount) * (Test.instanceCount + iFld)));
        iFld = sArr[(iFld >>> 1) % N][(iFld >>> 1) % N];
        iFld *= (int)(-25264L + ((++iFld) + Test.instanceCount));
        vMeth();
        switch (((iFld >>> 1) % 3) + 60) {
        case 60:
            for (f2 = 10; f2 < 327; ++f2) {
                i18 = 1;
                do {
                    if (b2) continue;
                    for (i19 = 1; i19 < 1; i19++) {
                        sArr[i18 + 1] = sArr[(int)(f2 - 1)];
                        switch ((((12 >>> 1) % 2) * 5) + 34) {
                        case 41:
                            lArrFld[i18 + 1] *= i17;
                        case 43:
                            iFld -= i19;
                            Test.instanceCount = i20;
                            if (b2) break;
                            iArrFld[i19 + 1] >>= s1;
                            break;
                        }
                        lArrFld = lArrFld;
                    }
                    iFld >>= iFld;
                } while (++i18 < 79);
                Test.byFld += (byte)i19;
                iArrFld[(int)(f2)] = i17;
                Test.instanceCount -= 43497;
                i17 += -32;
                iFld = i19;
                i17 <<= 14;
                i17 >>= i20;
                for (i21 = 4; 79 > i21; ++i21) {
                    bArr[i21] = b2;
                    if (b2) break;
                    iFld >>= iFld;
                }
            }
            break;
        case 61:
            iFld -= (int)Test.instanceCount;
            break;
        case 62:
            s1 = (short)i22;
            break;
        }

        FuzzerUtils.out.println("f2 i17 i18 = " + Float.floatToIntBits(f2) + "," + i17 + "," + i18);
        FuzzerUtils.out.println("b2 i19 i20 = " + (b2 ? 1 : 0) + "," + i19 + "," + i20);
        FuzzerUtils.out.println("s1 i21 i22 = " + s1 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("sArr bArr = " + FuzzerUtils.checkSum(sArr) + "," + FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.dFld = " + Test.instanceCount + "," + iFld + "," +
            Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.fFld Test.byFld iArrFld = " + Float.floatToIntBits(Test.fFld) + "," + Test.byFld
            + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("lArrFld = " + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
