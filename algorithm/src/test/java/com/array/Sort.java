package com.array;

import org.junit.Before;
import org.junit.Test;

/**
 * @Classname Sort
 * @Description 排序测试类
 * @Date 2021/1/25 10:12 下午
 * @Created by liuchang
 */
public class Sort {
    int[] arr;
    SortArray sortArray = new SortArray();
    @Before
    public void pre(){
        arr = new int[]{2,10,6,4};
    }
    @Test
    public void quik(){
        sortArray.quikSort(arr);
        printArr(arr);
    }
    @Test
    public void bubble(){
        sortArray.bubbleSort(arr);
        printArr(arr);
    }

    public void printArr(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
