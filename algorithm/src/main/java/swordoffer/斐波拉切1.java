package swordoffer;

/**
 * @Classname 斐波拉切1
 * @Description TODO
 * @Date 2022/6/5 10:15
 * @Created by liuchang
 */
public class 斐波拉切1 {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1])%1000000007;
        }
        return dp[n]%1000000007;
    }
}
