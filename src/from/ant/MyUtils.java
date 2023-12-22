package from.ant;

public class MyUtils {

    public static String printArray(int[] nums) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
            if (i != nums.length - 1) {
                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public static String printListNode(ListNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        ListNode index = node;
        while (index != null) {
            sb.append(index.val);
            if (index.next != null) {
                sb.append(',');
            }
            index = index.next;
        }
        sb.append(']');
        return sb.toString();
    }

    public static ListNode buildListNodeFromArray(int[] nums){
        ListNode head = new ListNode();
        ListNode index = head;
        for (int num : nums) {
            ListNode temp = new ListNode(num);
            index.next = temp;
            index = temp;
        }
        return head.next;
    }
}
