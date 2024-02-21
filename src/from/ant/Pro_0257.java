package from.ant;

import java.util.ArrayList;
import java.util.List;

public class Pro_0257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append(root.val);
        sb.append("->");
        backTracing(root, sb, ans);
        return ans;
    }

    private void backTracing(TreeNode root, StringBuilder sb, List<String> ans) {
        if (root.left == null && root.right == null) {
            ans.add(sb.substring(0, sb.length() - 2));
            return;
        }

        if (root.left != null) {
            sb.append(root.left.val);
            int size = String.valueOf(root.left.val).length();
            sb.append("->");
            backTracing(root.left, sb, ans);
            sb.delete(sb.length() - 2 - size, sb.length());
        }

        if (root.right != null) {
            sb.append(root.right.val);
            int size = String.valueOf(root.right.val).length();
            sb.append("->");
            backTracing(root.right, sb, ans);
            sb.delete(sb.length() - 2 - size, sb.length());
        }
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.left = node2;
        node1.right = node3;
        System.out.println(new Pro_0257().binaryTreePaths(node1));
    }
}
