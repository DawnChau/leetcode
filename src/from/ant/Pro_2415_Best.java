package from.ant;

public class Pro_2415_Best {
    public TreeNode reverseOddLevels(TreeNode root) {
        reverseOddLevels(root.left, root.right, 1);
        return root;
    }

    private void reverseOddLevels(TreeNode left, TreeNode right, int level) {
        if (left == null) {
            return;
        }
        if (level % 2 == 1) {
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }


        level++;
        reverseOddLevels(left.left, right.right, level);
        reverseOddLevels(left.right, right.left, level);
    }
}
