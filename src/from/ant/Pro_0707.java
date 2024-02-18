package from.ant;

public class Pro_0707 {
}

class MyLinkedList {

    private int size;
    private BiNode dummyHead;
    private BiNode dummyTail;

    public MyLinkedList() {
        this.size = 0;
        dummyHead = new BiNode(-1);
        dummyTail = new BiNode(-1);

        dummyHead.next = dummyTail;
        dummyHead.pre = dummyTail;

        dummyTail.next = dummyHead;
        dummyTail.pre = dummyHead;
    }

    public int get(int index) {
        if (index < 0 || index > size - 1) {
            return -1;
        }
        BiNode cur = dummyHead;
        while (index >= 0) {
            cur = cur.next;
            index--;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size || index < 0) {
            return;
        }
        BiNode cur = dummyHead;
        while (index > 0) {
            cur = cur.next;
            index--;
        }
        BiNode node = new BiNode(val);
        cur.next.pre = node;
        node.next = cur.next;
        node.pre = cur;
        cur.next = node;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size || index < 0) {
            return;
        }
        BiNode cur = dummyHead;
        while (index >= 0) {
            cur = cur.next;
            index--;
        }

        cur.pre.next = cur.next;
        cur.next.pre = cur.pre;
        size--;
    }
}

class BiNode {
    int val;
    BiNode pre;
    BiNode next;

    public BiNode(int val) {
        this.val = val;
    }
}