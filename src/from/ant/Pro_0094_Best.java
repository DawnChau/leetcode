package from.ant;

import java.util.ArrayList;
import java.util.List;

public class Pro_0094_Best {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorderTraversal(root, ans);
        return ans;
    }

    private void inorderTraversal(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, ans);
        ans.add(root.val);
        inorderTraversal(root.right, ans);
    }
}
