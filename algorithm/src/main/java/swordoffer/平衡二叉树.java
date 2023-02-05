package swordoffer;

/**
 * @Classname 平衡二叉树
 * @Description TODO
 * @Date 2022/6/23 08:18
 * @Created by liuchang
 */
public class 平衡二叉树 {
    public boolean isBalanced(TreeNode root) {
        if (root==null){
            return true;
        }
        if (!help(root)){
            return false;
        }else {
            return isBalanced(root.left)&&isBalanced(root.right);
        }
    }

    public boolean help(TreeNode root){

        int depthLeft = maxDepth(root.left);
        int depthRight = maxDepth(root.right);

        return Math.abs(depthLeft - depthRight) <= 1;
    }

    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }

        int left = 1 + maxDepth(root.left);
        int right = 1 + maxDepth(root.right);

        return Math.max(left,right);
    }
}
