package swordoffer;

import java.util.Stack;

/**
 * @Classname Offer008
 * @Description TODO
 * @Date 2022/4/30 15:07
 * @Created by liuchang
 */
public class Offer008 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public Offer008() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        if(!stack2.isEmpty()){
            return stack2.pop();
        }else{
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.isEmpty() ? -1 : stack2.pop();
        }
    }
}
