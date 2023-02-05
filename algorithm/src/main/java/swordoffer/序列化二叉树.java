package swordoffer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Classname 序列化二叉树
 * @Description TODO
 * @Date 2022/7/3 18:39
 * @Created by liuchang
 */
public class 序列化二叉树 {
}
class Codec {

    StringBuilder sb =  new StringBuilder();
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        serializeHelper(root);
        return sb.substring(0, sb.length()-1);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        List<String> dataList = Arrays.stream(data.split(",")).collect(Collectors.toList());
        TreeNode treeNode = deserializeHelper(dataList);
        return treeNode;
    }

    public TreeNode deserializeHelper(List<String> dataList) {
        if ("null".equals(dataList.get(0))){
            dataList.remove(0);
            return null;
        }
        TreeNode treeNode = new TreeNode(Integer.parseInt(dataList.get(0)));
        dataList.remove(0);
        treeNode.left = deserializeHelper(dataList);
        treeNode.right = deserializeHelper(dataList);
        return treeNode;
    }

    public void serializeHelper(TreeNode root){
        if (root==null){
            sb.append("null");
            sb.append(",");
            return;
        }
        sb.append(root.val);
        sb.append(",");

        serializeHelper(root.left);
        serializeHelper(root.right);
    }
}
