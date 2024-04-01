package from.ant;

public class Pro_1315_Best {

    private int ans = 0;

    public int sumEvenGrandparent(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.val % 2 == 0) {
            calcGrandSon(root);
        }

        sumEvenGrandparent(root.left);
        sumEvenGrandparent(root.right);

        return ans;
    }

    private void calcGrandSon(TreeNode root) {
        if (root.left != null) {
            ans += getVal(root.left.left);
            ans += getVal(root.left.right);
        }

        if(root.right != null){
            ans += getVal(root.right.left);
            ans += getVal(root.right.right);
        }
    }

    private int getVal(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return node.val;
    }
}
