// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-138L;
    public double dFld=-100.10944;
    public static short sFld=-16042;
    public static float fFld=-89.72F;
    public boolean bFld=false;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 11L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        long l2=-1773495802L;
        int i5=-229, i6=21084, i7=-53981;
        float f=-78.207F;

        for (l2 = 14; l2 < 360; ++l2) {
            i5 <<= 53584;
            for (i6 = (int)(l2); i6 < 5; ++i6) {
                Test.lArrFld[i6 - 1] /= (Test.instanceCount | 1);
            }
            f -= 27964;
            f -= Test.sFld;
            i7 += (int)(l2 * l2);
        }
        vMeth2_check_sum += l2 + i5 + i6 + i7 + Float.floatToIntBits(f);
    }

    public void vMeth1(long l1) {

        int i1=246, i2=5, i3=9, i4=1, iArr[]=new int[N];
        boolean b=false;

        FuzzerUtils.init(iArr, -35524);

        for (i1 = 1; i1 < 351; ++i1) {
            try {
                i2 = (-11458 % i2);
                i2 = (i2 / iArr[i1 + 1]);
                i2 = (226 % i2);
            } catch (ArithmeticException a_e) {}
            for (i3 = i1; i3 < 5; i3++) {
                iArr[i1] -= (iArr[i3] + (++i4));
                i2 = (-i3);
                l1 = (++Test.instanceCount);
                if (b) {
                    Test.instanceCount >>= i4;
                    dFld *= (-i3);
                    vMeth2();
                } else if (b) {
                    switch (((i2 >>> 1) % 2) + 13) {
                    case 13:
                        iArr[i1 + 1] = i2;
                        break;
                    case 14:
                        if (b) continue;
                        break;
                    }
                    i2 = i1;
                    i4 -= i2;
                    vMeth1_check_sum += l1 + i1 + i2 + i3 + i4 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr);
                    return;
                } else if (b) {
                    l1 *= i1;
                } else {
                    i4 = (int)-4814791067603576318L;
                }
            }
        }
        vMeth1_check_sum += l1 + i1 + i2 + i3 + i4 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public void vMeth(int i, long l) {

        int i8=-13, i9=-3, i10=24, i11=-167, iArr1[]=new int[N];
        float f1=2.303F;

        FuzzerUtils.init(iArr1, 2);

        vMeth1(Test.instanceCount);
        for (long l3 : Test.lArrFld) {
            for (i8 = 1; i8 < 4; ++i8) {
                boolean b1=true;
                if (b1) {
                    switch ((i8 % 2) + 126) {
                    case 126:
                        if (i8 != 0) {
                            vMeth_check_sum += i + l + i8 + i9 + Float.floatToIntBits(f1) + i10 + i11 +
                                FuzzerUtils.checkSum(iArr1);
                            return;
                        }
                    case 127:
                        f1 *= i;
                        for (i10 = 1; i10 < 2; i10++) {
                            dFld *= i;
                            if (i8 != 0) {
                                vMeth_check_sum += i + l + i8 + i9 + Float.floatToIntBits(f1) + i10 + i11 +
                                    FuzzerUtils.checkSum(iArr1);
                                return;
                            }
                            i11 -= i8;
                            i11 += i10;
                        }
                        b1 = false;
                    }
                } else if (b1) {
                    try {
                        i = (-1408097602 / i10);
                        i = (i11 / 3889);
                        i = (iArr1[i8 - 1] % -31999);
                    } catch (ArithmeticException a_e) {}
                    if (b1) break;
                }
            }
        }
        vMeth_check_sum += i + l + i8 + i9 + Float.floatToIntBits(f1) + i10 + i11 + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i12=-46211, i13=-130, i14=-30999, i15=-39, i16=-225, i17=-12839, i18=-141, i19=45713, i20=-121, i21=-5,
            i22=1, iArr2[][]=new int[N][N];
        long l4=1619246145L;
        byte by=1;
        boolean b2=true, bArr[][]=new boolean[N][N];

        FuzzerUtils.init(iArr2, -88);
        FuzzerUtils.init(bArr, true);

        vMeth(i12, -17515L);
        Test.sFld -= (short)i12;
        for (l4 = 4; l4 < 334; ++l4) {
            Test.sFld >>= (short)i13;
            i13 += by;
            try {
                i13 = (181 / iArr2[(int)(l4)][(int)(l4)]);
                i13 = (981479827 % iArr2[(int)(l4)][(int)(l4 + 1)]);
                i13 = (i13 % 42886);
            } catch (ArithmeticException a_e) {}
            for (i14 = (int)(l4); 76 > i14; i14++) {
                i16 = 1;
                do {
                    Test.fFld = i13;
                } while (++i16 < 1);
            }
            for (i17 = 2; i17 < 76; i17++) {
                i13 >>= 149;
                Test.fFld += 0;
                Test.fFld += ((long)i17 ^ (long)i16);
                Test.fFld += (-60 + (i17 * i17));
                i12 = (int)4003409495L;
                for (i19 = 2; i19 > 1; i19--) {
                    i20 += i19;
                    bArr[i17 - 1] = FuzzerUtils.boolean1array(N, (boolean)false);
                }
                if (bFld) {
                    by = (byte)i16;
                    dFld = i18;
                    i12 += (int)Test.fFld;
                }
                i15 *= i17;
                for (i21 = 2; i21 > i17; --i21) {
                    Test.instanceCount *= i17;
                    i18 *= (int)dFld;
                    i18 /= (int)(i21 | 1);
                    if (bFld) break;
                    Test.instanceCount += (i21 ^ l4);
                    b2 = bFld;
                }
            }
        }

        FuzzerUtils.out.println("i12 l4 i13 = " + i12 + "," + l4 + "," + i13);
        FuzzerUtils.out.println("by i14 i15 = " + by + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("i22 b2 iArr2 = " + i22 + "," + (b2 ? 1 : 0) + "," + FuzzerUtils.checkSum(iArr2));
        FuzzerUtils.out.println("bArr = " + FuzzerUtils.checkSum(bArr));

        FuzzerUtils.out.println("Test.instanceCount dFld Test.sFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(dFld) + "," + Test.sFld);
        FuzzerUtils.out.println("Test.fFld bFld Test.lArrFld = " + Float.floatToIntBits(Test.fFld) + "," + (bFld ? 1 :
            0) + "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
