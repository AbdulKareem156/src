import java.util.ArrayList;
import java.util.Scanner;

public class Firsteventhenodd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        //System.out.println(a);
        //ArrayList<ArrayList<Integer>> z=new ArrayList<ArrayList<Integer>>(n);
        //ArrayList<Integer> z=new ArrayList<>();
        ArrayList<Integer> x=new ArrayList<>();
        ArrayList<Integer> y=new ArrayList<>();

       for(int i=0;i<n;i++){
           if(a.get(i)%2==0){
               x.add(a.get(i));
           }
           else {
               y.add(a.get(i));
           }
       }
       x.addAll(y);
        System.out.println(x);
    }
}
