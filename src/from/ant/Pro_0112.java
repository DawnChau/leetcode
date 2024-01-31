package from.ant;

import java.util.concurrent.atomic.AtomicBoolean;

public class Pro_0112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        int sum = root.val;
        AtomicBoolean ans = new AtomicBoolean(false);
        backTracing(root, sum, targetSum, ans);
        return ans.get();
    }

    private void backTracing(TreeNode root, int sum, int targetSum, AtomicBoolean ans) {
        // 叶子节点
        if (root.left == null && root.right == null) {
            if (sum == targetSum) {
                ans.set(true);
            }
            return;
        }

        if (root.left != null) {
            // 左子树
            sum += root.left.val;
            backTracing(root.left, sum, targetSum, ans);
            sum -= root.left.val;
        }


        if(root.right != null){
            // 右子树
            sum += root.right.val;
            backTracing(root.right, sum, targetSum, ans);
            sum -= root.right.val;
        }

    }
}
