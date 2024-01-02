package from.ant;

public class Pro_0226_Best {
    public TreeNode invertTree(TreeNode root) {

        if(root == null){
            return null;
        }

        if(root.left == null && root.right == null){
            return root;
        }

        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = invertTree(right);
        root.right = invertTree(left);
        return root;
    }
}
