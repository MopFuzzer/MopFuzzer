// Generated by Java* Fuzzer test generator (1.0.001). Fri Dec  8 09:12:23 2023
public class Test0247 {

    public static final int N = 400;

    public static long instanceCount=46890L;
    public static volatile float fFld=2.581F;
    public static int iFld=-30536;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i5) {

        int i6=149, i7=1663, i8=-191, i9=28270, i10=-206, i11=-14;
        float f=0.976F;
        byte by=-45;
        double d=-1.128747;
        boolean b1=true;

        i5 = i5;
        i5 += i5;
        for (i6 = 218; 1 < i6; --i6) {
            if (b1) {
                i8 = 1;
                do {
                    i7 += (((i8 * i8) + i5) - f);
                    switch ((i6 % 1) + 28) {
                    case 28:
                        i7 <<= -10;
                        i9 -= i8;
                        for (i10 = 1; i10 < 1; ++i10) {
                            by += (byte)(((i10 * f) + i6) - i6);
                        }
                        i5 = (int)f;
                        break;
                    }
                    d = 1;
                    while (++d < 1) {
                        i11 += (-8958 + (d * d));
                        i5 -= (int)48527L;
                    }
                } while (++i8 < 7);
            } else {
                i9 = -162;
            }
        }
        vMeth2_check_sum += i5 + i6 + i7 + i8 + Float.floatToIntBits(f) + i9 + i10 + i11 + by +
            Double.doubleToLongBits(d) + (b1 ? 1 : 0);
    }

    public static void vMeth1(long l, int i4, long l1) {

        int i12=25652;
        int i13=-12;
        int[] iArr =new int[N];
        boolean b2=true, b3=true;
        short s=-10652;

        FuzzerUtils.init(iArr, -195);

        i4 %= (int)((--l) | 1);
        vMeth2(i4);
        for (i12 = 8; i12 < 191; i12++) {
            iArr[i12 + 1] = i12;
            l1 += i12;
            iArr[i12] <<= 25469;
            b2 = b3;
            Test0247.fFld += i12;
            s -= (short)i12;
        }
        vMeth1_check_sum += l + i4 + l1 + i12 + i13 + (b2 ? 1 : 0) + (b3 ? 1 : 0) + s + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth() {

        int i=-1022;
        int i1=-8;
        int i2=-61963;
        int i3=135;
        int i14=12;
        int[] iArr1 =new int[N];
        short s1=26558;
        double d1=24.60965;
        long l2=14L;

        FuzzerUtils.init(iArr1, -1);

        for (i = 6; 316 > i; ++i) {
            boolean b=false;
            b = b;
            for (i2 = 1; i2 < 5; i2++) {
                vMeth1(Test0247.instanceCount, i2, Test0247.instanceCount);
                s1 -= (short) Test0247.fFld;
                i1 += (int)d1;
                i1 += (int) Test0247.instanceCount;
                i1 *= (int) Test0247.instanceCount;
                i3 += i2;
            }
            i1 <<= (int)0L;
            i3 = (int) Test0247.instanceCount;
            iArr1[i + 1] += (int)4156685701272226677L;
            for (l2 = 5; l2 > 1; --l2) {
                iArr1 = iArr1;
                if (false) break;
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + s1 + Double.doubleToLongBits(d1) + l2 + i14 + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {


        vMeth();
        Test0247.iFld = Test0247.iFld;


        FuzzerUtils.out.println("Test0247.instanceCount Test0247.fFld Test0247.iFld = " + Test0247.instanceCount + "," +
                Float.floatToIntBits(Test0247.fFld) + "," + Test0247.iFld);

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test0247 _instance = new Test0247();
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
