public class freq {
    public static void main(String args[]){
     int a[]={1,2,8,3,2,2,2,5,1};
     int b[]=new int[a.length];
     int h=-1;
     for(int i=0;i<a.length;i++) {
         int c = 1;
         for (int j = i + 1; j<a.length; j++) {
             if (a[i] == a[j]) {
                 c++;
                 b[j] = h;
             }
         }
         if (b[i] != h) {
             b[i] = c;
         }
     }
         for(int g=0;g<b.length;g++){
             if(b[g]!=h)
             System.out.print(b[g]+" ");
     }
    }
}
