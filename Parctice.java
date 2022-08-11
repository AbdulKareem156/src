import java.util.ArrayList;

public class Parctice {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        for(int i=1;i<6;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        ArrayList<ArrayList<Integer>> z =new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> x = new ArrayList<>();
        int j=0;

                      for (int k = 0; k < 3; k++) {
                          // System.out.print();
                          if(j<3){

                          x.add(k);
                          //z.add(x);
                      }
                     z.add(x);
                      //System.out.println(z);
                    j++;
                  }

             //    z.add(x);
        System.out.println();
        System.out.print(z);
    }
}
