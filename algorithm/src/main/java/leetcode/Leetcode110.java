package leetcode;

/**
 * @Classname Leetcode110
 * @Description TODO
 * @Date 2022/5/31 07:54
 * @Created by liuchang
 */
public class Leetcode110 {
    public boolean isBalanced(TreeNode root) {
        if (root==null) {
            return true;
        }
        if (Math.abs(maxDepth(root.left)-maxDepth(root.right))>1){
            return false;
        }

        return isBalanced(root.left)&&isBalanced(root.right);

    }

    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        if (root.left==null&root.right==null){
            return 1;
        }

        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
