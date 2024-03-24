package from.ant;

public class Pro_1038_Best {

    private int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root == null) {
            return null;
        }
        bstToGst(root.right);
        int temp = root.val;
        root.val += sum;
        sum += temp;
        bstToGst(root.left);
        return root;
    }
}
