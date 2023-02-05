package swordoffer;

/**
 * @Classname Offer14
 * @Description 剪
 * @Date 2022/5/12 07:21
 * @Created by liuchang
 */
public class Offer014 {
    public int cuttingRope(int n) {
        int[] dp = new int[n+1];
        dp[2] = 1;
        for (int i = 3; i <=n ; i++) {
            for (int j = 2; j <n ; j++) {
                // 动态规划，转移方程为 当前顺子剪后，剩下的顺子不继续剪，和当前的顺子剪后剩下的顺子继续剪的最大值
                dp[i] = Math.max(dp[i],Math.max(j*(i-j),dp[i-j]*j));
            }
        }
        return dp[n];
    }
}
