package from.ant;

import java.util.HashSet;
import java.util.Set;

public class MianShi_0201 {
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode cur = head;

        Set<Integer> set = new HashSet<>();

        while (cur != null) {
            if (set.contains(cur.val)) {
                ListNode temp = cur.next;
                cur = temp;
                pre.next = temp;
            } else {
                set.add(cur.val);
                pre = cur;
                cur = cur.next;
            }
        }
        return head;
    }
}
