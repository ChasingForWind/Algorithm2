package 二叉树;

import java.util.ArrayList;
import java.util.List;

public class 中序遍历 {
    List<Integer> res = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        helper(root);
        return res;
    }
    private void helper(TreeNode root) {
        if (root==null){
            return;
        }
        helper(root.left);
        res.add(root.val);
        helper(root.right);
    }
}
