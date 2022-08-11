import java.util.*;
public class Mindifference {
    public static int mindifference(int arr[],int i,int sumcal,int totalSum ){

        if(i==0){
            System.out.println("23 is sum so 23-23or22 ans is -23or22"+" "+((totalSum-sumcal)-sumcal));
            return Math.abs((totalSum-sumcal)-sumcal);
        }
        System.out.println(sumcal+arr[i-1]+" "+"and"+" "+sumcal);
        return Math.min(mindifference(arr,i-1,sumcal+arr[i-1],totalSum),mindifference(arr,i-1,sumcal,totalSum));
    }
    public static int findmindifference(int arr[],int n){
        int suntotal=0;
        for(int i=0;i<n;i++){
            suntotal+=arr[i];
        }
        System.out.println("2 nd method"+" "+suntotal);
        return mindifference(arr,n,0,suntotal);
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 11};
        int n = arr.length;

        System.out.println(findmindifference(arr, n));


    }
}
