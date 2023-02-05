package leetcode;

/**
 * @Classname Leetcode35
 * @Description TODO
 * @Date 2022/5/23 08:29
 * @Created by liuchang
 */
public class Leetcode35 {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int mid = 0;
        while (l<=r){
            mid = (l+r)/2;
            if (nums[mid]==target){
                return mid;
            }else if (nums[mid]>target){
                r=mid-1;
            }else {
                l=mid+1;
            }
        }
        return l;
    }
}
