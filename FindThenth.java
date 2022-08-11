import java.util.Scanner;

public class FindThenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        int j=0;
        int count=3;
        int k=0;
        if(n==0||n==1){
            System.out.println(0);
        }
            for (i = 2; i <11; i++) {
                k = k + 2;
                if(n==count){
                    System.out.println(k);
                }
                count++;
                j = k / 2;
                if(n==count){
                    System.out.println(j);
                }
                count++;
            }
        }
    }
