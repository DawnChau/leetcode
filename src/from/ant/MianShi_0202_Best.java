package from.ant;

public class MianShi_0202_Best {
    public int kthToLast(ListNode head, int k) {
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }


        cur = head;
        int target = 0;
        while (cur != null) {
            target++;
            if (target == (count - k + 1)) {
                return cur.val;
            }
            cur = cur.next;
        }
        return -1;
    }
}
