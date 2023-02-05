package swordoffer;

/**
 * @Classname 通配符匹配
 * @Description TODO
 * @Date 2022/7/5 08:12
 * @Created by liuchang
 */
public class 通配符匹配 {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m+1][n+1];

        dp[0][0] = true;


        for (int i = 0; i <= m; i++) {
            for (int j = 1; j <=n ; j++) {
                if (p.charAt(j-1)=='*'){
                    if (i==0){
                        if (j == 1) {
                            dp[i][j] = true;
                            continue;
                        }else {
                            dp[i][j] = dp[i][j-1];
                            continue;
                        }
                    }
                    // i大于0的才能使用这个转移方程，不然会越界
                    dp[i][j] = dp[i-1][j]||dp[i][j-1];
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

        if (p.charAt(j-1)=='?'){
            return true;
        }
        return s.charAt(i-1)==p.charAt(j-1);
    }

    public static void main(String[] args) {
        通配符匹配 test = new 通配符匹配();
        boolean aa = test.isMatch("aa", "*");
        System.out.println(aa);
    }
}
