package swordoffer;

/**
 * @Classname 股票的最大利润
 * @Description TODO
 * @Date 2022/6/5 10:28
 * @Created by liuchang
 */
public class 股票的最大利润 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        if (prices.length == 1) {
            return 0;
        }
        int[] dp = new int[prices.length];

        dp[0] = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= prices.length - 1; i++) {
            min = Math.min(prices[i-1],min);
            dp[i] = Math.max(dp[i-1],prices[i]-min);
        }

        return dp[prices.length-1];
    }
}
