import java.util.Scanner;

public class TCsRottateArray {
    public static void rotaote(int arr[],int n,int k){
        if(k>n){
            k=k%n;
        }
        int ans[]= new int[n];
        for(int i=0;i<k;i++){
             ans[i]=arr[n-k+i];

        }
        int Ind=0;
        for (int i=k;i<n;i++){
            ans[i]=arr[Ind++];
        }
        for (int y=0;y<n;y++){
            System.out.print(ans[y]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
             a[i]=sc.nextInt();
        }
        int k= sc.nextInt();
        rotaote(a,n,k);
}
}
