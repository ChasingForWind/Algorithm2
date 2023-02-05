package 算法初级.数组;

/**
 * @Classname 买卖股票的最佳时机
 * @Description 贪心
 * @Date 2022/7/18 08:09
 * @Created by liuchang
 */
public class 买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        if (prices==null||prices.length<=1){
            return 0;
        }
        int profit = 0;
        int hold;
        int pre;

        for (int i = 1; i < prices.length; i++) {
            hold = prices[i];
            pre = prices[i-1];

            if (hold>pre){
                profit += hold-pre;
            }
        }

        return profit;
    }
}
