import java.util.*;
public class Symentric {
    public static void sym(int [][]a,int n){
         for (int i=0;i<n;i++){
             for(int j=i+1;j<n;j++){
                 if(a[i][0]==a[j][1]&&a[i][1]==a[j][0]){
                     System.out.println("("+a[i][0]+","+a[i][1]+")");
                 }
             }
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int a[][]=new int[n][d];
        for(int i=0;i<n;i++){
            for(int j=0;j<d;j++){
                a[i][j]=sc.nextInt();
        }
        }
        System.out.println("The grand two d array");
        for(int i=0;i<n;i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(a[i][j]+" ");
            }
        }
        System.out.println();
       sym(a,n);
    }
}
