import java.util.*;
public class BFS {
    public static void main(String[] args) {

//        int[] nums = {10, 20, 30, 40, 60};
//        BST tree = new BST();
//        tree.populate(nums);
//        System.out.println(tree.levelOrder(tree.root));

        AVL tree = new AVL();
        for (int i = 0; i < 10; i++) {
            tree.insert(i);
        }
        tree.preetyDisplay();

        System.out.println(tree.height());
    }
}
