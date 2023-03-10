package swordoffer;

/**
 * @Classname 青蛙跳台阶1
 * @Description TODO
 * @Date 2022/6/5 10:22
 * @Created by liuchang
 */
public class 青蛙跳台阶1 {
    public int numWays(int n) {
        if (n==0) {
            return 1;
        }

        if (n==1){
            return 1;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <=n ; i++) {
            dp[i] = (dp[i-1]+dp[i-2])%1000000007;
        }
        return dp[n];
    }
}
