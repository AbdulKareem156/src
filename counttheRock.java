import java.util.ArrayList;
import java.util.List;

public class counttheRock {
    public static List<Integer> sp(int a[][],int b[],int x,int z){
        List<Integer> as= new ArrayList<>();
        for(int i=0;i<z;i++){
            int c=0;
            int l=a[i][0];
            int h=a[i][1];
            for(int j=0;j<x;j++){
                if(l<=b[j]&&b[j]<=h){
                    c+=1;
                }
            }
            as.add(c);
        }
        return as;
    }
    public static void main(String[] args) {
        int a[]={400,567,890,765,987};
        int b[][]={{300,380},{800,1000}};
        int x=a.length;
        int z=2;
        List<Integer> za=new ArrayList<>();
         za=sp(b,a,x,z);
        for(int i=0;i<za.size();i++){
            System.out.print(za.get(i)+" ");
        }
    }
}
