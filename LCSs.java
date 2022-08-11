public class LCSs {
    public static int  LCSs(String a,String b){
        int n=a.length();
        int m=b.length();
        int max=0;
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){

                    if (i == 0 || j == 0) {
                        dp[i][j] = 0;
                    } else  if(a.charAt(i-1)==b.charAt(j-1)) {
                        System.out.println("char at1"+a.charAt(i-1)+" "+"and1"+b.charAt(j-1));
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                        System.out.println(max+" "+dp[i][j]);
                      //  System.out.println(dp[0][3]);
                        max =Integer.max(max,dp[i][j]);
                    }
                }
        }
        return max;
    }
    public static void main(String[] args) {
        String a ="abcdxyz";
        String b="xyzabcd";
        System.out.println(LCSs(a,b));

    }
}
