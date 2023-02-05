package 二分查找;

public class 寻找旋转数组中的最小值2 {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        while (l<r){
            int mid = l + (r-l)/2;
            if (nums[mid]>nums[r]){
                l = mid + 1;
            }else if (nums[mid]<nums[r]){
                r = mid;
            }else {
                r--;
            }
        }
        return nums[l];
    }
}
