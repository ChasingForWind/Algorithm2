package 二分查找;

import java.util.Arrays;

public class 找出第k小的数对距离 {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0;
        int right = nums[n-1] - nums[0];
        int res = 0;

        while (left<=right){
            int mid = left + (right - left)/2;
            int count = 0;
            int i = 0;
            for (int j = 0; j < n ; j++) {
                while (nums[j]-nums[i]>mid){
                    i++;
                }
                count += j-i;
            }

            if (count>=k){
                res = mid;
                right = mid -1;
            }else {
                left = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        找出第k小的数对距离 test = new 找出第k小的数对距离();
        int[] arr = {1,6,1};
        int k = 3;
        System.out.println(test.smallestDistancePair(arr, 3));
    }
}
