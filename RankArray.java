import java.util.*;
public class RankArray {
    public static void Arra(int a[]){
        int n[]=Arrays.copyOfRange(a,0,a.length);
        Arrays.sort(n);
        int i;
        HashMap<Integer,Integer> sz=new HashMap<>();
        int r=1;
        for(int j=0;j<n.length;j++) {
            int el = n[j];
            if(sz.get(el)==null) {
                sz.put(el, r);
                r++;
            }
        }
        for(i=0;i<a.length;i++){
           // int el=a[i];
            a[i]=sz.get(a[i]);
        }
    }
    public static void main(String[] args) {
        int z[]={100,2,70,2};
        Arra(z);
        System.out.println(Arrays.toString(z));
    }
}
