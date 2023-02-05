package 滑动窗口与双指针;

public class 移动零 {
    public void moveZeroes(int[] nums) {
        if (nums==null||nums.length==0||nums.length==1){
            return;
        }
        // 辅助数据准备
        int slow = 0;
        int fast = 1;
        // 双指针移动
        while (fast<=nums.length-1){
            if (nums[slow]==0&&nums[fast]!=0){
                swap(nums,fast,slow);
                slow++;
                fast++;
                continue;
            }
            if (nums[slow]!=0){
                slow++;
            }
            fast++;
        }
    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
