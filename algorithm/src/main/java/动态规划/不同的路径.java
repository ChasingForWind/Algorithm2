package 动态规划;

public class 不同的路径 {
    public int uniquePaths(int m, int n) {
        if (m<=0||n<=0) return 0;
        int F[][] = new int[m][n];
        for (int i=0;i<m;i++){
            F[i][0] = 1;
        }
        for (int j=0;j<n;j++){
            F[0][j] =1;
        }
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                F[i][j] = F[i-1][j]+F[i][j-1];
            }
        }
        return F[m-1][n-1];
    }
}
