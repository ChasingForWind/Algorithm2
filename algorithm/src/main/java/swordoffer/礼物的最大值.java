package swordoffer;

/**
 * @Classname 礼物的最大值
 * @Description TODO
 * @Date 2022/6/5 11:12
 * @Created by liuchang
 */
public class 礼物的最大值 {
    public int maxValue(int[][] grid) {
        int[][] help = new int[grid.length][grid[0].length];

        int temp1 = 0;
        for (int i = 0; i < grid[0].length; i++) {
            temp1 = temp1 + grid[0][i];
            help[0][i] = temp1;
        }

        int temp2 = 0;
        for (int j = 0; j < grid.length; j++) {
            temp2 = temp2 + grid[j][0];
            help[j][0] = temp2;
        }


        for (int k = 1; k < grid.length ; k++) {
            for (int t = 1; t < grid[0].length; t++) {
                int temp3 = grid[k][t] + Math.max(help[k-1][t],help[k][t-1]);
                help[k][t] = temp3;
            }
        }

        return help[grid.length-1][grid[0].length-1];
    }
}
