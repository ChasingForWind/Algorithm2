package 算法初级.链表;

import swordoffer.ListNode;

public class 合并K个排序链表 {
    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists,0,lists.length-1);
    }

    private ListNode merge(ListNode[] lists, int l, int r) {
        if (l==r){
            return lists[l];
        }

        if (l>r){
            return null;
        }

        int mid = l + (r-l)/2;

        return mergeTwoLists(merge(lists,l,mid),merge(lists,mid+1,r));
    }


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


