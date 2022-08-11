import java.util.Scanner;

public class NextPreSquare {
    public static Boolean  Square(int n){
            int s=(int)Math.sqrt(n);
            if(s*s==n){
                return true;
            }
            return false;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
       while (!Square(n)) {
           n++;
       }
       if(Square(n)){
           System.out.println(n);
       }

    }
}
