package from.ant;

public class Pro_0530 {


    public int getMinimumDifference(TreeNode root) {
        int min = Integer.MAX_VALUE;
        if (root == null) {
            return min;
        }
        int val = root.val;

        // 获取左子树的最大值
        if (root.left != null) {

            // 比较当前节点和左子树最大值的差值
            min = Math.min(min, Math.abs(val - getMax(root.left)));
        }
        // 获取右子树的最小值
        if (root.right != null) {

            // 比较当前节点和右子树最小值的差值
            min = Math.min(min, Math.abs(val - getMin(root.right)));
        }

        // 递归判断左右子树的每个节点的最小值
        return Math.min(Math.min(getMinimumDifference(root.left), min), getMinimumDifference(root.right));
    }

    private int getMax(TreeNode left) {
        while (left.right != null){
            left = left.right;
        }
        return left.val;
    }

    private int getMin(TreeNode right) {
        while (right.left != null){
            right = right.left;
        }
        return right.val;
    }
}
