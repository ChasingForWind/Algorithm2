package swordoffer;

/**
 * @Classname 合并两个排序的链表
 * @Description TODO
 * @Date 2022/6/5 16:25
 * @Created by liuchang
 */
public class 合并两个排序的链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = new ListNode(-1);
        ListNode res = p;
        while (l1!=null&&l2!=null){
            if (l1.val> l2.val){
                p.next=l2;
                p = p.next;
                l2 = l2.next;
            }else {
                p.next=l1;
                p = p.next;
                l1 = l1.next;
            }
        }
        if (l1==null){
            p.next = l2;
        }else {
            p.next = l1;
        }
        return res.next;
    }
}
