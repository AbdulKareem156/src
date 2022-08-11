public class ManMadeTree {
      Tree root;
    public static class Tree{
        int data;
        Tree right;
        Tree left;

        public Tree(int data){
            this.data=data;
        }
    }
    public  void disp(){
        Tree a0=new Tree(0);
        Tree a1=new Tree(1);
        Tree a2=new Tree(2);
        Tree a3=new Tree(3);
        Tree a4=new Tree(4);
        Tree a5=new Tree(5);
        Tree a6=new Tree(6);
        root=a0;
        root.left=a1;
        root.right=a2;
        a1.left=a3;
        a1.right=a4;
        a2.left=a5;
        a2.right=a6;
    }
    public void preorder(Tree root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }


    public static void main(String[] args) {
       ManMadeTree as = new ManMadeTree();
       as.disp();
       as.preorder(as.root);
    }
}
