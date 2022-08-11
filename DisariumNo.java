import java.util.Scanner;
public class DisariumNo {
    public static void a(int n){
        int k=0;
        int i=3;
        int z=n;
            while (n>0){
                int last = n % 10;
                k += (int) Math.pow(last, i);
                i--;
                n = n / 10;
                if (k == z) {
                    System.out.println("true");
                }
            }
            if(k!=z) {
                System.out.println("no");
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        a(n);
    }
}
