import java.util.*;
public class MaxlenSub {
    public static void main(String[] args) {
        int a[]={2,3,5,2,6,7,};
        int c=0,sum=0,r=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum%2==0){
                c++;
                r=Math.max(sum,r);
            }
        }
        System.out.println(c);
    }
}
