import javafx.util.Pair;

import java.util.*;

public class Pro_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
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
        for (int i = 0; i < res.size(); i++) {
            if (i % 2 == 1)
                Collections.reverse(res.get(i));
        }
        return res;
    }
}
