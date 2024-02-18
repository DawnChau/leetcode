package from.ant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pro_0113 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        LinkedList<Integer> path = new LinkedList<>();
        path.offer(root.val);
        backTracing(ans, path, root, targetSum - root.val);
        return ans;
    }

    private void backTracing(List<List<Integer>> ans, LinkedList<Integer> path, TreeNode root, int targetSum) {
        // 叶子节点
        if (root.left == null && root.right == null && targetSum == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }

        // 左子树
        if (root.left != null) {
            targetSum -= root.left.val;
            path.offer(root.left.val);
            backTracing(ans, path, root.left, targetSum);
            targetSum += root.left.val;
            path.removeLast();
        }

        // 右子树
        if (root.right != null) {
            targetSum -= root.right.val;
            path.offer(root.right.val);
            backTracing(ans, path, root.right, targetSum);
            targetSum += root.right.val;
            path.removeLast();
        }

    }
}
