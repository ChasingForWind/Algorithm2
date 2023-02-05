package swordoffer;

/**
 * @Classname Offer015
 * @Description TODO
 * @Date 2022/5/16 08:21
 * @Created by liuchang
 */
public class Offer014_II {
    public int cuttingRope(int n) {
        if(n<4){
            return n-1;
        }
        if (n==4){
            return 4;
        }
        long res = 1;
        while (n>4){
            res = res * 3 % 1000000007;
            n = n - 3;
        }
        return (int)( res * n % 1000000007);
    }
}
