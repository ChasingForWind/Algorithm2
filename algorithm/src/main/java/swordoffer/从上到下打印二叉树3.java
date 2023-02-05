package swordoffer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Classname 从上到下打印二叉树3
 * @Description TODO
 * @Date 2022/5/27 08:09
 * @Created by liuchang
 */
public class 从上到下打印二叉树3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root==null){
            return list;
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()){
            LinkedList<Integer> temp = new LinkedList<>();

            for (int i = queue.size();i>0;i--){

                TreeNode poll = queue.poll();
                assert poll != null;

                if (list.size()/2 == 0){
                    temp.addLast(poll.val);
                }else {
                    temp.addFirst(poll.val);
                }

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
