import java.util.Scanner;
import java.util.Stack;

public class StackBinary {
      public void Stackw(Stack<Integer> axz,int key){
        Boolean result=axz.empty();
        if(result==true){
            System.out.println("The Stack is input");
        }
        int low= axz.elementAt(0);
        int high=axz.elementAt(axz.size()-1);
        int mid=low+high/2;
        while(high>low){
          if(key== axz.elementAt(mid)){
              System.out.println("The element found at index is "+mid);
          }
          if(key<mid){
              high=mid-1;
              for(int i=low;i<=high;i++){
                  if(key==axz.elementAt(i)){
                      System.out.println("The element found at index is "+i);
                      break;
                  }
              }
          }
          if(key>mid){
              low=mid+1;
              for(int i=low;i<=high;i++){
                  if(key==axz.elementAt(i)){
                      System.out.println("The element found at index is "+i);
                      break;
                  }
           }
        }
          break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Key Value");
        int key=sc.nextInt();

        Stack<Integer> ax=new Stack<>();
        ax.push(1);
        ax.push(2);
        ax.push(3);
        ax.push(4);
        ax.push(5);
        ax.push(6);
        ax.push(7);
        ax.push(8);
        ax.push(9);
        System.out.println("The Stack is "+ax);
        StackBinary s=new StackBinary();
        s.Stackw(ax,key);


    }

}
