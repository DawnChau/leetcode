/**
 * 二叉树的公共最小祖先
 */
public class Pro_236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;
        // 递归中止条件
        if (root == p || root == q)
            return root;
        // 如果左右子树都不为空，那么公共祖先一定是父节点
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null)
            // 左右子树都不为空
            return root;
        // 如果左子树为空，则公共祖先在右子树里，反之亦然
        return left == null ? right : left;
    }
}
