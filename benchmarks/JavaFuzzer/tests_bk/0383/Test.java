// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:02 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-6545L;
    public static short sFld=26169;
    public static volatile float fFld=-1.144F;
    public byte byFld=-126;
    public static double dFld=1.19270;
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 106L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i5=57, i6=8, i7=16924, i8=10874, i9=239, i10=-31567, iArr1[]=new int[N];
        byte by=-70, byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-1);
        FuzzerUtils.init(iArr1, 3);

        Test.instanceCount >>= -40176;
        for (i5 = 13; i5 < 328; ++i5) {
            Test.lArrFld[i5 + 1] *= Test.instanceCount;
            for (i7 = 5; i7 > 1; i7 -= 3) {
                byArr[i7 + 1] *= (byte)i8;
                iArr1[i5 + 1] <<= i6;
                i6 >>= by;
                switch ((i7 % 3) + 17) {
                case 17:
                    iArr1[i5 - 1] >>= 0;
                    i6 += (i7 + i5);
                case 18:
                    i8 >>= by;
                    break;
                case 19:
                    i6 = i5;
                    for (i9 = 5; 1 < i9; --i9) {
                        iArr1[i5] *= i7;
                        Test.instanceCount = i9;
                    }
                    break;
                }
            }
        }
        vMeth2_check_sum += i5 + i6 + i7 + i8 + by + i9 + i10 + FuzzerUtils.checkSum(byArr) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1() {

        int i2=-141, i3=-9, i4=6604, i11=34174;
        float f1=114.39F;
        double d=30.99347;
        boolean b1=false;

        Test.lArrFld = (Test.lArrFld = (Test.lArrFld = (Test.lArrFld = Test.lArrFld)));
        Test.instanceCount = i2;
        for (i3 = 8; i3 < 257; i3++) {
            switch (((i3 % 1) * 5) + 73) {
            case 74:
                i2 = (int)((long)((++f1) - i4) >>> (Test.instanceCount--));
                vMeth2();
                break;
            default:
                Test.lArrFld[i3] = i11;
            }
            Test.instanceCount = Test.instanceCount;
            switch ((i3 % 2) + 122) {
            case 122:
                i2 %= (int)(i3 | 1);
                Test.lArrFld[i3 + 1] += 6;
                break;
            case 123:
                Test.instanceCount = i2;
                d = Test.instanceCount;
                Test.instanceCount += i3;
                break;
            }
            b1 = b1;
        }
        vMeth1_check_sum += i2 + i3 + i4 + Float.floatToIntBits(f1) + i11 + Double.doubleToLongBits(d) + (b1 ? 1 : 0);
    }

    public static void vMeth(int i1, boolean b) {

        long l=-4621321349285899563L;
        int i12=20349, i13=30, i14=58967, i15=-24949, i16=38997, i17=-13;

        Test.instanceCount /= ((--i1) | 1);
        vMeth1();
        for (l = 1; l < 225; l++) {
            i12 += (int)(l ^ i12);
            if (b) continue;
            Test.sFld = (short)i12;
            i12 <<= i12;
            if (b) {
                for (i13 = 1; i13 < 7; i13++) {
                    switch ((int)(((l % 7) * 5) + 59)) {
                    case 62:
                        i14 = (int)Test.instanceCount;
                        break;
                    case 81:
                        for (i15 = 1; i15 < 2; ++i15) {
                            double d1=54.119240;
                            i16 *= i14;
                            d1 *= i14;
                        }
                        Test.sFld += (short)(i13 + i16);
                        break;
                    case 82:
                        i12 += (int)Test.fFld;
                        break;
                    case 60:
                        Test.instanceCount *= i12;
                        break;
                    case 72:
                        if (b) break;
                    case 90:
                        Test.sFld += (short)12;
                        break;
                    case 69:
                        i14 *= i15;
                        break;
                    default:
                        i1 -= i15;
                    }
                }
            } else {
                i1 += (int)(((l * i17) + i17) - i14);
            }
        }
        vMeth_check_sum += i1 + (b ? 1 : 0) + l + i12 + i13 + i14 + i15 + i16 + i17;
    }

    public void mainTest(String[] strArr1) {

        float f=-97.553F, fArr[]=new float[N];
        int i=-215, i18=240, i19=-8, i20=43098, i21=11, i22=10, i23=8, i24=40, i25=-38617, i26=36239, iArr[]=new int[N];
        boolean b2=true, bArr[]=new boolean[N];
        byte byArr1[]=new byte[N];

        FuzzerUtils.init(iArr, 33691);
        FuzzerUtils.init(fArr, 0.939F);
        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(byArr1, (byte)32);

        f += (iArr[(i >>> 1) % N] % (((long)((i + Test.instanceCount) + (++fArr[(-125 >>> 1) % N]))) | 1));
        vMeth(i, false);
        for (i18 = 7; i18 < 277; ++i18) {
            iArr[i18] = i19;
            for (i20 = 5; i20 < 93; i20++) {
                i21 -= i;
                i19 >>>= i18;
                i21 += (int)-11L;
                if (b2) break;
                i22 = 1;
                do {
                    i19 = i18;
                    i *= i;
                    i = i18;
                    Test.instanceCount = -129;
                    i19 = Test.sFld;
                    Test.fFld += i21;
                    bArr[i22 - 1] = b2;
                    f *= i;
                } while (++i22 < 2);
                for (i23 = 1; i23 < 2; i23++) {
                    iArr[i23] -= i19;
                    byFld -= (byte)i22;
                    Test.dFld *= i23;
                }
                for (i25 = 1; i25 < 2; ++i25) {
                    Test.instanceCount = 25154;
                    Test.instanceCount += (((i25 * i24) + i18) - i26);
                    Test.sFld += (short)(i25 * i25);
                    Test.instanceCount = 2;
                    Test.instanceCount *= i21;
                    Test.instanceCount += i21;
                    byArr1[i18 + 1] = (byte)i23;
                }
            }
        }

        FuzzerUtils.out.println("f i i18 = " + Float.floatToIntBits(f) + "," + i + "," + i18);
        FuzzerUtils.out.println("i19 i20 i21 = " + i19 + "," + i20 + "," + i21);
        FuzzerUtils.out.println("b2 i22 i23 = " + (b2 ? 1 : 0) + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("iArr fArr bArr = " + FuzzerUtils.checkSum(iArr) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + "," + FuzzerUtils.checkSum(bArr));
        FuzzerUtils.out.println("byArr1 = " + FuzzerUtils.checkSum(byArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.fFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("byFld Test.dFld Test.lArrFld = " + byFld + "," + Double.doubleToLongBits(Test.dFld) +
            "," + FuzzerUtils.checkSum(Test.lArrFld));

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
