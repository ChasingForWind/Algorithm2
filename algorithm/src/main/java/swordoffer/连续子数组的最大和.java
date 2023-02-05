package swordoffer;

/**
 * @Classname 连续子数组的最大和
 * @Description TODO
 * @Date 2022/6/5 10:47
 * @Created by liuchang
 */
public class 连续子数组的最大和 {
    public int maxSubArray(int[] nums) {
        if (nums.length==0){
            return 0;
        }

        if (nums.length==1){
            return nums[0];
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];

        for (int i = 1; i <=nums.length-1 ; i++) {
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            max = Math.max(max,dp[i]);
        }

        return max;
    }
}
