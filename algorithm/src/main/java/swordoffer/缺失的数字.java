package swordoffer;

/**
 * @Classname 缺失的数字
 * @Description TODO
 * @Date 2022/5/20 08:46
 * @Created by liuchang
 */
public class 缺失的数字 {

    public int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length -1;

        while (left<= right){
            int mid = (left + right)/2;
            if (nums[mid]==mid){
                left = mid +1;
            }
            else {
                right = mid -1;
            }
        }
        return left;
    }
}
