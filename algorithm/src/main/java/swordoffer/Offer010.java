package swordoffer;

/**
 * @Classname Offer10
 * @Description TODO
 * @Date 2022/4/30 20:40
 * @Created by liuchang
 */
public class Offer010 {
    public int numWays(int n) {
        if (n==0){
            return 1;
        }

        if (n==1) {
            return 1;
        }
        if (n==2) {
            return 2;
        }

        int[] arr = new int[n];

        arr[0] = 1;
        arr[1] = 2;

        for (int i = 2; i <= n-1  ; i++) {
            arr[i] = (arr[i-1] + arr[i-2])%1000000008;
        }

        return arr[n-1];
    }
}
