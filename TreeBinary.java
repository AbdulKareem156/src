import java.awt.*;
import java.util.LinkedList;
public class TreeBinary {
    Listnode head;
    private  static class Listnode{
        int data;
        Listnode next;
     public  Listnode(int data){
         this.data=data;
          next=null;
     }
    }
    public void dis(){
        Listnode current=head;
        while (current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        TreeBinary s1=new TreeBinary();
        s1.head=new Listnode(10);
        Listnode sec=new Listnode(11);
        Listnode third=new Listnode(12);
        s1.head.next=sec;
        sec.next=third;
         s1.dis();



    }
}
