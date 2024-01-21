package from.ant;

public class Pro_0101_Best {

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        // 反转左子树
        reverseNode(root.left);
        return isSame(root.left, root.right);
    }

    private boolean isSame(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        return isSame(left.left, right.left) && isSame(left.right, right.right);
    }

    private TreeNode reverseNode(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = root.left;
        root.left = reverseNode(root.right);
        root.right = reverseNode(left);
        return root;

    }
}
