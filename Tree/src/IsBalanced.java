class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }

public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        return Math.abs(maxDepth(root.left) - maxDepth(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
