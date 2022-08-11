public class Maxpossible {
    public static int max(int a[],int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return a[0];
        }
        int pick=a[n]+max(a,n-2);
        int notpick=max(a,n-1);
        int ma=Math.max(pick,notpick);
        return ma;
    }
    public static void main(String[] args) {
        int a[]={5,3,4,11,2};
        int n=a.length;
        System.out.println("The max is : "+max(a,n-1));

    }
}
