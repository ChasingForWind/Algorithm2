package 二分查找;

public class 寻找旋转数组中的最小值 {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int n = nums.length;
        while (l<r){
            int mid = l + (r-l)/2;
            if (nums[mid]>nums[n-1]){
                l = mid + 1;
            }else {
                r = mid;
            }
        }
        return nums[l];
    }
}
