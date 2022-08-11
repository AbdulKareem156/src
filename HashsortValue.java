import java.util.*;
import java.lang.*;
public class HashsortValue {
    public static HashMap<Integer,Integer> sortthevalue(HashMap<Integer,Integer> s){
        List<Map.Entry<Integer,Integer>> list=new LinkedList<Map.Entry<Integer,Integer>>(s.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        HashMap<Integer,Integer> te=new LinkedHashMap<Integer,Integer>();
        for (Map.Entry<Integer,Integer> e:list){
            te.put(e.getKey(), e.getValue());
        }
        return te;
    }
    public static void main(String[] args) {
        HashMap<Integer,Integer> s=new HashMap<>();
        s.put(1,2);
        s.put(2,1);
        s.put(3,10);
        s.put(4,7);
        HashMap<Integer,Integer> s1=sortthevalue(s);
        for (Map.Entry<Integer,Integer> a:s1.entrySet()){
            System.out.println(a.getKey()+" "+a.getValue());
        }
    }
}
