package swordoffer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * @Classname 从上到下打印二叉树
 * @Description TODO
 * @Date 2022/5/27 07:40
 * @Created by liuchang
 */
public class 从上到下打印二叉树 {
    public int[] levelOrder(TreeNode root) {
        if(root == null){
            return new int[0];
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        ArrayList<Integer> arr = new ArrayList<>();

        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode poll = queue.poll();
            arr.add(poll.val);
            if (poll.left!=null){
                queue.add(poll.left);
            }
            if (poll.right!=null) {
                queue.add(poll.right);
            }
        }
        return arr.stream().mapToInt(Integer::valueOf).toArray();
    }
}
