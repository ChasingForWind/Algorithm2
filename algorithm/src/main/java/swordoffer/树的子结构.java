package swordoffer;

/**
 * @Classname 树的子结构
 * @Description TODO
 * @Date 2022/5/30 08:00
 * @Created by liuchang
 */
public class 树的子结构 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null||B==null) {
            return false;
        }
        return dfs(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B);
    }

    public boolean dfs(TreeNode A, TreeNode B){
        if (B==null) {
            return true;
        }
        if (A==null){
            return false;
        }
        return A.val==B.val&&dfs(A.left,B.left)&&dfs(A.right,B.right);
    }
}
