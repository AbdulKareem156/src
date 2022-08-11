import java.util.Scanner;

public class productodsingledigit {
    public static Boolean product(int n) {
       for(int i=1;i<10;i++){
           for(int j=2;j<10;j++){
               int k=i*j;
               if(k==n){
                   return true;
               }
           }
       }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
           if( product(n)){
               System.out.println("Yes");
           }
           else {
               System.out.println("No");
           }
    }
}
