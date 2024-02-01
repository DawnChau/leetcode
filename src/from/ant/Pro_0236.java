package from.ant;

public class Pro_0236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q || root == null) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // 既找到了p，又找到了q
        if (left != null && right != null) {
            return root;
        } else if (left != null && right == null) {
            // 在left中找到p和q
            return left;
        } else if (right != null && left == null) {
            // 在right中找到p和q
            return right;
        } else {
            return null;
        }
    }


    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(1);

        node1.left = node2;
        node1.right = node3;

        TreeNode node4 = new TreeNode(6);
        TreeNode node5 = new TreeNode(2);

        node2.left = node4;
        node2.right = node5;

        TreeNode node6 = new TreeNode(0);
        TreeNode node7 = new TreeNode(8);

        node3.left = node6;
        node3.right = node7;

        TreeNode node8 = new TreeNode(7);
        TreeNode node9 = new TreeNode(4);

        node5.left = node8;
        node5.right = node9;

        System.out.println(new Pro_0236().lowestCommonAncestor(node1, node2, node9));

    }

}
