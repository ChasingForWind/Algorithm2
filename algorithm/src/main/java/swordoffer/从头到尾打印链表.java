package swordoffer;

import java.util.Stack;

/**
 * @Classname 从头到尾打印链表
 * @Description TODO
 * @Date 2022/5/18 07:29
 * @Created by liuchang
 */
public class 从头到尾打印链表 {
    public int[] reversePrint(ListNode head) {
        if (head==null){
            return new int[0];
        }

        Stack<Integer> stack = new Stack<>();
        while (head!=null){
            stack.add(head.val);
            head = head.next;
        }

        int[] arr = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()){
            arr[i] = stack.pop();
            i++;
        }
        return arr;
    }
}
