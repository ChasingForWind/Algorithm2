package 算法初级.链表;

import swordoffer.ListNode;

public class 合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p = new ListNode(-1);
        ListNode res = p;
        while ( list1!=null&& list2!=null){
            if ( list1.val>  list2.val){
                p.next= list2;
                p = p.next;
                 list2 =  list2.next;
            }else {
                p.next= list1;
                p = p.next;
                 list1 =  list1.next;
            }
        }
        if ( list1==null){
            p.next =  list2;
        }else {
            p.next =  list1;
        }
        return res.next;
    }
}
