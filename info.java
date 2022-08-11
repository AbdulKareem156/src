import java.util.Scanner;
 public class info {
    public static int persq(int n) {
        if (n >= 0) {
            int s = (int) Math.sqrt(n);
            if (s * s == n)

                return s;
        }
        return 1;
    }
    public static int samad(int n) {
        int m = 0, g = 0, f = 0, h = 0,ka=0;
        if (persq(n) != 1) {
            m++;
            int j = persq(n);
            int k = j + m;
            return k;
        } else {
            for (int i = 1; i <=5; i++) {
                int count = 0;
                m = 0;
                h = n * i;
                m++;
                if (persq(h) != 1) {
                   int s=persq(h);
                   m++;
                   while (persq(s)!=1&&count<=3){
                       h=persq(s);
                       count++;
                       m++;
                       if(persq(s)==2||persq(s)==3){
                           ka=h+m;
                           return ka;
                       }
                   }
                   if (persq(s)==1&&persq(s)!=2&&persq(s)!=3){
                        ka = s + m;
                        return h;
                    }
                }
            }
        }
            if (persq(n) == 1) {
              return n;
            }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input");
        int z=sc.nextInt();
        int re=samad(z);
        System.out.println("Output-->");
        System.out.println(re);
    }
}
