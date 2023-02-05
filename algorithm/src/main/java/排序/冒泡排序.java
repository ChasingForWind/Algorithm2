package 排序;

/**
 * @Classname 冒泡排序
 * @Description TODO
 * @Date 2022/6/8 07:38
 * @Created by liuchang
 */
public class 冒泡排序 {
    public int[] sortArray(int[] nums) {
        if(nums.length<2) {
            return nums;
        }
        for (int i = nums.length-1; i >0 ; i--) {
            for (int j = 0; j < i ; j++) {
                if (nums[j]>nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }
        return nums;
    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        冒泡排序 test = new 冒泡排序();
        int[] arr = {5,2,3,1};
        test.sortArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
