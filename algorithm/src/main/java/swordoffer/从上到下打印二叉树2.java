package swordoffer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname 从上到下打印二叉树2
 * @Description TODO
 * @Date 2022/5/27 07:57
 * @Created by liuchang
 */
public class 从上到下打印二叉树2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root==null){
            return list;
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()){
            ArrayList<Integer> temp = new ArrayList<>();

            for (int i = queue.size();i>0;i--){
                TreeNode poll = queue.poll();
                assert poll != null;
                temp.add(poll.val);
                if (poll.left!=null){
                    queue.add(poll.left);
                }
                if (poll.right!=null) {
                    queue.add(poll.right);
                }
            }
            list.add(temp);
        }

        return list;
    }
}
