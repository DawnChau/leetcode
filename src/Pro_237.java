/**
 * 删除链表中的node,这个题有意思啊
 */
public class Pro_237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
