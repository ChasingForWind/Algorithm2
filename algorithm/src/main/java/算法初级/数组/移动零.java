package 算法初级.数组;

public class 移动零 {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        while (right<nums.length){
            if (nums[right]!=0){
                swap(nums,left,right);
                left++;
            }
            right++;
        }
    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
