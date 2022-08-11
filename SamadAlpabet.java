import java.util.Scanner;

public class SamadAlpabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        char a[]={'A','B','C','D','E'};
        for(int i=0;i<n;i++){
            for(int j=i;j>=0;j--){
                System.out.print(a[j]);
            }
            System.out.println();
        }
    }
}
