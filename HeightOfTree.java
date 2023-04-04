
class Node2{
  int key;
  Node2 left;
  Node2 right;
  Node2(int k){
      k = key;
      left = right = null;
  }
};
public class HeightOfTree {
    public static void main(String[]args){
        Node2 root=new Node2(10);
        root.left=new Node2(20);
        root.right=new Node2(30);
        root.left.left=new Node2(40);
        root.left.right=new Node2(50);
        System.out.println(height(root));
    }
    public static int height(Node2 root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
}
