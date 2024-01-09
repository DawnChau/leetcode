package from.ant;

import java.util.ArrayList;
import java.util.List;

public class Pro_0144_Best {

    // 递归法-Best
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        preorderTraversal(root, ans);
        return ans;
    }

    private void preorderTraversal(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }
        ans.add(root.val);
        preorderTraversal(root.left, ans);
        preorderTraversal(root.right, ans);
    }
}
