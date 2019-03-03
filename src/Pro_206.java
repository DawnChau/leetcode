/**
 * 逆转链表
 */
public class Pro_206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        // 保留第二个
        ListNode second = head.next;
        // 逆序后的
        ListNode ans = reverseList(head.next);
        second.next = head;
        head.next = null;
        return ans;
    }
}
