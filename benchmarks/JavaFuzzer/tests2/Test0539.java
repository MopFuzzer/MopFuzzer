// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:37 2023
public class Test0539 {

    public static final int N = 400;

    public static long instanceCount=7L;
    public static short sFld=9323;
    public static boolean bFld=false;
    public static float fFld=1.176F;
    public int[] iArrFld =new int[N];

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public void vMeth(int i1, long l, int i2) {


        iArrFld[(i1 >>> 1) % N] -= (i1 - ((i2 + 7) - (i1++)));
        vMeth_check_sum += i1 + l + i2;
    }

    public static double dMeth() {

        float f=-1.189F;
        double d=-44.7022;
        int i5=10;
        int i6=33492;
        int i7=-1517;
        int[] iArr =new int[N];
        int[] iArr1 =new int[N];
        boolean b=false;

        FuzzerUtils.init(iArr, 0);
        FuzzerUtils.init(iArr1, -63159);

        if (b) {
            f += (float)d;
            iArr[(i5 >>> 1) % N] += i5;
            d += f;
        } else {
            i6 = 1;
            do {
                i7 = 7;
                while (--i7 > 0) {
                    i5 = (int)12750L;
                    Test0539.instanceCount = i5;
                    switch ((i6 % 10) + 44) {
                    case 44:
                        i5 = (int) Test0539.instanceCount;
                        Test0539.instanceCount += (i7 * i7);
                        break;
                    case 45:
                        i5 += i7;
                        break;
                    case 46:
                        try {
                            i5 = (-40553 % i7);
                            iArr[i6 - 1] = (-205703188 / i6);
                            i5 = (1105117948 / i6);
                        } catch (ArithmeticException a_e) {}
                    case 47:
                        Test0539.instanceCount <<= i7;
                        if (b) break;
                        break;
                    case 48:
                        Test0539.instanceCount >>>= i5;
                        break;
                    case 49:
                        Test0539.instanceCount >>= 0L;
                        break;
                    case 50:
                        try {
                            i5 = (i6 / -159);
                            i5 = (i6 / i6);
                            i5 = (iArr1[i6] % 244);
                        } catch (ArithmeticException a_e) {}
                        break;
                    case 51:
                        iArr1 = FuzzerUtils.int1array(N, (int)-22639);
                    case 52:
                        f -= f;
                        break;
                    case 53:
                        i5 >>= i5;
                        break;
                    default:
                        Test0539.instanceCount <<= i6;
                    }
                }
            } while (++i6 < 249);
        }
        long meth_res = Float.floatToIntBits(f) + Double.doubleToLongBits(d) + i5 + (b ? 1 : 0) + i6 + i7 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth1(short s) {

        int i8=33912;
        int i9=189;
        int i10=5;
        int i11=61728;
        int i12=59452;
        int i13=213;
        int i14=22920;
        int[] iArr2 =new int[N];
        boolean b1=false;
        float f1=-1.64F, f2=0.58F;
        double d1=16.125939;

        FuzzerUtils.init(iArr2, 59015);

        Test0539.instanceCount |= (long) (Math.sqrt(dMeth()) - 2.101738);
        i8 = i8;
        b1 = b1;
        for (i9 = 3; i9 < 232; i9++) {
            i8 += s;
            i8 &= i10;
            f1 = f1;
            d1 = -56;
            i8 += (int)f2;
        }
        d1 *= i8;
        for (i11 = 10; i11 < 230; i11++) {
            for (i13 = 1; i13 < 7; i13++) {
                iArr2[i11] += i14;
                i12 >>= 122;
                i14 -= -1;
            }
        }
        vMeth1_check_sum += s + i8 + (b1 ? 1 : 0) + i9 + i10 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d1) +
            Float.floatToIntBits(f2) + i11 + i12 + i13 + i14 + FuzzerUtils.checkSum(iArr2);
    }

    public static int iMeth() {

        int i3=12, i4=-113;

        for (i3 = 1; i3 < 348; i3++) {
            vMeth1(Test0539.sFld);
            i4 = (int)194L;
        }
        long meth_res = i3 + i4;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=6, i15=-9, i16=104, i17=-115, i18=17;
        long l1=1095914614L, l2=-1885509570763233104L;
        byte by=-64;

        i = 1;
        while (++i < 228) {
            switch ((((i >>> 1) % 6) * 5) + 20) {
            case 29:
                if (Test0539.bFld) {
                    vMeth(-(iMeth() * i), Test0539.instanceCount, i);
                } else {
                    i15 = (int) Test0539.instanceCount;
                    try {
                        i15 = (-2070877798 % i);
                        i15 = (i15 / 37);
                        i15 = (19120 % i15);
                    } catch (ArithmeticException a_e) {}
                }
                i16 = 1;
                do {
                    iArrFld[i + 1] *= i15;
                    i17 = 1;
                    while (++i17 < 1) {
                        i15 = i;
                        try {
                            i15 = (iArrFld[i + 1] % 123);
                            i15 = (i15 % i16);
                            i15 = (i17 % -200);
                        } catch (ArithmeticException a_e) {}
                        Test0539.fFld = -5828033302958271319L;
                        switch ((i17 % 1) + 125) {
                        case 125:
                            iArrFld[i - 1] += i15;
                            if (false) continue;
                            iArrFld[i16 + 1] -= -53150;
                            break;
                        }
                        try {
                            i15 = (iArrFld[i] % i);
                            iArrFld[i16 - 1] = (i17 / 217);
                            i15 = (20310 / i);
                        } catch (ArithmeticException a_e) {}
                        Test0539.instanceCount += 6466;
                        Test0539.instanceCount = i16;
                    }
                    l1 += (i16 * i16);
                    l1 += (i16 * i16);
                    for (l2 = 1; l2 < 1; ++l2) {
                        switch ((int)((l2 % 5) + 94)) {
                        case 94:
                            l1 *= Test0539.sFld;
                            i15 *= i18;
                            l1 += (((l2 * i15) + i16) - i16);
                            break;
                        case 95:
                            i15 = (int) Test0539.fFld;
                            break;
                        case 96:
                            i18 *= i16;
                            break;
                        case 97:
                            iArrFld[(int)(l2)] += -5369;
                            break;
                        case 98:
                            Test0539.bFld = true;
                            break;
                        default:
                            l1 -= Test0539.sFld;
                        }
                    }
                } while (++i16 < 110);
                break;
            case 34:
                i18 = i16;
                break;
            case 31:
                if (Test0539.bFld) continue;
                break;
            case 27:
                i15 += i15;
            case 45:
                by -= (byte)i18;
                break;
            case 22:
                i18 = i16;
                break;
            }
        }

        FuzzerUtils.out.println("i i15 i16 = " + i + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 l1 l2 = " + i17 + "," + l1 + "," + l2);
        FuzzerUtils.out.println("i18 by = " + i18 + "," + by);

        FuzzerUtils.out.println("Test0539.instanceCount Test0539.sFld Test0539.bFld = " + Test0539.instanceCount + "," + Test0539.sFld +
                "," + (Test0539.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test0539.fFld iArrFld = " + Float.floatToIntBits(Test0539.fFld) + "," +
            FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0539 _instance = new Test0539();
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
//DEBUG  vMeth1 ->  vMeth1 iMeth mainTest
//DEBUG  dMeth ->  dMeth vMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
