package leetcode;

/**
 * @Classname LeetCode852
 * @Description TODO
 * @Date 2022/5/24 07:51
 * @Created by liuchang
 */
public class LeetCode852 {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 1;
        int r = arr.length - 2;
        int ans = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] > arr[mid + 1]) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}
