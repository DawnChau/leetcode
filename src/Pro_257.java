import java.util.ArrayList;
import java.util.List;

/**
 * 递归输出二叉树的路径
 */
public class Pro_257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null)
            return res;
        // 叶子节点退出递归
        if (root.left == null && root.right == null) {
            res.add(String.valueOf(root.val));
            return res;
        }

        List<String> leftStrings = binaryTreePaths(root.left);
        for (int i = 0; i < leftStrings.size(); i++) {
            res.add(root.val + "->" + leftStrings.get(i));
        }

        List<String> rightStrings = binaryTreePaths(root.right);
        for (int i = 0; i < rightStrings.size(); i++) {
            res.add(root.val + "->" + rightStrings.get(i));
        }
        return res;
    }
}
