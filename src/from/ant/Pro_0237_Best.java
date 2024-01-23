package from.ant;

public class Pro_0237_Best {
    public void deleteNode(ListNode node) {
        ListNode pre = node;
        ListNode next = node.next;

        if (pre.next.next == null) {
            pre.val = next.val;
            pre.next = null;
            return;
        }

        while (next.next != null) {
            pre.val = next.val;
            pre = next;
            next = next.next;
        }

        pre.val = next.val;
        pre.next = next;
        return;
    }
}
