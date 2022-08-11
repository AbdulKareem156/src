import java.util.LinkedList;
import java.util.Queue;

public class TriTree {
    Node root;
    TriTree(int key){
        root=new Node(key);
    }
    TriTree(){
        root=null;
    }
    public void Inorder(Node node){
        if(node!=null){
            Inorder(node.left);
            System.out.print(" "+node.key);
            Inorder(node.right);
        }
    }
    public void Preorder(Node node){
        if(node!=null){
            System.out.print(" "+node.key);
            Preorder(node.left);
            Preorder(node.right);
        }
    }
    public void Postorder(Node node){
        if(node!=null){
            Postorder(node.left);
            Postorder(node.right);
            System.out.print(" "+node.key);
        }
    }
        public void order(Node node){
            if(node==null) {
                return;
            }
            Queue<Node> queue=new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()){
                Node tep=queue.poll();
                System.out.print(tep.key+" ");
                if(tep.left!=null){
                    queue.offer(tep.left);
                }
                if(tep.right!=null){
                    queue.offer(tep.right);
                }
            }
        }


    public static void main(String[] args) {
        TriTree s = new TriTree();
        s.root=new Node(1);
        s.root.left=new Node(2);
        s.root.right=new Node(3);
        s.root.left.left=new Node(4);
        System.out.print("PreorderTree:  ");
        s.Preorder(s.root);
        System.out.print("\nPostorderTree:  ");
        s.Postorder(s.root);
        System.out.print("\nInorderTree:  ");
        s.Inorder(s.root);
        System.out.print("\norderTree:  ");
        s.order(s.root);
    }
     static class Node{
        int key;
        Node left,right;
        public Node(int Item){
            key =Item;
            left=right=null;
        }
    }
}
