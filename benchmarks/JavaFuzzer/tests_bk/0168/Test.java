// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:52:57 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4014578891L;
    public int iFld=-45;
    public static float fFld=-1.1005F;
    public static volatile short sFld=-32512;
    public static double dFld=-38.74235;
    public byte byFld=-45;
    public long lArrFld[]=new long[N];

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i7=234, i8=17363, i9=14772, iArr[][]=new int[N][N];
        float f=2.438F;
        boolean b=false;

        FuzzerUtils.init(iArr, 2);

        i7 = 1;
        do {
            Test.fFld -= -167;
            iArr = iArr;
            Test.instanceCount += i7;
            Test.instanceCount += i7;
        } while (++i7 < 391);
        i8 = 384;
        do {
            i9 = i8;
            f += (float)-57.107564;
            i9 += i8;
            i9 += (4 + (i8 * i8));
            if (b) {
                Test.instanceCount += (i8 | i9);
                Test.instanceCount += (1 + (i8 * i8));
                i9 |= (int)Test.instanceCount;
            } else {
                Test.instanceCount >>= i8;
            }
        } while (--i8 > 0);
        vMeth_check_sum += i7 + i8 + i9 + Float.floatToIntBits(f) + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth1() {

        int i6=-14890, i10=18, i11=-3, i12=19085, i13=2, i14=3;
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, 1.519F);

        i6 >>= i6;
        vMeth();
        for (i10 = 16; i10 < 347; i10++) {
            i6 <<= i10;
            i12 = 1;
            while (++i12 < 5) {
                switch (((i12 % 2) * 5) + 29) {
                case 35:
                    for (i13 = 1; i13 < 1; ++i13) {
                        Test.sFld = (short)Test.instanceCount;
                        i11 = (int)-12L;
                        i6 += i12;
                    }
                    fArr[i10 + 1][i10] = Test.instanceCount;
                    Test.instanceCount += (i12 | Test.instanceCount);
                case 36:
                    i6 = i14;
                    break;
                default:
                    Test.instanceCount = i11;
                    Test.dFld = i6;
                }
            }
        }
        long meth_res = i6 + i10 + i11 + i12 + i13 + i14 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth() {

        byte by=90;
        int i4=35344, i5=235;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);

        iFld -= (int)(((iFld >>> iFld) * (by + -8)) - ((Test.instanceCount + Test.fFld) * (Test.instanceCount -
            Test.instanceCount)));
        for (i4 = 373; 21 < i4; i4--) {
            Test.fFld = iMeth1();
            switch (((i4 % 7) * 5) + 41) {
            case 73:
                Test.instanceCount += (-44699 + (i4 * i4));
                break;
            case 46:
                Test.instanceCount *= (long)Test.fFld;
                Test.fFld = i5;
            case 55:
                i5 = iFld;
                Test.instanceCount += (30685 + (i4 * i4));
                break;
            case 66:
                Test.instanceCount >>= i5;
                i5 += (i4 * i4);
                iFld = Test.sFld;
                break;
            case 42:
                bArr[i4 + 1] = false;
                i5 = iFld;
                i5 = by;
                break;
            case 59:
                iFld += iFld;
                break;
            case 52:
                lArrFld[i4 + 1] += (long)Test.fFld;
                break;
            }
        }
        long meth_res = by + i4 + i5 + FuzzerUtils.checkSum(bArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=33768, i1=-25, i2=94, i3=-1, i15=14, i16=-58688, iArr1[]=new int[N];
        boolean b1=true;
        long l=-12L;
        float fArr1[]=new float[N];
        double dArr[]=new double[N];
        short sArr[][]=new short[N][N];

        FuzzerUtils.init(iArr1, 11810);
        FuzzerUtils.init(fArr1, -55.339F);
        FuzzerUtils.init(dArr, -75.94922);
        FuzzerUtils.init(sArr, (short)23946);

        iFld -= (int)(iFld + (Test.instanceCount--));
        for (i = 10; 367 > i; i += 2) {
            for (i2 = 4; i2 < 141; i2++) {
                Test.instanceCount = i2;
                iMeth();
                iArr1 = iArr1;
                try {
                    iArr1[i2 - 1] = (-43426 % iFld);
                    iFld = (41318 / i3);
                    i1 = (i2 % 9475);
                } catch (ArithmeticException a_e) {}
                iFld >>>= i2;
                fArr1[i] -= i1;
                i3 <<= -65107;
                for (i15 = i; 2 > i15; ++i15) {
                    if (b1) continue;
                    Test.instanceCount += i15;
                    switch ((i15 % 8) + 47) {
                    case 47:
                        Test.sFld = (short)i16;
                        i3 -= (int)Test.instanceCount;
                        break;
                    case 48:
                        i3 = i2;
                        dArr[i15 + 1] -= -13;
                        Test.fFld %= (i15 | 1);
                        byFld >>= (byte)i16;
                        break;
                    case 49:
                        Test.instanceCount >>= iFld;
                        switch (((i2 >>> 1) % 2) + 65) {
                        case 65:
                            i1 <<= i2;
                            lArrFld = lArrFld;
                            if (b1) break;
                            break;
                        case 66:
                            Test.dFld += -36;
                            iArr1[i2 + 1] *= (int)Test.fFld;
                            break;
                        default:
                            i3 += (((i15 * Test.instanceCount) + Test.instanceCount) - i15);
                        }
                        sArr = sArr;
                        break;
                    case 50:
                        Test.instanceCount <<= -41442;
                        break;
                    case 51:
                        Test.fFld = Test.instanceCount;
                        break;
                    case 52:
                        lArrFld[i2] = -10L;
                        break;
                    case 53:
                        iFld = (int)Test.instanceCount;
                        break;
                    case 54:
                        i3 = (int)l;
                        break;
                    default:
                        i1 = (int)Test.dFld;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i15 i16 = " + i3 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("b1 l iArr1 = " + (b1 ? 1 : 0) + "," + l + "," + FuzzerUtils.checkSum(iArr1));
        FuzzerUtils.out.println("fArr1 dArr sArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + "," + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.fFld = " + Test.instanceCount + "," + iFld + "," +
            Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.sFld Test.dFld byFld = " + Test.sFld + "," + Double.doubleToLongBits(Test.dFld) +
            "," + byFld);
        FuzzerUtils.out.println("lArrFld = " + FuzzerUtils.checkSum(lArrFld));

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
