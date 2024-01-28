package from.ant;

import java.util.ArrayList;
import java.util.List;

public class Pro_0234 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode cur = dummyHead;
        while (cur != null) {
            if (cur != dummyHead) {
                list.add(cur.val);
            }
            cur = cur.next;
        }
        int start = 0;
        int end = list.size() - 1;
        while (start <= end) {
            if (!list.get(start).equals(list.get(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
