/**
 * 链表两数相加
 */
public class Pro_002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode point = res;
        boolean end = false;
        while (l1 != null || l2 != null) {
            // 若是l1是空的了，只加l2的值
            if (l1 == null) {
                point.val += l2.val;
                if (l2.next == null)
                    end = true;
            } else if (l2 == null) {
                // 如果l2是空的了，只加l1的值
                point.val += l1.val;
                if (l1.next == null)
                    end = true;
            } else {
                point.val += l1.val + l2.val;
                if (l2.next == null && l1.next == null)
                    end = true;
            }

            if (point.val >= 10) {
                point.val -= 10;
                // 进位
                point.next = new ListNode(1);
            } else {
                // 没结束的话，还要为下一个继续生成节点
                point.next = end ? null : new ListNode(0);
            }
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            point = point.next;
        }
        return res;
    }
}
