package 贪心算法;

public class 最长回文字符串 {
    public int longestPalindrome(String s) {
        int[] charArr = new int[256];
        char[] ch = s.toCharArray();
        for (char c: ch){
            charArr[c] = charArr[c] + 1;
        }

        int res = 0;
        boolean flag = false;
        for (int cnt : charArr){
            if (cnt%2==0){
                res += cnt;
            }else {
                res = res + cnt - 1;
                flag = true;
            }
        }

        if (flag){
            return res+1;
        }else {
            return res;
        }
    }

    public static void main(String[] args) {
        最长回文字符串 test = new 最长回文字符串();
        System.out.println(test.longestPalindrome("abccccdd"));
        System.out.println(test.longestPalindrome("bb"));

    }
}
