package swordoffer;

/**
 * @Classname Node
 * @Description TODO
 * @Date 2022/6/6 08:32
 * @Created by liuchang
 */
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
