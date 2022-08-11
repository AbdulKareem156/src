import java.util.Scanner;

public class StringArr {
    public static boolean check(char j){
     if(j=='a'||j=='e'||j=='i'||j=='o'||j=='u'||j=='A'||j=='E'||j=='I'||j=='O'||j=='U') {
         return true;
     }
     return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String s3=sc.next();
        String a="";
        String b="";
        for (int i=0;i<s1.length();i++){
            if(check(s1.charAt(i))){
                a=a+'"';
            }
            else
                a=a+s1.charAt(i);
        }
        for (int i=0;i<s2.length();i++){
            if(!check(s2.charAt(i))){
                b=b+'*';
            }
            else
                b=b+s2.charAt(i);
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(s3.toUpperCase());
    }
}
