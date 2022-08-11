public class arraySubset {
    //sorry equal sum
    public static int equalsum(int a[]){
        int j,l,r;
        for(int i=0;i<a.length;++i){
            l=0;
            for( j=0;j<i;j++) {
                l += a[j];
            }
            r=0;
            for(j=i+1;j<a.length;j++){
                r+=a[j];
            }
            if(l==r)
               return i;
        }
        return -1;
    }
    public static void main(String [] args){
        int a[]=new int []{-7,1,5,2,-4,3,0};
       // int a[]={1,2,3};
        System.out.println(equalsum(a));

    }
}
