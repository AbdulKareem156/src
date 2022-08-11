import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    void sort(int arr [],int low ,int high){
        if(low<high){
            int p=partition(arr,low,high);
            sort(arr,low,p-1);
            sort(arr,p+1,high);
        }
    }
    int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low;
        int j=low;
        while(i<=high){
            if(arr[i]<=pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            i++;
        }
        return j-1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        QuickSort s = new QuickSort();
        ArrayList<Integer> d = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            d.add(sc.nextInt());
        }
        Integer [] k = new Integer[n];
        d.toArray(k);
        for (Integer e : k) {
            System.out.print(e + " ");
        }

        //System.out.println(s.sort(k,k[0],k[n-1]));
    }
}
