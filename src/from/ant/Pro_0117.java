package from.ant;

import java.util.LinkedList;
import java.util.Queue;

public class Pro_0117 {
    public Node0117 connect(Node0117 root) {

        if (root == null){
            return null;
        }
        Queue<Node0117> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size > 0){
                Node0117 temp = queue.poll();
                if(temp.left != null){
                    queue.offer(temp.left);
                }
                if(temp.right != null){
                    queue.offer(temp.right);
                }
                if(size > 0){
                    temp.next = queue.peek();
                }
                size--;
            }
        }
        return root;
    }
}


class Node0117 {
    public int val;
    public Node0117 left;
    public Node0117 right;
    public Node0117 next;

    public Node0117() {}

    public Node0117(int _val) {
        val = _val;
    }

    public Node0117(int _val, Node0117 _left, Node0117 _right, Node0117 _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};