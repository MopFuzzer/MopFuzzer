// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:05 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3667931263L;
    public double dFld=48.61448;
    public static byte byFld=42;
    public static int iFld=64705;
    public static volatile boolean bFld=true;
    public float fFld=-82.12F;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 38863L);
    }

    public static long fMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i6=-6, iArr[]=new int[N];
        boolean b=true;

        FuzzerUtils.init(iArr, 5222);

        i6 -= (int)Test.instanceCount;
        b = false;
        iArr[(i6 >>> 1) % N] -= i6;
        vMeth_check_sum += i6 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(long l, int i5) {

        int i7=-11, i8=-23332, i9=6114;
        byte by=-42;
        boolean b1=false;
        float f=0.581F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 2414646180L);

        vMeth();
        if (b1) {
            for (i7 = 20; i7 < 383; ++i7) {
                lArr[i7 - 1] += i7;
                i9 = 1;
                while (++i9 < 5) {
                    by = (byte)Test.instanceCount;
                }
                i5 |= i7;
                b1 = b1;
                f += i8;
                if (b1) continue;
                i8 -= -194;
                i8 += (i7 + i7);
                l |= i7;
            }
            i5 = i8;
            l = -11193;
        }
        long meth_res = l + i5 + i7 + i8 + i9 + by + (b1 ? 1 : 0) + Float.floatToIntBits(f) +
            FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public float fMeth(int i1, int i2, int i3) {

        int i4=-44633, iArr1[]=new int[N];
        float f1=-44.103F;

        FuzzerUtils.init(iArr1, 173);

        i4 = 1;
        while ((i4 += 3) < 342) {
            iMeth(-3133142972L, -153);
            i1 |= i1;
            switch (((i4 % 10) * 5) + 33) {
            case 57:
            case 35:
                Test.instanceCount += (-1 + (i4 * i4));
                break;
            case 82:
                i2 *= i1;
                break;
            case 80:
                i2 -= (int)Test.instanceCount;
                try {
                    i3 = (i2 / i2);
                    iArr1[i4 - 1] = (-210 % i2);
                    iArr1[i4 - 1] = (i2 / iArr1[i4 - 1]);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount = i2;
                iArr1[i4] *= (int)f1;
            case 71:
                f1 *= 6;
                Test.instanceCount -= 16506;
                break;
            case 41:
                f1 += i2;
                i2 /= (int)(i3 | 1);
                i3 &= (int)Test.instanceCount;
                break;
            case 58:
                i3 = (int)-3167878283L;
            case 59:
                i1 = (int)f1;
                break;
            case 44:
                Test.instanceCount += i4;
                break;
            case 78:
                dFld /= (i3 | 1);
                break;
            default:
                Test.byFld = (byte)Test.instanceCount;
            }
        }
        long meth_res = i1 + i2 + i3 + i4 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-51249, i10=5, i11=-64840, i12=-142, i13=-13, i14=-3, i15=-34, i16=63, i17=-7, i18=-26581, i19=52653,
            i20=-12, iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, -6);

        i = 1;
        while (++i < 260) {
            fMeth(115, -5, i);
            Test.iFld += -110;
        }
        for (i10 = 179; i10 > 8; i10--) {
            Test.lArrFld[i10] = i11;
            if (Test.bFld) break;
        }
        i11 = i11;
        for (i12 = 7; i12 < 136; i12++) {
            Test.iFld *= i12;
            for (i14 = 11; 194 > i14; ++i14) {
                iArr2[i14] -= (int)dFld;
                Test.instanceCount -= i10;
                i16 = 1;
                do {
                    i11 = i13;
                } while (++i16 < 2);
            }
            iArr2[i12] *= i;
            for (i17 = 9; i17 < 194; ++i17) {
                Test.instanceCount += 217L;
                i18 -= Test.byFld;
                if (Test.bFld) {
                    fFld = i18;
                    i18 <<= i;
                } else if (Test.bFld) {
                    iArr2[i12] += 175;
                    Test.instanceCount = Test.instanceCount;
                    if (Test.bFld) {
                        iArr2[i12 + 1] = i14;
                        if (false) break;
                        for (i19 = 2; 1 < i19; i19--) {
                            i13 += Test.byFld;
                            Test.byFld >>>= (byte)Test.iFld;
                            i13 += (int)(3091559221L + (i19 * i19));
                        }
                    } else {
                        i15 = (int)Test.instanceCount;
                    }
                } else {
                    Test.byFld = (byte)Test.instanceCount;
                }
            }
        }

        FuzzerUtils.out.println("i i10 i11 = " + i + "," + i10 + "," + i11);
        FuzzerUtils.out.println("i12 i13 i14 = " + i12 + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount dFld Test.byFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(dFld) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.iFld Test.bFld fFld = " + Test.iFld + "," + (Test.bFld ? 1 : 0) + "," +
            Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  iMeth ->  iMeth fMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
