package from.ant;

public class Pro_2120 {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] res = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            int row = startPos[0];
            int col = startPos[1];
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == 'R') {
                    col++;
                } else if (c == 'L') {
                    col--;
                } else if (c == 'D') {
                    row++;
                } else {
                    row--;
                }
                if (isValid(row, col, n)) {
                    count++;
                } else {
                    break;
                }
            }
            res[i] = count;
        }
        return res;
    }

    private boolean isValid(int row, int col, int n) {
        return row >= 0 && col >= 0 && row < n && col < n;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1};
        System.out.println(new Pro_2120().executeInstructions(3, nums, "RRDDLU"));
    }
}
