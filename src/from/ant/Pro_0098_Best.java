package from.ant;

public class Pro_0098_Best {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.left != null) {
            if (root.val <= root.left.val) {
                return false;
            }

            if (!isValidLeftBST(root.left, root.val)) {
                return false;
            }
        }

        if (root.right != null) {
            if (root.val >= root.right.val) {
                return false;
            }

            if (!isValidRightBST(root.right, root.val)) {
                return false;
            }
        }

        return true;
    }

    private boolean isValidRightBST(TreeNode root, int val) {
        if (!isValidBST(root)) {
            return false;
        }
        // 右子树最小的节点，是不是比根节点还要大？
        while (root.left != null) {
            // 如果比根节点小，那么这个不是二叉搜索树
            if (root.left.val <= val) {
                return false;
            }
            root = root.left;
        }
        return true;
    }

    private boolean isValidLeftBST(TreeNode root, int val) {
        if (!isValidBST(root)) {
            return false;
        }

        // 左子树最大的节点，是不是比根节点还要小？
        while (root.right != null) {
            // 如果比根节点大，那么这个不是二叉搜索树
            if (root.right.val >= val) {
                return false;
            }
            root = root.right;
        }
        return true;
    }


}
