package swordoffer;

/**
 * @Classname 和为s两个数字
 * @Description TODO
 * @Date 2022/6/5 17:31
 * @Created by liuchang
 */
public class 和为s两个数字 {
    public int[] twoSum(int[] nums, int target) {
        int index1 = 0;
        int index2 = nums.length-1;
        int[] res = new int[2];
        while (index1<index2){
            if (nums[index1]+nums[index2]>target){
                index2--;
            }else if (nums[index1]+nums[index2]<target){
                index1++;
            }else {
                res[0] = nums[index1];
                res[1] = nums[index2];
                return res;
            }
        }
        return res;
    }
}
