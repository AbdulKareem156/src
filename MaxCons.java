import java.util.ArrayList;
import java.util.Scanner;

public class MaxCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int t = sc.nextInt();
        int size = sc.nextInt();
        ArrayList<Integer> sx = new ArrayList<>();
        for(int i=0;i<size;i++){
            sx.add(sc.nextInt());
        }
        Integer a[] = new Integer[size];
        sx.toArray(a);
        int count=0;
        int maxi=0;
        for(int i=0;i<size;i++) {
            if (a[i]==1) {
                count++;
            }
            else{
                count=0;
            }
            maxi=Math.max(maxi,count);
        }
        System.out.println(maxi);



    }
}
