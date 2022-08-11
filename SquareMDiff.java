import java.util.Scanner;

public class SquareMDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=n;
        int a[][]=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        /*
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
        }
        System.out.println();
         */
        int s1=0,s2=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++) {
                if (i == j) {
                    s1+=a[i][j];
                   // System.out.print(a[i][j]+" ");
                }
            }
        }
       // System.out.println("s1"+s1);
        int h=n;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++) {
                if (j==h-1) {
                    s2+=a[i][j];
                    h--;
                   // System.out.print(a[i][j]+" ");
                }
            }
        }
        //System.out.println("s2"+s2);
        int k=s1-s2;
       // System.out.println();
        System.out.println(Math.abs(k));
    }
}
