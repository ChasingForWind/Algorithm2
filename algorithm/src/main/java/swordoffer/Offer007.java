package swordoffer;

import java.util.HashMap;

/**
 * @Classname Offer007
 * @Description TODO
 * @Date 2022/4/29 08:22
 * @Created by liuchang
 */
public class Offer007 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        //构造一个hashmap储存值,方便快速的获取根节点
        for (int i = 0; i < inorder.length; i++) {
            hashMap.put(inorder[i],i);
        }
        int n = preorder.length;
        return recursionHelper(hashMap,preorder,inorder,0,n-1,0,n-1);
    }
    public TreeNode recursionHelper(HashMap<Integer,Integer> hashMap,int[] preorder, int[] inorder, int pre_left ,int pre_right, int in_left, int in_right){
        if (pre_left>pre_right){
            return null;
        }

        // 获取根节点
        Integer i = hashMap.get(preorder[pre_left]);
        // 根据根节点建node
        TreeNode treeNode = new TreeNode(preorder[pre_left]);

        //左边节点长度
        int length = i - in_left;

        treeNode.left = recursionHelper(hashMap,preorder,inorder,pre_left+1,pre_left+length,in_left,i-1);
        treeNode.right = recursionHelper(hashMap,preorder,inorder,pre_left+length+1,pre_right,i+1,in_right);

        return treeNode;
    }

    public static void main(String[] args) {
        Offer007 offer007 = new Offer007();
        int[] pre = {3,9,20,15,7};
        int[] in = {9,3,15,20,7};
        offer007.buildTree(pre,in);
    }
}
