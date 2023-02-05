package leetcode;

/**
 * @Classname LeetCode34
 * @Description TODO
 * @Date 2022/5/26 07:35
 * @Created by liuchang
 */
public class LeetCode34 {
    public int[] searchRange(int[] nums, int target) {
        int left = binary(nums, target, true);
        int right = binary(nums, target, false);
        int[] res = new int[2];
        res[0] = left;
        res[1] = right;
        return res;
    }

    // flag 为true 代表找左边边界 为false代表找右边边界
    public int binary(int[] nums, int target, boolean flag) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                if (flag) {
                    if (mid - 1 >= 0 && nums[mid - 1] == target) {
                        r = mid - 1;
                    } else {
                        return mid;
                    }
                } else {
                    if (mid + 1 <= nums.length - 1 && nums[mid + 1] == target) {
                        l = mid + 1;
                    } else {
                        return mid;
                    }
                }
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
