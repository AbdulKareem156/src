public class BinarySearch {
    TreeNode root;
    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data=data;
        }
    }
    public void insert(int value){
       root=insert(root,value);
    }
    public TreeNode insert(TreeNode root,int value){
        if(root==null){
            root=new TreeNode(value);
            return root;
        }
        if(value<root.data){
            root.left=insert(root.left,value);
        }
        else {
            root.right=insert(root.right,value);
        }
        return root;
    }
  /*  public void Inorder(){
       Inorder(root);
    }

   */
    public void Inorder(TreeNode root){
        if(root!=null){
            Inorder(root.left);
            System.out.print(" "+root.data);
            Inorder(root.right);
        }
    }
    public TreeNode search(int key){
        return search(root,key);
    }
    public TreeNode search(TreeNode root,int key){
        if(root==null||root.data==key){
            return root;
        }
        if(key<root.data){
            return search(root.left,key);
        }
        else {
            return search(root.right,key);
        }
    }

    public static void main(String[] args) {
          BinarySearch s = new BinarySearch();
          s.insert(5);
          s.insert( 3);
          s.insert(7);
          s.insert(1);
          s.Inorder(s.root);
        System.out.println();
          if(null!=s.search(1)){
              System.out.println("key Found ");
          }
          else {
              System.out.println("Not found ");
          }
    }
}
