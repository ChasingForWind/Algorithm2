package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 层序遍历 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // 大list
        List<List<Integer>> big = new ArrayList<>();
        if (root==null){
            return big;
        }
        // 队列
        LinkedList<TreeNode> queue = new LinkedList<>();
        // 小list
        ArrayList<Integer> small = new ArrayList<>();
        // 初始化
        queue.add(root);
        TreeNode end = root;
        TreeNode temp = root;
        // 循环
        while (!queue.isEmpty()){
            TreeNode poll = queue.poll();

            if (poll.left!=null){
                queue.addLast(poll.left);
                temp = poll.left;
            }
            if (poll.right!=null){
                queue.addLast(poll.right);
                temp = poll.right;
            }

            small.add(poll.val);

            if (poll==end){
                big.add(new ArrayList<>(small));
                small.clear();
                end = temp;
            }
        }
        // 返回
        return big;
    }
}
