/**
 * 将奇数位的数拿到链表的前边，偶数位的数拿到链表的后边
 */
public class Pro_328 {
    public static ListNode oddEvenList(ListNode head) {
        if (head == null)
            return null;

        ListNode oddCur = null;
        ListNode evenCur = null;

        ListNode evenHead = null;
        ListNode oddHead = null;
        ListNode cur = head;
        boolean isOdd = true;
        while (cur != null) {
            if (isOdd) {
                if (oddHead == null) {
                    oddHead = new ListNode(cur.val);
                    oddCur = oddHead;
                } else {
                    oddCur.next = new ListNode(cur.val);
                    oddCur = oddCur.next;
                }

            } else {
                if (evenHead == null) {
                    evenHead = new ListNode(cur.val);
                    evenCur = evenHead;
                } else {
                    evenCur.next = new ListNode(cur.val);
                    evenCur = evenCur.next;
                }
            }
            isOdd = !isOdd;
            cur = cur.next;
        }
        if (oddCur != null)
            oddCur.next = evenHead;
        return oddHead;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);


        oddEvenList(a1);

    }
}
