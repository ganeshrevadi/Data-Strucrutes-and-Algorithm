
public class SubTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null){
            return false;
        }
        if(isIdentical(root,subRoot)){
            return true;
        }
        return isIdentical(root.left,subRoot) || isIdentical(root.right,subRoot);
    }

    public boolean isIdentical(TreeNode root , TreeNode subTree){
        if(root == null  ||  subTree == null){
            return root == null && subTree == null;
        }
        return  root.val == subTree.val && isIdentical(root.left,subTree.left) && isIdentical(root.right,subTree.right);
    }


}

