package from.ant;

/**
 * 逆转链表
 * 需要注意一下，对头节点需要单独处理
 */
public class Pro_0206 {

    public ListNode reverseList(ListNode head) {

        // 处理只有零个或者一个节点的场景
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = head;
        ListNode cur = head.next;
        
        // 需要注意一下，对头节点需要单独处理
        head.next = null;
        ListNode next = null;

        while (cur != null) {

            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;

        }

        return pre;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 4, 5};
        System.out.println(MyUtils.printListNode(new Pro_0206().reverseList(
                MyUtils.buildListNodeFromArray(nums1)
        )));
    }
}
