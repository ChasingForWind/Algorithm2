package leetcode;

/**
 * @Classname Leetcode572
 * @Description TODO
 * @Date 2022/6/1 07:41
 * @Created by liuchang
 */
public class Leetcode572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (subRoot == null){
            return true;
        }

        if (root == null){
            return false;
        }

        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot)||helper(root,subRoot);

    }

    public boolean helper(TreeNode root, TreeNode subRoot){
        if (root==null&&subRoot==null){
            return true;
        }

        if (root==null||subRoot==null){
            return false;
        }

        if (root.val!= subRoot.val){
            return false;
        }

        return helper(root.left,subRoot.left)&&helper(root.right,subRoot.right);
    }
}
