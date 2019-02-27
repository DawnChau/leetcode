/**
 * 将有序数组转换成儿茶搜索树
 */
public class Pro_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
            return null;
        return biSearch(nums,0,nums.length-1);
    }

    private TreeNode biSearch(int[] nums, int left, int right) {
        if(left>right)
            return null;
        int mid = left+(right-left)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = biSearch(nums,left,mid-1);
        node.right = biSearch(nums,mid+1,right);
        return node;
    }
}
