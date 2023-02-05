package swordoffer;

/**
 * @Classname 二维数组中查找
 * @Description TODO
 * @Date 2022/5/26 07:49
 * @Created by liuchang
 */
public class 二维数组中查找 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0||matrix[0].length == 0){
            return false;
        }

        int r = 0;
        int c = matrix[0].length -1;

        while (r<=matrix.length-1&&c>=0){
            if (matrix[r][c]==target){
                return true;
            }else if (matrix[r][c]<target){
                r++;
            }else {
                c--;
            }
        }
        return false;
    }
}
