package swordoffer;

import java.util.Stack;

/**
 * @Classname Offer30
 * @Description 包含min函数的栈
 * @Date 2022/5/17 08:11
 * @Created by liuchang
 */
public class Offer30 {

}

class MinStack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    /** initialize your data structure here. */
    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();

    }

    public void push(int x) {
        stack1.push(x);

        if (stack2.isEmpty()){
            stack2.push(x);
        }else {
            if (stack2.peek()>=x){
                stack2.push(x);
            }
        }

    }

    public void pop() {
        if (stack1.peek().equals(stack2.peek())){
            stack1.pop();
            stack2.pop();
        }else {
            stack1.pop();
        }
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}
