package from.ant;

public class Lcp_0067_Best {
    public TreeNode expandBinaryTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        if (root.left != null) {
            TreeNode temp = root.left;
            root.left = new TreeNode(-1);
            root.left.left = expandBinaryTree(temp);
        }

        if (root.right != null) {
            TreeNode temp = root.right;
            root.right = new TreeNode(-1);
            root.right.right = expandBinaryTree(temp);
        }
        return root;
    }
}
