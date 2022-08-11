public class doesnotrepe {
    public static void main(String [] args){
        int a[]={9,4,9,6,7,4};
        int ne[]= new int[a.length];
        int count = 0;
        for(int i=0;i<a.length;i++) {
             count = 0;
            int h = -1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    ne[j] = h;
                }
            }

            if(ne[i]!=h)
                ne[i]=count;
        }
       for(int u=0;u<ne.length;u++){
            if(ne[u]==0){
                System.out.print(a[u]);
                break;
            }
        }
}
}
