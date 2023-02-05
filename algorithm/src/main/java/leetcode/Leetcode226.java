package leetcode;

/**
 * @Classname Leetcode226
 * @Description TODO
 * @Date 2022/5/31 07:45
 * @Created by liuchang
 */
public class Leetcode226 {
    public TreeNode invertTree(TreeNode root) {
        if (root==null){
            return root;
        }

        TreeNode temp;
        temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
