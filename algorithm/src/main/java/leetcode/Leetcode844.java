package leetcode;

import java.util.Stack;

/**
 * @Classname Leetcode844
 * @Description 比较退格字符串
 * @Date 2021/6/20 9:42 下午
 * @Created by liuchang
 */
public class Leetcode844 {
    public boolean backspaceCompare(String s, String t) {
        //代码鲁棒性
        if (s==null||t==null){
            return false;
        }
        //返回操作后的函数
        String s1 = inputOperate(s);
        String s2 = inputOperate(t);
        //比较操作后的函数
        return s1.equals(s2);
    }

    public String inputOperate(String s){
        //栈的数据结构
        Stack<Character> stack = new Stack<>();
        //操作 不是"#"的数据入栈 是"#"就弹出顶部数据
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (c == '#') {
                if (!stack.isEmpty()){
                    stack.pop();
                }
            } else {
                stack.add(c);
            }
        }
        //将所有数据弹出
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Leetcode844 leetcode844 = new Leetcode844();
        System.out.println(leetcode844.backspaceCompare("y#fo##f","y#f#o##f"));
    }
}
