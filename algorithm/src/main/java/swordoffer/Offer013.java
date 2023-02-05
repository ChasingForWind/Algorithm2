package swordoffer;

/**
 * @Classname Offer13
 * @Description TODO
 * @Date 2022/5/2 08:11
 * @Created by liuchang
 */
public class Offer013 {

    int r = 0;
    public int movingCount(int m, int n, int k) {
        if (m <= 0 || n <= 0 || k < 0) {
            return 0;
        }
        boolean[][] flag = new boolean[m][n];
        recursionHelper(0,0,flag,k);
        return r;
    }

    public void recursionHelper(int x,int y,boolean[][] flag,int k){
        if (x>=flag.length||y>=flag[0].length||x<0||y<0|| flag[x][y] || wetherDigitSumBiggerThanK(x,y,k)){
            return;
        }
        r = r+1;
        flag[x][y] = true;

        recursionHelper(x+1,y,flag,k);
        recursionHelper(x-1,y,flag,k);
        recursionHelper(x,y+1,flag,k);
        recursionHelper(x,y-1,flag,k);
    }

    public boolean wetherDigitSumBiggerThanK(int x, int y, int k) {
        int res = 0;
        while (x != 0) {
            res = res + x % 10;
            x = x / 10;
        }
        while (y != 0) {
            res = res + y % 10;
            y = y / 10;
        }
        return res > k;
    }

    public static void main(String[] args) {
        Offer013 offer013 = new Offer013();
        System.out.println(offer013.movingCount(1, 2, 1));
    }
}
