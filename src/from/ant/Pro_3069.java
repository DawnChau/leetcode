package from.ant;

public class Pro_3069 {
    public int[] resultArray(int[] nums) {
        int[] ans1 = new int[nums.length];
        int index1 = 0;

        int[] ans2 = new int[nums.length];
        int index2 = 0;

        ans1[index1++] = nums[0];
        ans2[index2++] = nums[1];

        for (int i = 2; i < nums.length; i++) {
            if(ans1[index1-1] > ans2[index2-1]){
                ans1[index1++] = nums[i];
                continue;
            }
            ans2[index2++] = nums[i];
        }

        int[] ans = new int[nums.length];
        int index = 0;
        for (int i = 0; i < index1; i++) {
            ans[index++] = ans1[i];
        }
        for (int i = 0; i < index2; i++) {
            ans[index++] = ans2[i];
        }
        return ans;
    }
}
