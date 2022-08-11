import java.util.Scanner;

public class CheckBored {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sc.close();
        if(s.equals("break")||s.equals("case")||s.equals("continue")||s.equals("default")||s.equals("defer")||s.equals("else")||s.equals("for")||s.equals("func")||s.equals("goto")||s.equals("if")||s.equals("map")||s.equals("range")||s.equals("return")){
            System.out.println(s+" is a keyword");
        }
        else {
            System.out.println(s + " is not a keyword");
        }
    }
}
