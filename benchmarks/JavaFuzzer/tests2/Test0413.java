// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:31 2023
public class Test0413 {

    public static final int N = 400;

    public static long instanceCount=-166L;
    public static volatile byte byFld=109;
    public boolean bFld=true;
    public double dFld=120.124125;
    public float fFld=0.705F;
    public volatile short sFld=-16596;
    public float[] fArrFld =new float[N];
    public double[] dArrFld =new double[N];
    public byte[] byArrFld =new byte[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l) {

        int i3=-61968;
        int i4=243;
        int i5=198;
        int i6=-49059;
        int i7=95;
        int[] iArr =new int[N];
        int[] iArr1 =new int[N];
        float f=1.498F;
        double d1=-2.49636;
        boolean b2=false;

        FuzzerUtils.init(iArr, -34941);
        FuzzerUtils.init(iArr1, -106);

        Test0413.byFld = (byte) l;
        iArr[(i3 >>> 1) % N] = i3;
        for (i4 = 17; i4 < 374; i4++) {
            i3 = (int)l;
            f += i4;
        }
        if (b2) {
            i5 = (int) Test0413.instanceCount;
            for (i6 = 11; i6 < 228; i6++) {
                i5 += (36 + (i6 * i6));
                iArr1 = iArr1;
                i3 -= (int)d1;
                i5 *= (int)-14L;
                Test0413.byFld = (byte) i3;
                b2 = b2;
                i7 <<= i7;
            }
        } else if (b2) {
            i3 += (int)d1;
        }
        long meth_res = l + i3 + i4 + i5 + Float.floatToIntBits(f) + i6 + i7 + Double.doubleToLongBits(d1) + (b2 ? 1 :
            0) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth1(int i1) {

        double d=97.89289, d2=56.88525;
        int i2=-24948, i8=72, i9=-10611, i10=4, i11=-11, i12=-4, i13=-30009, i14=61;
        boolean[] bArr =new boolean[N];

        FuzzerUtils.init(bArr, false);

        i1 = i1;
        for (d = 8; d < 246; d++) {
            fArrFld[(int) (d)] -= (((Test0413.byFld + 48697) + iMeth(Test0413.instanceCount)) - i1);
            for (i8 = 1; i8 < 7; i8++) {
                for (i10 = 2; i10 > 1; --i10) {
                    Test0413.instanceCount = Test0413.instanceCount;
                    i11 += (i10 ^ i8);
                }
                dArrFld[(int)(d)] += i8;
                i9 += (((i8 * i10) + i10) - Test0413.instanceCount);
            }
            i12 = 1;
            do {
                bArr[(int)(d)] = bFld;
                d2 %= (i2 | 1);
                for (i13 = 1; i13 < 1; ++i13) {
                    d2 -= d;
                    i9 += i2;
                }
            } while (++i12 < 7);
        }
        vMeth1_check_sum += i1 + Double.doubleToLongBits(d) + i2 + i8 + i9 + i10 + i11 + i12 +
            Double.doubleToLongBits(d2) + i13 + i14 + FuzzerUtils.checkSum(bArr);
    }

    public void vMeth(boolean b, boolean b1) {

        int i15=-111;
        int i16=-49;
        int i17=111;
        int i18=-2;
        int i19=-10455;
        int i20=-64;
        int i21=-14;
        int[] iArr2 =new int[N];
        short s=13667;

        FuzzerUtils.init(iArr2, 50179);

        vMeth1(i15);
        i15 ^= i15;
        for (i16 = 6; i16 < 264; ++i16) {
            i17 = i17;
            switch (((i16 % 8) * 5) + 23) {
            case 33:
                i15 += (i16 ^ Test0413.instanceCount);
                break;
            case 63:
                for (i18 = i16; 6 > i18; ++i18) {
                    i20 = 1;
                    while (++i20 < 1) {
                        i19 ^= i20;
                        Test0413.instanceCount -= i19;
                        i17 += i19;
                        switch (((i16 % 1) * 5) + 17) {
                        case 22:
                            iArr2[i20 + 1] += (int)dFld;
                            break;
                        default:
                            if (b1) continue;
                            Test0413.instanceCount /= 20;
                        }
                    }
                }
                break;
            case 36:
                fFld = Test0413.instanceCount;
                break;
            case 32:
                i15 += i17;
                break;
            case 44:
                i19 += i16;
            case 27:
                i19 = (int)dFld;
                break;
            case 45:
                fFld = fFld;
                break;
            case 56:
                i19 >>= i15;
                break;
            default:
                s = (short)i21;
            }
        }
        vMeth_check_sum += (b ? 1 : 0) + (b1 ? 1 : 0) + i15 + i16 + i17 + i18 + i19 + i20 + s + i21 +
            FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i=70;
        int i22=12;
        int i23=-194;
        int i24=893;
        int i25=47;
        int i26=-4736;
        int i27=-9;
        int[] iArr3 =new int[N];
        long l1=-226L;
        short[] sArr =new short[N];

        FuzzerUtils.init(iArr3, -116);
        FuzzerUtils.init(sArr, (short)26883);

        i = (int) (-(Test0413.instanceCount++));
        i = (int) (Test0413.instanceCount--);
        vMeth(false, bFld);
        fFld *= 93;
        i &= (int) Test0413.instanceCount;
        Test0413.instanceCount <<= i;
        if (bFld) {
            iArr3[(i >>> 1) % N] += 23;
            for (l1 = 11; l1 < 363; l1++) {
                sArr[(int) (l1 - 1)] -= (short) Test0413.instanceCount;
                Test0413.instanceCount >>= i;
                i22 -= 30205;
                i >>= (int) Test0413.instanceCount;
                i23 = 1;
                while (++i23 < 72) {
                    for (i24 = 1; 1 < i24; i24 -= 3) {
                        i = (int)1.705F;
                        Test0413.instanceCount -= i25;
                        i22 += (i24 | (long)fFld);
                        i *= (int)dFld;
                        try {
                            i25 = (iArr3[(int)(l1 - 1)] % 189);
                            iArr3[i24 + 1] = (iArr3[i24] / i25);
                            i = (44080 / i);
                        } catch (ArithmeticException a_e) {}
                        i = i25;
                        fFld -= 10L;
                        Test0413.instanceCount |= i24;
                        sFld = (short) Test0413.instanceCount;
                        fFld += 64660;
                    }
                    i += (i23 ^ Test0413.byFld);
                    byArrFld[i23 + 1] += (byte)1.28717;
                    for (i26 = 1; i26 < 1; ++i26) {
                        i25 += (i26 - i25);
                        Test0413.instanceCount -= -10;
                    }
                }
            }
        } else if (bFld) {
            i25 -= (int)l1;
        } else {
            Test0413.instanceCount += i27;
        }

        FuzzerUtils.out.println("i l1 i22 = " + i + "," + l1 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 iArr3 = " + i26 + "," + i27 + "," + FuzzerUtils.checkSum(iArr3));
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test0413.instanceCount Test0413.byFld bFld = " + Test0413.instanceCount + "," + Test0413.byFld + "," +
            (bFld ? 1 : 0));
        FuzzerUtils.out.println("dFld fFld sFld = " + Double.doubleToLongBits(dFld) + "," + Float.floatToIntBits(fFld)
            + "," + sFld);
        FuzzerUtils.out.println("fArrFld dArrFld byArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld))
            + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)) + "," + FuzzerUtils.checkSum(byArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0413 _instance = new Test0413();
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}