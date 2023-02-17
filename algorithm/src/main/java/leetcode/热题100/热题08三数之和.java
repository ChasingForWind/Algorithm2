package leetcode.热题100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 热题08三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            // 如果第一个就大于0，因为是递增的所以后面的不可能和为0
            if (nums[i] > 0) {
                break;
            }
            // 去除重复的
            if (i >= 1 && nums[i] == nums[i - 1]) {
                continue;
            }

            // 双指针遍历
            int target = -nums[i];
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                if (nums[l] + nums[r] == target) {
                    // 添加结果
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }
                } else if (nums[l] + nums[r] > target) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return res;
    }
}
