package 滑动窗口与双指针;

import java.util.Arrays;

public class 字符串的排列 {
    public boolean checkInclusion(String s1, String s2) {
        // 辅助数组
        int[] dict = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            dict[s1.charAt(i) - 'a']++;
        }
        int[] window = new int[26];
        int slow = 0;
        int fast = 0;
        // 固定窗口双指针
        while (fast <= s2.length() - 1) {
            window[s2.charAt(fast) - 'a']++;
            if (fast-slow+1==s1.length()){
                if (Arrays.equals(dict, window)) {
                    return true;
                }
                window[s2.charAt(slow) - 'a']--;
                slow++;
            }
            fast++;
        }
        return false;
    }

    public static void main(String[] args) {
        字符串的排列 test = new 字符串的排列();
        System.out.println(test.checkInclusion("ab", "eidbaooo"));
        System.out.println(test.checkInclusion("ab", "eidboaoo"));
        System.out.println(test.checkInclusion("a", "ab"));
    }
}
