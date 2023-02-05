package 算法初级.树;

import leetcode.TreeNode;

public class 对称二叉树 {
    public boolean isSymmetric(TreeNode root) {
        TreeNode r = root;
        TreeNode l = root;
        return helper(r,l);
    }

    private boolean helper(TreeNode r, TreeNode l) {
        if (r==null&&l==null){
            return true;
        }
        if (r==null||l==null){
            return false;
        }
        if (r.val!=l.val){
            return false;
        }
        return helper(r.left,l.right)&&helper(r.right,l.left);
    }
}
