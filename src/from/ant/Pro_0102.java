package from.ant;

import java.util.*;

public class Pro_0102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        Map<TreeNode, Integer> nodeToLevel = new HashMap<>();
        nodeToLevel.put(root, 1);

        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            int level = nodeToLevel.get(node);

            if (node.left != null) {
                nodeToLevel.put(node.left, level + 1);
                queue.add(node.left);
            }
            if (node.right != null) {
                nodeToLevel.put(node.right, level + 1);
                queue.add(node.right);
            }

            if (res.size() < level) {
                List<Integer> list = new ArrayList<>();
                list.add(node.val);
                res.add(list);
            } else {
                res.get(level - 1).add(node.val);
            }
        }

        return res;
    }


    public static void main(String[] args) {
        int[] num = new int[]{3, 9, 20, -1, -1, 15, 7};
        System.out.println(new Pro_0102().levelOrder(MyUtils.arrayToTree(num)));
    }

}
