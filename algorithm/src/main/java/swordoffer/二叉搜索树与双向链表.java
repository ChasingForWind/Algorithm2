package swordoffer;

/**
 * @Classname 二叉搜索树与双向链表
 * @Description TODO
 * @Date 2022/6/6 08:05
 * @Created by liuchang
 */
public class 二叉搜索树与双向链表 {
    Node pre,head;

    public Node treeToDoublyList(Node root) {
        if (root==null) {
            return null;
        }

        dfs(root);
        pre.right = head;
        head.left = pre;
        return head;
    }

    public void dfs(Node cur){
        if (cur==null) {
            return;
        }

        dfs(cur.left);

        if (pre==null){
            head = cur;
        }else {
            pre.right = cur;
        }

        cur.left = pre;
        pre = cur;

        dfs(cur.right);

    }

}


