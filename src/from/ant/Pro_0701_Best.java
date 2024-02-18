package from.ant;

public class Pro_0701_Best {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val > root.val) {
            root.right = insertIntoBST(root.right, val);
        }
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        }
        return root;
    }
}
