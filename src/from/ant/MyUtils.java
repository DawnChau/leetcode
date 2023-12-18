package from.ant;

public class MyUtils {

    public static String printArray(int[] nums){
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
            if(i != nums.length -1){
                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
