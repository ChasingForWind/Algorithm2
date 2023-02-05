package 二叉树.搜索二叉树;

import 二叉树.TreeNode;

public class 搜索二叉树的最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root!=null&&root.val>p.val&&root.val>q.val) return lowestCommonAncestor(root.left,p,q);
        if(root!=null&&root.val<p.val&&root.val<q.val) return lowestCommonAncestor(root.right,p,q);
        return root;
    }
}
