import java.util.Arrays;

public class ScrambleString {
    public static Boolean sram(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        int n=a.length();
        if(n==0){
            return true;
        }
        if(a.equals(b)){
            return true;
        }
        char[] z = a.toCharArray();
        char[] x=b.toCharArray();
        Arrays.sort(z);
        Arrays.sort(x);
        String q=new String(z);
        String w=new String(x);
        if(!q.equals(w)) {
            return false;
        }
        for(int i=1;i<n;i++){
            if(sram(a.substring(0,i),b.substring(0,i))&&sram(a.substring(i,n),b.substring(i,n))){
                return true;
            }
            if(sram(a.substring(n-i,n),b.substring(0,i))&&sram(a.substring(0,n-i),b.substring(i,n))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String a="code";
        String b="coed";
        if(sram(a,b)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
