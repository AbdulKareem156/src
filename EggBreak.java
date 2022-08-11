public class EggBreak {
    public static int break1(int n,int m){
        if(m==0||m==1){
            return m;
        }
        if(n==1){
            return m;
        }
        int min=Integer.MAX_VALUE;
        int z;
        for(int i=1;i<=m;i++){
            z=Math.max(break1(n-1,i-1),break1(n,m-i));
            if(z<min){
                min=z;
            }
        }
        return min+1;
    }
    public static void main(String[] args) {
        int n=2;
        int m=10;
        System.out.println("Mini no of worst cases with the egg and floor is "+break1(n,m));
    }
}
