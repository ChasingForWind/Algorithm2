package 排序;

/**
 * @Classname 插入排序
 * @Description TODO
 * @Date 2022/6/8 08:23
 * @Created by liuchang
 */
public class 插入排序 {
    public int[] sortArray(int[] nums) {
        if(nums.length<2) {
            return nums;
        }
        for (int i = 1; i <nums.length ; i++) {
            int target = nums[i];
            int j = i-1;
            for (;  j>=0 ; j--) {
                if (target<nums[j]) {
                    nums[j+1] = nums[j];
                }else {
                    break;
                }
            }
            if (j!=i-1) {
                nums[j+1] = target;
            }
        }
        return nums;
    }
}
