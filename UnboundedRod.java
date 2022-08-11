public class UnboundedRod {
    public static  int  top1(int value[],int weight[],int capacity,int n){
        int dp[][]=new int[n+1][capacity+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<capacity+1;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }
            }
        }
        for(int i=1;i<n+1;i++) {
            for (int j = 1; j < capacity + 1; j++) {
                if (weight[i - 1] <= j) {
                    dp[i][j] = Math.max(value[i - 1] + dp[i][j - weight[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][capacity];
    }
    public static void main(String[] args) {
        int value[]={1,5,8,9,10,17,17,20};
        int weight[]={1,2,3,4,5,6,7,8};
        int capacity=8;
        int n=weight.length;
        System.out.println(top1(value,weight,capacity,n));

    }
}
