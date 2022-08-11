import java.util.*;
import java.util.Map.Entry;
import java.util.Scanner;

public class MaxMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        int ab[]=new int[n];
        int bb[]=new int[n];
      // Map<Integer,Integer> s=new HashMap<>();
       for (int i=0;i<n;i++){
              int a= sc.nextInt();
               int b=sc.nextInt();
              // s.put(a,b);
               ab[i]=b;
               bb[i]=a;

       }
       /*
      Iterator it=s.entrySet().iterator();
       while (it.hasNext()){
           Map.Entry e=(Map.Entry)it.next();
           System.out.print(e.getKey()+" "+e.getValue()+", ");
       }
       /*int sum=0;
        Map.Entry<Integer,Integer> MaxValu=null;
        Map.Entry<Integer,Integer> Max=null;
       for (Map.Entry<Integer,Integer> en:s.entrySet()){
               if (MaxValu==null||Max==null||en.getValue() > MaxValu.getValue()) {
                  if(MaxValu==null||Max==null||sum<=m) {
                   Max = MaxValu;
                   MaxValu = en;
                      if(MaxValu!=null&&Max!=null) {
                          sum += Max.getValue() + MaxValu.getValue();
                      }}          }      }
        System.out.println();
        System.out.println(Max.getKey()+" "+MaxValu.getKey());
        */
        int ds=0,dj=0;
        int sum=0,max=0;
        for( int i=0;i< ab.length;i++){
            for(int j=i+1;j<ab.length;j++){
                sum=ab[i]+ab[j];
             if(sum<=m&&max<sum){
                 max=sum;
                  ds=i;
                  dj=j;
             }
            }
        }
        System.out.println(bb[ds]+bb[dj]);
    }
}
