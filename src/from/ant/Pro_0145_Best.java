package from.ant;

import java.util.ArrayList;
import java.util.List;

public class Pro_0145_Best {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postorderTraversal(root, ans);
        return ans;
    }

    private void postorderTraversal(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }
        postorderTraversal(root.left, ans);
        postorderTraversal(root.right, ans);
        ans.add(root.val);
    }
}
