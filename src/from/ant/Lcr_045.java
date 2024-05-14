package from.ant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Lcr_045 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> values = new ArrayList<>();
        while (!queue.isEmpty()) {
            List<Integer> row = new ArrayList<>();
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                row.add(node.val);
                size--;
            }
            values.add(row);
        }
        return values.get(values.size() - 1).get(0);
    }
}
