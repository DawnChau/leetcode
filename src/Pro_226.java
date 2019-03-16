/**
 * 谷歌惨案——反转二叉树
 */
public class Pro_226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;

        invertTree(root.left);
        invertTree(root.right);
        // 交换
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
}
