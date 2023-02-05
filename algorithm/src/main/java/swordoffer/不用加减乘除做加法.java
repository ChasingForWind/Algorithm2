package swordoffer;

/**
 * @Classname 不用加减乘除做加法
 * @Description TODO
 * @Date 2022/6/28 08:39
 * @Created by liuchang
 */
public class 不用加减乘除做加法 {
    public int add(int a, int b) {
        int c = 0;
        while (b!=0){
            // 不进位相加
            c = a^b;
            // 进位
            b = (a&b)<<1;
            a = c;
        }
        return a;
    }
}
