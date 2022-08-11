public class TopDownKS {
    public static  int  top(int value[],int weight[],int capacity,int n){
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
                    dp[i][j] = Math.max(value[i - 1] + dp[i - 1][j - weight[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][capacity];
    }
    public static void main(String[] args) {
        int value[]={60,100,120,200};
        int weight[]={10,20,30,40};
        int capacity=30;
        int n=weight.length;
        //int dp[][]=new int[n+1][capacity+1];

        System.out.println(top(value,weight,capacity,n));

    }
}
