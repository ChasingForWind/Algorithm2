package swordoffer;

/**
 * @Classname 数组中出现超过一半的数字
 * @Description TODO
 * @Date 2022/6/29 08:17
 * @Created by liuchang
 */
public class 数组中出现超过一半的数字 {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int vote = 0;

        for (int num : nums){
            if (vote == 0){
                candidate = num;
            }
            if (candidate==num){
                vote++;
            }else {
                vote--;
            }
        }
        // 验证众数
        int count = 0;
        for (int num : nums){
            if (num == candidate){
                count++;
            }
        }
        return count>nums.length/2?candidate:0;
    }
}
