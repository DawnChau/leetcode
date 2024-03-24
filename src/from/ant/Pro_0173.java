package from.ant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pro_0173 {
}

class BSTIterator1 {

    private List<Integer> list = new ArrayList<>();
    private Iterator<Integer> iterator;

    public BSTIterator1(TreeNode root) {

        inorderTraverse(root, list);
        iterator = list.iterator();
    }

    private void inorderTraverse(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorderTraverse(root.left, list);
        list.add(root.val);
        inorderTraverse(root.right, list);
    }

    public int next() {
        return iterator.next();
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }
}
