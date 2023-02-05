package leetcode;

/**
 * @Classname LeetCode704
 * @Description TODO
 * @Date 2022/5/23 07:45
 * @Created by liuchang
 */
public class LeetCode704 {
    public int search(int[] nums, int target) {
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
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        LeetCode704 leetCode704 = new LeetCode704();
        System.out.println(leetCode704.search(arr, 2));
    }
}
