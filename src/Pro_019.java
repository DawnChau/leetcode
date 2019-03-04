/**
 * 删除链表中的倒数第几个元素
 */
public class Pro_019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 快慢链表
        ListNode fast = head;
        ListNode slow = head;

        int count = 0;
        while (count < n) {
            fast = fast.next;
            count++;
        }
        // 删除头
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}
