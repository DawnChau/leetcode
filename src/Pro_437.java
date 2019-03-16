public class Pro_437 {
    public static int pathSum(TreeNode root, int sum) {
        if (root == null)
            return 0;
        int res = findPath(root, sum);

        // 注意这个地方是递归调用pathSum
        res += pathSum(root.left, sum);
        res += pathSum(root.right, sum);
        return res;
    }

    /**
     * 以node为根节点
     *
     * @param node
     * @param sum
     * @return
     */
    private static int findPath(TreeNode node, int sum) {
        int res = 0;
        if (node == null)
            return 0;
        if (node.val == sum)
            res++;
        res += findPath(node.left, sum - node.val);
        res += findPath(node.right, sum - node.val);
        return res;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
//        TreeNode node2 = new TreeNode(2);
//        TreeNode node3 = new TreeNode(3);
//
//        node1.right = node2;
//        node2.right = node3;

        System.out.println(pathSum(node1, 1));

    }
}
