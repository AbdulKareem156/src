import java.util.Scanner;

public class CheckFactofnum {
    public static int fac(int n){
        if(n==0){
            return 1;
        }
        return n*fac(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=fac(n);
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i*i;
        }
        if(k%sum==0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
