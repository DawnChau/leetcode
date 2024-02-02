package from.ant;

public class Pro_0654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {

        if (nums.length == 0) {
            return null;
        }

        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }

        int maxIndex = -1;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                maxIndex = i;
                maxValue = nums[i];
            }
        }

        TreeNode node = new TreeNode(maxValue);
        node.left = constructMaximumBinaryTree(getSubArray(0, maxIndex - 1, nums));
        node.right = constructMaximumBinaryTree(getSubArray(maxIndex + 1, nums.length - 1, nums));
        return node;
    }

    private int[] getSubArray(int startIndex, int endIndex, int[] nums) {
        int[] ans = new int[endIndex - startIndex + 1];
        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            ans[index++] = nums[i];
        }
        return ans;
    }
}
