public class Recurssion1 {
    public static  int clacFactorial(int n) {
        if (n == 1 ||n == 0){
            return 1;
        }
        int fact=clacFactorial(n-1);
        System.out.println("first"+" "+fact+" "+n+"n value");
        int fact_n=n*fact;
        System.out.println("second"+" "+fact_n+" "+n+"n value");
        //This will return in last means returns the value until first return is over and the value present in last
        // fact_n that is 720 is returned
        return fact_n;
    }

    public static void main(String[] args){
        System.out.println(clacFactorial(6));

      /*  public static int xpower(int x ,int n){
            if(x==0){
                return 0;
            }
            if(n==0){
                return 1;
            }
            int sz=xpower(x,n-1);
            // System.out.println(x);
            System.out.println(sz+" "+n);
            int sx=sz*x;
            System.out.println(sx);
            return sx;

        System.out.println(xpower(2,5));


        public static void fib(int a,int b,int n){

            if(n==0){
                return;
            }
            int c=a+b;
            System.out.println(c+" ");
            fib(b,c,n-1);
        }
        System.out.println(0);
        System.out.println(1);

        fib(0,1,8);

       public static  int clacFactorial(int n) {
            if (n == 1 ||n == 0){
                return 1;
            }
            int fact=clacFactorial(n-1);
            System.out.println("first"+" "+fact+" "+n+"n value");
            int fact_n=n*fact;
            System.out.println("second"+" "+fact_n+" "+n+"n value");
            //This will return in last means returns the value until first return is over and the value present in last
            // fact_n that is 720 is returned
            return fact_n;
        }

      // int ans=clacFactorial(6); this also will work
        System.out.println(clacFactorial(6));



        public static  void main1(int n,int i,int j){
            if(i>=10){
                return;
            }
            System.out.print("first "+" "+i+" ");
            main1(n,i+1,j+1);
            System.out.println("Second "+" "+i+" "+i*j+" "+j);
        } int n=10;
        main1(n,1,2);
        //System.out.print();

        public static  void sum(int i,int sum){
            if(i==11){
                System.out.println(sum);
                return;
            }
            sum+=i;
            sum(i+1,sum);
            System.out.println(i+" "+sum);
        }
        int i=0;
        int sum=0;
        sum(i,sum);
        */


    }
}
