import java.util.Scanner;

public class Oddlenpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        if(s.length()%2==0){
            System.out.println("Not possible");
            return;
        }
        for(int i=1;i<=s.length();i++){
            int two=s.length()/2;
            for(int j=1;j<=i;j++){
                System.out.print(s.charAt(two));
                two++;
                if(two==s.length()){
                    two=0;
                }
            }
            System.out.println();
        }
    }
}
