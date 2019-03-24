/**
 * 判断二叉树是否是平衡二叉树
 */
public class Pro_110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        if (Math.abs(height(root.left) - height(root.right)) >= 2)
            return false;
        if (!(isBalanced(root.left) && isBalanced(root.right)))
            return false;
        return true;
    }

    private int height(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        root.left = node1;
        root.right = node2;
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(4);
        node1.left = node3;
        node1.right = node4;
        TreeNode node6 = new TreeNode(4);
        node3.left = node5;
        node3.right = node6;
        System.out.println(new Pro_110().isBalanced(root));
    }
}
