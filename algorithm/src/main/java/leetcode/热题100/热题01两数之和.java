package leetcode.热题100;

import java.util.HashMap;

public class 热题01两数之和 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                int[] res = new int[2];
                res[0] = i;
                res[1] = map.get(nums[i]);
                return res;
            }
            map.put(target-nums[i],i);
        }
        return null;
    }
}
