package 二叉树.搜索二叉树;

import 二叉树.TreeNode;

public class 验证二叉搜索树 {
    Integer pre;
    boolean flag = true;

    public boolean isValidBST(TreeNode root) {
        if (root == null) return false;
        helper(root);
        return flag;
    }

    private void helper(TreeNode root) {
        if (root == null) {
            return;
        }

        helper(root.left);

        if (pre == null) {
            pre = root.val;
        } else if (root.val <= pre) {
            flag = false;
        } else {
            pre = root.val;
        }

        helper(root.right);

    }
}
