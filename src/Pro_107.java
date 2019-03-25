import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 层次遍历，逆序输出
 */

public class Pro_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<List<Integer>> reverse = new ArrayList<>();
        if (root == null)
            return res;

        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(root, 0));
        while (!queue.isEmpty()) {
            TreeNode node = queue.peek().getKey();
            int level = queue.peek().getValue();
            queue.poll();

            // 需要新加
            if (level == res.size()) {
                res.add(new ArrayList<>());
            }
            res.get(level).add(node.val);
            if (node.left != null)
                queue.add(new Pair<>(node.left, level + 1));
            if (node.right != null) {
                queue.add(new Pair<>(node.right, level + 1));
            }
        }
        for (int i = res.size() - 1; i >= 0; i--) {
            reverse.add(res.get(i));
        }
        return reverse;
    }
}
