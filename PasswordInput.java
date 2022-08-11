import java.util.Scanner;

public class PasswordInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st input");
        int x1=sc.nextInt();
        System.out.println("Enter the 2st input");
        int x2 =sc.nextInt();
        System.out.println("Enter the 3st input");
        int x3 =sc.nextInt();


        System.out.println("Enter the 4st input");
        int x4 =sc.nextInt();
        int a2=0;
        int a1 = 0;
        int a3=0;
        if(x4%2==0){
            while(x1!=0){

                int k=x1%10;
                if(k%2==0) {
                   a1+=k;

                }
                x1 = x1 / 10;

            }

            while(x2!=0){

                int j=x2%10;
                if(j%2==0) {
                    a2+=j;

                }
                x2 = x2 / 10;

            }

            while(x3!=0){

                int o=x3%10;
                if(o%2==0) {
                    a3+=o;

                }
                x3 = x3 / 10;

            }

        }
        else{
            while(x1!=0){

                int k=x1%10;
                if(k%2!=0) {
                    a1+=k;

                }
                x1 = x1 / 10;

            }

            while(x2!=0){

                int j=x2%10;
                if(j%2!=0) {
                    a2+=j;

                }
                x2 = x2 / 10;

            }

            while(x3!=0){

                int o=x3%10;
                if(o%2!=0) {
                    a3+=o;
                }
                x3 = x3 / 10;

            }

        }
       int h= a1+a2+a3;
        System.out.println(h);
       // System.out.println(as);
    }

}
