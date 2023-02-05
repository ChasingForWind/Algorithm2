package leetcode.热题100;

public class 热题02两数相加 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 新建一个数据返回节点
        ListNode res = new ListNode(-1);
        ListNode flag = res;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            if (l1 != null) {
                carry = carry + l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry = carry + l2.val;
                l2 = l2.next;
            }

            flag.next = new ListNode(carry % 10);
            flag = flag.next;

            carry = carry / 10;
        }
        return res.next;
    }
}
