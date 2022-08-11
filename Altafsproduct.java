import java.util.Scanner;

public class Altafsproduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        }
        sc.close();
        int sum1=0,sum2=0;
        for(int j=0;j<n;j++){
            sum1+=a[j++];
            sum2+=a[j];
        }
        System.out.println(sum1-sum2);
    }
}
