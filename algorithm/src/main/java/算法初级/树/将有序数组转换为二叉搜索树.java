package 算法初级.树;

import leetcode.TreeNode;

public class 将有序数组转换为二叉搜索树 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }

    public TreeNode helper(int[] nums,int left ,int right){
        if (nums==null||nums.length==0){
            return null;
        }
        if (left<0||right>=nums.length){
            return null;
        }
        if (left>right){
            return null;
        }

        int mid = left + (right - left)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums,left,mid-1);
        node.right = helper(nums,mid+1,right);
        return node;
    }
}
