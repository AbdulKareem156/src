public class MindifferenceTop {
    public static int topmin(int arr[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        boolean arr1[][] = new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++){
            arr1[i][0]=true;
        }
        for (int i=0;i<=sum;i++){
            arr1[0][i]=false;
        }
        for (int i=1;i<=n;i++){
            for (int j=1;j<=sum;j++){
                if(arr[i-1]<=j){
                    arr1[i][j]=arr1[i-1][j-arr[i-1]];
                }
                else {
                    arr1[i][j]=arr1[i-1][j];
                }
            }
        }
        int k=Integer.MAX_VALUE;
        for(int j=sum/2;j>=0;j--){
            if(arr1[n][j]==true){
                System.out.println(n+" "+j);
                k=sum-2*j;
                System.out.println("k value is "+k);
                break;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int arr[]={5,6,1,11};

        int n=arr.length;
        System.out.println(topmin(arr,n));

    }
}
