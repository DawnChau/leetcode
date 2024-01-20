package from.ant;

import java.util.Optional;

public class Pro_0082 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummyHead = new ListNode(-200);
        dummyHead.next = head;

        ListNode pre = dummyHead;
        ListNode first = head;
        ListNode second = head.next;
        // 记录是否出现重复
        boolean hasDup = false;
        while (first != null) {
            // 如果第二个不为空且和第一个一样，则需要删除第二个
            if (second != null && second.val == first.val) {
                hasDup = true;
                first.next = second.next;
                second = first.next;
            } else {
                // 如果第二个是Null或者第二个和第一个不一样
                if (hasDup) {
                    // 如果存在重复，需要删除第一个
                    pre.next = second;
                    hasDup = false;
                } else {
                    // 否则整体后移
                    pre = first;
                }
                first = second;
                second = Optional.ofNullable(second).map(a -> a.next).orElse(null);
            }
        }
        return dummyHead.next;
    }
}
