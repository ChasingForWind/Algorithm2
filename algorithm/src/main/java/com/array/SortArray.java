package com.array;

/**
 * @Classname SortArray
 * @Description 各种经典排序方法
 * @Date 2021/1/25 9:46 下午
 * @Created by liuchang
 */
public class SortArray {
    //冒泡
    public void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    //选择
    public void chooseSort(int[] arr) {

    }

    //快排
    public void quikSort(int[] arr) {
        quikSortHelp(arr, 0, arr.length - 1);
    }

    public void quikSortHelp(int[] arr, int l, int r) {
        if (l == r) return;
        if (l < r) {
            int p = patrition(arr, l, r);
            quikSortHelp(arr, l, p - 1);
            quikSortHelp(arr, p + 1, r);
        }
    }

    private int patrition(int[] arr, int l, int r) {
        int less = l - 1;
        int index = l;
        int num = arr[r];
        while (index < r) {
            if (arr[index] <= num) {
                swap(arr, ++less, index++);
            } else {
                index++;
            }
        }
        swap(arr, r, less + 1);
        return less + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
