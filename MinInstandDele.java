public class MinInstandDele {
    public static int LSC1(String a, String b, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (a.charAt(n - 1) == b.charAt(m - 1)) {
            return 1 + LSC1(a, b, n - 1, m - 1);
        } else {
            return Math.max(LSC1(a, b, n - 1, m), LSC1(a, b, n, m - 1));
        }
    }

    public static void MIn(String a, String b) {
        int n = a.length();
        int m = b.length();
        int L = LSC1(a, b, n, m);
        int k=n-L;
        int j=m-L;
        System.out.println("Delestion "+k);
        System.out.println("Insertion "+j);
    }

    public static void main(String[] args) {
        String a="heap";
        String b="pea";
         MIn(a,b);

    }
}

