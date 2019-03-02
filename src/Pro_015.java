import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/**
 * 求三个数的和等于0
 * while 注意边界检查
 * 并且边界检查要放在前边
 */
public class Pro_015 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums==null || nums.length<3)
            return res;

        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0)
                break;
            // 去除重复
            while (i>0 && i<nums.length && nums[i]==nums[i-1] ){
                i++;
            }
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                    List<Integer> inner = new ArrayList<>();
                    inner.add(nums[i]);
                    inner.add(nums[left++]);
                    inner.add(nums[right--]);
                    res.add(inner);
                    // 去除重复
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                    while (left<right && nums[right] == nums[right+1]){
                        right--;
                    }
                }else if(sum<0){
                    left++;
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                }else{
                    right--;
                    while (left<right && nums[right] == nums[right+1]){
                        right--;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {0,0,0};
        System.out.println(threeSum(a));
    }
}
