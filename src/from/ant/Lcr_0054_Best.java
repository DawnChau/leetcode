package from.ant;

public class Lcr_0054_Best {

    private int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        root.right = convertBST(root.right);
        int temp = root.val;
        // 当前节点加上和
        root.val += sum;
        // 和加上当前节点
        sum += temp;
        root.left = convertBST(root.left);
        return root;
    }
}
