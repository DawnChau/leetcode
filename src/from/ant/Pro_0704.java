package from.ant;

public class Pro_0704 {

    public int search(int[] nums, int target) {
        return myBinarySearch(nums, 0, nums.length - 1, target);
    }

    private int myBinarySearch(int[] nums, int start, int end, int target) {
        if (start >= end) {
            if (nums[end] == target) {
                return end;
            }
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            return mid;
        }

        int res = myBinarySearch(nums, start, mid, target);
        if (res != -1) {
            return res;
        }
        return myBinarySearch(nums, mid + 1, end, target);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        System.out.println(new Pro_0704().search(nums,2));
    }
}
