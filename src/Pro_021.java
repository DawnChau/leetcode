/**
 * 合并两个链表
 */
public class Pro_021 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        // 头 和 指针
        ListNode head = null;
        ListNode currentPoint = null;
        ListNode l1Point = null;
        ListNode l2Point = null;

        if (l1.val < l2.val) {
            head = l1;
            l1Point = l1.next;
            l2Point = l2;
        } else {
            head = l2;
            l1Point = l1;
            l2Point = l2.next;
        }

        currentPoint = head;

        while (l1Point != null && l2Point != null) {
            if (l1Point.val < l2Point.val) {
                currentPoint.next = l1Point;
                currentPoint = currentPoint.next;
                l1Point = l1Point.next;
            } else {
                currentPoint.next = l2Point;
                currentPoint = currentPoint.next;
                l2Point = l2Point.next;
            }
        }

        if (l1Point == null) {
            currentPoint.next = l2Point;
        } else if (l2Point == null) {
            currentPoint.next = l1Point;
        }

        return head;
    }
}


