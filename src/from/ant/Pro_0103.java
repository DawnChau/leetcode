package from.ant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Pro_0103 {

    @SuppressWarnings("Duplicates")
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()) {

            List<Integer> row = new ArrayList<>();
            int len = queue.size();
            while (len > 0) {
                TreeNode node = queue.poll();
                row.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }

                len--;
            }
            if (level % 2 == 1) {
                ans.add(reverseList(row));
            } else {
                ans.add(row);
            }
            level++;

        }

        return ans;

    }

    private List<Integer> reverseList(List<Integer> row) {
        List<Integer> res = new ArrayList<>();
        for (int i = row.size() - 1; i >= 0; i--) {
            res.add(row.get(i));
        }
        return res;
    }
}
