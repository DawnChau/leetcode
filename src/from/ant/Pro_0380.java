package from.ant;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

// 最优解可以不用双向链表，可以用list即可，list删除的时候，也是O1的，用最后一个元素覆盖当前元素
public class Pro_0380 {

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        System.out.println(randomizedSet.insert(1));
        System.out.println(randomizedSet.remove(2));
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.remove(1));
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.getRandom());
    }
}

class RandomizedSet {

    private Map<Integer, BiListNode> listNodeMap;
    private BiListNode dummyHead;
    private BiListNode dummyTail;
    private int size;


    public RandomizedSet() {
        listNodeMap = new HashMap<>();

        dummyHead = new BiListNode(-1);
        dummyTail = new BiListNode(-1);

        dummyHead.pre = dummyTail;
        dummyHead.next = dummyTail;

        dummyTail.pre = dummyHead;
        dummyTail.next = dummyHead;
        size = 0;
    }

    public boolean insert(int val) {
        if(listNodeMap.containsKey(val)){
            return false;
        }
        BiListNode listNode = new BiListNode(val);

        listNode.pre = dummyTail.pre;
        listNode.next = dummyTail;
        dummyTail.pre.next = listNode;
        dummyTail.pre = listNode;

        listNodeMap.put(val, listNode);
        size++;
        return true;
    }

    public boolean remove(int val) {

        if (!listNodeMap.containsKey(val)) {
            return false;
        }

        BiListNode node = listNodeMap.get(val);
        node.pre.next = node.next;
        node.next.pre = node.pre;
        node.next = null;
        node.pre = null;
        listNodeMap.remove(val);
        size--;
        return true;
    }

    public int getRandom() {
        Random random = new Random();
        int randomStep = random.nextInt(size);
        randomStep++;

        BiListNode cur = dummyHead;
        while (randomStep > 0) {
            cur = cur.next;
            randomStep--;
        }
        return cur.val;
    }

}