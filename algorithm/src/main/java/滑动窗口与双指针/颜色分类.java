package 滑动窗口与双指针;

public class 颜色分类 {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int cur = 0;
        while (cur <= right) {
            if (nums[cur] == 2) {
                swap(nums,cur,right);
                right--;
            } else if (nums[cur] == 0) {
                swap(nums,cur,left);
                left++;
            } else{
                cur++;
            }
        }
    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
