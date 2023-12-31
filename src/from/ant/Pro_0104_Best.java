package from.ant;

public class Pro_0104_Best {

    public int maxDepth(TreeNode root) {
        if (root == null) {

            return 0;

        }

        if (root.left == null && root.right == null) {

            return 1;

        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
