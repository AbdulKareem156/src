import java.util.Scanner;

public class TCSpalin {
    public static int reverse(int n){
        int rev=0,rem;
        while (n>0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       if(n==reverse(n)){
           System.out.println("Yes");
       }
       else
        System.out.println("No");
    }
}
