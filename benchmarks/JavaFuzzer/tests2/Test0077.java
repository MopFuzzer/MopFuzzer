// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:15 2023
public class Test0077 {

    public static final int N = 400;

    public static long instanceCount=-1110207786701097612L;
    public static int iFld=-6;
    public short sFld=-26020;
    public boolean bFld=true;
    public volatile double dFld=33.128006;
    public static float fFld=2.711F;
    public long[] lArrFld =new long[N];
    public static int[][] iArrFld =new int[N][N];

    static {
        FuzzerUtils.init(Test0077.iArrFld, 41680);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i5=11, i6=-13, i7=-53364, i8=3, i9=-4966, i10=-12;
        float f=2.553F;
        double d=-115.123718;
        short s=6667;

        for (i5 = 13; 347 > i5; i5++) {
            for (i7 = 5; i7 > 1; i7 -= 3) {
                boolean b=false;
                i6 += i8;
                if (b) {
                    for (i9 = 1; i9 < 5; ++i9) {
                        i6 += i7;
                        if (false) break;
                        i6 += (i9 * i9);
                        f -= i7;
                        i6 *= (int)f;
                    }
                    Test0077.instanceCount *= i6;
                } else if (b) {
                    Test0077.iArrFld[i5] = Test0077.iArrFld[i7];
                    i8 = (int) Test0077.instanceCount;
                    i8 = (int)d;
                } else if (b) {
                    s ^= (short)i6;
                } else {
                    Test0077.instanceCount += (12 + (i7 * i7));
                    vMeth2_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f) +
                        Double.doubleToLongBits(d) + s;
                    return;
                }
            }
        }
        vMeth2_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + s;
    }

    public void vMeth1() {

        int i3=159, i4=-54148, i11=1914, i12=-232, i13=125, i14=0, i15=0, i16=-12162;
        float f1=-98.420F;

        for (i3 = 6; i3 < 152; ++i3) {
            Test0077.iArrFld[i3][i3 - 1] = (Test0077.iArrFld[i3 - 1][i3 + 1]++);
            vMeth2();
        }
        Test0077.iFld = i4;
        for (i11 = 3; i11 < 170; ++i11) {
            i4 = (int)f1;
            Test0077.iFld <<= sFld;
            i13 = sFld;
            for (i14 = i11; 9 > i14; i14++) {
                if (bFld) break;
                Test0077.iArrFld[i14] = Test0077.iArrFld[i14];
                Test0077.instanceCount /= ((long) (f1) | 1);
                i13 += (((i14 * Test0077.instanceCount) + i16) - i12);
                i12 *= i15;
                Test0077.iFld -= (int) dFld;
            }
        }
        vMeth1_check_sum += i3 + i4 + i11 + i12 + Float.floatToIntBits(f1) + i13 + i14 + i15 + i16;
    }

    public void vMeth(int i, long l) {

        int i1=7;
        int i2=-2;
        int i18=-7;
        int i19=-49;
        int i20=50919;
        int i21=131;
        int[] iArr1 =new int[N];
        short[] sArr =new short[N];

        FuzzerUtils.init(iArr1, -56);
        FuzzerUtils.init(sArr, (short)22315);

        Test0077.iFld = Test0077.iFld;
        iArr1[(Test0077.iFld >>> 1) % N] -= (int) (iArr1[(Test0077.iFld >>> 1) % N] - ((Test0077.instanceCount++) -
                Float.intBitsToFloat(Test0077.iFld)));
        for (i1 = 3; 271 > i1; i1 += 2) {
            vMeth1();
            bFld = false;
            for (i18 = 1; 12 > i18; i18++) {
                l -= -177;
                i19 += (i18 ^ i19);
                if (i2 != 0) {
                    vMeth_check_sum += i + l + i1 + i2 + i18 + i19 + i20 + i21 + FuzzerUtils.checkSum(iArr1) +
                        FuzzerUtils.checkSum(sArr);
                    return;
                }
            }
            sArr[i1 + 1] += (short) Test0077.iFld;
            for (i20 = 1; i20 < 12; i20++) {
                if (bFld) break;
                i19 = i1;
                i19 = i1;
                Test0077.fFld += (41422L + (i20 * i20));
            }
        }
        vMeth_check_sum += i + l + i1 + i2 + i18 + i19 + i20 + i21 + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(sArr);
    }

    public void mainTest(String[] strArr1) {

        int i22=7;
        int i23=81;
        int i24=157;
        int i25=1;
        int i26=8;
        int i27=18830;
        int i28=20;
        int i29=3;
        int i30=68;
        int i31=194;
        int[][] iArr =new int[N][N];
        byte by=-77;

        FuzzerUtils.init(iArr, -11236);

        Test0077.instanceCount %= ((Test0077.iFld + lArrFld[(-4 >>> 1) % N]) | 1);
        iArr[(Test0077.iFld >>> 1) % N] = (iArr[(Test0077.iFld >>> 1) % N] = (iArr[(Test0077.iFld >>> 1) % N] = (iArr[(Test0077.iFld
            >>> 1) % N] = iArr[(-10 >>> 1) % N])));
        vMeth(Test0077.iFld, Test0077.instanceCount);
        for (i22 = 1; i22 < 387; ++i22) {
            iArr[i22][i22 - 1] %= (int)(i22 | 1);
        }
        Test0077.iFld = Test0077.iFld;
        Test0077.instanceCount -= i22;
        for (i24 = 10; 364 > i24; ++i24) {
            i25 |= i22;
            dFld = i24;
            i23 ^= i24;
            dFld += i24;
            Test0077.instanceCount >>= sFld;
            if (bFld) {
                for (i26 = 4; 71 > i26; i26++) {
                    i23 += (((i26 * i27) + Test0077.instanceCount) - Test0077.instanceCount);
                    Test0077.fFld = (float) 12.66047;
                }
            } else {
                Test0077.instanceCount = i24;
            }
        }
        for (i28 = 12; i28 < 296; ++i28) {
            Test0077.instanceCount /= (i27 | 1);
            switch ((i28 % 1) + 47) {
            case 47:
                i30 = 1;
                while (++i30 < 89) {
                    i27 = 67;
                    i31 = 1;
                    while (++i31 < 1) {
                        short s1=-20110;
                        Test0077.instanceCount |= by;
                        s1 -= (short)-758542881L;
                    }
                    i25 = -105;
                    i29 -= i24;
                    Test0077.instanceCount -= i24;
                }
                iArr[i28 + 1] = Test0077.iArrFld[i28 + 1];
                break;
            }
        }

        FuzzerUtils.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("i28 i29 i30 = " + i28 + "," + i29 + "," + i30);
        FuzzerUtils.out.println("i31 by iArr = " + i31 + "," + by + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test0077.instanceCount Test0077.iFld sFld = " + Test0077.instanceCount + "," + Test0077.iFld + "," +
            sFld);
        FuzzerUtils.out.println("bFld dFld Test0077.fFld = " + (bFld ? 1 : 0) + "," + Double.doubleToLongBits(dFld) + "," +
                Float.floatToIntBits(Test0077.fFld));
        FuzzerUtils.out.println("lArrFld Test0077.iArrFld = " + FuzzerUtils.checkSum(lArrFld) + "," +
                FuzzerUtils.checkSum(Test0077.iArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0077 _instance = new Test0077();
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