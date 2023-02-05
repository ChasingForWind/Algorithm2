package leetcode;

/**
 * @Classname TreeNode
 * @Description TODO
 * @Date 2022/5/31 07:43
 * @Created by liuchang
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
