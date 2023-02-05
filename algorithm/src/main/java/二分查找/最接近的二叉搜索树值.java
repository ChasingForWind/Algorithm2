package 二分查找;

import leetcode.TreeNode;

public class 最接近的二叉搜索树值 {
    public int closestValue(TreeNode root, double target) {
        if (root.val-target==0){
            return root.val;
        }
        int res = Integer.MIN_VALUE;
        while (root!=null){
            if (Math.abs(root.val-target)<Math.abs(res-target)){
                res = root.val;
            }
            if (root.val>target){
                root = root.left;
            }else {
                root = root.right;
            }
        }
        return res;
    }

}
