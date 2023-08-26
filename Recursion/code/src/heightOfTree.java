
class Node{
    int key;
    Node left, right;
    public Node(int item){
        key = item;
        left = right = null;
    }
}
public class heightOfTree {
    Node root;

    // Constructors
    heightOfTree(int key) { root = new Node(key); }
    heightOfTree() { root = null; }
    public static void main(String[] args) {
        heightOfTree tree = new heightOfTree();
        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);

        System.out.println(Height(tree.root));
        System.out.println("Hey");
    }

    static int Height(Node root){
        if(root == null){
            return 0;
        }
        int left = Height(root.left);
        int right = Height(root.right);

        return 1 + Math.max(left, right);
    }
}

