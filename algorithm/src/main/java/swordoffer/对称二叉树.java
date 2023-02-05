package swordoffer;

/**
 * @Classname 对称二叉树
 * @Description TODO
 * @Date 2022/5/30 08:11
 * @Created by liuchang
 */
public class 对称二叉树 {
    public boolean isSymmetric(TreeNode root) {
        if (root==null) {
            return true;
        }

        return symmetric(root.left,root.right);

    }

    public boolean symmetric(TreeNode A,TreeNode B){
        if (A==null&&B==null) {
            return true;
        }

        if (A==null||B==null){
            return false;
        }

        if (A.val!=B.val){
            return false;
        }

        return symmetric(A.left,B.right)&&symmetric(A.right,B.left);
    }
}
