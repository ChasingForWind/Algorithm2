package 贪心算法;

/**
 * 只能一次买卖
 */
public class 股票买入的最佳时机2 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int res = 0;
        for (int price : prices){
            if (price<min){
                min = price;
            }
            res = Math.max(res,price - min) ;
        }
        return res;
    }

    public static void main(String[] args) {
        股票买入的最佳时机2 test = new 股票买入的最佳时机2();
        int[] arr = {7,1,5,3,6,4};
        System.out.println(test.maxProfit(arr));
    }
}
