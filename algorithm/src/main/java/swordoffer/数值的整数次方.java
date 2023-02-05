package swordoffer;

/**
 * @Classname 数值的整数次方
 * @Description TODO
 * @Date 2022/6/27 07:48
 * @Created by liuchang
 */
public class 数值的整数次方 {
    public double myPow(double x, int n) {
        if (n>=0){
            return help(x,n);
        }else {
            return 1/help(x,-n);
        }
    }

    public double help(double x, int n){
        if (n==0){
            return 1;
        }

        if (n==1){
            return x;
        }

        int temp = n/2;

        return help(x,temp)*help(x,n-temp);
    }
}
