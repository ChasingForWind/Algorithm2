package 算法初级.链表;

import swordoffer.ListNode;

public class 删除链表的倒数第N个节点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 找到删除正数第几个节点
        int nn = 0;
        ListNode temp = head;
        while (temp!=null){
            temp = temp.next;
            nn++;
        }
        int x = nn - n +1;

        // 删除
        ListNode help = new ListNode(0);
        help.next = head;
        ListNode index = help;
        while (x>1){
            help = help.next;
            x--;
        }
        help.next = help.next.next;
        return index.next;
    }
}
