import java.util.*;
public class Subsum {
    public static int  maxSub(int a[]){
        int r=a[0];
        int n=a.length;
        for(int i=0;i<n;i++){
            int m=a[i];
            for(int j=i+1;j<n;j++){
                    r = Math.max(m, r);
                    m *= a[j];
            }

            r=Math.max(m,r);
        }
        return r;
    }
    public static void main(String[] args) {
        int a[]={2,3,5,0,6,7};
        System.out.println(maxSub(a));
    }
}
