package from.ant;

public class Lcr_0140_Best {
    public ListNode trainingPlan(ListNode head, int cnt) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            if (cnt <= 0) {
                slow = slow.next;
            }
            fast = fast.next;
            cnt--;
        }
        return slow;
    }
}
