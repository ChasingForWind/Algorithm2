package swordoffer;

import java.util.ArrayList;

/**
 * @Classname 二叉搜索树第k大的节点
 * @Description TODO
 * @Date 2022/6/7 07:49
 * @Created by liuchang
 */
public class 二叉搜索树第k大的节点 {

    ArrayList<Integer> arr = new ArrayList<>();
    public int kthLargest(TreeNode root, int k) {
        help(root);
        return arr.get(arr.size()-k);
    }

    public void help(TreeNode root){
        if (root==null) {
            return;
        }
        help(root.left);
        arr.add(root.val);
        help(root.right);
    }
}
