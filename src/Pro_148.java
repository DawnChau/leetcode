/**
 * 链表归并排序
 */
public class Pro_148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode slow = head;
        ListNode fast = head.next;

        // 找中点
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;
        head = sortList(head);
        head2 = sortList(head2);
        return merge(head, head2);
    }

    private ListNode merge(ListNode a, ListNode b) {
        ListNode dummyHead = new ListNode(-1);
        ListNode p1 = a;
        ListNode p2 = b;
        ListNode p = dummyHead;
        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                p.next = p1;
                p1 = p1.next;
                p = p.next;
                p.next = null;
            } else {
                p.next = p2;
                p2 = p2.next;
                p = p.next;
                p.next = null;
            }
        }
        if (p1 != null)
            p.next = p1;
        if (p2 != null)
            p.next = p2;

        ListNode res = dummyHead.next;
        return res;
    }
}
