package from.ant;

/**
 * 求二叉树的最小深度
 */
public class Pro_0111 {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }else if (root.left == null && root.right != null) {
            return minDepth(root.right) + 1;
        } else if (root.left != null && root.right == null) {
            return minDepth(root.left) + 1;
        } else {
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        }

    }
}
