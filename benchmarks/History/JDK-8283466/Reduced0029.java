class Reduced0029 {
    volatile int a;
    int[] b;
    float[] c;
    void e() {
        int g, f, i;
        for (g = 2;; g++) {
            for (i = g; i < 1; i++) {
                f = a;
                c[i - 1] -= b[i];
            }
	}
    }
    public static void main(String[] args) {
        try {
            Reduced0029 j = new Reduced0029();
            j.e();
        } catch (Exception ex) {}
    }
}
