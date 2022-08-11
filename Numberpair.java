import java.util.Scanner;

public class Numberpair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int sum=0,c=0;
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                sum=a[i]-a[j];
                if(Math.abs(sum)==k){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
