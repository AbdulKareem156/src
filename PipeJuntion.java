import java.util.Scanner;

public class PipeJuntion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int r=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        int sum=0,sum1=0;
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int j=0;j<m;j++){
            b[j]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            a[i]=a[i]-r;
            sum+=a[i];
        }
        for(int j=0;j<m;j++){
            b[j]=b[j]-r;
            sum1+=b[j];
        }
        int t;
        if(sum!=sum1){
            int k=sum-sum1;
            t=Math.abs(k);
            System.out.println(t+r);
        }

    }
}
