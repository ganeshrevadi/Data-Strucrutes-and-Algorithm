class Node {
    int val;
    Node left, right;

    public Node(int val) {
        this.val = val;
        this.left = this.right = null;
    }
    public Node(int val , Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Main {
    public static void main(String[] args) {
        Node tree = new Node(5);
        tree.left = null;
        System.out.println(tree);
    }
}