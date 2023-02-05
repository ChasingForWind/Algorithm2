package 滑动窗口与双指针;

import java.util.HashMap;
import java.util.Objects;

public class 删除排序数组中的重复项2 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length==1){
            return 1;
        }
        // 辅助数据准备
        int slow = 0;
        int fast = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
//        map.put(nums[slow], 1);
        // 双指针开始运行
        while (fast <= nums.length - 1) {
            map.put(nums[fast], map.getOrDefault(nums[fast], 0) + 1);
            if (map.get(nums[fast]) > 2) {
                fast++;
                continue;
            }
            nums[++slow] = nums[fast];
            fast++;
        }
        return slow + 1;
    }

    public static void main(String[] args) {
        删除排序数组中的重复项2 test = new 删除排序数组中的重复项2();
        int[] arr = {1, 2, 2};
        System.out.println(test.removeDuplicates(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i]+" ");
        }
    }
}
