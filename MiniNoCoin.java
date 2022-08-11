import java.util.Scanner;
public class MiniNoCoin {
    public int ma(int a[],int Size,int MaxV){
        if(MaxV==0){
            return 0;
        }
        int r=Integer.MAX_VALUE;
        for(int i=0;i<Size;i++){
            if(a[i]<=MaxV){
              //  System.out.println("i value " +i);
                int sub=ma(a,Size,MaxV-a[i]);
               // System.out.println(MaxV-a[i]);
                //System.out.println("The sub value "+sub);
                if(sub!=r&&sub+1<r){
                    r=sub+1;
                   // System.out.println("rvalue "+r );
                }
            }
        }
        return r;
    }
    public static void main(String[] args) {
        int a[]={5,10,25};
        int s=a.length;
        int max=30;
        MiniNoCoin sc=new MiniNoCoin();
        System.out.println(sc.ma(a,s,max));

    }
}
