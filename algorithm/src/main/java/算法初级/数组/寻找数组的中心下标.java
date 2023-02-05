package 算法初级.数组;

import javafx.util.Pair;

public class 寻找数组的中心下标 {
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            Pair<Integer, Integer> pair = findLeftAndRight(nums, i);
            if (pair.getKey().equals(pair.getValue())){
                return i;
            }
        }
        return -1;
    }

    public Pair<Integer, Integer> findLeftAndRight(int[] nums ,int k){
        int left = sumNumber(nums,0,k-1);
        int right = sumNumber(nums,k+1,nums.length-1);
        return new Pair<>(left, right);
    }

    public int sumNumber(int[] nums ,int left ,int right){
        int sum = 0;
        // 左右边界直接返回0
        if (left>right){
            return sum;
        }
        for (int i = left; i <= right ; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        寻找数组的中心下标 test = new 寻找数组的中心下标();
        int[] arr = {2, 1, -1};
        int i = test.pivotIndex(arr);
        System.out.println(i);
    }
}
