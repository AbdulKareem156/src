import java.util.*;
public class rotationofarry {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int i;
        //sc.close();
       /* System.out.println("Left Rotation");
        for (int j = 0; j < k; j++) {
            int first = a[0];
            for ( i = 0; i < n - 1; i++) {
                a[i] = a[i + 1];
            }
            a[i] = first;
        }
        */
        System.out.println("Right rotation");
        for(int j=0;j<k;j++){
            int end=a[n-1];
            for(i=n-1;i>0;i--){
                a[i]=a[i-1];
            }
            a[i]=end;
        }
        for(int j=0;j<n;j++){
            System.out.print(a[j]+" ");
        }
    }
}
