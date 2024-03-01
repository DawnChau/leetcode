package from.ant;

public class Pro_0108_Best {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid;
        if ((end - start) % 2 == 1) {
            mid = start + (end - start) / 2 + 1;
        } else {
            mid = start + (end - start) / 2;
        }

        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(nums, start, mid - 1);
        node.right = sortedArrayToBST(nums, mid + 1, end);
        return node;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2};
        System.out.println(new Pro_0108_Best().sortedArrayToBST(nums));
    }
}
