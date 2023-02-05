package 算法初级.数组;

import java.util.HashMap;

public class 有效的数独 {
    public boolean isValidSudoku(char[][] board) {
        // 行
        HashMap<Character, Integer>[] row = new HashMap[9];
        // 列
        HashMap<Character, Integer>[] col = new HashMap[9];
        // 格
        HashMap<Character, Integer>[] grid = new HashMap[9];

        for (int i = 0; i < 9; i++) {
            row[i] = new HashMap<Character,Integer>();
            col[i] = new HashMap<Character,Integer>();
            grid[i] = new HashMap<Character,Integer>();
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]=='.'){
                    continue;
                }
                // 行
                if (row[i].containsKey(board[i][j])){
                    return false;
                }else {
                    row[i].put(board[i][j],1);
                }

                // 列
                if (col[j].containsKey(board[i][j])){
                    return false;
                }else {
                    col[j].put(board[i][j],1);
                }

                //格
                if (grid[i/3+(j/3)*3].containsKey(board[i][j])){
                    return false;
                }else {
                    grid[i/3+(j/3)*3].put(board[i][j],1);
                }
            }
        }
        return true;
    }
}
