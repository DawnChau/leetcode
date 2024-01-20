package from.ant;

import java.util.Optional;

public class Pro_0024_Best {
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;

        ListNode pre = dummyHead;
        ListNode first = head;
        ListNode second = head.next;

        while (first != null && second != null) {
            pre.next = second;
            first.next = second.next;
            second.next = first;

            pre = first;
            first = pre.next;
            second = Optional.ofNullable(first).map(a -> a.next).orElse(null);
        }

        return dummyHead.next;
    }
}
