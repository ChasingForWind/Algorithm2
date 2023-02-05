package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @Classname FindMidNum
 * @Description 查找中位数
 * @Date 2021/1/25 9:05 下午
 * @Created by liuchang
 */
public class FindMidNum {
    public int findmid(int[] arr) {
        int len = arr.length;
        if ((len & 1) == 1) {
            return arr[len / 2];
        } else {
            int num1 = arr[len / 2];
            int num2 = arr[len / 2 - 1];
            return (num1 + num2) / 2;
        }
    }
}
