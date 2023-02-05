package swordoffer;

/**
 * @Classname 二进制中1的个数
 * @Description TODO
 * @Date 2022/6/28 07:53
 * @Created by liuchang
 */
public class 二进制中1的个数 {
    public int hammingWeight(int n) {
        int res = 0;
        while (n!=0){
            n = n&(n-1);
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int i = -12;
        // 带符号右移
        System.out.println(i>>1);
        // 无符号右移
        System.out.println(i>>>1);
    }
}
