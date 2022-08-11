import java.util.*;
public class PrimeFibno {
    public static Boolean prime(int i){
        if(i<2){
            return false;
        }
        else {
            for(int j=2;j<i;j++){
                if(i%j==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a= new ArrayList<>();
        ArrayList<Integer> w= new ArrayList<>();
        ArrayList<Integer> fi= new ArrayList<>();
        ArrayList<Integer> fn= new ArrayList<>();
        int x= 2;
        int b=40;
        for(int i=x;i<b;i++){
            if(prime(i)){
                a.add(i);
            }
        }
        System.out.println(a);
        System.out.println(a.size());
        System.out.println();
        int j=0,v=1;
        for(int i=0;i<a.size();i++) {
            for (int k =1; k <a.size();k++) {
                String g=String.valueOf(a.get(i))+String.valueOf(a.get(k));
                int sup=Integer.parseInt(g);
                w.add(sup);
            }
        }
        System.out.println(w);
        System.out.println(w.size());
        System.out.println();
        for(int u=0;u<w.size();u++){
            int as= w.get(u);
            if(prime(as)){
                fi.add(as);
            }
        }
        System.out.println(fi);
        int min= fi.get(0);
        int max= fi.get(0);
        for(int am=1;am<fi.size();am++){
            if(fi.get(am)<min){
                min=fi.get(am);
            }
        }
        for(int aw=1;aw<fi.size();aw++){
            if(fi.get(aw)>max){
                max=fi.get(aw);
            }
        }
        System.out.println(fi.size());
        System.out.println("Max "+max);
        System.out.println("Min "+min);
          /*for(int o=2;o<fi.size();o++){
              int yu=fn.get(o-1)+fn.get(o-2);
              fn.set(o,yu);
          }

           */
         int last[]=new int[fi.size()];
        last[0]=min;
        last[1]=max;
        for(int f=2;f<fi.size();f++){
            last[f]=last[f-1]+last[f-2];
            System.out.print(last[f]+" ");
        }
        System.out.println();
        System.out.println(last[last.length-1]);
    }
}
