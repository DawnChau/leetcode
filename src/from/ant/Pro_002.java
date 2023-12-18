package from.ant;

import java.util.List;


/**
 * 链表两数相加，需要注意进位
 */
public class Pro_002 {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        ListNode head = new ListNode();
        ListNode cur = head;

        while(l1 != null || l2!= null || carry != 0){

            int l1Val = 0;
            int l2Val = 0;
            ListNode node = new ListNode();

            if(l1 != null ){
                l1Val = l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                l2Val = l2.val;
                l2 = l2.next;
            }

            node.val = (l1Val + l2Val + carry) % 10;
            carry = (l1Val + l2Val + carry) / 10;
            cur.next = node;
            cur = cur.next;
        }

        return head.next;
    }
}
