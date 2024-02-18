package from.ant;

public class Pro_2807 {
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode cur = head;
        ListNode next = cur.next;
        while (next != null) {

            ListNode newNode = new ListNode(gcd(cur.val, next.val));
            cur.next = newNode;
            newNode.next = next;

            cur = next;
            next = next.next;
        }

        return head;
    }

    // 辗转相除法
    private int gcd(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (max % min == 0) {
            return min;
        }
        return gcd(min, max % min);
    }
}
