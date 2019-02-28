/**
 * 查找链表的交汇点————共尾
 */
public class Pro_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA==null || headB == null)
            return null;

        ListNode p1 = headA;
        ListNode p2 = headB;

        while(p1!=null && p2!=null){
            p1 = p1.next;
            p2 = p2.next;
        }

        // p1 长,headA先行
        while(p1!=null){
            p1 = p1.next;
            headA = headA.next;
        }

        // p2 长,headB先行
        while(p2!=null){
            p2 = p2.next;
            headB = headB.next;
        }

        while(headA!=null && headB!=null){
            // 不能比较val，只能比较指针
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
