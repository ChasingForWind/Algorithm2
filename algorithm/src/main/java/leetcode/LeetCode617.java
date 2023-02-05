package leetcode;

/**
 * @Classname LeetCode617
 * @Description TODO
 * @Date 2022/6/1 07:35
 * @Created by liuchang
 */
public class LeetCode617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1==null&&root2==null){
            return null;
        }
        if (root1==null){
            return root2;
        }
        if (root2==null){
            return root1;
        }

        int val = root1.val + root2.val;
        TreeNode treeNode = new TreeNode(val);
        treeNode.left = mergeTrees(root1.left,root2.left);
        treeNode.right = mergeTrees(root1.right,root2.right);
        return treeNode;
    }
}
