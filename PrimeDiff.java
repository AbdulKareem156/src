import java.util.ArrayList;
import java.util.Scanner;

public class PrimeDiff {
    public static Boolean prime(int j){
        for (int i = 2;i<j;i++) {
            if (j % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> s=new ArrayList<>();
        for (int j = n; j <= m; j++) {
          if(prime(j)){
              s.add(j);
          }
        }
        System.out.println(s);
        int c=0;
        for(int k=0;k<s.size();k++){
            for (int o=k+1;o<s.size();o++){
                int fin=s.get(k)-s.get(o);
                if(Math.abs(fin)==6){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
