package leetcode;

/**
 * @Classname Leetcode31
 * @Description TODO
 * @Date 2022/7/3 19:56
 * @Created by liuchang
 */
public class Leetcode31 {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        while (i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
        if (i>=0){
            int j = nums.length -1;
            while (j>=0&&nums[j]>nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i);
    }

    public void reverse(int[] arr ,int i){
        int left = i+1;
        int right = arr.length-1;
        while (left<right){
            swap(arr,left,right);
            left++;
            right--;
        }
    }

    public void swap(int[] arr ,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
