/**
 * 判断一个树是否是平衡二叉树
 */
public class Pro_098 {
    public boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBSTHelper(TreeNode root, long lower, long upper) {
        if (root == null)
            return true;
        if (root.val >= upper || root.val <= lower)
            return false;
        return isValidBSTHelper(root.left, lower, root.val) && isValidBSTHelper(root.right, root.val, upper);
    }
}
