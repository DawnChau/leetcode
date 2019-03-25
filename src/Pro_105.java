/**
 * 根据前序中序遍历构造二叉树
 */
public class Pro_105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int[] inorder, int preStart, int inStart, int inEnd) {
        if (preStart > preorder.length - 1 || inStart > inEnd)
            return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        // 记录根节点的位置
        int index = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (root.val == inorder[i]) {
                index = i;
                break;
            }
        }
        root.left = build(preorder, inorder, preStart + 1, inStart, index - 1);
        root.right = build(preorder, inorder, preStart + index - inStart + 1, index + 1, inEnd);
        return root;
    }
}
