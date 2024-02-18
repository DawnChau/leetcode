package from.ant;

public class Pro_0106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0) {
            return null;
        }
        int val = postorder[postorder.length - 1];
        int inorderValIndex = -1;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == val) {
                inorderValIndex = i;
            }
        }

        int[] inorderLeft = getSubArray(inorder, 0, inorderValIndex - 1);
        int[] inorderRight = getSubArray(inorder, inorderValIndex + 1, inorder.length - 1);

        int[] postorderLeft = getSubArray(postorder, 0, inorderLeft.length - 1);
        int[] postorderRight = getSubArray(postorder, inorderLeft.length, postorder.length - 2);

        TreeNode node = new TreeNode(val);
        node.left = buildTree(inorderLeft, postorderLeft);
        node.right = buildTree(inorderRight, postorderRight);
        return node;
    }

    private int[] getSubArray(int[] inorder, int start, int end) {
        int[] res = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            res[i - start] = inorder[i];
        }
        return res;
    }
}
