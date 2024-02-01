package from.ant;

@SuppressWarnings("Duplicates")
public class Pro_0235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q || root == null) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // 既找到了p，又找到了q
        if (left != null && right != null) {
            return root;
        } else if (left != null && right == null) {
            // 在left中找到p和q
            return left;
        } else if (right != null && left == null) {
            // 在right中找到p和q
            return right;
        } else {
            return null;
        }
    }
}
