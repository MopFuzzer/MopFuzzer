// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:12 2023
public class Test0017 {

    public static final int N = 400;

    public static long instanceCount=7702828983955306534L;
    public static short sFld=26838;
    public static volatile boolean bFld=true;
    public static volatile double dFld=-1.112724;
    public static byte byFld=-71;
    public int[] iArrFld =new int[N];
    public static short[] sArrFld =new short[N];
    public static long[] lArrFld =new long[N];

    static {
        FuzzerUtils.init(Test0017.sArrFld, (short) 24814);
        FuzzerUtils.init(Test0017.lArrFld, 54L);
    }

    public static long lMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i9=-14;
        int i10=-10045;
        int i11=8;
        int i12=-11;
        int i13=-47544;
        int[] iArr =new int[N];
        double d2=1.3299;
        float f1=0.418F;
        long l2=-2703329132L;

        FuzzerUtils.init(iArr, -9);

        for (i9 = 10; i9 < 236; i9 += 2) {
            switch (((i9 % 8) * 5) + 118) {
            case 145:
                d2 -= d2;
                Test0017.instanceCount += Test0017.instanceCount;
                Test0017.lArrFld[i9 + 1] *= i10;
                break;
            case 157:
                Test0017.lArrFld[i9 - 1] = (long) f1;
                for (l2 = 1; 14 > l2; l2++) {
                    for (i12 = 2; 1 < i12; --i12) {
                        if (Test0017.bFld) continue;
                        i10 = (int)l2;
                        d2 %= (i12 | 1);
                        i11 -= (int)d2;
                        i13 -= Test0017.sFld;
                    }
                    i13 += (int)l2;
                    Test0017.instanceCount *= i9;
                }
                break;
            case 137:
                i11 *= (int)f1;
                break;
            case 136:
                i11 = (int)l2;
                break;
            case 126:
                i10 += i10;
            case 148:
                iArr[i9 - 1] <<= (int)l2;
                break;
            case 152:
                i11 -= (int)f1;
                break;
            case 149:
                i11 += (-73 + (i9 * i9));
                break;
            }
        }
        long meth_res = i9 + i10 + Double.doubleToLongBits(d2) + Float.floatToIntBits(f1) + l2 + i11 + i12 + i13 +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth1(long l1) {

        int i8=-50510;
        int i14=-142;
        int i16=-40326;
        int[] iArr1 =new int[N];
        float f2=1.157F;
        long l3=-79L;
        double d3=114.94617;

        FuzzerUtils.init(iArr1, -2);

        i8 >>= Math.max((int) ((Test0017.sFld + -3247958758059104280L) - (i8 - 11)), i8 - iMeth());
        f2 += f2;
        if (Test0017.bFld) {
            for (l3 = 4; l3 < 225; ++l3) {
                d3 = Test0017.dFld;
                if (Test0017.bFld) break;
                f2 = l1;
                i14 -= i14;
            }
            Test0017.lArrFld[(i8 >>> 1) % N] -= (long) f2;
            for (int i15 : iArr1) {
                Test0017.lArrFld[(i8 >>> 1) % N] = i15;
                i16 = 4;
                do {
                    Test0017.byFld += (byte) i16;
                    Test0017.dFld *= -249;
                } while ((i16 -= 2) > 0);
                iArr1[(i16 >>> 1) % N] = i8;
            }
        }
        long meth_res = l1 + i8 + Float.floatToIntBits(f2) + l3 + i14 + Double.doubleToLongBits(d3) + i16 +
            FuzzerUtils.checkSum(iArr1);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static long lMeth(double d1) {

        int i4=-11;
        int i5=180;
        int i6=2;
        int i7=28;
        int i17=-9;
        int[] iArr2 =new int[N];
        float f=-2.45F;
        float f3=0.518F;
        float[] fArr =new float[N];

        FuzzerUtils.init(fArr, -2.217F);
        FuzzerUtils.init(iArr2, 227);

        for (i4 = 13; i4 < 226; i4++) {
            Test0017.instanceCount = (long) 2.650F;
            fArr[i4] -= (Math.abs(f) % ((i4 + (-(i5--))) | 1));
            for (i6 = 8; i6 > 1; --i6) {
                f += fArr[i6];
                i5 -= (int)(lMeth1(13L) * i4);
                for (f3 = 1; f3 < 2; f3++) {
                    i5 = i7;
                    try {
                        iArr2[i6 + 1] = (iArr2[i4] / i5);
                        i7 = (-61 % i6);
                        i5 = (i17 / iArr2[i4]);
                    } catch (ArithmeticException a_e) {}
                    iArr2[i4 + 1] = i7;
                    i5 >>= i7;
                    f = i4;
                    iArr2[i4 - 1] /= (int) (Test0017.instanceCount | 1);
                    i17 = i6;
                    Test0017.bFld = Test0017.bFld;
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + i4 + i5 + Float.floatToIntBits(f) + i6 + i7 +
            Float.floatToIntBits(f3) + i17 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=8, i1=-24846, i2=236, i3=-13;
        double d=87.66242, d4=0.34363;
        long l=-85L;
        float f4=2.31F;
        float[] fArr1 =new float[N];

        FuzzerUtils.init(fArr1, 56.529F);

        for (i = 4; i < 132; i += 2) {
            d = 1;
            while (++d < 391) {
                try {
                    i1 = (1135913003 % i1);
                    i1 = (51626 % i1);
                    iArrFld[i] = (i1 / 3290);
                } catch (ArithmeticException a_e) {}
                i1 += (int) ((-i) * Test0017.instanceCount);
            }
            l = 391;
            do {
                for (i2 = 1; i2 < 2; ++i2) {
                    switch ((int)(((l % 10) * 5) + 22)) {
                    case 24:
                        if ((--i3) > ((Test0017.sArrFld[i - 1] % ((++Test0017.instanceCount) | 1)) >> lMeth(Test0017.dFld)))
                            break;
                        i3 += (int)l;
                        i1 += (i2 * i2);
                        i1 ^= i;
                    case 58:
                    case 72:
                        Test0017.instanceCount += (i2 ^ i);
                        break;
                    case 34:
                        if (Test0017.bFld) continue;
                        i1 += i2;
                        Test0017.instanceCount -= (long) Test0017.dFld;
                    case 39:
                        i1 *= i1;
                        break;
                    case 33:
                        Test0017.instanceCount += (-121 + (i2 * i2));
                        iArrFld = iArrFld;
                        Test0017.instanceCount += i2;
                        i1 = i3;
                        break;
                    case 36:
                        i1 = i;
                        i3 -= (int)2.581F;
                    case 65:
                        Test0017.instanceCount = -7;
                        fArr1[i + 1] = -17873;
                        d4 -= i1;
                    case 26:
                        Test0017.instanceCount = 14;
                    case 59:
                        Test0017.instanceCount += Test0017.instanceCount;
                        Test0017.sFld -= (short) i2;
                        i1 = (int)f4;
                        break;
                    }
                    Test0017.instanceCount += i2;
                }
            } while ((l -= 2) > 0);
        }

        FuzzerUtils.out.println("i i1 d = " + i + "," + i1 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("l i2 i3 = " + l + "," + i2 + "," + i3);
        FuzzerUtils.out.println("d4 f4 fArr1 = " + Double.doubleToLongBits(d4) + "," + Float.floatToIntBits(f4) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));

        FuzzerUtils.out.println("Test0017.instanceCount Test0017.sFld Test0017.bFld = " + Test0017.instanceCount + "," + Test0017.sFld +
                "," + (Test0017.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0017.dFld Test0017.byFld iArrFld = " + Double.doubleToLongBits(Test0017.dFld) + "," +
                Test0017.byFld + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("Test0017.sArrFld Test0017.lArrFld = " + FuzzerUtils.checkSum(Test0017.sArrFld) + "," +
                FuzzerUtils.checkSum(Test0017.lArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0017 _instance = new Test0017();
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 lMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth1 lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
