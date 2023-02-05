package swordoffer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Classname 顺时针打印矩阵
 * @Description TODO
 * @Date 2022/6/30 07:42
 * @Created by liuchang
 */
public class 顺时针打印矩阵 {
    List<Integer> arr = new ArrayList<>();
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length==0||matrix[0].length==0){
            return new int[0];
        }

        int i = 0;
        while (i*2<matrix.length&&i*2<matrix[0].length){
            help(matrix,i);
            i++;
        }

        int[] res = new int[arr.size()];
        for (int j = 0; j < arr.size(); j++) {
            res[j] = arr.get(j);
        }
        return res;
    }

    public void help(int[][] matrix,int k){
        int row = matrix.length - k -1;
        int col = matrix[0].length-k-1;

        for (int i = k; i <= col ; i++) {
            arr.add(matrix[k][i]);
        }

        if (row>k){
            for (int i = k+1; i <= row; i++) {
                arr.add(matrix[i][col]);
            }
        }

        if (col>k&&row>k){
            for (int i = col-1; i >= k ; i--) {
                arr.add(matrix[row][i]);
            }
        }

        if (row>k+1&&col>k){
            for (int i = row-1; i >= k+1 ; i--) {
                arr.add(matrix[i][k]);
            }
        }
    }
}
