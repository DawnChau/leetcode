package from.ant;

/**
 * 删除链表的倒数第n个节点
 * 思路，快慢指针
 */
public class Pro_0019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // 虚拟节点，处理删除头节点的情况
        ListNode virtualNode = new ListNode();
        virtualNode.next = head;

        // 快指针
        ListNode firstIndex = virtualNode;
        // 慢指针
        ListNode lastIndex = virtualNode;
        // 跨度
        int span = n + 1;

        // 慢指针移动到需要删除的指针的前一个
        while (firstIndex.next != null) {
            span--;
            // 慢指针需要行动
            if (span <= 0) {
                lastIndex = lastIndex.next;
            }
            firstIndex = firstIndex.next;

        }

        // 执行删除
        lastIndex.next = lastIndex.next.next;

        return virtualNode.next;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2};
        System.out.println(MyUtils.printListNode(new Pro_0019().removeNthFromEnd(
                MyUtils.buildListNodeFromArray(nums), 1
        )));
    }
}
