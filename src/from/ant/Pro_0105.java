package from.ant;

public class Pro_0105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        if (preorder.length == 1) {
            return new TreeNode(preorder[0]);
        }

        int val = preorder[0];
        TreeNode node = new TreeNode(val);

        int valInOrderIndex = findIndex(inorder, val);
        int[] inOrderLeft = getNewArray(inorder, 0, valInOrderIndex - 1);
        int[] inOrderRight = getNewArray(inorder, valInOrderIndex + 1, inorder.length - 1);

        int[] preOrderLeft = getNewArray(preorder, 1, inOrderLeft.length);
        int[] preOrderRight = getNewArray(preorder, inOrderLeft.length + 1, preorder.length - 1);

        node.left = buildTree(preOrderLeft, inOrderLeft);
        node.right = buildTree(preOrderRight, inOrderRight);
        return node;
    }

    private int[] getNewArray(int[] inorder, int start, int end) {
        int[] ans = new int[end - start + 1];
        int index = 0;
        for (int i = start; i <= end; i++) {
            ans[index++] = inorder[i];
        }
        return ans;
    }

    private int findIndex(int[] inorder, int val) {
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == val) {
                return i;
            }
        }
        return -1;
    }
}
