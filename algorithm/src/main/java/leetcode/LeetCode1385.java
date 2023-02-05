package leetcode;

import java.util.Arrays;

/**
 * @Classname LeetCode1385
 * @Description TODO
 * @Date 2022/5/25 07:40
 * @Created by liuchang
 */
public class LeetCode1385 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int low = 0;
        int high = 0;
        int cnt=0;

        Arrays.sort(arr2);

        for (int j : arr1) {
            low = j - d;
            high = j + d;
            boolean temp = binary(arr2, low, high);
            if (!temp) {
                cnt++;
            }
        }
        return cnt;
    }

    public boolean binary(int[] arr2,int low,int high){
        int l = 0;
        int r = arr2.length-1;
        while (l<=r){
            int mid = l+(r-l)/2;
            if (arr2[mid]<=high&&arr2[mid]>=low){
                return true;
            }else if (arr2[mid]<low){
                l = mid+1;
            }else {
                r = mid -1;
            }
        }
        return false;
    }
}
