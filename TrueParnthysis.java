public class TrueParnthysis {
    public static  int countPar(char a[],char b[],int n){
        int f[][]=new int[n][n];
        int t[][]=new int[n][n];
        for(int i=0;i<n;i++) {
            f[i][i] = (a[i] == 'F') ? 1 : 0;
            t[i][i] = (a[i] == 'T') ? 1 : 0;
        }
            for(int g=1;g<n;++g){
                for(int i=0,j=g;j<n;++i,++j){
                    t[i][j]=f[i][j]=0;
                    for(int gh=0;gh<g;gh++){
                        int k=i+gh;
                        int tik=t[i][k]+f[i][k];
                        int tkj=t[k+1][j]+f[k+1][j];
                        if(b[k]=='&'){
                            t[i][j]+=t[i][k]*t[k+1][j];
                            f[i][j]+=(tik*tkj-t[i][k]*t[k+1][j]);
                        }
                        if(b[k]=='|'){
                            f[i][j]+=f[i][k]*f[k+1][j];
                            t[i][j]+=(tik*tkj-f[i][k]*f[k+1][j]);
                        }
                        if(b[k]=='^'){
                            t[i][j]+=f[i][k]*t[k+1][j]+t[i][k]*f[k+1][j];
                            f[i][j]+=t[i][k]*t[k+1][j]+f[i][k]*f[k+1][j];
                        }
                }
            }
        }
            return t[0][n-1];
    }
    public static void main(String[] args) {
        char a[]="TTFT".toCharArray();
        char b[]="|&^".toCharArray();
        int n=a.length;
        System.out.println(countPar(a,b,n));
    }
}
