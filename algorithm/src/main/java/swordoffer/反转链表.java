package swordoffer;

/**
 * @Classname 反转链表
 * @Description TODO
 * @Date 2022/5/18 07:38
 * @Created by liuchang
 */
public class 反转链表 {
    public ListNode reverseList(ListNode head) {
        if (head==null){
            return null;
        }

        ListNode p1 = null;
        ListNode p2 = head;

        ListNode temp;

        while(p2!=null){
            temp = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = temp;
        }

        return p1;
    }
}
