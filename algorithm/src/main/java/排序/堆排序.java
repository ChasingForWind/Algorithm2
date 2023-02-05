package 排序;

/**
 * @Classname 堆排序
 * @Description TODO
 * @Date 2022/6/17 08:04
 * @Created by liuchang
 */
public class 堆排序 {
    public int[] sortArray(int[] nums) {
        if (nums.length<2) {
            return nums;
        }

        buildMaxHeap(nums);

        int length = nums.length;

        while (length>0){
            swap(nums,0,length-1);
            length--;
            adjustHeap(nums,0,length);
        }
        return nums;
    }

    private void adjustHeap(int[] nums, int i, int length) {
        int max = i;
        int left = 2*max + 1;
        int right = 2*max + 2;
        if (left<length&&nums[left]>nums[max]){
            max = left;
        }
        if (right<length&&nums[right]>nums[max]){
            max = right;
        }
        if (max!=i){
            swap(nums,max,i);
            adjustHeap(nums,max,length);
        }

    }

    private void buildMaxHeap(int[] nums) {
        for (int i = nums.length/2-1; i >0 ; i--) {
            adjustHeap(nums,i,nums.length);
        }
    }


    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        堆排序 test = new 堆排序();
        int[] arr = {1,4,5,10,14,7,8,3,6,9};
        test.sortArray(arr);
    }
}
