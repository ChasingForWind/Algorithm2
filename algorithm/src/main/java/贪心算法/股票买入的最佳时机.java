package 贪心算法;

/**
 * 针对可以无限次买卖的情况
 */

public class 股票买入的最佳时机 {
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]>prices[i-1]){
                res += prices[i] - prices[i-1];
            }
        }
        return res;
    }
}
