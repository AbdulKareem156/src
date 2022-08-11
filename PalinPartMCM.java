public class PalinPartMCM {
    public static Boolean ispl(String s,int i,int j){
        while (i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
                i++;
                j--;
        }
        return true;
    }
    public static int Palin(String s,int i,int j){
        if(i>=j||ispl(s,i,j)){
            return 0;
        }
        int as=Integer.MAX_VALUE,count;
        for (int k=i;k<j;k++){
             count=Palin(s,i,k)+Palin(s,k+1,j)+1;
            as=Math.min(as,count);
        }
        return as;
    }
    public static void main(String[] args) {
        String s="geek";
        System.out.println(Palin(s,0,s.length()-1));
    }
}
