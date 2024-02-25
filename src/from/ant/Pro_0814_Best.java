package from.ant;

public class Pro_0814_Best {
    public TreeNode pruneTree(TreeNode root) {
        if (containsAllZero(root)) {
            return null;
        }

        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        return root;

    }

    private boolean containsAllZero(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.val != 0) {
            return false;
        }
        return containsAllZero(root.left) && containsAllZero(root.right);
    }
}
