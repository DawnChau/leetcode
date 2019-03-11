/**
 * 寻找二叉搜索树中第k小的数
 * 方法，统计左子树中节点的个数
 */
public class Pro_230 {
    public int kthSmallest(TreeNode root, int k) {
        int leftCount = count(root.left);
        if (leftCount == k - 1)
            return root.val;
        else if (leftCount > k - 1) {
            // 在左子树中
            return kthSmallest(root.left, k);
        } else {
            // 在右子树中
            return kthSmallest(root.right, k - leftCount - 1);
        }
    }

    /**
     * 统计树node 中节点的个数
     *
     * @param node
     * @return
     */
    private int count(TreeNode node) {
        if (node == null)
            return 0;
        return count(node.left) + count(node.right) + 1;
    }


}
