package swordoffer;

/**
 * @Classname 数字序列中某一位的数字
 * @Description TODO
 * @Date 2022/7/12 08:32
 * @Created by liuchang
 */
public class 数字序列中某一位的数字 {
    public int findNthDigit(int n) {
        int digit = 1;
        long start = 1;
        long count = 9;
        while (n>count){
            n -=count;
            digit ++;
            start *=10;
            count = start*digit*9;
        }
        long num = start + (n-1)/digit;
        return Long.toString(num).charAt((n-1)%digit)-'0';
    }
}
