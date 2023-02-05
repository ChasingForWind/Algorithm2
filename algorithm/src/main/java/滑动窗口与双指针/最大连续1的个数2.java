package 滑动窗口与双指针;

import java.util.HashMap;

public class 最大连续1的个数2 {
    public int findMaxConsecutiveOnes(int[] nums) {
        // 数据准备
        int index = -1;
        int n = 0;
        int slow = 0;
        int fast = 0;
        int max = Integer.MIN_VALUE;

        // 开始双指针
        while (fast<=nums.length-1){
            if (nums[fast]==0){
                n++;
            }
            while (n>1){
                if (nums[slow]==0){
                    n--;
                }
                slow++;
            }
            max = Math.max(max,fast-slow+1);
            fast++;
        }
        return max;
    }

    public static void main(String[] args) {
        最大连续1的个数2 test = new 最大连续1的个数2();
        int[] arr = {1,0,1,1,0};
        int[] arr2 = {1,0,1,1,0,1};
        int[] arr3 = {0,0,0,0,1};
//        System.out.println(test.findMaxConsecutiveOnes(arr));
//        System.out.println(test.findMaxConsecutiveOnes(arr2));
        System.out.println(test.findMaxConsecutiveOnes(arr3));
    }
}
