import java.util.ArrayList;
import java.util.Scanner;

public class SquareSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> s = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            s.add(Math.abs(sc.nextInt()));
        }
        Integer [] az=new Integer[n];
        s.toArray(az);

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(az[j]>az[j+1]) {
                    int temp = az[j];
                    az[j] = az[j + 1];
                    az[j + 1] = temp;
                }
            }
        }
        ArrayList<Integer> zz =new ArrayList<>();
        for(Integer e : az){
            zz.add(e*e);
        }
        System.out.println(zz);

    }
}
