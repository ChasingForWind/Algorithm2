package swordoffer;

/**
 * @Classname 两个链表的第一个公共节点
 * @Description TODO
 * @Date 2022/6/5 16:34
 * @Created by liuchang
 */
public class 两个链表的第一个公共节点 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null) {
            return null;
        }
        ListNode p1 = headA;
        ListNode p2 = headB;
        while (p1!=p2){
            p1 = p1==null?headB:p1.next;
            p2 = p2==null?headA:p2.next;
        }
        return p1;
    }
}
