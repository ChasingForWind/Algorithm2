package swordoffer;

/**
 * @Classname Offer012
 * @Description TODO
 * @Date 2022/5/1 08:30
 * @Created by liuchang
 */
public class 矩阵中的路径 {
    public boolean exist(char[][] board, String word) {
        if (board==null|| board.length==0||word==null){
            return false;
        }

        boolean res = false;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]==word.charAt(0)){
                    //标记是否走过
                    boolean[][] flag = new boolean[board.length][board[0].length];
                    res =  res||recursionHelper(board,i,j,word,0,flag);
                }
            }
        }
        return res;
    }

    private boolean recursionHelper(char[][] board,int i, int j, String word, int len,boolean[][] flag) {
        if (i>=board.length||i<0||j>=board[0].length||j<0||board[i][j]!=word.charAt(len)|| flag[i][j]){
            return false;
        }

        //标记是否来过
        flag[i][j] = true;

        if (len==word.length()-1) {
            return true;
        }

        boolean temp = recursionHelper(board,i+1,j,word,len+1,flag)||
                recursionHelper(board,i-1,j,word,len+1,flag)||
                recursionHelper(board,i,j+1,word,len+1,flag)||
                recursionHelper(board,i,j-1,word,len+1,flag);

        flag[i][j] =false;

        return temp;
    }
}
