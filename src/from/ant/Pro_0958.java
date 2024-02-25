package from.ant;

import java.util.LinkedList;
import java.util.Queue;

public class Pro_0958 {

    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int remainsLevel = Integer.MAX_VALUE;
        while (!queue.isEmpty() && remainsLevel > 0) {
            int size = queue.size();
            boolean occurNullChild = false;
            while (size > 0) {
                TreeNode node = queue.poll();
                if (!isValid(node, occurNullChild)) {
                    return false;
                }
                if (node.left == null || node.right == null) {
                    occurNullChild = true;
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                size--;
            }
            remainsLevel--;
            // 下一层应该是最后一层
            if (occurNullChild && remainsLevel != 1 && remainsLevel != 0) {
                remainsLevel = 1;
            }
        }
        return queue.isEmpty();
    }

    private boolean isValid(TreeNode node, boolean occurNullChild) {
        // 出现空孩子，后续都得是空孩子
        if (occurNullChild) {
            return !(node.right != null || node.left != null);
        }
        // 只有右子树，没有左子树
        return !(node.right != null && node.left == null);
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(1);

        node1.left = node2;
        node1.right = node3;
        System.out.println(new Pro_0958().isCompleteTree(node1));
    }


}
