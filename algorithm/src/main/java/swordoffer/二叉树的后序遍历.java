package swordoffer;

/**
 * @Classname 二叉树的后序遍历
 * @Description TODO
 * @Date 2022/6/28 07:39
 * @Created by liuchang
 */
public class 二叉树的后序遍历 {
    public boolean verifyPostorder(int[] postorder) {
        return help(postorder,0,postorder.length-1);
    }

    private boolean help(int[] postorder, int i, int j) {
        if (i>=j){
            return true;
        }
        int p = i;
        while (postorder[p]<postorder[j]){
            p++;
        }
        int m = p;
        while (postorder[p]>postorder[j]){
            p++;
        }
        return p==j&&help(postorder,i,m-1)&&help(postorder,m,j-1);
    }
}
