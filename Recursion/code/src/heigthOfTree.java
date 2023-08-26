
class Node{
    int key;
    Node left, right;
    public Node(int item){
        key = item;
        left = right = null;
    }
}
public class heigthOfTree {
    Node root;

    // Constructors
    heigthOfTree(int key) { root = new Node(key); }
    heigthOfTree() { root = null; }
    public static void main(String[] args) {
        heigthOfTree tree = new heigthOfTree();
        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);

        System.out.println(Heigth(tree.root));
    }

    static int Heigth(Node root){
        if(root == null){
            return 0;
        }
        int left = Heigth(root.left);
        int rigth = Heigth(root.right);

        return 1 + Math.max(left, rigth);
    }
}

