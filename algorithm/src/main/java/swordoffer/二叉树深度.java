package swordoffer;

/**
 * @Classname 二叉树深度
 * @Description TODO
 * @Date 2022/6/23 08:10
 * @Created by liuchang
 */
public class 二叉树深度 {
    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }

        int left = 1 + maxDepth(root.left);
        int right = 1 + maxDepth(root.right);

        return Math.max(left,right);
    }
}
