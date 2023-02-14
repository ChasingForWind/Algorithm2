package leetcode.热题100;

public class 热题05最长回文子串 {
    public String longestPalindrome(String s) {

        int len = s.length();
        char[] charArray = s.toCharArray();
        if (len<2){
            return s;
        }

        int maxlen = 1;
        int begin = 0;
        boolean[][] dp = new boolean[len][len];

        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        // 脑中有填表的过程，只需要填满右上角即可
        for (int j = 1; j < len; j++) {
            for (int i = 0; i < j; i++) {
                if (charArray[i]!=charArray[j]){
                    dp[i][j] = false;
                }
                else {
                    if (j-i<3){
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }

                if (dp[i][j]&&j-i+1>maxlen){
                    maxlen = j-i+1;
                    begin = i;
                }
            }
        }
        return s.substring(begin,begin+maxlen);
    }
}
