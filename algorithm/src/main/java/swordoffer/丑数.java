package swordoffer;

/**
 * @Classname 丑数
 * @Description TODO
 * @Date 2022/7/6 08:18
 * @Created by liuchang
 */
public class 丑数 {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;

        int i2 = 0;
        int i3 = 0;
        int i5 = 0;

        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(dp[i2]*2,Math.min(dp[i3]*3,dp[i5]*5));
            if (dp[i]==dp[i2]*2){
                i2++;
            }
            if (dp[i]==dp[i3]*3){
                i3++;
            }
            if (dp[i]==dp[i5]*5){
                i5++;
            }
        }

        return dp[n-1];
    }

    public static void main(String[] args) {
        丑数 test = new 丑数();
        System.out.println(test.nthUglyNumber(10));
    }
}
