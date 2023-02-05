package swordoffer;

/**
 * @Classname 数值的整数次方2
 * @Description TODO
 * @Date 2022/6/27 08:16
 * @Created by liuchang
 */
public class 数值的整数次方2 {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (x == 1) {
            return 1;
        }
        double res = 1;
        long b = n;

        if (b < 0) {
            x = 1 / x;
            b = -b;
        }

        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * x;
                b--;
            } else {
                x = x * x;
                b = b >> 1;
            }
        }
        return res;
    }
}
