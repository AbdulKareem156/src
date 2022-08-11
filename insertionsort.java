import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class insertionsort {
    public static void main(String[] args) {
      /* //insertion sort
       Scanner sx = new Scanner(System.in);
        int n= sx.nextInt();
        ArrayList<Integer> s = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            s.add(sx.nextInt());
        }
       //System.out.println(s);
        Integer [] k=new Integer[s.size()];
        s.toArray(k);
       for(int i=1;i<n;i++){
           int temp = k[i];
           int j=i-1;
           while(j>=0&&k[j]>temp){
               k[j+1]=k[j];
               j=j-1;
           }
           k[j+1]=temp;
       }
       ArrayList<Integer> z = new ArrayList<>();

        for(Integer j : k) {
            z.add(j);
        }
        System.out.println(z);

        int [] az = {3,2,5,6,7,99,12,34,67,0,9,23};
        int n= az.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(az[j]>az[j+1]) {
                    int temp = az[j];
                    az[j] = az[j + 1];
                    az[j + 1] = temp;
                }
            }
        }
        System.out.println("BubleSort");
        ArrayList<Integer> sz = new ArrayList<>();
        for(Integer k:az){
            sz.add(k);
        }
        System.out.println(sz);

        System.out.println("Merge sort");
        int z[] ={1,3,5,7,11};
        int x =z.length;
        int a[]={2,4,6,9,10};
        int y=a.length;
        int m=x+y;
        int c[] = new int[m];
        int i=0,k=0,j=0;
        while(i<y&&j<x){
        if (z[i]<a[j]){
            c[k]=z[i];
            i++;
        }
        else {
            c[k]=a[j];
            j++;
        }
        k++;
        }
        while (i<x){
            c[k]=z[i];
            i++;k++;
        }
        while (j<y){
            c[k]=a[j];
            j++;k++;
        }
        ArrayList<Integer> merge = new ArrayList<>();
        for(Integer supe : c){
           merge.add(supe);
        }
        System.out.println(merge);
       */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t = sc.nextInt();
        System.out.println("Enter the size of first array");
        int n = sc.nextInt();
        System.out.println("Enter the size of second array");
        int m = sc.nextInt();
        System.out.println("Enter the first unsorted array");
        ArrayList<Integer> s = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            s.add(sc.nextInt());
        }
        System.out.println("Enter the Second unsorted array");
        ArrayList<Integer> d = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            d.add(sc.nextInt());
        }
        Integer [] k=new Integer[n];
        s.toArray(k);
        for(int i=1;i<n;i++){
            int temp = k[i];
            int j=i-1;
            while(j>=0&&k[j]>temp){
                k[j+1]=k[j];
                j=j-1;
            }
            k[j+1]=temp;
        }
        System.out.println("First array is sorted using the Insertion sort");
        for(Integer g : k){
            System.out.print(g+" ");
        }
        Integer [] f =new Integer[m];
        d.toArray(f);
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(f[j]>f[j+1]) {
                    int temp = f[j];
                    f[j] = f[j + 1];
                    f[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Second array is sorted using the Buble sort");
        for(Integer h : f){
            System.out.print(h+" ");
        }
        System.out.println();
        System.out.println("Merge sort is Being pro level");
        int c[] = new int[n+m];
        int i=0,j=0,u=0;
        while(i<n&&j<m){
            if (k[i]<f[j]){
                c[u]=k[i];
                i++;
            }
            else {
                c[u]=f[j];
                j++;
            }
            u++;
        }
        while (i<n){
            c[u]=k[i];
            i++;u++;
        }
        while (j<m){
            c[u]=f[j];
            j++;u++;
        }
        ArrayList<Integer> finalArray = new ArrayList<>(n+m);
        for(Integer xx:c){
            finalArray.add(xx);
        }
        System.out.println(finalArray);
}
}
