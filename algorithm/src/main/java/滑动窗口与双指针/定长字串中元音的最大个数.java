package 滑动窗口与双指针;

public class 定长字串中元音的最大个数 {
    public int maxVowels(String s, int k) {
        // 确定初始值
        int max = 0;
        for (int i = 0; i < k; i++) {
            max += isVowels(s.charAt(i));
        }
        // 辅助变量
        int temp = max;
        // 滑动窗口
        for (int j = k; j < s.length(); j++) {
            temp = temp + isVowels(s.charAt(j)) - isVowels(s.charAt(j - k));
            max = Math.max(temp,max);
        }
        return max;
    }
    public int isVowels(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ? 1 : 0;
    }

    public static void main(String[] args) {
        定长字串中元音的最大个数 test = new 定长字串中元音的最大个数();
        System.out.println(test.maxVowels("aeiou", 2));
    }
}
