/**
 * 把数组里的零放到后边
 */
public class Pro_283 {
    public void moveZeroes(int[] nums) {
        int index = 0;
        int temp = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                temp = nums[i];
                nums[index++] = temp;
            }
        }
        while(index<nums.length){
            nums[index++]=0;
        }
    }
}
