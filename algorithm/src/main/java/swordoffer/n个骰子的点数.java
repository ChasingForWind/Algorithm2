package swordoffer;

import java.util.Arrays;

/**
 * @Classname n个骰子的点数
 * @Description TODO
 * @Date 2022/7/7 08:05
 * @Created by liuchang
 */
public class n个骰子的点数 {
    public double[] dicesProbability(int n) {
        double[] dp = new double[6];
        Arrays.fill(dp,1.0/6.0);
        for (int i = 2; i <=n ; i++) {
            double[] temp = new double[i*5+1];
            for (int j = 0; j < dp.length; j++) {
                for (int k = 0; k < 6; k++) {
                    temp[j+k] += dp[j]/6.0;
                }
            }
            dp = temp;
        }
        return dp;
    }
}
