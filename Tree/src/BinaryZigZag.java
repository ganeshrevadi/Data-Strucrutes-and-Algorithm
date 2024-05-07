import java.util.*;
public class BinaryZigZag {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> ls = new ArrayList<>();
            return travers(root, ls);
    }

    public static List<List<Integer>> travers(TreeNode root, List<List<Integer>> ls){
        if(root == null) return ls;


    }

}
