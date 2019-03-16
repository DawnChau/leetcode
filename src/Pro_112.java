/**
 * 求二叉树的路径和
 */
public class Pro_112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;

        // 叶子节点
        if (root.left == null && root.right == null) {
            return root.val == sum;
        }

        if (hasPathSum(root.left, sum - root.val))
            return true;

        if (hasPathSum(root.right, sum - root.val))
            return true;
        return false;
    }
}
