package swordoffer;

import java.util.HashSet;

/**
 * @Classname offer003
 * @Description TODO
 * @Date 2022/4/28 07:53
 * @Created by liuchang
 */
public class 数组中的重复数字 {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            //判断是否存在，存在则返回
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return 0;
    }

    public int findRepeatNumber2(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            arr[nums[i]]++;
            if(arr[nums[i]]>1) {
                return nums[i];
            }
        }
        return -1;
    }
}
