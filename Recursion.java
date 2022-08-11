public class Recursion {
    public static void printter(int n,int i,int sum){
        if(i==n){
            sum+=i;
            System.out.println("Real "+sum);
            return;
        }
        sum+=i;
        printter(n,i+1,sum);
       // System.out.println(i+" "+sum);
        //System.out.println(sum);

    }


  /* public static int fact(int n){
        if(n==1||n==0){
            return 1;
        }
        int n1=fact(n-1);
        int nm = n*n1;
        return nm;
    }
   */
   /* public static void fib(int i,int j,int n){
        if(n==0){
            //System.out.println(i+j);
            return;
        }
        int s=i+j;
        System.out.print(s+" ");
        //int s=i+j;
        int k=s;
        fib(j,k,n-1);
        //System.out.println();
        System.out.print(n+" ");
    }
    public static int clacPower(int n ,int x){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpo=clacPower(n-1,x);
        int xpe=xpo*x;
        return xpe;
    }

    */
    public static void main(String[] args) {
        //printter(5,1,0);
        //int ans=fact(5);
        //System.out.println(ans);
        //System.out.print(0+" "+1+" ");
        int n=20;
        //fib(0,1,n-2);
       printter(5,1,0);
        //System.out.println(res);

    }
}
