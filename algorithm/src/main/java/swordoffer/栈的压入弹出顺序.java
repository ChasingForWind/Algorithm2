package swordoffer;

import java.util.Stack;

/**
 * @Classname 栈的压入弹出顺序
 * @Description TODO
 * @Date 2022/6/30 08:16
 * @Created by liuchang
 */
public class 栈的压入弹出顺序 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        // 准备两个栈
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        // 装满第一个
        int i = popped.length-1;
        while (i>=0){
            stack2.add(popped[i]);
            i--;
        }
        // 第二个开始压入
        for (int j = 0; j < pushed.length; j++) {
            stack1.add(pushed[j]);
            while (!stack1.isEmpty()&&stack1.peek().equals(stack2.peek())){
                stack1.pop();
                stack2.pop();
            }
        }
        // 判断两个栈是否都为空
        return stack1.isEmpty()&&stack2.isEmpty();
    }
}
