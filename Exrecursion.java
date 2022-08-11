public class Exrecursion {
    void samad(int n,int i){
        if(n==0||i==10){
            return;
        }
        System.out.println(n+" "+" "+i);
        samad(n-2,i+1);
       System.out.println("n is "+n);
    }
    public static void main(String[] args) {
        Exrecursion sx = new Exrecursion();
        sx.samad(10,0);

    }
}
