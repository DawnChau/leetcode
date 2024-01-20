package from.ant;

import java.util.LinkedList;
import java.util.Queue;

public class Pro_0222 {

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.offer(root);
        int count = 0;
        while (!treeNodes.isEmpty()) {
            int len = treeNodes.size();
            count += len;
            while (len > 0) {
                TreeNode node = treeNodes.poll();
                if (node.left != null) {
                    treeNodes.offer(node.left);
                }
                if (node.right != null) {
                    treeNodes.offer(node.right);
                }
                len--;
            }
        }
        return count;

    }
}
