import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TwoSum {
    public static int [] Sum(int a[],int target){
        for(int i=0;i<a.length;i++){
                for(int j=1;j<a.length;j++) {
                    if(a[i]+a[j]==target){
                        return new int [] {i,j};
                    }
                }
                }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> s= new LinkedList<>();
        for (int i = 0; i <s.size(); i++) {
            s.add(sc.nextInt());
        }
        int a[]=new int[s.size()];
        s.toArray();
        for(int i=0;i<s.size();i++){
            a[i]=s.get(i);
        }


    }
}
