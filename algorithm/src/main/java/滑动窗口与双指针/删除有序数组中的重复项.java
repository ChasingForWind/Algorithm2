package 滑动窗口与双指针;

public class 删除有序数组中的重复项 {
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return 1;
        }
        int slow = 0;
        int fast = 1;
        while (fast<=nums.length-1){
            if (nums[fast]==nums[slow]){
                fast++;
                continue;
            }

            if (nums[fast]!=nums[slow]){
                nums[++slow] = nums[fast];
                fast++;
            }
        }
        return slow+1;
    }

    public static void main(String[] args) {
        删除有序数组中的重复项 test = new 删除有序数组中的重复项();
        int[] arr = {1,1};
        System.out.println(test.removeDuplicates(arr));
    }
}
