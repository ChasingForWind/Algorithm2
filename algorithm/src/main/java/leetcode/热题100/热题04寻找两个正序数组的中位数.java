package leetcode.热题100;

public class 热题04寻找两个正序数组的中位数 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 交换位置，始终保存nums1 比 num2 短
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        // 分割线左边满足 m + (n-m+1)/2
        int m = nums1.length;
        int n = nums2.length;
        int totalLeft = (m + n + 1) / 2;

        //在num1 的区间寻找恰当的分割线，使得num1[i-1]<=num2[j] && num2[j-1]<=num1[i]
        int left = 0;
        int right = m;

        while (left < right) {
            int i = left + (right - left + 1) / 2;
            int j = totalLeft - i;
            if (nums1[i - 1] > nums2[j]) {
                right = i - 1;
            } else {
                left = i;
            }
        }

        int i = left;
        int j = totalLeft - i;

        int num1LeftMax = i == 0 ? Integer.MIN_VALUE : nums1[i - 1];
        int num1RightMin = i == m ? Integer.MAX_VALUE : nums1[i];
        int num2LeftMax = j == 0 ? Integer.MIN_VALUE : nums2[j - 1];
        int num2RightMin = j == n ? Integer.MAX_VALUE : nums2[j];

        if ((m + n) % 2 == 1) {
            return Math.max(num1LeftMax, num2LeftMax);
        } else {
            return (double) (Math.max(num1LeftMax, num2LeftMax) + Math.min(num1RightMin, num2RightMin))/2;
        }
    }
}
