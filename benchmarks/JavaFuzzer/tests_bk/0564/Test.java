// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:07 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-58147L;
    public static int iFld=-1;
    public static boolean bFld=true;

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i14=27150, i15=37, i16=13504, iArr1[]=new int[N];
        boolean b=false, bArr[][]=new boolean[N][N];
        float f3=-44.313F;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 56L);
        FuzzerUtils.init(iArr1, -134);
        FuzzerUtils.init(bArr, false);

        for (i14 = 280; i14 > 9; i14 -= 2) {
            short s2=-5890;
            i15 = (int)Test.instanceCount;
            s2 = (short)i15;
            lArr1[i14 - 1] *= i14;
            i15 -= 211;
            Test.iFld = Test.iFld;
            b = b;
            if (b) {
                iArr1[i14 - 1] = i14;
            } else if (b) {
                b = b;
                for (f3 = 1; f3 < 12; f3++) {
                    bArr[i14][i14] = false;
                    Test.iFld *= (int)46.240F;
                }
                Test.instanceCount |= -196;
            } else {
                i15 = i14;
            }
        }
        vMeth_check_sum += i14 + i15 + (b ? 1 : 0) + Float.floatToIntBits(f3) + i16 + FuzzerUtils.checkSum(lArr1) +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(bArr);
    }

    public static int iMeth1(float f2, int i9) {

        short s1=14009;
        int i10=20532, i11=199, i12=-45694, i13=102, i17=49999, i18=-11, iArr[]=new int[N];
        boolean b1=false;

        FuzzerUtils.init(iArr, 3);

        i9 *= (int)(((Test.instanceCount % (s1 | 1)) + Test.instanceCount) - (-1.51932 + (-28 - (i9 + i9))));
        i9 -= (-((i9 * i9) + iArr[(12 >>> 1) % N]));
        for (i10 = 2; i10 < 369; ++i10) {
            if (Test.iFld != 0) {
            }
            iArr = (iArr = iArr);
            for (i12 = 1; i12 < 5; ++i12) {
                iArr[i12 - 1] = iArr[i10];
                i11 |= (int)Test.instanceCount;
                vMeth();
                for (i17 = 1; 2 > i17; ++i17) {
                    i18 = i18;
                    i9 = i12;
                    i9 = i11;
                }
                f2 += (((i12 * i11) + Test.instanceCount) - i10);
                b1 = b1;
            }
        }
        long meth_res = Float.floatToIntBits(f2) + i9 + s1 + i10 + i11 + i12 + i13 + i17 + i18 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i5) {

        int i6=11, i7=-6, i8=12;
        float f1=1.256F;
        short s=-8070;

        for (i6 = 218; 6 < i6; i6--) {
            for (f1 = 1; f1 < 8; f1++) {
                i5 >>>= (--s);
                i7 += (int)((long)f1 | i8);
                i5 = (int)(i6 - ((i8 - Test.instanceCount) - iMeth1(f1, i5)));
            }
            i8 += (i6 * i6);
        }
        Test.bFld = true;
        long meth_res = i5 + i6 + i7 + Float.floatToIntBits(f1) + i8 + s;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-11, i1=248, i2=-130, i3=132, i4=0, i19=-4, iArr2[]=new int[N];
        float f=0.173F, fArr[]=new float[N];
        double d=0.115193, dArr[]=new double[N];
        long lArr[]=new long[N];
        short sArr[][]=new short[N][N];

        FuzzerUtils.init(lArr, 33L);
        FuzzerUtils.init(dArr, 10.55);
        FuzzerUtils.init(iArr2, 10);
        FuzzerUtils.init(fArr, 18.501F);
        FuzzerUtils.init(sArr, (short)14363);

        for (i = 6; i < 139; ++i) {
            lArr[i] = 3643662777L;
            Test.instanceCount -= (long)(((i - Test.instanceCount) - 10) + f);
            i1 += Integer.reverseBytes((int)(-(f + i)));
            dArr[i] = (((-(i1 + 41982)) + (Test.instanceCount - -189)) - (Test.instanceCount--));
            Test.instanceCount = Test.instanceCount;
            i2 = 1;
            do {
                if (Test.bFld) {
                    for (i3 = 1; i3 < 1; ++i3) {
                        short s3=-28233;
                        switch ((((++i1) >>> 1) % 6) + 22) {
                        case 22:
                            i4 = (i2 * iMeth(i3));
                            break;
                        case 23:
                        case 24:
                            i19 += i3;
                            i19 -= (int)Test.instanceCount;
                            iArr2[i3] += Test.iFld;
                            i19 += (i3 * i3);
                            break;
                        case 25:
                            fArr[i3 + 1] *= (float)d;
                            break;
                        case 26:
                            Test.iFld += (((i3 * i19) + i19) - i);
                            Test.iFld %= (int)(i | 1);
                            Test.instanceCount %= 10;
                            Test.iFld = i1;
                            break;
                        case 27:
                            iArr2[i3 - 1] += Test.iFld;
                            break;
                        default:
                            lArr[i3] = i2;
                            if (Test.bFld) break;
                            f = Test.instanceCount;
                        }
                        s3 = (short)Test.instanceCount;
                        i4 *= -5;
                        i19 += (int)Test.instanceCount;
                        i4 = (int)1.572F;
                        sArr[i3][i2 - 1] <<= (short)i19;
                    }
                    i19 += (i2 * i2);
                } else if (false) {
                    i1 -= 46835;
                } else {
                    i1 = i;
                }
            } while (++i2 < 188);
        }

        FuzzerUtils.out.println("i i1 f = " + i + "," + i1 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i2 i3 i4 = " + i2 + "," + i3 + "," + i4);
        FuzzerUtils.out.println("i19 d lArr = " + i19 + "," + Double.doubleToLongBits(d) + "," +
            FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("dArr iArr2 fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + "," +
            FuzzerUtils.checkSum(iArr2) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.bFld = " + Test.instanceCount + "," + Test.iFld +
            "," + (Test.bFld ? 1 : 0));

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