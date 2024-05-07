import java.util.*;
public class BinaryZigZag {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> ls = new ArrayList<>();
            ls.add(new ArrayList<>(root.val));
            return travers(root, ls, -1);
    }

    public static List<List<Integer>> travers(TreeNode root, List<List<Integer>> ls,int flag){
        if(root == null) return ls;

        if(flag == -1){
            ArrayList<Integer> ar = new ArrayList<>();
            ar.add(root.left.val);
            ar.add(root.right.val);
            ls.add(ar);

        }
        else {
            ArrayList<Integer> ar = new ArrayList<>();
            ar.add(root.right.val);
            ar.add(root.left.val);
            ls.add(ar);
        }
        travers(root.left, ls, flag * -1);
        travers(root.right, ls, flag * -1);

        return ls;
    }

}
