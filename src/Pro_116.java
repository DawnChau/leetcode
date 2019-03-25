/**
 * 二叉树加入了层次指针
 */
public class Pro_116 {
    public TNode connect(TNode root) {
        TNode levelStart = root;
        while (levelStart != null) {
            TNode cur = levelStart;
            while (cur != null) {
                if (cur.left != null)
                    cur.left.next = cur.right;
                if (cur.right != null && cur.next != null)
                    cur.right.next = cur.next.left;

                cur = cur.next;
            }
            levelStart = levelStart.left;
        }
        return root;
    }
}

class TNode {
    public int val;
    public TNode left;
    public TNode right;
    public TNode next;

    public TNode() {
    }

    public TNode(int _val, TNode _left, TNode _right, TNode _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};