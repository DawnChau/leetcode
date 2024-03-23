package from.ant;

public class Pro_2181 {
    public ListNode mergeNodes(ListNode head) {
        ListNode cur = head.next;
        ListNode dummyAnsHead = new ListNode();
        ListNode ansCur = dummyAnsHead;

        int count = 0;
        while (cur != null) {
            if (cur.val == 0) {
                ListNode temp = new ListNode(count);
                ansCur.next = temp;
                ansCur = temp;
                count = 0;
            } else {
                count += cur.val;
            }

            cur = cur.next;
        }
        return dummyAnsHead.next;
    }
}
