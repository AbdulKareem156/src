public class CountMindiff {
    public static int countmin(int arr[], int n,int sum) {
        int arr1[][] = new int[n + 1][sum + 1];
        arr1[0][0]=1;
        for (int i = 1; i <= sum; i++) {
            arr1[0][i] = 0;
        }
        for (int i = 1; i <= n; i++) {
            arr1[i][0] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    arr1[i][j] = arr1[i - 1][j]+arr1[i-1][j - arr[i - 1]];
                } else {
                    arr1[i][j] = arr1[i - 1][j];
                }
            }
        }
        return arr1[n][sum];
    }
        public static int countgivendiff(int arr1[],int n,int diff){
            int sum = 0;
            for (int i = 0; i < n; i++)
                sum += arr1[i];
                int reqSum = (diff + sum) / 2;

        return countmin(arr1,n,reqSum);
    }


    public static void main(String[] args) {
        int arr[] = {1,1,2,3};
        int n = args.length;
        int diff = 1;
        System.out.println(countgivendiff(arr,n,diff));
    }
}
