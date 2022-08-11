public class Tree {
    //declare the variable globally
    int n;
    String x;
    Tree(int n,String x){
      this.n=n;
      x=x;
    }
    void display(){
        System.out.println(n+" "+x);
    }
    public static void main(String[] args) {
     Tree c = new Tree(5,"kareem");
        Tree c1 = new Tree(51,"kareem");
     c.display();
     c1.display();
    }
}
