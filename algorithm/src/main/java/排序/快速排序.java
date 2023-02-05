package 排序;

import java.util.Random;

/**
 * @Classname 快速排序
 * @Description TODO
 * @Date 2022/6/14 08:38
 * @Created by liuchang
 */
public class 快速排序 {
    static Random random = new Random();
    public int[] sortArray(int[] nums) {
        if (nums.length<2){
            return nums;
        }
        quikSort(nums,0,nums.length-1);
        return nums;
    }

    private void quikSort(int[] nums, int left, int right) {
        if (left>=right){
            return;
        }
        int pivot = random.nextInt(right-left+1)+left;
        int base = nums[pivot];
        swap(nums,pivot,left);
        int i = left;
        int j = right;
        while(i!=j){
            while(nums[j]>=base && i<j){
                --j;
            }
            while(nums[i]<=base && i<j){
                ++i;
            }
            swap(nums,i,j);
        }
        swap(nums,left,i);
        quikSort(nums,left,i-1);
        quikSort(nums,i+1,right);
    }

    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        快速排序 test = new 快速排序();
        int[] arr = {3,4,1,2,5};
        test.sortArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}
