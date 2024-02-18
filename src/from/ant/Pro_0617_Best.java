package from.ant;

public class Pro_0617_Best {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }

        if (root1 == null) {
            root2.left = mergeTrees(null, root2.left);
            root2.right = mergeTrees(null, root2.right);
            return root2;
        }

        if (root2 == null) {
            root1.left = mergeTrees(root1.left, null);
            root1.right = mergeTrees(root1.right, null);
            return root1;
        }

        TreeNode node = new TreeNode(root1.val + root2.val);
        node.left = mergeTrees(root1.left, root2.left);
        node.right = mergeTrees(root1.right, root2.right);
        return node;
    }
}
