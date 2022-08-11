public class CoinChangeMin {
public static int mincoin(int coin[],int sum,int n){
    int dp[][]=new int[n+1][sum+1];
    for(int i=0;i<=sum;i++){
        dp[0][i]=Integer.MAX_VALUE-1;
    }
    for(int i=0;i<=n;i++){
        dp[i][0]=0;
    }
    int i=1;
    for(int j=1;j<=sum+1;j++){
        if(j%coin[0]==0){
            dp[i][j]=j/coin[0];
        }
        else {
            dp[i][j]=Integer.MAX_VALUE-1;
        }
    }

    for(i=1;i<n+1;i++) {
        for (int j = 0; j <sum + 1; j++) {
            if(coin[i-1]<=j){
                dp[i][j]=Math.min(dp[i][j-coin[i-1]]+1,dp[i-1][j]);

            }
            else {
                dp[i][j]=dp[i-1][j];
            }
        }
    }
    return dp[n][sum];
}
     public static void main(String[] args) {
    int arr[]={1,2,3};
    int sum=5;
    int n= args.length;
        System.out.println(mincoin(arr,sum,n));



    }
}
