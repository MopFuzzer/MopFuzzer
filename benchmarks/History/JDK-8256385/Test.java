// Generated by Java* Fuzzer test generator (1.0.001). Sun Nov 15 23:37:03 2020
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2380430375634840878L;
    public byte byFld=-73;
    public static int iFld=-137;
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -93L);
    }

    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i10, int i11) {

        short s=-3678;
        float f3=-35.345F;
        int i12=2257;
        int i13=60179;
        int i14=9;
        int i15=-89;
        int i16=117;
        int i17=-6;
        int i18=-19433;
        int[] iArr =new int[N];
        double d1=1.33213;

        FuzzerUtils.init(iArr, 0);

        s = (short)f3;
        Test.instanceCount -= i11;
        for (i12 = 6; i12 < 252; i12++) {
            for (i14 = 1; i14 < 7; i14++) {
                for (i16 = 2; i16 > 1; i16--) {
                    iArr[i16 - 1] = (int)Test.instanceCount;
                }
                Test.instanceCount *= (long)f3;
            }
            s = (short)i14;
            i11 += (((i12 * Test.instanceCount) + i13) - f3);
            for (d1 = 1; d1 < 7; d1++) {
                i17 *= (int)d1;
                i11 -= i11;
                f3 = f3;
                iArr[i12 - 1] += (int)Test.instanceCount;
            }
            i13 += (int)Test.instanceCount;
        }
        long meth_res = i10 + i11 + s + Float.floatToIntBits(f3) + i12 + i13 + i14 + i15 + i16 + i17 +
            Double.doubleToLongBits(d1) + i18 + FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(float f2) {

        int i9=9932;
        int i19=-16098;
        int i20=-13392;
        int[] iArr1 =new int[N];
        byte by=-105;
        double d2=0.1256;
        float f4=0.474F;
        long[] lArr1 =new long[N];

        FuzzerUtils.init(iArr1, -63014);
        FuzzerUtils.init(lArr1, 2L);

        i9 = Math.min(iMeth1(0, i9), -154);
        f2 += i9;
        iArr1[(Test.iFld >>> 1) % N] = Test.iFld;
        lArr1[(i9 >>> 1) % N] = Test.iFld;
        i19 = 1;
        while (++i19 < 211) {
            i9 += (((i19 * Test.iFld) + by) - i19);
            Test.instanceCount += Test.instanceCount;
            Test.instanceCount += i19;
            f2 += i9;
            d2 = Test.instanceCount;
            f2 = f4;
            Test.iFld += i9;
            i9 *= (int)f4;
            i20 -= (int)Test.instanceCount;
            lArr1[i19 - 1] |= Test.iFld;
        }
        long meth_res = Float.floatToIntBits(f2) + i9 + i19 + by + Double.doubleToLongBits(d2) +
            Float.floatToIntBits(f4) + i20 + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(int i8) {

        double d=-86.106986;
        float f1=-97.231F;
        float[] fArr =new float[N];
        int i21=-13;
        int i22=11;
        int i23=57;
        int i24=-92;
        int[] iArr2 =new int[N];
        long l=190L;
        boolean b=true, b1=true;
        byte by1=-101;

        FuzzerUtils.init(iArr2, 1);
        FuzzerUtils.init(fArr, 51.774F);

        d = (Math.max((long)(f1 + d), lMeth(f1)) + 0L);
        iArr2[(0 >>> 1) % N] = (int)-1.640F;
        for (i21 = 7; i21 < 198; i21++) {
            for (l = 8; l > 1; --l) {
                fArr[i21 - 1] = i21;
                b = b1;
                i24 = 1;
                do {
                    i22 *= by1;
                    Test.lArrFld[(int)(l - 1)] -= 64;
                    Test.iFld += i24;
                    d += f1;
                } while (++i24 < 2);
                f1 += i8;
                Test.iFld += (int)(l * l);
            }
            i8 += (i21 * i21);
            Test.iFld += i22;
        }
        long meth_res = i8 + Double.doubleToLongBits(d) + Float.floatToIntBits(f1) + i21 + i22 + l + i23 + (b ? 1 : 0)
            + (b1 ? 1 : 0) + i24 + by1 + FuzzerUtils.checkSum(iArr2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-249;
        int i1=10;
        int i2=-165;
        int i3=-30457;
        int i4=-53873;
        int i5=-75;
        int i6=-10522;
        int i7=141;
        int[] iArr3 =new int[N];
        float f=-2.809F;
        float[] fArr1 =new float[N];
        double d3=-2.75580;
        boolean b2=true;
        long[] lArr =new long[N];
        short[] sArr =new short[N];

        FuzzerUtils.init(lArr, 3185195820415031871L);
        FuzzerUtils.init(fArr1, 76.925F);
        FuzzerUtils.init(iArr3, -3);
        FuzzerUtils.init(sArr, (short)31900);

        for (i = 9; i < 191; ++i) {
            for (i2 = 5; i2 < 138; ++i2) {
                int i25=-224;
                i1 >>= (--i3);
                i3 %= (int)((--lArr[i - 1]) | 1);
                for (i4 = 1; i4 < 2; i4++) {
                    f += (i4 + byFld);
                }
                switch ((((++i1) >>> 1) % 9) + 86) {
                case 86:
                    i1 += (((i2 * Test.instanceCount) + i3) - i2);
                    switch ((i % 9) + 44) {
                    case 44:
                        for (i6 = 1; i6 < 2; i6++) {
                            i3 = Math.min(i - iMeth(i7), Test.iFld);
                            i5 = 3211;
                            fArr1 = FuzzerUtils.float1array(N, (float)-17.367F);
                            d3 += d3;
                        }
                        i7 = i3;
                        i5 -= (int)-4146867119165322121L;
                        Test.iFld += i3;
                        break;
                    case 45:
                        i3 |= -108;
                        i5 -= (int)f;
                        break;
                    case 46:
                        i1 += (-143 + (i2 * i2));
                        Test.lArrFld[i] *= i;
                        break;
                    case 47:
                        switch ((i % 2) + 104) {
                        case 104:
                            i3 = i3;
                            i3 += i2;
                            break;
                        case 105:
                            f /= (Test.instanceCount | 1);
                            i1 += -65;
                            if (b2) {
                                try {
                                    i7 = (i6 / iArr3[i2 + 1]);
                                    i1 = (31503 / i5);
                                    i3 = (-23957 % i7);
                                } catch (ArithmeticException a_e) {}
                                fArr1[i2 - 1] -= i2;
                                f = i7;
                            } else {
                                Test.iFld = i1;
                            }
                            break;
                        default:
                            iArr3[i2] >>= Test.iFld;
                        }
                        break;
                    case 48:
                        if (b2) break;
                    case 49:
                        Test.instanceCount -= i4;
                        break;
                    case 50:
                        f -= (float)d3;
                        break;
                    case 51:
                        f -= i2;
                        break;
                    case 52:
                        sArr[i] >>= (short)Test.instanceCount;
                        break;
                    default:
                        i7 = i5;
                    }
                    break;
                case 87:
                    b2 = b2;
                    break;
                case 88:
                    if (b2) break;
                    break;
                case 89:
                    iArr3[i2 - 1] = i25;
                case 90:
                    Test.iFld >>= (int)5863369450472117783L;
                case 91:
                    iArr3[i2 + 1] &= -45366;
                    break;
                case 92:
                    iArr3[i2 - 1] %= (int)(Test.iFld | 1);
                    break;
                case 93:
                    i25 += -48539;
                    break;
                case 94:
                    byFld = (byte)i4;
                    break;
                default:
                    i25 &= i5;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 i5 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("f i6 i7 = " + Float.floatToIntBits(f) + "," + i6 + "," + i7);
        FuzzerUtils.out.println("d3 b2 lArr = " + Double.doubleToLongBits(d3) + "," + (b2 ? 1 : 0) + "," +
            FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("fArr1 iArr3 sArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + "," +
            FuzzerUtils.checkSum(iArr3) + "," + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount byFld Test.iFld = " + Test.instanceCount + "," + byFld + "," +
            Test.iFld);
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 lMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
