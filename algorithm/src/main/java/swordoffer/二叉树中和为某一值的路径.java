package swordoffer;

import java.util.LinkedList;
import java.util.List;

/**
 * @Classname 二叉树中和为某一值的路径
 * @Description TODO
 * @Date 2022/6/6 07:51
 * @Created by liuchang
 */
public class 二叉树中和为某一值的路径 {
    List<List<Integer>> res = new LinkedList<>();
    List<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        help(root,target);
        return res;
    }

    public void help(TreeNode root, int target){
        if (root==null){
            return;
        }

        target = target - root.val;
        path.add(root.val);

        if (target==0&&root.left==null&&root.right==null){
            res.add(new LinkedList<>(path));
        }

        help(root.left,target);
        help(root.right,target);

        path.remove(path.size()-1);

    }

}
