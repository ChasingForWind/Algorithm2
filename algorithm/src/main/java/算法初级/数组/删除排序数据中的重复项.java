package 算法初级.数组;

/**
 * @Classname 删除排序数据中的重复项
 * @Description  双指针
 * @Date 2022/7/18 07:57
 * @Created by liuchang
 */
public class 删除排序数据中的重复项 {
    public int removeDuplicates(int[] nums) {
        if (nums==null||nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return 1;
        }

        int low = 0;
        int fast = 1;
        while (fast<=nums.length-1){
            if (nums[low]==nums[fast]){
                fast++;
                continue;
            }

            if (nums[low]!=nums[fast]){
                nums[low] = nums[fast];
                low++;
                fast++;
                continue;
            }
        }
        return low+1;
    }
}
