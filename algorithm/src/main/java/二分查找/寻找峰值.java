package 二分查找;

public class 寻找峰值 {
    public int findPeakElement(int[] nums) {
        if (nums.length==1){
            return 0;
        }

        int l = 0;
        int r = nums.length-1;
        while (l<r){
            int mid = l + (r-l)/2;
            if (nums[mid]>nums[mid+1]){
                r=mid;
            }else {
                l=mid+1;
            }
        }
        return l;
    }
}
