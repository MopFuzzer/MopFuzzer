// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:12 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=172L;
    public static volatile float fFld=122.966F;
    public static byte byFld=127;
    public static short sFld=-6559;
    public static boolean bFld=false;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(int i2) {

        int i3=-93, i4=14, i5=-190, i6=8, i7=-8;
        double d=127.129935;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -21.669F);

        for (i3 = 3; i3 < 178; i3++) {
            switch (((i3 % 2) * 5) + 127) {
            case 133:
                Test.fFld = i2;
                fArr[i3] = Test.fFld;
                break;
            case 134:
                i4 *= Test.byFld;
                i2 = (int)Test.instanceCount;
                Test.sFld -= (short)62L;
                for (i5 = 1; 9 > i5; i5++) {
                    i2 *= Test.sFld;
                    i2 = i3;
                    d += i6;
                    i7 = 1;
                    do {
                        if (Test.bFld) continue;
                        i6 += (-41396 + (i7 * i7));
                        i2 += (((i7 * i2) + i2) - Test.fFld);
                    } while (++i7 < 2);
                }
                break;
            }
        }
        long meth_res = i2 + i3 + i4 + i5 + i6 + Double.doubleToLongBits(d) + i7 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth1() {

        int i1=7, i8=64614, i9=9, i10=60814, i11=41357, i12=5, iArr1[]=new int[N];
        double d1=71.11600;

        FuzzerUtils.init(iArr1, -206);

        i1 *= (int)(Math.min((int)(-1.223F * i1), i1 &= -52823) * fMeth(i1));
        i8 = 1;
        do {
            iArr1[i8 + 1] <<= 61053;
            i1 += (((i8 * Test.instanceCount) + i8) - Test.fFld);
            Test.fFld += i8;
            iArr1[i8 + 1] = (int)d1;
            for (i9 = i8; i9 < 8; ++i9) {
                Test.instanceCount |= 122;
                try {
                    iArr1[i8 + 1] = (i8 / i9);
                    i10 = (31994 % iArr1[i9]);
                    i10 = (-50075 % i8);
                } catch (ArithmeticException a_e) {}
                i1 -= (int)Test.instanceCount;
                for (i11 = 1; i11 > 1; i11 -= 3) {
                    d1 = i8;
                    i1 = i11;
                    try {
                        i1 = (i11 % 1727879017);
                        i10 = (-8 % i11);
                        i1 = (-17570 / i12);
                    } catch (ArithmeticException a_e) {}
                    i1 = (int)Test.instanceCount;
                }
            }
        } while (++i8 < 207);
        vMeth1_check_sum += i1 + i8 + Double.doubleToLongBits(d1) + i9 + i10 + i11 + i12 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(long l) {

        int i=-201, i14=13, i15=-106, i16=-17860, i17=-10, iArr[]=new int[N];
        long l1=-10L;
        double d2=-2.128751;

        FuzzerUtils.init(iArr, -33976);

        iArr[(-17177 >>> 1) % N] -= i;
        vMeth1();
        for (int i13 : iArr) {
            for (i14 = 1; i14 < 4; ++i14) {
                i15 += (i14 * i15);
                iArr[i14 + 1] += i13;
                iArr[i14] += i14;
                l1 -= (long)d2;
                i13 += (int)l;
                i15 += (int)-6L;
                i15 += i14;
            }
            for (i16 = 1; 4 > i16; ++i16) {
                if (i17 != 0) {
                    vMeth_check_sum += l + i + i14 + i15 + l1 + Double.doubleToLongBits(d2) + i16 + i17 +
                        FuzzerUtils.checkSum(iArr);
                    return;
                }
                i15 *= (int)Test.instanceCount;
                l1 -= l;
            }
        }
        vMeth_check_sum += l + i + i14 + i15 + l1 + Double.doubleToLongBits(d2) + i16 + i17 +
            FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {


        vMeth(Test.instanceCount);


        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.byFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.sFld Test.bFld = " + Test.sFld + "," + (Test.bFld ? 1 : 0));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
