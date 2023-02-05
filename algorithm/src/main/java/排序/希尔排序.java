package 排序;

/**
 * @Classname 希尔排序
 * @Description TODO
 * @Date 2022/6/10 08:02
 * @Created by liuchang
 */
public class 希尔排序 {
    public int[] sortArray(int[] nums) {
        if(nums.length<2) {
            return nums;
        }
        int gap = nums.length/2;
        while (gap>0){
            int stat = 0;
            while (stat<gap){
                for (int i = stat+gap; i <nums.length ; i=i+gap) {
                    int target = nums[i];
                    int j = i-gap;
                    for (; j>=0;j=j-gap) {
                        if (nums[j]>target){
                            nums[j+gap] = nums[j];
                        }else {
                            break;
                        }
                    }
                    if (j!=i-gap){
                        nums[j+gap] = target;
                    }
                }
                stat++;
            }
            gap = gap/2;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,5};
        希尔排序 test = new 希尔排序();
        test.sortArray(arr);
    }
}
