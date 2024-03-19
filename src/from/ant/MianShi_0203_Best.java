package from.ant;

public class MianShi_0203_Best {
    public void deleteNode(ListNode node) {
        ListNode pre = node;
        while (node.next != null){
            pre = node;
            node.val = node.next.val;
            node = node.next;
        }
        pre.next = null;
    }
}
