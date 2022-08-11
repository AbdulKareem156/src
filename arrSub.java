public class arrSub {
    public static void main(String args[]){
        int a[]={11,1,13,21,3,7};
        int b[]={11,3,7,1};
        int i,j,count=0;
        for(i=0;i<a.length;i++){
            for(j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    count++;
                }
            }
        }
            if(count==b.length){
                System.out.println("is a subset");
            }
            else {
                System.out.println("not a subset");
            }

    }
}
