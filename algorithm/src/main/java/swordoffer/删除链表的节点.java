package swordoffer;

/**
 * @Classname 删除链表的节点
 * @Description TODO
 * @Date 2022/6/5 16:03
 * @Created by liuchang
 */
public class 删除链表的节点 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head==null){
            return null;
        }
        //单独判断头节点
        if (head.val  == val){
            return head.next;
        }

        ListNode index1 = new ListNode(0);
        index1.next = head;
        ListNode index2 = head;
        while (index2!=null){
            if (index2.val == val){
                index2 = index2.next;
                index1.next = index2;
            }
            index1 = index1.next;
            index2 = index2==null? index2: index2.next;
        }
        return head;
    }
}
