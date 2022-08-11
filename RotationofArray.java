import java.util.Scanner;

public class RotationofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int rot=sc.nextInt();
        int last=a[a.length-1];
        int i;
        for(i=1;i<=rot;i++) {
            for (i = n - 1; i > 0; i--) {
                a[i] = a[i-1];
            }
            a[0] = last;
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

}
