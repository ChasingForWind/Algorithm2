package com.array;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @Classname CombineTwoSortedArrayTest
 * @Description 测试类
 * @Date 2021/1/25 8:31 下午
 * @Created by liuchang
 */
public class CombineTwoSortedArrayTest {

    List<Integer> arr1;
    List<Integer> arr2;
    CombineTwoSortedArray com1;

    @Before
    public void pre(){
        int[] a = {1,2,3,5,6};
        arr1 = Arrays.stream(a).boxed().collect(Collectors.toList());
        int[] b = {4,5};
        arr2 = Arrays.stream(b).boxed().collect(Collectors.toList());
        com1 = new CombineTwoSortedArray();

    }

    @Test
    public void combine() {
        List<Integer> combine = com1.combine(arr1, arr2);
        System.out.println(combine);
    }



}