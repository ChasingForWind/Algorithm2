package leetcode;

/**
 * @Classname Leetcode104
 * @Description TODO
 * @Date 2022/5/31 07:50
 * @Created by liuchang
 */
public class Leetcode104 {
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
