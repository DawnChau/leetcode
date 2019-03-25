import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 层次遍历如果要记录层次，用Pair
 */
public class Pro_111 {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();
        q.add(new Pair<>(root, 1));
        int min = Integer.MAX_VALUE;
        while (!q.isEmpty()) {
            Pair<TreeNode, Integer> cur = q.poll();
            if (cur.getKey().left == null && cur.getKey().right == null) {
                // 找到叶子节点
                return cur.getValue();
            } else {
                if (cur.getKey().left != null)
                    q.add(new Pair<>(cur.getKey().left, cur.getValue() + 1));
                if (cur.getKey().right != null)
                    q.add(new Pair<>(cur.getKey().right, cur.getValue() + 1));
            }
        }
        return 0;
    }
}
