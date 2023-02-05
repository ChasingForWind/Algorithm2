package 算法初级.数组;

public class 旋转图像 {
    public void rotate(int[][] matrix) {
        // 对角线转置
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j <matrix[0].length ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // 左右对称
        int length = matrix[0].length-1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= (matrix[0].length-1)/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][length-j];
                matrix[i][length-j] = temp;
            }
        }
    }
}
