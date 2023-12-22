package from.ant;

/**
 * 合并两个有序链表
 */
public class Pro_0021 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode index1 = list1;
        ListNode index2 = list2;

        ListNode resHead = new ListNode();
        ListNode resCur = resHead;

        while (index1 != null || index2 != null) {
            if (index1 == null) {
                resCur.next = index2;
                break;
            }

            if (index2 == null) {
                resCur.next = index1;
                break;
            }

            if (index2.val <= index1.val) {
                resCur.next = index2;
                index2 = index2.next;
            } else {
                resCur.next = index1;
                index1 = index1.next;
            }

            resCur = resCur.next;

        }

        return resHead.next;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{};
        System.out.println(MyUtils.printListNode(new Pro_0021().mergeTwoLists(
                MyUtils.buildListNodeFromArray(nums1), MyUtils.buildListNodeFromArray(nums2)
        )));
    }
}
