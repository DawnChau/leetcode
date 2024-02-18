package from.ant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Pro_0429 {

    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {

            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            while (size > 0) {
                Node temp = queue.poll();
                level.add(temp.val);
                if (temp.children != null && temp.children.size() > 0) {
                    for (Node child : temp.children) {
                        queue.offer(child);
                    }
                }
                size--;
            }
            res.add(level);
        }
        return res;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
