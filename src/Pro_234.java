/**
 * 判断链表是否是回文的
 */
public class Pro_234 {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next ==null)
            return true;

        ListNode pSlow = head;
        ListNode pFast = head;
        ListNode second = null;

        while(pFast!=null && pFast.next!=null){
            pFast = pFast.next.next;
            pSlow = pSlow.next;
        }

        // 奇数
        if(pFast!=null){
            second = reverseList(pSlow.next);
        }else{
            second = reverseList(pSlow);
        }
        while(second!=null){
            if(head.val!=second.val)
                return false;
            second = second.next;
            head = head.next;
        }
        return true;
    }

    private ListNode reverseList(ListNode head){
        if(head==null || head.next==null)
            return head;
        ListNode second = head.next;
        ListNode ans = reverseList(second);
        second.next = head;
        head.next = null;
        return ans;
    }
}
