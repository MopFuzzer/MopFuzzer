// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:09 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-12L;
    public static byte byFld=97;
    public static int iFld=14;
    public long lArrFld[][]=new long[N][N];

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public void vMeth() {

        int i=-4612;

        i = (int)Test.instanceCount;
        vMeth_check_sum += i;
    }

    public static int iMeth2() {

        int i13=2, i14=-59099, i15=-9031, i16=54617, i17=2467, i18=215, i19=3, iArr1[][]=new int[N][N];
        short s=188;
        boolean b=false, bArr1[]=new boolean[N];
        float f=-15.518F;

        FuzzerUtils.init(iArr1, 10);
        FuzzerUtils.init(bArr1, false);

        i13 = 1;
        do {
            i14 = 1;
            do {
                Test.byFld += (byte)(i14 + Test.instanceCount);
                i15 >>= -13;
                i15 += (((i14 * Test.instanceCount) + i15) - i13);
                iArr1[i13][i13] = i13;
                i15 = s;
                i15 <<= i15;
                Test.instanceCount += i13;
            } while (++i14 < 10);
            bArr1[i13] = b;
            for (i16 = 10; i16 > i13; i16 -= 3) {
                i15 = (int)f;
                for (i18 = 1; i18 > 1; --i18) {
                    i19 = i14;
                    i17 *= s;
                }
            }
        } while (++i13 < 160);
        long meth_res = i13 + i14 + i15 + s + (b ? 1 : 0) + i16 + i17 + Float.floatToIntBits(f) + i18 + i19 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(bArr1);
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(int i7, int i8) {

        int i9=23, i10=-174, i11=-39500, i12=63, iArr[]=new int[N];
        double d=0.123490;
        short s1=4117;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr, 42239);
        FuzzerUtils.init(bArr, true);

        for (i9 = 12; i9 < 230; i9++) {
            for (d = 1; 7 > d; ++d) {
                i7 += (int)((long)d ^ i11);
                iArr[(int)(d - 1)] &= (++iArr[(int)(d - 1)]);
                if (bArr[i9 - 1]) break;
                i11 -= (((i9 + i7) - i7) + i10);
                i7 += (int)((long)d | Test.instanceCount);
                i7 += (int)(d * d);
                i12 = 1;
                do {
                    Test.instanceCount += Math.abs((int)((-117.403F + iMeth2()) + Test.instanceCount));
                    i7 = i8;
                    s1 = (short)Test.instanceCount;
                    i7 = (int)Test.instanceCount;
                    iArr[(int)(d - 1)] &= i9;
                    Test.instanceCount = i11;
                } while (++i12 < 2);
            }
        }
        long meth_res = i7 + i8 + i9 + i10 + Double.doubleToLongBits(d) + i11 + i12 + s1 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(bArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i1, int i2) {

        int i3=-26531, i4=13, i5=-14, i6=-24400, i20=195, i21=-15241;
        boolean b1=true;
        float f1=1.333F, f2=-2.57F;
        short s2=-16591;

        i3 = 1;
        while (++i3 < 210) {
            for (i4 = 1; i4 < 8; ++i4) {
                i6 = 1;
                do {
                    i2 += i6;
                    i1 += (i6 ^ Test.instanceCount);
                    i1 += ((i5++) * iMeth1(i2, i3));
                } while (++i6 < 2);
                switch ((i3 % 2) + 52) {
                case 52:
                    for (i20 = 1; i20 < 2; ++i20) {
                        i5 += (i20 - i20);
                        if (b1) continue;
                        Test.instanceCount <<= -6;
                        i5 -= Test.byFld;
                        Test.instanceCount = i2;
                        f1 -= i5;
                        i21 &= (int)Test.instanceCount;
                    }
                    break;
                case 53:
                    s2 = (short)Test.instanceCount;
                    break;
                default:
                    f2 -= Test.instanceCount;
                }
            }
        }
        long meth_res = i1 + i2 + i3 + i4 + i5 + i6 + i20 + i21 + (b1 ? 1 : 0) + Float.floatToIntBits(f1) + s2 +
            Float.floatToIntBits(f2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i22=151, i23=5, i24=4, i25=-63486, i26=4, i27=51, iArr2[]=new int[N];
        float f3=0.781F, f5=-47.783F;
        boolean b2=false;

        FuzzerUtils.init(iArr2, 4);

        vMeth();
        Test.instanceCount <<= iMeth(-25791, Test.iFld);
        Test.iFld = -12118;
        i22 = 1;
        do {
            Test.iFld *= (int)Test.instanceCount;
            Test.iFld = 13;
            if (b2) {
                Test.iFld = (int)f3;
            } else if (b2) {
                for (i23 = 6; 202 > i23; i23++) {
                    if (b2) {
                        lArrFld[i22][i22 + 1] -= (long)f3;
                        switch (((Test.iFld >>> 1) % 5) + 85) {
                        case 85:
                            i24 = i23;
                            switch (((-39564 >>> 1) % 5) + 87) {
                            case 87:
                                for (i25 = 1; i25 < 2; ++i25) {
                                    float f4=-1.865F;
                                    Test.instanceCount = 205;
                                    f4 = -113;
                                    i24 = (int)Test.instanceCount;
                                    Test.instanceCount += (((i25 * i26) + Test.instanceCount) - Test.byFld);
                                }
                                b2 = true;
                                for (f5 = 1; f5 < 2; f5++) {
                                    i27 += (int)f5;
                                    Test.instanceCount += (long)f5;
                                    i27 *= i25;
                                    i27 = -12888;
                                    i27 += (int)(f5 * i23);
                                }
                                iArr2[i22 - 1] = i25;
                            case 88:
                                f3 = Test.byFld;
                                try {
                                    i26 = (i25 / -43080);
                                    i24 = (37092 % i22);
                                    i24 = (i24 / i24);
                                } catch (ArithmeticException a_e) {}
                                Test.instanceCount = 13;
                                break;
                            case 89:
                                Test.iFld = 134;
                            case 90:
                                iArr2 = iArr2;
                                break;
                            case 91:
                                f3 += (i23 + Test.instanceCount);
                                break;
                            }
                            break;
                        case 86:
                            i24 += i23;
                        case 87:
                            i24 >>>= i23;
                            break;
                        case 88:
                            Test.instanceCount = 9;
                            break;
                        case 89:
                            Test.byFld += (byte)i23;
                            break;
                        }
                    }
                }
            }
        } while (++i22 < 124);

        FuzzerUtils.out.println("i22 f3 i23 = " + i22 + "," + Float.floatToIntBits(f3) + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("b2 f5 i27 = " + (b2 ? 1 : 0) + "," + Float.floatToIntBits(f5) + "," + i27);
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.iFld = " + Test.instanceCount + "," + Test.byFld +
            "," + Test.iFld);
        FuzzerUtils.out.println("lArrFld = " + FuzzerUtils.checkSum(lArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth2_check_sum: " + iMeth2_check_sum);
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}