public class KnapSack {
      static int max(int a,int b){
          return (a>b)?a:b;
      }
    static int knapsack(int weight[],int value[],int capacity,int n) {
        if (n == 0 || capacity == 0)
            return 0;

        if (weight[n - 1] <= capacity)
            knapsack(weight, value, capacity, n - 1);

        else
        return max(value[n - 1] + knapsack(weight, value, capacity - weight[n - 1], n - 1),knapsack(weight, value, capacity, n - 1));
        return max(value[n - 1] + knapsack(weight, value, capacity - weight[n - 1], n - 1),knapsack(weight, value, capacity, n - 1));
    }
    public static void main(String[] args) {
        int value[]={60,100,120};
        int weight[]={10,20,30};
        int capacity=50;
        int n=weight.length;
        int k=knapsack(weight,value,capacity,n);
        System.out.println(k);
    }
}
