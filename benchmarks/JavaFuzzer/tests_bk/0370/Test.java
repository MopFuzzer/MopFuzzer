// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:02 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=2146416557L;
    public boolean bFld=true;
    public static float fFld=1.991F;
    public int iArrFld[]=new int[N];

    public static long iMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(float f, int i9, long l1) {

        float f1=0.939F;
        int i11=-233, i12=-2, i13=-9, i14=-1, iArr1[]=new int[N];
        short s1=-21296;
        byte by=27;

        FuzzerUtils.init(iArr1, 20);

        l1 >>>= i9;
        for (int i10 : iArr1) {
            for (f1 = 1; f1 < 4; ++f1) {
                Test.fFld += (float)-56.99187;
                i9 += (int)(((f1 * i9) + i11) - i10);
                switch (((i10 >>> 1) % 4) + 49) {
                case 49:
                    i9 *= i10;
                    break;
                case 50:
                    i10 += i10;
                    for (i12 = 1; 2 > i12; ++i12) {
                        i10 += 12;
                        s1 += (short)(((i12 * i12) + i11) - i13);
                        Test.fFld += (((i12 * i11) + i14) - i14);
                        i10 = 14;
                        i13 *= i10;
                        f = i12;
                    }
                    break;
                case 51:
                    Test.instanceCount += (2605020694L + (f1 * f1));
                case 52:
                    by += (byte)(((f1 * l1) + l1) - Test.instanceCount);
                    break;
                }
            }
        }
        long meth_res = Float.floatToIntBits(f) + i9 + l1 + Float.floatToIntBits(f1) + i11 + i12 + i13 + s1 + i14 + by
            + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static boolean bMeth(long l, int i7) {

        int i8=-5737, i15=15165, i16=-24954, i17=6, i18=13, i19=160, iArr2[]=new int[N];
        short s2=-17930;
        boolean b1=true;
        double d1=-67.35887;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-92);
        FuzzerUtils.init(iArr2, -51);

        byArr[(i8 >>> 1) % N] *= (byte)(Long.reverseBytes((long)(i7 - Test.fFld)) - iMeth1(Test.fFld, i8,
            Test.instanceCount));
        for (i15 = 10; i15 < 203; ++i15) {
            i8 += (i15 + Test.instanceCount);
            byArr[i15 + 1] = (byte)s2;
            i8 *= i8;
            for (i17 = 1; i17 < 8; ++i17) {
                i8 %= (int)((long)(Test.fFld) | 1);
                i8 -= -227;
            }
            i8 += (int)l;
            if (b1) continue;
        }
        byArr[(i15 >>> 1) % N] *= (byte)1.321F;
        i19 = 1;
        do {
            iArr2 = iArr2;
            Test.fFld -= i18;
            d1 -= l;
        } while (++i19 < 281);
        long meth_res = l + i7 + i8 + i15 + i16 + s2 + i17 + i18 + (b1 ? 1 : 0) + i19 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr2);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static int iMeth(int i6, double d) {

        boolean b=true;
        int i20=-146, i21=4, i22=-95, i23=41922, iArr[]=new int[N];
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(iArr, 13);
        FuzzerUtils.init(lArr, -8065599688762839880L);

        b = ((i6 == iArr[(11 >>> 1) % N]) && bMeth(Test.instanceCount, i6));
        for (i20 = 17; i20 < 382; i20++) {
            for (i22 = i20; i22 < 5; ++i22) {
                i6 = i21;
                if (b) break;
                d = i22;
                iArr[i22] = i22;
                switch (((i22 % 2) * 5) + 42) {
                case 46:
                    Test.instanceCount += (((i22 * i22) + Test.fFld) - i20);
                    i23 = (int)Test.instanceCount;
                    lArr[i20 - 1][i22 + 1] += -8;
                    i21 *= (int)d;
                    break;
                case 50:
                    i21 += (43492 + (i22 * i22));
                    Test.fFld += (i22 * i22);
                    break;
                default:
                    i23 *= i22;
                }
            }
        }
        long meth_res = i6 + Double.doubleToLongBits(d) + (b ? 1 : 0) + i20 + i21 + i22 + i23 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=165, i1=12, i2=14, i3=-9, i4=58147, i5=134, i24=-34206, i25=-88;
        short s=-7888;
        double d2=0.37549;
        byte by1=68;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -70.204F);

        i = 1;
        while (++i < 391) {
            for (i1 = i; i1 < 64; ++i1) {
                i2 >>= i1;
                for (i3 = 1; 1 > i3; i3++) {
                    if (bFld = true) continue;
                    i4 = (int)(i4 = (int)((i2 * i2) - Math.abs(Test.instanceCount)));
                    i4 += i3;
                    fArr[i - 1] += (((s++) - (s - i4)) * (-(i1 + i3)));
                    iArrFld[i3] >>= i2;
                    i2 = (++i4);
                    i2 += (i3 * i3);
                    i4 = (--i4);
                }
                i5 += (i1 | i1);
                iMeth(i5, d2);
            }
        }
        i2 = 24;
        Test.instanceCount = Test.instanceCount;
        for (i24 = 4; i24 < 161; ++i24) {
            i25 <<= i3;
            Test.fFld = 96;
            i4 <<= i4;
            switch ((i24 % 1) + 93) {
            case 93:
                by1 += (byte)d2;
                bFld = bFld;
                if (bFld) {
                    i4 -= i1;
                    d2 = Test.fFld;
                    i4 -= 10;
                    i25 <<= s;
                }
            default:
                i25 += (i24 * i24);
                i5 += (((i24 * i5) + i3) - Test.fFld);
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 s = " + i3 + "," + i4 + "," + s);
        FuzzerUtils.out.println("i5 d2 i24 = " + i5 + "," + Double.doubleToLongBits(d2) + "," + i24);
        FuzzerUtils.out.println("i25 by1 fArr = " + i25 + "," + by1 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount bFld Test.fFld = " + Test.instanceCount + "," + (bFld ? 1 : 0) +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("iArrFld = " + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
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
//DEBUG  bMeth ->  bMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 bMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
