package from.ant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MianShi_0403 {
    public ListNode[] listOfDepth(TreeNode tree) {
        if (tree == null) {
            return new ListNode[0];
        }

        Queue<TreeNode> queue = new LinkedList<>();
        List<ListNode> nodes = new ArrayList<>();
        queue.offer(tree);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ListNode head = new ListNode();
            ListNode pre = head;
            while (size > 0) {
                TreeNode temp = queue.poll();
                ListNode cur = new ListNode(temp.val);
                pre.next = cur;
                pre = cur;
                if (temp.left!= null) {
                    queue.offer(temp.left);
                }
                if (temp.right != null) {
                    queue.offer(temp.right);
                }
                size--;
            }
            nodes.add(head.next);
        }
        return nodes.toArray(new ListNode[0]);
    }
}
