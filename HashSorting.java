import java.util.*;
public class HashSorting {
    public static void RemoveDubl(int a[],int n){
        HashMap<Integer,Boolean> s=new HashMap<>();
        for(int i=0;i<n;i++) {
            if (s.get(a[i]) == null)
                System.out.print(a[i] + " ");
                s.put(a[i], true);
        }
    }
    public static void main(String[] args) {
        int n[]={1,2,5,1,7,2,4,2};
        RemoveDubl(n,n.length);
      //  System.out.println();
        System.out.println("\n"+Arrays.toString(n));

    }
}
