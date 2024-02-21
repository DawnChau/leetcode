package from.ant;

public class Lcr_0175_Best {
    public int calculateDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return 1 + Math.max(calculateDepth(root.left), calculateDepth(root.right));
    }
}
