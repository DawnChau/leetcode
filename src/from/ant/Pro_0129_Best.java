package from.ant;

import java.util.ArrayList;
import java.util.List;

public class Pro_0129_Best {
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        List<Integer> ans = new ArrayList<>();
        int path = root.val;
        backTracing(ans, path, root);
        int sum = 0;
        for (Integer an : ans) {
            sum += an;
        }
        return sum;
    }

    private void backTracing(List<Integer> ans, int path, TreeNode root) {
        // 找到叶子节点
        if (root.left == null && root.right == null) {
            ans.add(path);
            return;
        }

        // 左子树
        if (root.left != null) {
            path *= 10;
            path += root.left.val;
            backTracing(ans, path, root.left);
            path -= root.left.val;
            path /= 10;
        }

        // 右子树
        if (root.right != null) {
            path *= 10;
            path += root.right.val;
            backTracing(ans, path, root.right);
            path -= root.right.val;
            path /= 10;
        }
    }
}
