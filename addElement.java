public class addElement {
    public static void add(int a[],int n,int x){
        int g[]=new int[n+1];
        for(int i=0;i<n;i++){
            g[i]=a[i];
        }
        g[n]=x;
        for(int j=0;j<g.length;j++){
            System.out.print(g[j]+" ");
        }
    }
    public static void main(String [] args){
        int s[]={1,2,3,4,5,6,7,8,9};
        int k=s.length;
        int x=10;
        add(s,k,x);
    }
}
