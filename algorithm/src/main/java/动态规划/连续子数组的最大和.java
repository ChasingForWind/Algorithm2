package 动态规划;

public class 连续子数组的最大和 {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1],0) + nums[i];
        }

        int res = Integer.MIN_VALUE;
        for (int j : dp) {
            if (j > res) {
                res = j;
            }
        }
        return res;
    }
}
