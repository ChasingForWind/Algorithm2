package leetcode;

/**
 * @Classname Leetcode392
 * @Description 判断子序列
 * @Date 2021/6/22 10:21 下午
 * @Created by liuchang
 */
public class Leetcode392 {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();

        if (n > m) {
            return false;
        }

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        System.out.println(dp[n][m]);
        return dp[n][m] == n;
    }

    public static void main(String[] args) {
        Leetcode392 test = new Leetcode392();
        System.out.println(test.isSubsequence("abc", "ahbgdc"));
    }
}
