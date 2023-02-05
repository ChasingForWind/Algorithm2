package swordoffer;

/**
 * @Classname 链表中倒数第k个节点
 * @Description TODO
 * @Date 2022/6/5 16:17
 * @Created by liuchang
 */
public class 链表中倒数第k个节点 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode index1 = head;
        ListNode index2 = head;
        while (k>0){
            index2 = index2.next;
            k--;
        }
        while (index2!=null){
            index1 = index1.next;
            index2 = index2.next;
        }
        return index1;
    }
}
