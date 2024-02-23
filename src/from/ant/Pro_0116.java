package from.ant;

import java.util.LinkedList;
import java.util.Queue;

public class Pro_0116 {

    public Node0116 connect(Node0116 root) {

        if(root == null){
            return null;
        }

        Queue<Node0116> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size > 0){
                Node0116 temp = queue.poll();
                if(size!=1){
                    temp.next = queue.peek();
                }
                if(temp.left != null){
                    queue.offer(temp.left);
                }
                if(temp.right != null){
                    queue.offer(temp.right);
                }
                size--;
            }
        }
        return root;
    }
}

class Node0116 {
    public int val;
    public Node0116 left;
    public Node0116 right;
    public Node0116 next;

    public Node0116() {}

    public Node0116(int _val) {
        val = _val;
    }

    public Node0116(int _val, Node0116 _left, Node0116 _right, Node0116 _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

