package 动态规划;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 打家劫舍2 {
    public int rob(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        if (nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int robFirst = robHelper(nums,0,nums.length-2);
        int robLast = robHelper(nums,1,nums.length-1);
        return Math.max(robFirst,robLast);
    }

    public int robHelper(int[] nums,int left ,int right){
        int[] temp = Arrays.copyOfRange(nums, left, right+1);
        int[] dp = new int[temp.length];
        dp[0] = nums[left];
        dp[1] = Math.max(nums[left],nums[left+1]);
        for (int i = 2; i < temp.length; i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2]+temp[i]);
        }

        int max = Integer.MIN_VALUE;
        for (int j : dp) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        打家劫舍2 test = new 打家劫舍2();
        int[] arr = {2,3,2};
        test.rob(arr);
    }
}
