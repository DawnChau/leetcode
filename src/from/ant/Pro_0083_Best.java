package from.ant;

public class Pro_0083_Best {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        dummyHead.val = -101;

        ListNode pre = dummyHead;
        ListNode cur = head;

        while (cur != null) {
            if (pre.val == cur.val) {
                cur = cur.next;
                pre.next = cur;
            } else {
                pre = cur;
                cur = cur.next;
            }

        }

        return dummyHead.next;
    }
}
