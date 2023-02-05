package swordoffer;

/**
 * @Classname 二叉树的镜像
 * @Description TODO
 * @Date 2022/5/30 08:06
 * @Created by liuchang
 */
public class 二叉树的镜像 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root==null) {
            return root;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirrorTree(root.left);
        mirrorTree(root.right);

        return root;
    }
}
