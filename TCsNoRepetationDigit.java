public class TCsNoRepetationDigit {
    public static int notrep(int n1,int n2){
        int count=0;
        for(int i=n1;i<=n2;i++){
            int num=i;
            boolean a[]=new boolean[10];
            while (num>0){
                if(a[num%10]==true)
                   // System.out.println(num);
                    break;
                    a[num%10]=true;
                    num=num/10;
                //System.out.println("2 "+num);

                }
                if(num==0){
                    count++;
                }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(notrep(101,200));
    }
}
