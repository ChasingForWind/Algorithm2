package leetcode.热题100;

import java.util.Arrays;

public class 热题03无重复字符串最长子串 {
    public int lengthOfLongestSubstring(String s) {
        if ("".equals(s)||s.length()==0){
            return 0;
        }

        // 辅助
        int slow = 0;
        int fast = 0;
        int max = Integer.MIN_VALUE;
        int[] dict = new int[128];
        Arrays.fill(dict,-1);
        // 滑动窗口
        while (fast<=s.length()-1){
            // 没出现过
            if (dict[s.charAt(fast)]==-1){
                dict[s.charAt(fast)] = fast;
            }
            // 出现过
            else {
                int temp = dict[s.charAt(fast)] + 1;
                dict[s.charAt(fast)] = fast;
                if (temp > slow){
                    slow = temp;
                }
            }
            max = Math.max(max,fast-slow+1);
            fast++;
        }
        return max;
    }
}
