// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:14 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=8271401550092516365L;
    public static short sFld=-28156;
    public static double dFld=0.18477;
    public static byte byFld=-22;
    public long lFld=0L;

    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i6, int i7) {

        int i8=76, i9=59, i10=-49543, i11=12, i12=-114, iArr[]=new int[N];
        float f=0.839F;
        byte by=-12;
        boolean b=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -159L);
        FuzzerUtils.init(iArr, 2);

        for (i8 = 3; i8 < 136; i8 += 2) {
            i7 = (int)f;
            i10 = 23;
            do {
                lArr = lArr;
                for (i11 = 1; 3 > i11; i11 += 3) {
                    f -= Test.instanceCount;
                    if (b) {
                        by += (byte)126;
                        if (i9 != 0) {
                            vMeth1_check_sum += i6 + i7 + i8 + i9 + Float.floatToIntBits(f) + i10 + i11 + i12 + by + (b
                                ? 1 : 0) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
                            return;
                        }
                        i6 += i7;
                        i7 += i11;
                    }
                    iArr[i8 + 1] *= i11;
                    i6 = -56396;
                    i9 += (i11 * f);
                    i6 = i8;
                }
            } while ((i10 -= 3) > 0);
        }
        vMeth1_check_sum += i6 + i7 + i8 + i9 + Float.floatToIntBits(f) + i10 + i11 + i12 + by + (b ? 1 : 0) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public static double dMeth(int i4, int i5) {

        int i13=-13458, i14=-9, i15=4, i16=-30664, i17=2, iArr1[][]=new int[N][N];
        float f1=2.392F;
        boolean b1=true;
        short sArr[][]=new short[N][N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(sArr, (short)23161);
        FuzzerUtils.init(iArr1, -187);
        FuzzerUtils.init(lArr1, 40L);

        vMeth1(i4, i5);
        i4 += i5;
        if (b1) {
            sArr[(i5 >>> 1) % N] = sArr[(i5 >>> 1) % N];
            i4 += (int)Test.instanceCount;
        } else if (b1) {
            for (i13 = 5; i13 < 303; i13++) {
                i14 /= (int)(i13 | 1);
                i5 += (i13 * i13);
                switch (((i13 % 9) * 5) + 112) {
                case 150:
                    Test.instanceCount <<= Test.instanceCount;
                    Test.sFld += (short)i13;
                    Test.dFld -= f1;
                    for (i15 = 1; i15 < 6; ++i15) {
                        i4 = i13;
                        i14 += i17;
                    }
                    break;
                case 146:
                    i5 += i13;
                    break;
                case 123:
                    i4 += (i13 + Test.instanceCount);
                    break;
                case 126:
                    if (b1) break;
                    break;
                case 133:
                    iArr1[i13 + 1][i13] *= i16;
                    break;
                case 141:
                    lArr1[i13 - 1] = i4;
                    break;
                case 124:
                    i16 -= (int)-182L;
                    break;
                case 116:
                    f1 = i5;
                    break;
                case 120:
                    f1 += ((long)i13 ^ (long)f1);
                    break;
                default:
                    i5 = Test.sFld;
                }
            }
        } else if (b1) {
            iArr1[(i5 >>> 1) % N][(i4 >>> 1) % N] ^= i14;
        }
        long meth_res = i4 + i5 + i13 + i14 + Float.floatToIntBits(f1) + i15 + i16 + i17 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth(long l, short s) {

        int i2=-4, i3=-1424, i18=98, i19=-182, i20=179;
        long l1=-3887151180732195782L;
        float f2=1.991F;

        try {
            i2 <<= (int)(-(-(l / (i2 | 1))));
        }
        catch (ArrayIndexOutOfBoundsException exc1) {
            for (l1 = 6; 123 > l1; l1++) {
                dMeth(94, i3);
                for (f2 = 1; f2 < 13; f2++) {
                    i3 /= (int)(l | 1);
                    for (i19 = 1; i19 < 2; ++i19) {
                        i3 += i19;
                        i20 >>>= i19;
                        switch ((int)((f2 % 2) + 117)) {
                        case 117:
                            Test.dFld *= i19;
                            Test.dFld = i3;
                            i18 = -145;
                        case 118:
                            Test.byFld += (byte)(i19 | i20);
                            Test.dFld += i19;
                            break;
                        default:
                            Test.instanceCount *= i3;
                        }
                    }
                }
            }
        }
        vMeth_check_sum += l + s + i2 + l1 + i3 + Float.floatToIntBits(f2) + i18 + i19 + i20;
    }

    public void mainTest(String[] strArr1) {

        int i=20278, i1=42, i21=79, i22=34401, iArr2[][]=new int[N][N];
        float f3=11.31F;
        long l2=-4219826454L, lArr2[][]=new long[N][N];
        boolean b2=false;

        FuzzerUtils.init(iArr2, 141);
        FuzzerUtils.init(lArr2, 4777290211713955315L);

        for (i = 13; i < 390; i++) {
            i1 *= i;
            if (b2) {
                vMeth(Test.instanceCount, Test.sFld);
                if (b2) {
                    i21 = 1;
                    do {
                        i22 = 1;
                        while ((i22 += 3) < 1) {
                            switch (((i22 >>> 1) % 10) + 106) {
                            case 106:
                                f3 *= i1;
                                f3 += i1;
                                break;
                            case 107:
                                iArr2 = iArr2;
                                Test.instanceCount *= Test.instanceCount;
                                Test.byFld /= (byte)((long)(f3) | 1);
                                lArr2[i + 1][i22] = (long)Test.dFld;
                                break;
                            case 108:
                                i1 = (int)l2;
                            case 109:
                                i1 -= i22;
                                i1 <<= (int)l2;
                                l2 = i;
                                i1 <<= 55313;
                                break;
                            case 110:
                                b2 = b2;
                                Test.instanceCount |= i22;
                                Test.dFld += i;
                            case 111:
                                Test.dFld = 29166;
                                iArr2[i21 + 1][(14 >>> 1) % N] = (int)f3;
                                i1 = Test.byFld;
                                break;
                            case 112:
                                lArr2[i21 - 1][i22 - 1] = 7;
                                i1 <<= (int)lFld;
                                i1 += (((i22 * f3) + f3) - f3);
                                break;
                            case 113:
                                lFld = -8322;
                                Test.sFld = (short)i;
                            case 114:
                                l2 = lFld;
                                break;
                            case 115:
                                i1 = i21;
                                break;
                            default:
                                if (false) break;
                            }
                        }
                    } while (++i21 < 67);
                } else if (b2) {
                    Test.dFld -= i1;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i21 = " + i + "," + i1 + "," + i21);
        FuzzerUtils.out.println("i22 f3 l2 = " + i22 + "," + Float.floatToIntBits(f3) + "," + l2);
        FuzzerUtils.out.println("b2 iArr2 lArr2 = " + (b2 ? 1 : 0) + "," + FuzzerUtils.checkSum(iArr2) + "," +
            FuzzerUtils.checkSum(lArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.dFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.byFld lFld = " + Test.byFld + "," + lFld);

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
//DEBUG  dMeth ->  dMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 dMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
