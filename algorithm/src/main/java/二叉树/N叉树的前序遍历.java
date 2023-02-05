package 二叉树;

import java.util.ArrayList;
import java.util.List;

public class N叉树的前序遍历 {
    List<Integer> res = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        helper(root);
        return res;
    }

    private void helper(Node root) {
        if (root==null){
            return;
        }
        res.add(root.val);
        for (int i = 0; i < root.children.size(); i++) {
            helper(root.children.get(i));
        }
    }
}
