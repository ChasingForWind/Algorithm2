package swordoffer;

/**
 * @Classname 正则表达式匹配
 * @Description TODO
 * @Date 2022/7/4 08:08
 * @Created by liuchang
 */
public class 正则表达式匹配 {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;

        for (int i = 0; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j-1)=='*'){  // 注意字符串下标转换
                    if (match(s,p,i,j-1)){
                        dp[i][j] = dp[i-1][j]||dp[i][j-2];
                    }else {
                        dp[i][j] = dp[i][j-2];
                    }
                }else {
                    if (match(s,p,i,j)){
                        dp[i][j] = dp[i-1][j-1];
                    }
                }
            }
        }
        return dp[m][n];

    }

    private boolean match(String s, String p, int i, int j) {
        if (i==0){
            return false;
        }
        if (p.charAt(j-1)=='.'){
            return true;
        }
        return s.charAt(i-1)==p.charAt(j-1);
    }
}
