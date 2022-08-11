import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapInterface {
    public static void main(String[] args) {
        SortedMap<Integer,Integer> s= new TreeMap<>();
        s.put(1,2);
        s.put(4,5);
        s.put(3,3);
        s.put(2,44);
        Iterator i=s.entrySet().iterator();
        while (i.hasNext()){
            Map.Entry<Iterator,Iterator> e=(Map.Entry)i.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
