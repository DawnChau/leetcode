package from.ant;

public class Pro_1261_Best {
}

class FindElements {

    private TreeNode node;
    // 2的20次方-1等于1048575
    private int[] values = new int[1050001];

    public FindElements(TreeNode root) {
        node = adjust(root, 0);
    }

    private TreeNode adjust(TreeNode root, int val) {
        root.val = val;
        values[val] = 1;
        if (root.left != null) {
            adjust(root.left, val * 2 + 1);
        }
        if (root.right != null) {
            adjust(root.right, val * 2 + 2);
        }
        return root;
    }

    public boolean find(int target) {
        return values[target] == 1;
    }
}
