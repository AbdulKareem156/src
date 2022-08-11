import java.util.*;
public class CountDupli {
    public static void Count(String s){
        if(s.length()==0||s.isEmpty()){
            System.out.println("null");
        }
        Map<Character,Integer> a=new HashMap<Character,Integer>();
        int j=1;
        for(int i=0;i<s.length();i++){
            if(a.containsKey(s.charAt(i))){
                a.put(s.charAt(i),a.get(s.charAt(i))+1);
            }
            else {
                a.put(s.charAt(i), 1);
            }
        }
        for (int i=0;i<s.length();i++){
            if(a.get(s.charAt(i))!=1){
                System.out.print(s.charAt(i)+":");
                System.out.print(a.get(s.charAt(i)));
                a.put(s.charAt(i),1);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n=sc.next();
        Count(n);
    }
}
