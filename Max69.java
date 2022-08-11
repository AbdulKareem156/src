import java.util.Scanner;
public class Max69 {
    public static int reverse(int a){
        int re,revs=0,c=0;
        while (a>0) {
            re = a % 10;
            if(re==6&&c==0){
                c++;
                re=9;
                revs = revs * 10 + re;
                a = a / 10;
            }
            else {
                revs = revs * 10 + re;
                a = a / 10;}}
        return revs;}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int rem,rev=0;
        while (n>0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;}
        System.out.println(reverse(rev));}}
