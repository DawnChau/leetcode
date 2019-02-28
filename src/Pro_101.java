/**
 * 判断一棵树是不是对称的
 */
public class Pro_101 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return isSymmetric(root.left,root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right){
        if(left== null && right==null)
            return true;
        // 首先这两个值应该是相等的
        if((left==null && right !=null) ||(left!=null && right==null)|| (left.val!=right.val))
            return false;
        // 这两个值的左->左应当和右->右相等。左->右应该和右->左相等
        return isSymmetric(left.left,right.right) && isSymmetric(right.left,left.right);
    }
}
