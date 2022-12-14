public class MaxheapTree {
    public static void sort(int arr[]){
        int n= arr.length;
        //Build max heap
        for(int i=n/2-1;i>=0;i--){
          heap(arr,n,i);
        }
        //heap sort
        for (int i=n-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heap(arr,i,0);
        }
    }
    public static void heap(int arr[],int n,int i){
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n&&arr[l]>arr[largest]){
            largest=l;
        }
        if(r<n&&arr[r]>arr[largest]){
            largest=r;
        }
        if(largest!=i){
            int swap=arr[i];
            arr[i]=arr[largest];
            arr[largest]=swap;
            heap(arr,n,largest);
        }

    }
    public static void print(int arr[]){
        int n= arr.length;
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");

    }
    public static void main(String[] args) {
        int arr[]={1,12,9,5,6,10};
        //MaxheapTree s= new MaxheapTree();so
        sort(arr);
        System.out.println("The Min heap is");
        print(arr);


    }
}
