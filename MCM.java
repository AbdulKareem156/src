public class MCM {
    public static int MCM(int p[],int i,int j){
        if(i>=j){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int count=MCM(p,i,k)+MCM(p,k+1,j)+p[i-1]*p[k]*p[j];
            if(count<min){
                min=count;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int p[]={1,2,3,4,3};
        int n= p.length;
        int g=MCM(p,1,n-1);
        System.out.println(g);

    }
}
