package from.ant;

public class Pro_0092_Best {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // 不需要反转
        if (left == right || head == null) {
            return head;
        }
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode cur = head;
        ListNode leftNode = null;
        ListNode leftNodePre = null;

        ListNode rightNode = null;
        ListNode rightNodeNext = null;
        int index = 1;
        while (cur != null) {
            if (index == left) {
                leftNode = cur;
                leftNodePre = pre;
            }
            if (index == right) {
                rightNode = cur;
                rightNodeNext = cur.next;
            }
            if (index > left && index <= right) {
                ListNode temp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = temp;
            } else {
                pre = cur;
                cur = cur.next;
            }
            index++;
        }
        leftNodePre.next = rightNode;
        leftNode.next = rightNodeNext;
        return dummyHead.next;
    }
}
