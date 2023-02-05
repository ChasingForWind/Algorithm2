package swordoffer;

import java.util.HashMap;

/**
 * @Classname 最长不含重复字符串的子字符串
 * @Description TODO
 * @Date 2022/6/5 15:37
 * @Created by liuchang
 */
public class 最长不含重复字符串的子字符串 {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        if (arr.length==0){
            return 0;
        }
        if (arr.length==1){
            return 1;
        }
        int[] dp = new int[arr.length];
        HashMap<Character, Integer> map = new HashMap<>();
        dp[0] = 1;
        map.put(arr[0],0);
        int max = 0;
        for (int i = 1; i <=dp.length-1 ; i++) {
            if (!map.containsKey(arr[i])){
                dp[i] = dp[i-1]+1;
                max = Math.max(max,dp[i]);
                map.put(arr[i],i);
            }else {
                Integer index = map.get(arr[i]);
                dp[i]=Math.min(i-index,dp[i-1]+1);
                max = Math.max(max,dp[i]);
                map.put(arr[i],i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        最长不含重复字符串的子字符串 test = new 最长不含重复字符串的子字符串();
        int tmmzuxt = test.lengthOfLongestSubstring("tmmzuxt");
        System.out.println(tmmzuxt);
    }
}
