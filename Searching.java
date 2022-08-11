import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Searching {
    public static void main(String[] args) {
      /*  List<Integer> sc = new ArrayList<Integer>();
        sc.add(1);
        sc.add(2);
        sc.add(3);
        sc.add(4);
        sc.add(5);
       List<Integer> a =new ArrayList<>();
        Scanner k =new Scanner(System.in);
        int d=k.nextInt();
        for(int i=0;i<d;i++) {
            // int l=k.nextInt();
            a.add(k.nextInt());
        }
        System.out.println(a);


        // System.out.println(sc);
        /*
        List<Integer> a = new ArrayList<>();
        Scanner k = new Scanner(System.in);
        int d = k.nextInt();
        int sum = 0;
        for (int i = 0; i < d; i++) {
            // int l=k.nextInt();
            a.add(k.nextInt());
        }
        System.out.println(a);
        int i = 0;
        ArrayList<Integer> m = new ArrayList<>();

        for (int j = 0; j < d; j++) {
            sum = sum + a.get(i);
            i++;
            m.add(sum);
            //System.out.println(m);
        }
        System.out.println(m);
        ArrayList<Integer> q = new ArrayList<>();
        i = 0;
        for(int n=0;n<d;n++){
            if(m.get(i)>0){
                q.add(m.get(i));
            }
           i++;
        }
        System.out.println(q);


     /*  Iterator s =m.iterator();
        i=0;
        while (s.hasNext()){
            //System.out.print(s.next()+" ");
            if(s.hasNext()>0) {
                q.add(m.get(i));
                i++;
            }
        }
        System.out.println(q);



        */
        ArrayList<ArrayList<Integer>> h = new ArrayList<>();
        List<Integer> a =new ArrayList<>();
        Scanner k =new Scanner(System.in);
        int d=k.nextInt();
        for(int i=0;i<d;i++) {
            // int l=k.nextInt();
            a.add(k.nextInt());
        }
        System.out.println(a);
        ArrayList<Integer> b =new ArrayList<>();
            for(int f=0;f<d;f++) {
                for (int j = f + 1; j < d; j++) {
                    if (a.get(f) == a.get(j)) {
                        b.add(f);
                        b.add(j);
                    }
                }
                    h.add(b);

            }
        System.out.println(h);

    }
    }
