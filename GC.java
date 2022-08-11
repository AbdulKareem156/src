import java.util.Scanner;

public class GC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int r = 2;
        int c = 3;
        int count = 0;
        int q[] = new int[n];
        if(n%2==0) {
            for (int k = 0; k <(n / 2); k++) {
                int cum = a * (int) Math.pow(r, k);
                int cum2 = a * (int) Math.pow(c, k);
                q[count++] = cum;
                q[count++] = cum2;
            }
        }
            else{
            for (int i = 0; i < (n / 2) + 1; i++) {
                int cum = a * (int) Math.pow(r, i);
                int cum2 = a * (int) Math.pow(c, i);
                q[count++] = cum;
                if (n != count) {
                    q[count++] = cum2;
                }
            }
        }
        for(int j=0;j<q.length;j++){
            if(j==q.length-1)
            System.out.print(q[j]+" ");
        }
    }
}
