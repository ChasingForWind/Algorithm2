package 滑动窗口与双指针;

import java.util.HashMap;
import java.util.Map;


public class 最小覆盖子串 {
    Map<Character, Integer> target = new HashMap<Character, Integer>();
    Map<Character, Integer> window = new HashMap<Character, Integer>();

    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        // 构建target
        char[] ch = t.toCharArray();
        for (char c : ch){
            target.put(c,target.getOrDefault(c,0)+1);
        }

        // 关键变量
        int slow = 0;
        int fast = 0;
        String res = "";
        int min = Integer.MAX_VALUE;
        // 双指针滑动
        while (fast <= s.length() - 1) {
            window.put(s.charAt(fast),window.getOrDefault(s.charAt(fast),0)+1);
            while (check()&&slow<=fast){
                int temp = fast - slow;
                if (temp<min){
                    min = temp;
                    res = s.substring(slow,fast+1);
                }
                // 从窗口中移除
                window.put(s.charAt(slow),window.get(s.charAt(slow))-1);
                slow++;
            }
            fast++;
        }
        return res;
    }

    // 校验函数
    public boolean check() {
        for (Map.Entry<Character, Integer> entry : target.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (window.get(key) == null || window.get(key) < value) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        最小覆盖子串 test = new 最小覆盖子串();
        // System.out.println(test.minWindow("ADOBECODEBANC", "ABC"));
        System.out.println(test.minWindow("a","a"));
    }
}
