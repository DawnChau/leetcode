package from.ant;

public class Pro_0559_Best {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.children.size() == 0) {
            return 1;
        }

        int max = Integer.MIN_VALUE;
        for (Node child : root.children) {
            max = Math.max(maxDepth(child), max);
        }
        return max + 1;
    }
}
