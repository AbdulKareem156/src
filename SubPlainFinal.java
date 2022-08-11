import java.util.Scanner;

public class SubPlainFinal {
    public static String n1(String s){
        if(s==null||s.isEmpty()){
            return null;
        }
        String lonn=s.substring(0,1);
        for (int i=0;i<s.length()-1;i++){
            String palin=n2(s,i,i);
            if(palin.length()>lonn.length()){
                lonn=palin;
            }
            palin=n2(s,i,i+1);
            if(palin.length()>lonn.length()){
                lonn=palin;
            }
        }
        return lonn;
    }
    public static String n2(String s,int left,int right){
        if(left>right){
            return null;
        }
        while (left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        System.out.println(n1(s1));
    }
}
