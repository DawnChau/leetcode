package from.ant;

import java.util.ArrayList;
import java.util.List;

public class Pro_0894 {
    public List<TreeNode> allPossibleFBT(int n) {

        List<TreeNode> nodes = new ArrayList<>();
        if (n % 2 == 0) {
            return new ArrayList<>();
        }

        if (n == 1) {
            nodes.add(new TreeNode(0));
            return nodes;
        }

        for (int i = 1; i <= n - 1; i+=2) {
            List<TreeNode> leftNodes = allPossibleFBT(i);
            List<TreeNode> rightNodes = allPossibleFBT(n - 1 - i);

            for (TreeNode leftNode : leftNodes) {
                for (TreeNode rightNode : rightNodes) {
                    nodes.add(new TreeNode(0, leftNode, rightNode));
                }
            }
        }
        return nodes;

    }

    public static void main(String[] args) {
        System.out.println(new Pro_0894().allPossibleFBT(5));
    }
}
