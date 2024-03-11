package from.ant;

public class Pro_0469 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int nums = nums1[i];
            int ans = -1;
            boolean found = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums) {
                    found = true;
                }
                if(found && nums2[j] > nums){
                    ans = nums2[j];
                    break;
                }
            }
            res[i] = ans;
        }
        return res;
    }
}
