package from.ant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lcr_0055_Best {
}

class BSTIterator {

    private List<Integer> tree = new ArrayList<>();
    private Iterator<Integer> iterator;

    public BSTIterator(TreeNode root) {
        inOrder(root, tree);
        iterator = tree.iterator();
    }

    private void inOrder(TreeNode root, List<Integer> tree) {
        if (root == null) {
            return;
        }
        inOrder(root.left, tree);
        tree.add(root.val);
        inOrder(root.right, tree);
    }

    public int next() {
        return iterator.next();
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }
}
