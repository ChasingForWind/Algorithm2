package 滑动窗口与双指针;

public class 尽可能使字符串相等 {
    public int equalSubstring(String s, String t, int maxCost) {
        // 题目转换
        int[] dict = new int[t.length()];
        for (int i = 0; i < dict.length; i++) {
            dict[i] = Math.abs(t.charAt(i) - s.charAt(i));
        }
        // 数据准备
        int slow = 0;
        int fast = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        // 开始遍历
        while (fast<=t.length()-1){
            sum += dict[fast];
            while (sum>maxCost){
                sum -= dict[slow];
                slow++;
            }
            max = Math.max(max,fast-slow+1);
            fast++;
        }
        // 返回
        return max;
    }

    public static void main(String[] args) {
        尽可能使字符串相等 test = new 尽可能使字符串相等();
        System.out.println(test.equalSubstring("abcd", "bcdf", 3));
        System.out.println(test.equalSubstring("abcd", "cdef", 3));
        System.out.println(test.equalSubstring("abcd", "acde", 0));
    }
}
