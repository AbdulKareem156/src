public class LRS {
    public static int LCS(String s1,String s2,int n,int m,int dp[][]){
        if(n==0||m==0){
            return 0;
        }

        if(s1.charAt(n-1)==s2.charAt(m-1)&&n!=m){
            dp[n][m] =1+LCS(s1,s2,n-1,m-1,dp);

        }
        else{
            dp[n][m]=Math.max(LCS(s1,s2,n-1,m,dp),LCS(s1,s2,n,m-1,dp));

        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String s1="AABEBCDD";
        String s2="AABEBCDD";
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }
            }
        }
        System.out.println(LCS(s1,s2,n,m,dp));
    }


}

