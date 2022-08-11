import java.util.Scanner;

public class PerfectSq {
    public static Boolean a(int n){
        int s=(int)Math.sqrt(n);
        if(s*s==n){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(a(n+1)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
