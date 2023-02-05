package com.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Classname FindMidNumTest
 * @Description 测试类
 * @Date 2021/1/25 9:09 下午
 * @Created by liuchang
 */
public class FindMidNumTest {
    int[] a;
    FindMidNum find;

    @Before
    public void beforeTest() {
        a = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        find = new FindMidNum();
    }

    @Test
    public void findmid() {
        int res = find.findmid(a);
        System.out.println(res);
    }
}