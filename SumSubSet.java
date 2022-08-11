public class SumSubSet {
    public static boolean sumsub(int arr[],int sum1,int n){
       for (int i=0;i<n;i++){
           sum1=sum1+arr[i];
       }
       if(sum1%2!=0){
           return false;
       }
       else if(sum1%2==0){
           return sub(arr,sum1/2,n);
       }
        return sub(arr,sum1/2,n);
    }
    public static  boolean  sub(int weight[],int sum,int n) {
        if(sum==0){
            return true;
        }
        if(n==0&&sum!=0){
            return false;
        }
        if(weight[n-1]>sum){
            return sub(weight,sum,n-1);
        }



        return sub(weight,sum,n-1)||sub(weight,sum-weight[n-1],n-1);

    }

    public static void main(String[] args) {
        int ar[]={1,5,11,5,2};
        int sum=0;
        int n=ar.length;
       boolean op= sumsub(ar,sum,n);
        System.out.println(op);
    }
}
