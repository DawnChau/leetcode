
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树中序遍历，迭代
 */
public class Pro_094 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root==null)
            return res;
        TreeNode cur = root;
        while(cur!=null|| !stack.isEmpty()){
            // 向着左边压入栈
            while(cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            // 弹出一个，肯定属于最左边
            cur = stack.pop();
            res.add(cur.val);
            // 将右边的压入栈
            cur = cur.right;
        }
        return res;
    }
}
