package from.ant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lcr_0153_Best {
    public List<List<Integer>> pathTarget(TreeNode root, int target) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> ans = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        int sum = root.val;
        path.add(root.val);
        backTracing(ans, path, root, target, sum);
        return ans;
    }

    private void backTracing(List<List<Integer>> ans, LinkedList<Integer> path, TreeNode root, int target, int sum) {

        if (root.right == null && root.left == null) {
            if (sum == target) {
                ans.add(new ArrayList<>(path));
                return;
            }
            return;
        }

        // 左子树
        if (root.left != null) {
            sum += root.left.val;
            path.add(root.left.val);
            backTracing(ans, path, root.left, target, sum);
            sum -= root.left.val;
            path.removeLast();
        }

        // 右子树
        if (root.right != null) {
            sum += root.right.val;
            path.add(root.right.val);
            backTracing(ans, path, root.right, target, sum);
            sum -= root.right.val;
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(-2);
        TreeNode rightNode = new TreeNode(-3);
        node.right = rightNode;

        System.out.println(new Lcr_0153_Best().pathTarget(node, -5));
    }
}
