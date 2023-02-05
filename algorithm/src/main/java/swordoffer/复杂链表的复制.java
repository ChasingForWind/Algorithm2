package swordoffer;

/**
 * @Classname 复杂链表的复制
 * @Description TODO
 * @Date 2022/5/18 07:54
 * @Created by liuchang
 */
public class 复杂链表的复制 {
    public Node2 copyRandomList(Node2 head) {
        if (head == null){
            return null;
        }
        //step1 复制链表
        Node2 cur = head;
        while (cur!=null){
            Node2 temp = new Node2(cur.val);
            temp.next = cur.next;
            cur.next = temp;
            cur = temp.next;
        }
        //step2 定义random
        cur = head;
        while (cur!=null){
            if (cur.random!=null){
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }
        //step3 拆分链表
        cur = head.next;
        Node2 res = head.next;
        Node2 pre = head;
        while (cur.next != null){
            pre.next = pre.next.next;
            cur.next = cur.next.next;
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = null;
        return res;
    }
}
