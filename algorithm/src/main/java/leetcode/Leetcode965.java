package leetcode;

/**
 * @Classname Leetcode965
 * @Description TODO
 * @Date 2022/6/1 08:15
 * @Created by liuchang
 */
public class Leetcode965 {
    public boolean isUnivalTree(TreeNode root) {
        int num = root.val;
        return helper(root,num);
    }
    public boolean helper(TreeNode root, int num){
        if (root==null) {
            return true;
        }

        if (root.val!=num){
            return false;
        }
        return helper(root.left,num)&&helper(root.right,num);
    }
}
