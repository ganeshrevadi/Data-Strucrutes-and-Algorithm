import java.util.*;
public class BFS {
    public static void main(String[] args) {

        int[] nums = {3,9,20,15,7};
        BST tree = new BST();
        tree.populate(nums);
        System.out.println(tree.levelOrder(tree.root));
    }
}
