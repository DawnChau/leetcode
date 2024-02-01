package from.ant;

/**
 * 快慢指针要注意差距为0的情况
 */
public class Pro_0061_Best {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        // 1. 先求出链表的长度
        int length = getListNodeSize(head);

        // 2. 取余
        k = k % length;

        // 如果k==0，就不用旋转
        if (k == 0) {
            return head;
        }

        // 3. 找出倒数第K个元素
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode fast = head;
        ListNode slow = head;

        // 快的先走k步
        while (k > 0) {
            fast = fast.next;
            k--;
        }

        // 一起走, fast指向最后一个指针，slow指向前段最后一个指针
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }


        dummyHead.next = slow.next;
        slow.next = null;
        fast.next = head;
        return dummyHead.next;
    }

    private int getListNodeSize(ListNode head) {
        ListNode cur = head;
        int size = 0;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }
}
