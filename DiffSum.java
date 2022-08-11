import java.util.Scanner;

public class DiffSum {
    public static int rever(int n){
        int g=0,r;
        while (n!=0) {
            r = n % 10;
            g = g * 10 + r;
            n = n / 10;
        }
        return g;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        //int k=rever(n);
        String  j=String.valueOf(n);
        //char [] m=new char[j.length()];
         char[] m=j.toCharArray();
        int sum1=0,sum2=0;
        for (int i=0;i<m.length;i++){
            if(i%2!=0)
             sum1+=Character.getNumericValue(m[i]);
             else
                 sum2+=Character.getNumericValue(m[i]);
        }
        System.out.println(Math.abs(sum1-sum2));
    }
}
