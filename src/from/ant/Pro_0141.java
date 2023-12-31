package from.ant;

import java.util.Objects;
import java.util.Optional;

public class Pro_0141 {

    public boolean hasCycle(ListNode head) {

        if (head == null) {
            return false;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (true) {
            fast = Optional.ofNullable(fast.next).map(a -> a.next).orElse(null);
            if (Objects.isNull(fast)) {
                return false;
            }
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
    }
}
