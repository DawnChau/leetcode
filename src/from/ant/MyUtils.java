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

    public static ListNode buildListNodeFromArray(int[] nums) {
        ListNode head = new ListNode();
        ListNode index = head;
        for (int num : nums) {
            ListNode temp = new ListNode(num);
            index.next = temp;
            index = temp;
        }
        return head.next;
    }


    public static TreeNode arrayToTree(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        return makeTree(nums, 0);
    }

    private static TreeNode makeTree(int[] nums, int index) {
        TreeNode node = new TreeNode(nums[index]);
        if (2 * index + 1 < nums.length) {
            node.left = makeTree(nums, 2 * index + 1);
        }

        if (2 * index + 2 < nums.length) {
            node.right = makeTree(nums, 2 * index + 2);
        }

        return node;
    }
}
