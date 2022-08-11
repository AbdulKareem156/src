import java.util.Scanner;

public class ProductofSingle {
    public static Boolean s(int n){

        for(int i=1;i<10;i++){
            for(int j=2;j<10;j++){
                if(i*j==n){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Boolean s=false;
        int n=sc.nextInt();
        if(s(n)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
