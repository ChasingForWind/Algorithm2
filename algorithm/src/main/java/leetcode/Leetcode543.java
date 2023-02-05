package leetcode;

/**
 * @Classname Leetcode543
 * @Description TODO
 * @Date 2022/5/31 08:07
 * @Created by liuchang
 */
public class Leetcode543 {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
        return Math.max(Math.max(left,right),maxDepth(root.left)+maxDepth(root.right));
    }

    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        if (root.left==null&root.right==null){
            return 1;
        }

        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
