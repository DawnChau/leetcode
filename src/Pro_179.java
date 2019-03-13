/**
 * 用字符串拼出最大的数
 */
public class Pro_179 {
    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        for (int i = 0; i < strs.length; i++) {
            for (int j = i + 1; j < strs.length; j++) {
                if ((strs[i] + strs[j]).compareTo((strs[j] + strs[i])) < 0) {
                    String temp = strs[i];
                    strs[i] = strs[j];
                    strs[j] = temp;
                }
            }
        }

        if (strs[0].equals("0"))
            return "0";


        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            res.append(strs[i]);
        }
        return res.toString();
    }
}
