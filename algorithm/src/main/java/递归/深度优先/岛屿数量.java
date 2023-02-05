package 递归.深度优先;

public class 岛屿数量 {
    public int numIslands(char[][] grid) {
        int num = 0;
        boolean[][] flag = new  boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]=='1'){
                    num++;
                    dfs(grid,flag,i,j);
                }
            }
        }
        return num;
    }

    private void dfs(char[][] grid, boolean[][] flag, int i, int j) {
        if (i<0||j<0||i>grid.length-1||j>grid[0].length-1||flag[i][j]||grid[i][j]!='1'){

        }else {
            flag[i][j] = true;
            grid[i][j] = '2';
            dfs(grid,flag,i+1,j);
            dfs(grid,flag,i-1,j);
            dfs(grid,flag,i,j+1);
            dfs(grid,flag,i,j-1);
        }
    }


}
