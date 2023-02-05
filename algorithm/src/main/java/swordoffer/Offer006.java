package swordoffer;

import java.util.Stack;

/**
 * @Classname Offer006
 * @Description TODO
 * @Date 2022/4/29 07:50
 * @Created by liuchang
 */
public class Offer006 {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head!=null){
            stack.add(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()){
            res[i] = stack.pop();
            i++;
        }
        return res;
    }
}
