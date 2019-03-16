// leetcode中需要加入这一句

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 * 层次遍历
 */
public class Pro_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
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
        return res;
    }
}
