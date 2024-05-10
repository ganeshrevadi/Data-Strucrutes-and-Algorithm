import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Left_Right_View {
    public static void main(String[] args) {

    }

    public static List<Integer> rightSideView(TreeNode root){
        List<Integer> res = new ArrayList<>();
        recursionRight(root, 0, res);
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.peek();
        return res;
    }

    public static void recursionRight(TreeNode root, int level, List<Integer> res){
        if(root == null){
            return;
        }

        if(res.size() == level){
            res.add(root.val);
        }


        recursionRight(root.right, level + 1, res);
        recursionRight(root.left, level + 1, res);
    }







}
