public class ArraySumofnonrept {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 2, 7, 8, 3, 7};
        int n = a.length;
        int sum = 0;
        int b[]=new int[n];
        for (int i = 0; i < n; i++) {
            int count=0;
            for (int j = i + 1; j < n; j++) {
               if(a[i]==a[j]){
                   a[j]=0;
                   count++;
                }
            }
            if(count==0){
                sum+=a[i];
            }
        }
        System.out.println(sum);
    }
}
