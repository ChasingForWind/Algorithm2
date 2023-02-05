package 算法初级.数组;

/**
 * @Classname 旋转数组
 * @Description TODO
 * @Date 2022/7/19 07:35
 * @Created by liuchang
 */
public class 旋转数组 {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        helper(nums,0,nums.length-1);
        helper(nums,0,k-1);
        helper(nums,k,nums.length-1);
    }

    public void helper(int[] nums,int l,int r){
        while (l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}
