// Generated by Java* Fuzzer test generator (1.0.001). Mon Jul  3 17:53:06 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=2511130537370931774L;
    public static float fFld=-1.347F;
    public float fArrFld[]=new float[N];

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i6=3;

        i6 = i6;
        vMeth_check_sum += i6;
    }

    public static int iMeth1(long l, float f, long l1) {


        vMeth();
        long meth_res = l + Float.floatToIntBits(f) + l1;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        int i2=-3, i3=80, i4=12, i5=3, i7=-14, i8=-44490, i9=26;
        boolean b=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -3583241093374039987L);

        for (i2 = 9; 254 > i2; i2 += 3) {
            for (i4 = 1; 19 > i4; ++i4) {
                i5 += ((i5 - i2) % ((iMeth1(Test.instanceCount, 60.684F, Test.instanceCount) - i3) | 1));
                i3 += (i4 * i4);
                i5 |= (int)Test.instanceCount;
                i7 = 1;
                do {
                    i3 -= i5;
                    lArr[i4 + 1] -= 455730895L;
                    i3 *= i5;
                    i5 += (((i7 * i5) + Test.fFld) - i5);
                } while (++i7 < 2);
                for (i8 = 1; i8 < 2; ++i8) {
                    i3 = i3;
                    i5 -= (int)1.967F;
                    if (b) break;
                    Test.instanceCount = i7;
                }
            }
        }
        long meth_res = i2 + i3 + i4 + i5 + i7 + i8 + i9 + (b ? 1 : 0) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=75, i1=-234, i10=-54205, i11=-205, i12=5, i13=98, i14=-241, i15=-74, i16=-8, i17=83, iArr[]=new int[N];
        byte by=-62;
        double d=66.41813;
        short s=-29934;

        FuzzerUtils.init(iArr, 53520);

        for (i = 172; i > 7; i -= 2) {
            Test.instanceCount >>= (i1 + iArr[i + 1]);
            i1 *= (i1++);
            i1 -= Integer.reverseBytes(iMeth());
            for (i10 = 11; i10 < 305; ++i10) {
                for (i12 = 2; i12 > 1; i12 -= 2) {
                    iArr[i12] -= by;
                    Test.instanceCount = (long)d;
                    s += (short)(((i12 * i1) + i10) - i12);
                    i13 = s;
                    i1 += i1;
                    Test.instanceCount -= i13;
                    fArrFld[i10] = Test.instanceCount;
                }
                iArr = FuzzerUtils.int1array(N, (int)12);
                for (i14 = 1; i14 < 2; ++i14) {
                    i13 += (((i14 * i11) + Test.fFld) - i15);
                }
                for (i16 = 1; 2 > i16; ++i16) {
                    i11 += (i16 * i15);
                    switch ((i % 1) + 81) {
                    case 81:
                        Test.instanceCount = Test.instanceCount;
                        i15 = (int)Test.instanceCount;
                        i15 *= (int)d;
                        i15 <<= i15;
                        break;
                    }
                    i11 &= (int)Test.instanceCount;
                    Test.fFld += i1;
                    Test.instanceCount += (long)d;
                    i11 = i15;
                    i13 = (int)Test.instanceCount;
                    Test.instanceCount += (long)Test.fFld;
                }
                i1 = (int)Test.instanceCount;
            }
        }

        FuzzerUtils.out.println("i i1 i10 = " + i + "," + i1 + "," + i10);
        FuzzerUtils.out.println("i11 i12 i13 = " + i11 + "," + i12 + "," + i13);
        FuzzerUtils.out.println("by d s = " + by + "," + Double.doubleToLongBits(d) + "," + s);
        FuzzerUtils.out.println("i14 i15 i16 = " + i14 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("i17 iArr = " + i17 + "," + FuzzerUtils.checkSum(iArr));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld fArrFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

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