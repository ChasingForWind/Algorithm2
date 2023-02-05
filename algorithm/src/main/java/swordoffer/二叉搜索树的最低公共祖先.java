package swordoffer;

/**
 * @Classname 二叉搜索树的最低公共祖先
 * @Description TODO
 * @Date 2022/6/24 07:51
 * @Created by liuchang
 */
public class 二叉搜索树的最低公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }

        if (root.val>p.val&&root.val>q.val){
            return lowestCommonAncestor(root.left,p,q);
        }

        if (root.val<p.val&&root.val<q.val){
            return lowestCommonAncestor(root.right,p,q);
        }

        return root;
    }
}
