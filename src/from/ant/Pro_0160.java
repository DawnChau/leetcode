package from.ant;

public class Pro_0160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = getSize(headA);
        int sizeB = getSize(headB);
        ListNode curA = headA;
        ListNode curB = headB;
        if (sizeA > sizeB) {
            // A长
            int offset = sizeA - sizeB;
            while (offset > 0) {
                curA = curA.next;
                offset--;
            }
            while (sizeB > 0) {
                if (curA == curB) {
                    return curA;
                } else {
                    curA = curA.next;
                    curB = curB.next;
                }
            }
        }else{
            // B长
            int offset = sizeB - sizeA;
            while (offset > 0) {
                curB = curB.next;
                offset--;
            }
            while (sizeA > 0) {
                if (curA == curB) {
                    return curA;
                } else {
                    curA = curA.next;
                    curB = curB.next;
                }
            }
        }
        return null;
    }

    private int getSize(ListNode headA) {
        int count = 0;
        ListNode cur = headA;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
}
