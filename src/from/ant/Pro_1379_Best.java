package from.ant;

import java.util.Objects;

public class Pro_1379_Best {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == target){
            return cloned;
        }

        TreeNode treeNode = null;
        if(Objects.nonNull(original.left)){
            treeNode = getTargetCopy(original.left, cloned.left, target);
        }

        if(Objects.isNull(treeNode) && Objects.nonNull(original.right)){
            treeNode =  getTargetCopy(original.right, cloned.right, target);
        }

        return treeNode;
    }
}
