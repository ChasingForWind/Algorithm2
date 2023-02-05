package 排序;

/**
 * @Classname 选择排序
 * @Description TODO
 * @Date 2022/6/8 08:04
 * @Created by liuchang
 */
public class 选择排序 {
    public int[] sortArray(int[] nums) {
        if(nums.length<2) {
            return nums;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[j]<nums[minIndex]) {
                    minIndex = j;
                }
            }
            swap(nums,i,minIndex);
        }
        return nums;
    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
