package from.ant;

public class Pro_1769 {
    public int[] minOperations(String boxes) {
        char[] ch = boxes.toCharArray();
        int[] ans = new int[boxes.length()];
        for (int i = 0; i < ch.length; i++) {
            int left = i - 1;
            int right = i + 1;
            int count = 0;
            while (left >= 0) {
                if (ch[left] == '1') {
                    count += (i - left);
                }
                left--;
            }
            while (right < ch.length) {
                if (ch[right] == '1') {
                    count += (right - i);
                }
                right++;
            }
            ans[i] = count;
        }
        return ans;
    }
}
