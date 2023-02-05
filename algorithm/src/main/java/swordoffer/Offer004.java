package swordoffer;

/**
 * @Classname Offer004
 * @Description TODO
 * @Date 2022/4/28 08:03
 * @Created by liuchang
 */
public class Offer004 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //判断鲁棒性
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        //行
        int k = 0;
        //列
        int w = matrix[0].length - 1;

        int num;
        while (k < matrix.length && w >= 0) {
            num = matrix[k][w];
            if (num > target) {
                w--;
            } else if (num < target) {
                k++;
            } else {
                return true;
            }
        }
        return false;
    }

}
