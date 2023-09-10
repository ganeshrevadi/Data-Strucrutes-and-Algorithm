
public class SubTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null && subRoot ==null|| root!=null && subRoot==null) return true;
        if (root==null && subRoot!=null) return false;
        if(isIdentical(root,subRoot)){
            return true;
        }
        return isIdentical(root.left,subRoot) || isIdentical(root.right,subRoot);
    }

    public boolean isIdentical(TreeNode root , TreeNode subTree){
        if(root == null  ||  subTree == null){
            return true;
        }
        if(root == null && subTree != null || root != null && subTree == null)  return false;

        if(root.val != subTree.val) return false;

        return  root.val == subTree.val && isIdentical(root.left,subTree.left) && isIdentical(root.right,subTree.right);
    }


}

class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(root==null && subRoot ==null|| root!=null && subRoot==null) return true;
        if (root==null && subRoot!=null) return false;

        if(isSame(root,subRoot)) return true;

        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }


    private boolean isSame(TreeNode p, TreeNode q){

        if(p == null && q == null) return true;
        if(p == null && q != null || p != null && q == null) return false;

        if(p.val!=q.val) return false;
        System.out.println("Done!");

        return isSame(p.left,q.left) && isSame(p.right,q.right);
    }
}

