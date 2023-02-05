package 滑动窗口与双指针;

import java.util.HashMap;

public class 删掉一个元素以后全为1的最长子数组 {
    public int longestSubarray(int[] nums) {
        // 数据准备
        int index = -1;
        int slow = 0;
        int fast = 0;
        int max = Integer.MIN_VALUE;

        // 开始双指针滑动
        while (fast <= nums.length - 1) {
            if (nums[fast] == 0) {
                if (index != -1) {
                    slow = index + 1;
                }
                index = fast;
            }
            max = Math.max(max, fast - slow + 1);
            fast++;
        }
        return max - 1;
    }

    public static void main(String[] args) {
        删掉一个元素以后全为1的最长子数组 test = new 删掉一个元素以后全为1的最长子数组();
        int[] arr = {1, 1, 0, 1};
        int[] arr2 = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        int[] arr3 = {1,1,1};
        System.out.println(test.longestSubarray(arr));
        System.out.println(test.longestSubarray(arr2));
        System.out.println(test.longestSubarray(arr3));
    }
}
