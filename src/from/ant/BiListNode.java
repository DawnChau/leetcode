package from.ant;

public class BiListNode {

    int val;
    BiListNode next;
    BiListNode pre;

    BiListNode() {
    }

    BiListNode(int val) {
        this.val = val;
    }

    BiListNode(int val, BiListNode next, BiListNode pre) {
        this.val = val;
        this.next = next;
        this.pre = pre;
    }

}
