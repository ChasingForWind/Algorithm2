package leetcode;



/**
 * @Classname LeetCode100
 * @Description TODO
 * @Date 2022/5/31 07:38
 * @Created by liuchang
 */
public class LeetCode100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null&&q==null) {
            return true;
        }
        if (p==null||q==null){
            return false;
        }
        if (p.val !=q.val){
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
