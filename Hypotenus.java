import java.util.*;
public class Hypotenus {
    public static int xpower(int x ,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int sz=xpower(x,n-1);
        // System.out.println(x);
       // System.out.println(sz+" "+n);
        int sx=sz*x;
        //int sy=sz*y;


       // System.out.println(sx);
        return sx;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y =sc.nextInt();
        double total=xpower(x,n)+xpower(y,n);
        double k=Math.sqrt(total);
        System.out.println(k);
        //System.out.println(xpower(5,2));
    }
}
