class Node{
    int val;
    Node left , right;
    public void Node(int val){
        this.val = val;
        this.left = this.right = null;
    }
}
public class Main {
    public static void main(String[] args) {
        Node tree = new Node();
        tree.Node(5);
        tree.left = null;
        System.out.println(tree);
    }
}