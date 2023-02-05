package 滑动窗口与双指针;

import java.util.Arrays;

public class 无重复的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        if (s==null||s.length()==0){
            return 0;
        }
        // 数据准备
        int[] dict = new int[128];
        Arrays.fill(dict, -1);
        int slow=0;
        int fast=0;
        char[] ch = s.toCharArray();
        int max = Integer.MIN_VALUE;
        // 开始滑动
        while (fast<=ch.length-1){
            // 没出现过
            if (dict[ch[fast]]==-1){
                dict[ch[fast]] = fast;
            }
            // 有出现过
            else {
                int temp = dict[ch[fast]]+1;
                dict[ch[fast]] = fast;
                if (temp>slow){
                    slow = temp;
                }
            }
            max = Math.max(max,fast-slow+1);
            fast++;
        }
        //返回
        return max;
    }

    public static void main(String[] args) {
        无重复的最长子串 test = new 无重复的最长子串();
        System.out.println(test.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(test.lengthOfLongestSubstring("bbbbb"));
        System.out.println(test.lengthOfLongestSubstring("pwwkew"));
        System.out.println(test.lengthOfLongestSubstring(" "));
        System.out.println(test.lengthOfLongestSubstring("abba"));
    }
}
