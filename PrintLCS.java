import javax.lang.model.type.NullType;

public class PrintLCS {
    public static void  LCSs(String a,String b,int n,int m) {

        int max = 0;
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {

                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        int Ind = dp[n][m];
        int temp = Ind;
        char[] lc=new char[Ind+1];
        lc[Ind]= '\u0000';
        int i=n;
        int j=m;
        while(i>0&&j>0) {
            if (a.charAt(i - 1) == b.charAt(j - 1)) {
                lc[Ind - 1] = a.charAt(i - 1);
                i--;
                j--;
                Ind--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
            for(int k=0;k<temp;k++){
                System.out.print(lc[k]);
            }
        }


    public static void main(String[] args) {
        String a="abdal";
        String b="afdul";
        int n=a.length();
        int m=b.length();
        LCSs(a,b,n,m);
    }
}
