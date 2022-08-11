import java.util.Scanner;

public class Fibsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int c=2;
        int a=1;
        int b=1;
        int x=0;
        int sum=2;
        for(int i=3;i<=9;i++){
            x=a+b;
            //System.out.print(x+" ");
            a=b;
            b=x;
            sum+=x*x;
        }
        System.out.println();
        System.out.println(sum);
    }
}
