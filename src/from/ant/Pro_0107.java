package from.ant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Pro_0107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();

            List<Integer> row = new ArrayList<>();

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
            res.add(row);

        }

        return reverse(res);
    }

    private List<List<Integer>> reverse(List<List<Integer>> res) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = res.size() - 1; i >= 0; i--) {
            ans.add(res.get(i));
        }
        return ans;
    }
}
