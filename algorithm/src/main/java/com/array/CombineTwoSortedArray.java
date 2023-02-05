package com.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname CombineTwoSortedArray
 * @Description 合并两个有序数组
 * @Date 2021/1/25 8:26 下午
 * @Created by liuchang
 */
public class CombineTwoSortedArray {
    public List<Integer> combine(List<Integer> arr1, List<Integer> arr2) {
        int a = 0;
        int b = 0;
        int c = 0;
        ArrayList<Integer> res = new ArrayList<>();

        while (a < arr1.size() && b < arr2.size()) {
            if (arr1.get(a) < arr2.get(b)) {
                res.add(c, arr1.get(a));
                c++;
                a++;
            } else {
                res.add(c, arr2.get(b));
                c++;
                b++;
            }
        }
        while (a < arr1.size()) {
            res.add(c, arr1.get(a));
            c++;
            a++;
        }
        while (b < arr2.size()) {
            res.add(c, arr2.get(b));
            c++;
            b++;
        }
        return res;
    }
}
