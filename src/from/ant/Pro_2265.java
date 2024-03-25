package from.ant;

public class Pro_2265 {

    private int res = 0;

    public int averageOfSubtree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sum = getSum(root);
        int count = getCount(root);
        if (sum / count == root.val) {
            res++;
        }
        averageOfSubtree(root.left);
        averageOfSubtree(root.right);
        return res;
    }


    private int getSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return getSum(root.left) + getSum(root.right) + root.val;
    }

    private int getCount(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return getCount(root.left) + getCount(root.right) + 1;
    }
}
