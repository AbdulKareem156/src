import java.util.*;
public class Sortbyfreq {
    public static void sort1(int a[],int n){
        int zx[]=Arrays.copyOfRange(a,0,n);
       int x[]=new int[n];
       int j;
       for(int i=0;i<zx.length;i++){
           int c=1;
           for( j=i+1;j<zx.length;j++) {
               if (zx[i] == zx[j]) {
                   c++;
                   x[j] = -1;
               }
           }
           if(x[i]!=-1){
               x[i]=c;
           }
       }
       for(j=0;j<x.length;j++){
           if(x[j]!=-1)
           System.out.print(x[j]+" ");
       }
    }
    public static void main(String[] args) {
        int a[]={2,5,2,8,5,6,8,8};
        int n=a.length;
        sort1(a,n);
    }
}
