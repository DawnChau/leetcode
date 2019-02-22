package array;

/**
 * 从有序数组中除掉重复元素--数组
 * Given nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the returned length.
 */
public class Pro_026 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int pre = nums[0];
        int count = 1;
        for(int i = 1;i<nums.length;i++){
            if(pre!=nums[i]){
                pre = nums[i];
                nums[count++] = pre; //用不重复的数覆盖前几个
            }
        }
        return count;
    }
}
