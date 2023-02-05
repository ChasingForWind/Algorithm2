package com.array;

/**
 * @Classname MidFind
 * @Description 二分法查找数字
 * @Date 2021/1/25 9:20 下午
 * @Created by liuchang
 */
public class MidFind {
    public boolean find(int[] arr, int target) {
        int a = 0;
        int b = arr.length;
        int mid;
        while (a < b) {
            mid = (a + b) >> 1;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                a = mid + 1;
            } else {
                b = mid - 1;
            }
        }
        return false;
    }
}
