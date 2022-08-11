import java.util.*;
import java.lang.String;
import java.util.concurrent.Callable;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a =sc.nextLine();
        int n =a.length()-1;
        //int temp=0;
        String sub = new String();
        //int longestsublen=0;
        //System.out.println(a);
        char as[]=a.toCharArray();
        int j=1;
        List<Character> list=new ArrayList<>();
        for(int i=0;i<n;i++){

                if(as[i]!=as[j]){
                    if(!list.contains(as[i])) {
                        list.add(as[i]);


                    }
                    j++;
                }
            if (as[0]==as[1]){
                System.out.println(-1);
                break;
            }
                else{
                    break;
                }

        }
        //System.out.println(list);
        //String smm=list.toString();

        //for(Character sx:)













      /*  List<Character> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            char ch = as[i];
           // System.out.print(as[i]);
            if(!list.contains(ch)){
                list.add(ch);

            }
        }
       // System.out.print(list);
        Character s[]=new Character[list.size()];
        list.toArray(s);
        for(Character sx:s) {
            System.out.print(sx);
        }

       */


    }
}
