public class CountSumSubSet {
    public static int  Count(int weight[],int sum,int n){
        int dp[][]=new int[n+1][sum+1];

        dp[0][0]=1;
        for(int i=1;i<n+1;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<n+1;i++) {
            for (int j = 0; j <sum + 1; j++) {
                if(weight[i-1]<=j){
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-weight[i-1]];

                }
                else {
                    dp[i][j]=dp[i-1][j];
                }
            }
    }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int weight[]={2,3,5,6,8,10};
        int sum=10;
        int n=weight.length;
        System.out.println(Count(weight,sum,n));

    }
}
