package 算法初级.链表;

import swordoffer.ListNode;

public class 回文链表 {
    public boolean isPalindrome(ListNode head) {
        if (head.next==null){
            return true;
        }
        // step1 快慢指针找到中间节点
        ListNode fast = new ListNode(0);
        ListNode low = new ListNode(0);
        fast.next = head;
        low.next = head;
        while (fast!=null&&fast.next!=null){
            fast = fast.next.next;
            low = low.next;
        }

        // step2 翻转
        ListNode mid = low.next;
        ListNode reverse = reverse(mid);
        ListNode index = reverse;

        // step3 验证
        while (index!=null){
            if (head.val!=index.val){
                return false;
            }
            index = index.next;
            head = head.next;
        }

        // step4 翻转回去
        mid.next = reverse(reverse);
        return true;
    }

    private ListNode reverse(ListNode node) {
        if (node==null||node.next==null){
            return node;
        }
        ListNode temp = reverse(node.next);
        node.next.next = node;
        node.next = null;
        return temp;
    }
}
