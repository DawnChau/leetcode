package from.ant;

import java.util.Optional;

/**
 * 链表反转，三指针
 */
public class Lcr_0123 {
    public int[] reverseBookList(ListNode head) {
        if (head == null) {
            return new int[0];
        }
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode cur = head;
        // 注意！！！需要next节点，但是不翻转next和cur的关系，只翻转pre和cur的关系
        // 这个地方也可以不用next节点，在while里用nextTemp
        ListNode next = cur.next;
        int count = 0;
        while (cur != null) {
            cur.next = pre;
            pre = cur;
            cur = next;
            next = Optional.ofNullable(next).map(a -> a.next).orElse(null);
            count++;
        }
        head.next = null;
        dummyHead.next = pre;

        int[] res = new int[count];
        cur = pre;
        int index = 0;
        while (cur != null) {
            res[index++] = cur.val;
            cur = cur.next;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 6, 4, 1};
        System.out.println(MyUtils.printArray(new Lcr_0123().reverseBookList(MyUtils.buildListNodeFromArray(nums))));
    }
}
