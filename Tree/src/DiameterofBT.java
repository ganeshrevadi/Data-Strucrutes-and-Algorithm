import java.util.ArrayList;
import java.util.List;

public class DiameterofBT {
    public static int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int max = maxDepth(root.right) + maxDepth(root.left);
        return Math.max(max,Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right)));
    }


    public static int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<>();
        BST tree = new BST();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.preetyDisplay();
    }
}
