package from.ant;

import java.util.HashMap;
import java.util.HashSet;

public class Pro_0133 {
    public Node cloneGraph(Node node) {
        HashMap<Node, Node> nodeMapping = new HashMap<>();
        return dfs(node, nodeMapping);
    }

    private Node dfs(Node node, HashMap<Node, Node> nodeMapping) {
        if(node == null){
            return null;
        }
        if(nodeMapping.containsKey(node)){
            return nodeMapping.get(node);
        }
        Node copiedNode = new Node(node.val);
        nodeMapping.put(node, copiedNode);
        for (Node child : node.children) {
            copiedNode.children.add(dfs(child, nodeMapping));
        }
        return copiedNode;
    }
}
