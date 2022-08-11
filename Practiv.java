import java.util.ArrayList;

public class Practiv {
    public static void main(String[] args) {
        ArrayList<Integer> s=new ArrayList<>();
        for (int i=1;i<=10;i++){
            s.add(i);
        }
        System.out.println(s);
        for(int i=0;i<s.size();i++){
            System.out.print(s.get(i)+" ");
        }

    }
}
