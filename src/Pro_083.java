/**
 * 链表去重
 */
public class Pro_083 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre = head;
        if (head == null || head.next == null)
            return head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == pre.val) {
                pre.next = cur.next;
                cur = pre.next;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        return head;
    }
}
