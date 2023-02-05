package 滑动窗口与双指针;

import java.util.HashMap;

public class 删除子数组的最大得分 {
    HashMap<Integer, Integer> map = new HashMap<>();

    public int maximumUniqueSubarray(int[] nums) {
        // 数据准备
        int slow = 0;
        int fast = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        // 双指针开始滑动
        while (fast <= nums.length - 1) {
            // 出现过
            if (map.containsKey(nums[fast])){
                Integer temp = map.get(nums[fast]);
                if (temp>=slow){
                    slow = temp + 1;
                }
            }
            sum = getSum(slow, fast, nums);
            map.put(nums[fast], fast);
            max = Math.max(sum, max);
            fast++;
        }
        return max;
    }

    private int getSum(int slow, int fast, int[] nums) {
        int sum = 0;
        for (int i = slow; i <= fast; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        删除子数组的最大得分 test = new 删除子数组的最大得分();
        int[] arr = {4, 2, 4, 5, 6};
        System.out.println(test.maximumUniqueSubarray(arr));


        int[] arr2 = {5,2,1,2,5,2,1,2,5};
        System.out.println(test.maximumUniqueSubarray(arr2));
    }
}
