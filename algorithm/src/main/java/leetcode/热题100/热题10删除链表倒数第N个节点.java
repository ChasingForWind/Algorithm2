package leetcode.热题100;

import java.util.List;

public class 热题10删除链表倒数第N个节点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // step 1 找到删除正数第几个节点
        int length = 0;
        ListNode index = head;
        while (index!=null){
            index = index.next;
            length++;
        }
        int newN = length - n;

        // step 2 删除操作
        ListNode help = new ListNode(0);
        help.next = head;
        ListNode res = help;
        while (newN>1){
            help = help.next;
            newN--;
        }
        help.next = help.next.next;
        return res.next;
    }
}
