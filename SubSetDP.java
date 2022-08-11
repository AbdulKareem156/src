public class SubSetDP {
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
        int weight[]={2,3,7,8,10};
        int sum=11;
        int n=weight.length;
        System.out.println(weight[n-1]);
        System.out.println(sub(weight,sum,n));
       if(sub(weight,sum,n)==true){
           System.out.println(true);
       }
       else {
           System.out.println(false);
       }
    }
}
