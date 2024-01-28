package from.ant;

import java.util.List;

public class Pro_0876_Best {
    public ListNode middleNode(ListNode head) {
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        int middle = count / 2 + 1;
        cur = head;
        middle--;
        while (cur != null){
            middle--;
            cur = cur.next;
            if(middle == 0){
                return cur;
            }
        }
        return head;
    }
}
