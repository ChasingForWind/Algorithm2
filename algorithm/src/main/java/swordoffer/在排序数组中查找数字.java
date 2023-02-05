package swordoffer;

/**
 * @Classname 在排序数组中查找数字
 * @Description TODO
 * @Date 2022/5/20 08:10
 * @Created by liuchang
 */
public class 在排序数组中查找数字 {
    public int search(int[] nums, int target) {
        int left = binaryFind(nums,target,true);
        int right = binaryFind(nums,target,false)-1;
        if (left<=right&&right<nums.length&&nums[left]==target&&nums[right]==target){
            return right - left + 1;
        }
        return 0;
    }

    private int binaryFind(int[] nums, int target, boolean flag) {
        int l = 0;
        int r = nums.length - 1;
        int res= 0;
        while (l<=r){
            int mid = (l + r) /2;
            if (nums[mid]>target||(flag&&nums[mid]>=target)){
                r = mid - 1;
                res = mid;
            }else {
                l = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        在排序数组中查找数字 find = new 在排序数组中查找数字();
        int[] arr = {5,7,7,8,8,10};
        int search = find.search(arr, 6);
        System.out.println(search);

    }
}
