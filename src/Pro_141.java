/**
 * 查找链表中是否有环
 */
public class Pro_141 {
    public boolean hasCycle(ListNode head) {
        if(head==null)
            return false;

        ListNode pSlow = head.next;
        if(pSlow == null)
            return false;

        ListNode pFast = head.next.next;
        if(pFast == null)
            return false;
        while(pFast!=null && pSlow!=null && pFast.next!=null){
            if(pFast.val==pSlow.val)
                return true;
            pFast = pFast.next.next; // 不加第三个约束条件的话，这里会报空指针异常
            pSlow = pSlow.next;
        }
        return false;
    }
}
