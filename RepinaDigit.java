import java.util.Scanner;

public class RepinaDigit {
    public static int rep(int a,int b){
        int y=0;
        for(int i=a;i<=b;i++){
           if(!rem(i)){
               y++;
           }
        }
        return y;
    }
    public static boolean rem(int n){
        int h[]=new int[10];
        int r;
        while (n>0){
            r=n%10;
            h[r]++;
            n=n/10;
        }
        for (int i=0;i<10;i++){
            if(h[i]>1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(rep(n1,n2));
    }
}
