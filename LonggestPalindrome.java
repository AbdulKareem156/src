public class LonggestPalindrome {
    public static String reverse(String a){
        String ns=" ";
        char ch;
        for (int i=0;i<a.length();i++){
            ch=a.charAt(i);
            ns=ch+ns;
        }
        return ns;
    }
    public static int LSC1(String a,String b,int n,int m){
        if(n==0||m==0){
            return 0;
        }
        if(a.charAt(n-1)==b.charAt(m-1)){
            return 1+LSC1(a,b,n-1,m-1);
        }
        else {
            return Math.max(LSC1(a,b,n-1,m),LSC1(a,b,n,m-1));
        }
    }
    public static void main(String[] args) {
        String a="agbcba";
        String b=reverse(a);
        int n=a.length();
        int m=b.length();
        int k=LSC1(a,b,n,m);
        System.out.println(k);

    }
}
