package 二叉树;

import java.util.ArrayList;
import java.util.List;

public class 前序遍历 {
    List<Integer> res = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        helper(root);
        return res;
    }

    private void helper(TreeNode root) {
        if (root==null){
            return;
        }
        res.add(root.val);
        helper(root.left);
        helper(root.right);
    }
}
