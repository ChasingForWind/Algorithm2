package com.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Classname MidFindTest
 * @Description 测试类
 * @Date 2021/1/25 9:20 下午
 * @Created by liuchang
 */
public class MidFindTest {
    int[] a;
    MidFind com1;

    @Before
    public void pre(){
        a = new int[]{1,2,3,4,5,6,7};
        com1 = new MidFind();
    }

    @Test
    public void find() {
        int c = 8;
        boolean b = com1.find(a,c);
        System.out.println(b);

    }
}